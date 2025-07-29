import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cuf extends cua implements cbb, cuh {
   private static final Logger cq = LogUtils.getLogger();
   private static final alh<cug> cr = all.a(cuf.class, alj.u);
   public static final int cm = 12;
   public static final Map<dcr, Integer> cn = ImmutableMap.of(dcz.qC, 4, dcz.vI, 1, dcz.vH, 1, dcz.wN, 1);
   private static final int cs = 2;
   private static final int ct = 10;
   private static final int cu = 1200;
   private static final int cv = 24000;
   private static final int cw = 10;
   private static final int cx = 5;
   private static final long cy = 24000L;
   @VisibleForTesting
   public static final float co = 0.5F;
   private static final int cz = 0;
   private static final byte cA = 0;
   private static final int cB = 0;
   private static final int cC = 0;
   private static final int cD = 0;
   private static final boolean cE = false;
   private int cF;
   private boolean cG;
   @Nullable
   private cut cH;
   private boolean cI;
   private int cJ = 0;
   private final cjk cM = new cjk();
   private long cN;
   private long cO = 0L;
   private int cP = 0;
   private long cQ = 0L;
   private int cR = 0;
   private long cS;
   private boolean cT = false;
   private static final ImmutableList<cjo<?>> cU = ImmutableList.of(
      cjo.b,
      cjo.c,
      cjo.d,
      cjo.e,
      cjo.g,
      cjo.h,
      cjo.i,
      cjo.j,
      cjo.k,
      cjo.l,
      cjo.M,
      cjo.aQ,
      new cjo[]{cjo.n, cjo.o, cjo.r, cjo.s, cjo.u, cjo.w, cjo.x, cjo.y, cjo.z, cjo.B, cjo.f, cjo.D, cjo.E, cjo.F, cjo.I, cjo.J, cjo.K, cjo.G}
   );
   private static final ImmutableList<ckw<? extends ckv<? super cuf>>> cV = ImmutableList.of(ckw.c, ckw.d, ckw.b, ckw.e, ckw.f, ckw.g, ckw.h, ckw.i, ckw.j);
   public static final Map<cjo<jk>, BiPredicate<cuf, jl<cls>>> cp = ImmutableMap.of(
      cjo.b,
      (BiPredicate<cuf, jl>)($$0, $$1) -> $$1.a(clt.n),
      cjo.c,
      (BiPredicate<cuf, jl>)($$0, $$1) -> $$0.gR().b().a().b().test($$1),
      cjo.d,
      (BiPredicate<cuf, jl>)($$0, $$1) -> cui.a.test($$1),
      cjo.e,
      (BiPredicate<cuf, jl>)($$0, $$1) -> $$1.a(clt.o)
   );

   public cuf(bzv<? extends cuf> $$0, dmu $$1) {
      this($$0, $$1, cuk.c);
   }

   public cuf(bzv<? extends cuf> $$0, dmu $$1, amd<cuk> $$2) {
      this($$0, $$1, $$1.K_().d($$2));
   }

   public cuf(bzv<? extends cuf> $$0, dmu $$1, jl<cuk> $$2) {
      super($$0, $$1);
      this.S().d(true);
      this.S().a(true);
      this.S().a(48.0F);
      this.a_(true);
      this.a(this.gR().a($$2).b($$1.K_(), cui.b));
   }

   @Override
   public cbm<cuf> eh() {
      return (cbm<cuf>)super.eh();
   }

   @Override
   protected cbm.b<cuf> ei() {
      return cbm.a(cU, cV);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      cbm<cuf> $$1 = this.ei().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(aub $$0) {
      cbm<cuf> $$1 = this.eh();
      $$1.b($$0, this);
      this.bO = $$1.i();
      this.a(this.eh());
   }

   private void a(cbm<cuf> $$0) {
      jl<cui> $$1 = this.gR().b();
      if (this.g_()) {
         $$0.a(cwp.e);
         $$0.a(cwn.d, cfj.a(0.5F));
      } else {
         $$0.a(cwp.f);
         $$0.a(cwn.c, cfj.b($$1, 0.5F), ImmutableSet.of(Pair.of(cjo.c, cjp.a)));
      }

      $$0.a(cwn.a, cfj.a($$1, 0.5F));
      $$0.a(cwn.f, cfj.d($$1, 0.5F), ImmutableSet.of(Pair.of(cjo.e, cjp.a)));
      $$0.a(cwn.e, cfj.c($$1, 0.5F));
      $$0.a(cwn.b, cfj.e($$1, 0.5F));
      $$0.a(cwn.g, cfj.f($$1, 0.5F));
      $$0.a(cwn.i, cfj.g($$1, 0.5F));
      $$0.a(cwn.h, cfj.h($$1, 0.5F));
      $$0.a(cwn.j, cfj.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cwn.a));
      $$0.b(cwn.b);
      $$0.a(cwn.b);
      $$0.a(this.ai().af(), this.ai().ae());
   }

   @Override
   protected void h() {
      super.h();
      if (this.ai() instanceof aub) {
         this.g((aub)this.ai());
      }
   }

   public static cbr.a gQ() {
      return cao.I().a(cbs.w, 0.5);
   }

   public boolean gS() {
      return this.cT;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("villagerBrain");
      this.eh().a($$0, this);
      $$1.c();
      if (this.cT) {
         this.cT = false;
      }

      if (!this.gI() && this.cF > 0) {
         this.cF--;
         if (this.cF <= 0) {
            if (this.cG) {
               this.ho();
               this.cG = false;
            }

            this.a(new byq(bys.j, 200, 0));
         }
      }

      if (this.cH != null) {
         $$0.a(clm.e, this.cH, this);
         $$0.a(this, (byte)14);
         this.cH = null;
      }

      if (!this.gw() && this.ar.a(100) == 0) {
         cwj $$2 = $$0.d(this.dx());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gR().b().a(cui.b) && this.gI()) {
         this.gN();
      }

      super.a($$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.m() > 0) {
         this.r(this.m() - 1);
      }

      this.hq();
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      if ($$2.a(dcz.vj) || !this.bO() || this.gI() || this.fY()) {
         return super.b($$0, $$1);
      } else if (this.g_()) {
         this.hd();
         return bxj.a;
      } else {
         if (!this.ai().C) {
            boolean $$3 = this.gJ().isEmpty();
            if ($$1 == bxi.a) {
               if ($$3) {
                  this.hd();
               }

               $$0.a(azj.T);
            }

            if ($$3) {
               return bxj.c;
            }

            this.j($$0);
         }

         return bxj.a;
      }
   }

   private void hd() {
      this.r(40);
      if (!this.ai().B_()) {
         this.b(ayz.Cz);
      }
   }

   private void j(cut $$0) {
      this.k($$0);
      this.g($$0);
      this.a($$0, this.Q_(), this.gR().c());
   }

   @Override
   public void g(@Nullable cut $$0) {
      boolean $$1 = this.gH() != null && $$0 == null;
      super.g($$0);
      if ($$1) {
         this.gN();
      }
   }

   @Override
   protected void gN() {
      super.gN();
      this.he();
   }

   private void he() {
      if (!this.ai().B_()) {
         for (dlq $$0 : this.gJ()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gT() {
      return true;
   }

   public void gU() {
      this.hj();

      for (dlq $$0 : this.gJ()) {
         $$0.j();
      }

      this.hf();
      this.cQ = this.ai().ae();
      this.cR++;
   }

   private void hf() {
      dlr $$0 = this.gJ();
      cut $$1 = this.gH();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cn.l, $$0, this.gR().c(), this.t(), this.gK(), this.gT());
      }
   }

   private boolean hg() {
      for (dlq $$0 : this.gJ()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean hh() {
      return this.cR == 0 || this.cR < 2 && this.ai().ae() > this.cQ + 2400L;
   }

   public boolean gV() {
      long $$0 = this.cQ + 12000L;
      long $$1 = this.ai().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.ai().af();
      if (this.cS > 0L) {
         long $$4 = this.cS / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cS = $$3;
      if ($$2) {
         this.cQ = $$1;
         this.hr();
      }

      return this.hh() && this.hg();
   }

   private void hi() {
      int $$0 = 2 - this.cR;
      if ($$0 > 0) {
         for (dlq $$1 : this.gJ()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.hj();
      }

      this.hf();
   }

   private void hj() {
      for (dlq $$0 : this.gJ()) {
         $$0.g();
      }
   }

   private void k(cut $$0) {
      int $$1 = this.i($$0);
      if ($$1 != 0) {
         for (dlq $$2 : this.gJ()) {
            $$2.a(-bcb.d($$1 * $$2.p()));
         }
      }

      if ($$0.d(bys.F)) {
         byq $$3 = $$0.e(bys.F);
         int $$4 = $$3.e();

         for (dlq $$5 : this.gJ()) {
            double $$6 = 0.3 + 0.0625 * $$4;
            int $$7 = (int)Math.floor($$6 * $$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cr, gW());
   }

   public static cug gW() {
      return new cug(mm.w.b(cuk.c), mm.x.b(cui.b), 1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("VillagerData", cug.c, this.gR());
      $$0.a("FoodLevel", (byte)this.cJ);
      $$0.a("Gossips", cjk.a, this.cM);
      $$0.a("Xp", this.cP);
      $$0.a("LastRestock", this.cQ);
      $$0.a("LastGossipDecay", this.cO);
      $$0.a("RestocksToday", this.cR);
      if (this.cT) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.ay.a(cr, $$0.<cug>a("VillagerData", cug.c).orElseGet(cuf::gW));
      this.cJ = $$0.a("FoodLevel", (byte)0);
      this.cM.c();
      $$0.<cjk>a("Gossips", cjk.a).ifPresent(this.cM::a);
      this.cP = $$0.a("Xp", 0);
      this.cQ = $$0.a("LastRestock", 0L);
      this.cO = $$0.a("LastGossipDecay", 0L);
      if (this.ai() instanceof aub) {
         this.g((aub)this.ai());
      }

      this.cR = $$0.a("RestocksToday", 0);
      this.cT = $$0.a("AssignProfessionWhenSpawned", false);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected ayy p() {
      if (this.fY()) {
         return null;
      } else {
         return this.gI() ? ayz.CA : ayz.Cv;
      }
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Cy;
   }

   @Override
   protected ayy f_() {
      return ayz.Cx;
   }

   public void gX() {
      this.b(this.gR().b().a().f());
   }

   @Override
   public void a(cug $$0) {
      cug $$1 = this.gR();
      if (!$$1.b().equals($$0.b())) {
         this.cl = null;
      }

      this.ay.a(cr, $$0);
   }

   @Override
   public cug gR() {
      return this.ay.a(cr);
   }

   @Override
   protected void b(dlq $$0) {
      int $$1 = 3 + this.ar.a(4);
      this.cP = this.cP + $$0.q();
      this.cH = this.gH();
      if (this.hn()) {
         this.cF = 40;
         this.cG = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.ai().b(new caa(this.ai(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   public void a(@Nullable cam $$0) {
      if ($$0 != null && this.ai() instanceof aub) {
         ((aub)this.ai()).a(clm.c, $$0, this);
         if (this.bO() && $$0 instanceof cut) {
            this.ai().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(byb $$0) {
      cq.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bzm $$1 = $$0.d();
      if ($$1 != null) {
         this.G($$1);
      }

      this.hk();
      super.a($$0);
   }

   private void hk() {
      this.a(cjo.b);
      this.a(cjo.c);
      this.a(cjo.d);
      this.a(cjo.e);
   }

   private void G(bzm $$0) {
      if (this.ai() instanceof aub $$1) {
         Optional<cjq> $$3 = this.bO.c(cjo.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(cbb.class::isInstance).forEach($$2x -> $$1.a(clm.d, $$0, (cbb)$$2x));
         }
      }
   }

   public void a(cjo<jk> $$0) {
      if (this.ai() instanceof aub) {
         MinecraftServer $$1 = ((aub)this.ai()).q();
         this.bO.c($$0).ifPresent($$2 -> {
            aub $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               clp $$4 = $$3.B();
               Optional<jl<cls>> $$5 = $$4.c($$2.b());
               BiPredicate<cuf, jl<cls>> $$6 = cp.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ahj.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cJ + this.hp() >= 12 && !this.fY() && this.Z_() == 0;
   }

   private boolean hl() {
      return this.cJ < 12;
   }

   private void hm() {
      if (this.hl() && this.hp() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            dcv $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cn.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cJ = this.cJ + $$2;
                     this.n().a($$0, 1);
                     if (!this.hl()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int i(cut $$0) {
      return this.cM.a($$0.cK(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cJ -= $$0;
   }

   public void gY() {
      this.hm();
      this.u(12);
   }

   public void b(dlr $$0) {
      this.cl = $$0;
   }

   private boolean hn() {
      int $$0 = this.gR().c();
      return cug.d($$0) && this.cP >= cug.c($$0);
   }

   private void ho() {
      this.a(this.gR().a(this.gR().c() + 1));
      this.gO();
   }

   @Override
   protected xo cD() {
      return this.gR().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(me.S);
      } else if ($$0 == 13) {
         this.a(me.a);
      } else if ($$0 == 14) {
         this.a(me.Q);
      } else if ($$0 == 42) {
         this.a(me.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$2 == bzu.e) {
         this.a(this.gR().b($$0.K_(), cui.b));
      }

      if ($$2 == bzu.n || $$2 == bzu.m || bzu.a($$2) || $$2 == bzu.o) {
         this.a(this.gR().a($$0.K_(), cuk.a($$0.v(this.dx()))));
      }

      if ($$2 == bzu.d) {
         this.cT = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cuf b(aub $$0, bzc $$1) {
      double $$2 = this.ar.j();
      jl<cuk> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.K_().d(cuk.a($$0.v(this.dx())));
      } else if ($$2 < 0.75) {
         $$3 = this.gR().a();
      } else {
         $$3 = ((cuf)$$1).gR().a();
      }

      cuf $$6 = new cuf(bzv.bF, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dx()), bzu.e, null);
      return $$6;
   }

   @Override
   public void a(aub $$0, cal $$1) {
      if ($$0.an() != bxg.a) {
         cq.info("Villager {} was struck by lightning {}.", this, $$1);
         csl $$2 = this.a(bzv.bK, bzg.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dx()), bzu.i, null);
            $$1x.gp();
            this.hk();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      cud.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      dcr $$2 = $$1.h();
      return ($$1.a(azx.bS) || this.gR().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gZ() {
      return this.hp() >= 24;
   }

   public boolean ha() {
      return this.hp() < 12;
   }

   private int hp() {
      bxr $$0 = this.n();
      return cn.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean hb() {
      return this.n().a_($$0 -> $$0.a(azx.bR));
   }

   @Override
   protected void gO() {
      cug $$0 = this.gR();
      amd<cui> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cuj.g[]> $$3;
         if (this.ai().L().b(cyf.b)) {
            Int2ObjectMap<cuj.g[]> $$2 = cuj.c.get($$1);
            $$3 = $$2 != null ? $$2 : cuj.a.get($$1);
         } else {
            $$3 = cuj.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cuj.g[] $$5 = (cuj.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dlr $$6 = this.gJ();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(aub $$0, cuf $$1, long $$2) {
      if (($$2 < this.cN || $$2 >= this.cN + 1200L) && ($$2 < $$1.cN || $$2 >= $$1.cN + 1200L)) {
         this.cM.a($$1.cM, this.ar, 10);
         this.cN = $$2;
         $$1.cN = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hq() {
      long $$0 = this.ai().ae();
      if (this.cO == 0L) {
         this.cO = $$0;
      } else if ($$0 >= this.cO + 24000L) {
         this.cM.b();
         this.cO = $$0;
      }
   }

   public void a(aub $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fin $$3 = this.cV().c(10.0, 10.0, 10.0);
         List<cuf> $$4 = $$0.a(cuf.class, $$3);
         List<cuf> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bcw.a(bzv.ar, bzu.f, $$0, this.dx(), 10, 8, 6, bcw.a.a, false).isEmpty()) {
               $$4.forEach(ckh::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.ai().ae()) ? false : !this.bO.a(cjo.G);
   }

   @Override
   public void a(clm $$0, bzm $$1) {
      if ($$0 == clm.a) {
         this.cM.a($$1.cK(), cjl.d, 20);
         this.cM.a($$1.cK(), cjl.c, 25);
      } else if ($$0 == clm.e) {
         this.cM.a($$1.cK(), cjl.e, 2);
      } else if ($$0 == clm.c) {
         this.cM.a($$1.cK(), cjl.b, 25);
      } else if ($$0 == clm.d) {
         this.cM.a($$1.cK(), cjl.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cP;
   }

   public void t(int $$0) {
      this.cP = $$0;
   }

   private void hr() {
      this.hi();
      this.cR = 0;
   }

   public cjk hc() {
      return this.cM;
   }

   public void a(cjk $$0) {
      this.cM.a($$0);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public void b(jb $$0) {
      super.b($$0);
      this.bO.a(cjo.I, this.ai().ae());
      this.bO.b(cjo.n);
      this.bO.b(cjo.F);
   }

   @Override
   public void fZ() {
      super.fZ();
      this.bO.a(cjo.J, this.ai().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bO.c(cjo.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kp<? extends T> $$0) {
      return $$0 == kq.av ? c((kp<T>)$$0, this.gR().a()) : super.a($$0);
   }

   @Override
   protected void a(kl $$0) {
      this.a($$0, kq.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kp<T> $$0, T $$1) {
      if ($$0 == kq.av) {
         jl<cuk> $$2 = c(kq.av, $$1);
         this.a(this.gR().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
