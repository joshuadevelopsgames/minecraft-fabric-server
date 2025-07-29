import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class dtp extends dyb implements dqc {
   public static final MapCodec<dtp> a = b(dtp::new);

   @Override
   public MapCodec<dtp> a() {
      return a;
   }

   public dtp(eea.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      jb $$4 = $$2.d();
      eeb $$5 = dqb.bA.m();
      Optional<jl.c<euc>> $$6 = $$0.K_().f(mn.bg).a(si.o);

      label51:
      for (int $$7 = 0; $$7 < 128; $$7++) {
         jb $$8 = $$4;

         for (int $$9 = 0; $$9 < $$7 / 16; $$9++) {
            $$8 = $$8.b($$1.a(3) - 1, ($$1.a(3) - 1) * $$1.a(3) / 2, $$1.a(3) - 1);
            if (!$$0.a_($$8.e()).a(this) || $$0.a_($$8).m($$0, $$8)) {
               continue label51;
            }
         }

         eeb $$10 = $$0.a_($$8);
         if ($$10.a($$5.b()) && $$1.a(10) == 0) {
            dqc $$11 = (dqc)$$5.b();
            if ($$11.a((dmx)$$0, $$8, $$10)) {
               $$11.a($$0, $$1, $$8, $$10);
            }
         }

         if ($$10.l()) {
            jl<euc> $$14;
            if ($$1.a(8) == 0) {
               List<ems<?, ?>> $$12 = $$0.v($$8).a().d().b();
               if ($$12.isEmpty()) {
                  continue;
               }

               int $$13 = $$1.a($$12.size());
               $$14 = ((epz)$$12.get($$13).c()).d();
            } else {
               if (!$$6.isPresent()) {
                  continue;
               }

               $$14 = $$6.get();
            }

            $$14.a().a($$0, $$0.n().g(), $$1, $$8);
         }
      }
   }

   @Override
   public dqc.a aq_() {
      return dqc.a.a;
   }
}
