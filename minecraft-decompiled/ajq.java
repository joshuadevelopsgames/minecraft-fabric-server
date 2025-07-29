public class ajq implements zw<ahm> {
   public static final zm<wg, ajq> a = zw.a(ajq::a, ajq::new);
   private final bxi b;
   private final int c;
   private final float d;
   private final float e;

   public ajq(bxi $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ajq(wg $$0) {
      this.b = $$0.b(bxi.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zy<ajq> a() {
      return ahk.cq;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public bxi b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
