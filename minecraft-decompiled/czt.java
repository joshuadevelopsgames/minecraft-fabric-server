import com.google.common.collect.ImmutableList;
import java.util.List;

public class czt extends cym {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cyz r;
   final czg s = czg.a();
   private List<jl<eao>> t = List.of();
   Runnable u = () -> {};
   private final jm<eao> v;
   final dak w;
   final dak x;
   private final dak y;
   private final dak z;
   long A;
   private final bxc B = new bxr(3) {
      @Override
      public void e() {
         super.e();
         czt.this.a(this);
         czt.this.u.run();
      }
   };
   private final bxc C = new bxr(1) {
      @Override
      public void e() {
         super.e();
         czt.this.u.run();
      }
   };

   public czt(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public czt(int $$0, cus $$1, final cyz $$2) {
      super(czv.s, $$0);
      this.r = $$2;
      this.w = this.a(new dak(this.B, 0, 13, 26) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.h() instanceof dbb;
         }
      });
      this.x = this.a(new dak(this.B, 1, 33, 26) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.h() instanceof dbu;
         }
      });
      this.y = this.a(new dak(this.B, 2, 23, 45) {
         @Override
         public boolean a(dcv $$0) {
            return $$0.c(kq.af);
         }
      });
      this.z = this.a(new dak(this.C, 0, 143, 57) {
         @Override
         public boolean a(dcv $$0) {
            return false;
         }

         @Override
         public void a(cut $$0, dcv $$1x) {
            czt.this.w.a(1);
            czt.this.x.a(1);
            if (!czt.this.w.h() || !czt.this.x.h()) {
               czt.this.s.a(-1);
            }

            $$2.a(($$0x, $$1xx) -> {
               long $$2xx = $$0x.ae();
               if (czt.this.A != $$2xx) {
                  $$0x.a(null, $$1xx, ayz.BW, aza.e, 1.0F, 1.0F);
                  czt.this.A = $$2xx;
               }
            });
            super.a($$0, $$1x);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.j.eb().f(mn.aJ);
   }

   @Override
   public boolean b(cut $$0) {
      return a(this.r, $$0, dqb.oA);
   }

   @Override
   public boolean a(cut $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jl<eao>> b(dcv $$0) {
      if ($$0.f()) {
         return this.v.a(azm.a).<List<jl<eao>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         bae<eao> $$1 = $$0.a(kq.af);
         return $$1 != null ? this.v.a($$1).<List<jl<eao>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bxc $$0) {
      dcv $$1 = this.w.g();
      dcv $$2 = this.x.g();
      dcv $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jl<eao>> $$6 = this.t;
         this.t = this.b($$3);
         jl<eao> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jl<eao> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.s.a($$10);
            } else {
               $$7 = null;
               this.s.a(-1);
            }
         }

         if ($$7 != null) {
            eap $$13 = $$1.a(kq.am, eap.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(dcv.l);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(dcv.l);
         }

         this.d();
      } else {
         this.z.f(dcv.l);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jl<eao>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public dcv b(cut $$0, int $$1) {
      dcv $$2 = dcv.l;
      dak $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dcv $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return dcv.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof dbb) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return dcv.l;
               }
            } else if ($$4.h() instanceof dbu) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return dcv.l;
               }
            } else if ($$4.c(kq.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return dcv.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return dcv.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
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

   @Override
   public void a(cut $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jl<eao> $$0) {
      dcv $$1 = this.w.g();
      dcv $$2 = this.x.g();
      dcv $$3 = dcv.l;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         dbt $$4 = ((dbu)$$2.h()).a();
         $$3.a(kq.am, eap.a, $$2x -> new eap.a().a($$2x).a($$0, $$4).a());
      }

      if (!dcv.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public dak n() {
      return this.w;
   }

   public dak o() {
      return this.x;
   }

   public dak p() {
      return this.y;
   }

   public dak q() {
      return this.z;
   }
}
