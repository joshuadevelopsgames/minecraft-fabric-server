import com.mojang.blaze3d.pipeline.RenderPipeline;
import javax.annotation.Nullable;
import org.joml.Matrix3x2f;

public record gct(RenderPipeline a, gch b, Matrix3x2f c, int d, int e, int f, int g, int h, int i, @Nullable gcd j, @Nullable gcd k) implements gcw {
   public gct(RenderPipeline $$0, gch $$1, Matrix3x2f $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, @Nullable gcd $$9) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, a($$3, $$4, $$5, $$6, $$2, $$9));
   }

   @Override
   public void a(fog $$0, float $$1) {
      $$0.a(this.c(), (float)this.d(), (float)this.e(), $$1).a(this.h());
      $$0.a(this.c(), (float)this.d(), (float)this.g(), $$1).a(this.i());
      $$0.a(this.c(), (float)this.f(), (float)this.g(), $$1).a(this.i());
      $$0.a(this.c(), (float)this.f(), (float)this.e(), $$1).a(this.h());
   }

   @Nullable
   private static gcd a(int $$0, int $$1, int $$2, int $$3, Matrix3x2f $$4, @Nullable gcd $$5) {
      gcd $$6 = new gcd($$0, $$1, $$2 - $$0, $$3 - $$1).b($$4);
      return $$5 != null ? $$5.b($$6) : $$6;
   }

   @Nullable
   @Override
   public gcd m() {
      return this.j;
   }

   @Nullable
   @Override
   public gcd n() {
      return this.k;
   }
}
