import javax.annotation.Nullable;

public class faa implements fad {
   public static final int b = 1;
   public static final faa c = new faa();
   protected final dmw d;
   @Nullable
   private final fac<?, ?> a;
   @Nullable
   private final fac<?, ?> e;

   public faa(egl $$0, boolean $$1, boolean $$2) {
      this.d = $$0.r();
      this.a = $$1 ? new ezt($$0) : null;
      this.e = $$2 ? new fae($$0) : null;
   }

   private faa() {
      this.d = dmw.e(0, 0);
      this.a = null;
      this.e = null;
   }

   @Override
   public void a(jb $$0) {
      if (this.a != null) {
         this.a.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   @Override
   public boolean N_() {
      return this.e != null && this.e.N_() ? true : this.a != null && this.a.N_();
   }

   @Override
   public int a() {
      int $$0 = 0;
      if (this.a != null) {
         $$0 += this.a.a();
      }

      if (this.e != null) {
         $$0 += this.e.a();
      }

      return $$0;
   }

   @Override
   public void a(ke $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void a(dlz $$0, boolean $$1) {
      if (this.a != null) {
         this.a.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }
   }

   @Override
   public void b(dlz $$0) {
      if (this.a != null) {
         this.a.b($$0);
      }

      if (this.e != null) {
         this.e.b($$0);
      }
   }

   public ezy a(dnd $$0) {
      if ($$0 == dnd.b) {
         return (ezy)(this.a == null ? ezy.a.a : this.a);
      } else {
         return (ezy)(this.e == null ? ezy.a.a : this.e);
      }
   }

   public String a(dnd $$0, ke $$1) {
      if ($$0 == dnd.b) {
         if (this.a != null) {
            return this.a.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public ezz.b b(dnd $$0, ke $$1) {
      if ($$0 == dnd.b) {
         if (this.a != null) {
            return this.a.c($$1.s());
         }
      } else if (this.e != null) {
         return this.e.c($$1.s());
      }

      return ezz.b.a;
   }

   public void a(dnd $$0, ke $$1, @Nullable egd $$2) {
      if ($$0 == dnd.b) {
         if (this.a != null) {
            this.a.a($$1.s(), $$2);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2);
      }
   }

   public void b(dlz $$0, boolean $$1) {
      if (this.a != null) {
         this.a.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }
   }

   public int a(jb $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.a == null ? 0 : this.a.b($$0);
      return Math.max($$3, $$2);
   }

   public boolean a(long $$0) {
      return this.a == null || this.a.f.k($$0) && (this.e == null || this.e.f.k($$0));
   }

   public int c() {
      return this.d.ap() + 2;
   }

   public int d() {
      return this.d.aq() - 1;
   }

   public int e() {
      return this.d() + this.c();
   }
}
