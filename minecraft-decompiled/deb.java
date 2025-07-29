import javax.annotation.Nullable;

public class deb extends dbd implements dbr {
   private final ayy a;

   public deb(dpz $$0, ayy $$1, dcr.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bxj a(dgq $$0) {
      bxj $$1 = super.a($$0);
      cut $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), dbj.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected ayy a(eeb $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cam $$0, dmu $$1, jb $$2, @Nullable fio $$3) {
      if ($$1.k($$2) && $$1.w($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, ejb.z, $$2);
         $$1.a($$0, $$2, this.a, aza.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
