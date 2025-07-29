import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cwj {
   public static final cbf a = cbh.a(bzv.bb);
   public static final MapCodec<cwj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.BOOL.fieldOf("started").forGetter($$0x -> $$0x.E),
            Codec.BOOL.fieldOf("active").forGetter($$0x -> $$0x.H),
            Codec.LONG.fieldOf("ticks_active").forGetter($$0x -> $$0x.C),
            Codec.INT.fieldOf("raid_omen_level").forGetter($$0x -> $$0x.G),
            Codec.INT.fieldOf("groups_spawned").forGetter($$0x -> $$0x.I),
            Codec.INT.fieldOf("cooldown_ticks").forGetter($$0x -> $$0x.L),
            Codec.INT.fieldOf("post_raid_ticks").forGetter($$0x -> $$0x.K),
            Codec.FLOAT.fieldOf("total_health").forGetter($$0x -> $$0x.F),
            Codec.INT.fieldOf("group_count").forGetter($$0x -> $$0x.N),
            cwj.a.e.fieldOf("status").forGetter($$0x -> $$0x.O),
            jb.a.fieldOf("center").forGetter($$0x -> $$0x.D),
            kf.b.fieldOf("heroes_of_the_village").forGetter($$0x -> $$0x.B)
         )
         .apply($$0, cwj::new)
   );
   private static final int j = 7;
   private static final int k = 2;
   private static final int l = 32;
   private static final int m = 48000;
   private static final int n = 5;
   private static final xo o = xo.c("block.minecraft.ominous_banner");
   private static final String p = "event.minecraft.raid.raiders_remaining";
   public static final int c = 16;
   private static final int q = 40;
   private static final int r = 300;
   public static final int d = 2400;
   public static final int e = 600;
   private static final int s = 30;
   public static final int f = 24000;
   public static final int g = 5;
   private static final int t = 2;
   private static final xo u = xo.c("event.minecraft.raid");
   private static final xo v = xo.c("event.minecraft.raid.victory.full");
   private static final xo w = xo.c("event.minecraft.raid.defeat.full");
   private static final int x = 48000;
   private static final int y = 96;
   public static final int h = 9216;
   public static final int i = 12544;
   private final Map<Integer, cwk> z = Maps.newHashMap();
   private final Map<Integer, Set<cwk>> A = Maps.newHashMap();
   private final Set<UUID> B = Sets.newHashSet();
   private long C;
   private jb D;
   private boolean E;
   private float F;
   private int G;
   private boolean H;
   private int I;
   private final atx J = new atx(u, bwz.a.c, bwz.b.c);
   private int K;
   private int L;
   private final bck M = bck.a();
   private final int N;
   private cwj.a O;
   private int P;
   private Optional<jb> Q = Optional.empty();

   public cwj(jb $$0, bxg $$1) {
      this.H = true;
      this.L = 300;
      this.J.a(0.0F);
      this.D = $$0;
      this.N = this.a($$1);
      this.O = cwj.a.a;
   }

   private cwj(boolean $$0, boolean $$1, long $$2, int $$3, int $$4, int $$5, int $$6, float $$7, int $$8, cwj.a $$9, jb $$10, Set<UUID> $$11) {
      this.E = $$0;
      this.H = $$1;
      this.C = $$2;
      this.G = $$3;
      this.I = $$4;
      this.L = $$5;
      this.K = $$6;
      this.F = $$7;
      this.D = $$10;
      this.N = $$8;
      this.O = $$9;
      this.B.addAll($$11);
   }

   public boolean a() {
      return this.e() || this.f();
   }

   public boolean b() {
      return this.c() && this.p() == 0 && this.L > 0;
   }

   public boolean c() {
      return this.I > 0;
   }

   public boolean d() {
      return this.O == cwj.a.d;
   }

   public boolean e() {
      return this.O == cwj.a.b;
   }

   public boolean f() {
      return this.O == cwj.a.c;
   }

   public float g() {
      return this.F;
   }

   public Set<cwk> h() {
      Set<cwk> $$0 = Sets.newHashSet();

      for (Set<cwk> $$1 : this.A.values()) {
         $$0.addAll($$1);
      }

      return $$0;
   }

   public boolean i() {
      return this.E;
   }

   public int j() {
      return this.I;
   }

   private Predicate<auc> t() {
      return $$0 -> {
         jb $$1 = $$0.dx();
         return $$0.bO() && $$0.y().d($$1) == this;
      };
   }

   private void b(aub $$0) {
      Set<auc> $$1 = Sets.newHashSet(this.J.h());
      List<auc> $$2 = $$0.a(this.t());

      for (auc $$3 : $$2) {
         if (!$$1.contains($$3)) {
            this.J.a($$3);
         }
      }

      for (auc $$4 : $$1) {
         if (!$$2.contains($$4)) {
            this.J.b($$4);
         }
      }
   }

   public int k() {
      return 5;
   }

   public int l() {
      return this.G;
   }

   public void a(int $$0) {
      this.G = $$0;
   }

   public boolean a(auc $$0) {
      byq $$1 = $$0.e(bys.I);
      if ($$1 == null) {
         return false;
      } else {
         this.G = this.G + $$1.e() + 1;
         this.G = bcb.a(this.G, 0, this.k());
         if (!this.c()) {
            $$0.a(azj.aB);
            aq.J.a($$0);
         }

         return true;
      }
   }

   public void m() {
      this.H = false;
      this.J.b();
      this.O = cwj.a.d;
   }

   public void a(aub $$0) {
      if (!this.d()) {
         if (this.O == cwj.a.a) {
            boolean $$1 = this.H;
            this.H = $$0.D(this.D);
            if ($$0.an() == bxg.a) {
               this.m();
               return;
            }

            if ($$1 != this.H) {
               this.J.d(this.H);
            }

            if (!this.H) {
               return;
            }

            if (!$$0.c(this.D)) {
               this.c($$0);
            }

            if (!$$0.c(this.D)) {
               if (this.I > 0) {
                  this.O = cwj.a.c;
               } else {
                  this.m();
               }
            }

            this.C++;
            if (this.C >= 48000L) {
               this.m();
               return;
            }

            int $$2 = this.p();
            if ($$2 == 0 && this.u()) {
               if (this.L <= 0) {
                  if (this.L == 0 && this.I > 0) {
                     this.L = 300;
                     this.J.a(u);
                     return;
                  }
               } else {
                  boolean $$3 = this.Q.isPresent();
                  boolean $$4 = !$$3 && this.L % 5 == 0;
                  if ($$3 && !$$0.f(this.Q.get())) {
                     $$4 = true;
                  }

                  if ($$4) {
                     this.Q = this.d($$0);
                  }

                  if (this.L == 300 || this.L % 20 == 0) {
                     this.b($$0);
                  }

                  this.L--;
                  this.J.a(bcb.a((300 - this.L) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.C % 20L == 0L) {
               this.b($$0);
               this.e($$0);
               if ($$2 > 0) {
                  if ($$2 <= 2) {
                     this.J.a(u.f().f(" - ").b(xo.a("event.minecraft.raid.raiders_remaining", $$2)));
                  } else {
                     this.J.a(u);
                  }
               } else {
                  this.J.a(u);
               }
            }

            boolean $$5 = false;
            int $$6 = 0;

            while (this.z()) {
               jb $$7 = this.Q.orElseGet(() -> this.a($$0, 20));
               if ($$7 != null) {
                  this.E = true;
                  this.b($$0, $$7);
                  if (!$$5) {
                     this.a($$0, $$7);
                     $$5 = true;
                  }
               } else {
                  $$6++;
               }

               if ($$6 > 5) {
                  this.m();
                  break;
               }
            }

            if (this.i() && !this.u() && $$2 == 0) {
               if (this.K < 40) {
                  this.K++;
               } else {
                  this.O = cwj.a.b;

                  for (UUID $$8 : this.B) {
                     bzm $$9 = $$0.b($$8);
                     if ($$9 instanceof cam $$10 && !$$9.am()) {
                        $$10.a(new byq(bys.F, 48000, this.G - 1, false, false, true));
                        if ($$10 instanceof auc $$11) {
                           $$11.a(azj.aC);
                           aq.I.a($$11);
                        }
                     }
                  }
               }
            }

            this.f($$0);
         } else if (this.a()) {
            this.P++;
            if (this.P >= 600) {
               this.m();
               return;
            }

            if (this.P % 20 == 0) {
               this.b($$0);
               this.J.d(true);
               if (this.e()) {
                  this.J.a(0.0F);
                  this.J.a(v);
               } else {
                  this.J.a(w);
               }
            }
         }
      }
   }

   private void c(aub $$0) {
      Stream<ke> $$1 = ke.a(ke.a(this.D), 2);
      $$1.filter($$0::a).map(ke::k).min(Comparator.comparingDouble($$0x -> $$0x.j(this.D))).ifPresent(this::a);
   }

   private Optional<jb> d(aub $$0) {
      jb $$1 = this.a($$0, 8);
      return $$1 != null ? Optional.of($$1) : Optional.empty();
   }

   private boolean u() {
      return this.w() ? !this.x() : !this.v();
   }

   private boolean v() {
      return this.j() == this.N;
   }

   private boolean w() {
      return this.G > 1;
   }

   private boolean x() {
      return this.j() > this.N;
   }

   private boolean y() {
      return this.v() && this.p() == 0 && this.w();
   }

   private void e(aub $$0) {
      Iterator<Set<cwk>> $$1 = this.A.values().iterator();
      Set<cwk> $$2 = Sets.newHashSet();

      while ($$1.hasNext()) {
         Set<cwk> $$3 = $$1.next();

         for (cwk $$4 : $$3) {
            jb $$5 = $$4.dx();
            if ($$4.dU() || $$4.ai().aj() != $$0.aj() || this.D.j($$5) >= 12544.0) {
               $$2.add($$4);
            } else if ($$4.as > 600) {
               if ($$0.b($$4.cK()) == null) {
                  $$2.add($$4);
               }

               if (!$$0.c($$5) && $$4.eB() > 2400) {
                  $$4.c($$4.ha() + 1);
               }

               if ($$4.ha() >= 30) {
                  $$2.add($$4);
               }
            }
         }
      }

      for (cwk $$6 : $$2) {
         this.a($$0, $$6, true);
         if ($$6.gK()) {
            this.c($$6.gY());
         }
      }
   }

   private void a(aub $$0, jb $$1) {
      float $$2 = 13.0F;
      int $$3 = 64;
      Collection<auc> $$4 = this.J.h();
      long $$5 = this.M.g();

      for (auc $$6 : $$0.A()) {
         fis $$7 = $$6.dv();
         fis $$8 = fis.b($$1);
         double $$9 = Math.sqrt(($$8.d - $$7.d) * ($$8.d - $$7.d) + ($$8.f - $$7.f) * ($$8.f - $$7.f));
         double $$10 = $$7.d + 13.0 / $$9 * ($$8.d - $$7.d);
         double $$11 = $$7.f + 13.0 / $$9 * ($$8.f - $$7.f);
         if ($$9 <= 64.0 || $$4.contains($$6)) {
            $$6.g.b(new agr(ayz.wp, aza.g, $$10, $$6.dE(), $$11, 64.0F, 1.0F, $$5));
         }
      }
   }

   private void b(aub $$0, jb $$1) {
      boolean $$2 = false;
      int $$3 = this.I + 1;
      this.F = 0.0F;
      bxh $$4 = $$0.d_($$1);
      boolean $$5 = this.y();

      for (cwj.b $$6 : cwj.b.f) {
         int $$7 = this.a($$6, $$3, $$5) + this.a($$6, this.M, $$3, $$4, $$5);
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$7; $$9++) {
            cwk $$10 = $$6.g.a($$0, bzu.h);
            if ($$10 == null) {
               break;
            }

            if (!$$2 && $$10.gH()) {
               $$10.x(true);
               this.a($$3, $$10);
               $$2 = true;
            }

            this.a($$0, $$3, $$10, $$1, false);
            if ($$6.g == bzv.bb) {
               cwk $$11 = null;
               if ($$3 == this.a(bxg.c)) {
                  $$11 = bzv.aV.a($$0, bzu.h);
               } else if ($$3 >= this.a(bxg.d)) {
                  if ($$8 == 0) {
                     $$11 = bzv.T.a($$0, bzu.h);
                  } else {
                     $$11 = bzv.bG.a($$0, bzu.h);
                  }
               }

               $$8++;
               if ($$11 != null) {
                  this.a($$0, $$3, $$11, $$1, false);
                  $$11.a($$1, 0.0F, 0.0F);
                  $$11.o($$10);
               }
            }
         }
      }

      this.Q = Optional.empty();
      this.I++;
      this.n();
      this.f($$0);
   }

   public void a(aub $$0, int $$1, cwk $$2, @Nullable jb $$3, boolean $$4) {
      boolean $$5 = this.a($$0, $$1, $$2);
      if ($$5) {
         $$2.a(this);
         $$2.b($$1);
         $$2.A(true);
         $$2.c(0);
         if (!$$4 && $$3 != null) {
            $$2.a_($$3.u() + 0.5, $$3.v() + 1.0, $$3.w() + 0.5);
            $$2.a($$0, $$0.d_($$3), bzu.h, null);
            $$2.a($$0, $$1, false);
            $$2.e(true);
            $$0.a_($$2);
         }
      }
   }

   public void n() {
      this.J.a(bcb.a(this.o() / this.F, 0.0F, 1.0F));
   }

   public float o() {
      float $$0 = 0.0F;

      for (Set<cwk> $$1 : this.A.values()) {
         for (cwk $$2 : $$1) {
            $$0 += $$2.eL();
         }
      }

      return $$0;
   }

   private boolean z() {
      return this.L == 0 && (this.I < this.N || this.y()) && this.p() == 0;
   }

   public int p() {
      return this.A.values().stream().mapToInt(Set::size).sum();
   }

   public void a(aub $$0, cwk $$1, boolean $$2) {
      Set<cwk> $$3 = this.A.get($$1.gY());
      if ($$3 != null) {
         boolean $$4 = $$3.remove($$1);
         if ($$4) {
            if ($$2) {
               this.F = this.F - $$1.eL();
            }

            $$1.a(null);
            this.n();
            this.f($$0);
         }
      }
   }

   private void f(aub $$0) {
      $$0.C().e();
   }

   public static dcv a(jm<eao> $$0) {
      dcv $$1 = new dcv(dcz.ws);
      eap $$2 = new eap.a()
         .a($$0, eaq.z, dbt.j)
         .a($$0, eaq.f, dbt.i)
         .a($$0, eaq.j, dbt.h)
         .a($$0, eaq.E, dbt.i)
         .a($$0, eaq.k, dbt.p)
         .a($$0, eaq.B, dbt.i)
         .a($$0, eaq.y, dbt.i)
         .a($$0, eaq.E, dbt.p)
         .a();
      $$1.b(kq.am, $$2);
      $$1.b(kq.q, dfz.c.a(kq.am, true));
      $$1.b(kq.h, o);
      $$1.b(kq.k, ddr.b);
      return $$1;
   }

   @Nullable
   public cwk b(int $$0) {
      return this.z.get($$0);
   }

   @Nullable
   private jb a(aub $$0, int $$1) {
      int $$2 = this.L / 20;
      float $$3 = 0.22F * $$2 - 0.24F;
      jb.a $$4 = new jb.a();
      float $$5 = $$0.A.i() * (float) (Math.PI * 2);

      for (int $$6 = 0; $$6 < $$1; $$6++) {
         float $$7 = $$5 + (float) Math.PI * $$6 / 8.0F;
         int $$8 = this.D.u() + bcb.d(bcb.b($$7) * 32.0F * $$3) + $$0.A.a(3) * bcb.d($$3);
         int $$9 = this.D.w() + bcb.d(bcb.a($$7) * 32.0F * $$3) + $$0.A.a(3) * bcb.d($$3);
         int $$10 = $$0.a(eka.a.b, $$8, $$9);
         if (bcb.a($$10 - this.D.v()) <= 96) {
            $$4.d($$8, $$10, $$9);
            if (!$$0.c($$4) || $$2 <= 7) {
               int $$11 = 10;
               if ($$0.b($$4.u() - 10, $$4.w() - 10, $$4.u() + 10, $$4.w() + 10)
                  && $$0.f($$4)
                  && (a.isSpawnPositionOk($$0, $$4, bzv.bb) || $$0.a_($$4.e()).a(dqb.ed) && $$0.a_($$4).l())) {
                  return $$4;
               }
            }
         }
      }

      return null;
   }

   private boolean a(aub $$0, int $$1, cwk $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   public boolean a(aub $$0, int $$1, cwk $$2, boolean $$3) {
      this.A.computeIfAbsent($$1, $$0x -> Sets.newHashSet());
      Set<cwk> $$4 = this.A.get($$1);
      cwk $$5 = null;

      for (cwk $$6 : $$4) {
         if ($$6.cK().equals($$2.cK())) {
            $$5 = $$6;
            break;
         }
      }

      if ($$5 != null) {
         $$4.remove($$5);
         $$4.add($$2);
      }

      $$4.add($$2);
      if ($$3) {
         this.F = this.F + $$2.eL();
      }

      this.n();
      this.f($$0);
      return true;
   }

   public void a(int $$0, cwk $$1) {
      this.z.put($$0, $$1);
      $$1.a(bzw.f, a($$1.eb().f(mn.aJ)));
      $$1.a(bzw.f, 2.0F);
   }

   public void c(int $$0) {
      this.z.remove($$0);
   }

   public jb q() {
      return this.D;
   }

   private void a(jb $$0) {
      this.D = $$0;
   }

   private int a(cwj.b $$0, int $$1, boolean $$2) {
      return $$2 ? $$0.h[this.N] : $$0.h[$$1];
   }

   private int a(cwj.b $$0, bck $$1, int $$2, bxh $$3, boolean $$4) {
      bxg $$5 = $$3.a();
      boolean $$6 = $$5 == bxg.b;
      boolean $$7 = $$5 == bxg.c;
      int $$9;
      switch ($$0) {
         case a:
         case c:
            if ($$6) {
               $$9 = $$1.a(2);
            } else if ($$7) {
               $$9 = 1;
            } else {
               $$9 = 2;
            }
            break;
         case b:
         default:
            return 0;
         case d:
            if ($$6 || $$2 <= 2 || $$2 == 4) {
               return 0;
            }

            $$9 = 1;
            break;
         case e:
            $$9 = !$$6 && $$4 ? 1 : 0;
      }

      return $$9 > 0 ? $$1.a($$9 + 1) : 0;
   }

   public boolean r() {
      return this.H;
   }

   public int a(bxg $$0) {
      return switch ($$0) {
         case a -> 0;
         case b -> 3;
         case c -> 5;
         case d -> 7;
      };
   }

   public float s() {
      int $$0 = this.l();
      if ($$0 == 2) {
         return 0.1F;
      } else if ($$0 == 3) {
         return 0.25F;
      } else if ($$0 == 4) {
         return 0.5F;
      } else {
         return $$0 == 5 ? 0.75F : 0.0F;
      }
   }

   public void a(bzm $$0) {
      this.B.add($$0.cK());
   }

   static enum a implements bda {
      a("ongoing"),
      b("victory"),
      c("loss"),
      d("stopped");

      public static final Codec<cwj.a> e = bda.a(cwj.a::values);
      private final String f;

      private a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   static enum b {
      a(bzv.bG, new int[]{0, 0, 2, 0, 1, 4, 2, 5}),
      b(bzv.T, new int[]{0, 0, 0, 0, 0, 1, 1, 2}),
      c(bzv.aV, new int[]{0, 4, 3, 3, 4, 4, 4, 2}),
      d(bzv.bK, new int[]{0, 0, 0, 0, 3, 0, 0, 1}),
      e(bzv.bb, new int[]{0, 0, 0, 1, 0, 1, 0, 2});

      static final cwj.b[] f = values();
      final bzv<? extends cwk> g;
      final int[] h;

      private b(final bzv<? extends cwk> $$0, final int[] $$1) {
         this.g = $$0;
         this.h = $$1;
      }
   }
}
