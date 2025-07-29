import javax.annotation.Nullable;

public class hxz {
   private final fue a;
   @Nullable
   private hya b;

   public hxz(fue $$0, fui $$1) {
      this.a = $$0;
   }

   public void a(gwg $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable grk $$0, @Nullable fiq $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(grk $$0, jb $$1, eeb $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(dcv $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void b() {
      if (this.b != null) {
         this.b.b();
         this.b = null;
      }
   }

   public void c() {
      if (this.b != null) {
         this.b();
      }

      this.b = this.a.n.r.a(this);
   }

   public void d() {
      if (this.b != null) {
         if (this.a.s != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.s != null) {
         this.c();
      }
   }

   public void a(hyb $$0) {
      this.a.n.r = $$0;
      this.a.n.aC();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fue e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.i() == dmr.a;
   }

   public static xo a(String $$0) {
      return xo.d("key." + $$0).a(o.r);
   }

   public void a(dcv $$0, dcv $$1, cyw $$2) {
   }
}
