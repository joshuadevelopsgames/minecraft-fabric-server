import com.mojang.serialization.Codec;
import java.util.List;

public class fir {
   public static final fir a = new fir(0.0F, 0.0F);
   public static final fir b = new fir(1.0F, 1.0F);
   public static final fir c = new fir(1.0F, 0.0F);
   public static final fir d = new fir(-1.0F, 0.0F);
   public static final fir e = new fir(0.0F, 1.0F);
   public static final fir f = new fir(0.0F, -1.0F);
   public static final fir g = new fir(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fir h = new fir(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<fir> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new fir((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public fir(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public fir a(float $$0) {
      return new fir(this.j * $$0, this.k * $$0);
   }

   public float a(fir $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public fir b(fir $$0) {
      return new fir(this.j + $$0.j, this.k + $$0.k);
   }

   public fir b(float $$0) {
      return new fir(this.j + $$0, this.k + $$0);
   }

   public boolean c(fir $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public fir a() {
      float $$0 = bcb.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new fir(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return bcb.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(fir $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fir d() {
      return new fir(-this.j, -this.k);
   }
}
