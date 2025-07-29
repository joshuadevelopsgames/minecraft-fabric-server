import javax.annotation.Nullable;

public interface bxq extends bxc {
   String b = "LootTable";
   String c = "LootTableSeed";

   @Nullable
   amd<fdo> aw_();

   void a(@Nullable amd<fdo> var1);

   default void a(amd<fdo> $$0, long $$1) {
      this.a($$0);
      this.a($$1);
   }

   long az_();

   void a(long var1);

   jb aA_();

   @Nullable
   dmu i();

   static void a(dly $$0, bck $$1, jb $$2, amd<fdo> $$3) {
      if ($$0.c_($$2) instanceof bxq $$5) {
         $$5.a($$3, $$1.g());
      }
   }

   default boolean c_(fda $$0) {
      amd<fdo> $$1 = $$0.<amd<fdo>>a("LootTable", fdo.a).orElse(null);
      this.a($$1);
      this.a($$0.a("LootTableSeed", 0L));
      return $$1 != null;
   }

   default boolean d_(fdc $$0) {
      amd<fdo> $$1 = this.aw_();
      if ($$1 == null) {
         return false;
      } else {
         $$0.a("LootTable", fdo.a, $$1);
         long $$2 = this.az_();
         if ($$2 != 0L) {
            $$0.a("LootTableSeed", $$2);
         }

         return true;
      }
   }

   default void f_(@Nullable cut $$0) {
      dmu $$1 = this.i();
      jb $$2 = this.aA_();
      amd<fdo> $$3 = this.aw_();
      if ($$3 != null && $$1 != null && $$1.q() != null) {
         fdo $$4 = $$1.q().bc().a($$3);
         if ($$0 instanceof auc) {
            aq.Q.a((auc)$$0, $$3);
         }

         this.a(null);
         fdm.a $$5 = new fdm.a((aub)$$1).a(fgd.f, fis.b($$2));
         if ($$0 != null) {
            $$5.a($$0.em()).a(fgd.a, $$0);
         }

         $$4.a(this, $$5.a(fgc.c), this.az_());
      }
   }
}
