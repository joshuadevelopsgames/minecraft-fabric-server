import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class don {
   private static final float h = 0.05F;
   private static final float i = 0.26666668F;
   public static final float a = 0.4F;
   private static final float j = 0.93333334F;
   private static final float k = 0.1F;
   public static final float b = 0.56666666F;
   private static final float l = 0.7666667F;
   public static final float c = -0.11F;
   public static final float d = 0.03F;
   public static final float e = 0.3F;
   public static final float f = -0.78F;
   public static final float g = -0.375F;
   private static final float m = -0.225F;
   private static final float n = 0.9F;
   private final dog.b o = dog.b.a(-1.0F, 1.0F);
   private final dog.b[] p = new dog.b[]{dog.b.a(-1.0F, -0.45F), dog.b.a(-0.45F, -0.15F), dog.b.a(-0.15F, 0.2F), dog.b.a(0.2F, 0.55F), dog.b.a(0.55F, 1.0F)};
   private final dog.b[] q = new dog.b[]{dog.b.a(-1.0F, -0.35F), dog.b.a(-0.35F, -0.1F), dog.b.a(-0.1F, 0.1F), dog.b.a(0.1F, 0.3F), dog.b.a(0.3F, 1.0F)};
   private final dog.b[] r = new dog.b[]{
      dog.b.a(-1.0F, -0.78F),
      dog.b.a(-0.78F, -0.375F),
      dog.b.a(-0.375F, -0.2225F),
      dog.b.a(-0.2225F, 0.05F),
      dog.b.a(0.05F, 0.45F),
      dog.b.a(0.45F, 0.55F),
      dog.b.a(0.55F, 1.0F)
   };
   private final dog.b s = this.p[0];
   private final dog.b t = dog.b.a(this.p[1], this.p[4]);
   private final dog.b u = dog.b.a(-1.2F, -1.05F);
   private final dog.b v = dog.b.a(-1.05F, -0.455F);
   private final dog.b w = dog.b.a(-0.455F, -0.19F);
   private final dog.b x = dog.b.a(-0.19F, -0.11F);
   private final dog.b y = dog.b.a(-0.11F, 0.55F);
   private final dog.b z = dog.b.a(-0.11F, 0.03F);
   private final dog.b A = dog.b.a(0.03F, 0.3F);
   private final dog.b B = dog.b.a(0.3F, 1.0F);
   private final amd<dnx>[][] C = new amd[][]{{doe.Y, doe.W, doe.U, doe.S, doe.Q}, {doe.X, doe.V, doe.T, doe.R, doe.Q}};
   private final amd<dnx>[][] D = new amd[][]{
      {doe.d, doe.d, doe.d, doe.r, doe.q},
      {doe.b, doe.b, doe.i, doe.q, doe.p},
      {doe.j, doe.b, doe.i, doe.k, doe.l},
      {doe.s, doe.s, doe.i, doe.y, doe.y},
      {doe.f, doe.f, doe.f, doe.f, doe.f}
   };
   private final amd<dnx>[][] E = new amd[][]{
      {doe.e, null, doe.r, null, null},
      {null, null, null, null, doe.o},
      {doe.c, null, null, doe.n, null},
      {null, null, doe.b, doe.z, doe.A},
      {null, null, null, null, null}
   };
   private final amd<dnx>[][] F = new amd[][]{
      {doe.d, doe.d, doe.d, doe.r, doe.r},
      {doe.E, doe.E, doe.i, doe.q, doe.p},
      {doe.E, doe.E, doe.E, doe.E, doe.m},
      {doe.t, doe.t, doe.i, doe.i, doe.y},
      {doe.B, doe.B, doe.B, doe.D, doe.D}
   };
   private final amd<dnx>[][] G = new amd[][]{
      {doe.e, null, null, null, null},
      {doe.F, null, doe.E, doe.E, doe.o},
      {doe.F, doe.F, doe.i, doe.k, null},
      {null, null, null, null, null},
      {doe.C, doe.C, null, null, null}
   };
   private final amd<dnx>[][] H = new amd[][]{
      {doe.v, doe.v, doe.u, doe.w, doe.w},
      {doe.v, doe.v, doe.u, doe.w, doe.w},
      {doe.u, doe.u, doe.u, doe.w, doe.w},
      {null, null, null, null, null},
      {null, null, null, null, null}
   };

   public List<dog.d> a() {
      dog.b $$0 = dog.b.a(0.0F);
      float $$1 = 0.16F;
      return List.of(
         new dog.d(this.o, this.o, dog.b.a(this.y, this.o), this.o, $$0, dog.b.a(-1.0F, -0.16F), 0L),
         new dog.d(this.o, this.o, dog.b.a(this.y, this.o), this.o, $$0, dog.b.a(0.16F, 1.0F), 0L)
      );
   }

   protected void a(Consumer<Pair<dog.d, amd<dnx>>> $$0) {
      if (ac.aw) {
         this.b($$0);
      } else {
         this.c($$0);
         this.d($$0);
         this.e($$0);
      }
   }

   private void b(Consumer<Pair<dog.d, amd<dnx>>> $$0) {
      jn.a $$1 = pc.a();
      jm<ejt> $$2 = $$1.e(mn.aS);
      eju.w.a $$3 = new eju.w.a($$2.b(ekh.d));
      eju.w.a $$4 = new eju.w.a($$2.b(ekh.e));
      eju.w.a $$5 = new eju.w.a($$2.b(ekh.g));
      $$0.accept(Pair.of(dog.a(this.o, this.o, this.o, this.o, dog.b.a(0.0F), this.o, 0.01F), doe.b));
      if (rf.a($$4, $$5, -0.15F, 0.0F, 0.0F, 0.1F, 0.0F, -0.03F, false, false, bdh.a) instanceof bbb.e<?, ?> $$7) {
         amd<dnx> $$8 = doe.f;

         for (float $$9 : $$7.e()) {
            $$0.accept(Pair.of(dog.a(this.o, this.o, this.o, dog.b.a($$9), dog.b.a(0.0F), this.o, 0.0F), $$8));
            $$8 = $$8 == doe.f ? doe.B : doe.f;
         }
      }

      if (rf.a($$3, $$4, $$5, false) instanceof bbb.e<?, ?> $$11) {
         for (float $$12 : $$11.e()) {
            $$0.accept(Pair.of(dog.a(this.o, this.o, dog.b.a($$12), this.o, dog.b.a(0.0F), this.o, 0.0F), doe.r));
         }
      }
   }

   private void c(Consumer<Pair<dog.d, amd<dnx>>> $$0) {
      this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0F, doe.Z);

      for (int $$1 = 0; $$1 < this.p.length; $$1++) {
         dog.b $$2 = this.p[$$1];
         this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0F, this.C[0][$$1]);
         this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0F, this.C[1][$$1]);
      }
   }

   private void d(Consumer<Pair<dog.d, amd<dnx>>> $$0) {
      this.c($$0, dog.b.a(-1.0F, -0.93333334F));
      this.b($$0, dog.b.a(-0.93333334F, -0.7666667F));
      this.a($$0, dog.b.a(-0.7666667F, -0.56666666F));
      this.b($$0, dog.b.a(-0.56666666F, -0.4F));
      this.c($$0, dog.b.a(-0.4F, -0.26666668F));
      this.d($$0, dog.b.a(-0.26666668F, -0.05F));
      this.e($$0, dog.b.a(-0.05F, 0.05F));
      this.d($$0, dog.b.a(0.05F, 0.26666668F));
      this.c($$0, dog.b.a(0.26666668F, 0.4F));
      this.b($$0, dog.b.a(0.4F, 0.56666666F));
      this.a($$0, dog.b.a(0.56666666F, 0.7666667F));
      this.b($$0, dog.b.a(0.7666667F, 0.93333334F));
      this.c($$0, dog.b.a(0.93333334F, 1.0F));
   }

   private void a(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dog.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dog.b $$5 = this.q[$$4];
            amd<dnx> $$6 = this.a($$2, $$4, $$1);
            amd<dnx> $$7 = this.b($$2, $$4, $$1);
            amd<dnx> $$8 = this.c($$2, $$4, $$1);
            amd<dnx> $$9 = this.e($$2, $$4, $$1);
            amd<dnx> $$10 = this.h($$2, $$4, $$1);
            amd<dnx> $$11 = this.a($$2, $$4, $$1, $$10);
            amd<dnx> $$12 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), dog.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void b(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1) {
      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dog.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dog.b $$5 = this.q[$$4];
            amd<dnx> $$6 = this.a($$2, $$4, $$1);
            amd<dnx> $$7 = this.b($$2, $$4, $$1);
            amd<dnx> $$8 = this.c($$2, $$4, $$1);
            amd<dnx> $$9 = this.e($$2, $$4, $$1);
            amd<dnx> $$10 = this.h($$2, $$4, $$1);
            amd<dnx> $$11 = this.a($$2, $$4, $$1, $$6);
            amd<dnx> $$12 = this.g($$2, $$4, $$1);
            amd<dnx> $$13 = this.f($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.x, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[0], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[1], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), dog.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[2], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[6], $$1, 0.0F, $$6);
         }
      }
   }

   private void c(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1) {
      this.a($$0, this.o, this.o, this.x, dog.b.a(this.r[0], this.r[2]), $$1, 0.0F, doe.P);
      this.a($$0, dog.b.a(this.p[1], this.p[2]), this.o, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, doe.g);
      this.a($$0, dog.b.a(this.p[3], this.p[4]), this.o, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, doe.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dog.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dog.b $$5 = this.q[$$4];
            amd<dnx> $$6 = this.a($$2, $$4, $$1);
            amd<dnx> $$7 = this.b($$2, $$4, $$1);
            amd<dnx> $$8 = this.c($$2, $$4, $$1);
            amd<dnx> $$9 = this.h($$2, $$4, $$1);
            amd<dnx> $$10 = this.e($$2, $$4, $$1);
            amd<dnx> $$11 = this.a($$2, $$4);
            amd<dnx> $$12 = this.a($$2, $$4, $$1, $$6);
            amd<dnx> $$13 = this.d($$2, $$4, $$1);
            amd<dnx> $$14 = this.g($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dog.b.a(this.z, this.B), this.r[0], $$1, 0.0F, $$14);
            this.a($$0, $$3, $$5, dog.b.a(this.z, this.A), this.r[1], $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0F, $$2 == 0 ? $$14 : $$10);
            this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dog.b.a(this.x, this.z), this.r[3], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[3], $$1, 0.0F, $$7);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0F, $$11);
               this.a($$0, $$3, $$5, dog.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            } else {
               this.a($$0, $$3, $$5, dog.b.a(this.x, this.B), this.r[4], $$1, 0.0F, $$6);
            }

            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$13);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$12);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$9);
            if ($$1.b() < 0L) {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$11);
            } else {
               this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$6);
            }

            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void d(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1) {
      this.a($$0, this.o, this.o, this.x, dog.b.a(this.r[0], this.r[2]), $$1, 0.0F, doe.P);
      this.a($$0, dog.b.a(this.p[1], this.p[2]), this.o, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, doe.g);
      this.a($$0, dog.b.a(this.p[3], this.p[4]), this.o, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, doe.h);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dog.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dog.b $$5 = this.q[$$4];
            amd<dnx> $$6 = this.a($$2, $$4, $$1);
            amd<dnx> $$7 = this.b($$2, $$4, $$1);
            amd<dnx> $$8 = this.c($$2, $$4, $$1);
            amd<dnx> $$9 = this.a($$2, $$4);
            amd<dnx> $$10 = this.a($$2, $$4, $$1, $$6);
            amd<dnx> $$11 = this.d($$2, $$4, $$1);
            this.a($$0, $$3, $$5, this.z, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$8);
            this.a($$0, $$3, $$5, this.z, dog.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), dog.b.a(this.r[2], this.r[3]), $$1, 0.0F, $$7);
            this.a($$0, $$3, $$5, this.x, dog.b.a(this.r[3], this.r[4]), $$1, 0.0F, $$9);
            this.a($$0, $$3, $$5, dog.b.a(this.z, this.B), this.r[4], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0F, $$11);
            this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0F, $$10);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), this.r[5], $$1, 0.0F, $$6);
            this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0F, $$9);
            if ($$2 == 0) {
               this.a($$0, $$3, $$5, dog.b.a(this.z, this.B), this.r[6], $$1, 0.0F, $$6);
            }
         }
      }
   }

   private void e(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1) {
      this.a($$0, this.s, this.o, this.x, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? doe.P : doe.M);
      this.a($$0, this.t, this.o, this.x, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$1.b() < 0L ? doe.P : doe.L);
      this.a($$0, this.s, this.o, this.z, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, doe.M);
      this.a($$0, this.t, this.o, this.z, dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, doe.L);
      this.a($$0, this.s, this.o, dog.b.a(this.x, this.B), dog.b.a(this.r[2], this.r[5]), $$1, 0.0F, doe.M);
      this.a($$0, this.t, this.o, dog.b.a(this.x, this.B), dog.b.a(this.r[2], this.r[5]), $$1, 0.0F, doe.L);
      this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0F, doe.M);
      this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0F, doe.L);
      this.a($$0, dog.b.a(this.p[1], this.p[2]), this.o, dog.b.a(this.y, this.B), this.r[6], $$1, 0.0F, doe.g);
      this.a($$0, dog.b.a(this.p[3], this.p[4]), this.o, dog.b.a(this.y, this.B), this.r[6], $$1, 0.0F, doe.h);
      this.a($$0, this.s, this.o, dog.b.a(this.y, this.B), this.r[6], $$1, 0.0F, doe.M);

      for (int $$2 = 0; $$2 < this.p.length; $$2++) {
         dog.b $$3 = this.p[$$2];

         for (int $$4 = 0; $$4 < this.q.length; $$4++) {
            dog.b $$5 = this.q[$$4];
            amd<dnx> $$6 = this.b($$2, $$4, $$1);
            this.a($$0, $$3, $$5, dog.b.a(this.A, this.B), dog.b.a(this.r[0], this.r[1]), $$1, 0.0F, $$6);
         }
      }
   }

   private void e(Consumer<Pair<dog.d, amd<dnx>>> $$0) {
      this.b($$0, this.o, this.o, dog.b.a(0.8F, 1.0F), this.o, this.o, 0.0F, doe.aa);
      this.b($$0, this.o, dog.b.a(0.7F, 1.0F), this.o, this.o, this.o, 0.0F, doe.ab);
      this.c($$0, this.o, this.o, this.o, dog.b.a(this.r[0], this.r[1]), this.o, 0.0F, doe.ac);
   }

   private amd<dnx> a(int $$0, int $$1, dog.b $$2) {
      if ($$2.b() < 0L) {
         return this.D[$$0][$$1];
      } else {
         amd<dnx> $$3 = this.E[$$0][$$1];
         return $$3 == null ? this.D[$$0][$$1] : $$3;
      }
   }

   private amd<dnx> b(int $$0, int $$1, dog.b $$2) {
      return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
   }

   private amd<dnx> c(int $$0, int $$1, dog.b $$2) {
      return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
   }

   private amd<dnx> a(int $$0, int $$1, dog.b $$2, amd<dnx> $$3) {
      return $$0 > 1 && $$1 < 4 && $$2.b() >= 0L ? doe.x : $$3;
   }

   private amd<dnx> d(int $$0, int $$1, dog.b $$2) {
      amd<dnx> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
      return this.a($$0, $$1, $$2, $$3);
   }

   private amd<dnx> a(int $$0, int $$1) {
      if ($$0 == 0) {
         return doe.O;
      } else {
         return $$0 == 4 ? doe.f : doe.N;
      }
   }

   private amd<dnx> a(int $$0, dog.b $$1) {
      if ($$0 < 2) {
         return $$1.b() < 0L ? doe.B : doe.C;
      } else {
         return $$0 < 3 ? doe.B : doe.D;
      }
   }

   private amd<dnx> e(int $$0, int $$1, dog.b $$2) {
      if ($$2.b() >= 0L) {
         amd<dnx> $$3 = this.G[$$0][$$1];
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.F[$$0][$$1];
   }

   private amd<dnx> f(int $$0, int $$1, dog.b $$2) {
      if ($$0 <= 2) {
         return $$2.b() < 0L ? doe.J : doe.I;
      } else {
         return $$0 == 3 ? doe.K : this.a($$1, $$2);
      }
   }

   private amd<dnx> g(int $$0, int $$1, dog.b $$2) {
      if ($$0 >= 3) {
         return this.e($$0, $$1, $$2);
      } else {
         return $$1 <= 1 ? doe.H : doe.G;
      }
   }

   private amd<dnx> h(int $$0, int $$1, dog.b $$2) {
      amd<dnx> $$3 = this.H[$$0][$$1];
      return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
   }

   private void a(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1, dog.b $$2, dog.b $$3, dog.b $$4, dog.b $$5, float $$6, amd<dnx> $$7) {
      $$0.accept(Pair.of(dog.a($$1, $$2, $$3, $$4, dog.b.a(0.0F), $$5, $$6), $$7));
      $$0.accept(Pair.of(dog.a($$1, $$2, $$3, $$4, dog.b.a(1.0F), $$5, $$6), $$7));
   }

   private void b(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1, dog.b $$2, dog.b $$3, dog.b $$4, dog.b $$5, float $$6, amd<dnx> $$7) {
      $$0.accept(Pair.of(dog.a($$1, $$2, $$3, $$4, dog.b.a(0.2F, 0.9F), $$5, $$6), $$7));
   }

   private void c(Consumer<Pair<dog.d, amd<dnx>>> $$0, dog.b $$1, dog.b $$2, dog.b $$3, dog.b $$4, dog.b $$5, float $$6, amd<dnx> $$7) {
      $$0.accept(Pair.of(dog.a($$1, $$2, $$3, $$4, dog.b.a(1.1F), $$5, $$6), $$7));
   }

   public static boolean a(ejt $$0, ejt $$1, ejt.b $$2) {
      return $$0.a($$2) < -0.225F && $$1.a($$2) > 0.9F;
   }

   public static String a(double $$0) {
      if ($$0 < ekh.a(0.05F)) {
         return "Valley";
      } else if ($$0 < ekh.a(0.26666668F)) {
         return "Low";
      } else if ($$0 < ekh.a(0.4F)) {
         return "Mid";
      } else {
         return $$0 < ekh.a(0.56666666F) ? "High" : "Peak";
      }
   }

   public String b(double $$0) {
      double $$1 = dog.a((float)$$0);
      if ($$1 < this.u.b()) {
         return "Mushroom fields";
      } else if ($$1 < this.v.b()) {
         return "Deep ocean";
      } else if ($$1 < this.w.b()) {
         return "Ocean";
      } else if ($$1 < this.x.b()) {
         return "Coast";
      } else if ($$1 < this.z.b()) {
         return "Near inland";
      } else {
         return $$1 < this.A.b() ? "Mid inland" : "Far inland";
      }
   }

   public String c(double $$0) {
      return a($$0, this.r);
   }

   public String d(double $$0) {
      return a($$0, this.p);
   }

   public String e(double $$0) {
      return a($$0, this.q);
   }

   private static String a(double $$0, dog.b[] $$1) {
      double $$2 = dog.a((float)$$0);

      for (int $$3 = 0; $$3 < $$1.length; $$3++) {
         if ($$2 < $$1[$$3].b()) {
            return $$3 + "";
         }
      }

      return "?";
   }

   @bdl
   public dog.b[] b() {
      return this.p;
   }

   @bdl
   public dog.b[] c() {
      return this.q;
   }

   @bdl
   public dog.b[] d() {
      return this.r;
   }

   @bdl
   public dog.b[] e() {
      return new dog.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
   }

   @bdl
   public dog.b[] f() {
      return new dog.b[]{
         dog.b.a(-2.0F, ekh.a(0.05F)),
         dog.b.a(ekh.a(0.05F), ekh.a(0.26666668F)),
         dog.b.a(ekh.a(0.26666668F), ekh.a(0.4F)),
         dog.b.a(ekh.a(0.4F), ekh.a(0.56666666F)),
         dog.b.a(ekh.a(0.56666666F), 2.0F)
      };
   }

   @bdl
   public dog.b[] g() {
      return new dog.b[]{dog.b.a(-2.0F, 0.0F), dog.b.a(0.0F, 2.0F)};
   }
}
