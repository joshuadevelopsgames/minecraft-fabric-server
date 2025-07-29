public class acs implements zw<acq> {
   public static final zm<wg, acs> a = zw.a(acs::a, acs::new);
   public static final int b = 0;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   public static final int f = 5;
   private final int g;
   private final int h;

   public acs(bzm $$0, int $$1) {
      this.g = $$0.ar();
      this.h = $$1;
   }

   private acs(wg $$0) {
      this.g = $$0.l();
      this.h = $$0.readUnsignedByte();
   }

   private void a(wg $$0) {
      $$0.c(this.g);
      $$0.l(this.h);
   }

   @Override
   public zy<acs> a() {
      return ahk.d;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
