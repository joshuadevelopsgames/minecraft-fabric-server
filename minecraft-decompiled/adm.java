public class adm implements zw<acq> {
   public static final zm<wx, adm> a = zw.a(adm::a, adm::new);
   private final int b;
   private final int c;
   private final int d;
   private final dcv e;

   public adm(int $$0, int $$1, int $$2, dcv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private adm(wx $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = dcv.h.decode($$0);
   }

   private void a(wx $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      dcv.h.encode($$0, this.e);
   }

   @Override
   public zy<adm> a() {
      return ahk.v;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public dcv f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
