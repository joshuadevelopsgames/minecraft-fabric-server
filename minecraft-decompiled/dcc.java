public class dcc extends dcr implements ddp {
   public dcc(dcr.a $$0) {
      super($$0);
   }

   @Override
   public bxj a(dgq $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      boolean $$4 = false;
      if (!dqp.i($$3) && !dqq.h($$3) && !dqr.h($$3)) {
         $$2 = $$2.a($$0.k());
         if (dpm.a($$1, $$2, $$0.g())) {
            this.a($$1, $$2);
            $$1.c($$2, dpm.a($$1, $$2));
            $$1.a($$0.o(), ejb.i, $$2);
            $$4 = true;
         }
      } else {
         this.a($$1, $$2);
         $$1.c($$2, $$3.b(eer.u, true));
         $$1.a($$0.o(), ejb.c, $$2);
         $$4 = true;
      }

      if ($$4) {
         $$0.n().h(1);
         return bxj.a;
      } else {
         return bxj.d;
      }
   }

   private void a(dmu $$0, jb $$1) {
      bck $$2 = $$0.H_();
      $$0.a(null, $$1, ayz.jw, aza.e, 1.0F, ($$2.i() - $$2.i()) * 0.2F + 1.0F);
   }

   @Override
   public cvo a(dmu $$0, jv $$1, dcv $$2, jh $$3) {
      bck $$4 = $$0.H_();
      double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
      double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
      double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
      fis $$8 = new fis($$5, $$6, $$7);
      cvs $$9 = new cvs($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
      $$9.a($$2);
      return $$9;
   }

   @Override
   public void a(cvo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
   }

   @Override
   public ddp.a a() {
      return ddp.a.a().a(($$0, $$1) -> dsf.a($$0, 1.0, fis.c)).a(6.6666665F).b(1.0F).a(1018).a();
   }
}
