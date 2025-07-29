import com.mojang.serialization.Codec;

public class eon extends enh<epw> {
   public eon(Codec<epw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epw> $$0) {
      boolean $$1 = false;
      bck $$2 = $$0.d();
      dnt $$3 = $$0.b();
      jb $$4 = $$0.e();
      epw $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(eka.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jb $$9 = new jb($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dqb.J)) {
         boolean $$10 = $$2.j() < $$5.l;
         eeb $$11 = $$10 ? dqb.bH.m() : dqb.bG.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               eeb $$12 = $$11.b(dyr.d, eex.a);
               jb $$13 = $$9.d();
               if ($$3.a_($$13).a(dqb.J)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
