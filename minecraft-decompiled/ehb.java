import com.mojang.logging.LogUtils;
import java.util.EnumSet;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class ehb {
   private static final Logger a = LogUtils.getLogger();

   private static boolean a(efy $$0) {
      return $$0.n().a(egz.l) && $$0.x();
   }

   static CompletableFuture<efy> a(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> b(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      if ($$4.q().aZ().y().d()) {
         $$0.b().a($$4.K_(), $$4.n().h(), $$4.b(), $$3, $$0.c(), $$4.aj());
      }

      $$4.a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> c(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      $$0.a().a($$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> d(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> e(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      return $$0.b().a($$4.n().i(), elc.a($$5), $$4.b().a($$5), $$3);
   }

   static CompletableFuture<efy> f(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      return $$0.b().a(elc.a($$5), $$4.n().i(), $$4.b().a($$5), $$3).thenApply($$0x -> {
         if ($$0x instanceof egs $$1x) {
            ejo $$2x = $$1x.z();
            if ($$2x != null) {
               ejo.a($$1x);
               if ($$2x.b()) {
                  $$2x.b($$1x);
               }
            }
         }

         return $$0x;
      });
   }

   static CompletableFuture<efy> g(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$4.b().a($$5), $$4.n().i(), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> h(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      if ($$3 instanceof egs $$6) {
         elc.a($$5, $$6);
      }

      $$0.b().a($$5, $$4.F(), $$4.n().i(), $$4.I_(), $$4.b().a($$5), $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> i(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      aub $$4 = $$0.a();
      eka.a($$3, EnumSet.of(eka.a.e, eka.a.f, eka.a.d, eka.a.b));
      auj $$5 = new auj($$4, $$2, $$1, $$3);
      $$0.b().a($$5, $$3, $$4.b().a($$5));
      elc.a($$5, $$3);
      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> j(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      auf $$4 = $$0.d();
      $$3.C();
      ((egs)$$3).a($$4);
      boolean $$5 = a($$3);
      return $$4.a($$3, $$5);
   }

   static CompletableFuture<efy> k(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      boolean $$4 = a($$3);
      return $$0.d().b($$3, $$4);
   }

   static CompletableFuture<efy> l(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      if (!$$3.A()) {
         $$0.b().a(new auj($$0.a(), $$2, $$1, $$3));
      }

      return CompletableFuture.completedFuture($$3);
   }

   static CompletableFuture<efy> m(ehe $$0, ehc $$1, bcx<atr> $$2, efy $$3) {
      dlz $$4 = $$3.f();
      atr $$5 = $$2.a($$4.h, $$4.i);
      return CompletableFuture.supplyAsync(() -> {
         egs $$3x = (egs)$$3;
         aub $$4x = $$0.a();
         egi $$6;
         if ($$3x instanceof egh $$5x) {
            $$6 = $$5x.H();
         } else {
            $$6 = new egi($$4x, $$3x, $$3xx -> {
               try (bci.j $$4xx = new bci.j($$3.E(), a)) {
                  a($$4x, fcy.a($$4xx, $$4x.K_(), $$3x.J()));
               }
            });
            $$5.a(new egh($$6, false));
         }

         $$6.b($$5::s);
         $$6.H();
         $$6.b(true);
         $$6.L();
         $$6.b($$4x);
         $$6.a($$0.f());
         return $$6;
      }, $$0.e());
   }

   private static void a(aub $$0, fda.b $$1) {
      if (!$$1.a()) {
         $$0.b(bzv.a($$1, $$0, bzu.r));
      }
   }
}
