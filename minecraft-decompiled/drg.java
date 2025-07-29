import com.mojang.serialization.MapCodec;

public class drg extends dvu {
   public static final MapCodec<drg> a = b(drg::new);

   @Override
   public MapCodec<drg> a() {
      return a;
   }

   protected drg(eea.d $$0) {
      super(10.0F, $$0);
      this.l(this.C.b().b(b, false).b(c, false).b(d, false).b(e, false).b(f, false).b(g, false));
   }

   @Override
   public eeb a(dgo $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static eeb a(dly $$0, jb $$1, eeb $$2) {
      eeb $$3 = $$0.a_($$1.e());
      eeb $$4 = $$0.a_($$1.d());
      eeb $$5 = $$0.a_($$1.f());
      eeb $$6 = $$0.a_($$1.i());
      eeb $$7 = $$0.a_($$1.g());
      eeb $$8 = $$0.a_($$1.h());
      dpz $$9 = $$2.b();
      return $$2.c(g, $$3.a($$9) || $$3.a(dqb.lb) || $$3.a(dqb.fY))
         .c(f, $$4.a($$9) || $$4.a(dqb.lb))
         .c(b, $$5.a($$9) || $$5.a(dqb.lb))
         .c(c, $$6.a($$9) || $$6.a(dqb.lb))
         .c(d, $$7.a($$9) || $$7.a(dqb.lb))
         .c(e, $$8.a($$9) || $$8.a(dqb.lb));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dqb.lb) || $$4 == jh.a && $$6.a(dqb.fY);
         return $$0.b(h.get($$4), $$8);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jh $$5 : jh.c.a) {
         jb $$6 = $$2.a($$5);
         eeb $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            eeb $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dqb.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dqb.fY);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
