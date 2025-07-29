public interface gag {
   int a = 182;
   int b = 5;
   int c = 24;
   gag d = new gag() {
      @Override
      public void a(fxb $$0, ftu $$1) {
      }

      @Override
      public void b(fxb $$0, ftu $$1) {
      }
   };

   default int a(fni $$0) {
      return ($$0.o() - 182) / 2;
   }

   default int b(fni $$0) {
      return $$0.p() - 24 - 5;
   }

   void a(fxb var1, ftu var2);

   void b(fxb var1, ftu var2);

   static void a(fxb $$0, fwz $$1, int $$2) {
      xo $$3 = xo.a("gui.experience.level", $$2);
      int $$4 = ($$0.a() - $$1.a($$3)) / 2;
      int $$5 = $$0.b() - 24 - 9 - 2;
      $$0.a($$1, $$3, $$4 + 1, $$5, -16777216, false);
      $$0.a($$1, $$3, $$4 - 1, $$5, -16777216, false);
      $$0.a($$1, $$3, $$4, $$5 + 1, -16777216, false);
      $$0.a($$1, $$3, $$4, $$5 - 1, -16777216, false);
      $$0.a($$1, $$3, $$4, $$5, -8323296, false);
   }
}
