import com.mojang.serialization.MapCodec;

public abstract class dos extends dpz {
   protected static final int a = 4;
   private static final fjm d = dpz.b(12.0, 4.0, 16.0);
   protected static final fjm b = ag.a(() -> {
      int $$0 = 4;
      int $$1 = 3;
      int $$2 = 2;
      return fjj.a(fjj.b(), fjj.a(dpz.a(16.0, 8.0, 0.0, 3.0), dpz.a(8.0, 16.0, 0.0, 3.0), dpz.b(12.0, 0.0, 3.0), d), fiw.e);
   });
   protected final ki.a c;

   @Override
   protected abstract MapCodec<? extends dos> a();

   public dos(eea.d $$0, ki.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(eeb $$0) {
      return 0.0;
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      ki $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2) {
      return d;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   public abstract boolean d(eeb var1);

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      jb $$4 = dvy.a((dmu)$$1, $$2);
      if ($$4 != null) {
         fak $$5 = dvy.a($$1, $$4);
         if ($$5 != fam.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(fak $$0) {
      return false;
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, fak $$3) {
   }
}
