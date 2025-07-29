import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class eaj extends dxm {
   public static final MapCodec<eaj> b = b(eaj::new);
   @Nullable
   private static eeg f;
   @Nullable
   private static eeg g;

   @Override
   public MapCodec<eaj> a() {
      return b;
   }

   protected eaj(eea.d $$0) {
      super(dxm.b.d, $$0);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      a($$0, $$1);
   }

   public static void a(dmu $$0, jb $$1) {
      if ($$0.c_($$1) instanceof ecp $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dmu $$0, jb $$1, ecp $$2) {
      if (!$$0.C) {
         eeb $$3 = $$2.m();
         boolean $$4 = $$3.a(dqb.hh) || $$3.a(dqb.hi);
         if ($$4 && $$1.v() >= $$0.L_() && $$0.an() != bxg.a) {
            eeg.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               cqm $$6 = bzv.bL.a($$0, bzu.k);
               if ($$6 != null) {
                  dqv.a($$0, $$5);
                  jb $$7 = $$5.a(1, 2, 0).d();
                  $$6.b($$7.u() + 0.5, $$7.v() + 0.55, $$7.w() + 0.5, $$5.b().o() == jh.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.br = $$5.b().o() == jh.a.a ? 0.0F : 90.0F;
                  $$6.l();

                  for (auc $$8 : $$0.a(auc.class, $$6.cV().g(50.0))) {
                     aq.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  dqv.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dmu $$0, jb $$1, dcv $$2) {
      return $$2.a(dcz.vO) && $$1.v() >= $$0.L_() + 2 && $$0.an() != bxg.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static eeg q() {
      if (f == null) {
         f = eeh.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(azo.aL)).a('^', eef.a(eek.a(dqb.hh).or(eek.a(dqb.hi)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return f;
   }

   private static eeg r() {
      if (g == null) {
         g = eeh.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(azo.aL)).a('~', $$0 -> $$0.a().l()).b();
      }

      return g;
   }
}
