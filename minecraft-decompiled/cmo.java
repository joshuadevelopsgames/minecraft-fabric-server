import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cmo(cwu<cmo.a> e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<cmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwu.a(cmo.a.d, cmo.a.a).forGetter(cmo::b), cxa.b.fieldOf("spawn_conditions").forGetter(cmo::c)).apply($$0, cmo::new)
   );
   public static final Codec<cmo> b = RecordCodecBuilder.create($$0 -> $$0.group(cwu.a(cmo.a.d, cmo.a.a).forGetter(cmo::b)).apply($$0, cmo::new));
   public static final Codec<jl<cmo>> c = amb.a(mn.aQ);
   public static final zm<wx, jl<cmo>> d = zk.b(mn.aQ);

   private cmo(cwu<cmo.a> $$0) {
      this($$0, cxa.a);
   }

   @Override
   public List<cww.a<cwz, cwx>> a() {
      return this.f.a();
   }

   public cwu<cmo.a> b() {
      return this.e;
   }

   public cxa c() {
      return this.f;
   }

   public static enum a implements bda {
      a("normal"),
      b("cold"),
      c("warm");

      public static final Codec<cmo.a> d = bda.a(cmo.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
