import javax.annotation.Nullable;

public abstract class fyl<E extends fyl.a<E>> extends fxi<E> {
   private static final xo a = xo.c("narration.selection.usage");

   public fyl(fue $$0, int $$1, int $$2, int $$3, int $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public fyl(fue $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public fwy a(gbz $$0) {
      if (this.t() == 0) {
         return null;
      } else if (this.aM_() && $$0 instanceof gbz.a $$1) {
         E $$2 = this.a($$1.b());
         if ($$2 != null) {
            return fwy.a(this, fwy.a($$2));
         } else {
            this.a(null);
            return null;
         }
      } else if (!this.aM_()) {
         E $$3 = this.p();
         if ($$3 == null) {
            $$3 = this.a($$0.a());
         }

         return $$3 == null ? null : fwy.a(this, fwy.a($$3));
      } else {
         return null;
      }
   }

   @Override
   public void a(gbt $$0) {
      E $$1 = this.x();
      if ($$1 != null) {
         this.a($$0.a(), $$1);
         $$1.b($$0);
      } else {
         E $$2 = this.p();
         if ($$2 != null) {
            this.a($$0.a(), $$2);
            $$2.b($$0);
         }
      }

      if (this.aM_()) {
         $$0.a(gbs.d, a);
      }
   }

   public abstract static class a<E extends fyl.a<E>> extends fxi.a<E> implements gbu {
      public abstract xo a();

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public void b(gbt $$0) {
         $$0.a(gbs.a, this.a());
      }
   }
}
