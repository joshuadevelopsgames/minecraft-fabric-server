import com.mojang.serialization.Codec;

public class eom extends enh<epg> {
   public eom(Codec<epg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epg> $$0) {
      int $$1 = 0;
      bck $$2 = $$0.d();
      dnt $$3 = $$0.b();
      jb $$4 = $$0.e();
      int $$5 = $$0.f().a().a($$2);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         int $$7 = $$2.a(8) - $$2.a(8);
         int $$8 = $$2.a(8) - $$2.a(8);
         int $$9 = $$3.a(eka.a.d, $$4.u() + $$7, $$4.w() + $$8);
         jb $$10 = new jb($$4.u() + $$7, $$9, $$4.w() + $$8);
         eeb $$11 = dqb.nC.m().b(dxf.c, $$2.a(4) + 1);
         if ($$3.a_($$10).a(dqb.J) && $$11.a($$3, $$10)) {
            $$3.a($$10, $$11, 2);
            $$1++;
         }
      }

      return $$1 > 0;
   }
}
