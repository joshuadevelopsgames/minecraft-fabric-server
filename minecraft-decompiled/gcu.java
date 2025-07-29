import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Objects;
import javax.annotation.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;

public record gcu(Matrix3x2f a, gas b, gas.a c, @Nullable gcd d) implements gcw {
   @Override
   public void a(fog $$0, float $$1) {
      Matrix4f $$2 = new Matrix4f().mul(this.a).translate(0.0F, 0.0F, $$1);
      this.b.a(this.c, $$2, $$0, 15728880, true);
   }

   @Override
   public RenderPipeline a() {
      return this.b.b();
   }

   @Override
   public gch b() {
      return gch.b(Objects.requireNonNull(this.b.a()));
   }

   @Nullable
   @Override
   public gcd n() {
      return null;
   }

   public Matrix3x2f c() {
      return this.a;
   }

   public gas d() {
      return this.b;
   }

   public gas.a e() {
      return this.c;
   }

   @Nullable
   @Override
   public gcd m() {
      return this.d;
   }
}
