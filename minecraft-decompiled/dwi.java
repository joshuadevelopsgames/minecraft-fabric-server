import com.mojang.serialization.MapCodec;

public class dwi extends dpz {
   public static final MapCodec<dwi> a = b(dwi::new);
   public static final ees b = dwl.b;

   @Override
   public MapCodec<dwi> a() {
      return a;
   }

   public dwi(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, false));
   }

   @Override
   protected void a_(eeb $$0, dmu $$1, jb $$2, cut $$3) {
      d($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      if (!$$3.ch()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         d($$1, $$2, $$3);
      }

      return (bxj)($$0.h() instanceof dbd && new dgo($$4, $$5, $$0, $$6).b() ? bxj.e : bxj.a);
   }

   private static void d(eeb $$0, dmu $$1, jb $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, true), 3);
      }
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, false), 3);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bwu.a(1, 5));
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dmu $$0, jb $$1) {
      double $$2 = 0.5625;
      bck $$3 = $$0.A;

      for (jh $$4 : jh.values()) {
         jb $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jh.a $$6 = $$4.o();
            double $$7 = $$6 == jh.a.a ? 0.5 + 0.5625 * $$4.j() : $$3.i();
            double $$8 = $$6 == jh.a.b ? 0.5 + 0.5625 * $$4.k() : $$3.i();
            double $$9 = $$6 == jh.a.c ? 0.5 + 0.5625 * $$4.l() : $$3.i();
            $$0.a(lz.b, $$1.u() + $$7, $$1.v() + $$8, $$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
