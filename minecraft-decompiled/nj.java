import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nj implements mt {
   private final mv d;
   private static final nj.b e = new nj.b(true, false, true);
   private static final nj.b f = new nj.b(true, true, true);
   private static final nj.b g = new nj.b(true, true, false);
   private static final nj.b h = new nj.b(false, true, true);
   private static final Map<amd<? extends jy<?>>, nj.b> i = Map.of(mn.bA, e, mn.bz, e, mn.bw, f, mn.bx, f, mn.by, f);
   private static final Map<String, nj.a> j = Map.of(
      "structure", new nj.a(nj.c.a, new nj.b(true, false, true)), "function", new nj.a(nj.c.b, new nj.b(true, true, true))
   );
   static final Codec<amd<? extends jy<?>>> k = ame.a.xmap(amd::a, amd::a);

   public nj(mv $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      nj.d $$1 = new nj.d(this.b(), j);
      Path $$2 = this.d.a(mv.b.c).resolve("datapack.json");
      return mt.a($$0, (JsonElement)nj.d.a.encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(), $$2);
   }

   @Override
   public String a() {
      return "Datapack Structure";
   }

   private void a(Map<amd<? extends jy<?>>, nj.b> $$0, amd<? extends jy<?>> $$1, nj.b $$2) {
      nj.b $$3 = $$0.putIfAbsent($$1, $$2);
      if ($$3 != null) {
         throw new IllegalStateException("Duplicate entry for key " + $$1.a());
      }
   }

   private Map<amd<? extends jy<?>>, nj.b> b() {
      Map<amd<? extends jy<?>>, nj.b> $$0 = new HashMap<>();
      mm.aJ.forEach($$1 -> this.a($$0, $$1.g(), h));
      alz.a.forEach($$1 -> this.a($$0, $$1.a(), g));
      alz.b.forEach($$1 -> this.a($$0, $$1.a(), g));
      i.forEach(($$1, $$2) -> this.a($$0, (amd<? extends jy<?>>)$$1, $$2));
      return $$0;
   }

   record a(nj.c b, nj.b c) {
      public static final Codec<nj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(nj.c.c.fieldOf("format").forGetter(nj.a::a), nj.b.a.forGetter(nj.a::b)).apply($$0, nj.a::new)
      );

      public nj.c a() {
         return this.b;
      }

      public nj.b b() {
         return this.c;
      }
   }

   record b(boolean c, boolean d, boolean e) {
      public static final MapCodec<nj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.BOOL.fieldOf("elements").forGetter(nj.b::a),
               Codec.BOOL.fieldOf("tags").forGetter(nj.b::b),
               Codec.BOOL.fieldOf("stable").forGetter(nj.b::c)
            )
            .apply($$0, nj.b::new)
      );
      public static final Codec<nj.b> b = a.codec();

      public boolean a() {
         return this.c;
      }

      public boolean b() {
         return this.d;
      }

      public boolean c() {
         return this.e;
      }
   }

   static enum c implements bda {
      a("structure"),
      b("mcfunction");

      public static final Codec<nj.c> c = bda.a(nj.c::values);
      private final String d;

      private c(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   record d(Map<amd<? extends jy<?>>, nj.b> b, Map<String, nj.a> c) {
      public static final Codec<nj.d> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.unboundedMap(nj.k, nj.b.b).fieldOf("registries").forGetter(nj.d::a),
               Codec.unboundedMap(Codec.STRING, nj.a.a).fieldOf("others").forGetter(nj.d::b)
            )
            .apply($$0, nj.d::new)
      );

      public Map<amd<? extends jy<?>>, nj.b> a() {
         return this.b;
      }

      public Map<String, nj.a> b() {
         return this.c;
      }
   }
}
