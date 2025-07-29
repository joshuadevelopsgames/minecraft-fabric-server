import com.mojang.serialization.MapCodec;

public class dwf extends dpz {
   public static final MapCodec<dwf> a = b(dwf::new);

   @Override
   public MapCodec<dwf> a() {
      return a;
   }

   protected dwf(eea.d $$0) {
      super($$0);
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if (!$$0.a(dcz.tu)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else if ($$2.C) {
         return bxj.a;
      } else {
         jh $$7 = $$6.c();
         jh $$8 = $$7.o() == jh.a.b ? $$4.cS().g() : $$7;
         $$2.a(null, $$3, ayz.wj, aza.e, 1.0F, 1.0F);
         $$2.a($$3, dqb.ev.m().b(dqv.b, $$8), 11);
         cqz $$9 = new cqz($$2, $$3.u() + 0.5 + $$8.j() * 0.65, $$3.v() + 0.1, $$3.w() + 0.5 + $$8.l() * 0.65, new dcv(dcz.tx, 4));
         $$9.n(0.05 * $$8.j() + $$2.A.j() * 0.02, 0.05, 0.05 * $$8.l() + $$2.A.j() * 0.02);
         $$2.b($$9);
         $$0.a(1, $$4, cam.d($$5));
         $$2.a($$4, ejb.M, $$3);
         $$4.b(azj.c.b(dcz.tu));
         return bxj.a;
      }
   }
}
