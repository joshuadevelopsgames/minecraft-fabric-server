import javax.annotation.Nullable;

public class rm {
   protected static final int a = 4159204;
   protected static final int b = 329011;
   private static final int d = 12638463;
   private static final int e = 8082228;
   @Nullable
   private static final ayw f = null;
   public static final int c = 70;

   protected static int a(float $$0) {
      float $$1 = $$0 / 3.0F;
      $$1 = bcb.a($$1, -1.0F, 1.0F);
      return bcb.g(0.62222224F - $$1 * 0.05F, 0.5F + $$1 * 0.1F, 1.0F);
   }

   private static dnx a(boolean $$0, float $$1, float $$2, doj.a $$3, dny.a $$4, @Nullable ayw $$5) {
      return a($$0, $$1, $$2, 4159204, 329011, null, null, null, $$3, $$4, $$5);
   }

   private static dnx a(
      boolean $$0,
      float $$1,
      float $$2,
      int $$3,
      int $$4,
      @Nullable Integer $$5,
      @Nullable Integer $$6,
      @Nullable Integer $$7,
      doj.a $$8,
      dny.a $$9,
      @Nullable ayw $$10
   ) {
      dod.a $$11 = new dod.a().b($$3).c($$4).a(12638463).d(a($$1)).a(dnv.b).a($$10);
      if ($$5 != null) {
         $$11.g($$5);
      }

      if ($$6 != null) {
         $$11.e($$6);
      }

      if ($$7 != null) {
         $$11.f($$7);
      }

      return new dnx.a().a($$0).a($$1).b($$2).a($$11.b()).a($$8.a()).a($$9.a()).a();
   }

   private static void a(dny.a $$0) {
      qp.a($$0);
      qp.ay($$0);
      qp.b($$0);
      qp.c($$0);
      qp.ar($$0);
      qp.av($$0);
   }

   public static dnx a(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3);
      $$3.a(cap.b, 8, new doj.c(bzv.bO, 4, 4));
      $$3.a(cap.b, 4, new doj.c(bzv.ba, 2, 3));
      $$3.a(cap.b, 8, new doj.c(bzv.ab, 2, 4));
      if ($$2) {
         qp.c($$3);
      } else {
         qp.b($$3);
         qp.a($$3, 100, 25, 100, false);
      }

      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      qp.m($$4);
      qp.n($$4);
      qp.f($$4);
      qp.j($$4);
      $$4.a(ejw.a.j, $$2 ? si.aF : si.aG);
      qp.X($$4);
      qp.W($$4);
      qp.ae($$4);
      qp.b($$4, true);
      qp.q($$4);
      ayw $$5 = ayx.a(ayz.ry);
      return a(true, $$2 ? 0.25F : 0.3F, 0.8F, $$3, $$4, $$5);
   }

   public static dnx a(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.i($$2);
      $$2.a(cap.b, 8, new doj.c(bzv.bO, 2, 4));
      return a($$0, $$1, 0.8F, false, true, false, $$2, ayx.a(ayz.rL));
   }

   public static dnx b(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.i($$2);
      $$2.a(cap.b, 40, new doj.c(bzv.aQ, 1, 2)).a(cap.a, 2, new doj.c(bzv.aK, 1, 3)).a(cap.b, 1, new doj.c(bzv.aP, 1, 2));
      return a($$0, $$1, 0.9F, false, false, true, $$2, ayx.a(ayz.rK));
   }

   public static dnx c(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.i($$2);
      $$2.a(cap.b, 40, new doj.c(bzv.aQ, 1, 2)).a(cap.b, 80, new doj.c(bzv.aP, 1, 2)).a(cap.a, 2, new doj.c(bzv.aK, 1, 1));
      return a($$0, $$1, 0.9F, true, false, true, $$2, ayx.a(ayz.rM));
   }

   private static dnx a(jm<euc> $$0, jm<eme<?>> $$1, float $$2, boolean $$3, boolean $$4, boolean $$5, doj.a $$6, ayw $$7) {
      dny.a $$8 = new dny.a($$0, $$1);
      a($$8);
      qp.f($$8);
      qp.j($$8);
      if ($$3) {
         qp.s($$8);
      } else {
         if ($$5) {
            qp.r($$8);
         }

         if ($$4) {
            qp.H($$8);
         } else {
            qp.G($$8);
         }
      }

      qp.aa($$8);
      qp.K($$8);
      qp.ae($$8);
      qp.b($$8, true);
      qp.aj($$8);
      if ($$4) {
         qp.ai($$8);
      } else {
         qp.ah($$8);
      }

      return a(true, 0.95F, $$2, $$6, $$8, $$7);
   }

   public static dnx b(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3);
      $$3.a(cap.b, 5, new doj.c(bzv.az, 4, 6));
      qp.c($$3);
      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.j($$4);
      if ($$2) {
         qp.F($$4);
      } else {
         qp.E($$4);
      }

      qp.o($$4);
      qp.X($$4);
      qp.ab($$4);
      qp.ae($$4);
      qp.b($$4, true);
      qp.h($$4);
      qp.i($$4);
      return a(true, 0.2F, 0.3F, $$3, $$4, f);
   }

   public static dnx d(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.f($$2);
      dny.a $$3 = new dny.a($$0, $$1);
      qp.ao($$3);
      a($$3);
      qp.f($$3);
      qp.j($$3);
      qp.X($$3);
      qp.ab($$3);
      qp.V($$3);
      qp.ae($$3);
      qp.ak($$3);
      qp.an($$3);
      return a(false, 2.0F, 0.0F, $$2, $$3, ayx.a(ayz.rI));
   }

   public static dnx a(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      doj.a $$5 = new doj.a();
      dny.a $$6 = new dny.a($$0, $$1);
      a($$6);
      if ($$3) {
         $$5.a(0.07F);
         qp.e($$5);
         if ($$4) {
            $$6.a(ejw.a.e, sd.a);
            $$6.a(ejw.a.e, sd.b);
         }
      } else {
         qp.d($$5);
         qp.ad($$6);
         if ($$2) {
            $$6.a(ejw.a.j, si.d);
         } else {
            qp.o($$6);
         }
      }

      qp.f($$6);
      qp.j($$6);
      if ($$3) {
         qp.J($$6);
         qp.X($$6);
         qp.ab($$6);
      } else {
         qp.U($$6);
      }

      qp.ae($$6);
      qp.b($$6, true);
      float $$7 = $$3 ? 0.0F : 0.8F;
      return a(true, $$7, $$3 ? 0.5F : 0.4F, $$5, $$6, f);
   }

   public static dnx e(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.h($$2);
      dny.a $$3 = new dny.a($$0, $$1);
      a($$3);
      qp.f($$3);
      qp.j($$3);
      qp.T($$3);
      qp.b($$3, true);
      return a(true, 0.9F, 1.0F, $$2, $$3, f);
   }

   public static dnx a(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2, boolean $$3) {
      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      if (!$$2) {
         qp.L($$4);
      }

      qp.f($$4);
      qp.j($$4);
      if ($$2) {
         qp.B($$4);
         qp.X($$4);
         qp.M($$4);
      } else {
         qp.A($$4);
         qp.aa($$4);
         qp.N($$4);
      }

      qp.ae($$4);
      qp.b($$4, true);
      doj.a $$5 = new doj.a();
      qp.a($$5);
      $$5.a(cap.b, 1, new doj.c(bzv.an, 2, 6)).a(cap.b, 1, new doj.c(bzv.J, 1, 1)).a(cap.b, 10, new doj.c(bzv.f, 2, 3));
      qp.c($$5);
      if ($$3) {
         $$5.a(cap.b, 8, new doj.c(bzv.az, 4, 4));
         $$5.a(cap.b, 8, new doj.c(bzv.bO, 4, 8));
      }

      return a(false, 2.0F, 0.0F, $$5, $$4, f);
   }

   public static dnx c(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3);
      qp.c($$3);
      $$3.a(cap.b, 6, new doj.c(bzv.f, 1, 2));
      $$3.a(0.03F);
      if ($$2) {
         $$3.a(cap.b, 2, new doj.c(bzv.bO, 4, 8));
         $$3.a(0.04F);
      }

      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.g($$4);
      qp.j($$4);
      if ($$2) {
         qp.I($$4);
      }

      qp.O($$4);
      qp.ae($$4);
      qp.ag($$4);
      return new dnx.a()
         .a(false)
         .a(2.0F)
         .b(0.0F)
         .a(new dod.a().b(4159204).c(329011).a(12638463).d(a(2.0F)).e(10387789).g(9470285).a(dnv.b).a(ayx.a(ayz.rJ)).b())
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   private static dnx a(doj.a $$0, int $$1, int $$2, dny.a $$3) {
      return a(true, 0.5F, 0.5F, $$1, $$2, null, null, null, $$0, $$3, f);
   }

   private static dny.a r(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      a($$2);
      qp.f($$2);
      qp.j($$2);
      qp.v($$2);
      qp.X($$2);
      qp.ab($$2);
      qp.ae($$2);
      qp.b($$2, true);
      return $$2;
   }

   public static dnx d(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3, 3, 4, 15);
      $$3.a(cap.g, 15, new doj.c(bzv.bc, 1, 5));
      dny.a $$4 = r($$0, $$1);
      $$4.a(ejw.a.j, $$2 ? sa.h : sa.c);
      qp.ap($$4);
      return a($$3, 4020182, 329011, $$4);
   }

   public static dnx e(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3, 1, 4, 10);
      $$3.a(cap.f, 1, new doj.c(bzv.I, 1, 2));
      dny.a $$4 = r($$0, $$1);
      $$4.a(ejw.a.j, $$2 ? sa.g : sa.b);
      qp.ap($$4);
      return a($$3, 4159204, 329011, $$4);
   }

   public static dnx f(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      if ($$2) {
         qp.a($$3, 8, 4, 8);
      } else {
         qp.a($$3, 10, 2, 15);
      }

      $$3.a(cap.g, 5, new doj.c(bzv.aZ, 1, 3)).a(cap.g, 25, new doj.c(bzv.bC, 8, 8)).a(cap.f, 2, new doj.c(bzv.I, 1, 2));
      dny.a $$4 = r($$0, $$1);
      $$4.a(ejw.a.j, $$2 ? sa.f : sa.a);
      qp.aq($$4);
      return a($$3, 4566514, 267827, $$4);
   }

   public static dnx f(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a().a(cap.g, 15, new doj.c(bzv.aZ, 1, 3));
      qp.a($$2, 10, 4);
      dny.a $$3 = r($$0, $$1).a(ejw.a.j, sa.l).a(ejw.a.j, sa.a).a(ejw.a.j, sa.i);
      return a($$2, 4445678, 270131, $$3);
   }

   public static dnx g(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a().a(cap.f, 1, new doj.c(bzv.bt, 1, 4)).a(cap.g, 15, new doj.c(bzv.bc, 1, 5)).a(cap.b, 1, new doj.c(bzv.aW, 1, 2));
      qp.c($$3);
      $$3.a(cap.a, 5, new doj.c(bzv.L, 1, 1));
      float $$4 = $$2 ? 0.5F : 0.0F;
      dny.a $$5 = new dny.a($$0, $$1);
      qp.at($$5);
      a($$5);
      qp.au($$5);
      qp.f($$5);
      qp.j($$5);
      qp.v($$5);
      qp.X($$5);
      qp.ab($$5);
      qp.ae($$5);
      qp.b($$5, true);
      return new dnx.a().a(true).a($$4).a(dnx.d.b).b(0.5F).a(new dod.a().b(3750089).c(329011).a(12638463).d(a($$4)).a(dnv.b).b()).a($$3.a()).a($$5.a()).a();
   }

   public static dnx b(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2, boolean $$3, boolean $$4) {
      dny.a $$5 = new dny.a($$0, $$1);
      a($$5);
      ayw $$6;
      if ($$4) {
         $$6 = ayx.a(ayz.rH);
         $$5.a(ejw.a.j, si.ak);
      } else {
         $$6 = ayx.a(ayz.rx);
         qp.P($$5);
      }

      qp.f($$5);
      qp.j($$5);
      if ($$4) {
         $$5.a(ejw.a.j, si.ao);
         $$5.a(ejw.a.j, si.Z);
         qp.ab($$5);
      } else {
         if ($$2) {
            qp.z($$5);
            if ($$3) {
               qp.y($$5);
            } else {
               qp.w($$5);
            }
         } else {
            qp.x($$5);
         }

         qp.o($$5);
         qp.X($$5);
         qp.Q($$5);
      }

      qp.ae($$5);
      qp.b($$5, true);
      doj.a $$8 = new doj.a();
      qp.a($$8);
      qp.c($$8);
      if ($$4) {
         $$8.a(cap.b, 4, new doj.c(bzv.ba, 2, 3));
      } else if (!$$2) {
         $$8.a(cap.b, 5, new doj.c(bzv.bO, 4, 4));
      }

      float $$9 = $$2 ? 0.6F : 0.7F;
      return a(true, $$9, $$2 ? 0.6F : 0.8F, $$8, $$5, $$6);
   }

   public static dnx h(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      qp.a($$3);
      $$3.a(cap.b, 8, new doj.c(bzv.bO, 4, 4)).a(cap.b, 4, new doj.c(bzv.ba, 2, 3)).a(cap.b, 8, new doj.c(bzv.ab, 2, 4));
      qp.c($$3);
      float $$4 = $$2 ? -0.5F : 0.25F;
      dny.a $$5 = new dny.a($$0, $$1);
      a($$5);
      qp.n($$5);
      qp.f($$5);
      qp.j($$5);
      qp.t($$5);
      qp.X($$5);
      qp.ac($$5);
      qp.b($$5, true);
      if ($$2) {
         qp.p($$5);
      } else {
         qp.q($$5);
      }

      return a(true, $$4, $$2 ? 0.4F : 0.8F, $$2 ? 4020182 : 4159204, 329011, null, null, null, $$3, $$5, f);
   }

   public static dnx i(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a();
      if (!$$2) {
         qp.a($$3);
      }

      qp.c($$3);
      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      $$4.a(ejw.a.j, $$2 ? si.aj : si.ai);
      if (!$$2) {
         qp.P($$4);
      } else {
         $$4.a(ejw.a.j, si.an);
         $$4.a(ejw.a.j, si.am);
      }

      qp.f($$4);
      qp.j($$4);
      if (!$$2) {
         qp.X($$4);
      } else {
         $$4.a(ejw.a.j, si.ae);
      }

      qp.Q($$4);
      if (!$$2) {
         qp.ae($$4);
         qp.af($$4);
      }

      qp.b($$4, true);
      return new dnx.a()
         .a(true)
         .a(0.7F)
         .b(0.8F)
         .a(
            $$2
               ? new dod.a().b(7768221).c(5597568).a(8484720).d(12171705).g(7832178).e(8883574).f(10528412).a(dnv.b).a().b()
               : new dod.a().b(4159204).c(329011).a(12638463).d(a(0.7F)).f(8082228).a(dod.b.b).a(dnv.b).a(ayx.a(ayz.rx)).b()
         )
         .a($$3.a())
         .a($$4.a())
         .a();
   }

   public static dnx g(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.a($$2);
      qp.a($$2, 70);
      $$2.a(cap.a, 1, new doj.c(bzv.bj, 1, 1));
      $$2.a(cap.a, 30, new doj.c(bzv.r, 4, 4));
      $$2.a(cap.b, 10, new doj.c(bzv.ac, 2, 5));
      dny.a $$3 = new dny.a($$0, $$1);
      qp.ao($$3);
      a($$3);
      qp.f($$3);
      qp.k($$3);
      qp.R($$3);
      qp.ae($$3);
      qp.al($$3);
      $$3.a(ejw.a.j, sa.e);
      ayw $$4 = ayx.a(ayz.rw);
      return new dnx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dod.a().b(6388580).c(2302743).a(12638463).d(a(0.8F)).e(6975545).f(8082228).a(dod.b.c).a(dnv.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dnx h(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.a($$2, 70);
      $$2.a(cap.a, 1, new doj.c(bzv.bj, 1, 1));
      $$2.a(cap.a, 30, new doj.c(bzv.r, 4, 4));
      $$2.a(cap.b, 10, new doj.c(bzv.ac, 2, 5));
      $$2.a(cap.g, 25, new doj.c(bzv.bC, 8, 8));
      dny.a $$3 = new dny.a($$0, $$1);
      qp.ao($$3);
      a($$3);
      qp.f($$3);
      qp.l($$3);
      qp.S($$3);
      qp.am($$3);
      ayw $$4 = ayx.a(ayz.rw);
      return new dnx.a()
         .a(true)
         .a(0.8F)
         .b(0.9F)
         .a(new dod.a().b(3832426).c(5077600).a(12638463).d(a(0.8F)).e(9285927).f(8082228).a(dod.b.c).a(dnv.b).a($$4).b())
         .a($$2.a())
         .a($$3.a())
         .a();
   }

   public static dnx j(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      doj.a $$3 = new doj.a().a(cap.f, 2, new doj.c(bzv.bt, 1, 4)).a(cap.g, 5, new doj.c(bzv.bc, 1, 5));
      qp.c($$3);
      $$3.a(cap.a, $$2 ? 1 : 100, new doj.c(bzv.L, 1, 1));
      dny.a $$4 = new dny.a($$0, $$1);
      a($$4);
      qp.f($$4);
      qp.j($$4);
      qp.v($$4);
      qp.o($$4);
      qp.X($$4);
      qp.ab($$4);
      qp.ae($$4);
      qp.b($$4, true);
      if (!$$2) {
         $$4.a(ejw.a.j, sa.d);
      }

      float $$5 = $$2 ? 0.0F : 0.5F;
      return a(true, $$5, 0.5F, $$2 ? 3750089 : 4159204, 329011, null, null, null, $$3, $$4, f);
   }

   public static dnx b(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2, boolean $$3) {
      doj.a $$4 = new doj.a();
      boolean $$5 = !$$3 && !$$2;
      if ($$5) {
         $$4.a(cap.b, 5, new doj.c(bzv.bD, 2, 5));
      }

      qp.c($$4);
      dny.a $$6 = new dny.a($$0, $$1);
      a($$6);
      qp.f($$6);
      qp.j($$6);
      qp.X($$6);
      qp.ab($$6);
      qp.ae($$6);
      qp.b($$6, true);
      float $$7;
      if ($$2) {
         $$7 = 0.05F;
      } else if ($$3) {
         $$7 = 0.2F;
      } else {
         $$7 = 0.8F;
      }

      return a(true, $$7, $$5 ? 0.4F : 0.3F, $$2 ? 4020182 : 4159204, 329011, null, null, null, $$4, $$6, f);
   }

   public static dnx i(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      $$2.a(ejw.a.k, sd.n);
      return a(false, 0.5F, 0.5F, new doj.a(), $$2, f);
   }

   public static dnx k(jm<euc> $$0, jm<eme<?>> $$1, boolean $$2) {
      dny.a $$3 = new dny.a($$0, $$1);
      doj.a $$4 = new doj.a();
      $$4.a(cap.b, 1, new doj.c($$2 ? bzv.aS : bzv.J, 1, 2)).a(cap.b, 2, new doj.c(bzv.ba, 2, 6)).a(cap.b, 2, new doj.c(bzv.bd, 2, 4));
      qp.c($$4);
      a($$3);
      qp.ad($$3);
      qp.f($$3);
      qp.j($$3);
      if ($$2) {
         qp.Y($$3);
      } else {
         qp.Z($$3);
      }

      qp.h($$3);
      qp.i($$3);
      ayw $$5 = ayx.a($$2 ? ayz.rA : ayz.rz);
      return $$2
         ? a(true, 0.5F, 0.8F, 6141935, 6141935, 11983713, 11983713, null, $$4, $$3, $$5)
         : a(true, 0.5F, 0.8F, 937679, 329011, null, null, null, $$4, $$3, $$5);
   }

   public static dnx j(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      doj.a $$3 = new doj.a();
      $$3.a(cap.b, 5, new doj.c(bzv.aj, 1, 3));
      qp.c($$3);
      a($$2);
      qp.as($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      ayw $$4 = ayx.a(ayz.rC);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dnx k(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      doj.a $$3 = new doj.a();
      $$3.a(cap.b, 5, new doj.c(bzv.aj, 1, 3));
      qp.c($$3);
      a($$2);
      qp.as($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      ayw $$4 = ayx.a(ayz.ru);
      return a(true, -0.7F, 0.9F, $$3, $$2, $$4);
   }

   public static dnx l(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      doj.a $$3 = new doj.a();
      qp.c($$3);
      a($$2);
      qp.f($$2);
      qp.j($$2);
      qp.h($$2);
      qp.i($$2);
      ayw $$4 = ayx.a(ayz.rF);
      return a(true, 1.0F, 0.3F, $$3, $$2, $$4);
   }

   public static dnx m(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      doj.a $$3 = new doj.a();
      $$3.a(cap.b, 4, new doj.c(bzv.ba, 2, 3)).a(cap.b, 5, new doj.c(bzv.aj, 1, 3));
      qp.c($$3);
      a($$2);
      qp.as($$2);
      qp.f($$2);
      qp.j($$2);
      qp.b($$2, false);
      qp.h($$2);
      qp.i($$2);
      ayw $$4 = ayx.a(ayz.rD);
      return a(true, -0.3F, 0.9F, $$3, $$2, $$4);
   }

   public static dnx n(jm<euc> $$0, jm<eme<?>> $$1) {
      dny.a $$2 = new dny.a($$0, $$1);
      doj.a $$3 = new doj.a();
      $$3.a(cap.b, 1, new doj.c(bzv.bO, 1, 1)).a(cap.b, 8, new doj.c(bzv.ba, 2, 3)).a(cap.b, 4, new doj.c(bzv.ab, 2, 4));
      qp.c($$3);
      a($$2);
      qp.as($$2);
      qp.f($$2);
      qp.j($$2);
      qp.u($$2);
      qp.b($$2, false);
      qp.h($$2);
      qp.i($$2);
      ayw $$4 = ayx.a(ayz.rt);
      return a(true, -0.2F, 0.8F, $$3, $$2, $$4);
   }

   public static dnx o(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      $$2.a(cap.d, 10, new doj.c(bzv.i, 4, 6));
      $$2.a(cap.g, 25, new doj.c(bzv.bC, 8, 8));
      qp.c($$2);
      dny.a $$3 = new dny.a($$0, $$1);
      a($$3);
      qp.ad($$3);
      qp.f($$3);
      qp.D($$3);
      qp.j($$3);
      qp.C($$3);
      ayw $$4 = ayx.a(ayz.rv);
      return a(true, 0.5F, 0.5F, $$2, $$3, $$4);
   }

   public static dnx p(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      qp.g($$2);
      dny.a $$3 = new dny.a($$0, $$1);
      a($$3);
      qp.ad($$3);
      qp.a($$3, true);
      qp.j($$3);
      qp.U($$3);
      qp.ae($$3);
      qp.b($$3, false);
      qp.d($$3);
      ayw $$4 = ayx.a(ayz.rs);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }

   public static dnx q(jm<euc> $$0, jm<eme<?>> $$1) {
      doj.a $$2 = new doj.a();
      dny.a $$3 = new dny.a($$0, $$1);
      $$3.a(qr.a);
      $$3.a(qr.b);
      $$3.a(qr.c);
      qp.ay($$3);
      qp.b($$3);
      qp.c($$3);
      qp.av($$3);
      qp.ad($$3);
      qp.f($$3);
      qp.j($$3);
      qp.U($$3);
      qp.ae($$3);
      qp.b($$3, false);
      qp.e($$3);
      ayw $$4 = ayx.a(ayz.rr);
      return a(true, 0.8F, 0.4F, $$2, $$3, $$4);
   }
}
