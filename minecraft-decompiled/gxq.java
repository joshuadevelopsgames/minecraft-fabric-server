public class gxq {
   public static final ame a = ame.b("textures/gui/title/background/panorama_overlay.png");
   private final fue b;
   private final gww c;
   private float d;

   public gxq(gww $$0) {
      this.c = $$0;
      this.b = fue.R();
   }

   public void a(fxb $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         float $$4 = this.b.aw().b();
         float $$5 = (float)($$4 * this.b.n.u().c());
         this.d = a(this.d + $$5 * 0.1F, 360.0F);
      }

      this.c.a(this.b, 10.0F, -this.d);
      $$0.a(gxx.ar, a, 0, 0, 0.0F, 0.0F, $$1, $$2, 16, 128, 16, 128);
   }

   private static float a(float $$0, float $$1) {
      return $$0 > $$1 ? $$0 - $$1 : $$0;
   }

   public void a(hru $$0) {
      this.c.a($$0);
   }
}
