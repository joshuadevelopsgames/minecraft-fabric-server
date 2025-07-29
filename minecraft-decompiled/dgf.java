import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dgf(aut<String> k, String l, int m, List<aut<xo>> n, boolean o) implements dex<xo, dgf>, dga {
   public static final dgf a = new dgf(aut.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xo> g = xq.a(32767);
   public static final Codec<List<aut<xo>>> h = a(g);
   public static final Codec<dgf> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            aut.a(Codec.string(0, 32)).fieldOf("title").forGetter(dgf::d),
            Codec.STRING.fieldOf("author").forGetter(dgf::e),
            bbi.a(0, 3).optionalFieldOf("generation", 0).forGetter(dgf::f),
            h.optionalFieldOf("pages", List.of()).forGetter(dgf::a),
            Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dgf::g)
         )
         .apply($$0, dgf::new)
   );
   public static final zm<wx, dgf> j = zm.a(aut.a(zk.b(32)), dgf::d, zk.p, dgf::e, zk.h, dgf::f, aut.a(xq.b).a(zk.a()), dgf::a, zk.b, dgf::g, dgf::new);

   public dgf(aut<String> k, String l, int m, List<aut<xo>> n, boolean o) {
      if (m >= 0 && m <= 3) {
         this.k = k;
         this.l = l;
         this.m = m;
         this.n = n;
         this.o = o;
      } else {
         throw new IllegalArgumentException("Generation was " + m + ", but must be between 0 and 3");
      }
   }

   private static Codec<aut<xo>> b(Codec<xo> $$0) {
      return aut.a($$0);
   }

   public static Codec<List<aut<xo>>> a(Codec<xo> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dgf b() {
      return this.m >= 2 ? null : new dgf(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(dcv $$0, ek $$1, @Nullable cut $$2) {
      dgf $$3 = $$0.a(kq.V);
      if ($$3 != null && !$$3.g()) {
         dgf $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kq.V, $$4);
            return true;
         }

         $$0.b(kq.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public dgf a(ek $$0, @Nullable cut $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<aut<xo>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (aut<xo> $$3 : this.n) {
            Optional<aut<xo>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dgf(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dgf c() {
      return new dgf(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<aut<xo>> a(ek $$0, @Nullable cut $$1, aut<xo> $$2) {
      return $$2.b($$2x -> {
         try {
            xo $$3 = xr.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xo $$0, jn.a $$1) {
      DataResult<JsonElement> $$2 = xq.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && bbq.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<xo> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xo)$$1.a($$0));
   }

   public dgf b(List<aut<xo>> $$0) {
      return new dgf(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      if (!bdb.h(this.l)) {
         $$1.accept(xo.a("book.byAuthor", this.l).a(o.h));
      }

      $$1.accept(xo.c("book.generation." + this.m).a(o.h));
   }

   public aut<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<aut<xo>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
