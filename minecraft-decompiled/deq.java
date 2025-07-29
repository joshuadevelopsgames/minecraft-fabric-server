import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class deq {
   public static final int a = 20;
   public static final deq b = new deq(List.of(), List.of(), List.of());
   private final List<dhi> c;
   private final List<deq.b<dep>> d;
   private final List<deq.b<dcr>> e;

   deq(List<dhi> $$0, List<deq.b<dep>> $$1, List<deq.b<dcr>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public boolean a(dcv $$0) {
      return this.b($$0) || this.c($$0);
   }

   private boolean d(dcv $$0) {
      for (dhi $$1 : this.c) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(dcv $$0) {
      for (deq.b<dcr> $$1 : this.e) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(dcv $$0) {
      for (deq.b<dep> $$1 : this.d) {
         if ($$1.b.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jl<dep> $$0) {
      for (deq.b<dep> $$1 : this.d) {
         if ($$1.c.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(dcv $$0, dcv $$1) {
      return !this.d($$0) ? false : this.b($$0, $$1) || this.c($$0, $$1);
   }

   public boolean b(dcv $$0, dcv $$1) {
      for (deq.b<dcr> $$2 : this.e) {
         if ($$0.a($$2.a) && $$2.b.a($$1)) {
            return true;
         }
      }

      return false;
   }

   public boolean c(dcv $$0, dcv $$1) {
      Optional<jl<dep>> $$2 = $$0.a(kq.R, der.a).e();
      if ($$2.isEmpty()) {
         return false;
      } else {
         for (deq.b<dep> $$3 : this.d) {
            if ($$3.a.a($$2.get()) && $$3.b.a($$1)) {
               return true;
            }
         }

         return false;
      }
   }

   public dcv d(dcv $$0, dcv $$1) {
      if ($$1.f()) {
         return $$1;
      } else {
         Optional<jl<dep>> $$2 = $$1.a(kq.R, der.a).e();
         if ($$2.isEmpty()) {
            return $$1;
         } else {
            for (deq.b<dcr> $$3 : this.e) {
               if ($$1.a($$3.a) && $$3.b.a($$0)) {
                  return der.a($$3.c.a(), $$2.get());
               }
            }

            for (deq.b<dep> $$4 : this.d) {
               if ($$4.a.a($$2.get()) && $$4.b.a($$0)) {
                  return der.a($$1.h(), $$4.c);
               }
            }

            return $$1;
         }
      }
   }

   public static deq a(cyd $$0) {
      deq.a $$1 = new deq.a($$0);
      a($$1);
      return $$1.a();
   }

   public static void a(deq.a $$0) {
      $$0.a(dcz.tK);
      $$0.a(dcz.wR);
      $$0.a(dcz.wU);
      $$0.a(dcz.tK, dcz.qz, dcz.wR);
      $$0.a(dcz.wR, dcz.wQ, dcz.wU);
      $$0.a(des.a, dcz.sx, des.c);
      $$0.a(des.a, dcz.mm, des.b);
      $$0.a(des.a, dcz.tI, des.d);
      $$0.a(dcz.vC, des.Q);
      $$0.a(dcz.mt, des.S);
      $$0.a(dcz.b, des.T);
      $$0.a(dcz.cT, des.R);
      $$0.a(des.d, dcz.vM, des.e);
      $$0.a(des.e, dcz.mm, des.f);
      $$0.a(des.e, dcz.tM, des.g);
      $$0.a(des.f, dcz.tM, des.h);
      $$0.a(des.g, dcz.mm, des.h);
      $$0.a(dcz.tO, des.l);
      $$0.a(des.l, dcz.mm, des.m);
      $$0.a(dcz.wg, des.i);
      $$0.a(des.i, dcz.mm, des.j);
      $$0.a(des.i, dcz.sx, des.k);
      $$0.a(des.i, dcz.tM, des.q);
      $$0.a(des.j, dcz.tM, des.r);
      $$0.a(des.q, dcz.mm, des.r);
      $$0.a(des.q, dcz.sx, des.s);
      $$0.a(des.d, dcz.pt, des.t);
      $$0.a(des.t, dcz.mm, des.u);
      $$0.a(des.t, dcz.sx, des.v);
      $$0.a(des.n, dcz.tM, des.q);
      $$0.a(des.o, dcz.tM, des.r);
      $$0.a(dcz.sZ, des.n);
      $$0.a(des.n, dcz.mm, des.o);
      $$0.a(des.n, dcz.sx, des.p);
      $$0.a(des.d, dcz.sB, des.w);
      $$0.a(des.w, dcz.mm, des.x);
      $$0.a(dcz.tS, des.y);
      $$0.a(des.y, dcz.sx, des.z);
      $$0.a(des.y, dcz.tM, des.A);
      $$0.a(des.z, dcz.tM, des.B);
      $$0.a(des.A, dcz.sx, des.B);
      $$0.a(des.C, dcz.tM, des.A);
      $$0.a(des.D, dcz.tM, des.A);
      $$0.a(des.E, dcz.tM, des.B);
      $$0.a(dcz.tL, des.C);
      $$0.a(des.C, dcz.mm, des.D);
      $$0.a(des.C, dcz.sx, des.E);
      $$0.a(dcz.tG, des.F);
      $$0.a(des.F, dcz.mm, des.G);
      $$0.a(des.F, dcz.sx, des.H);
      $$0.a(dcz.tN, des.I);
      $$0.a(des.I, dcz.mm, des.J);
      $$0.a(des.I, dcz.sx, des.K);
      $$0.a(des.a, dcz.tM, des.L);
      $$0.a(des.L, dcz.mm, des.M);
      $$0.a(des.d, dcz.oT, des.O);
      $$0.a(des.O, dcz.mm, des.P);
   }

   public static class a {
      private final List<dhi> a = new ArrayList<>();
      private final List<deq.b<dep>> b = new ArrayList<>();
      private final List<deq.b<dcr>> c = new ArrayList<>();
      private final cyd d;

      public a(cyd $$0) {
         this.d = $$0;
      }

      private static void b(dcr $$0) {
         if (!($$0 instanceof ddo)) {
            throw new IllegalArgumentException("Expected a potion, got: " + mm.g.b($$0));
         }
      }

      public void a(dcr $$0, dcr $$1, dcr $$2) {
         if ($$0.a(this.d) && $$1.a(this.d) && $$2.a(this.d)) {
            b($$0);
            b($$2);
            this.c.add(new deq.b<>($$0.e(), dhi.a($$1), $$2.e()));
         }
      }

      public void a(dcr $$0) {
         if ($$0.a(this.d)) {
            b($$0);
            this.a.add(dhi.a($$0));
         }
      }

      public void a(jl<dep> $$0, dcr $$1, jl<dep> $$2) {
         if ($$0.a().a(this.d) && $$1.a(this.d) && $$2.a().a(this.d)) {
            this.b.add(new deq.b<>($$0, dhi.a($$1), $$2));
         }
      }

      public void a(dcr $$0, jl<dep> $$1) {
         if ($$1.a().a(this.d)) {
            this.a(des.a, $$0, des.b);
            this.a(des.d, $$0, $$1);
         }
      }

      public deq a() {
         return new deq(List.copyOf(this.a), List.copyOf(this.b), List.copyOf(this.c));
      }
   }

   record b<T>(jl<T> a, dhi b, jl<T> c) {
   }
}
