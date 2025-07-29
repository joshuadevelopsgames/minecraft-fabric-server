public class cpe {
   private static final cpe.b a = new cpe.b(a(a().a(b(dbt.p), 5).a(b(dbt.h), 5).a(b(dbt.i), 5).a(b(dbt.m), 3).a(a(dbt.a), 82).a()));
   private static final cpe.b b = new cpe.b(a(a().a(b(dbt.h), 5).a(b(dbt.i), 5).a(b(dbt.a), 5).a(b(dbt.p), 3).a(a(dbt.m), 82).a()));
   private static final cpe.b c = new cpe.b(a(a().a(b(dbt.i), 5).a(b(dbt.h), 5).a(b(dbt.a), 5).a(b(dbt.m), 3).a(a(dbt.p), 82).a()));

   private static cpe.a a(dbt $$0) {
      return a(a().a(b($$0), 499).a(b(dbt.g), 1).a());
   }

   public static dbt a(jl<dnx> $$0, bck $$1) {
      cpe.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static cpe.b a(jl<dnx> $$0) {
      if ($$0.a(azn.al)) {
         return b;
      } else {
         return $$0.a(azn.ak) ? c : a;
      }
   }

   private static cpe.a a(bvt<cpe.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static cpe.a b(dbt $$0) {
      return $$1 -> $$0;
   }

   private static bvt.a<cpe.a> a() {
      return bvt.b();
   }

   @FunctionalInterface
   interface a {
      dbt get(bck var1);
   }

   record b(cpe.a a) {
   }
}
