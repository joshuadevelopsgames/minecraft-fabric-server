import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpm(cpm.a e, cxa f) implements cww<cwz, cwx> {
   public static final Codec<cpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpm.a.a.fieldOf("assets").forGetter(cpm::b), cxa.b.fieldOf("spawn_conditions").forGetter(cpm::c)).apply($$0, cpm::new)
   );
   public static final Codec<cpm> b = RecordCodecBuilder.create($$0 -> $$0.group(cpm.a.a.fieldOf("assets").forGetter(cpm::b)).apply($$0, cpm::new));
   public static final Codec<jl<cpm>> c = amb.a(mn.br);
   public static final zm<wx, jl<cpm>> d = zk.b(mn.br);

   private cpm(cpm.a $$0) {
      this($$0, cxa.a);
   }

   @Override
   public List<cww.a<cwz, cwx>> a() {
      return this.f.a();
   }

   public cpm.a b() {
      return this.e;
   }

   public cxa c() {
      return this.f;
   }

   public record a(jc b, jc c, jc d) {
      public static final Codec<cpm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jc.a.fieldOf("wild").forGetter(cpm.a::a), jc.a.fieldOf("tame").forGetter(cpm.a::b), jc.a.fieldOf("angry").forGetter(cpm.a::c))
            .apply($$0, cpm.a::new)
      );

      public jc a() {
         return this.b;
      }

      public jc b() {
         return this.c;
      }

      public jc c() {
         return this.d;
      }
   }
}
