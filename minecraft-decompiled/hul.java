import javax.annotation.Nullable;

public interface hul extends hue {
   boolean a = true;
   huo.a b = huo.a.b;

   huo a();

   @Nullable
   hul b();

   static gzk a(hul $$0) {
      hul $$1 = $$0;

      gzk.c $$2;
      for ($$2 = new gzk.c(); $$1 != null; $$1 = $$1.b()) {
         $$2.a($$1.a().e());
      }

      return $$2.a($$0);
   }

   default gzk g() {
      return a(this);
   }

   static boolean b(hul $$0) {
      while ($$0 != null) {
         Boolean $$1 = $$0.a().c();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return true;
   }

   default boolean c() {
      return b(this);
   }

   static huo.a c(hul $$0) {
      while ($$0 != null) {
         huo.a $$1 = $$0.a().b();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return b;
   }

   default huo.a d() {
      return c(this);
   }

   static hun d(hul $$0) {
      while ($$0 != null) {
         hun $$1 = $$0.a().a();
         if ($$1 != null) {
            return $$1;
         }

         $$0 = $$0.b();
      }

      return hun.a;
   }

   default hun f() {
      return d(this);
   }

   default huj a(gzk $$0, huc $$1, hui $$2) {
      return this.f().bake($$0, $$1, $$2, this);
   }

   static hrs a(gzk $$0, huc $$1, hue $$2) {
      return $$1.a().a($$0, "particle", $$2);
   }

   default hrs a(gzk $$0, huc $$1) {
      return a($$0, $$1, this);
   }

   static gzf a(hul $$0, dct $$1) {
      while ($$0 != null) {
         gzg $$2 = $$0.a().d();
         if ($$2 != null) {
            gzf $$3 = $$2.a($$1);
            if ($$3 != gzf.a) {
               return $$3;
            }
         }

         $$0 = $$0.b();
      }

      return gzf.a;
   }

   static gzg e(hul $$0) {
      gzf $$1 = a($$0, dct.b);
      gzf $$2 = a($$0, dct.c);
      gzf $$3 = a($$0, dct.d);
      gzf $$4 = a($$0, dct.e);
      gzf $$5 = a($$0, dct.f);
      gzf $$6 = a($$0, dct.g);
      gzf $$7 = a($$0, dct.h);
      gzf $$8 = a($$0, dct.i);
      return new gzg($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   default gzg e() {
      return e(this);
   }
}
