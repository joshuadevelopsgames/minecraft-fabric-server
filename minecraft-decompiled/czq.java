import javax.annotation.Nullable;

public abstract class czq extends cym {
   private static final int m = 9;
   private static final int n = 3;
   private static final int o = 0;
   protected final cyz q;
   protected final cut r;
   protected final bxc s;
   protected final daf t = new daf() {
      @Override
      public void e() {
         czq.this.a(this);
      }
   };
   private final int p;

   protected boolean a(cut $$0, boolean $$1) {
      return true;
   }

   protected abstract void a(cut var1, dcv var2);

   protected abstract boolean a(eeb var1);

   public czq(@Nullable czv<?> $$0, int $$1, cus $$2, cyz $$3, czr $$4) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.j;
      this.s = this.e($$4.d());
      this.p = $$4.e();
      this.a($$4);
      this.b($$4);
      this.c($$2, 8, 84);
   }

   private void a(czr $$0) {
      for (final czr.b $$1 : $$0.c()) {
         this.a(new dak(this.s, $$1.a(), $$1.b(), $$1.c()) {
            @Override
            public boolean a(dcv $$0) {
               return $$1.d().test($$0);
            }
         });
      }
   }

   private void b(czr $$0) {
      this.a(new dak(this.t, $$0.b().a(), $$0.b().b(), $$0.b().c()) {
         @Override
         public boolean a(dcv $$0) {
            return false;
         }

         @Override
         public boolean a(cut $$0) {
            return czq.this.a($$0, this.h());
         }

         @Override
         public void a(cut $$0, dcv $$1) {
            czq.this.a($$0, $$1);
         }
      });
   }

   @Override
   public abstract void l();

   private bxr e(int $$0) {
      return new bxr($$0) {
         @Override
         public void e() {
            super.e();
            czq.this.a(this);
         }
      };
   }

   @Override
   public void a(bxc $$0) {
      super.a($$0);
      if ($$0 == this.s) {
         this.l();
      }
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.q.a(($$1, $$2) -> this.a($$0, this.s));
   }

   @Override
   public boolean b(cut $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.a($$2, 4.0), true);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         int $$5 = this.m();
         int $$6 = this.q();
         if ($$1 == this.n()) {
            if (!this.a($$4, $$5, $$6, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 0 && $$1 < this.n()) {
            if (!this.a($$4, $$5, $$6, false)) {
               return dcv.l;
            }
         } else if (this.b($$4) && $$1 >= this.m() && $$1 < this.q()) {
            if (!this.a($$4, 0, this.n(), false)) {
               return dcv.l;
            }
         } else if ($$1 >= this.m() && $$1 < this.o()) {
            if (!this.a($$4, this.p(), this.q(), false)) {
               return dcv.l;
            }
         } else if ($$1 >= this.p() && $$1 < this.q() && !this.a($$4, this.m(), this.o(), false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean b(dcv $$0) {
      return true;
   }

   public int n() {
      return this.p;
   }

   private int m() {
      return this.n() + 1;
   }

   private int o() {
      return this.m() + 27;
   }

   private int p() {
      return this.o();
   }

   private int q() {
      return this.p() + 9;
   }
}
