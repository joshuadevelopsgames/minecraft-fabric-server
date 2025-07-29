import com.mojang.blaze3d.textures.GpuTexture;
import javax.annotation.Nullable;

public class hrs {
   private final ame a;
   private final hrm b;
   private final boolean c;
   final int d;
   final int e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;

   protected hrs(ame $$0, hrm $$1, int $$2, int $$3, int $$4, int $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$1.f().a(htg.b).isPresent();
      this.d = $$4;
      this.e = $$5;
      this.f = (float)$$4 / $$2;
      this.g = (float)($$4 + $$1.a()) / $$2;
      this.h = (float)$$5 / $$3;
      this.i = (float)($$5 + $$1.b()) / $$3;
   }

   public int a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public float c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public hrm e() {
      return this.b;
   }

   public boolean f() {
      return this.c;
   }

   @Nullable
   public hrs.a g() {
      final hro $$0 = this.b.e();
      return $$0 != null ? new hrs.a() {
         @Override
         public void a(GpuTexture $$0x) {
            $$0.a(hrs.this.d, hrs.this.e, $$0);
         }

         @Override
         public void close() {
            $$0.close();
         }
      } : null;
   }

   public float a(float $$0) {
      float $$1 = this.g - this.f;
      return this.f + $$1 * $$0;
   }

   public float b(float $$0) {
      float $$1 = this.g - this.f;
      return ($$0 - this.f) / $$1;
   }

   public float h() {
      return this.h;
   }

   public float i() {
      return this.i;
   }

   public float c(float $$0) {
      float $$1 = this.i - this.h;
      return this.h + $$1 * $$0;
   }

   public float d(float $$0) {
      float $$1 = this.i - this.h;
      return ($$0 - this.h) / $$1;
   }

   public ame j() {
      return this.a;
   }

   @Override
   public String toString() {
      return "TextureAtlasSprite{contents='" + this.b + "', u0=" + this.f + ", u1=" + this.g + ", v0=" + this.h + ", v1=" + this.i + "}";
   }

   public void a(GpuTexture $$0) {
      this.b.a(this.d, this.e, $$0);
   }

   private float l() {
      float $$0 = this.b.a() / (this.g - this.f);
      float $$1 = this.b.b() / (this.i - this.h);
      return Math.max($$1, $$0);
   }

   public float k() {
      return 4.0F / this.l();
   }

   public fog a(fog $$0) {
      return new gyl($$0, this);
   }

   public interface a extends AutoCloseable {
      void a(GpuTexture var1);

      @Override
      void close();
   }
}
