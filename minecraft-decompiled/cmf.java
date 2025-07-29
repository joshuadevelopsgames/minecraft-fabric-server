import java.util.Optional;

public interface cmf {
   boolean m();

   void x(boolean var1);

   void a_(dcv var1);

   void a(ui var1);

   dcv a();

   ayy n();

   @Deprecated
   static void a(cao $$0, dcv $$1) {
      $$1.a(kq.g, $$0);
      dfd.a(kq.Z, $$1, $$1x -> {
         if ($$0.gw()) {
            $$1x.a("NoAI", $$0.gw());
         }

         if ($$0.be()) {
            $$1x.a("Silent", $$0.be());
         }

         if ($$0.bf()) {
            $$1x.a("NoGravity", $$0.bf());
         }

         if ($$0.cq()) {
            $$1x.a("Glowing", $$0.cq());
         }

         if ($$0.cG()) {
            $$1x.a("Invulnerable", $$0.cG());
         }

         $$1x.a("Health", $$0.eL());
      });
   }

   @Deprecated
   static void a(cao $$0, ui $$1) {
      $$1.q("NoAI").ifPresent($$0::u);
      $$1.q("Silent").ifPresent($$0::f);
      $$1.q("NoGravity").ifPresent($$0::g);
      $$1.q("Glowing").ifPresent($$0::k);
      $$1.q("Invulnerable").ifPresent($$0::n);
      $$1.g("Health").ifPresent($$0::x);
   }

   static <T extends cam & cmf> Optional<bxj> a(cut $$0, bxi $$1, T $$2) {
      dcv $$3 = $$0.b($$1);
      if ($$3.h() == dcz.rG && $$2.bO()) {
         $$2.a($$2.n(), 1.0F, 1.0F);
         dcv $$4 = $$2.a();
         $$2.a_($$4);
         dcv $$5 = dcy.a($$3, $$0, $$4, false);
         $$0.a($$1, $$5);
         dmu $$6 = $$2.ai();
         if (!$$6.C) {
            aq.k.a((auc)$$0, $$4);
         }

         $$2.at();
         return Optional.of(bxj.a);
      } else {
         return Optional.empty();
      }
   }
}
