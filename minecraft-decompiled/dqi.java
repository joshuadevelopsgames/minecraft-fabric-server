import com.mojang.serialization.MapCodec;

public class dqi extends dox {
   public static final MapCodec<dqi> b = b(dqi::new);
   public static final int c = 5;
   private static final jh[] d = jh.values();

   @Override
   public MapCodec<dqi> a() {
      return b;
   }

   public dqi(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$3.a(5) == 0) {
         jh $$4 = d[$$3.a(d.length)];
         jb $$5 = $$2.a($$4);
         eeb $$6 = $$1.a_($$5);
         dpz $$7 = null;
         if (h($$6)) {
            $$7 = dqb.rh;
         } else if ($$6.a(dqb.rh) && $$6.c(doy.d) == $$4) {
            $$7 = dqb.rg;
         } else if ($$6.a(dqb.rg) && $$6.c(doy.d) == $$4) {
            $$7 = dqb.rf;
         } else if ($$6.a(dqb.rf) && $$6.c(doy.d) == $$4) {
            $$7 = dqb.re;
         }

         if ($$7 != null) {
            eeb $$8 = $$7.m().b(doy.d, $$4).b(doy.c, $$6.y().a() == fam.c);
            $$1.c($$5, $$8);
         }
      }
   }

   public static boolean h(eeb $$0) {
      return $$0.l() || $$0.a(dqb.J) && $$0.y().e() == 8;
   }
}
