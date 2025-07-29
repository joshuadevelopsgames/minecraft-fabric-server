import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ejk {
   List<amd<ejb>> l_ = List.of(
      ejb.T.h(),
      ejb.U.h(),
      ejb.V.h(),
      ejb.W.h(),
      ejb.X.h(),
      ejb.Y.h(),
      ejb.Z.h(),
      ejb.aa.h(),
      ejb.ab.h(),
      ejb.ac.h(),
      ejb.ad.h(),
      ejb.ae.h(),
      ejb.af.h(),
      ejb.ag.h(),
      ejb.ah.h()
   );
   int m_ = 0;
   ToIntFunction<amd<ejb>> n_ = ag.a(new Reference2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(ejb.P.h(), 1);
      $$0.put(ejb.Q.h(), 1);
      $$0.put(ejb.x.h(), 1);
      $$0.put(ejb.J.h(), 2);
      $$0.put(ejb.A.h(), 2);
      $$0.put(ejb.O.h(), 2);
      $$0.put(ejb.C.h(), 3);
      $$0.put(ejb.K.h(), 3);
      $$0.put(ejb.B.h(), 3);
      $$0.put(ejb.u.h(), 4);
      $$0.put(ejb.n.h(), 4);
      $$0.put(ejb.S.h(), 4);
      $$0.put(ejb.q.h(), 5);
      $$0.put(ejb.v.h(), 5);
      $$0.put(ejb.r.h(), 6);
      $$0.put(ejb.M.h(), 6);
      $$0.put(ejb.s.h(), 6);
      $$0.put(ejb.o.h(), 7);
      $$0.put(ejb.l.h(), 8);
      $$0.put(ejb.m.h(), 8);
      $$0.put(ejb.j.h(), 9);
      $$0.put(ejb.d.h(), 9);
      $$0.put(ejb.e.h(), 9);
      $$0.put(ejb.g.h(), 9);
      $$0.put(ejb.k.h(), 10);
      $$0.put(ejb.h.h(), 10);
      $$0.put(ejb.a.h(), 10);
      $$0.put(ejb.b.h(), 10);
      $$0.put(ejb.I.h(), 10);
      $$0.put(ejb.H.h(), 10);
      $$0.put(ejb.c.h(), 11);
      $$0.put(ejb.f.h(), 12);
      $$0.put(ejb.y.h(), 12);
      $$0.put(ejb.i.h(), 13);
      $$0.put(ejb.z.h(), 13);
      $$0.put(ejb.t.h(), 14);
      $$0.put(ejb.G.h(), 14);
      $$0.put(ejb.R.h(), 14);
      $$0.put(ejb.p.h(), 15);
      $$0.put(ejb.w.h(), 15);

      for (int $$1 = 1; $$1 <= 15; $$1++) {
         $$0.put(b($$1), $$1);
      }
   });

   ejk.a gI();

   ejk.d gJ();

   static int a_(jl<ejb> $$0) {
      return $$0.e().map(ejk::a).orElse(0);
   }

   static int a(amd<ejb> $$0) {
      return n_.applyAsInt($$0);
   }

   static amd<ejb> b(int $$0) {
      return l_.get($$0 - 1);
   }

   static int a_(float $$0, int $$1) {
      double $$2 = 15.0 / $$1;
      return Math.max(1, 15 - bcb.a($$2 * $$0));
   }

   public static final class a {
      public static Codec<ejk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               eji.a.lenientOptionalFieldOf("event").forGetter($$0x -> Optional.ofNullable($$0x.c)),
               ejj.a.fieldOf("selector").forGetter(ejk.a::a),
               bbi.o.fieldOf("event_delay").orElse(0).forGetter(ejk.a::c)
            )
            .apply($$0, ($$0x, $$1, $$2) -> new ejk.a((eji)$$0x.orElse(null), $$1, $$2, true))
      );
      public static final String b = "listener";
      @Nullable
      eji c;
      private int d;
      final ejj e;
      private boolean f;

      private a(@Nullable eji $$0, ejj $$1, int $$2, boolean $$3) {
         this.c = $$0;
         this.d = $$2;
         this.e = $$1;
         this.f = $$3;
      }

      public a() {
         this(null, new ejj(), 0, false);
      }

      public ejj a() {
         return this.e;
      }

      @Nullable
      public eji b() {
         return this.c;
      }

      public void a(@Nullable eji $$0) {
         this.c = $$0;
      }

      public int c() {
         return this.d;
      }

      public void a(int $$0) {
         this.d = $$0;
      }

      public void d() {
         this.d = Math.max(0, this.d - 1);
      }

      public boolean e() {
         return this.f;
      }

      public void a(boolean $$0) {
         this.f = $$0;
      }
   }

   public static class b implements ejd {
      private final ejk a;

      public b(ejk $$0) {
         this.a = $$0;
      }

      @Override
      public ejf a() {
         return this.a.gJ().b();
      }

      @Override
      public int b() {
         return this.a.gJ().a();
      }

      @Override
      public boolean a(aub $$0, jl<ejb> $$1, ejb.a $$2, fis $$3) {
         ejk.a $$4 = this.a.gI();
         ejk.d $$5 = this.a.gJ();
         if ($$4.b() != null) {
            return false;
         } else if (!$$5.a($$1, $$2)) {
            return false;
         } else {
            Optional<fis> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
               return false;
            } else {
               fis $$7 = $$6.get();
               if (!$$5.a($$0, jb.a((jv)$$3), $$1, $$2)) {
                  return false;
               } else if (a($$0, $$3, $$7)) {
                  return false;
               } else {
                  this.a($$0, $$4, $$1, $$2, $$3, $$7);
                  return true;
               }
            }
         }
      }

      public void b(aub $$0, jl<ejb> $$1, ejb.a $$2, fis $$3) {
         this.a.gJ().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gI(), $$1, $$2, $$3, $$4));
      }

      private void a(aub $$0, ejk.a $$1, jl<ejb> $$2, ejb.a $$3, fis $$4, fis $$5) {
         $$1.e.a(new eji($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.ae());
      }

      public static float a(jb $$0, jb $$1) {
         return (float)Math.sqrt($$0.j($$1));
      }

      private static boolean a(dmu $$0, fis $$1, fis $$2) {
         fis $$3 = new fis(bcb.a($$1.d) + 0.5, bcb.a($$1.e) + 0.5, bcb.a($$1.f) + 0.5);
         fis $$4 = new fis(bcb.a($$2.d) + 0.5, bcb.a($$2.e) + 0.5, bcb.a($$2.f) + 0.5);

         for (jh $$5 : jh.values()) {
            fis $$6 = $$3.a($$5, 1.0E-5F);
            if ($$0.a(new dma($$6, $$4, $$0x -> $$0x.a(azo.bv))).d() != fiq.a.b) {
               return false;
            }
         }

         return true;
      }
   }

   public interface c {
      static void a(dmu $$0, ejk.a $$1, ejk.d $$2) {
         if ($$0 instanceof aub $$3) {
            if ($$1.c == null) {
               a($$3, $$1, $$2);
            }

            if ($$1.c != null) {
               boolean $$5 = $$1.c() > 0;
               b($$3, $$1, $$2);
               $$1.d();
               if ($$1.c() <= 0) {
                  $$5 = a($$3, $$1, $$2, $$1.c);
               }

               if ($$5) {
                  $$2.e();
               }
            }
         }
      }

      private static void a(aub $$0, ejk.a $$1, ejk.d $$2) {
         $$1.a().a($$0.ae()).ifPresent($$3 -> {
            $$1.a($$3);
            fis $$4 = $$3.c();
            $$1.a($$2.a($$3.b()));
            $$0.a(new mk($$2.b(), $$1.c()), $$4.d, $$4.e, $$4.f, 1, 0.0, 0.0, 0.0, 0.0);
            $$2.e();
            $$1.a().a();
         });
      }

      private static void b(aub $$0, ejk.a $$1, ejk.d $$2) {
         if ($$1.e()) {
            if ($$1.c == null) {
               $$1.a(false);
            } else {
               fis $$3 = $$1.c.c();
               ejf $$4 = $$2.b();
               fis $$5 = $$4.a($$0).orElse($$3);
               int $$6 = $$1.c();
               int $$7 = $$2.a($$1.c.b());
               double $$8 = 1.0 - (double)$$6 / $$7;
               double $$9 = bcb.d($$8, $$3.d, $$5.d);
               double $$10 = bcb.d($$8, $$3.e, $$5.e);
               double $$11 = bcb.d($$8, $$3.f, $$5.f);
               boolean $$12 = $$0.a(new mk($$4, $$6), $$9, $$10, $$11, 1, 0.0, 0.0, 0.0, 0.0) > 0;
               if ($$12) {
                  $$1.a(false);
               }
            }
         }
      }

      private static boolean a(aub $$0, ejk.a $$1, ejk.d $$2, eji $$3) {
         jb $$4 = jb.a((jv)$$3.c());
         jb $$5 = $$2.b().a($$0).map(jb::a).orElse($$4);
         if ($$2.f() && !a($$0, $$5)) {
            return false;
         } else {
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), ejk.b.a($$4, $$5));
            $$1.a(null);
            return true;
         }
      }

      private static boolean a(dmu $$0, jb $$1) {
         dlz $$2 = new dlz($$1);

         for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; $$3++) {
            for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; $$4++) {
               if (!$$0.a(dlz.c($$3, $$4)) || $$0.T().a($$3, $$4) == null) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public interface d {
      int a();

      ejf b();

      boolean a(aub var1, jb var2, jl<ejb> var3, ejb.a var4);

      void a(aub var1, jb var2, jl<ejb> var3, @Nullable bzm var4, @Nullable bzm var5, float var6);

      default bae<ejb> c() {
         return azv.a;
      }

      default boolean d() {
         return false;
      }

      default boolean f() {
         return false;
      }

      default int a(float $$0) {
         return bcb.d($$0);
      }

      default boolean a(jl<ejb> $$0, ejb.a $$1) {
         if (!$$0.a(this.c())) {
            return false;
         } else {
            bzm $$2 = $$1.a();
            if ($$2 != null) {
               if ($$2.am()) {
                  return false;
               }

               if ($$2.ch() && $$0.a(azv.d)) {
                  if (this.d() && $$2 instanceof auc $$3) {
                     aq.ac.a($$3);
                  }

                  return false;
               }

               if ($$2.bk()) {
                  return false;
               }
            }

            return $$1.b() != null ? !$$1.b().a(azo.U) : true;
         }
      }

      default void e() {
      }
   }
}
