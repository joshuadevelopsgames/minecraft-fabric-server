import javax.annotation.Nullable;

public class cab extends cnj {
   private static final alh<Integer> cs = all.a(cab.class, alj.b);
   private static final int ct = 0;

   public cab(bzv<? extends cab> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected mc m() {
      return me.aS;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cs, 0);
   }

   @Nullable
   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.ai.a($$0, bzu.e);
   }

   @Override
   protected ayy n() {
      return ayz.lA;
   }

   @Override
   protected ayy p() {
      return ayz.lx;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.lz;
   }

   @Override
   protected ayy f_() {
      return ayz.ly;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("DarkTicksRemaining", this.t());
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.s($$0.a("DarkTicksRemaining", 0));
   }

   @Override
   public void e_() {
      super.e_();
      int $$0 = this.t();
      if ($$0 > 0) {
         this.s($$0 - 1);
      }

      this.ai().a(me.aT, this.d(0.6), this.dF(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3) {
         this.s(100);
      }

      return $$3;
   }

   private void s(int $$0) {
      this.ay.a(cs, $$0);
   }

   public int t() {
      return this.ay.a(cs);
   }

   public static boolean a(bzv<? extends cam> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      return $$3.v() <= $$1.Q() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dqb.J);
   }
}
