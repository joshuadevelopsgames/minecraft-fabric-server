import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eib {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 1200;
   private static final int f = 100;
   public static final int a = 20;
   private static final int g = 8;
   public static final int b = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int c = 128;
   private final Predicate<bzm> j;
   private final atx k = (atx)new atx(xo.c("entity.minecraft.ender_dragon"), bwz.a.a, bwz.b.a).b(true).c(true);
   private final aub l;
   private final jb m;
   private final ObjectArrayList<Integer> n = new ObjectArrayList();
   private final eeg o;
   private int p;
   private int q;
   private int r;
   private int s = 21;
   private boolean t;
   private boolean u;
   private boolean v = false;
   @Nullable
   private UUID w;
   private boolean x = true;
   @Nullable
   private jb y;
   @Nullable
   private eia z;
   private int A;
   @Nullable
   private List<cpr> B;

   public eib(aub $$0, long $$1, eib.a $$2) {
      this($$0, $$1, $$2, jb.c);
   }

   public eib(aub $$0, long $$1, eib.a $$2, jb $$3) {
      this.l = $$0;
      this.m = $$3;
      this.j = bzt.a.and(bzt.a($$3.u(), 128 + $$3.v(), $$3.w(), 192.0));
      this.x = $$2.c;
      this.w = $$2.g.orElse(null);
      this.t = $$2.d;
      this.u = $$2.e;
      if ($$2.f) {
         this.z = eia.a;
      }

      this.y = $$2.h.orElse(null);
      this.n.addAll($$2.i.orElseGet(() -> {
         ObjectArrayList<Integer> $$1x = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ag.c($$1x, bck.a($$1));
         return $$1x;
      }));
      this.o = eeh.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', eef.a(eej.a(dqb.I)))
         .b();
   }

   @Deprecated
   @VisibleForTesting
   public void a() {
      this.v = true;
   }

   public eib.a b() {
      return new eib.a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
   }

   public void c() {
      this.k.d(!this.t);
      if (++this.s >= 20) {
         this.o();
         this.s = 0;
      }

      if (!this.k.h().isEmpty()) {
         this.l.n().a(aui.c, new dlz(0, 0), 9);
         boolean $$0 = this.n();
         if (this.x && $$0) {
            this.j();
            this.x = false;
         }

         if (this.z != null) {
            if (this.B == null && $$0) {
               this.z = null;
               this.g();
            }

            this.z.a(this.l, this, this.B, this.A++, this.y);
         }

         if (!this.t) {
            if ((this.w == null || ++this.p >= 1200) && $$0) {
               this.k();
               this.p = 0;
            }

            if (++this.r >= 100 && $$0) {
               this.p();
               this.r = 0;
            }
         }
      } else {
         this.l.n().b(aui.c, new dlz(0, 0), 9);
      }
   }

   private void j() {
      d.info("Scanning for legacy world dragon fight...");
      boolean $$0 = this.l();
      if ($$0) {
         d.info("Found that the dragon has been killed in this world already.");
         this.u = true;
      } else {
         d.info("Found that the dragon has not yet been killed in this world.");
         this.u = false;
         if (this.m() == null) {
            this.a(false);
         }
      }

      List<? extends cps> $$1 = this.l.k();
      if ($$1.isEmpty()) {
         this.t = true;
      } else {
         cps $$2 = $$1.get(0);
         this.w = $$2.cK();
         d.info("Found that there's a dragon still alive ({})", $$2);
         this.t = false;
         if (!$$0) {
            d.info("But we didn't have a portal, let's remove it.");
            $$2.at();
            this.w = null;
         }
      }

      if (!this.u && this.t) {
         this.t = false;
      }
   }

   private void k() {
      List<? extends cps> $$0 = this.l.k();
      if ($$0.isEmpty()) {
         d.debug("Haven't seen the dragon, respawning it");
         this.r();
      } else {
         d.debug("Haven't seen our dragon, but found another one to use.");
         this.w = $$0.get(0).cK();
      }
   }

   protected void a(eia $$0) {
      if (this.z == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.A = 0;
         if ($$0 == eia.e) {
            this.z = null;
            this.t = false;
            cps $$1 = this.r();
            if ($$1 != null) {
               for (auc $$2 : this.k.h()) {
                  aq.o.a($$2, $$1);
               }
            }
         } else {
            this.z = $$0;
         }
      }
   }

   private boolean l() {
      for (int $$0 = -8; $$0 <= 8; $$0++) {
         for (int $$1 = -8; $$1 <= 8; $$1++) {
            egi $$2 = this.l.d($$0, $$1);

            for (eaz $$3 : $$2.J().values()) {
               if ($$3 instanceof ecw) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private eeg.b m() {
      dlz $$0 = new dlz(this.m);

      for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; $$1++) {
         for (int $$2 = -8 + $$0.i; $$2 <= 8 + $$0.i; $$2++) {
            egi $$3 = this.l.d($$1, $$2);

            for (eaz $$4 : $$3.J().values()) {
               if ($$4 instanceof ecw) {
                  eeg.b $$5 = this.o.a(this.l, $$4.aA_());
                  if ($$5 != null) {
                     jb $$6 = $$5.a(3, 3, 3).d();
                     if (this.y == null) {
                        this.y = $$6;
                     }

                     return $$5;
                  }
               }
            }
         }
      }

      jb $$7 = enf.a(this.m);
      int $$8 = this.l.a(eka.a.e, $$7).v();

      for (int $$9 = $$8; $$9 >= this.l.L_(); $$9--) {
         eeg.b $$10 = this.o.a(this.l, new jb($$7.u(), $$9, $$7.w()));
         if ($$10 != null) {
            if (this.y == null) {
               this.y = $$10.a(3, 3, 3).d();
            }

            return $$10;
         }
      }

      return null;
   }

   private boolean n() {
      if (this.v) {
         return true;
      } else {
         dlz $$0 = new dlz(this.m);

         for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; $$1++) {
            for (int $$2 = 8 + $$0.i; $$2 <= 8 + $$0.i; $$2++) {
               efy $$3 = this.l.a($$1, $$2, egz.n, false);
               if (!($$3 instanceof egi)) {
                  return false;
               }

               atp $$4 = ((egi)$$3).G();
               if (!$$4.a(atp.c)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void o() {
      Set<auc> $$0 = Sets.newHashSet();

      for (auc $$1 : this.l.a(this.j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<auc> $$2 = Sets.newHashSet(this.k.h());
      $$2.removeAll($$0);

      for (auc $$3 : $$2) {
         this.k.b($$3);
      }
   }

   private void p() {
      this.r = 0;
      this.q = 0;

      for (eor.a $$0 : eor.a(this.l)) {
         this.q = this.q + this.l.a(cpr.class, $$0.f()).size();
      }

      d.debug("Found {} end crystals still alive", this.q);
   }

   public void a(cps $$0) {
      if ($$0.cK().equals(this.w)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.q();
         if (!this.u) {
            this.l.c(this.l.a(eka.a.e, enf.a(this.m)), dqb.fZ.m());
         }

         this.u = true;
         this.t = true;
      }
   }

   @Deprecated
   @VisibleForTesting
   public void d() {
      this.n.clear();
   }

   private void q() {
      if (!this.n.isEmpty()) {
         int $$0 = (Integer)this.n.remove(this.n.size() - 1);
         int $$1 = bcb.a(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * $$0)));
         int $$2 = bcb.a(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * $$0)));
         this.a(new jb($$1, 75, $$2));
      }
   }

   private void a(jb $$0) {
      this.l.c(3000, $$0, 0);
      this.l.K_().a(mn.aP).flatMap($$0x -> $$0x.a(rq.d)).ifPresent($$1 -> $$1.a().a(this.l, this.l.n().g(), bck.a(), $$0));
   }

   private void a(boolean $$0) {
      enf $$1 = new enf($$0);
      if (this.y == null) {
         this.y = this.l.a(eka.a.f, enf.a(this.m)).e();

         while (this.l.a_(this.y).a(dqb.I) && this.y.v() > 63) {
            this.y = this.y.e();
         }

         this.y = this.y.h(Math.max(this.l.L_() + 1, this.y.v()));
      }

      if ($$1.a(epm.m, this.l, this.l.n().g(), bck.a(), this.y)) {
         int $$2 = bcb.e(4, 16);
         this.l.n().a.a(new dlz(this.y), $$2);
      }
   }

   @Nullable
   private cps r() {
      this.l.m(new jb(this.m.u(), 128 + this.m.v(), this.m.w()));
      cps $$0 = bzv.Q.a(this.l, bzu.h);
      if ($$0 != null) {
         $$0.a(this);
         $$0.c(this.m);
         $$0.gD().a(cqi.a);
         $$0.b(this.m.u(), 128 + this.m.v(), this.m.w(), this.l.A.i() * 360.0F, 0.0F);
         this.l.b($$0);
         this.w = $$0.cK();
      }

      return $$0;
   }

   public void b(cps $$0) {
      if ($$0.cK().equals(this.w)) {
         this.k.a($$0.eL() / $$0.fa());
         this.p = 0;
         if ($$0.i_()) {
            this.k.a($$0.Q_());
         }
      }
   }

   public int e() {
      return this.q;
   }

   public void a(cpr $$0, byb $$1) {
      if (this.z != null && this.B.contains($$0)) {
         d.debug("Aborting respawn sequence");
         this.z = null;
         this.A = 0;
         this.h();
         this.a(true);
      } else {
         this.p();
         if (this.l.b(this.w) instanceof cps $$3) {
            $$3.a(this.l, $$0, $$0.dx(), $$1);
         }
      }
   }

   public boolean f() {
      return this.u;
   }

   public void g() {
      if (this.t && this.z == null) {
         jb $$0 = this.y;
         if ($$0 == null) {
            d.debug("Tried to respawn, but need to find the portal first.");
            eeg.b $$1 = this.m();
            if ($$1 == null) {
               d.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               d.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.y;
         }

         List<cpr> $$2 = Lists.newArrayList();
         jb $$3 = $$0.b(1);

         for (jh $$4 : jh.c.a) {
            List<cpr> $$5 = this.l.a(cpr.class, new fin($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         d.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }
   }

   private void a(List<cpr> $$0) {
      if (this.t && this.z == null) {
         for (eeg.b $$1 = this.m(); $$1 != null; $$1 = this.m()) {
            for (int $$2 = 0; $$2 < this.o.c(); $$2++) {
               for (int $$3 = 0; $$3 < this.o.b(); $$3++) {
                  for (int $$4 = 0; $$4 < this.o.a(); $$4++) {
                     eef $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(dqb.I) || $$5.a().a(dqb.fW)) {
                        this.l.c($$5.d(), dqb.fY.m());
                     }
                  }
               }
            }
         }

         this.z = eia.a;
         this.A = 0;
         this.a(false);
         this.B = $$0;
      }
   }

   public void h() {
      for (eor.a $$0 : eor.a(this.l)) {
         for (cpr $$2 : this.l.a(cpr.class, $$0.f())) {
            $$2.n(false);
            $$2.a(null);
         }
      }
   }

   @Nullable
   public UUID i() {
      return this.w;
   }

   public record a(boolean c, boolean d, boolean e, boolean f, Optional<UUID> g, Optional<jb> h, Optional<List<Integer>> i) {
      public static final Codec<eib.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.BOOL.fieldOf("NeedsStateScanning").orElse(true).forGetter(eib.a::a),
               Codec.BOOL.fieldOf("DragonKilled").orElse(false).forGetter(eib.a::b),
               Codec.BOOL.fieldOf("PreviouslyKilled").orElse(false).forGetter(eib.a::c),
               Codec.BOOL.lenientOptionalFieldOf("IsRespawning", false).forGetter(eib.a::d),
               kf.a.lenientOptionalFieldOf("Dragon").forGetter(eib.a::e),
               jb.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(eib.a::f),
               Codec.list(Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(eib.a::g)
            )
            .apply($$0, eib.a::new)
      );
      public static final eib.a b = new eib.a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

      public boolean a() {
         return this.c;
      }

      public boolean b() {
         return this.d;
      }

      public boolean c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public Optional<UUID> e() {
         return this.g;
      }

      public Optional<jb> f() {
         return this.h;
      }

      public Optional<List<Integer>> g() {
         return this.i;
      }
   }
}
