import java.util.function.Predicate;

public abstract class crv extends cau implements crn {
   protected crv(bzv<? extends crv> $$0, dmu $$1) {
      super($$0, $$1);
      this.cc = 5;
   }

   @Override
   public aza do() {
      return aza.f;
   }

   @Override
   public void e_() {
      this.ff();
      this.gL();
      super.e_();
   }

   protected void gL() {
      float $$0 = this.bB();
      if ($$0 > 0.5F) {
         this.bz += 2;
      }
   }

   @Override
   protected boolean ag() {
      return true;
   }

   @Override
   protected ayy aY() {
      return ayz.nW;
   }

   @Override
   protected ayy aZ() {
      return ayz.nV;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.nT;
   }

   @Override
   protected ayy f_() {
      return ayz.nS;
   }

   @Override
   public cam.a eT() {
      return new cam.a(ayz.nU, ayz.nR);
   }

   @Override
   public float a(jb $$0, dmx $$1) {
      return -$$1.y($$0);
   }

   public static boolean a(dnl $$0, jb $$1, bck $$2) {
      if ($$0.a(dnd.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         ehy $$3 = $$0.G_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dnd.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.a().ag() ? $$0.c($$1, 10) : $$0.C($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bzv<? extends crv> $$0, dnl $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.an() != bxg.a && (bzu.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bzv<? extends crv> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.an() != bxg.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static cbr.a gM() {
      return cao.I().a(cbs.c);
   }

   @Override
   public boolean et() {
      return true;
   }

   @Override
   protected boolean eu() {
      return true;
   }

   public boolean a(aub $$0, cut $$1) {
      return true;
   }

   @Override
   public dcv d(dcv $$0) {
      if ($$0.h() instanceof ddq) {
         Predicate<dcv> $$1 = ((ddq)$$0.h()).c();
         dcv $$2 = ddq.a(this, $$1);
         return $$2.f() ? new dcv(dcz.pB) : $$2;
      } else {
         return dcv.l;
      }
   }
}
