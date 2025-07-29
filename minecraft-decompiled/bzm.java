import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.floats.FloatSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public abstract class bzm implements alk, bxn, eig, fjw, kl {
   private static final Logger b = LogUtils.getLogger();
   public static final String v = "id";
   public static final String w = "UUID";
   public static final String x = "Passengers";
   public static final String y = "data";
   public static final String z = "Pos";
   public static final String A = "Motion";
   public static final String B = "Rotation";
   public static final String C = "PortalCooldown";
   public static final String D = "NoGravity";
   public static final String E = "Air";
   public static final String F = "OnGround";
   public static final String G = "fall_distance";
   public static final String H = "Fire";
   public static final String I = "Silent";
   public static final String J = "Glowing";
   public static final String K = "Invulnerable";
   private static final AtomicInteger c = new AtomicInteger();
   public static final int L = 0;
   public static final int M = 60;
   public static final int N = 300;
   public static final int O = 1024;
   private static final Codec<List<String>> d = Codec.STRING.sizeLimitedListOf(1024);
   public static final float P = 0.2F;
   public static final double Q = 0.500001;
   public static final double R = 0.999999;
   public static final int S = 140;
   public static final int T = 40;
   public static final int U = 3;
   private static final ImmutableList<jh.a> e = ImmutableList.of(jh.a.b, jh.a.a, jh.a.c);
   private static final ImmutableList<jh.a> r = ImmutableList.of(jh.a.b, jh.a.c, jh.a.a);
   private static final fin s = new fin(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double t = 0.014;
   private static final double u = 0.007;
   private static final double aM = 0.0023333333333333335;
   private static double aN = 1.0;
   private final bzv<?> aO;
   private boolean aP;
   private int aQ = c.incrementAndGet();
   public boolean V;
   private ImmutableList<bzm> aR = ImmutableList.of();
   protected int W;
   @Nullable
   private bzm aS;
   private dmu aT;
   public double X;
   public double Y;
   public double Z;
   private fis aU;
   private jb aV;
   private dlz aW;
   private fis aX = fis.c;
   private float aY;
   private float aZ;
   public float aa;
   public float ab;
   private fin ba = s;
   private boolean bb;
   public boolean ac;
   public boolean ad;
   public boolean ae;
   public boolean af;
   public boolean ag;
   protected fis ah = fis.c;
   @Nullable
   private bzm.e bc;
   public static final float ai = 0.6F;
   public static final float aj = 1.8F;
   public float ak;
   public float al;
   public double am;
   private float bd = 1.0F;
   public double an;
   public double ao;
   public double ap;
   public boolean aq;
   protected final bck ar = bck.a();
   public int as;
   private int be;
   protected boolean at;
   protected Object2DoubleMap<bae<fak>> au = new Object2DoubleArrayMap(2);
   protected boolean av;
   private final Set<bae<fak>> bf = new HashSet<>();
   public int aw;
   protected boolean ax = true;
   protected final all ay;
   protected static final alh<Byte> az = all.a(bzm.class, alj.a);
   protected static final int aA = 0;
   private static final int bg = 1;
   private static final int bh = 3;
   private static final int bi = 4;
   private static final int bj = 5;
   protected static final int aB = 6;
   protected static final int aC = 7;
   private static final alh<Integer> bk = all.a(bzm.class, alj.b);
   private static final alh<Optional<xo>> bl = all.a(bzm.class, alj.g);
   private static final alh<Boolean> bm = all.a(bzm.class, alj.k);
   private static final alh<Boolean> bn = all.a(bzm.class, alj.k);
   private static final alh<Boolean> bo = all.a(bzm.class, alj.k);
   protected static final alh<cay> aD = all.a(bzm.class, alj.w);
   private static final alh<Integer> bp = all.a(bzm.class, alj.b);
   private eih bq = eih.a;
   private final ajr br = new ajr();
   public boolean aE;
   @Nullable
   public cax aF;
   private int bs;
   private boolean bt;
   protected UUID aG = bcb.a(this.ar);
   protected String aH = this.aG.toString();
   private boolean bu;
   private final Set<String> bv = Sets.newHashSet();
   private final double[] bw = new double[]{0.0, 0.0, 0.0};
   private long bx;
   private bzp by;
   private float bz;
   public boolean aI;
   public boolean aJ;
   public Optional<jb> aK = Optional.empty();
   private boolean bA = false;
   private float bB;
   private int bC;
   private boolean bD;
   @Nullable
   private eeb bE = null;
   public static final int aL = 100;
   private final ArrayDeque<bzm.c> bF = new ArrayDeque<>(100);
   private final List<bzm.c> bG = new ObjectArrayList();
   private final LongSet bH = new LongOpenHashSet();
   private final cae.a bI = new cae.a();
   private dfd bJ = dfd.a;

   public bzm(bzv<?> $$0, dmu $$1) {
      this.aO = $$0;
      this.aT = $$1;
      this.by = $$0.n();
      this.aU = fis.c;
      this.aV = jb.c;
      this.aW = dlz.e;
      all.a $$2 = new all.a(this);
      $$2.a(az, (byte)0);
      $$2.a(bk, this.cv());
      $$2.a(bm, false);
      $$2.a(bl, Optional.empty());
      $$2.a(bn, false);
      $$2.a(bo, false);
      $$2.a(aD, cay.a);
      $$2.a(bp, 0);
      this.a($$2);
      this.ay = $$2.a();
      this.a_(0.0, 0.0, 0.0);
      this.bz = this.by.c();
   }

   public boolean a(jb $$0, eeb $$1) {
      fjm $$2 = $$1.b(this.ai(), $$0, fix.a(this)).a($$0);
      return fjj.c($$2, fjj.a(this.cV()), fiw.i);
   }

   public int m_() {
      fjz $$0 = this.cu();
      return $$0 != null && $$0.o().f() != null ? $$0.o().f() : 16777215;
   }

   public boolean am() {
      return false;
   }

   public final void an() {
      if (this.cd()) {
         this.bR();
      }

      if (this.cc()) {
         this.bS();
      }
   }

   public void e(double $$0, double $$1, double $$2) {
      this.br.e(new fis($$0, $$1, $$2));
   }

   public ajr ao() {
      return this.br;
   }

   public bzv<?> ap() {
      return this.aO;
   }

   public boolean aq() {
      return this.aP;
   }

   public void c(boolean $$0) {
      this.aP = $$0;
   }

   @Override
   public int ar() {
      return this.aQ;
   }

   public void e(int $$0) {
      this.aQ = $$0;
   }

   public Set<String> as() {
      return this.bv;
   }

   public boolean a(String $$0) {
      return this.bv.size() >= 1024 ? false : this.bv.add($$0);
   }

   public boolean b(String $$0) {
      return this.bv.remove($$0);
   }

   public void c(aub $$0) {
      this.a(bzm.e.a);
      this.c(ejb.p);
   }

   public final void at() {
      this.a(bzm.e.b);
   }

   protected abstract void a(all.a var1);

   public all au() {
      return this.ay;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof bzm ? ((bzm)$$0).aQ == this.aQ : false;
   }

   @Override
   public int hashCode() {
      return this.aQ;
   }

   public void a(bzm.e $$0) {
      this.c($$0);
   }

   public void av() {
   }

   public void b(bzm.e $$0) {
   }

   public void b(cay $$0) {
      this.ay.a(aD, $$0);
   }

   public cay aw() {
      return this.ay.a(aD);
   }

   public boolean c(cay $$0) {
      return this.aw() == $$0;
   }

   public boolean a(bzm $$0, double $$1) {
      return this.dv().a((jv)$$0.dv(), $$1);
   }

   public boolean a(bzm $$0, double $$1, double $$2) {
      double $$3 = $$0.dC() - this.dC();
      double $$4 = $$0.dE() - this.dE();
      double $$5 = $$0.dI() - this.dI();
      return bcb.e($$3, $$5) < bcb.k($$1) && bcb.k($$4) < bcb.k($$2);
   }

   protected void b(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w($$1 % 360.0F);
   }

   public final void b(fis $$0) {
      this.a_($$0.a(), $$0.b(), $$0.c());
   }

   public void a_(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.ax());
   }

   protected final fin ax() {
      return this.c(this.aU);
   }

   protected fin c(fis $$0) {
      return this.by.a($$0);
   }

   protected void ay() {
      this.a_(this.aU.d, this.aU.e, this.aU.f);
   }

   public void b(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.w(this.dR() + $$2);
      this.v(this.dP() + $$3);
      this.w(bcb.a(this.dR(), -90.0F, 90.0F));
      this.ab += $$2;
      this.aa += $$3;
      this.ab = bcb.a(this.ab, -90.0F, 90.0F);
      if (this.aS != null) {
         this.aS.l(this);
      }
   }

   public void g() {
      this.az();
   }

   public void az() {
      btt $$0 = bts.a();
      $$0.a("entityBaseTick");
      this.bE = null;
      if (this.cc() && this.dm().dU()) {
         this.bS();
      }

      if (this.W > 0) {
         this.W--;
      }

      this.bZ();
      if (this.by()) {
         this.bz();
      }

      this.aJ = this.aI;
      this.aI = false;
      this.bt();
      this.I();
      this.bs();
      if (this.ai() instanceof aub $$1) {
         if (this.be > 0) {
            if (this.bl()) {
               this.h(this.be - 4);
            } else {
               if (this.be % 20 == 0 && !this.bA()) {
                  this.a($$1, this.ea().d(), 1.0F);
               }

               this.h(this.be - 1);
            }
         }
      } else {
         this.aI();
      }

      if (this.bA()) {
         this.am *= 0.5;
      }

      this.aA();
      if (!this.ai().C) {
         this.d(this.be > 0);
      }

      this.ax = false;
      if (this.ai() instanceof aub $$2 && this instanceof cak) {
         cak.a_($$2, (bzm & cak)this);
      }

      $$0.c();
   }

   public void d(boolean $$0) {
      this.b(0, $$0 || this.bD);
   }

   public void aA() {
      if (this.dE() < this.ai().L_() - 64) {
         this.aJ();
      }
   }

   public void aB() {
      this.bs = this.ca();
   }

   public void f(int $$0) {
      this.bs = $$0;
   }

   public int aC() {
      return this.bs;
   }

   public boolean aD() {
      return this.bs > 0;
   }

   protected void M() {
      if (this.aD()) {
         this.bs--;
      }
   }

   public void aE() {
      if (!this.bl()) {
         this.e(15.0F);
      }
   }

   public void aF() {
      if (!this.bl()) {
         if (this.ai() instanceof aub $$0 && this.a($$0, this.ea().e(), 4.0F) && this.aG() && !this.be()) {
            $$0.a(null, this.dC(), this.dE(), this.dI(), ayz.kN, this.do(), 0.4F, 2.0F + this.ar.i() * 0.4F);
         }
      }
   }

   protected boolean aG() {
      return true;
   }

   public final void e(float $$0) {
      this.g(bcb.d($$0 * 20.0F));
   }

   public void g(int $$0) {
      if (this.be < $$0) {
         this.h($$0);
      }

      this.cx();
   }

   public void h(int $$0) {
      this.be = $$0;
   }

   public int aH() {
      return this.be;
   }

   public void aI() {
      this.h(0);
   }

   protected void aJ() {
      this.at();
   }

   public boolean f(double $$0, double $$1, double $$2) {
      return this.b(this.cV().d($$0, $$1, $$2));
   }

   private boolean b(fin $$0) {
      return this.ai().a(this, $$0) && !this.ai().d($$0);
   }

   public void e(boolean $$0) {
      this.bb = $$0;
      this.b($$0, null);
   }

   public void a(boolean $$0, fis $$1) {
      this.a($$0, this.ac, $$1);
   }

   public void a(boolean $$0, boolean $$1, fis $$2) {
      this.bb = $$0;
      this.ac = $$1;
      this.b($$0, $$2);
   }

   public boolean d(jb $$0) {
      return this.aK.isPresent() && this.aK.get().equals($$0);
   }

   protected void b(boolean $$0, @Nullable fis $$1) {
      if ($$0) {
         fin $$2 = this.cV();
         fin $$3 = new fin($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
         Optional<jb> $$4 = this.aT.h(this, $$3);
         if ($$4.isPresent() || this.bA) {
            this.aK = $$4;
         } else if ($$1 != null) {
            fin $$5 = $$3.d(-$$1.d, 0.0, -$$1.f);
            $$4 = this.aT.h(this, $$5);
            this.aK = $$4;
         }

         this.bA = $$4.isEmpty();
      } else {
         this.bA = false;
         if (this.aK.isPresent()) {
            this.aK = Optional.empty();
         }
      }
   }

   public boolean aK() {
      return this.bb;
   }

   public void a(caq $$0, fis $$1) {
      if (this.aq) {
         this.a_(this.dC() + $$1.d, this.dE() + $$1.e, this.dI() + $$1.f);
      } else {
         if ($$0 == caq.c) {
            $$1 = this.e($$1);
            if ($$1.equals(fis.c)) {
               return;
            }
         }

         btt $$2 = bts.a();
         $$2.a("move");
         if (this.ah.h() > 1.0E-7) {
            $$1 = $$1.h(this.ah);
            this.ah = fis.c;
            this.i(fis.c);
         }

         $$1 = this.a($$1, $$0);
         fis $$3 = this.a($$1);
         double $$4 = $$3.h();
         if ($$4 > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.am != 0.0 && $$4 >= 1.0) {
               fio $$5 = this.ai().a(new dmb(this.dv(), this.dv().e($$3), dmb.a.d, dmb.b.d, this));
               if ($$5.d() != fiq.a.a) {
                  this.j();
               }
            }

            fis $$6 = this.dv();
            fis $$7 = $$6.e($$3);
            this.a(new bzm.c($$6, $$7, true));
            this.b($$7);
         }

         $$2.c();
         $$2.a("rest");
         boolean $$8 = !bcb.b($$1.d, $$3.d);
         boolean $$9 = !bcb.b($$1.f, $$3.f);
         this.ac = $$8 || $$9;
         if (Math.abs($$1.e) > 0.0 || this.di()) {
            this.ad = $$1.e != $$3.e;
            this.ae = this.ad && $$1.e < 0.0;
            this.a(this.ae, this.ac, $$3);
         }

         if (this.ac) {
            this.af = this.d($$3);
         } else {
            this.af = false;
         }

         jb $$10 = this.aS();
         eeb $$11 = this.ai().a_($$10);
         if (this.di()) {
            this.a($$3.e, this.aK(), $$11, $$10);
         }

         if (this.dU()) {
            $$2.c();
         } else {
            if (this.ac) {
               fis $$12 = this.dA();
               this.n($$8 ? 0.0 : $$12.d, $$12.e, $$9 ? 0.0 : $$12.f);
            }

            if (this.dk()) {
               dpz $$13 = $$11.b();
               if ($$1.e != $$3.e) {
                  $$13.a(this.ai(), this);
               }
            }

            if (!this.ai().B_() || this.di()) {
               bzm.d $$14 = this.bj();
               if ($$14.a() && !this.cc()) {
                  this.a($$14, $$3, $$10, $$11);
               }
            }

            float $$15 = this.aW();
            this.i(this.dA().d($$15, 1.0, $$15));
            $$2.c();
         }
      }
   }

   private void a(bzm.d $$0, fis $$1, jb $$2, eeb $$3) {
      float $$4 = 0.6F;
      float $$5 = (float)($$1.g() * 0.6F);
      float $$6 = (float)($$1.i() * 0.6F);
      jb $$7 = this.aU();
      eeb $$8 = this.ai().a_($$7);
      boolean $$9 = this.c($$8);
      this.ak += $$9 ? $$5 : $$6;
      this.al += $$5;
      if (this.ak > this.bd && !$$8.l()) {
         boolean $$10 = $$7.equals($$2);
         boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
         if (!$$10) {
            $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
         }

         if ($$11) {
            this.bd = this.aX();
         } else if (this.bm()) {
            this.bd = this.aX();
            if ($$0.c()) {
               this.bb();
            }

            if ($$0.b()) {
               this.c(ejb.Q);
            }
         }
      } else if ($$8.l()) {
         this.aR();
      }
   }

   protected void aL() {
      this.bG.clear();
      this.bG.addAll(this.bF);
      this.bF.clear();
      if (this.bG.isEmpty()) {
         this.bG.add(new bzm.c(this.bF(), this.dv(), false));
      } else if (this.bG.getLast().b.g(this.dv()) > 9.9999994E-11F) {
         this.bG.add(new bzm.c(this.bG.getLast().b, this.dv(), false));
      }

      this.b(this.bG);
   }

   private void a(bzm.c $$0) {
      if (this.bF.size() >= 100) {
         bzm.c $$1 = this.bF.removeFirst();
         bzm.c $$2 = this.bF.removeFirst();
         bzm.c $$3 = new bzm.c($$1.a(), $$2.b(), false);
         this.bF.addFirst($$3);
      }

      this.bF.add($$0);
   }

   public void aM() {
      if (!this.bF.isEmpty()) {
         this.bF.removeLast();
      }
   }

   protected void aN() {
      this.bF.clear();
   }

   public void a(fis $$0, fis $$1) {
      this.b(List.of(new bzm.c($$0, $$1, false)));
   }

   private void b(List<bzm.c> $$0) {
      if (this.aO()) {
         if (this.aK()) {
            jb $$1 = this.aS();
            eeb $$2 = this.ai().a_($$1);
            $$2.b().a(this.ai(), $$1, $$2, this);
         }

         boolean $$3 = this.cb();
         boolean $$4 = this.dO();
         int $$5 = this.aH();
         this.a($$0, this.bI);
         this.bI.a(this);
         if (this.bn()) {
            this.aI();
         }

         if ($$3 && !this.cb() || $$4 && !this.dO()) {
            this.aP();
         }

         boolean $$6 = this.aH() > $$5;
         if (!this.aT.C && !this.cb() && !$$6) {
            this.h(-this.dp());
         }
      }
   }

   protected boolean aO() {
      return !this.dU() && !this.aq;
   }

   private boolean c(eeb $$0) {
      return $$0.a(azo.aV) || $$0.a(dqb.ry);
   }

   private boolean a(jb $$0, eeb $$1, boolean $$2, boolean $$3, fis $$4) {
      if ($$1.l()) {
         return false;
      } else {
         boolean $$5 = this.c($$1);
         if ((this.aK() || $$5 || this.cl() && $$4.e == 0.0 || this.ct()) && !this.cn()) {
            if ($$2) {
               this.c($$0, $$1);
            }

            if ($$3) {
               this.ai().a(ejb.P, this.dv(), ejb.a.a(this, $$1));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean d(fis $$0) {
      return false;
   }

   protected void aP() {
      if (!this.aT.B_()) {
         this.ai().a(null, this.dC(), this.dE(), this.dI(), ayz.kS, this.do(), 0.7F, 1.6F + (this.ar.i() - this.ar.i()) * 0.4F);
      }
   }

   public void aQ() {
      if (this.cb()) {
         this.aP();
      }

      this.aI();
   }

   protected void aR() {
      if (this.bd()) {
         this.bc();
         if (this.bj().b()) {
            this.c(ejb.x);
         }
      }
   }

   @Deprecated
   public jb aS() {
      return this.f(0.2F);
   }

   public jb aT() {
      return this.f(0.500001F);
   }

   public jb aU() {
      return this.f(1.0E-5F);
   }

   protected jb f(float $$0) {
      if (this.aK.isPresent()) {
         jb $$1 = this.aK.get();
         if (!($$0 > 1.0E-5F)) {
            return $$1;
         } else {
            eeb $$2 = this.ai().a_($$1);
            return (!($$0 <= 0.5) || !$$2.a(azo.R)) && !$$2.a(azo.H) && !($$2.b() instanceof dtb) ? $$1.h(bcb.a(this.aU.e - $$0)) : $$1;
         }
      } else {
         int $$3 = bcb.a(this.aU.d);
         int $$4 = bcb.a(this.aU.e - $$0);
         int $$5 = bcb.a(this.aU.f);
         return new jb($$3, $$4, $$5);
      }
   }

   protected float aV() {
      float $$0 = this.ai().a_(this.dx()).b().j();
      float $$1 = this.ai().a_(this.aT()).b().j();
      return $$0 == 1.0 ? $$1 : $$0;
   }

   protected float aW() {
      eeb $$0 = this.ai().a_(this.dx());
      float $$1 = $$0.b().i();
      if (!$$0.a(dqb.J) && !$$0.a(dqb.nK)) {
         return $$1 == 1.0 ? this.ai().a_(this.aT()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected fis a(fis $$0, caq $$1) {
      return $$0;
   }

   protected fis e(fis $$0) {
      if ($$0.h() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.ai().ae();
         if ($$1 != this.bx) {
            Arrays.fill(this.bw, 0.0);
            this.bx = $$1;
         }

         if ($$0.d != 0.0) {
            double $$2 = this.a(jh.a.a, $$0.d);
            return Math.abs($$2) <= 1.0E-5F ? fis.c : new fis($$2, 0.0, 0.0);
         } else if ($$0.e != 0.0) {
            double $$3 = this.a(jh.a.b, $$0.e);
            return Math.abs($$3) <= 1.0E-5F ? fis.c : new fis(0.0, $$3, 0.0);
         } else if ($$0.f != 0.0) {
            double $$4 = this.a(jh.a.c, $$0.f);
            return Math.abs($$4) <= 1.0E-5F ? fis.c : new fis(0.0, 0.0, $$4);
         } else {
            return fis.c;
         }
      }
   }

   private double a(jh.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = bcb.a($$1 + this.bw[$$2], -0.51, 0.51);
      $$1 = $$3 - this.bw[$$2];
      this.bw[$$2] = $$3;
      return $$1;
   }

   private fis a(fis $$0) {
      fin $$1 = this.cV();
      List<fjm> $$2 = this.ai().c(this, $$1.b($$0));
      fis $$3 = $$0.h() == 0.0 ? $$0 : a(this, $$0, $$1, this.ai(), $$2);
      boolean $$4 = $$0.d != $$3.d;
      boolean $$5 = $$0.e != $$3.e;
      boolean $$6 = $$0.f != $$3.f;
      boolean $$7 = $$5 && $$0.e < 0.0;
      if (this.dT() > 0.0F && ($$7 || this.aK()) && ($$4 || $$6)) {
         fin $$8 = $$7 ? $$1.d(0.0, $$3.e, 0.0) : $$1;
         fin $$9 = $$8.b($$0.d, this.dT(), $$0.f);
         if (!$$7) {
            $$9 = $$9.b(0.0, -1.0E-5F, 0.0);
         }

         List<fjm> $$10 = a(this, this.aT, $$2, $$9);
         float $$11 = (float)$$3.e;
         float[] $$12 = a($$8, $$10, this.dT(), $$11);

         for (float $$13 : $$12) {
            fis $$14 = a(new fis($$0.d, $$13, $$0.f), $$8, $$10);
            if ($$14.j() > $$3.j()) {
               double $$15 = $$1.b - $$8.b;
               return $$14.a(0.0, $$15, 0.0);
            }
         }
      }

      return $$3;
   }

   private static float[] a(fin $$0, List<fjm> $$1, float $$2, float $$3) {
      FloatSet $$4 = new FloatArraySet(4);

      for (fjm $$5 : $$1) {
         DoubleList $$6 = $$5.a(jh.a.b);
         DoubleListIterator var8 = $$6.iterator();

         while (var8.hasNext()) {
            double $$7 = (Double)var8.next();
            float $$8 = (float)($$7 - $$0.b);
            if (!($$8 < 0.0F) && $$8 != $$3) {
               if ($$8 > $$2) {
                  break;
               }

               $$4.add($$8);
            }
         }
      }

      float[] $$9 = $$4.toFloatArray();
      FloatArrays.unstableSort($$9);
      return $$9;
   }

   public static fis a(@Nullable bzm $$0, fis $$1, fin $$2, dmu $$3, List<fjm> $$4) {
      List<fjm> $$5 = a($$0, $$3, $$4, $$2.b($$1));
      return a($$1, $$2, $$5);
   }

   private static List<fjm> a(@Nullable bzm $$0, dmu $$1, List<fjm> $$2, fin $$3) {
      Builder<fjm> $$4 = ImmutableList.builderWithExpectedSize($$2.size() + 1);
      if (!$$2.isEmpty()) {
         $$4.addAll($$2);
      }

      eft $$5 = $$1.F_();
      boolean $$6 = $$0 != null && $$5.a($$0, $$3);
      if ($$6) {
         $$4.add($$5.c());
      }

      $$4.addAll($$1.e($$0, $$3));
      return $$4.build();
   }

   private static fis a(fis $$0, fin $$1, List<fjm> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         fis $$3 = fis.c;

         for (jh.a $$4 : k($$0)) {
            double $$5 = $$0.a($$4);
            if ($$5 != 0.0) {
               double $$6 = fjj.a($$4, $$1.c($$3), $$2, $$5);
               $$3 = $$3.a($$4, $$6);
            }
         }

         return $$3;
      }
   }

   private static Iterable<jh.a> k(fis $$0) {
      return Math.abs($$0.d) < Math.abs($$0.f) ? r : e;
   }

   protected float aX() {
      return (int)this.ak + 1;
   }

   protected ayy aY() {
      return ayz.kW;
   }

   protected ayy aZ() {
      return ayz.kV;
   }

   protected ayy ba() {
      return ayz.kV;
   }

   private void a(List<bzm.c> $$0, cae.a $$1) {
      if (this.aO()) {
         LongSet $$2 = this.bH;

         for (bzm.c $$3 : $$0) {
            fis $$4 = $$3.a;
            fis $$5 = $$3.b().d($$3.a());
            if ($$3.c && $$5.h() > 0.0) {
               for (jh.a $$6 : k($$5)) {
                  double $$7 = $$5.a($$6);
                  if ($$7 != 0.0) {
                     fis $$8 = $$4.a($$6.e(), $$7);
                     this.a($$4, $$8, $$1, $$2);
                     $$4 = $$8;
                  }
               }
            } else {
               this.a($$3.a(), $$3.b(), $$1, $$2);
            }
         }

         $$2.clear();
      }
   }

   private void a(fis $$0, fis $$1, cae.a $$2, LongSet $$3) {
      fin $$4 = this.c($$1).h(1.0E-5F);
      dly.a($$0, $$1, $$4, ($$4x, $$5) -> {
         if (!this.bO()) {
            return false;
         } else {
            eeb $$6 = this.ai().a_($$4x);
            if ($$6.l()) {
               this.a($$4x, false, false);
               return true;
            } else if (!$$3.add($$4x.a())) {
               return true;
            } else {
               fjm $$7 = $$6.a(this.ai(), $$4x, this);
               boolean $$8 = $$7 == fjj.b() || this.a($$0, $$1, $$7.a(new fis($$4x)).e());
               if ($$8) {
                  try {
                     $$2.a($$5);
                     $$6.a(this.ai(), $$4x, this, $$2);
                     this.a($$6);
                  } catch (Throwable var14) {
                     p $$10 = p.a(var14, "Colliding entity with block");
                     q $$11 = $$10.a("Block being collided with");
                     q.a($$11, this.ai(), $$4x, $$6);
                     q $$12 = $$10.a("Entity being checked for collision");
                     this.a($$12);
                     throw new aa($$10);
                  }
               }

               boolean $$13 = this.a($$6.y(), $$4x, $$0, $$1);
               if ($$13) {
                  $$2.a($$5);
                  $$6.y().a(this.ai(), $$4x, this, $$2);
               }

               this.a($$4x, $$8, $$13);
               return true;
            }
         }
      });
   }

   private void a(jb $$0, boolean $$1, boolean $$2) {
   }

   public boolean a(fal $$0, jb $$1, fis $$2, fis $$3) {
      fin $$4 = $$0.e(this.ai(), $$1);
      return $$4 != null && this.a($$2, $$3, List.of($$4));
   }

   public boolean a(fis $$0, fis $$1, List<fin> $$2) {
      fin $$3 = this.c($$0);
      fis $$4 = $$1.d($$0);
      return $$3.a($$4, $$2);
   }

   protected void a(eeb $$0) {
   }

   public jb a(aub $$0, jb $$1) {
      jb $$2 = $$0.ab();
      fis $$3 = $$2.b();
      int $$4 = $$0.m($$2).a(eka.a.f, $$2.u(), $$2.w()) + 1;
      return jb.a($$3.d, (double)$$4, $$3.f);
   }

   public void a(jl<ejb> $$0, @Nullable bzm $$1) {
      this.ai().a($$1, $$0, this.aU);
   }

   public void c(jl<ejb> $$0) {
      this.a($$0, this);
   }

   private void c(jb $$0, eeb $$1) {
      this.b($$0, $$1);
      if (this.d($$1)) {
         this.l();
      }
   }

   protected void bb() {
      bzm $$0 = Objects.requireNonNullElse(this.cY(), this);
      float $$1 = $$0 == this ? 0.35F : 0.4F;
      fis $$2 = $$0.dA();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      this.g($$3);
   }

   protected jb e(jb $$0) {
      jb $$1 = $$0.d();
      eeb $$2 = this.ai().a_($$1);
      return !$$2.a(azo.br) && !$$2.a(azo.bs) ? $$0 : $$1;
   }

   protected void a(eeb $$0, eeb $$1) {
      dxx $$2 = $$0.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
      this.b($$1);
   }

   protected void b(eeb $$0) {
      dxx $$1 = $$0.A();
      this.a($$1.d(), $$1.a() * 0.05F, $$1.b() * 0.8F);
   }

   protected void b(jb $$0, eeb $$1) {
      dxx $$2 = $$1.A();
      this.a($$2.d(), $$2.a() * 0.15F, $$2.b());
   }

   private boolean d(eeb $$0) {
      return $$0.a(azo.bq) && this.as >= this.bC + 20;
   }

   private void l() {
      this.bB = this.bB * (float)Math.pow(0.997, this.as - this.bC);
      this.bB = Math.min(1.0F, this.bB + 0.07F);
      float $$0 = 0.5F + this.bB * this.ar.i() * 1.2F;
      float $$1 = 0.1F + this.bB * 1.2F;
      this.a(ayz.E, $$1, $$0);
      this.bC = this.as;
   }

   protected void g(float $$0) {
      this.a(this.aY(), $$0, 1.0F + (this.ar.i() - this.ar.i()) * 0.4F);
   }

   protected void bc() {
   }

   protected boolean bd() {
      return false;
   }

   public void a(ayy $$0, float $$1, float $$2) {
      if (!this.be()) {
         this.ai().a(null, this.dC(), this.dE(), this.dI(), $$0, this.do(), $$1, $$2);
      }
   }

   public void a(ayy $$0) {
      if (!this.be()) {
         this.a($$0, 1.0F, 1.0F);
      }
   }

   public boolean be() {
      return this.ay.a(bn);
   }

   public void f(boolean $$0) {
      this.ay.a(bn, $$0);
   }

   public boolean bf() {
      return this.ay.a(bo);
   }

   public void g(boolean $$0) {
      this.ay.a(bo, $$0);
   }

   protected double bg() {
      return 0.0;
   }

   public final double bh() {
      return this.bf() ? 0.0 : this.bg();
   }

   protected void bi() {
      double $$0 = this.bh();
      if ($$0 != 0.0) {
         this.i(this.dA().b(0.0, -$$0, 0.0));
      }
   }

   protected bzm.d bj() {
      return bzm.d.d;
   }

   public boolean bk() {
      return false;
   }

   public final void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dq()) {
         this.b($$3, new fis($$0, $$1, $$2));
         jb $$4 = this.aS();
         eeb $$5 = this.ai().a_($$4);
         this.a($$1, $$3, $$5, $$4);
      }
   }

   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
      if (!this.bm() && $$0 < 0.0) {
         this.am -= (float)$$0;
      }

      if ($$1) {
         if (this.am > 0.0) {
            $$2.b().a(this.ai(), $$2, $$3, this, this.am);
            this.ai().a(ejb.A, this.aU, ejb.a.a(this, this.aK.<eeb>map($$0x -> this.ai().a_($$0x)).orElse($$2)));
         }

         this.j();
      }
   }

   public boolean bl() {
      return this.ap().d();
   }

   public boolean a(double $$0, float $$1, byb $$2) {
      if (this.aO.a(azs.o)) {
         return false;
      } else {
         this.b($$0, $$1, $$2);
         return false;
      }
   }

   protected void b(double $$0, float $$1, byb $$2) {
      if (this.cd()) {
         for (bzm $$3 : this.da()) {
            $$3.a($$0, $$1, $$2);
         }
      }
   }

   public boolean bm() {
      return this.at;
   }

   boolean bn() {
      jb $$0 = this.dx();
      return this.ai().r($$0) || this.ai().r(jb.a((double)$$0.u(), this.cV().e, (double)$$0.w()));
   }

   public boolean bo() {
      return this.bm() || this.bn();
   }

   public boolean bp() {
      return this.bm() || this.bA();
   }

   public boolean bq() {
      return this.av && this.bm();
   }

   public boolean br() {
      Optional<Integer> $$0 = this.aT.G_().t();
      if ($$0.isEmpty()) {
         return false;
      } else {
         int $$1 = $$0.get();
         if (this.dE() + this.dt() < $$1) {
            return false;
         } else {
            int $$2 = $$1 + 4;
            return this.dE() <= $$2;
         }
      }
   }

   public void bs() {
      if (this.cn()) {
         this.j(this.cm() && this.bm() && !this.cc());
      } else {
         this.j(this.cm() && this.bq() && !this.cc() && this.ai().b_(this.aV).a(azu.a));
      }
   }

   protected boolean bt() {
      this.au.clear();
      this.bu();
      double $$0 = this.ai().G_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(azu.b, $$0);
      return this.bm() || $$1;
   }

   void bu() {
      if (this.dm() instanceof cxe $$0 && !$$0.bq()) {
         this.at = false;
      } else if (this.a(azu.a, 0.014)) {
         if (!this.at && !this.ax) {
            this.bv();
         }

         this.j();
         this.at = true;
      } else {
         this.at = false;
      }
   }

   private void I() {
      this.av = this.a(azu.a);
      this.bf.clear();
      double $$0 = this.dG();
      if (!(this.dm() instanceof cxe $$2 && !$$2.bq() && $$2.cV().e >= $$0 && $$2.cV().b <= $$0)) {
         jb $$3 = jb.a(this.dC(), $$0, this.dI());
         fal $$4 = this.ai().b_($$3);
         double $$5 = $$3.v() + $$4.a(this.ai(), $$3);
         if ($$5 > $$0) {
            $$4.k().forEach(this.bf::add);
         }
      }
   }

   protected void bv() {
      bzm $$0 = Objects.requireNonNullElse(this.cY(), this);
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      fis $$2 = $$0.dA();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.d * $$2.d * 0.2F + $$2.e * $$2.e + $$2.f * $$2.f * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aZ(), $$3, 1.0F + (this.ar.i() - this.ar.i()) * 0.4F);
      } else {
         this.a(this.ba(), $$3, 1.0F + (this.ar.i() - this.ar.i()) * 0.4F);
      }

      float $$4 = bcb.a(this.dE());

      for (int $$5 = 0; $$5 < 1.0F + this.by.a() * 20.0F; $$5++) {
         double $$6 = (this.ar.j() * 2.0 - 1.0) * this.by.a();
         double $$7 = (this.ar.j() * 2.0 - 1.0) * this.by.a();
         this.ai().a(me.d, this.dC() + $$6, $$4 + 1.0F, this.dI() + $$7, $$2.d, $$2.e - this.ar.j() * 0.2F, $$2.f);
      }

      for (int $$8 = 0; $$8 < 1.0F + this.by.a() * 20.0F; $$8++) {
         double $$9 = (this.ar.j() * 2.0 - 1.0) * this.by.a();
         double $$10 = (this.ar.j() * 2.0 - 1.0) * this.by.a();
         this.ai().a(me.ap, this.dC() + $$9, $$4 + 1.0F, this.dI() + $$10, $$2.d, $$2.e, $$2.f);
      }

      this.c(ejb.O);
   }

   @Deprecated
   protected eeb bw() {
      return this.ai().a_(this.aS());
   }

   public eeb bx() {
      return this.ai().a_(this.aU());
   }

   public boolean by() {
      return this.cm() && !this.bm() && !this.am() && !this.cl() && !this.bA() && this.bO();
   }

   protected void bz() {
      jb $$0 = this.aS();
      eeb $$1 = this.ai().a_($$0);
      if ($$1.o() != dwn.a) {
         fis $$2 = this.dA();
         jb $$3 = this.dx();
         double $$4 = this.dC() + (this.ar.j() - 0.5) * this.by.a();
         double $$5 = this.dI() + (this.ar.j() - 0.5) * this.by.a();
         if ($$3.u() != $$0.u()) {
            $$4 = bcb.a($$4, (double)$$0.u(), $$0.u() + 1.0);
         }

         if ($$3.w() != $$0.w()) {
            $$5 = bcb.a($$5, (double)$$0.w(), $$0.w() + 1.0);
         }

         this.ai().a(new lw(me.b, $$1), $$4, this.dE() + 0.1, $$5, $$2.d * -4.0, 1.5, $$2.f * -4.0);
      }
   }

   public boolean a(bae<fak> $$0) {
      return this.bf.contains($$0);
   }

   public boolean bA() {
      return !this.ax && this.au.getDouble(azu.b) > 0.0;
   }

   public void a(float $$0, fis $$1) {
      fis $$2 = a($$1, $$0, this.dP());
      this.i(this.dA().e($$2));
   }

   protected static fis a(fis $$0, float $$1, float $$2) {
      double $$3 = $$0.h();
      if ($$3 < 1.0E-7) {
         return fis.c;
      } else {
         fis $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
         float $$5 = bcb.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = bcb.b($$2 * (float) (Math.PI / 180.0));
         return new fis($$4.d * $$6 - $$4.f * $$5, $$4.e, $$4.f * $$6 + $$4.d * $$5);
      }
   }

   @Deprecated
   public float bB() {
      return this.ai().f(this.dB(), this.dH()) ? this.ai().z(jb.a(this.dC(), this.dG(), this.dI())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.g($$0, $$1, $$2);
      this.c($$3, $$4);
   }

   public void c(float $$0, float $$1) {
      this.v($$0 % 360.0F);
      this.w(bcb.a($$1, -90.0F, 90.0F) % 360.0F);
      this.aa = this.dP();
      this.ab = this.dR();
   }

   public void g(double $$0, double $$1, double $$2) {
      double $$3 = bcb.a($$0, -3.0E7, 3.0E7);
      double $$4 = bcb.a($$2, -3.0E7, 3.0E7);
      this.X = $$3;
      this.Y = $$1;
      this.Z = $$4;
      this.a_($$3, $$1, $$4);
   }

   public void f(fis $$0) {
      this.d($$0.d, $$0.e, $$0.f);
   }

   public void d(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dP(), this.dR());
   }

   public void a(jb $$0, float $$1, float $$2) {
      this.b($$0.c(), $$1, $$2);
   }

   public void b(fis $$0, float $$1, float $$2) {
      this.b($$0.d, $$0.e, $$0.f, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.v($$3);
      this.w($$4);
      this.bC();
      this.ay();
   }

   public final void bC() {
      this.bD();
      this.bE();
   }

   public final void c(fis $$0, float $$1, float $$2) {
      this.l($$0);
      this.f($$1, $$2);
   }

   protected void bD() {
      this.l(this.aU);
   }

   public void bE() {
      this.f(this.dP(), this.dR());
   }

   private void l(fis $$0) {
      this.X = this.an = $$0.d;
      this.Y = this.ao = $$0.e;
      this.Z = this.ap = $$0.f;
   }

   private void f(float $$0, float $$1) {
      this.aa = $$0;
      this.ab = $$1;
   }

   public final fis bF() {
      return new fis(this.an, this.ao, this.ap);
   }

   public float f(bzm $$0) {
      float $$1 = (float)(this.dC() - $$0.dC());
      float $$2 = (float)(this.dE() - $$0.dE());
      float $$3 = (float)(this.dI() - $$0.dI());
      return bcb.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double h(double $$0, double $$1, double $$2) {
      double $$3 = this.dC() - $$0;
      double $$4 = this.dE() - $$1;
      double $$5 = this.dI() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double g(bzm $$0) {
      return this.g($$0.dv());
   }

   public double g(fis $$0) {
      double $$1 = this.dC() - $$0.d;
      double $$2 = this.dE() - $$0.e;
      double $$3 = this.dI() - $$0.f;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void a_(cut $$0) {
   }

   public void h(bzm $$0) {
      if (!this.A($$0)) {
         if (!$$0.aq && !this.aq) {
            double $$1 = $$0.dC() - this.dC();
            double $$2 = $$0.dI() - this.dI();
            double $$3 = bcb.a($$1, $$2);
            if ($$3 >= 0.01F) {
               $$3 = Math.sqrt($$3);
               $$1 /= $$3;
               $$2 /= $$3;
               double $$4 = 1.0 / $$3;
               if ($$4 > 1.0) {
                  $$4 = 1.0;
               }

               $$1 *= $$4;
               $$2 *= $$4;
               $$1 *= 0.05F;
               $$2 *= 0.05F;
               if (!this.cd() && this.bL()) {
                  this.i(-$$1, 0.0, -$$2);
               }

               if (!$$0.cd() && $$0.bL()) {
                  $$0.i($$1, 0.0, $$2);
               }
            }
         }
      }
   }

   public void h(fis $$0) {
      this.i($$0.d, $$0.e, $$0.f);
   }

   public void i(double $$0, double $$1, double $$2) {
      this.i(this.dA().b($$0, $$1, $$2));
      this.aE = true;
   }

   protected void bG() {
      this.ag = true;
   }

   @Deprecated
   public final void a(byb $$0, float $$1) {
      if (this.aT instanceof aub $$2) {
         this.a($$2, $$0, $$1);
      }
   }

   @Deprecated
   public final boolean b(byb $$0, float $$1) {
      return this.aT instanceof aub $$2 ? this.a($$2, $$0, $$1) : this.b($$0);
   }

   public abstract boolean a(aub var1, byb var2, float var3);

   public boolean b(byb $$0) {
      return false;
   }

   public final fis h(float $$0) {
      return this.d(this.i($$0), this.j($$0));
   }

   public jh bH() {
      return jh.a(this.h(1.0F));
   }

   public float i(float $$0) {
      return this.k($$0);
   }

   public float j(float $$0) {
      return this.l($$0);
   }

   public float k(float $$0) {
      return $$0 == 1.0F ? this.dR() : bcb.h($$0, this.ab, this.dR());
   }

   public float l(float $$0) {
      return $$0 == 1.0F ? this.dP() : bcb.i($$0, this.aa, this.dP());
   }

   public final fis d(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = bcb.b($$3);
      float $$5 = bcb.a($$3);
      float $$6 = bcb.b($$2);
      float $$7 = bcb.a($$2);
      return new fis($$5 * $$6, -$$7, $$4 * $$6);
   }

   public final fis m(float $$0) {
      return this.e(this.i($$0), this.j($$0));
   }

   protected final fis e(float $$0, float $$1) {
      return this.d($$0 - 90.0F, $$1);
   }

   public final fis bI() {
      return new fis(this.dC(), this.dG(), this.dI());
   }

   public final fis n(float $$0) {
      double $$1 = bcb.d((double)$$0, this.X, this.dC());
      double $$2 = bcb.d((double)$$0, this.Y, this.dE()) + this.cW();
      double $$3 = bcb.d((double)$$0, this.Z, this.dI());
      return new fis($$1, $$2, $$3);
   }

   public fis o(float $$0) {
      return this.n($$0);
   }

   public final fis p(float $$0) {
      double $$1 = bcb.d((double)$$0, this.X, this.dC());
      double $$2 = bcb.d((double)$$0, this.Y, this.dE());
      double $$3 = bcb.d((double)$$0, this.Z, this.dI());
      return new fis($$1, $$2, $$3);
   }

   public fiq a(double $$0, float $$1, boolean $$2) {
      fis $$3 = this.n($$1);
      fis $$4 = this.h($$1);
      fis $$5 = $$3.b($$4.d * $$0, $$4.e * $$0, $$4.f * $$0);
      return this.ai().a(new dmb($$3, $$5, dmb.a.b, $$2 ? dmb.b.c : dmb.b.a, this));
   }

   public boolean bJ() {
      return this.bO() && this.bK();
   }

   public boolean bK() {
      return false;
   }

   public boolean bL() {
      return false;
   }

   public void a(bzm $$0, byb $$1) {
      if ($$0 instanceof auc) {
         aq.d.a((auc)$$0, this, $$1);
      }
   }

   public boolean j(double $$0, double $$1, double $$2) {
      double $$3 = this.dC() - $$0;
      double $$4 = this.dE() - $$1;
      double $$5 = this.dI() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cV().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * aN;
      return $$0 < $$1 * $$1;
   }

   public boolean b(fdc $$0) {
      if (this.bc != null && !this.bc.b()) {
         return false;
      } else {
         String $$1 = this.bN();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.d($$0);
            return true;
         }
      }
   }

   public boolean c(fdc $$0) {
      return this.cc() ? false : this.b($$0);
   }

   public void d(fdc $$0) {
      try {
         if (this.aS != null) {
            $$0.a("Pos", fis.a, new fis(this.aS.dC(), this.dE(), this.aS.dI()));
         } else {
            $$0.a("Pos", fis.a, this.dv());
         }

         $$0.a("Motion", fis.a, this.dA());
         $$0.a("Rotation", fir.i, new fir(this.dP(), this.dR()));
         $$0.a("fall_distance", this.am);
         $$0.a("Fire", (short)this.be);
         $$0.a("Air", (short)this.cw());
         $$0.a("OnGround", this.aK());
         $$0.a("Invulnerable", this.bt);
         $$0.a("PortalCooldown", this.bs);
         $$0.a("UUID", kf.a, this.cK());
         $$0.b("CustomName", xq.a, this.al());
         if (this.cP()) {
            $$0.a("CustomNameVisible", this.cP());
         }

         if (this.be()) {
            $$0.a("Silent", this.be());
         }

         if (this.bf()) {
            $$0.a("NoGravity", this.bf());
         }

         if (this.bu) {
            $$0.a("Glowing", true);
         }

         int $$1 = this.cy();
         if ($$1 > 0) {
            $$0.a("TicksFrozen", this.cy());
         }

         if (this.bD) {
            $$0.a("HasVisualFire", this.bD);
         }

         if (!this.bv.isEmpty()) {
            $$0.a("Tags", d, List.copyOf(this.bv));
         }

         if (!this.bJ.c()) {
            $$0.a("data", dfd.b, this.bJ);
         }

         this.a($$0);
         if (this.cd()) {
            fdc.b $$2 = $$0.b("Passengers");

            for (bzm $$3 : this.da()) {
               fdc $$4 = $$2.a();
               if (!$$3.b($$4)) {
                  $$2.b();
               }
            }

            if ($$2.c()) {
               $$0.c("Passengers");
            }
         }
      } catch (Throwable var7) {
         p $$6 = p.a(var7, "Saving entity NBT");
         q $$7 = $$6.a("Entity being saved");
         this.a($$7);
         throw new aa($$6);
      }
   }

   public void e(fda $$0) {
      try {
         fis $$1 = $$0.<fis>a("Pos", fis.a).orElse(fis.c);
         fis $$2 = $$0.<fis>a("Motion", fis.a).orElse(fis.c);
         fir $$3 = $$0.<fir>a("Rotation", fir.i).orElse(fir.a);
         this.n(Math.abs($$2.d) > 10.0 ? 0.0 : $$2.d, Math.abs($$2.e) > 10.0 ? 0.0 : $$2.e, Math.abs($$2.f) > 10.0 ? 0.0 : $$2.f);
         this.aE = true;
         double $$4 = 3.0000512E7;
         this.o(bcb.a($$1.d, -3.0000512E7, 3.0000512E7), bcb.a($$1.e, -2.0E7, 2.0E7), bcb.a($$1.f, -3.0000512E7, 3.0000512E7));
         this.v($$3.j);
         this.w($$3.k);
         this.bC();
         this.r(this.dP());
         this.s(this.dP());
         this.am = $$0.a("fall_distance", 0.0);
         this.be = $$0.a("Fire", (short)0);
         this.j($$0.a("Air", this.cv()));
         this.bb = $$0.a("OnGround", false);
         this.bt = $$0.a("Invulnerable", false);
         this.bs = $$0.a("PortalCooldown", 0);
         $$0.<UUID>a("UUID", kf.a).ifPresent($$0x -> {
            this.aG = $$0x;
            this.aH = this.aG.toString();
         });
         if (!Double.isFinite(this.dC()) || !Double.isFinite(this.dE()) || !Double.isFinite(this.dI())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite(this.dP()) && Double.isFinite(this.dR())) {
            this.ay();
            this.b(this.dP(), this.dR());
            this.b($$0.<xo>a("CustomName", xq.a).orElse(null));
            this.p($$0.a("CustomNameVisible", false));
            this.f($$0.a("Silent", false));
            this.g($$0.a("NoGravity", false));
            this.k($$0.a("Glowing", false));
            this.k($$0.a("TicksFrozen", 0));
            this.bD = $$0.a("HasVisualFire", false);
            this.bJ = $$0.<dfd>a("data", dfd.b).orElse(dfd.a);
            this.bv.clear();
            $$0.<Collection<? extends E>>a("Tags", d).ifPresent(this.bv::addAll);
            this.a($$0);
            if (this.bM()) {
               this.ay();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var7) {
         p $$6 = p.a(var7, "Loading entity NBT");
         q $$7 = $$6.a("Entity being loaded");
         this.a($$7);
         throw new aa($$6);
      }
   }

   protected boolean bM() {
      return true;
   }

   @Nullable
   protected final String bN() {
      bzv<?> $$0 = this.ap();
      ame $$1 = bzv.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(fda var1);

   protected abstract void a(fdc var1);

   @Nullable
   public cqz a(aub $$0, dmt $$1) {
      return this.a($$0, $$1, 0);
   }

   @Nullable
   public cqz a(aub $$0, dmt $$1, int $$2) {
      return this.a($$0, new dcv($$1), (float)$$2);
   }

   @Nullable
   public cqz a(aub $$0, dcv $$1) {
      return this.a($$0, $$1, 0.0F);
   }

   @Nullable
   public cqz a(aub $$0, dcv $$1, fis $$2) {
      if ($$1.f()) {
         return null;
      } else {
         cqz $$3 = new cqz($$0, this.dC() + $$2.d, this.dE() + $$2.e, this.dI() + $$2.f, $$1);
         $$3.i();
         $$0.b($$3);
         return $$3;
      }
   }

   @Nullable
   public cqz a(aub $$0, dcv $$1, float $$2) {
      return this.a($$0, $$1, new fis(0.0, $$2, 0.0));
   }

   public boolean bO() {
      return !this.dU();
   }

   public boolean bP() {
      if (this.aq) {
         return false;
      } else {
         float $$0 = this.by.a() * 0.8F;
         fin $$1 = fin.a(this.bI(), $$0, 1.0E-6, $$0);
         return jb.b($$1).anyMatch($$1x -> {
            eeb $$2 = this.ai().a_($$1x);
            return !$$2.l() && $$2.j(this.ai(), $$1x) && fjj.c($$2.g(this.ai(), $$1x).a($$1x), fjj.a($$1), fiw.i);
         });
      }
   }

   public bxj a(cut $$0, bxi $$1) {
      if (!this.ai().C && $$0.gh() && this instanceof cak $$2 && $$2.v() && this.bO() && !(this instanceof cam $$3 && $$3.g_())) {
         List<cak> $$4 = cak.a(this, $$1x -> $$1x.aj_() == $$0);
         if (!$$4.isEmpty()) {
            boolean $$5 = false;

            for (cak $$6 : $$4) {
               if ($$6.b_(this)) {
                  $$6.a_(this, true);
                  $$5 = true;
               }
            }

            if ($$5) {
               this.ai().a(ejb.u, this.dx(), ejb.a.a($$0));
               this.a(ayz.pb);
               return bxj.b.b();
            }
         }
      }

      dcv $$7 = $$0.b($$1);
      if ($$7.a(dcz.tu) && this.d($$0)) {
         $$7.a(1, $$0, $$1);
         return bxj.a;
      } else if (this instanceof cao $$8 && $$7.a(dcz.tu) && $$8.a($$0) && !$$0.gh() && this.a($$0, $$1, $$7, $$8)) {
         return bxj.a;
      } else {
         if (this.bO() && this instanceof cak $$9) {
            if ($$9.aj_() == $$0) {
               if (!this.ai().B_()) {
                  if ($$0.gc()) {
                     $$9.x();
                  } else {
                     $$9.S_();
                  }

                  this.a(ejb.r, $$0);
                  this.a(ayz.pa);
               }

               return bxj.a.b();
            }

            dcv $$10 = $$0.b($$1);
            if ($$10.a(dcz.wn) && !($$9.aj_() instanceof cut)) {
               if (!this.ai().B_() && $$9.b_($$0)) {
                  if ($$9.R_()) {
                     $$9.S_();
                  }

                  $$9.a_($$0, true);
                  this.a(ayz.pb);
                  $$10.h(1);
               }

               return bxj.a;
            }
         }

         return bxj.e;
      }
   }

   public boolean d(@Nullable cut $$0) {
      boolean $$1 = this.e($$0);
      if ($$1 && this.ai() instanceof aub $$2) {
         $$2.a(null, this.dx(), ayz.xR, $$0 != null ? $$0.do() : this.do());
      }

      return $$1;
   }

   public boolean e(@Nullable cut $$0) {
      List<cak> $$1 = cak.c_(this);
      boolean $$2 = !$$1.isEmpty();
      if (this instanceof cak $$3 && $$3.R_()) {
         $$3.S_();
         $$2 = true;
      }

      for (cak $$4 : $$1) {
         $$4.S_();
      }

      if ($$2) {
         this.a(ejb.M, $$0);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(cut $$0, bxi $$1, dcv $$2, cao $$3) {
      for (bzw $$4 : bzw.j) {
         dcv $$5 = $$3.a($$4);
         dle $$6 = $$5.a(kq.D);
         if ($$6 != null && $$6.k() && (!djk.a($$5, djj.E) || $$0.gI())) {
            $$2.a(1, $$0, cam.d($$1));
            fis $$7 = this.by.d().a(bzn.a);
            $$3.b($$4, dcv.l);
            this.a(ejb.M, $$0);
            this.a($$6.l().a());
            if (this.ai() instanceof aub $$8) {
               this.a($$8, $$5, $$7);
               aq.U.a((auc)$$0, $$5, $$3);
            }

            return true;
         }
      }

      return false;
   }

   public boolean i(bzm $$0) {
      return $$0.j(this) && !this.A($$0);
   }

   public boolean j(@Nullable bzm $$0) {
      return false;
   }

   public void r() {
      this.i(fis.c);
      this.g();
      if (this.cc()) {
         this.dm().k(this);
      }
   }

   public final void k(bzm $$0) {
      if (this.z($$0)) {
         this.a($$0, bzm::a_);
      }
   }

   protected void a(bzm $$0, bzm.b $$1) {
      fis $$2 = this.n($$0);
      fis $$3 = $$0.m(this);
      $$1.accept($$0, $$2.d - $$3.d, $$2.e - $$3.e, $$2.f - $$3.f);
   }

   public void l(bzm $$0) {
   }

   public fis m(bzm $$0) {
      return this.du().b(bzn.b, 0, this.aY);
   }

   public fis n(bzm $$0) {
      return this.dv().e(this.a($$0, this.by, 1.0F));
   }

   protected fis a(bzm $$0, bzp $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   protected static fis a(bzm $$0, bzm $$1, bzo $$2) {
      int $$3 = $$0.da().indexOf($$1);
      return $$2.c(bzn.a, $$3, $$0.aY);
   }

   public boolean o(bzm $$0) {
      return this.a($$0, false);
   }

   public boolean bQ() {
      return this instanceof cam;
   }

   public boolean a(bzm $$0, boolean $$1) {
      if ($$0 == this.aS) {
         return false;
      } else if (!$$0.bT()) {
         return false;
      } else if (!this.ai().B_() && !$$0.aO.b()) {
         return false;
      } else {
         for (bzm $$2 = $$0; $$2.aS != null; $$2 = $$2.aS) {
            if ($$2.aS == this) {
               return false;
            }
         }

         if ($$1 || this.p($$0) && $$0.s(this)) {
            if (this.cc()) {
               this.bS();
            }

            this.b(cay.a);
            this.aS = $$0;
            this.aS.q(this);
            $$0.K().filter($$0x -> $$0x instanceof auc).forEach($$0x -> aq.V.a((auc)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean p(bzm $$0) {
      return !this.cg() && this.W <= 0;
   }

   public void bR() {
      for (int $$0 = this.aR.size() - 1; $$0 >= 0; $$0--) {
         ((bzm)this.aR.get($$0)).bS();
      }
   }

   public void ab() {
      if (this.aS != null) {
         bzm $$0 = this.aS;
         this.aS = null;
         $$0.r(this);
      }
   }

   public void bS() {
      this.ab();
   }

   protected void q(bzm $$0) {
      if ($$0.dm() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.aR.isEmpty()) {
            this.aR = ImmutableList.of($$0);
         } else {
            List<bzm> $$1 = Lists.newArrayList(this.aR);
            if (!this.ai().C && $$0 instanceof cut && !(this.db() instanceof cut)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.aR = ImmutableList.copyOf($$1);
         }

         this.a(ejb.s, $$0);
      }
   }

   protected void r(bzm $$0) {
      if ($$0.dm() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.aR.size() == 1 && this.aR.get(0) == $$0) {
            this.aR = ImmutableList.of();
         } else {
            this.aR = this.aR.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.W = 60;
         this.a(ejb.q, $$0);
      }
   }

   protected boolean s(bzm $$0) {
      return this.aR.isEmpty();
   }

   protected boolean bT() {
      return true;
   }

   public final boolean bU() {
      return this.l_() != null && this.l_().d();
   }

   public final void d(fis $$0, float $$1, float $$2) {
      cah $$3 = this.l_();
      if ($$3 != null) {
         $$3.a($$0, $$1, $$2);
      } else {
         this.b($$0);
         this.b($$1, $$2);
      }
   }

   @Nullable
   public cah l_() {
      return null;
   }

   public void a(float $$0, int $$1) {
      this.r($$0);
   }

   public float bV() {
      return 0.0F;
   }

   public fis bW() {
      return this.d(this.dR(), this.dP());
   }

   public fis a(dcr $$0) {
      if (!(this instanceof cut $$1)) {
         return fis.c;
      } else {
         boolean $$2 = $$1.fi().a($$0) && !$$1.fh().a($$0);
         cad $$3 = $$2 ? $$1.fF().e() : $$1.fF();
         return this.d(0.0F, this.dP() + ($$3 == cad.b ? 80 : -80)).c(0.5);
      }
   }

   public fir bX() {
      return new fir(this.dR(), this.dP());
   }

   public fis bY() {
      return fis.a(this.bX());
   }

   public void a(dvz $$0, jb $$1) {
      if (this.aD()) {
         this.aB();
      } else {
         if (this.aF == null || !this.aF.a($$0)) {
            this.aF = new cax($$0, $$1.j());
         } else if (!this.aF.e()) {
            this.aF.a($$1.j());
            this.aF.a(true);
         }
      }
   }

   protected void bZ() {
      if (this.ai() instanceof aub $$0) {
         this.M();
         if (this.aF != null) {
            if (this.aF.a($$0, this, this.o(false))) {
               btt $$2 = bts.a();
               $$2.a("portal");
               this.aB();
               fbl $$3 = this.aF.a($$0, this);
               if ($$3 != null) {
                  aub $$4 = $$3.b();
                  if ($$0.q().a((dmu)$$4) && ($$4.aj() == $$0.aj() || this.a($$0, $$4))) {
                     this.b($$3);
                  }
               }

               $$2.c();
            } else if (this.aF.b()) {
               this.aF = null;
            }
         }
      }
   }

   public int ca() {
      bzm $$0 = this.db();
      return $$0 instanceof auc ? $$0.ca() : 300;
   }

   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void c(byb $$0) {
   }

   public void b(byte $$0) {
      switch ($$0) {
         case 53:
            dtz.a(this);
      }
   }

   public void q(float $$0) {
   }

   public boolean cb() {
      boolean $$0 = this.ai() != null && this.ai().C;
      return !this.bl() && (this.be > 0 || $$0 && this.i(0));
   }

   public boolean cc() {
      return this.dm() != null;
   }

   public boolean cd() {
      return !this.aR.isEmpty();
   }

   public boolean ce() {
      return this.ap().a(azs.p);
   }

   public boolean cf() {
      return !this.ap().a(azs.q);
   }

   public void h(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean cg() {
      return this.i(1);
   }

   public boolean ch() {
      return this.cg();
   }

   public boolean ci() {
      return this.cg();
   }

   public boolean cj() {
      return this.cg();
   }

   public boolean ck() {
      return this.cg();
   }

   public boolean cl() {
      return this.c(cay.f);
   }

   public boolean cm() {
      return this.i(3);
   }

   public void i(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean cn() {
      return this.i(4);
   }

   public boolean co() {
      return this.c(cay.d);
   }

   public boolean cp() {
      return this.co() && !this.bm();
   }

   public void j(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean cq() {
      return this.bu;
   }

   public final void k(boolean $$0) {
      this.bu = $$0;
      this.b(6, this.cr());
   }

   public boolean cr() {
      return this.ai().B_() ? this.i(6) : this.bu;
   }

   public boolean cs() {
      return this.i(5);
   }

   public boolean f(cut $$0) {
      if ($$0.am()) {
         return false;
      } else {
         fjz $$1 = this.cu();
         return $$1 != null && $$0 != null && $$0.cu() == $$1 && $$1.j() ? false : this.cs();
      }
   }

   public boolean ct() {
      return false;
   }

   public void a(BiConsumer<eiy<?>, aub> $$0) {
   }

   @Nullable
   public fjs cu() {
      return this.ai().S().e(this.cM());
   }

   public final boolean t(@Nullable bzm $$0) {
      return $$0 == null ? false : this == $$0 || this.u($$0) || $$0.u(this);
   }

   protected boolean u(bzm $$0) {
      return this.a($$0.cu());
   }

   public boolean a(@Nullable fjz $$0) {
      return this.cu() != null ? this.cu().a($$0) : false;
   }

   public void l(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean i(int $$0) {
      return (this.ay.a(az) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.ay.a(az);
      if ($$1) {
         this.ay.a(az, (byte)($$2 | 1 << $$0));
      } else {
         this.ay.a(az, (byte)($$2 & ~(1 << $$0)));
      }
   }

   public int cv() {
      return 300;
   }

   public int cw() {
      return this.ay.a(bk);
   }

   public void j(int $$0) {
      this.ay.a(bk, $$0);
   }

   public void cx() {
      this.k(0);
   }

   public int cy() {
      return this.ay.a(bp);
   }

   public void k(int $$0) {
      this.ay.a(bp, $$0);
   }

   public float cz() {
      int $$0 = this.cB();
      return (float)Math.min(this.cy(), $$0) / $$0;
   }

   public boolean cA() {
      return this.cy() >= this.cB();
   }

   public int cB() {
      return 140;
   }

   public void a(aub $$0, cal $$1) {
      this.h(this.be + 1);
      if (this.be == 0) {
         this.e(8.0F);
      }

      this.a($$0, this.ea().c(), 5.0F);
   }

   public void a(boolean $$0, jb $$1) {
      a(this, $$0, $$1);
   }

   protected static void a(bzm $$0, boolean $$1, jb $$2) {
      fis $$3 = $$0.dA();
      double $$4;
      if ($$1) {
         $$4 = Math.max(-0.9, $$3.e - 0.03);
      } else {
         $$4 = Math.min(1.8, $$3.e + 0.1);
      }

      $$0.n($$3.d, $$4, $$3.f);
      a($$0.aT, $$2);
   }

   protected static void a(dmu $$0, jb $$1) {
      if ($$0 instanceof aub $$2) {
         for (int $$3 = 0; $$3 < 2; $$3++) {
            $$2.a(me.ap, $$1.u() + $$0.A.j(), $$1.v() + 1, $$1.w() + $$0.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            $$2.a(me.d, $$1.u() + $$0.A.j(), $$1.v() + 1, $$1.w() + $$0.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
         }
      }
   }

   public void m(boolean $$0) {
      b(this, $$0);
   }

   protected static void b(bzm $$0, boolean $$1) {
      fis $$2 = $$0.dA();
      double $$3;
      if ($$1) {
         $$3 = Math.max(-0.3, $$2.e - 0.03);
      } else {
         $$3 = Math.min(0.7, $$2.e + 0.06);
      }

      $$0.n($$2.d, $$3, $$2.f);
      $$0.j();
   }

   public boolean a(aub $$0, cam $$1) {
      return true;
   }

   public void cC() {
      if (this.dA().b() > -0.5 && this.am > 1.0) {
         this.am = 1.0;
      }
   }

   public void j() {
      this.am = 0.0;
   }

   protected void l(double $$0, double $$1, double $$2) {
      jb $$3 = jb.a($$0, $$1, $$2);
      fis $$4 = new fis($$0 - $$3.u(), $$1 - $$3.v(), $$2 - $$3.w());
      jb.a $$5 = new jb.a();
      jh $$6 = jh.b;
      double $$7 = Double.MAX_VALUE;

      for (jh $$8 : new jh[]{jh.c, jh.d, jh.e, jh.f, jh.b}) {
         $$5.a($$3, $$8);
         if (!this.ai().a_($$5).m(this.ai(), $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == jh.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.ar.i() * 0.2F + 0.1F;
      float $$12 = $$6.f().a();
      fis $$13 = this.dA().c(0.75);
      if ($$6.o() == jh.a.a) {
         this.n($$12 * $$11, $$13.e, $$13.f);
      } else if ($$6.o() == jh.a.b) {
         this.n($$13.d, $$12 * $$11, $$13.f);
      } else if ($$6.o() == jh.a.c) {
         this.n($$13.d, $$13.e, $$12 * $$11);
      }
   }

   public void a(eeb $$0, fis $$1) {
      this.j();
      this.ah = $$1;
   }

   private static xo a(xo $$0) {
      yc $$1 = $$0.e().b($$0.a().a(null));

      for (xo $$2 : $$0.c()) {
         $$1.b(a($$2));
      }

      return $$1;
   }

   @Override
   public xo aj() {
      xo $$0 = this.al();
      return $$0 != null ? a($$0) : this.cD();
   }

   protected xo cD() {
      return this.aO.h();
   }

   public boolean v(bzm $$0) {
      return this == $$0;
   }

   public float cE() {
      return 0.0F;
   }

   public void r(float $$0) {
   }

   public void s(float $$0) {
   }

   public boolean cF() {
      return true;
   }

   public boolean w(bzm $$0) {
      return false;
   }

   @Override
   public String toString() {
      String $$0 = this.ai() == null ? "~NULL~" : this.ai().toString();
      return this.bc != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.aj().getString(),
            this.aQ,
            $$0,
            this.dC(),
            this.dE(),
            this.dI(),
            this.bc
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.aj().getString(),
            this.aQ,
            $$0,
            this.dC(),
            this.dE(),
            this.dI()
         );
   }

   protected final boolean d(byb $$0) {
      return this.dU() || this.bt && !$$0.a(azp.d) && !$$0.h() || $$0.a(azp.i) && this.bl() || $$0.a(azp.m) && this.ap().a(azs.o);
   }

   public boolean cG() {
      return this.bt;
   }

   public void n(boolean $$0) {
      this.bt = $$0;
   }

   public void x(bzm $$0) {
      this.b($$0.dC(), $$0.dE(), $$0.dI(), $$0.dP(), $$0.dR());
   }

   public void y(bzm $$0) {
      try (bci.j $$1 = new bci.j(this.ef(), b)) {
         fcz $$2 = fcz.a($$1, $$0.eb());
         $$0.d($$2);
         this.e(fcy.a($$1, this.eb(), $$2.b()));
      }

      this.bs = $$0.bs;
      this.aF = $$0.aF;
   }

   @Nullable
   public bzm b(fbl $$0) {
      if (this.ai() instanceof aub $$1 && !this.dU()) {
         aub $$3 = $$0.b();
         boolean $$4 = $$3.aj() != $$1.aj();
         if (!$$0.h()) {
            this.bS();
         }

         return $$4 ? this.a($$1, $$3, $$0) : this.a($$1, $$0);
      } else {
         return null;
      }
   }

   private bzm a(aub $$0, fbl $$1) {
      for (bzm $$2 : this.da()) {
         $$2.b(this.a($$1, $$2));
      }

      btt $$3 = bts.a();
      $$3.a("teleportSameDimension");
      this.a(caz.a($$1), $$1.i());
      if (!$$1.h()) {
         this.a($$1);
      }

      $$1.j().onTransition(this);
      $$3.c();
      return this;
   }

   private bzm a(aub $$0, aub $$1, fbl $$2) {
      List<bzm> $$3 = this.da();
      List<bzm> $$4 = new ArrayList<>($$3.size());
      this.bR();

      for (bzm $$5 : $$3) {
         bzm $$6 = $$5.b(this.a($$2, $$5));
         if ($$6 != null) {
            $$4.add($$6);
         }
      }

      btt $$7 = bts.a();
      $$7.a("teleportCrossDimension");
      bzm $$8 = this.ap().a($$1, bzu.s);
      if ($$8 == null) {
         $$7.c();
         return null;
      } else {
         $$8.y(this);
         this.cH();
         $$8.a(caz.a($$2), $$2.i());
         $$1.d($$8);

         for (bzm $$9 : $$4) {
            $$9.a($$8, true);
         }

         $$1.j();
         $$2.j().onTransition($$8);
         this.a($$2, $$0);
         $$7.c();
         return $$8;
      }
   }

   protected void a(fbl $$0, aub $$1) {
      for (auc $$3 : List.copyOf($$1.A())) {
         if ($$3.L() == this) {
            $$3.a($$0);
            $$3.d(null);
         }
      }
   }

   private fbl a(fbl $$0, bzm $$1) {
      float $$2 = $$0.e() + ($$0.i().contains(cba.d) ? 0.0F : $$1.dP() - this.dP());
      float $$3 = $$0.f() + ($$0.i().contains(cba.e) ? 0.0F : $$1.dR() - this.dR());
      fis $$4 = $$1.dv().d(this.dv());
      fis $$5 = $$0.c().b($$0.i().contains(cba.a) ? 0.0 : $$4.a(), $$0.i().contains(cba.b) ? 0.0 : $$4.b(), $$0.i().contains(cba.c) ? 0.0 : $$4.c());
      return $$0.a($$5).a($$2, $$3).a();
   }

   private void a(fbl $$0) {
      bzm $$1 = this.cY();

      for (bzm $$2 : this.de()) {
         if ($$2 instanceof auc $$3) {
            if ($$1 != null && $$3.ar() == $$1.ar()) {
               $$3.g.b(agy.a(this.ar(), caz.a($$0), $$0.i(), this.bb));
            } else {
               $$3.g.b(agy.a(this.ar(), caz.a(this), Set.of(), this.bb));
            }
         }
      }
   }

   public void a(caz $$0, Set<cba> $$1) {
      caz $$2 = caz.a(this);
      caz $$3 = caz.a($$2, $$0, $$1);
      this.o($$3.a().d, $$3.a().e, $$3.a().f);
      this.v($$3.c());
      this.r($$3.c());
      this.w($$3.d());
      this.ay();
      this.bC();
      this.i($$3.b());
      this.aN();
   }

   public void a(float $$0, float $$1) {
      this.v($$0);
      this.r($$0);
      this.w($$1);
      this.bE();
   }

   public void f(jb $$0) {
      if (this.ai() instanceof aub $$1) {
         $$1.n().a(aui.g, new dlz($$0), 3);
      }
   }

   protected void cH() {
      this.c(bzm.e.e);
      if (this instanceof cak $$0) {
         $$0.x();
      }

      if (this instanceof fkx $$1 && this.aT instanceof aub $$2) {
         $$2.h().c($$1);
      }
   }

   public fis a(jh.a $$0, m.a $$1) {
      return fbk.a($$1, $$0, this.dv(), this.a(this.aw()));
   }

   public boolean o(boolean $$0) {
      return ($$0 || !this.cc()) && this.bO();
   }

   public boolean a(dmu $$0, dmu $$1) {
      if ($$0.aj() == dmu.k && $$1.aj() == dmu.i) {
         for (bzm $$2 : this.da()) {
            if ($$2 instanceof auc $$3 && !$$3.i) {
               return false;
            }
         }
      }

      return true;
   }

   public float a(dmn $$0, dly $$1, jb $$2, eeb $$3, fal $$4, float $$5) {
      return $$5;
   }

   public boolean a(dmn $$0, dly $$1, jb $$2, eeb $$3, float $$4) {
      return true;
   }

   public int cI() {
      return 3;
   }

   public boolean n_() {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Entity Type", () -> bzv.a(this.ap()) + " (" + this.getClass().getCanonicalName() + ")");
      $$0.a("Entity ID", this.aQ);
      $$0.a("Entity Name", () -> this.aj().getString());
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dC(), this.dE(), this.dI()));
      $$0.a("Entity's Block location", q.a(this.ai(), bcb.a(this.dC()), bcb.a(this.dE()), bcb.a(this.dI())));
      fis $$1 = this.dA();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.d, $$1.e, $$1.f));
      $$0.a("Entity's Passengers", () -> this.da().toString());
      $$0.a("Entity's Vehicle", () -> String.valueOf(this.dm()));
   }

   public boolean cJ() {
      return this.cb() && !this.am();
   }

   public void a_(UUID $$0) {
      this.aG = $$0;
      this.aH = this.aG.toString();
   }

   @Override
   public UUID cK() {
      return this.aG;
   }

   public String cL() {
      return this.aH;
   }

   @Override
   public String cM() {
      return this.aH;
   }

   public boolean cN() {
      return true;
   }

   public static double cO() {
      return aN;
   }

   public static void b(double $$0) {
      aN = $$0;
   }

   @Override
   public xo Q_() {
      return fjs.a(this.cu(), this.aj()).a($$0 -> $$0.a(this.cU()).a(this.cL()));
   }

   public void b(@Nullable xo $$0) {
      this.ay.a(bl, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public xo al() {
      return this.ay.a(bl).orElse(null);
   }

   @Override
   public boolean i_() {
      return this.ay.a(bl).isPresent();
   }

   public void p(boolean $$0) {
      this.ay.a(bm, $$0);
   }

   public boolean cP() {
      return this.ay.a(bm);
   }

   public boolean a(aub $$0, double $$1, double $$2, double $$3, Set<cba> $$4, float $$5, float $$6, boolean $$7) {
      bzm $$8 = this.b(new fbl($$0, new fis($$1, $$2, $$3), fis.c, $$5, $$6, $$4, fbl.a));
      return $$8 != null;
   }

   public void m(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.ai() instanceof aub) {
         this.b($$0, $$1, $$2, this.dP(), this.dR());
         this.J();
      }
   }

   private void J() {
      this.dc().forEach($$0 -> {
         UnmodifiableIterator var1 = $$0.aR.iterator();

         while (var1.hasNext()) {
            bzm $$1 = (bzm)var1.next();
            $$0.a($$1, bzm::d);
         }
      });
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b(this.dC() + $$0, this.dE() + $$1, this.dI() + $$2);
   }

   public boolean cQ() {
      return this.cP();
   }

   @Override
   public void a(List<all.c<?>> $$0) {
   }

   @Override
   public void a(alh<?> $$0) {
      if (aD.equals($$0)) {
         this.j_();
      }
   }

   @Deprecated
   protected void cR() {
      cay $$0 = this.aw();
      bzp $$1 = this.a($$0);
      this.by = $$1;
      this.bz = $$1.c();
   }

   public void j_() {
      bzp $$0 = this.by;
      cay $$1 = this.aw();
      bzp $$2 = this.a($$1);
      this.by = $$2;
      this.bz = $$2.c();
      this.ay();
      boolean $$3 = $$2.a() <= 4.0F && $$2.b() <= 4.0F;
      if (!this.aT.C && !this.ax && !this.aq && $$3 && ($$2.a() > $$0.a() || $$2.b() > $$0.b()) && !(this instanceof cut)) {
         this.a($$0);
      }
   }

   public boolean a(bzp $$0) {
      bzp $$1 = this.a(this.aw());
      fis $$2 = this.dv().b(0.0, $$0.b() / 2.0, 0.0);
      double $$3 = Math.max(0.0F, $$1.a() - $$0.a()) + 1.0E-6;
      double $$4 = Math.max(0.0F, $$1.b() - $$0.b()) + 1.0E-6;
      fjm $$5 = fjj.a(fin.a($$2, $$3, $$4, $$3));
      Optional<fis> $$6 = this.aT.a(this, $$5, $$2, $$1.a(), $$1.b(), $$1.a());
      if ($$6.isPresent()) {
         this.b($$6.get().b(0.0, -$$1.b() / 2.0, 0.0));
         return true;
      } else {
         if ($$1.a() > $$0.a() && $$1.b() > $$0.b()) {
            fjm $$7 = fjj.a(fin.a($$2, $$3, 1.0E-6, $$3));
            Optional<fis> $$8 = this.aT.a(this, $$7, $$2, $$1.a(), $$0.b(), $$1.a());
            if ($$8.isPresent()) {
               this.b($$8.get().b(0.0, -$$0.b() / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public jh cS() {
      return jh.a((double)this.dP());
   }

   public jh cT() {
      return this.cS();
   }

   protected xu cU() {
      return new xu.c(new xu.b(this.ap(), this.cK(), this.aj()));
   }

   public boolean a(auc $$0) {
      return true;
   }

   @Override
   public final fin cV() {
      return this.ba;
   }

   public final void a(fin $$0) {
      this.ba = $$0;
   }

   public final float d(cay $$0) {
      return this.a($$0).c();
   }

   public final float cW() {
      return this.bz;
   }

   public cbd a_(int $$0) {
      return cbd.a;
   }

   @Nullable
   public MinecraftServer cX() {
      return this.ai().q();
   }

   public bxj a(cut $$0, fis $$1, bxi $$2) {
      return bxj.e;
   }

   public boolean a(dmn $$0) {
      return false;
   }

   public void d(auc $$0) {
   }

   public void e(auc $$0) {
   }

   public float a(dwu $$0) {
      float $$1 = bcb.h(this.dP());
      switch ($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 270.0F;
         case b:
            return $$1 + 90.0F;
         default:
            return $$1;
      }
   }

   public float a(dvd $$0) {
      float $$1 = bcb.h(this.dP());
      switch ($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public cvp a(cvo $$0) {
      return this.ap().a(azs.r) ? cvp.b : cvp.a;
   }

   @Nullable
   public cam cY() {
      return null;
   }

   public final boolean cZ() {
      return this.cY() != null;
   }

   public final List<bzm> da() {
      return this.aR;
   }

   @Nullable
   public bzm db() {
      return this.aR.isEmpty() ? null : (bzm)this.aR.get(0);
   }

   public boolean z(bzm $$0) {
      return this.aR.contains($$0);
   }

   public boolean a(Predicate<bzm> $$0) {
      UnmodifiableIterator var2 = this.aR.iterator();

      while (var2.hasNext()) {
         bzm $$1 = (bzm)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bzm> K() {
      return this.aR.stream().flatMap(bzm::dc);
   }

   @Override
   public Stream<bzm> dc() {
      return Stream.concat(Stream.of(this), this.K());
   }

   @Override
   public Stream<bzm> dd() {
      return Stream.concat(this.aR.stream().flatMap(bzm::dd), Stream.of(this));
   }

   public Iterable<bzm> de() {
      return () -> this.K().iterator();
   }

   public int df() {
      return (int)this.K().filter($$0 -> $$0 instanceof cut).count();
   }

   public boolean dg() {
      return this.df() == 1;
   }

   public bzm dh() {
      bzm $$0 = this;

      while ($$0.cc()) {
         $$0 = $$0.dm();
      }

      return $$0;
   }

   public boolean A(bzm $$0) {
      return this.dh() == $$0.dh();
   }

   public boolean B(bzm $$0) {
      if (!$$0.cc()) {
         return false;
      } else {
         bzm $$1 = $$0.dm();
         return $$1 == this ? true : this.B($$1);
      }
   }

   public final boolean di() {
      return this.aT.B_() ? this.dj() : !this.aa_();
   }

   protected boolean dj() {
      cam $$0 = this.cY();
      return $$0 != null && $$0.dj();
   }

   public boolean aa_() {
      cam $$0 = this.cY();
      return $$0 != null && $$0.aa_();
   }

   public boolean dk() {
      return this.di();
   }

   public boolean dl() {
      return this.di();
   }

   protected static fis a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -bcb.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = bcb.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new fis($$4 * $$3 / $$6, 0.0, $$5 * $$3 / $$6);
   }

   public fis b(cam $$0) {
      return new fis(this.dC(), this.cV().e, this.dI());
   }

   @Nullable
   public bzm dm() {
      return this.aS;
   }

   @Nullable
   public bzm dn() {
      return this.aS != null && this.aS.cY() == this ? this.aS : null;
   }

   public faq k_() {
      return faq.a;
   }

   public aza do() {
      return aza.g;
   }

   protected int dp() {
      return 0;
   }

   public ek d(aub $$0) {
      return new ek(ej.a, this.dv(), this.bX(), $$0, 0, this.aj().getString(), this.Q_(), $$0.q(), this);
   }

   public void a(ex.a $$0, fis $$1) {
      fis $$2 = $$0.a(this);
      double $$3 = $$1.d - $$2.d;
      double $$4 = $$1.e - $$2.e;
      double $$5 = $$1.f - $$2.f;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.w(bcb.h((float)(-(bcb.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.v(bcb.h((float)(bcb.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.r(this.dP());
      this.ab = this.dR();
      this.aa = this.dP();
   }

   public float t(float $$0) {
      return bcb.h($$0, this.aa, this.aY);
   }

   public boolean a(bae<fak> $$0, double $$1) {
      if (this.dq()) {
         return false;
      } else {
         fin $$2 = this.cV().h(0.001);
         int $$3 = bcb.a($$2.a);
         int $$4 = bcb.c($$2.d);
         int $$5 = bcb.a($$2.b);
         int $$6 = bcb.c($$2.e);
         int $$7 = bcb.a($$2.c);
         int $$8 = bcb.c($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cN();
         boolean $$11 = false;
         fis $$12 = fis.c;
         int $$13 = 0;
         jb.a $$14 = new jb.a();

         for (int $$15 = $$3; $$15 < $$4; $$15++) {
            for (int $$16 = $$5; $$16 < $$6; $$16++) {
               for (int $$17 = $$7; $$17 < $$8; $$17++) {
                  $$14.d($$15, $$16, $$17);
                  fal $$18 = this.ai().b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = $$16 + $$18.a(this.ai(), $$14);
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           fis $$20 = $$18.c(this.ai(), $$14);
                           if ($$9 < 0.4) {
                              $$20 = $$20.c($$9);
                           }

                           $$12 = $$12.e($$20);
                           $$13++;
                        }
                     }
                  }
               }
            }
         }

         if ($$12.g() > 0.0) {
            if ($$13 > 0) {
               $$12 = $$12.c(1.0 / $$13);
            }

            if (!(this instanceof cut)) {
               $$12 = $$12.d();
            }

            fis $$21 = this.dA();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.d) < 0.003 && Math.abs($$21.f) < 0.003 && $$12.g() < 0.0045000000000000005) {
               $$12 = $$12.d().c(0.0045000000000000005);
            }

            this.i(this.dA().e($$12));
         }

         this.au.put($$0, $$9);
         return $$11;
      }
   }

   public boolean dq() {
      fin $$0 = this.cV().g(1.0);
      int $$1 = bcb.a($$0.a);
      int $$2 = bcb.c($$0.d);
      int $$3 = bcb.a($$0.c);
      int $$4 = bcb.c($$0.f);
      return !this.ai().b($$1, $$3, $$2, $$4);
   }

   public double b(bae<fak> $$0) {
      return this.au.getDouble($$0);
   }

   public double dr() {
      return this.cW() < 0.4 ? 0.0 : 0.4;
   }

   public final float ds() {
      return this.by.a();
   }

   public final float dt() {
      return this.by.b();
   }

   public zw<acq> a(atz $$0) {
      return new acr(this, $$0);
   }

   public bzp a(cay $$0) {
      return this.aO.n();
   }

   public final bzo du() {
      return this.by.d();
   }

   public fis dv() {
      return this.aU;
   }

   public fis dw() {
      return this.dv();
   }

   @Override
   public jb dx() {
      return this.aV;
   }

   public eeb dy() {
      if (this.bE == null) {
         this.bE = this.ai().a_(this.dx());
      }

      return this.bE;
   }

   public dlz dz() {
      return this.aW;
   }

   public fis dA() {
      return this.aX;
   }

   public void i(fis $$0) {
      this.aX = $$0;
   }

   public void j(fis $$0) {
      this.i(this.dA().e($$0));
   }

   public void n(double $$0, double $$1, double $$2) {
      this.i(new fis($$0, $$1, $$2));
   }

   public final int dB() {
      return this.aV.u();
   }

   public final double dC() {
      return this.aU.d;
   }

   public double c(double $$0) {
      return this.aU.d + this.ds() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.ar.j() - 1.0) * $$0);
   }

   public final int dD() {
      return this.aV.v();
   }

   public final double dE() {
      return this.aU.e;
   }

   public double e(double $$0) {
      return this.aU.e + this.dt() * $$0;
   }

   public double dF() {
      return this.e(this.ar.j());
   }

   public double dG() {
      return this.aU.e + this.bz;
   }

   public final int dH() {
      return this.aV.w();
   }

   public final double dI() {
      return this.aU.f;
   }

   public double f(double $$0) {
      return this.aU.f + this.ds() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.ar.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.aU.d != $$0 || this.aU.e != $$1 || this.aU.f != $$2) {
         this.aU = new fis($$0, $$1, $$2);
         int $$3 = bcb.a($$0);
         int $$4 = bcb.a($$1);
         int $$5 = bcb.a($$2);
         if ($$3 != this.aV.u() || $$4 != this.aV.v() || $$5 != this.aV.w()) {
            this.aV = new jb($$3, $$4, $$5);
            this.bE = null;
            if (ke.a($$3) != this.aW.h || ke.a($$5) != this.aW.i) {
               this.aW = new dlz(this.aV);
            }
         }

         this.bq.a();
         if (!this.ax && this.aT instanceof aub $$6 && !this.dU()) {
            if (this instanceof fkx $$7 && $$7.ge()) {
               $$6.h().b($$7);
            }

            if (this instanceof auc $$8 && $$8.m() && $$8.g != null) {
               $$6.h().b($$8);
            }
         }
      }
   }

   public void dJ() {
   }

   public fis[] dK() {
      return cak.a(this, 0.0, 0.5, 0.5, 0.0);
   }

   public boolean dL() {
      return false;
   }

   public void a(cak $$0) {
   }

   public void b(cak $$0) {
   }

   public fis u(float $$0) {
      return this.p($$0).b(0.0, this.bz * 0.7, 0.0);
   }

   public void a(acr $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.g();
      double $$3 = $$0.h();
      double $$4 = $$0.i();
      this.e($$2, $$3, $$4);
      this.b($$2, $$3, $$4, $$0.n(), $$0.m());
      this.e($$1);
      this.a_($$0.e());
      fis $$5 = new fis($$0.j(), $$0.k(), $$0.l());
      this.i($$5);
   }

   @Nullable
   public dcv dM() {
      return null;
   }

   public void q(boolean $$0) {
      this.aI = $$0;
   }

   public boolean dN() {
      return !this.ap().a(azs.k);
   }

   public boolean dO() {
      return this.cy() > 0;
   }

   public float dP() {
      return this.aY;
   }

   public float dQ() {
      return this.dP();
   }

   public void v(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aY = $$0;
      }
   }

   public float dR() {
      return this.aZ;
   }

   public void w(float $$0) {
      if (!Float.isFinite($$0)) {
         ag.b("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aZ = Math.clamp($$0 % 360.0F, -90.0F, 90.0F);
      }
   }

   public boolean dS() {
      return false;
   }

   public float dT() {
      return 0.0F;
   }

   public void a(@Nullable bzm $$0) {
   }

   @Override
   public final boolean dU() {
      return this.bc != null;
   }

   @Nullable
   public bzm.e dV() {
      return this.bc;
   }

   @Override
   public final void c(bzm.e $$0) {
      if (this.bc == null) {
         this.bc = $$0;
      }

      if (this.bc.a()) {
         this.bS();
      }

      this.da().forEach(bzm::bS);
      this.bq.a($$0);
      this.b($$0);
   }

   protected void dW() {
      this.bc = null;
   }

   @Override
   public void a(eih $$0) {
      this.bq = $$0;
   }

   @Override
   public boolean dX() {
      if (this.bc != null && !this.bc.b()) {
         return false;
      } else {
         return this.cc() ? false : !this.cd() || !this.dg();
      }
   }

   @Override
   public boolean dY() {
      return false;
   }

   public boolean c(aub $$0, jb $$1) {
      return true;
   }

   public boolean dZ() {
      return false;
   }

   public dmu ai() {
      return this.aT;
   }

   protected void a(dmu $$0) {
      this.aT = $$0;
   }

   public byc ea() {
      return this.ai().al();
   }

   public jz eb() {
      return this.ai().K_();
   }

   protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      double $$6 = 1.0 / $$0;
      double $$7 = bcb.d($$6, this.dC(), $$1);
      double $$8 = bcb.d($$6, this.dE(), $$2);
      double $$9 = bcb.d($$6, this.dI(), $$3);
      float $$10 = (float)bcb.e($$6, (double)this.dP(), $$4);
      float $$11 = (float)bcb.d($$6, (double)this.dR(), $$5);
      this.a_($$7, $$8, $$9);
      this.b($$10, $$11);
   }

   public bck ec() {
      return this.ar;
   }

   public fis ae() {
      return this.cY() instanceof cut $$0 && this.bO() ? $$0.ae() : this.dA();
   }

   @Nullable
   public dcv ed() {
      return null;
   }

   public Optional<amd<fdo>> ee() {
      return this.aO.j();
   }

   protected void a(kl $$0) {
      this.a($$0, kq.g);
      this.a($$0, kq.b);
   }

   public final void c(dcv $$0) {
      this.a($$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      if ($$0 == kq.g) {
         return c((kp<T>)$$0, this.al());
      } else {
         return $$0 == kq.b ? c((kp<T>)$$0, this.bJ) : null;
      }
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   protected static <T> T c(kp<T> $$0, @Nullable Object $$1) {
      return (T)$$1;
   }

   public <T> void d(kp<T> $$0, T $$1) {
      this.b($$0, $$1);
   }

   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.g) {
         this.b(c(kq.g, $$1));
         return true;
      } else if ($$0 == kq.b) {
         this.bJ = c(kq.b, $$1);
         return true;
      } else {
         return false;
      }
   }

   protected <T> boolean a(kl $$0, kp<T> $$1) {
      T $$2 = $$0.a($$1);
      return $$2 != null ? this.b($$1, $$2) : false;
   }

   public bci.f ef() {
      return new bzm.a(this);
   }

   record a(bzm a) implements bci.f {
      @Override
      public String get() {
         return this.a.toString();
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(bzm var1, double var2, double var4, double var6);
   }

   record c(fis a, fis b, boolean c) {
   }

   public static enum d {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private d(final boolean $$0, final boolean $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public boolean a() {
         return this.f || this.e;
      }

      public boolean b() {
         return this.f;
      }

      public boolean c() {
         return this.e;
      }
   }

   public static enum e {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private e(final boolean $$0, final boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public boolean a() {
         return this.f;
      }

      public boolean b() {
         return this.g;
      }
   }
}
