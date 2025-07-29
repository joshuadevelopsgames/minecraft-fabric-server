public interface dhb extends dhm<dha> {
   @Override
   default dhx<dhb> b() {
      return dhx.a;
   }

   @Override
   dhw<? extends dhb> a();

   dgz c();

   default ju<dcv> a(dha $$0) {
      return b($$0);
   }

   static ju<dcv> b(dha $$0) {
      ju<dcv> $$1 = ju.a($$0.a(), dcv.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         dcr $$3 = $$0.a($$2).h();
         $$1.set($$2, $$3.i());
      }

      return $$1;
   }

   @Override
   default dhp h() {
      return switch (this.c()) {
         case a -> dho.a;
         case c -> dho.c;
         case b -> dho.b;
         case d -> dho.d;
      };
   }
}
