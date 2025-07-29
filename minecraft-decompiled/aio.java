public class aio implements zw<ahm> {
   public static final zm<wg, aio> a = zw.a(aio::a, aio::new);
   private final boolean b;
   private final boolean c;

   public aio(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aio(wg $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Override
   public zy<aio> a() {
      return ahk.bP;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
