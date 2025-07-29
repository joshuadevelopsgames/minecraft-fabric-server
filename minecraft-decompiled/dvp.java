import com.mojang.serialization.MapCodec;

public class dvp extends dpz implements dqc {
   public static final MapCodec<dvp> a = b(dvp::new);

   @Override
   public MapCodec<dvp> a() {
      return a;
   }

   public dvp(eea.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (jb $$3 : jb.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(azo.aR)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jb $$6 : jb.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         eeb $$7 = $$0.a_($$6);
         if ($$7.a(dqb.oU)) {
            $$5 = true;
         }

         if ($$7.a(dqb.pd)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dqb.oU.m() : dqb.pd.m(), 3);
      } else if ($$5) {
         $$0.a($$2, dqb.oU.m(), 3);
      } else if ($$4) {
         $$0.a($$2, dqb.pd.m(), 3);
      }
   }

   @Override
   public dqc.a aq_() {
      return dqc.a.a;
   }
}
