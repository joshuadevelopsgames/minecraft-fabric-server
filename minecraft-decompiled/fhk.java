import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhk(fho b, fho c) implements fho {
   public static final MapCodec<fhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fhp.a.fieldOf("n").forGetter(fhk::c), fhp.a.fieldOf("p").forGetter(fhk::d)).apply($$0, fhk::new)
   );

   @Override
   public fhn b() {
      return fhp.d;
   }

   @Override
   public int a(fdj $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      bck $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(fdj $$0) {
      return this.a($$0);
   }

   public static fhk a(int $$0, float $$1) {
      return new fhk(fhl.a($$0), fhl.a($$1));
   }

   @Override
   public Set<bdn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fho c() {
      return this.b;
   }

   public fho d() {
      return this.c;
   }
}
