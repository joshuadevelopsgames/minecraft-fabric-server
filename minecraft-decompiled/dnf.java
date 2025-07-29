import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public final class dnf {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 24;
   public static final int a = 8;
   public static final int b = 128;
   public static final int c = bcb.d(8.0F / bcb.g);
   static final int f = (int)Math.pow(17.0, 2.0);
   private static final cap[] g = Stream.of(cap.values()).filter($$0 -> $$0 != cap.h).toArray(cap[]::new);

   private dnf() {
   }

   public static dnf.d a(int $$0, Iterable<bzm> $$1, dnf.b $$2, dne $$3) {
      dni $$4 = new dni();
      Object2IntOpenHashMap<cap> $$5 = new Object2IntOpenHashMap();

      for (bzm $$6 : $$1) {
         if (!($$6 instanceof cao $$7 && ($$7.gq() || $$7.af()))) {
            cap $$8 = $$6.ap().f();
            if ($$8 != cap.h) {
               jb $$9 = $$6.dx();
               $$2.query(dlz.a($$9), $$6x -> {
                  doj.b $$7x = a($$9, $$6x).b().a($$6.ap());
                  if ($$7x != null) {
                     $$4.a($$6.dx(), $$7x.b());
                  }

                  if ($$6 instanceof cao) {
                     $$3.a($$6x.f(), $$8);
                  }

                  $$5.addTo($$8, 1);
               });
            }
         }
      }

      return new dnf.d($$0, $$5, $$4, $$3);
   }

   static dnx a(jb $$0, efy $$1) {
      return $$1.getNoiseBiome(jw.a($$0.u()), jw.a($$0.v()), jw.a($$0.w())).a();
   }

   public static List<cap> a(dnf.d $$0, boolean $$1, boolean $$2, boolean $$3) {
      List<cap> $$4 = new ArrayList<>(g.length);

      for (cap $$5 : g) {
         if (($$1 || !$$5.d()) && ($$2 || $$5.d()) && ($$3 || !$$5.e()) && $$0.a($$5)) {
            $$4.add($$5);
         }
      }

      return $$4;
   }

   public static void a(aub $$0, egi $$1, dnf.d $$2, List<cap> $$3) {
      btt $$4 = bts.a();
      $$4.a("spawner");

      for (cap $$5 : $$3) {
         if ($$2.a($$5, $$1.f())) {
            a($$5, $$0, $$1, $$2::a, $$2::a);
         }
      }

      $$4.c();
   }

   public static void a(cap $$0, aub $$1, egi $$2, dnf.c $$3, dnf.a $$4) {
      jb $$5 = a($$1, $$2);
      if ($$5.v() >= $$1.L_() + 1) {
         a($$0, $$1, $$2, $$5, $$3, $$4);
      }
   }

   @bdl
   public static void a(cap $$0, aub $$1, jb $$2) {
      a($$0, $$1, $$1.A($$2), $$2, ($$0x, $$1x, $$2x) -> true, ($$0x, $$1x) -> {});
   }

   public static void a(cap $$0, aub $$1, efy $$2, jb $$3, dnf.c $$4, dnf.a $$5) {
      dnq $$6 = $$1.b();
      efz $$7 = $$1.n().g();
      int $$8 = $$3.v();
      eeb $$9 = $$2.a_($$3);
      if (!$$9.d($$2, $$3)) {
         jb.a $$10 = new jb.a();
         int $$11 = 0;

         for (int $$12 = 0; $$12 < 3; $$12++) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            doj.c $$16 = null;
            cbe $$17 = null;
            int $$18 = bcb.f($$1.A.i() * 4.0F);
            int $$19 = 0;

            for (int $$20 = 0; $$20 < $$18; $$20++) {
               $$13 += $$1.A.a(6) - $$1.A.a(6);
               $$14 += $$1.A.a(6) - $$1.A.a(6);
               $$10.d($$13, $$8, $$14);
               double $$21 = $$13 + 0.5;
               double $$22 = $$14 + 0.5;
               cut $$23 = $$1.a($$21, $$8, $$22, -1.0, false);
               if ($$23 != null) {
                  double $$24 = $$23.h($$21, $$8, $$22);
                  if (a($$1, $$2, $$10, $$24)) {
                     if ($$16 == null) {
                        Optional<doj.c> $$25 = a($$1, $$6, $$7, $$0, $$1.A, $$10);
                        if ($$25.isEmpty()) {
                           break;
                        }

                        $$16 = $$25.get();
                        $$18 = $$16.b() + $$1.A.a(1 + $$16.c() - $$16.b());
                     }

                     if (a($$1, $$0, $$6, $$7, $$16, $$10, $$24) && $$4.test($$16.a(), $$10, $$2)) {
                        cao $$26 = a($$1, $$16.a());
                        if ($$26 == null) {
                           return;
                        }

                        $$26.b($$21, $$8, $$22, $$1.A.i() * 360.0F, 0.0F);
                        if (a($$1, $$26, $$24)) {
                           $$17 = $$26.a($$1, $$1.d_($$26.dx()), bzu.a, $$17);
                           $$11++;
                           $$19++;
                           $$1.a_($$26);
                           $$5.run($$26, $$2);
                           if ($$11 >= $$26.gk()) {
                              return;
                           }

                           if ($$26.q($$19)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean a(aub $$0, efy $$1, jb.a $$2, double $$3) {
      if ($$3 <= 576.0) {
         return false;
      } else if ($$0.ab().a(new fis($$2.u() + 0.5, $$2.v(), $$2.w() + 0.5), 24.0)) {
         return false;
      } else {
         dlz $$4 = new dlz($$2);
         return Objects.equals($$4, $$1.f()) || $$0.c($$4);
      }
   }

   private static boolean a(aub $$0, cap $$1, dnq $$2, efz $$3, doj.c $$4, jb.a $$5, double $$6) {
      bzv<?> $$7 = $$4.a();
      if ($$7.f() == cap.h) {
         return false;
      } else if (!$$7.e() && $$6 > $$7.f().f() * $$7.f().f()) {
         return false;
      } else if (!$$7.c() || !a($$0, $$2, $$3, $$1, $$4, $$5)) {
         return false;
      } else if (!cbh.a($$7, $$0, $$5)) {
         return false;
      } else {
         return !cbh.a($$7, $$0, bzu.a, $$5, $$0.A) ? false : $$0.b($$7.a($$5.u() + 0.5, $$5.v(), $$5.w() + 0.5));
      }
   }

   @Nullable
   private static cao a(aub $$0, bzv<?> $$1) {
      try {
         if ($$1.a($$0, bzu.a) instanceof cao $$2) {
            return $$2;
         }

         d.warn("Can't spawn entity of type: {}", mm.f.b($$1));
      } catch (Exception var4) {
         d.warn("Failed to create mob", var4);
      }

      return null;
   }

   private static boolean a(aub $$0, cao $$1, double $$2) {
      return $$2 > $$1.ap().f().f() * $$1.ap().f().f() && $$1.h($$2) ? false : $$1.a($$0, bzu.a) && $$1.a((dmx)$$0);
   }

   private static Optional<doj.c> a(aub $$0, dnq $$1, efz $$2, cap $$3, bck $$4, jb $$5) {
      jl<dnx> $$6 = $$0.v($$5);
      return $$3 == cap.g && $$6.a(azn.ao) && $$4.i() < 0.98F ? Optional.empty() : a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
   }

   private static boolean a(aub $$0, dnq $$1, efz $$2, cap $$3, doj.c $$4, jb $$5) {
      return a($$0, $$1, $$2, $$3, $$5, null).b($$4);
   }

   private static bvt<doj.c> a(aub $$0, dnq $$1, efz $$2, cap $$3, jb $$4, @Nullable jl<dnx> $$5) {
      return a($$4, $$0, $$3, $$1) ? exf.d : $$2.a($$5 != null ? $$5 : $$0.v($$4), $$1, $$3, $$4);
   }

   public static boolean a(jb $$0, aub $$1, cap $$2, dnq $$3) {
      if ($$2 == cap.a && $$1.a_($$0.e()).a(dqb.fM)) {
         euy $$4 = $$3.b().f(mn.bj).c(eus.o);
         return $$4 == null ? false : $$3.a($$0, $$4).b();
      } else {
         return false;
      }
   }

   private static jb a(dmu $$0, egi $$1) {
      dlz $$2 = $$1.f();
      int $$3 = $$2.d() + $$0.A.a(16);
      int $$4 = $$2.e() + $$0.A.a(16);
      int $$5 = $$1.a(eka.a.b, $$3, $$4) + 1;
      int $$6 = bcb.b($$0.A, $$0.L_(), $$5);
      return new jb($$3, $$6, $$4);
   }

   public static boolean a(dly $$0, jb $$1, eeb $$2, fal $$3, bzv<?> $$4) {
      if ($$2.m($$0, $$1)) {
         return false;
      } else if ($$2.p()) {
         return false;
      } else if (!$$3.c()) {
         return false;
      } else {
         return $$2.a(azo.bb) ? false : !$$4.a($$2);
      }
   }

   public static void a(dnl $$0, jl<dnx> $$1, dlz $$2, bck $$3) {
      doj $$4 = $$1.a().b();
      bvt<doj.c> $$5 = $$4.a(cap.b);
      if (!$$5.c()) {
         int $$6 = $$2.d();
         int $$7 = $$2.e();

         while ($$3.i() < $$4.a()) {
            Optional<doj.c> $$8 = $$5.a($$3);
            if (!$$8.isEmpty()) {
               doj.c $$9 = $$8.get();
               int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
               cbe $$11 = null;
               int $$12 = $$6 + $$3.a(16);
               int $$13 = $$7 + $$3.a(16);
               int $$14 = $$12;
               int $$15 = $$13;

               for (int $$16 = 0; $$16 < $$10; $$16++) {
                  boolean $$17 = false;

                  for (int $$18 = 0; !$$17 && $$18 < 4; $$18++) {
                     jb $$19 = a($$0, $$9.a(), $$12, $$13);
                     if ($$9.a().c() && cbh.a($$9.a(), $$0, $$19)) {
                        float $$20 = $$9.a().l();
                        double $$21 = bcb.a((double)$$12, (double)$$6 + $$20, $$6 + 16.0 - $$20);
                        double $$22 = bcb.a((double)$$13, (double)$$7 + $$20, $$7 + 16.0 - $$20);
                        if (!$$0.b($$9.a().a($$21, $$19.v(), $$22)) || !cbh.a($$9.a(), $$0, bzu.b, jb.a($$21, (double)$$19.v(), $$22), $$0.H_())) {
                           continue;
                        }

                        bzm $$23;
                        try {
                           $$23 = $$9.a().a($$0.a(), bzu.a);
                        } catch (Exception var27) {
                           d.warn("Failed to create mob", var27);
                           continue;
                        }

                        if ($$23 == null) {
                           continue;
                        }

                        $$23.b($$21, $$19.v(), $$22, $$3.i() * 360.0F, 0.0F);
                        if ($$23 instanceof cao $$26 && $$26.a($$0, bzu.b) && $$26.a($$0)) {
                           $$11 = $$26.a($$0, $$0.d_($$26.dx()), bzu.b, $$11);
                           $$0.a_($$26);
                           $$17 = true;
                        }
                     }

                     $$12 += $$3.a(5) - $$3.a(5);

                     for ($$13 += $$3.a(5) - $$3.a(5); $$12 < $$6 || $$12 >= $$6 + 16 || $$13 < $$7 || $$13 >= $$7 + 16; $$13 = $$15 + $$3.a(5) - $$3.a(5)) {
                        $$12 = $$14 + $$3.a(5) - $$3.a(5);
                     }
                  }
               }
            }
         }
      }
   }

   private static jb a(dmx $$0, bzv<?> $$1, int $$2, int $$3) {
      int $$4 = $$0.a(cbh.b($$1), $$2, $$3);
      jb.a $$5 = new jb.a($$2, $$4, $$3);
      if ($$0.G_().h()) {
         do {
            $$5.c(jh.a);
         } while (!$$0.a_($$5).l());

         do {
            $$5.c(jh.a);
         } while ($$0.a_($$5).l() && $$5.v() > $$0.L_());
      }

      return cbh.a($$1).a($$0, $$5.j());
   }

   @FunctionalInterface
   public interface a {
      void run(cao var1, efy var2);
   }

   @FunctionalInterface
   public interface b {
      void query(long var1, Consumer<egi> var3);
   }

   @FunctionalInterface
   public interface c {
      boolean test(bzv<?> var1, jb var2, efy var3);
   }

   public static class d {
      private final int a;
      private final Object2IntOpenHashMap<cap> b;
      private final dni c;
      private final Object2IntMap<cap> d;
      private final dne e;
      @Nullable
      private jb f;
      @Nullable
      private bzv<?> g;
      private double h;

      d(int $$0, Object2IntOpenHashMap<cap> $$1, dni $$2, dne $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.e = $$3;
         this.d = Object2IntMaps.unmodifiable($$1);
      }

      private boolean a(bzv<?> $$0, jb $$1, efy $$2) {
         this.f = $$1;
         this.g = $$0;
         doj.b $$3 = dnf.a($$1, $$2).b().a($$0);
         if ($$3 == null) {
            this.h = 0.0;
            return true;
         } else {
            double $$4 = $$3.b();
            this.h = $$4;
            double $$5 = this.c.b($$1, $$4);
            return $$5 <= $$3.a();
         }
      }

      private void a(cao $$0, efy $$1) {
         bzv<?> $$2 = $$0.ap();
         jb $$3 = $$0.dx();
         double $$4;
         if ($$3.equals(this.f) && $$2 == this.g) {
            $$4 = this.h;
         } else {
            doj.b $$5 = dnf.a($$3, $$1).b().a($$2);
            if ($$5 != null) {
               $$4 = $$5.b();
            } else {
               $$4 = 0.0;
            }
         }

         this.c.a($$3, $$4);
         cap $$8 = $$2.f();
         this.b.addTo($$8, 1);
         this.e.a(new dlz($$3), $$8);
      }

      public int a() {
         return this.a;
      }

      public Object2IntMap<cap> b() {
         return this.d;
      }

      boolean a(cap $$0) {
         int $$1 = $$0.b() * this.a / dnf.f;
         return this.b.getInt($$0) < $$1;
      }

      boolean a(cap $$0, dlz $$1) {
         return this.e.a($$0, $$1);
      }
   }
}
