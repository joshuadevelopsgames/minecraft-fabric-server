public interface cud {
   String w_ = "Inventory";

   bxr n();

   static void a(aub $$0, cao $$1, cud $$2, cqz $$3) {
      dcv $$4 = $$3.e();
      if ($$1.c($$0, $$4)) {
         bxr $$5 = $$2.n();
         boolean $$6 = $$5.c($$4);
         if (!$$6) {
            return;
         }

         $$1.a($$3);
         int $$7 = $$4.M();
         dcv $$8 = $$5.b($$4);
         $$1.a($$3, $$7 - $$8.M());
         if ($$8.f()) {
            $$3.at();
         } else {
            $$4.e($$8.M());
         }
      }
   }

   default void a_(fda $$0) {
      $$0.b("Inventory", dcv.b).ifPresent($$0x -> this.n().a($$0x));
   }

   default void b_(fdc $$0) {
      this.n().a($$0.a("Inventory", dcv.b));
   }
}
