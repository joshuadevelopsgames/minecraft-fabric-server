public class ls extends lq {
   @Override
   protected dcv a(lk $$0, dcv $$1) {
      aub $$2 = $$0.b();
      if (!$$2.B_()) {
         jb $$3 = $$0.c().a($$0.d().c(dsf.b));
         this.a(a($$2, $$3) || a($$2, $$3, $$1));
         if (this.b()) {
            $$1.a(1, $$2, null, $$0x -> {});
         }
      }

      return $$1;
   }

   private static boolean a(aub $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      if ($$2.a(azo.aM, $$0x -> $$0x.b(dpt.c) && $$0x.b() instanceof dpt)) {
         int $$3 = $$2.c(dpt.c);
         if ($$3 >= 5) {
            $$0.a(null, $$1, ayz.bX, aza.e, 1.0F, 1.0F);
            dpt.a($$0, $$1);
            ((dpt)$$2.b()).a($$0, $$2, $$1, null, eaw.b.b);
            $$0.a(null, ejb.M, $$1);
            return true;
         }
      }

      return false;
   }

   private static boolean a(aub $$0, jb $$1, dcv $$2) {
      for (bzm $$4 : $$0.a(bzm.class, new fin($$1), bzt.f)) {
         if ($$4.d(null)) {
            return true;
         }

         if ($$4 instanceof cbc $$5 && $$5.a()) {
            $$5.a($$0, aza.e, $$2);
            $$0.a(null, ejb.M, $$1);
            return true;
         }
      }

      return false;
   }
}
