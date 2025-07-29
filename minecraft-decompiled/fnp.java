import com.mojang.blaze3d.systems.RenderSystem;

public record fnp(int a, int b, boolean c, int d) implements fnq<fmr> {
   public fmr a() {
      return new fms(null, this.a, this.b, this.c);
   }

   public void a(fmr $$0) {
      if (this.c) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$0.c(), this.d, $$0.e(), 1.0);
      } else {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture($$0.c(), this.d);
      }
   }

   public void b(fmr $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fnq<?> $$0) {
      return !($$0 instanceof fnp $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
