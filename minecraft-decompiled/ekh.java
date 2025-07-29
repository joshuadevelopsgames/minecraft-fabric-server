import java.util.stream.Stream;

public class ekh {
   public static final float a = -0.50375F;
   private static final float n = 0.08F;
   private static final double o = 1.5;
   private static final double p = 1.5;
   private static final double q = 1.5625;
   private static final double r = -0.703125;
   public static final int b = 64;
   public static final long c = 4096L;
   private static final ejt s = eju.a(10.0);
   private static final ejt t = eju.a();
   private static final amd<ejt> u = a("zero");
   private static final amd<ejt> v = a("y");
   private static final amd<ejt> w = a("shift_x");
   private static final amd<ejt> x = a("shift_z");
   private static final amd<ejt> y = a("overworld/base_3d_noise");
   private static final amd<ejt> z = a("nether/base_3d_noise");
   private static final amd<ejt> A = a("end/base_3d_noise");
   public static final amd<ejt> d = a("overworld/continents");
   public static final amd<ejt> e = a("overworld/erosion");
   public static final amd<ejt> f = a("overworld/ridges");
   public static final amd<ejt> g = a("overworld/ridges_folded");
   public static final amd<ejt> h = a("overworld/offset");
   public static final amd<ejt> i = a("overworld/factor");
   public static final amd<ejt> j = a("overworld/jaggedness");
   public static final amd<ejt> k = a("overworld/depth");
   private static final amd<ejt> B = a("overworld/sloped_cheese");
   public static final amd<ejt> l = a("overworld_large_biomes/continents");
   public static final amd<ejt> m = a("overworld_large_biomes/erosion");
   private static final amd<ejt> C = a("overworld_large_biomes/offset");
   private static final amd<ejt> D = a("overworld_large_biomes/factor");
   private static final amd<ejt> E = a("overworld_large_biomes/jaggedness");
   private static final amd<ejt> F = a("overworld_large_biomes/depth");
   private static final amd<ejt> G = a("overworld_large_biomes/sloped_cheese");
   private static final amd<ejt> H = a("overworld_amplified/offset");
   private static final amd<ejt> I = a("overworld_amplified/factor");
   private static final amd<ejt> J = a("overworld_amplified/jaggedness");
   private static final amd<ejt> K = a("overworld_amplified/depth");
   private static final amd<ejt> L = a("overworld_amplified/sloped_cheese");
   private static final amd<ejt> M = a("end/sloped_cheese");
   private static final amd<ejt> N = a("overworld/caves/spaghetti_roughness_function");
   private static final amd<ejt> O = a("overworld/caves/entrances");
   private static final amd<ejt> P = a("overworld/caves/noodle");
   private static final amd<ejt> Q = a("overworld/caves/pillars");
   private static final amd<ejt> R = a("overworld/caves/spaghetti_2d_thickness_modulator");
   private static final amd<ejt> S = a("overworld/caves/spaghetti_2d");

   private static amd<ejt> a(String $$0) {
      return amd.a(mn.aS, ame.b($$0));
   }

   public static jl<? extends ejt> a(qq<ejt> $$0) {
      jm<ezo.a> $$1 = $$0.a(mn.bd);
      jm<ejt> $$2 = $$0.a(mn.aS);
      $$0.a(u, eju.a());
      int $$3 = ehy.e * 2;
      int $$4 = ehy.d * 2;
      $$0.a(v, eju.a($$3, $$4, $$3, $$4));
      ejt $$5 = a($$0, w, eju.b(eju.c(eju.b($$1.b(ekj.j)))));
      ejt $$6 = a($$0, x, eju.b(eju.c(eju.c($$1.b(ekj.j)))));
      $$0.a(y, ezl.a(0.25, 0.125, 80.0, 160.0, 8.0));
      $$0.a(z, ezl.a(0.25, 0.375, 80.0, 60.0, 8.0));
      $$0.a(A, ezl.a(0.25, 0.25, 80.0, 160.0, 4.0));
      jl<ejt> $$7 = $$0.a(d, eju.b(eju.a($$5, $$6, 0.25, $$1.b(ekj.c))));
      jl<ejt> $$8 = $$0.a(e, eju.b(eju.a($$5, $$6, 0.25, $$1.b(ekj.d))));
      ejt $$9 = a($$0, f, eju.b(eju.a($$5, $$6, 0.25, $$1.b(ekj.i))));
      $$0.a(g, a($$9));
      ejt $$10 = eju.b($$1.b(ekj.M), 1500.0, 0.0);
      a($$0, $$2, $$10, $$7, $$8, h, i, j, k, B, false);
      jl<ejt> $$11 = $$0.a(l, eju.b(eju.a($$5, $$6, 0.25, $$1.b(ekj.g))));
      jl<ejt> $$12 = $$0.a(m, eju.b(eju.a($$5, $$6, 0.25, $$1.b(ekj.h))));
      a($$0, $$2, $$10, $$11, $$12, C, D, E, F, G, false);
      a($$0, $$2, $$10, $$7, $$8, H, I, J, K, L, true);
      $$0.a(M, eju.a(eju.a(0L), a($$2, A)));
      $$0.a(N, b($$1));
      $$0.a(R, eju.d(eju.a($$1.b(ekj.u), 2.0, 1.0, -0.6, -1.3)));
      $$0.a(S, f($$2, $$1));
      $$0.a(O, d($$2, $$1));
      $$0.a(P, e($$2, $$1));
      return $$0.a(Q, c($$1));
   }

   private static void a(
      qq<ejt> $$0, jm<ejt> $$1, ejt $$2, jl<ejt> $$3, jl<ejt> $$4, amd<ejt> $$5, amd<ejt> $$6, amd<ejt> $$7, amd<ejt> $$8, amd<ejt> $$9, boolean $$10
   ) {
      eju.w.a $$11 = new eju.w.a($$3);
      eju.w.a $$12 = new eju.w.a($$4);
      eju.w.a $$13 = new eju.w.a($$1.b(f));
      eju.w.a $$14 = new eju.w.a($$1.b(g));
      ejt $$15 = a($$0, $$5, a(eju.a(eju.a(-0.50375F), eju.a(rf.a($$11, $$12, $$14, $$10))), eju.c()));
      ejt $$16 = a($$0, $$6, a(eju.a(rf.a($$11, $$12, $$13, $$14, $$10)), s));
      ejt $$17 = a($$0, $$8, eju.a(eju.a(-64, 320, 1.5, -1.5), $$15));
      ejt $$18 = a($$0, $$7, a(eju.a(rf.b($$11, $$12, $$13, $$14, $$10)), t));
      ejt $$19 = eju.b($$18, $$2.g());
      ejt $$20 = b($$16, eju.a($$17, $$19));
      $$0.a($$9, eju.a($$20, a($$1, y)));
   }

   private static ejt a(qq<ejt> $$0, amd<ejt> $$1, ejt $$2) {
      return new eju.j($$0.a($$1, $$2));
   }

   private static ejt a(jm<ejt> $$0, amd<ejt> $$1) {
      return new eju.j($$0.b($$1));
   }

   private static ejt a(ejt $$0) {
      return eju.b(eju.a(eju.a($$0.d(), eju.a(-0.6666666666666666)).d(), eju.a(-0.3333333333333333)), eju.a(-3.0));
   }

   public static float a(float $$0) {
      return -(Math.abs(Math.abs($$0) - 0.6666667F) - 0.33333334F) * 3.0F;
   }

   private static ejt b(jm<ezo.a> $$0) {
      ejt $$1 = eju.a($$0.b(ekj.z));
      ejt $$2 = eju.a($$0.b(ekj.A), 0.0, -0.1);
      return eju.d(eju.b($$2, eju.a($$1.d(), eju.a(-0.4))));
   }

   private static ejt d(jm<ejt> $$0, jm<ezo.a> $$1) {
      ejt $$2 = eju.d(eju.b($$1.b(ekj.x), 2.0, 1.0));
      ejt $$3 = eju.a($$1.b(ekj.y), -0.065, -0.088);
      ejt $$4 = eju.a($$2, $$1.b(ekj.v), eju.z.a.a);
      ejt $$5 = eju.a($$2, $$1.b(ekj.w), eju.z.a.a);
      ejt $$6 = eju.a(eju.d($$4, $$5), $$3).a(-1.0, 1.0);
      ejt $$7 = a($$0, N);
      ejt $$8 = eju.b($$1.b(ekj.B), 0.75, 0.5);
      ejt $$9 = eju.a(eju.a($$8, eju.a(0.37)), eju.a(-10, 30, 0.3, 0.0));
      return eju.d(eju.c($$9, eju.a($$7, $$6)));
   }

   private static ejt e(jm<ejt> $$0, jm<ezo.a> $$1) {
      ejt $$2 = a($$0, v);
      int $$3 = -64;
      int $$4 = -60;
      int $$5 = 320;
      ejt $$6 = a($$2, eju.b($$1.b(ekj.I), 1.0, 1.0), -60, 320, -1);
      ejt $$7 = a($$2, eju.a($$1.b(ekj.J), 1.0, 1.0, -0.05, -0.1), -60, 320, 0);
      double $$8 = 2.6666666666666665;
      ejt $$9 = a($$2, eju.b($$1.b(ekj.K), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ejt $$10 = a($$2, eju.b($$1.b(ekj.L), 2.6666666666666665, 2.6666666666666665), -60, 320, 0);
      ejt $$11 = eju.b(eju.a(1.5), eju.d($$9.d(), $$10.d()));
      return eju.a($$6, -1000000.0, 0.0, eju.a(64.0), eju.a($$7, $$11));
   }

   private static ejt c(jm<ezo.a> $$0) {
      double $$1 = 25.0;
      double $$2 = 0.3;
      ejt $$3 = eju.b($$0.b(ekj.o), 25.0, 0.3);
      ejt $$4 = eju.a($$0.b(ekj.p), 0.0, -2.0);
      ejt $$5 = eju.a($$0.b(ekj.q), 0.0, 1.1);
      ejt $$6 = eju.a(eju.b($$3, eju.a(2.0)), $$4);
      return eju.d(eju.b($$6, $$5.f()));
   }

   private static ejt f(jm<ejt> $$0, jm<ezo.a> $$1) {
      ejt $$2 = eju.b($$1.b(ekj.t), 2.0, 1.0);
      ejt $$3 = eju.a($$2, $$1.b(ekj.r), eju.z.a.b);
      ejt $$4 = eju.a($$1.b(ekj.s), 0.0, Math.floorDiv(-64, 8), 8.0);
      ejt $$5 = a($$0, R);
      ejt $$6 = eju.a($$4, eju.a(-64, 320, 8.0, -40.0)).d();
      ejt $$7 = eju.a($$6, $$5).f();
      double $$8 = 0.083;
      ejt $$9 = eju.a($$3, eju.b(eju.a(0.083), $$5));
      return eju.d($$9, $$7).a(-1.0, 1.0);
   }

   private static ejt a(jm<ejt> $$0, jm<ezo.a> $$1, ejt $$2) {
      ejt $$3 = a($$0, S);
      ejt $$4 = a($$0, N);
      ejt $$5 = eju.a($$1.b(ekj.C), 8.0);
      ejt $$6 = eju.b(eju.a(4.0), $$5.e());
      ejt $$7 = eju.a($$1.b(ekj.D), 0.6666666666666666);
      ejt $$8 = eju.a(eju.a(eju.a(0.27), $$7).a(-1.0, 1.0), eju.a(eju.a(1.5), eju.b(eju.a(-0.64), $$2)).a(0.0, 0.5));
      ejt $$9 = eju.a($$6, $$8);
      ejt $$10 = eju.c(eju.c($$9, a($$0, O)), eju.a($$3, $$4));
      ejt $$11 = a($$0, Q);
      ejt $$12 = eju.a($$11, -1000000.0, 0.03, eju.a(-1000000.0), $$11);
      return eju.d($$10, $$12);
   }

   private static ejt b(ejt $$0) {
      ejt $$1 = eju.f($$0);
      return eju.b(eju.a($$1), eju.a(0.64)).i();
   }

   protected static ekg a(jm<ejt> $$0, jm<ezo.a> $$1, boolean $$2, boolean $$3) {
      ejt $$4 = eju.a($$1.b(ekj.k), 0.5);
      ejt $$5 = eju.a($$1.b(ekj.l), 0.67);
      ejt $$6 = eju.a($$1.b(ekj.n), 0.7142857142857143);
      ejt $$7 = eju.a($$1.b(ekj.m));
      ejt $$8 = a($$0, w);
      ejt $$9 = a($$0, x);
      ejt $$10 = eju.a($$8, $$9, 0.25, $$1.b($$2 ? ekj.e : ekj.a));
      ejt $$11 = eju.a($$8, $$9, 0.25, $$1.b($$2 ? ekj.f : ekj.b));
      ejt $$12 = a($$0, $$2 ? D : ($$3 ? I : i));
      ejt $$13 = a($$0, $$2 ? F : ($$3 ? K : k));
      ejt $$14 = b(eju.c($$12), $$13);
      ejt $$15 = a($$0, $$2 ? G : ($$3 ? L : B));
      ejt $$16 = eju.c($$15, eju.b(eju.a(5.0), a($$0, O)));
      ejt $$17 = eju.a($$15, -1000000.0, 1.5625, $$16, a($$0, $$1, $$15));
      ejt $$18 = eju.c(b(a($$3, $$17)), a($$0, P));
      ejt $$19 = a($$0, v);
      int $$20 = Stream.of(ekk.a.values()).mapToInt($$0x -> $$0x.c).min().orElse(-ehy.e * 2);
      int $$21 = Stream.of(ekk.a.values()).mapToInt($$0x -> $$0x.d).max().orElse(-ehy.e * 2);
      ejt $$22 = a($$19, eju.b($$1.b(ekj.E), 1.5, 1.5), $$20, $$21, 0);
      float $$23 = 4.0F;
      ejt $$24 = a($$19, eju.b($$1.b(ekj.F), 4.0, 4.0), $$20, $$21, 0).d();
      ejt $$25 = a($$19, eju.b($$1.b(ekj.G), 4.0, 4.0), $$20, $$21, 0).d();
      ejt $$26 = eju.a(eju.a(-0.08F), eju.d($$24, $$25));
      ejt $$27 = eju.a($$1.b(ekj.H));
      return new ekg(
         $$4,
         $$5,
         $$6,
         $$7,
         $$10,
         $$11,
         a($$0, $$2 ? l : d),
         a($$0, $$2 ? m : e),
         $$13,
         a($$0, f),
         a($$3, eju.a($$14, eju.a(-0.703125)).a(-64.0, 64.0)),
         $$18,
         $$22,
         $$26,
         $$27
      );
   }

   private static ekg b(jm<ejt> $$0, jm<ezo.a> $$1, ejt $$2) {
      ejt $$3 = a($$0, w);
      ejt $$4 = a($$0, x);
      ejt $$5 = eju.a($$3, $$4, 0.25, $$1.b(ekj.a));
      ejt $$6 = eju.a($$3, $$4, 0.25, $$1.b(ekj.b));
      ejt $$7 = b($$2);
      return new ekg(eju.a(), eju.a(), eju.a(), eju.a(), $$5, $$6, eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), $$7, eju.a(), eju.a(), eju.a());
   }

   private static ejt a(boolean $$0, ejt $$1) {
      return a($$1, -64, 384, $$0 ? 16 : 80, $$0 ? 0 : 64, -0.078125, 0, 24, $$0 ? 0.4 : 0.1171875);
   }

   private static ejt a(jm<ejt> $$0, int $$1, int $$2) {
      return a(a($$0, z), $$1, $$2, 24, 0, 0.9375, -8, 24, 2.5);
   }

   private static ejt a(ejt $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, 72, -184, -23.4375, 4, 32, -0.234375);
   }

   protected static ekg a(jm<ejt> $$0, jm<ezo.a> $$1) {
      return b($$0, $$1, a($$0, 0, 128));
   }

   protected static ekg b(jm<ejt> $$0, jm<ezo.a> $$1) {
      return b($$0, $$1, a($$0, -64, 192));
   }

   protected static ekg c(jm<ejt> $$0, jm<ezo.a> $$1) {
      return b($$0, $$1, a(a($$0, A), 0, 256));
   }

   private static ejt c(ejt $$0) {
      return a($$0, 0, 128);
   }

   protected static ekg a(jm<ejt> $$0) {
      ejt $$1 = eju.c(eju.a(0L));
      ejt $$2 = b(c(a($$0, M)));
      return new ekg(
         eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), $$1, eju.a(), eju.a(), c(eju.a($$1, eju.a(-0.703125))), $$2, eju.a(), eju.a(), eju.a()
      );
   }

   protected static ekg a() {
      return new ekg(eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a(), eju.a());
   }

   private static ejt a(ejt $$0, ejt $$1) {
      ejt $$2 = eju.a(eju.b(), $$1, $$0);
      return eju.b(eju.c($$2));
   }

   private static ejt b(ejt $$0, ejt $$1) {
      ejt $$2 = eju.b($$1, $$0);
      return eju.b(eju.a(4.0), $$2.h());
   }

   private static ejt a(ejt $$0, ejt $$1, int $$2, int $$3, int $$4) {
      return eju.a(eju.a($$0, $$2, $$3 + 1, $$1, eju.a((double)$$4)));
   }

   private static ejt a(ejt $$0, int $$1, int $$2, int $$3, int $$4, double $$5, int $$6, int $$7, double $$8) {
      ejt $$10 = eju.a($$1 + $$2 - $$3, $$1 + $$2 - $$4, 1.0, 0.0);
      ejt $$9 = eju.a($$10, $$5, $$0);
      ejt $$11 = eju.a($$1 + $$6, $$1 + $$7, 0.0, 1.0);
      return eju.a($$11, $$8, $$9);
   }

   protected static final class a {
      protected static double a(double $$0) {
         if ($$0 < -0.75) {
            return 0.5;
         } else if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.5) {
            return 1.0;
         } else {
            return $$0 < 0.75 ? 2.0 : 3.0;
         }
      }

      protected static double b(double $$0) {
         if ($$0 < -0.5) {
            return 0.75;
         } else if ($$0 < 0.0) {
            return 1.0;
         } else {
            return $$0 < 0.5 ? 1.5 : 2.0;
         }
      }
   }
}
