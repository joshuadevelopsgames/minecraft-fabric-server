import java.util.List;
import java.util.Optional;

public class daq extends cym {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cyz v;
   final czg w = czg.a();
   private final dmu x;
   private dhz.b<dim> y = dhz.b.a();
   private dcv z = dcv.l;
   long A;
   final dak o;
   final dak p;
   Runnable B = () -> {};
   public final bxc q = new bxr(1) {
      @Override
      public void e() {
         super.e();
         daq.this.a(this);
         daq.this.B.run();
      }
   };
   final daf C = new daf();

   public daq(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public daq(int $$0, cus $$1, final cyz $$2) {
      super(czv.y, $$0);
      this.v = $$2;
      this.x = $$1.j.ai();
      this.o = this.a(new dak(this.q, 0, 20, 33));
      this.p = this.a(new dak(this.C, 1, 143, 33) {
         @Override
         public boolean a(dcv $$0) {
            return false;
         }

         @Override
         public void a(cut $$0, dcv $$1x) {
            $$1x.a($$0, $$1x.M());
            daq.this.C.a($$0, this.j());
            dcv $$2x = daq.this.o.a(1);
            if (!$$2x.f()) {
               daq.this.f(daq.this.w.b());
            }

            $$2.a(($$0x, $$1xx) -> {
               long $$2xxx = $$0x.ae();
               if (daq.this.A != $$2xxx) {
                  $$0x.a(null, $$1xx, ayz.BY, aza.e, 1.0F, 1.0F);
                  daq.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1x);
         }

         private List<dcv> j() {
            return List.of(daq.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dhz.b<dim> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.v, $$0, dqb.oJ);
   }

   @Override
   public boolean a(cut $$0, int $$1) {
      if (this.w.b() == $$1) {
         return false;
      } else {
         if (this.e($$1)) {
            this.w.a($$1);
            this.f($$1);
         }

         return true;
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.d();
   }

   @Override
   public void a(bxc $$0) {
      dcv $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.b($$1);
      }
   }

   private void b(dcv $$0) {
      this.w.a(-1);
      this.p.f(dcv.l);
      if (!$$0.f()) {
         this.y = this.x.R().a().b($$0);
      } else {
         this.y = dhz.b.a();
      }
   }

   void f(int $$0) {
      Optional<dhr<dim>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dhz.a<dim> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dim)$$0x.b()).a(new dif(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(dcv.l);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public czv<?> a() {
      return czv.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(dcv $$0, dak $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         dcr $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.c($$4, $$0);
            if (!this.a($$4, 2, 38, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return dcv.l;
            }
         } else if (this.x.R().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return dcv.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return dcv.l;
         }

         if ($$4.f()) {
            $$3.e(dcv.l);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return dcv.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 1) {
            $$0.a($$4, false);
         }

         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
