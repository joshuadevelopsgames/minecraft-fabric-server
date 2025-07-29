import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eza {
   private static final Logger l = LogUtils.getLogger();
   public static final String a = "palette";
   public static final String b = "palettes";
   public static final String c = "entities";
   public static final String d = "blocks";
   public static final String e = "pos";
   public static final String f = "state";
   public static final String g = "nbt";
   public static final String h = "pos";
   public static final String i = "blockPos";
   public static final String j = "nbt";
   public static final String k = "size";
   private final List<eza.b> m = Lists.newArrayList();
   private final List<eza.e> n = Lists.newArrayList();
   private kg o = kg.i;
   private String p = "?";

   public kg a() {
      return this.o;
   }

   public void a(String $$0) {
      this.p = $$0;
   }

   public String b() {
      return this.p;
   }

   public void a(dmu $$0, jb $$1, kg $$2, boolean $$3, List<dpz> $$4) {
      if ($$2.u() >= 1 && $$2.v() >= 1 && $$2.w() >= 1) {
         jb $$5 = $$1.a($$2).b(-1, -1, -1);
         List<eza.d> $$6 = Lists.newArrayList();
         List<eza.d> $$7 = Lists.newArrayList();
         List<eza.d> $$8 = Lists.newArrayList();
         jb $$9 = new jb(Math.min($$1.u(), $$5.u()), Math.min($$1.v(), $$5.v()), Math.min($$1.w(), $$5.w()));
         jb $$10 = new jb(Math.max($$1.u(), $$5.u()), Math.max($$1.v(), $$5.v()), Math.max($$1.w(), $$5.w()));
         this.o = $$2;

         try (bci.j $$11 = new bci.j(l)) {
            for (jb $$12 : jb.c($$9, $$10)) {
               jb $$13 = $$12.b($$9);
               eeb $$14 = $$0.a_($$12);
               if (!$$4.stream().anyMatch($$14::a)) {
                  eaz $$15 = $$0.c_($$12);
                  eza.d $$17;
                  if ($$15 != null) {
                     fcz $$16 = fcz.a($$11, $$0.K_());
                     $$15.d($$16);
                     $$17 = new eza.d($$13, $$14, $$16.b());
                  } else {
                     $$17 = new eza.d($$13, $$14, null);
                  }

                  a($$17, $$6, $$7, $$8);
               }
            }

            List<eza.d> $$19 = a($$6, $$7, $$8);
            this.m.clear();
            this.m.add(new eza.b($$19));
            if ($$3) {
               this.a($$0, $$9, $$10, $$11);
            } else {
               this.n.clear();
            }
         }
      }
   }

   private static void a(eza.d $$0, List<eza.d> $$1, List<eza.d> $$2, List<eza.d> $$3) {
      if ($$0.c != null) {
         $$2.add($$0);
      } else if (!$$0.b.b().n() && $$0.b.m(dmk.a, jb.c)) {
         $$1.add($$0);
      } else {
         $$3.add($$0);
      }
   }

   private static List<eza.d> a(List<eza.d> $$0, List<eza.d> $$1, List<eza.d> $$2) {
      Comparator<eza.d> $$3 = Comparator.<eza.d>comparingInt($$0x -> $$0x.a.v()).thenComparingInt($$0x -> $$0x.a.u()).thenComparingInt($$0x -> $$0x.a.w());
      $$0.sort($$3);
      $$2.sort($$3);
      $$1.sort($$3);
      List<eza.d> $$4 = Lists.newArrayList();
      $$4.addAll($$0);
      $$4.addAll($$2);
      $$4.addAll($$1);
      return $$4;
   }

   private void a(dmu $$0, jb $$1, jb $$2, bci $$3) {
      List<bzm> $$4 = $$0.a(bzm.class, fin.a($$1, $$2), $$0x -> !($$0x instanceof cut));
      this.n.clear();

      for (bzm $$5 : $$4) {
         fis $$6 = new fis($$5.dC() - $$1.u(), $$5.dE() - $$1.v(), $$5.dI() - $$1.w());
         fcz $$7 = fcz.a($$3.a($$5.ef()), $$5.eb());
         $$5.c($$7);
         jb $$9;
         if ($$5 instanceof cqu $$8) {
            $$9 = $$8.i().b($$1);
         } else {
            $$9 = jb.a((jv)$$6);
         }

         this.n.add(new eza.e($$6, $$9, $$7.b().l()));
      }
   }

   public List<eza.d> a(jb $$0, eyw $$1, dpz $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public List<eza.a> a(jb $$0, dwu $$1) {
      if (this.m.isEmpty()) {
         return new ArrayList<>();
      } else {
         eyw $$2 = new eyw().a($$1);
         List<eza.a> $$3 = $$2.a(this.m, $$0).a();
         List<eza.a> $$4 = new ArrayList<>($$3.size());

         for (eza.a $$5 : $$3) {
            eza.d $$6 = $$5.a;
            $$4.add($$5.b(new eza.d(a($$2, $$6.a()).a((kg)$$0), $$6.b.a($$2.d()), $$6.c)));
         }

         return $$4;
      }
   }

   public ObjectArrayList<eza.d> a(jb $$0, eyw $$1, dpz $$2, boolean $$3) {
      ObjectArrayList<eza.d> $$4 = new ObjectArrayList();
      euq $$5 = $$1.g();
      if (this.m.isEmpty()) {
         return $$4;
      } else {
         for (eza.d $$6 : $$1.a(this.m, $$0).a($$2)) {
            jb $$7 = $$3 ? a($$1, $$6.a).a((kg)$$0) : $$6.a;
            if ($$5 == null || $$5.b($$7)) {
               $$4.add(new eza.d($$7, $$6.b.a($$1.d()), $$6.c));
            }
         }

         return $$4;
      }
   }

   public jb a(eyw $$0, jb $$1, eyw $$2, jb $$3) {
      jb $$4 = a($$0, $$1);
      jb $$5 = a($$2, $$3);
      return $$4.b($$5);
   }

   public static jb a(eyw $$0, jb $$1) {
      return a($$1, $$0.c(), $$0.d(), $$0.e());
   }

   public boolean a(dnl $$0, jb $$1, jb $$2, eyw $$3, bck $$4, int $$5) {
      if (this.m.isEmpty()) {
         return false;
      } else {
         List<eza.d> $$6 = $$3.a(this.m, $$1).b();
         if ((!$$6.isEmpty() || !$$3.f() && !this.n.isEmpty()) && this.o.u() >= 1 && this.o.v() >= 1 && this.o.w() >= 1) {
            euq $$7 = $$3.g();
            List<jb> $$8 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<jb> $$9 = Lists.newArrayListWithCapacity($$3.j() ? $$6.size() : 0);
            List<Pair<jb, ui>> $$10 = Lists.newArrayListWithCapacity($$6.size());
            int $$11 = Integer.MAX_VALUE;
            int $$12 = Integer.MAX_VALUE;
            int $$13 = Integer.MAX_VALUE;
            int $$14 = Integer.MIN_VALUE;
            int $$15 = Integer.MIN_VALUE;
            int $$16 = Integer.MIN_VALUE;
            List<eza.d> $$17 = a($$0, $$1, $$2, $$3, $$6);

            try (bci.j $$18 = new bci.j(l)) {
               for (eza.d $$19 : $$17) {
                  jb $$20 = $$19.a;
                  if ($$7 == null || $$7.b($$20)) {
                     fal $$21 = $$3.j() ? $$0.b_($$20) : null;
                     eeb $$22 = $$19.b.a($$3.c()).a($$3.d());
                     if ($$19.c != null) {
                        $$0.a($$20, dqb.iy.m(), 820);
                     }

                     if ($$0.a($$20, $$22, $$5)) {
                        $$11 = Math.min($$11, $$20.u());
                        $$12 = Math.min($$12, $$20.v());
                        $$13 = Math.min($$13, $$20.w());
                        $$14 = Math.max($$14, $$20.u());
                        $$15 = Math.max($$15, $$20.v());
                        $$16 = Math.max($$16, $$20.w());
                        $$10.add(Pair.of($$20, $$19.c));
                        if ($$19.c != null) {
                           eaz $$23 = $$0.c_($$20);
                           if ($$23 != null) {
                              if ($$23 instanceof bxq) {
                                 $$19.c.a("LootTableSeed", $$4.g());
                              }

                              $$23.b(fcy.a($$18.a($$23.t()), $$0.K_(), $$19.c));
                           }
                        }

                        if ($$21 != null) {
                           if ($$22.y().b()) {
                              $$9.add($$20);
                           } else if ($$22.b() instanceof dux) {
                              ((dux)$$22.b()).a($$0, $$20, $$22, $$21);
                              if (!$$21.b()) {
                                 $$8.add($$20);
                              }
                           }
                        }
                     }
                  }
               }

               boolean $$24 = true;
               jh[] $$25 = new jh[]{jh.b, jh.c, jh.f, jh.d, jh.e};

               while ($$24 && !$$8.isEmpty()) {
                  $$24 = false;
                  Iterator<jb> $$26 = $$8.iterator();

                  while ($$26.hasNext()) {
                     jb $$27 = $$26.next();
                     fal $$28 = $$0.b_($$27);

                     for (int $$29 = 0; $$29 < $$25.length && !$$28.b(); $$29++) {
                        jb $$30 = $$27.a($$25[$$29]);
                        fal $$31 = $$0.b_($$30);
                        if ($$31.b() && !$$9.contains($$30)) {
                           $$28 = $$31;
                        }
                     }

                     if ($$28.b()) {
                        eeb $$32 = $$0.a_($$27);
                        dpz $$33 = $$32.b();
                        if ($$33 instanceof dux) {
                           ((dux)$$33).a($$0, $$27, $$32, $$28);
                           $$24 = true;
                           $$26.remove();
                        }
                     }
                  }
               }

               if ($$11 <= $$14) {
                  if (!$$3.h()) {
                     fjb $$34 = new fiv($$14 - $$11 + 1, $$15 - $$12 + 1, $$16 - $$13 + 1);
                     int $$35 = $$11;
                     int $$36 = $$12;
                     int $$37 = $$13;

                     for (Pair<jb, ui> $$38 : $$10) {
                        jb $$39 = (jb)$$38.getFirst();
                        $$34.c($$39.u() - $$35, $$39.v() - $$36, $$39.w() - $$37);
                     }

                     a($$0, $$5, $$34, $$35, $$36, $$37);
                  }

                  for (Pair<jb, ui> $$40 : $$10) {
                     jb $$41 = (jb)$$40.getFirst();
                     if (!$$3.h()) {
                        eeb $$42 = $$0.a_($$41);
                        eeb $$43 = dpz.b($$42, $$0, $$41);
                        if ($$42 != $$43) {
                           $$0.a($$41, $$43, $$5 & -2 | 16);
                        }

                        $$0.a($$41, $$43.b());
                     }

                     if ($$40.getSecond() != null) {
                        eaz $$44 = $$0.c_($$41);
                        if ($$44 != null) {
                           $$44.e();
                        }
                     }
                  }
               }

               if (!$$3.f()) {
                  this.a($$0, $$1, $$3.c(), $$3.d(), $$3.e(), $$7, $$3.k(), $$18);
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static void a(dmv $$0, int $$1, fjb $$2, jb $$3) {
      a($$0, $$1, $$2, $$3.u(), $$3.v(), $$3.w());
   }

   public static void a(dmv $$0, int $$1, fjb $$2, int $$3, int $$4, int $$5) {
      jb.a $$6 = new jb.a();
      jb.a $$7 = new jb.a();
      $$2.a(($$7x, $$8, $$9, $$10) -> {
         $$6.d($$3 + $$8, $$4 + $$9, $$5 + $$10);
         $$7.a($$6, $$7x);
         eeb $$11 = $$0.a_($$6);
         eeb $$12 = $$0.a_($$7);
         eeb $$13 = $$11.a($$0, $$0, $$6, $$7x, $$7, $$12, $$0.H_());
         if ($$11 != $$13) {
            $$0.a($$6, $$13, $$1 & -2);
         }

         eeb $$14 = $$12.a($$0, $$0, $$7, $$7x.g(), $$6, $$13, $$0.H_());
         if ($$12 != $$14) {
            $$0.a($$7, $$14, $$1 & -2);
         }
      });
   }

   public static List<eza.d> a(dnl $$0, jb $$1, jb $$2, eyw $$3, List<eza.d> $$4) {
      List<eza.d> $$5 = new ArrayList<>();
      List<eza.d> $$6 = new ArrayList<>();

      for (eza.d $$7 : $$4) {
         jb $$8 = a($$3, $$7.a).a((kg)$$1);
         eza.d $$9 = new eza.d($$8, $$7.b, $$7.c != null ? $$7.c.l() : null);
         Iterator<eyx> $$10 = $$3.i().iterator();

         while ($$9 != null && $$10.hasNext()) {
            $$9 = $$10.next().a($$0, $$1, $$2, $$7, $$9, $$3);
         }

         if ($$9 != null) {
            $$6.add($$9);
            $$5.add($$7);
         }
      }

      for (eyx $$11 : $$3.i()) {
         $$6 = $$11.a($$0, $$1, $$2, $$5, $$6, $$3);
      }

      return $$6;
   }

   private void a(dnl $$0, jb $$1, dvd $$2, dwu $$3, jb $$4, @Nullable euq $$5, boolean $$6, bci $$7) {
      for (eza.e $$8 : this.n) {
         jb $$9 = a($$8.b, $$2, $$3, $$4).a((kg)$$1);
         if ($$5 == null || $$5.b($$9)) {
            ui $$10 = $$8.c.l();
            fis $$11 = a($$8.a, $$2, $$3, $$4);
            fis $$12 = $$11.b($$1.u(), $$1.v(), $$1.w());
            uo $$13 = new uo();
            $$13.add(uj.a($$12.d));
            $$13.add(uj.a($$12.e));
            $$13.add(uj.a($$12.f));
            $$10.a("Pos", $$13);
            $$10.r("UUID");
            a($$7, $$0, $$10).ifPresent($$5x -> {
               float $$6x = $$5x.a($$3);
               $$6x += $$5x.a($$2) - $$5x.dP();
               $$5x.b($$12.d, $$12.e, $$12.f, $$6x, $$5x.dR());
               if ($$6 && $$5x instanceof cao) {
                  ((cao)$$5x).a($$0, $$0.d_(jb.a((jv)$$12)), bzu.d, null);
               }

               $$0.a_($$5x);
            });
         }
      }
   }

   private static Optional<bzm> a(bci $$0, dnl $$1, ui $$2) {
      try {
         return bzv.a(fcy.a($$0, $$1.K_(), $$2), $$1.a(), bzu.d);
      } catch (Exception var4) {
         return Optional.empty();
      }
   }

   public kg a(dwu $$0) {
      switch ($$0) {
         case d:
         case b:
            return new kg(this.o.w(), this.o.v(), this.o.u());
         default:
            return this.o;
      }
   }

   public static jb a(jb $$0, dvd $$1, dwu $$2, jb $$3) {
      int $$4 = $$0.u();
      int $$5 = $$0.v();
      int $$6 = $$0.w();
      boolean $$7 = true;
      switch ($$1) {
         case b:
            $$6 = -$$6;
            break;
         case c:
            $$4 = -$$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch ($$2) {
         case d:
            return new jb($$8 - $$9 + $$6, $$5, $$8 + $$9 - $$4);
         case b:
            return new jb($$8 + $$9 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new jb($$8 + $$8 - $$4, $$5, $$9 + $$9 - $$6);
         default:
            return $$7 ? new jb($$4, $$5, $$6) : $$0;
      }
   }

   public static fis a(fis $$0, dvd $$1, dwu $$2, jb $$3) {
      double $$4 = $$0.d;
      double $$5 = $$0.e;
      double $$6 = $$0.f;
      boolean $$7 = true;
      switch ($$1) {
         case b:
            $$6 = 1.0 - $$6;
            break;
         case c:
            $$4 = 1.0 - $$4;
            break;
         default:
            $$7 = false;
      }

      int $$8 = $$3.u();
      int $$9 = $$3.w();
      switch ($$2) {
         case d:
            return new fis($$8 - $$9 + $$6, $$5, $$8 + $$9 + 1 - $$4);
         case b:
            return new fis($$8 + $$9 + 1 - $$6, $$5, $$9 - $$8 + $$4);
         case c:
            return new fis($$8 + $$8 + 1 - $$4, $$5, $$9 + $$9 + 1 - $$6);
         default:
            return $$7 ? new fis($$4, $$5, $$6) : $$0;
      }
   }

   public jb a(jb $$0, dvd $$1, dwu $$2) {
      return a($$0, $$1, $$2, this.a().u(), this.a().w());
   }

   public static jb a(jb $$0, dvd $$1, dwu $$2, int $$3, int $$4) {
      $$3--;
      $$4--;
      int $$5 = $$1 == dvd.c ? $$3 : 0;
      int $$6 = $$1 == dvd.b ? $$4 : 0;
      jb $$7 = $$0;
      switch ($$2) {
         case d:
            $$7 = $$0.b($$6, 0, $$3 - $$5);
            break;
         case b:
            $$7 = $$0.b($$4 - $$6, 0, $$5);
            break;
         case c:
            $$7 = $$0.b($$3 - $$5, 0, $$4 - $$6);
            break;
         case a:
            $$7 = $$0.b($$5, 0, $$6);
      }

      return $$7;
   }

   public euq b(eyw $$0, jb $$1) {
      return this.a($$1, $$0.d(), $$0.e(), $$0.c());
   }

   public euq a(jb $$0, dwu $$1, jb $$2, dvd $$3) {
      return a($$0, $$1, $$2, $$3, this.o);
   }

   @VisibleForTesting
   protected static euq a(jb $$0, dwu $$1, jb $$2, dvd $$3, kg $$4) {
      kg $$5 = $$4.c(-1, -1, -1);
      jb $$6 = a(jb.c, $$3, $$1, $$2);
      jb $$7 = a(jb.c.a($$5), $$3, $$1, $$2);
      return euq.a($$6, $$7).a((kg)$$0);
   }

   public ui a(ui $$0) {
      if (this.m.isEmpty()) {
         $$0.a("blocks", new uo());
         $$0.a("palette", new uo());
      } else {
         List<eza.c> $$1 = Lists.newArrayList();
         eza.c $$2 = new eza.c();
         $$1.add($$2);

         for (int $$3 = 1; $$3 < this.m.size(); $$3++) {
            $$1.add(new eza.c());
         }

         uo $$4 = new uo();
         List<eza.d> $$5 = this.m.get(0).b();

         for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
            eza.d $$7 = $$5.get($$6);
            ui $$8 = new ui();
            $$8.a("pos", this.a($$7.a.u(), $$7.a.v(), $$7.a.w()));
            int $$9 = $$2.a($$7.b);
            $$8.a("state", $$9);
            if ($$7.c != null) {
               $$8.a("nbt", $$7.c);
            }

            $$4.add($$8);

            for (int $$10 = 1; $$10 < this.m.size(); $$10++) {
               eza.c $$11 = $$1.get($$10);
               $$11.a(this.m.get($$10).b().get($$6).b, $$9);
            }
         }

         $$0.a("blocks", $$4);
         if ($$1.size() == 1) {
            uo $$12 = new uo();

            for (eeb $$13 : $$2) {
               $$12.add(ux.a($$13));
            }

            $$0.a("palette", $$12);
         } else {
            uo $$14 = new uo();

            for (eza.c $$15 : $$1) {
               uo $$16 = new uo();

               for (eeb $$17 : $$15) {
                  $$16.add(ux.a($$17));
               }

               $$14.add($$16);
            }

            $$0.a("palettes", $$14);
         }
      }

      uo $$18 = new uo();

      for (eza.e $$19 : this.n) {
         ui $$20 = new ui();
         $$20.a("pos", this.a($$19.a.d, $$19.a.e, $$19.a.f));
         $$20.a("blockPos", this.a($$19.b.u(), $$19.b.v(), $$19.b.w()));
         if ($$19.c != null) {
            $$20.a("nbt", $$19.c);
         }

         $$18.add($$20);
      }

      $$0.a("entities", $$18);
      $$0.a("size", this.a(this.o.u(), this.o.v(), this.o.w()));
      return ux.e($$0);
   }

   public void a(jm<dpz> $$0, ui $$1) {
      this.m.clear();
      this.n.clear();
      uo $$2 = $$1.p("size");
      this.o = new kg($$2.a(0, 0), $$2.a(1, 0), $$2.a(2, 0));
      uo $$3 = $$1.p("blocks");
      Optional<uo> $$4 = $$1.o("palettes");
      if ($$4.isPresent()) {
         for (int $$5 = 0; $$5 < $$4.get().size(); $$5++) {
            this.a($$0, $$4.get().f($$5), $$3);
         }
      } else {
         this.a($$0, $$1.p("palette"), $$3);
      }

      $$1.p("entities").j().forEach($$0x -> {
         uo $$1x = $$0x.p("pos");
         fis $$2x = new fis($$1x.a(0, 0.0), $$1x.a(1, 0.0), $$1x.a(2, 0.0));
         uo $$3x = $$0x.p("blockPos");
         jb $$4x = new jb($$3x.a(0, 0), $$3x.a(1, 0), $$3x.a(2, 0));
         $$0x.m("nbt").ifPresent($$2xx -> this.n.add(new eza.e($$2x, $$4x, $$2xx)));
      });
   }

   private void a(jm<dpz> $$0, uo $$1, uo $$2) {
      eza.c $$3 = new eza.c();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         $$3.a(ux.a($$0, $$1.b($$4)), $$4);
      }

      List<eza.d> $$5 = Lists.newArrayList();
      List<eza.d> $$6 = Lists.newArrayList();
      List<eza.d> $$7 = Lists.newArrayList();
      $$2.j().forEach($$4 -> {
         uo $$5x = $$4.p("pos");
         jb $$6x = new jb($$5x.a(0, 0), $$5x.a(1, 0), $$5x.a(2, 0));
         eeb $$7x = $$3.a($$4.b("state", 0));
         ui $$8x = $$4.m("nbt").orElse(null);
         eza.d $$9 = new eza.d($$6x, $$7x, $$8x);
         a($$9, $$5, $$6, $$7);
      });
      List<eza.d> $$8 = a($$5, $$6, $$7);
      this.m.add(new eza.b($$8));
   }

   private uo a(int... $$0) {
      uo $$1 = new uo();

      for (int $$2 : $$0) {
         $$1.add(un.a($$2));
      }

      return $$1;
   }

   private uo a(double... $$0) {
      uo $$1 = new uo();

      for (double $$2 : $$0) {
         $$1.add(uj.a($$2));
      }

      return $$1;
   }

   public static ecd.a a(ui $$0, eeb $$1) {
      return $$0.<ecd.a>a("joint", ecd.a.c).orElseGet(() -> a($$1));
   }

   public static ecd.a a(eeb $$0) {
      return duh.o($$0).o().d() ? ecd.a.b : ecd.a.a;
   }

   public record a(eza.d a, ecd.a b, ame c, amd<ewi> d, ame e, int f, int g) {

      public static eza.a a(eza.d $$0) {
         ui $$1 = Objects.requireNonNull($$0.c(), () -> $$0 + " nbt was null");
         return new eza.a(
            $$0,
            eza.a($$1, $$0.b()),
            $$1.<ame>a("name", ame.a).orElse(ecd.b),
            $$1.<amd<ewi>>a("pool", ecd.a).orElse(qx.a),
            $$1.<ame>a("target", ame.a).orElse(ecd.b),
            $$1.b("placement_priority", 0),
            $$1.b("selection_priority", 0)
         );
      }

      @Override
      public String toString() {
         return String.format(
            Locale.ROOT,
            "<JigsawBlockInfo | %s | %s | name: %s | pool: %s | target: %s | placement: %d | selection: %d | %s>",
            this.a.a,
            this.a.b,
            this.c,
            this.d.a(),
            this.e,
            this.f,
            this.g,
            this.a.c
         );
      }

      public eza.a b(eza.d $$0) {
         return new eza.a($$0, this.b, this.c, this.d, this.e, this.f, this.g);
      }
   }

   public static final class b {
      private final List<eza.d> a;
      private final Map<dpz, List<eza.d>> b = Maps.newHashMap();
      @Nullable
      private List<eza.a> c;

      b(List<eza.d> $$0) {
         this.a = $$0;
      }

      public List<eza.a> a() {
         if (this.c == null) {
            this.c = this.a(dqb.pI).stream().map(eza.a::a).toList();
         }

         return this.c;
      }

      public List<eza.d> b() {
         return this.a;
      }

      public List<eza.d> a(dpz $$0) {
         return this.b.computeIfAbsent($$0, $$0x -> this.a.stream().filter($$1 -> $$1.b.a($$0x)).collect(Collectors.toList()));
      }
   }

   static class c implements Iterable<eeb> {
      public static final eeb a = dqb.a.m();
      private final jr<eeb> b = new jr<>(16);
      private int c;

      public int a(eeb $$0) {
         int $$1 = this.b.a($$0);
         if ($$1 == -1) {
            $$1 = this.c++;
            this.b.a($$0, $$1);
         }

         return $$1;
      }

      @Nullable
      public eeb a(int $$0) {
         eeb $$1 = this.b.a($$0);
         return $$1 == null ? a : $$1;
      }

      @Override
      public Iterator<eeb> iterator() {
         return this.b.iterator();
      }

      public void a(eeb $$0, int $$1) {
         this.b.a($$0, $$1);
      }
   }

   public record d(jb a, eeb b, @Nullable ui c) {

      @Override
      public String toString() {
         return String.format(Locale.ROOT, "<StructureBlockInfo | %s | %s | %s>", this.a, this.b, this.c);
      }
   }

   public static class e {
      public final fis a;
      public final jb b;
      public final ui c;

      public e(fis $$0, jb $$1, ui $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }
}
