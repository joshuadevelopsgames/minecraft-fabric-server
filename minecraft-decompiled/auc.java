import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.HashCode;
import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class auc extends cut {
   private static final Logger cM = LogUtils.getLogger();
   private static final int cN = 32;
   private static final int cO = 10;
   private static final int cP = 25;
   public static final double a = 1.0;
   public static final double b = 3.0;
   public static final int c = 2;
   public static final String d = "ender_pearls";
   public static final String e = "ender_pearl_dimension";
   public static final String f = "Dimension";
   private static final cbq cQ = new cbq(ame.b("creative_mode_block_range"), 0.5, cbq.a.a);
   private static final cbq cR = new cbq(ame.b("creative_mode_entity_range"), 2.0, cbq.a.a);
   private static final xo cS = xo.c("block.minecraft.set_spawn");
   private static final cbq cT = new cbq(ame.b("waypoint_transmit_range_crouch"), -1.0, cbq.a.c);
   private static final boolean cU = false;
   private static final boolean cV = false;
   public avf g;
   private final MinecraftServer cW;
   public final aud h;
   private final amm cX;
   private final azf cY;
   private float cZ = Float.MIN_VALUE;
   private int da = Integer.MIN_VALUE;
   private int db = Integer.MIN_VALUE;
   private int dc = Integer.MIN_VALUE;
   private int dd = Integer.MIN_VALUE;
   private int de = Integer.MIN_VALUE;
   private float df = -1.0E8F;
   private int dg = -99999999;
   private boolean dh = true;
   private int di = -99999999;
   private cuq dj = cuq.a;
   private att dk = att.a;
   private boolean dl = true;
   private long dm = ag.c();
   @Nullable
   private bzm dn;
   private boolean do;
   public boolean i = false;
   private final aze dp;
   @Nullable
   private fis dq;
   private int dr;
   private boolean ds;
   private int dt = 2;
   private String du = "en_us";
   @Nullable
   private fis dv;
   @Nullable
   private fis dw;
   @Nullable
   private fis dx;
   private ke dy = ke.a(0, 0, 0);
   private atk dz = atk.a;
   @Nullable
   private auc.a dA;
   private final avl dB;
   private boolean dC;
   private boolean dD;
   private boolean dE = false;
   private cty dF = new cty();
   @Nullable
   private jb dG;
   private fis dH = fis.c;
   private cur dI = cur.b;
   private final Set<cvy> dJ = new HashSet<>();
   private final czb dK = new czb() {
      private final LoadingCache<ks<?>, Integer> b = CacheBuilder.newBuilder().maximumSize(256L).build(new CacheLoader<ks<?>, Integer>() {
         private final DynamicOps<HashCode> b = auc.this.eb().a(bbr.c);

         public Integer a(ks<?> $$0) {
            return ((HashCode)$$0.a(this.b).getOrThrow($$1 -> new IllegalArgumentException("Failed to hash " + $$0 + ": " + $$1))).asInt();
         }
      });

      @Override
      public void a(cym $$0, List<dcv> $$1, dcv $$2, int[] $$3) {
         auc.this.g.b(new adk($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cym $$0, int $$1, dcv $$2) {
         auc.this.g.b(new adm($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cym $$0, dcv $$1) {
         auc.this.g.b(new afw($$1));
      }

      @Override
      public void a(cym $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cym $$0, int $$1, int $$2) {
         auc.this.g.b(new adl($$0.l, $$1, $$2));
      }

      @Override
      public dae a() {
         return new dae.a(this.b::getUnchecked);
      }
   };
   private final cza dL = new cza() {
      @Override
      public void a(cym $$0, int $$1, dcv $$2) {
         dak $$3 = $$0.b($$1);
         if (!($$3 instanceof dag)) {
            if ($$3.c == auc.this.gs()) {
               aq.f.a(auc.this, auc.this.gs(), $$2);
            }
         }
      }

      @Override
      public void a(cym $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private yf dM;
   @Nullable
   public final Object j;
   private final ej dN = new ej() {
      @Override
      public boolean x_() {
         return auc.this.y().P().c(dmq.q);
      }

      @Override
      public boolean y_() {
         return true;
      }

      @Override
      public boolean c() {
         return true;
      }

      @Override
      public void a(xo $$0) {
         auc.this.a($$0);
      }
   };
   private int dO;
   public boolean k;

   public auc(MinecraftServer $$0, aub $$1, GameProfile $$2, atl $$3) {
      super($$1, $$2);
      this.dB = $$0.a(this);
      this.h = $$0.b(this);
      this.dp = new aze(($$1x, $$2x) -> $$0.aI().a($$1x, $$2x));
      this.cW = $$0;
      this.cY = $$0.ag().a((cut)this);
      this.cX = $$0.ag().f(this);
      this.a($$3);
      this.j = null;
   }

   @Override
   public jb a(aub $$0, jb $$1) {
      fin $$2 = this.a(cay.a).a(fis.c);
      jb $$3 = $$1;
      if ($$0.G_().g() && $$0.q().aZ().k() != dmr.c) {
         int $$4 = Math.max(0, this.cW.a($$0));
         int $$5 = bcb.a($$0.F_().b($$1.u(), $$1.w()));
         if ($$5 < $$4) {
            $$4 = $$5;
         }

         if ($$5 <= 1) {
            $$4 = 1;
         }

         long $$6 = $$4 * 2 + 1;
         long $$7 = $$6 * $$6;
         int $$8 = $$7 > 2147483647L ? Integer.MAX_VALUE : (int)$$7;
         int $$9 = this.t($$8);
         int $$10 = bck.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = atv.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               p $$20 = p.a(var25, "Searching for spawn");
               q $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new aa($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.ao()) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.L_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(aub $$0, fin $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.dF = $$0.<cty>a("warden_spawn_tracker", cty.a).orElseGet(cty::new);
      this.dw = $$0.<fis>a("entered_nether_pos", fis.a).orElse(null);
      this.i = $$0.a("seenCredits", false);
      $$0.<aze.b>a("recipeBook", aze.b.a).ifPresent($$0x -> this.dp.a($$0x, $$0xx -> this.cW.aI().b($$0xx).isPresent()));
      if (this.fY()) {
         this.fZ();
      }

      this.dA = $$0.<auc.a>a("respawn", auc.a.a).orElse(null);
      this.dE = $$0.a("spawn_extra_particles_on_fall", false);
      this.dG = $$0.<jb>a("raid_omen_position", jb.a).orElse(null);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("warden_spawn_tracker", cty.a, this.dF);
      this.g($$0);
      $$0.a("seenCredits", this.i);
      $$0.b("entered_nether_pos", fis.a, this.dw);
      this.e($$0);
      $$0.a("recipeBook", aze.b.a, this.dp.b());
      $$0.a("Dimension", this.y().aj().a().toString());
      $$0.b("respawn", auc.a.a, this.dA);
      $$0.a("spawn_extra_particles_on_fall", this.dE);
      $$0.b("raid_omen_position", jb.a, this.dG);
      this.f($$0);
   }

   private void e(fdc $$0) {
      bzm $$1 = this.dh();
      bzm $$2 = this.dm();
      if ($$2 != null && $$1 != this && $$1.dg()) {
         fdc $$3 = $$0.a("RootVehicle");
         $$3.a("Attach", kf.a, $$2.cK());
         $$1.c($$3.a("Entity"));
      }
   }

   public void b(fda $$0) {
      Optional<fda> $$1 = $$0.a("RootVehicle");
      if (!$$1.isEmpty()) {
         aub $$2 = this.y();
         bzm $$3 = bzv.a($$1.get().b("Entity"), $$2, bzu.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
         if ($$3 != null) {
            UUID $$4 = $$1.get().<UUID>a("Attach", kf.a).orElse(null);
            if ($$3.cK().equals($$4)) {
               this.a($$3, true);
            } else {
               for (bzm $$5 : $$3.de()) {
                  if ($$5.cK().equals($$4)) {
                     this.a($$5, true);
                     break;
                  }
               }
            }

            if (!this.cc()) {
               cM.warn("Couldn't reattach entity to player");
               $$3.at();

               for (bzm $$6 : $$3.de()) {
                  $$6.at();
               }
            }
         }
      }
   }

   private void f(fdc $$0) {
      if (!this.dJ.isEmpty()) {
         fdc.b $$1 = $$0.b("ender_pearls");

         for (cvy $$2 : this.dJ) {
            if ($$2.dU()) {
               cM.warn("Trying to save removed ender pearl, skipping");
            } else {
               fdc $$3 = $$1.a();
               $$2.c($$3);
               $$3.a("ender_pearl_dimension", dmu.h, $$2.ai().aj());
            }
         }
      }
   }

   public void c(fda $$0) {
      $$0.d("ender_pearls").forEach(this::f);
   }

   private void f(fda $$0) {
      Optional<amd<dmu>> $$1 = $$0.a("ender_pearl_dimension", dmu.h);
      if (!$$1.isEmpty()) {
         aub $$2 = this.y().q().a($$1.get());
         if ($$2 != null) {
            bzm $$3 = bzv.a($$0, $$2, bzu.r, $$1x -> !$$2.c($$1x) ? null : $$1x);
            if ($$3 != null) {
               a($$2, $$3.dz());
            } else {
               cM.warn("Failed to spawn player ender pearl in level ({}), skipping", $$1.get());
            }
         } else {
            cM.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$1.get());
         }
      }
   }

   public void a(int $$0) {
      float $$1 = this.gC();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cD = bcb.a($$0 / $$1, 0.0F, $$2);
      this.di = -1;
   }

   public void b(int $$0) {
      this.cB = $$0;
      this.di = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.di = -1;
   }

   @Override
   public void a(dcv $$0, int $$1) {
      super.a($$0, $$1);
      this.di = -1;
   }

   private void a(cym $$0) {
      $$0.a(this.dL);
      $$0.a(this.dK);
   }

   public void c() {
      this.a(this.cm);
   }

   @Override
   public void h_() {
      super.h_();
      this.g.b(aeu.a);
   }

   @Override
   public void P_() {
      super.P_();
      this.g.b(new aet(this.eY()));
   }

   @Override
   public void a(eeb $$0) {
      aq.e.a(this, $$0);
   }

   @Override
   protected dcs f() {
      return new ddt(this);
   }

   @Override
   public void g() {
      this.gU();
      this.h.a();
      this.dF.a();
      if (this.aw > 0) {
         this.aw--;
      }

      this.cn.d();
      if (!this.cn.b(this)) {
         this.p();
         this.cn = this.cm;
      }

      bzm $$0 = this.L();
      if ($$0 != this) {
         if ($$0.bO()) {
            this.a($$0.dC(), $$0.dE(), $$0.dI(), $$0.dP(), $$0.dR());
            this.y().n().a(this);
            if (this.gi()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      aq.x.a(this);
      if (this.dq != null) {
         aq.v.a(this, this.dq, this.as - this.dr);
      }

      this.k();
      this.l();
      this.hc();
      this.cX.a(this, true);
   }

   private void hc() {
      cbo $$0 = this.h(cbs.g);
      if ($$0 != null) {
         if (this.gI()) {
            $$0.a(cQ);
         } else {
            $$0.e(cQ);
         }
      }

      cbo $$1 = this.h(cbs.k);
      if ($$1 != null) {
         if (this.gI()) {
            $$1.a(cR);
         } else {
            $$1.e(cR);
         }
      }

      cbo $$2 = this.h(cbs.H);
      if ($$2 != null) {
         if (this.cl()) {
            $$2.a(cT);
         } else {
            $$2.e(cT);
         }
      }
   }

   public void h() {
      try {
         if (!this.am() || !this.dq()) {
            super.g();
         }

         for (int $$0 = 0; $$0 < this.gs().b(); $$0++) {
            dcv $$1 = this.gs().a($$0);
            if (!$$1.f()) {
               this.i($$1);
            }
         }

         if (this.eL() != this.df || this.dg != this.co.a() || this.co.c() == 0.0F != this.dh) {
            this.g.b(new age(this.eL(), this.co.a(), this.co.c()));
            this.df = this.eL();
            this.dg = this.co.a();
            this.dh = this.co.c() == 0.0F;
         }

         if (this.eL() + this.fD() != this.cZ) {
            this.cZ = this.eL() + this.fD();
            this.a(fka.h, bcb.f(this.cZ));
         }

         if (this.co.a() != this.da) {
            this.da = this.co.a();
            this.a(fka.i, bcb.f((float)this.da));
         }

         if (this.cw() != this.db) {
            this.db = this.cw();
            this.a(fka.j, bcb.f((float)this.db));
         }

         if (this.eX() != this.dc) {
            this.dc = this.eX();
            this.a(fka.k, bcb.f((float)this.dc));
         }

         if (this.cC != this.de) {
            this.de = this.cC;
            this.a(fka.l, bcb.f((float)this.de));
         }

         if (this.cB != this.dd) {
            this.dd = this.cB;
            this.a(fka.m, bcb.f((float)this.dd));
         }

         if (this.cC != this.di) {
            this.di = this.cC;
            this.g.b(new agd(this.cD, this.cC, this.cB));
         }

         if (this.as % 20 == 0) {
            aq.q.a(this);
         }
      } catch (Throwable var4) {
         p $$3 = p.a(var4, "Ticking player");
         q $$4 = $$3.a("Player being ticked");
         this.a($$4);
         throw new aa($$3);
      }
   }

   private void i(dcv $$0) {
      fce $$1 = $$0.a(kq.M);
      fcg $$2 = ddi.a($$1, this.y());
      if ($$2 != null) {
         zw<?> $$3 = $$2.a($$1, this);
         if ($$3 != null) {
            this.g.b($$3);
         }
      }
   }

   @Override
   protected void i() {
      if (this.y().an() == bxg.a && this.y().P().c(dmq.l)) {
         if (this.as % 20 == 0) {
            if (this.eL() < this.fa()) {
               this.d(1.0F);
            }

            float $$0 = this.co.c();
            if ($$0 < 20.0F) {
               this.co.b($$0 + 1.0F);
            }
         }

         if (this.as % 10 == 0 && this.co.b()) {
            this.co.a(this.co.a() + 1);
         }
      }
   }

   @Override
   public void j() {
      if (this.eL() > 0.0F && this.dv != null) {
         aq.Y.a(this, this.dv);
      }

      this.dv = null;
      super.j();
   }

   public void k() {
      if (this.am > 0.0 && this.dv == null) {
         this.dv = this.dv();
         if (this.cI != null && this.cI.e <= this.dv.e) {
            aq.af.a(this, this.cI, this.cJ);
         }
      }
   }

   @Override
   public void l() {
      if (this.dm() != null && this.dm().bA()) {
         if (this.dx == null) {
            this.dx = this.dv();
         } else {
            aq.Z.a(this, this.dx);
         }
      }

      if (this.dx != null && (this.dm() == null || !this.dm().bA())) {
         this.dx = null;
      }
   }

   private void a(fka $$0, int $$1) {
      this.gJ().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(byb $$0) {
      this.c(ejb.p);
      boolean $$1 = this.y().P().c(dmq.o);
      if ($$1) {
         xo $$2 = this.eY().a();
         this.g.a(new aev(this.ar(), $$2), wt.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xo $$3x = xo.a("death.attack.message_too_long", xo.b($$2x).a(o.o));
            xo $$4x = xo.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new xu.e($$3x)));
            return new aev(this.ar(), $$4x);
         }));
         fjz $$3 = this.cu();
         if ($$3 == null || $$3.l() == fjz.b.a) {
            this.cW.ag().a($$2, false);
         } else if ($$3.l() == fjz.b.c) {
            this.cW.ag().a(this, $$2);
         } else if ($$3.l() == fjz.b.d) {
            this.cW.ag().b(this, $$2);
         }
      } else {
         this.g.b(new aev(this.ar(), xn.a));
      }

      this.gH();
      if (this.y().P().c(dmq.P)) {
         this.hd();
      }

      if (!this.am()) {
         this.b(this.y(), $$0);
      }

      this.gJ().a(fka.e, this, fjv::b);
      cam $$4 = this.eZ();
      if ($$4 != null) {
         this.b(azj.h.b($$4.ap()));
         $$4.a(this, $$0);
         this.e($$4);
      }

      this.y().a(this, (byte)3);
      this.a(azj.O);
      this.a(azj.i.b(azj.m));
      this.a(azj.i.b(azj.n));
      this.aI();
      this.k(0);
      this.d(false);
      this.eY().c();
      this.a(Optional.of(jk.a(this.y().aj(), this.dx())));
      this.w(false);
   }

   private void hd() {
      fin $$0 = new fin(this.dx()).c(32.0, 10.0, 32.0);
      this.y().a(cao.class, $$0, bzt.f).stream().filter($$0x -> $$0x instanceof car).forEach($$0x -> ((car)$$0x).a_(this.y(), this));
   }

   @Override
   public void a(bzm $$0, byb $$1) {
      if ($$0 != this) {
         super.a($$0, $$1);
         this.gJ().a(fka.g, this, fjv::b);
         if ($$0 instanceof cut) {
            this.a(azj.R);
            this.gJ().a(fka.f, this, fjv::b);
         } else {
            this.a(azj.P);
         }

         this.a(this, $$0, fka.n);
         this.a($$0, this, fka.o);
         aq.c.a(this, $$0, $$1);
      }
   }

   private void a(fjw $$0, fjw $$1, fka[] $$2) {
      fjs $$3 = this.gJ().e($$1.cM());
      if ($$3 != null) {
         int $$4 = $$3.o().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gJ().a($$2[$$4], $$0, fjv::b);
         }
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         bzm $$3 = $$1.d();
         if ($$3 instanceof cut $$4 && !this.a($$4)) {
            return false;
         } else {
            return $$3 instanceof cvb $$5 && $$5.ah_() instanceof cut $$7 && !this.a($$7) ? false : super.a($$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(cut $$0) {
      return !this.he() ? false : super.a($$0);
   }

   private boolean he() {
      return this.cW.ac();
   }

   public fbl a(boolean $$0, fbl.a $$1) {
      auc.a $$2 = this.T();
      aub $$3 = this.cW.a(auc.a.b($$2));
      if ($$3 != null && $$2 != null) {
         Optional<auc.b> $$4 = a($$3, $$2, $$0);
         if ($$4.isPresent()) {
            auc.b $$5 = $$4.get();
            return new fbl($$3, $$5.a(), fis.c, $$5.b(), 0.0F, $$1);
         } else {
            return fbl.a(this.cW.J(), this, $$1);
         }
      } else {
         return new fbl(this.cW.J(), this, $$1);
      }
   }

   public boolean m() {
      return this.i(cbs.I) > 0.0;
   }

   @Override
   protected void a(jl<cbn> $$0) {
      if ($$0.a(cbs.I)) {
         ayv $$1 = this.y().h();
         if (this.fg().c($$0) > 0.0) {
            $$1.a(this);
         } else {
            $$1.c(this);
         }
      }

      super.a($$0);
   }

   private static Optional<auc.b> a(aub $$0, auc.a $$1, boolean $$2) {
      jb $$3 = $$1.c;
      float $$4 = $$1.d;
      boolean $$5 = $$1.e;
      eeb $$6 = $$0.a_($$3);
      dpz $$7 = $$6.b();
      if ($$7 instanceof dwp && ($$5 || $$6.c(dwp.d) > 0) && dwp.a($$0)) {
         Optional<fis> $$8 = dwp.a(bzv.bU, $$0, $$3);
         if (!$$5 && $$2 && $$8.isPresent()) {
            $$0.a($$3, $$6.b(dwp.d, $$6.c(dwp.d) - 1), 3);
         }

         return $$8.map($$1x -> auc.b.a($$1x, $$3));
      } else if ($$7 instanceof dps && dps.a($$0)) {
         return dps.a(bzv.bU, $$0, $$3, $$6.c(dps.f), $$4).map($$1x -> auc.b.a($$1x, $$3));
      } else if (!$$5) {
         return Optional.empty();
      } else {
         boolean $$9 = $$7.a($$6);
         eeb $$10 = $$0.a_($$3.d());
         boolean $$11 = $$10.b().a($$10);
         return $$9 && $$11 ? Optional.of(new auc.b(new fis($$3.u() + 0.5, $$3.v() + 0.1, $$3.w() + 0.5), $$4)) : Optional.empty();
      }
   }

   public void n() {
      this.an();
      this.y().a(this, bzm.e.e);
      if (!this.k) {
         this.k = true;
         this.g.b(new adx(adx.f, 0.0F));
         this.i = true;
      }
   }

   @Nullable
   public auc a(fbl $$0) {
      if (this.dU()) {
         return null;
      } else {
         if ($$0.g()) {
            this.g.b(new adx(adx.b, 0.0F));
         }

         aub $$1 = $$0.b();
         aub $$2 = this.y();
         amd<dmu> $$3 = $$2.aj();
         if (!$$0.h()) {
            this.ab();
         }

         if ($$1.aj() == $$3) {
            this.g.a(caz.a($$0), $$0.i());
            this.g.l();
            $$0.j().onTransition(this);
            return this;
         } else {
            this.do = true;
            fco $$4 = $$1.D_();
            this.g.b(new afi(this.b($$1), (byte)3));
            this.g.b(new adc($$4.q(), $$4.r()));
            ayb $$5 = this.cW.ag();
            $$5.d(this);
            $$2.a(this, bzm.e.e);
            this.dW();
            btt $$6 = bts.a();
            $$6.a("moving");
            if ($$3 == dmu.i && $$1.aj() == dmu.j) {
               this.dw = this.dv();
            }

            $$6.c();
            $$6.a("placing");
            this.a($$1);
            this.g.a(caz.a($$0), $$0.i());
            this.g.l();
            $$1.d(this);
            $$6.c();
            this.g($$2);
            this.fM();
            this.g.b(new aer(this.gt()));
            $$5.a(this, $$1);
            $$5.e(this);
            $$5.c(this);
            $$0.j().onTransition(this);
            this.di = -1;
            this.df = -1.0F;
            this.dg = -1;
            this.a($$0, $$2);
            return this;
         }
      }
   }

   @Override
   public void a(float $$0, float $$1) {
      this.g.b(new afa($$0, $$1));
   }

   private void g(aub $$0) {
      amd<dmu> $$1 = $$0.aj();
      amd<dmu> $$2 = this.y().aj();
      aq.w.a(this, $$1, $$2);
      if ($$1 == dmu.j && $$2 == dmu.i && this.dw != null) {
         aq.D.a(this, this.dw);
      }

      if ($$2 != dmu.j) {
         this.dw = null;
      }
   }

   @Override
   public boolean a(auc $$0) {
      if ($$0.am()) {
         return this.L() == this;
      } else {
         return this.am() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bzm $$0, int $$1) {
      super.a($$0, $$1);
      this.cn.d();
   }

   @Override
   public Either<cut.a, bdk> a(jb $$0) {
      jh $$1 = this.y().a_($$0).c(dub.f);
      if (this.fY() || !this.bO()) {
         return Either.left(cut.a.e);
      } else if (!this.y().G_().j()) {
         return Either.left(cut.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cut.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cut.a.d);
      } else {
         this.a(new auc.a(this.y().aj(), $$0, this.dP(), false), true);
         if (this.y().W()) {
            return Either.left(cut.a.b);
         } else {
            if (!this.gI()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               fis $$4 = fis.c($$0);
               List<crv> $$5 = this.y()
                  .a(
                     crv.class,
                     new fin($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0),
                     $$0x -> $$0x.a(this.y(), this)
                  );
               if (!$$5.isEmpty()) {
                  return Either.left(cut.a.f);
               }
            }

            Either<cut.a, bdk> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(azj.aq);
               aq.r.a(this);
            });
            if (!this.y().e()) {
               this.a(xo.c("sleep.not_possible"), true);
            }

            this.y().f();
            return $$6;
         }
      }
   }

   @Override
   public void b(jb $$0) {
      this.a(azj.i.b(azj.n));
      super.b($$0);
   }

   private boolean a(jb $$0, jh $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(jb $$0) {
      fis $$1 = fis.c($$0);
      return Math.abs(this.dC() - $$1.a()) <= 3.0 && Math.abs(this.dE() - $$1.b()) <= 2.0 && Math.abs(this.dI() - $$1.c()) <= 3.0;
   }

   private boolean b(jb $$0, jh $$1) {
      jb $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fY()) {
         this.y().n().a(this, new acs(this, 2));
      }

      super.a($$0, $$1);
      if (this.g != null) {
         this.g.a(this.dC(), this.dE(), this.dI(), this.dP(), this.dR());
      }
   }

   @Override
   public boolean a(aub $$0, byb $$1) {
      return super.a($$0, $$1) || this.Q() && !$$1.a(bye.m) || !this.gT();
   }

   @Override
   protected void b(aub $$0, jb $$1) {
      if (!this.am()) {
         super.b($$0, $$1);
      }
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
      if (this.dE && $$1 && this.am > 0.0) {
         fis $$4 = $$3.b().b(0.0, 0.5, 0.0);
         int $$5 = (int)bcb.a(50.0 * this.am, 0.0, 200.0);
         this.y().a(new lw(me.b, $$2), $$4.d, $$4.e, $$4.f, $$5, 0.3F, 0.3F, 0.3F, 0.15F);
         this.dE = false;
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(@Nullable bzm $$0) {
      super.a($$0);
      this.cI = this.dv();
      this.cJ = $$0;
      this.x($$0 != null && $$0.ap() == bzv.bJ);
   }

   @Override
   protected void o() {
      if (this.y().v().i()) {
         super.o();
      }
   }

   @Override
   public void a(ecn $$0, boolean $$1) {
      this.g.b(new acy(this.y(), $$0.aA_()));
      this.g.b(new aep($$0.aA_(), $$1));
   }

   @Override
   public void b(jl<art> $$0) {
      this.g.b(new aao($$0));
   }

   private void hf() {
      this.dO = this.dO % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bxm $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.cn != this.cm) {
            this.p();
         }

         this.hf();
         cym $$1 = $$0.createMenu(this.dO, this.gs(), this);
         if ($$1 == null) {
            if (this.am()) {
               this.a(xo.c("container.spectatorCantOpen").a(o.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.g.b(new aeo($$1.l, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.cn = $$1;
            return OptionalInt.of(this.dO);
         }
      }
   }

   @Override
   public void a(int $$0, dlr $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.g.b(new aej($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(coq $$0, bxc $$1) {
      if (this.cn != this.cm) {
         this.p();
      }

      this.hf();
      int $$2 = $$0.ac_();
      this.g.b(new ady(this.dO, $$2, $$0.ar()));
      this.cn = new czo(this.dO, this.gs(), $$1, $$0, $$2);
      this.a(this.cn);
   }

   @Override
   public void a(dcv $$0, bxi $$1) {
      if ($$0.c(kq.V)) {
         if (dgf.a($$0, this.A(), this)) {
            this.cn.d();
         }

         this.g.b(new aen($$1));
      }
   }

   @Override
   public void a(ebk $$0) {
      this.g.b(acw.a($$0, eaz::d));
   }

   @Override
   public void p() {
      this.g.b(new adj(this.cn.l));
      this.q();
   }

   @Override
   public void q() {
      this.cn.a(this);
      this.cm.a(this.cn);
      this.cn = this.cm;
   }

   @Override
   public void r() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.r();
      this.q(this.dC() - $$0, this.dE() - $$1, this.dI() - $$2);
   }

   public void a(double $$0, double $$1, double $$2) {
      if (!this.cc() && !r($$0, $$1, $$2)) {
         if (this.cn()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(azj.D, $$3);
               this.a(0.01F * $$3 * 0.01F);
            }
         } else if (this.a(azu.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(azj.w, $$4);
               this.a(0.01F * $$4 * 0.01F);
            }
         } else if (this.bm()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(azj.s, $$5);
               this.a(0.01F * $$5 * 0.01F);
            }
         } else if (this.eV()) {
            if ($$1 > 0.0) {
               this.a(azj.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aK()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cm()) {
                  this.a(azj.r, $$6);
                  this.a(0.1F * $$6 * 0.01F);
               } else if (this.cl()) {
                  this.a(azj.q, $$6);
                  this.a(0.0F * $$6 * 0.01F);
               } else {
                  this.a(azj.p, $$6);
                  this.a(0.0F * $$6 * 0.01F);
               }
            }
         } else if (this.fQ()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(azj.C, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(azj.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.cc() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bzm $$4 = this.dm();
         if ($$4 instanceof cxg) {
            this.a(azj.x, $$3);
         } else if ($$4 instanceof cxe) {
            this.a(azj.y, $$3);
         } else if ($$4 instanceof cna) {
            this.a(azj.z, $$3);
         } else if ($$4 instanceof coq) {
            this.a(azj.B, $$3);
         } else if ($$4 instanceof csi) {
            this.a(azj.E, $$3);
         } else if ($$4 instanceof cmt) {
            this.a(azj.A, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(azg<?> $$0, int $$1) {
      this.cY.b(this, $$0, $$1);
      this.gJ().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(azg<?> $$0) {
      this.cY.a(this, $$0, 0);
      this.gJ().a($$0, this, fjv::c);
   }

   @Override
   public int a(Collection<dhr<?>> $$0) {
      return this.dp.a($$0, this);
   }

   @Override
   public void a(dhr<?> $$0, List<dcv> $$1) {
      aq.ad.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<amd<dhm<?>>> $$0) {
      List<dhr<?>> $$1 = $$0.stream().flatMap($$0x -> this.cW.aI().b($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<dhr<?>> $$0) {
      return this.dp.b($$0, this);
   }

   @Override
   public void s() {
      super.s();
      this.a(azj.F);
      if (this.cm()) {
         this.a(0.2F);
      } else {
         this.a(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.di = -1;
   }

   public void t() {
      this.ds = true;
      this.bR();
      if (this.fY()) {
         this.a(true, false);
      }
   }

   public boolean u() {
      return this.ds;
   }

   public void v() {
      this.df = -1.0E8F;
   }

   @Override
   public void a(xo $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void w() {
      if (!this.bI.f() && this.fG()) {
         this.g.b(new adt(this, (byte)9));
         super.w();
      }
   }

   @Override
   public void a(ex.a $$0, fis $$1) {
      super.a($$0, $$1);
      this.g.b(new aey($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ex.a $$0, bzm $$1, ex.a $$2) {
      fis $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.g.b(new aey($$0, $$1, $$2));
   }

   public void a(auc $$0, boolean $$1) {
      this.dF = $$0.dF;
      this.dM = $$0.dM;
      this.h.a($$0.h.b(), $$0.h.c());
      this.x();
      if ($$1) {
         this.fg().b($$0.fg());
         this.fg().c($$0.fg());
         this.x($$0.eL());
         this.co = $$0.co;

         for (byq $$2 : $$0.eI()) {
            this.a(new byq($$2));
         }

         this.gs().a($$0.gs());
         this.cB = $$0.cB;
         this.cC = $$0.cC;
         this.cD = $$0.cD;
         this.q($$0.gm());
         this.aF = $$0.aF;
      } else {
         this.fg().b($$0.fg());
         this.x(this.fa());
         if (this.y().P().c(dmq.e) || $$0.am()) {
            this.gs().a($$0.gs());
            this.cB = $$0.cB;
            this.cC = $$0.cC;
            this.cD = $$0.cD;
            this.q($$0.gm());
         }
      }

      this.cE = $$0.cE;
      this.cl = $$0.cl;
      this.au().a(cg, $$0.au().a(cg));
      this.di = -1;
      this.df = -1.0F;
      this.dg = -1;
      this.dp.a($$0.dp);
      this.i = $$0.i;
      this.dw = $$0.dw;
      this.dz = $$0.dz;
      this.b($$0.gL());
      this.c($$0.gM());
      this.a($$0.gS());
   }

   @Override
   protected void a(byq $$0, @Nullable bzm $$1) {
      super.a($$0, $$1);
      this.g.b(new ahf(this.ar(), $$0, true));
      if ($$0.a(bys.y)) {
         this.dr = this.as;
         this.dq = this.dv();
      }

      aq.B.a(this, $$1);
   }

   @Override
   protected void a(byq $$0, boolean $$1, @Nullable bzm $$2) {
      super.a($$0, $$1, $$2);
      this.g.b(new ahf(this.ar(), $$0, false));
      aq.B.a(this, $$2);
   }

   @Override
   protected void c(Collection<byq> $$0) {
      super.c($$0);

      for (byq $$1 : $$0) {
         this.g.b(new afg(this.ar(), $$1.c()));
         if ($$1.a(bys.y)) {
            this.dq = null;
         }
      }

      aq.B.a(this, null);
   }

   @Override
   public void b(double $$0, double $$1, double $$2) {
      this.g.a(new caz(new fis($$0, $$1, $$2), fis.c, 0.0F, 0.0F), cba.a(cba.l, cba.k));
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.g.a(new caz(new fis($$0, $$1, $$2), fis.c, 0.0F, 0.0F), cba.j);
   }

   @Override
   public boolean a(aub $$0, double $$1, double $$2, double $$3, Set<cba> $$4, float $$5, float $$6, boolean $$7) {
      if (this.fY()) {
         this.a(true, true);
      }

      if ($$7) {
         this.d(this);
      }

      boolean $$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         this.r($$4.contains(cba.d) ? this.cE() + $$5 : $$5);
      }

      return $$8;
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      super.d($$0, $$1, $$2);
      this.g.l();
   }

   @Override
   public void b(bzm $$0) {
      this.y().n().a(this, new acs($$0, 4));
   }

   @Override
   public void c(bzm $$0) {
      this.y().n().a(this, new acs($$0, 5));
   }

   @Override
   public void x() {
      if (this.g != null) {
         this.g.b(new aer(this.gt()));
         this.K();
      }
   }

   public aub y() {
      return (aub)super.ai();
   }

   public boolean a(dmr $$0) {
      boolean $$1 = this.am();
      if (!this.h.a($$0)) {
         return false;
      } else {
         this.g.b(new adx(adx.e, $$0.a()));
         if ($$0 == dmr.d) {
            this.gH();
            this.bS();
            djk.a(this);
         } else {
            this.d(this);
            if ($$1) {
               djk.a(this.y(), this);
            }
         }

         this.x();
         this.fE();
         return true;
      }
   }

   @Nonnull
   @Override
   public dmr a() {
      return this.h.b();
   }

   public ej z() {
      return this.dN;
   }

   public ek A() {
      return new ek(this.z(), this.dv(), this.bX(), this.y(), this.G(), this.aj().getString(), this.Q_(), this.cW, this);
   }

   public void a(xo $$0) {
      this.b($$0, false);
   }

   public void b(xo $$0, boolean $$1) {
      if (this.y($$1)) {
         this.g.a(new agu($$0, $$1), wt.a(() -> {
            if (this.y(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xo $$3 = xo.b($$2).a(o.o);
               return new agu(xo.a("multiplayer.message_not_delivered", $$3).a(o.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(yd $$0, boolean $$1, xk.a $$2) {
      if (this.hg()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String B() {
      return this.g.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(atl $$0) {
      this.du = $$0.b();
      this.dt = $$0.c();
      this.dj = $$0.d();
      this.dl = $$0.e();
      this.dC = $$0.h();
      this.dD = $$0.i();
      this.dk = $$0.j();
      this.au().a(cg, (byte)$$0.f());
      this.au().a(ch, (byte)$$0.g().b());
   }

   public atl C() {
      int $$0 = this.au().a(cg);
      cad $$1 = cad.d.apply(this.au().a(ch));
      return new atl(this.du, this.dt, this.dj, this.dl, $$0, $$1, this.dC, this.dD, this.dk);
   }

   public boolean D() {
      return this.dl;
   }

   public cuq E() {
      return this.dj;
   }

   private boolean y(boolean $$0) {
      return this.dj == cuq.c ? $$0 : true;
   }

   private boolean hg() {
      return this.dj == cuq.a;
   }

   public int F() {
      return this.dt;
   }

   public void a(alb $$0) {
      this.g.b(new afm($$0.a(), $$0.d().map(alb.a::a)));
   }

   @Override
   public int G() {
      return this.cW.c(this.gr());
   }

   @Override
   public void H() {
      this.dm = ag.c();
   }

   public azf I() {
      return this.cY;
   }

   public aze J() {
      return this.dp;
   }

   @Override
   protected void K() {
      if (this.am()) {
         this.eG();
         this.l(true);
      } else {
         super.K();
      }
   }

   public bzm L() {
      return (bzm)(this.dn == null ? this : this.dn);
   }

   @Override
   public void d(@Nullable bzm $$0) {
      bzm $$1 = this.L();
      this.dn = (bzm)($$0 == null ? this : $$0);
      if ($$1 != this.dn) {
         if (this.dn.ai() instanceof aub $$2) {
            this.a($$2, this.dn.dC(), this.dn.dE(), this.dn.dI(), Set.of(), this.dP(), this.dR(), false);
         }

         if ($$0 != null) {
            this.y().n().a(this);
         }

         this.g.b(new aft(this.dn));
         this.g.l();
      }
   }

   @Override
   protected void M() {
      if (!this.do) {
         super.M();
      }
   }

   @Override
   public void e(bzm $$0) {
      if (this.am()) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long N() {
      return this.dm;
   }

   @Nullable
   public xo O() {
      return null;
   }

   public int P() {
      return 0;
   }

   @Override
   public void a(bxi $$0) {
      super.a($$0);
      this.gO();
   }

   public boolean Q() {
      return this.do;
   }

   public void R() {
      this.do = false;
   }

   public amm S() {
      return this.cX;
   }

   @Nullable
   public auc.a T() {
      return this.dA;
   }

   public void b(auc $$0) {
      this.a($$0.dA, false);
   }

   public void a(@Nullable auc.a $$0, boolean $$1) {
      if ($$1 && $$0 != null && !$$0.a(this.dA)) {
         this.a(cS);
      }

      this.dA = $$0;
   }

   public ke U() {
      return this.dy;
   }

   public void a(ke $$0) {
      this.dy = $$0;
   }

   public atk V() {
      return this.dz;
   }

   public void a(atk $$0) {
      this.dz = $$0;
   }

   @Override
   public void a(ayy $$0, aza $$1, float $$2, float $$3) {
      this.g.b(new agr(mm.b.e($$0), $$1, this.dC(), this.dE(), this.dI(), $$2, $$3, this.ar.g()));
   }

   @Override
   public cqz a(dcv $$0, boolean $$1, boolean $$2) {
      cqz $$3 = super.a($$0, $$1, $$2);
      if ($$2) {
         dcv $$4 = $$3 != null ? $$3.e() : dcv.l;
         if (!$$4.f()) {
            this.a(azj.f.b($$4.h()), $$0.M());
            this.a(azj.G);
         }
      }

      return $$3;
   }

   public avl W() {
      return this.dB;
   }

   public void a(aub $$0) {
      this.a((dmu)$$0);
      this.h.a($$0);
   }

   @Nullable
   private static dmr a(@Nullable fda $$0, String $$1) {
      return $$0 != null ? $$0.<dmr>a($$1, dmr.h).orElse(null) : null;
   }

   private dmr b(@Nullable dmr $$0) {
      dmr $$1 = this.cW.bd();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.cW.u();
      }
   }

   public void d(@Nullable fda $$0) {
      this.h.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void g(fdc $$0) {
      $$0.a("playerGameType", dmr.h, this.h.b());
      dmr $$1 = this.h.c();
      $$0.b("previousPlayerGameType", dmr.h, $$1);
   }

   @Override
   public boolean X() {
      return this.dC;
   }

   public boolean c(auc $$0) {
      return $$0 == this ? false : this.dC || $$0.dC;
   }

   @Override
   public boolean c(aub $$0, jb $$1) {
      return super.c($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(dcv $$0) {
      aq.X.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cus $$1 = this.gs();
      dcv $$2 = $$1.a($$0);
      this.cn.b($$1, $$1.f()).ifPresent($$1x -> this.cn.a($$1x, $$1.g()));
      return this.a($$2, false, true) != null;
   }

   @Override
   public void b(dcv $$0) {
      if (!this.gs().g($$0)) {
         this.a($$0, false);
      }
   }

   public boolean Y() {
      return this.dD;
   }

   @Override
   public Optional<cty> Z() {
      return Optional.of(this.dF);
   }

   public void b(boolean $$0) {
      this.dE = $$0;
   }

   @Override
   public void a(cqz $$0) {
      super.a($$0);
      bzm $$1 = $$0.ah_();
      if ($$1 != null) {
         aq.S.a(this, $$0.e(), $$1);
      }
   }

   public void a(yf $$0) {
      this.dM = $$0;
   }

   @Nullable
   public yf aa() {
      return this.dM != null && this.dM.b() ? null : this.dM;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cH = (float)(bcb.d($$1, $$0) * 180.0F / (float)Math.PI - this.dP());
      this.g.b(new adz(this));
   }

   @Override
   public boolean a(bzm $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.k(this);
         this.g.a(new caz(this.dv(), fis.c, 0.0F, 0.0F), cba.k);
         if ($$0 instanceof cam $$2) {
            this.cW.ag().a($$2, this.g);
         }

         this.g.b(new agh($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void ab() {
      bzm $$0 = this.dm();
      super.ab();
      if ($$0 instanceof cam $$1) {
         for (byq $$2 : $$1.eI()) {
            this.g.b(new afg($$0.ar(), $$2.c()));
         }
      }

      if ($$0 != null) {
         this.g.b(new agh($$0));
      }
   }

   public ahh b(aub $$0) {
      return new ahh($$0.ai(), $$0.aj(), dnz.a($$0.F()), this.h.b(), this.h.c(), $$0.ak(), $$0.E(), this.gS(), this.aC(), $$0.Q());
   }

   @Override
   public void c(jb $$0) {
      this.dG = $$0;
   }

   public void ac() {
      this.dG = null;
   }

   @Nullable
   public jb ad() {
      return this.dG;
   }

   @Override
   public fis ae() {
      bzm $$0 = this.dm();
      return $$0 != null && $$0.cY() != this ? $$0.ae() : this.dH;
   }

   @Override
   public void a(fis $$0) {
      this.dH = $$0;
   }

   @Override
   protected float a(bzm $$0, float $$1, byb $$2) {
      return djk.a(this.y(), this.ed(), $$0, $$2, $$1);
   }

   @Override
   public void a(dcr $$0, bzw $$1) {
      super.a($$0, $$1);
      this.b(azj.d.b($$0));
   }

   public cur af() {
      return this.dI;
   }

   public void a(cur $$0) {
      this.dI = $$0;
   }

   public fis ag() {
      float $$0 = this.dI.c() == this.dI.d() ? 0.0F : (this.dI.c() ? 1.0F : -1.0F);
      float $$1 = this.dI.a() == this.dI.b() ? 0.0F : (this.dI.a() ? 1.0F : -1.0F);
      return a(new fis($$0, 0.0, $$1), 1.0F, this.dP());
   }

   public void a(cvy $$0) {
      this.dJ.add($$0);
   }

   public void b(cvy $$0) {
      this.dJ.remove($$0);
   }

   public Set<cvy> ah() {
      return this.dJ;
   }

   public long c(cvy $$0) {
      if ($$0.ai() instanceof aub $$1) {
         dlz $$2 = $$0.dz();
         this.a($$0);
         $$1.j();
         return a($$1, $$2) - 1L;
      } else {
         return 0L;
      }
   }

   public static long a(aub $$0, dlz $$1) {
      $$0.n().a(aui.h, $$1, 2);
      return aui.h.d();
   }

   public record a(amd<dmu> b, jb c, float d, boolean e) {
      public static final Codec<auc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               dmu.h.optionalFieldOf("dimension", dmu.i).forGetter(auc.a::a),
               jb.a.fieldOf("pos").forGetter(auc.a::b),
               Codec.FLOAT.optionalFieldOf("angle", 0.0F).forGetter(auc.a::c),
               Codec.BOOL.optionalFieldOf("forced", false).forGetter(auc.a::d)
            )
            .apply($$0, auc.a::new)
      );

      static amd<dmu> b(@Nullable auc.a $$0) {
         return $$0 != null ? $$0.a() : dmu.i;
      }

      public boolean a(@Nullable auc.a $$0) {
         return $$0 != null && this.b == $$0.b && this.c.equals($$0.c);
      }

      public amd<dmu> a() {
         return this.b;
      }

      public jb b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }

   record b(fis a, float b) {
      public static auc.b a(fis $$0, jb $$1) {
         return new auc.b($$0, b($$0, $$1));
      }

      private static float b(fis $$0, jb $$1) {
         fis $$2 = fis.c($$1).d($$0).d();
         return (float)bcb.d(bcb.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
