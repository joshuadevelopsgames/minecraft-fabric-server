import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class ayb {
   public static final File a = new File("banned-players.json");
   public static final File b = new File("banned-ips.json");
   public static final File c = new File("ops.json");
   public static final File d = new File("whitelist.json");
   public static final xo e = xo.c("chat.filtered_full");
   public static final xo f = xo.c("multiplayer.disconnect.duplicate_login");
   private static final Logger h = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<auc> l = Lists.newArrayList();
   private final Map<UUID, auc> m = Maps.newHashMap();
   private final ayh n = new ayh(a);
   private final axy o = new axy(b);
   private final ayc p = new ayc(c);
   private final ayj q = new ayj(d);
   private final Map<UUID, azf> r = Maps.newHashMap();
   private final Map<UUID, amm> s = Maps.newHashMap();
   private final fcv t;
   private boolean u;
   private final js<amn> v;
   protected final int g;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public ayb(MinecraftServer $$0, js<amn> $$1, fcv $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.g = $$3;
      this.t = $$2;
   }

   public void a(wd $$0, auc $$1, aur $$2) {
      GameProfile $$3 = $$1.gr();
      axx $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      try (bci.j $$8 = new bci.j($$1.ef(), h)) {
         Optional<fda> $$9 = this.a($$1, $$8);
         amd<dmu> $$10 = $$9.<amd<dmu>>flatMap($$0x -> $$0x.a("Dimension", dmu.h)).orElse(dmu.i);
         aub $$11 = this.k.a($$10);
         aub $$12;
         if ($$11 == null) {
            h.warn("Unknown respawn dimension {}, defaulting to overworld", $$10);
            $$12 = this.k.J();
         } else {
            $$12 = $$11;
         }

         $$1.a($$12);
         if ($$9.isEmpty()) {
            $$1.b($$1.a($$12, $$12.ab()).c(), $$12.ac(), 0.0F);
         }

         $$12.a($$1.dz(), 1);
         String $$14 = $$0.a(this.k.bl());
         h.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.aj().getString(), $$14, $$1.ar(), $$1.dC(), $$1.dE(), $$1.dI()});
         fco $$15 = $$12.D_();
         $$1.d($$9.orElse(null));
         avf $$16 = new avf(this.k, $$0, $$1, $$2);
         $$0.a(ahl.b.a(wx.a(this.k.ba()), $$16), $$16);
         dmq $$17 = $$12.P();
         boolean $$18 = $$17.c(dmq.F);
         boolean $$19 = $$17.c(dmq.r);
         boolean $$20 = $$17.c(dmq.y);
         $$16.b(new aeh($$1.ar(), $$15.l(), this.k.K(), this.n(), this.w, this.x, $$19, !$$18, $$20, $$1.b($$12), this.k.aA()));
         $$16.b(new adc($$15.q(), $$15.r()));
         $$16.b(new aer($$1.gt()));
         $$16.b(new agf($$1.gs().f()));
         dht $$21 = this.k.aI();
         $$16.b(new ahg($$21.b(), $$21.c()));
         this.d($$1);
         $$1.I().c();
         $$1.J().a($$1);
         this.a($$12.g(), $$1);
         this.k.av();
         yc $$22;
         if ($$1.gr().getName().equalsIgnoreCase($$6)) {
            $$22 = xo.a("multiplayer.player.joined", $$1.Q_());
         } else {
            $$22 = xo.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
         }

         this.a($$22.a(o.o), false);
         $$16.a($$1.dC(), $$1.dE(), $$1.dI(), $$1.dP(), $$1.dR());
         alb $$24 = this.k.au();
         if ($$24 != null && !$$2.d()) {
            $$1.a($$24);
         }

         $$1.g.b(aex.a(this.l));
         this.l.add($$1);
         this.m.put($$1.cK(), $$1);
         this.a(aex.a(List.of($$1)));
         this.a($$1, $$12);
         $$12.a($$1);
         this.k.aM().a($$1);
         this.c($$1);
         $$9.ifPresent($$1x -> {
            $$1.c($$1x);
            $$1.b($$1x);
         });
         $$1.c();
      }
   }

   protected void a(amx $$0, auc $$1) {
      Set<fjp> $$2 = Sets.newHashSet();

      for (fjs $$3 : $$0.f()) {
         $$1.g.b(agj.a($$3, true));
      }

      for (fjo $$4 : fjo.values()) {
         fjp $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zw<?> $$7 : $$0.d($$5)) {
               $$1.g.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aub $$0) {
      $$0.F_().a(new efr() {
         @Override
         public void a(eft $$0, double $$1) {
            ayb.this.a(new afq($$0));
         }

         @Override
         public void a(eft $$0, double $$1, double $$2, long $$3) {
            ayb.this.a(new afp($$0));
         }

         @Override
         public void a(eft $$0, double $$1, double $$2) {
            ayb.this.a(new afo($$0));
         }

         @Override
         public void a(eft $$0, int $$1) {
            ayb.this.a(new afr($$0));
         }

         @Override
         public void b(eft $$0, int $$1) {
            ayb.this.a(new afs($$0));
         }

         @Override
         public void b(eft $$0, double $$1) {
         }

         @Override
         public void c(eft $$0, double $$1) {
         }
      });
   }

   public Optional<fda> a(auc $$0, bci $$1) {
      ui $$2 = this.k.aZ().w();
      Optional<fda> $$4;
      if (this.k.a($$0.gr()) && $$2 != null) {
         fda $$3 = fcy.a($$1, $$0.eb(), $$2);
         $$4 = Optional.of($$3);
         $$0.e($$3);
         h.debug("loading single player");
      } else {
         $$4 = this.t.a($$0, $$1);
      }

      return $$4;
   }

   protected void a(auc $$0) {
      this.t.a($$0);
      azf $$1 = this.r.get($$0.cK());
      if ($$1 != null) {
         $$1.a();
      }

      amm $$2 = this.s.get($$0.cK());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void b(auc $$0) {
      aub $$1 = $$0.y();
      $$0.a(azj.j);
      this.a($$0);
      if ($$0.cc()) {
         bzm $$2 = $$0.dh();
         if ($$2.dg()) {
            h.debug("Removing player mount");
            $$0.bS();
            $$2.dd().forEach($$0x -> $$0x.c(bzm.e.d));
         }
      }

      $$0.an();

      for (cvy $$3 : $$0.ah()) {
         $$3.c(bzm.e.d);
      }

      $$1.a($$0, bzm.e.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aM().b($$0);
      UUID $$4 = $$0.cK();
      auc $$5 = this.m.get($$4);
      if ($$5 == $$0) {
         this.m.remove($$4);
         this.r.remove($$4);
         this.s.remove($$4);
      }

      this.a(new aew(List.of($$0.cK())));
   }

   @Nullable
   public xo a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         ayi $$2 = this.n.b($$1);
         yc $$3 = xo.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(xo.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xo.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         axz $$4 = this.o.b($$0);
         yc $$5 = xo.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(xo.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.g && !this.d($$1) ? xo.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<auc> $$2 = Sets.newIdentityHashSet();

      for (auc $$3 : this.l) {
         if ($$3.cK().equals($$1)) {
            $$2.add($$3);
         }
      }

      auc $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (auc $$5 : $$2) {
         $$5.g.a(f);
      }

      return !$$2.isEmpty();
   }

   public auc a(auc $$0, boolean $$1, bzm.e $$2) {
      this.l.remove($$0);
      $$0.y().a($$0, $$2);
      fbl $$3 = $$0.a(!$$1, fbl.a);
      aub $$4 = $$3.b();
      auc $$5 = new auc(this.k, $$4, $$0.gr(), $$0.C());
      $$5.g = $$0.g;
      $$5.a($$0, $$1);
      $$5.e($$0.ar());
      $$5.b($$0.fF());
      if (!$$3.g()) {
         $$5.b($$0);
      }

      for (String $$6 : $$0.as()) {
         $$5.a($$6);
      }

      fis $$7 = $$3.c();
      $$5.b($$7.d, $$7.e, $$7.f, $$3.e(), $$3.f());
      if ($$3.g()) {
         $$5.g.b(new adx(adx.b, 0.0F));
      }

      byte $$8 = (byte)($$1 ? 1 : 0);
      aub $$9 = $$5.y();
      fco $$10 = $$9.D_();
      $$5.g.b(new afi($$5.b($$9), $$8));
      $$5.g.a($$5.dC(), $$5.dE(), $$5.dI(), $$5.dP(), $$5.dR());
      $$5.g.b(new afx($$4.ab(), $$4.ac()));
      $$5.g.b(new adc($$10.q(), $$10.r()));
      $$5.g.b(new agd($$5.cD, $$5.cC, $$5.cB));
      this.c($$5);
      this.a($$5, $$4);
      this.d($$5);
      $$4.b($$5);
      this.l.add($$5);
      this.m.put($$5.cK(), $$5);
      $$5.c();
      $$5.x($$5.eL());
      auc.a $$11 = $$5.T();
      if (!$$1 && $$11 != null) {
         aub $$12 = this.k.a($$11.a());
         if ($$12 != null) {
            jb $$13 = $$11.b();
            eeb $$14 = $$12.a_($$13);
            if ($$14.a(dqb.pU)) {
               $$5.g.b(new agr(ayz.wL, aza.e, $$13.u(), $$13.v(), $$13.w(), 1.0F, 1.0F, $$4.H_().g()));
            }
         }
      }

      return $$5;
   }

   public void c(auc $$0) {
      this.a($$0, $$0.g);
   }

   public void a(cam $$0, avf $$1) {
      for (byq $$2 : $$0.eI()) {
         $$1.b(new ahf($$0.ar(), $$2, false));
      }
   }

   public void d(auc $$0) {
      GameProfile $$1 = $$0.gr();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aex(EnumSet.of(aex.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zw<?> $$0) {
      for (auc $$1 : this.l) {
         $$1.g.b($$0);
      }
   }

   public void a(zw<?> $$0, amd<dmu> $$1) {
      for (auc $$2 : this.l) {
         if ($$2.y().aj() == $$1) {
            $$2.g.b($$0);
         }
      }
   }

   public void a(cut $$0, xo $$1) {
      fjz $$2 = $$0.cu();
      if ($$2 != null) {
         for (String $$4 : $$2.h()) {
            auc $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cut $$0, xo $$1) {
      fjz $$2 = $$0.cu();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            auc $$4 = this.l.get($$3);
            if ($$4.cu() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gr().getName();
      }

      return $$0;
   }

   public ayh f() {
      return this.n;
   }

   public axy g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new ayd($$0, this.k.k(), this.p.a($$0)));
      auc $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      auc $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(auc $$0, int $$1) {
      if ($$0.g != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.g.b(new adt($$0, $$2));
      }

      this.k.aG().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.aZ().m() || this.y;
   }

   @Nullable
   public auc a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         auc $$3 = this.l.get($$2);
         if ($$3.gr().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cut $$0, double $$1, double $$2, double $$3, double $$4, amd<dmu> $$5, zw<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         auc $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.y().aj() == $$5) {
            double $$9 = $$1 - $$8.dC();
            double $$10 = $$2 - $$8.dE();
            double $$11 = $$3 - $$8.dI();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.g.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.a(this.l.get($$0));
      }
   }

   public ayj i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public ayc k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(auc $$0, aub $$1) {
      eft $$2 = this.k.J().F_();
      $$0.g.b(new aea($$2));
      $$0.g.b(new agn($$1.ae(), $$1.af(), $$1.P().c(dmq.m)));
      $$0.g.b(new afx($$1.ab(), $$1.ac()));
      if ($$1.ah()) {
         $$0.g.b(new adx(adx.c, 0.0F));
         $$0.g.b(new adx(adx.i, $$1.d(1.0F)));
         $$0.g.b(new adx(adx.j, $$1.b(1.0F)));
      }

      $$0.g.b(new adx(adx.o, 0.0F));
      this.k.aP().a($$0);
   }

   public void e(auc $$0) {
      $$0.cm.b();
      $$0.v();
      $$0.g.b(new agf($$0.gs().f()));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.g;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<auc> b(String $$0) {
      List<auc> $$1 = Lists.newArrayList();

      for (auc $$2 : this.l) {
         if ($$2.B().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.w;
   }

   public int q() {
      return this.x;
   }

   public MinecraftServer c() {
      return this.k;
   }

   @Nullable
   public ui r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).g.a(xo.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xo $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xo $$0, Function<auc, xo> $$1, boolean $$2) {
      this.k.a($$0);

      for (auc $$3 : this.l) {
         xo $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(ye $$0, ek $$1, xk.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(ye $$0, auc $$1, xk.a $$2) {
      this.a($$0, $$1::c, $$1, $$2);
   }

   private void a(ye $$0, Predicate<auc> $$1, @Nullable auc $$2, xk.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      yd $$5 = yd.a($$0);
      boolean $$6 = false;

      for (auc $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(e);
      }
   }

   private boolean a(ye $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public azf a(cut $$0) {
      UUID $$1 = $$0.cK();
      azf $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(fcq.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.aj().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (w.a($$6) && w.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new azf(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public amm f(auc $$0) {
      UUID $$1 = $$0.cK();
      amm $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(fcq.a).resolve($$1 + ".json");
         $$2 = new amm(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new afv($$0));

      for (aub $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.n().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new agl($$0));

      for (aub $$1 : this.k.L()) {
         if ($$1 != null) {
            $$1.n().b($$0);
         }
      }
   }

   public List<auc> t() {
      return this.l;
   }

   @Nullable
   public auc a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (amm $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new aar(bag.a(this.v)));
      dht $$1 = this.k.aI();
      ahg $$2 = new ahg($$1.b(), $$1.c());

      for (auc $$3 : this.l) {
         $$3.g.b($$2);
         $$3.J().a($$3);
      }
   }

   public boolean v() {
      return this.y;
   }
}
