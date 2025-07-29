import com.mojang.blaze3d.pipeline.RenderPipeline;
import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public record gcs(RenderPipeline a, gch b, Matrix3x2f c, int d, int e, int f, int g, float h, float i, float j, float k, int l, @Nullable gcd m, @Nullable gcd n)
   implements gcw {
   public gcs(
      RenderPipeline $$0,
      gch $$1,
      Matrix3x2f $$2,
      int $$3,
      int $$4,
      int $$5,
      int $$6,
      float $$7,
      float $$8,
      float $$9,
      float $$10,
      int $$11,
      @Nullable gcd $$12
   ) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, a($$3, $$4, $$5, $$6, $$2, $$12));
   }

   @Override
   public void a(fog $$0, float $$1) {
      $$0.a(this.c(), (float)this.d(), (float)this.e(), $$1).a(this.h(), this.j()).a(this.l());
      $$0.a(this.c(), (float)this.d(), (float)this.g(), $$1).a(this.h(), this.k()).a(this.l());
      $$0.a(this.c(), (float)this.f(), (float)this.g(), $$1).a(this.i(), this.k()).a(this.l());
      $$0.a(this.c(), (float)this.f(), (float)this.e(), $$1).a(this.i(), this.j()).a(this.l());
   }

   @Nullable
   private static gcd a(int $$0, int $$1, int $$2, int $$3, Matrix3x2f $$4, @Nullable gcd $$5) {
      gcd $$6 = new gcd($$0, $$1, $$2 - $$0, $$3 - $$1).b($$4);
      return $$5 != null ? $$5.b($$6) : $$6;
   }
}
