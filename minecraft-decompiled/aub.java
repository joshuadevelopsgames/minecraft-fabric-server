import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aub extends dmu implements aua, dnt {
   public static final jb a = new jb(100, 50, 0);
   public static final bwo b = bwu.a(12000, 180000);
   public static final bwo c = bwu.a(12000, 24000);
   private static final bwo E = bwu.a(12000, 180000);
   public static final bwo d = bwu.a(3600, 15600);
   private static final Logger F = LogUtils.getLogger();
   private static final int G = 300;
   private static final int H = 65536;
   final List<auc> I = Lists.newArrayList();
   private final aty J;
   private final MinecraftServer K;
   private final fcx L;
   private int M;
   final eim N = new eim();
   private final ayv O;
   private final eir<bzm> P;
   private final ejc Q;
   public boolean e;
   private final aye R;
   private int S;
   private final fbj T;
   private final fkh<dpz> U = new fkh<>(this::d);
   private final fkh<fak> V = new fkh<>(this::d);
   private final fbd W = new fbd();
   final Set<cao> X = new ObjectOpenHashSet();
   volatile boolean Y;
   protected final cwl f;
   private final ObjectLinkedOpenHashSet<dlx> Z = new ObjectLinkedOpenHashSet();
   private final List<dlx> aa = new ArrayList<>(64);
   private boolean ab;
   private final List<dmg> ac;
   @Nullable
   private eib ad;
   final Int2ObjectMap<cpp> ae = new Int2ObjectOpenHashMap();
   private final dnq af;
   private final euz ag;
   private final boolean ah;
   private final bxp ai;

   public aub(
      MinecraftServer $$0,
      Executor $$1,
      fcs.c $$2,
      fcx $$3,
      amd<dmu> $$4,
      ehz $$5,
      aul $$6,
      boolean $$7,
      long $$8,
      List<dmg> $$9,
      boolean $$10,
      @Nullable bxp $$11
   ) {
      super($$3, $$4, $$0.ba(), $$5.a(), false, $$7, $$8, $$0.bj());
      this.ah = $$10;
      this.K = $$0;
      this.ac = $$9;
      this.L = $$3;
      efz $$12 = $$5.b();
      boolean $$13 = $$0.aX();
      DataFixer $$14 = $$0.aC();
      eij<bzm> $$15 = new ehj(new ehu(new ehr($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$14, $$13, bdr.t), this, $$0);
      this.P = new eir<>(bzm.class, new aub.a(), $$15);
      this.J = new aty(this, $$2, $$14, $$0.aY(), $$1, $$12, $$0.ag().p(), $$0.ag().q(), $$13, $$6, this.P::a, () -> $$0.J().x());
      this.J.h().b();
      this.T = new fbj(this);
      this.aa();
      this.ad();
      this.F_().a($$0.aw());
      this.f = this.x().a(cwl.a(this.ai()));
      if (!$$0.U()) {
         $$3.a($$0.u());
      }

      long $$16 = $$0.aZ().y().c();
      this.ag = new euz(this.J.n(), this.K_(), $$0.aY(), $$4, $$12, this.J.i(), this, $$12.d(), $$16, $$14);
      this.af = new dnq(this, $$0.aZ().y(), this.ag);
      if (this.aj() == dmu.k && this.ai().a(ehw.c)) {
         this.ad = new eib(this, $$16, $$0.aZ().C());
      } else {
         this.ad = null;
      }

      this.R = new aye();
      this.Q = new ejc(this);
      this.ai = Objects.requireNonNullElseGet($$11, () -> this.x().a(bxp.a));
      this.O = new ayv();
   }

   @Deprecated
   @VisibleForTesting
   public void a(@Nullable eib $$0) {
      this.ad = $$0;
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.L.a($$0);
      this.L.c($$1);
      this.L.b($$1);
      this.L.b($$2);
      this.L.a($$3);
   }

   @Override
   public jl<dnx> a(int $$0, int $$1, int $$2) {
      return this.n().g().d().getNoiseBiome($$0, $$1, $$2, this.n().i().b());
   }

   public dnq b() {
      return this.af;
   }

   public void a(BooleanSupplier $$0) {
      btt $$1 = bts.a();
      this.ab = true;
      bxt $$2 = this.v();
      boolean $$3 = $$2.i();
      if ($$3) {
         $$1.a("world border");
         this.F_().s();
         $$1.b("weather");
         this.aw();
         $$1.c();
      }

      int $$4 = this.P().d(dmq.R);
      if (this.R.a($$4) && this.R.a($$4, this.I)) {
         if (this.P().c(dmq.m)) {
            long $$5 = this.B.d() + 24000L;
            this.b($$5 - $$5 % 24000L);
         }

         this.au();
         if (this.P().c(dmq.x) && this.ah()) {
            this.i();
         }
      }

      this.aa();
      if ($$3) {
         this.c();
      }

      $$1.a("tickPending");
      if (!this.ak() && $$3) {
         long $$6 = this.ae();
         $$1.a("blockTicks");
         this.U.a($$6, 65536, this::c);
         $$1.b("fluidTicks");
         this.V.a($$6, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      if ($$3) {
         this.f.a(this);
      }

      $$1.b("chunkSource");
      this.n().a($$0, true);
      $$1.b("blockEvents");
      if ($$3) {
         this.ax();
      }

      this.ab = false;
      $$1.c();
      boolean $$7 = !this.I.isEmpty() || !this.z().isEmpty();
      if ($$7) {
         this.j();
      }

      if ($$7 || this.S++ < 300) {
         $$1.a("entities");
         if (this.ad != null && $$3) {
            $$1.a("dragonFight");
            this.ad.c();
            $$1.c();
         }

         this.N.a($$2x -> {
            if (!$$2x.dU()) {
               if (!$$2.a($$2x)) {
                  $$1.a("checkDespawn");
                  $$2x.dJ();
                  $$1.c();
                  if ($$2x instanceof auc || this.J.a.j().c($$2x.dz().a())) {
                     bzm $$3x = $$2x.dm();
                     if ($$3x != null) {
                        if (!$$3x.dU() && $$3x.z($$2x)) {
                           return;
                        }

                        $$2x.bS();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$2x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.Z();
      }

      $$1.a("entityManagement");
      this.P.b();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.J.a.j().d($$0);
   }

   protected void c() {
      if (this.ah) {
         long $$0 = this.B.c() + 1L;
         this.L.a($$0);
         bts.a().a("scheduledFunctions");
         this.L.s().a(this.K, $$0);
         bts.a().c();
         if (this.L.o().c(dmq.m)) {
            this.b(this.B.d() + 1L);
         }
      }
   }

   public void b(long $$0) {
      this.L.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for (dmg $$2 : this.ac) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void au() {
      this.R.a();
      this.I.stream().filter(cam::fY).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
   }

   public void a(egi $$0, int $$1) {
      dlz $$2 = $$0.f();
      int $$3 = $$2.d();
      int $$4 = $$2.e();
      btt $$5 = bts.a();
      $$5.a("iceandsnow");

      for (int $$6 = 0; $$6 < $$1; $$6++) {
         if (this.A.a(48) == 0) {
            this.a(this.a($$3, 0, $$4, 15));
         }
      }

      $$5.b("tickBlocks");
      if ($$1 > 0) {
         egj[] $$7 = $$0.d();

         for (int $$8 = 0; $$8 < $$7.length; $$8++) {
            egj $$9 = $$7[$$8];
            if ($$9.d()) {
               int $$10 = $$0.h($$8);
               int $$11 = ke.c($$10);

               for (int $$12 = 0; $$12 < $$1; $$12++) {
                  jb $$13 = this.a($$3, $$11, $$4, 15);
                  $$5.a("randomTick");
                  eeb $$14 = $$9.a($$13.u() - $$3, $$13.v() - $$11, $$13.w() - $$4);
                  if ($$14.z()) {
                     $$14.b(this, $$13, this.A);
                  }

                  fal $$15 = $$14.y();
                  if ($$15.f()) {
                     $$15.a(this, $$13, this.A);
                  }

                  $$5.c();
               }
            }
         }
      }

      $$5.c();
   }

   public void a(egi $$0) {
      dlz $$1 = $$0.f();
      boolean $$2 = this.ah();
      int $$3 = $$1.d();
      int $$4 = $$1.e();
      btt $$5 = bts.a();
      $$5.a("thunder");
      if ($$2 && this.ag() && this.A.a(100000) == 0) {
         jb $$6 = this.b(this.a($$3, 0, $$4, 15));
         if (this.r($$6)) {
            bxh $$7 = this.d_($$6);
            boolean $$8 = this.P().c(dmq.f) && this.A.j() < $$7.b() * 0.01 && !this.a_($$6.e()).a(dqb.tb);
            if ($$8) {
               cow $$9 = bzv.bi.a(this, bzu.h);
               if ($$9 != null) {
                  $$9.x(true);
                  $$9.c_(0);
                  $$9.a_($$6.u(), $$6.v(), $$6.w());
                  this.b($$9);
               }
            }

            cal $$10 = bzv.ay.a(this, bzu.h);
            if ($$10 != null) {
               $$10.f(fis.c($$6));
               $$10.a($$8);
               this.b($$10);
            }
         }
      }

      $$5.c();
   }

   @VisibleForTesting
   public void a(jb $$0) {
      jb $$1 = this.a(eka.a.e, $$0);
      jb $$2 = $$1.e();
      dnx $$3 = this.v($$1).a();
      if ($$3.a(this, $$2)) {
         this.c($$2, dqb.ee.m());
      }

      if (this.ah()) {
         int $$4 = this.P().d(dmq.V);
         if ($$4 > 0 && $$3.b(this, $$1)) {
            eeb $$5 = this.a_($$1);
            if ($$5.a(dqb.ed)) {
               int $$6 = $$5.c(dxt.c);
               if ($$6 < Math.min($$4, 8)) {
                  eeb $$7 = $$5.b(dxt.c, $$6 + 1);
                  dpz.a($$5, $$7, this, $$1);
                  this.c($$1, $$7);
               }
            } else {
               this.c($$1, dqb.ed.m());
            }
         }

         dnx.c $$8 = $$3.a($$2, this.Q());
         if ($$8 != dnx.c.a) {
            eeb $$9 = this.a_($$2);
            $$9.b().a($$9, this, $$2, $$8);
         }
      }
   }

   private Optional<jb> G(jb $$0) {
      Optional<jb> $$1 = this.B().e($$0x -> $$0x.a(clt.t), $$0x -> $$0x.v() == this.a(eka.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, clp.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected jb b(jb $$0) {
      jb $$1 = this.a(eka.a.e, $$0);
      Optional<jb> $$2 = this.G($$1);
      if ($$2.isPresent()) {
         return $$2.get();
      } else {
         fin $$3 = fin.a($$1, $$1.h(this.ao() + 1)).g(3.0);
         List<cam> $$4 = this.a(cam.class, $$3, $$0x -> $$0x != null && $$0x.bO() && this.h($$0x.dx()));
         if (!$$4.isEmpty()) {
            return $$4.get(this.A.a($$4.size())).dx();
         } else {
            if ($$1.v() == this.L_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean d() {
      return this.ab;
   }

   public boolean e() {
      return this.P().d(dmq.R) <= 100;
   }

   private void av() {
      if (this.e()) {
         if (!this.q().U() || this.q().r()) {
            int $$0 = this.P().d(dmq.R);
            xo $$1;
            if (this.R.a($$0)) {
               $$1 = xo.c("sleep.skipping_night");
            } else {
               $$1 = xo.a("sleep.players_sleeping", this.R.b(), this.R.b($$0));
            }

            for (auc $$3 : this.I) {
               $$3.a($$1, true);
            }
         }
      }
   }

   public void f() {
      if (!this.I.isEmpty() && this.R.a(this.I)) {
         this.av();
      }
   }

   public amx g() {
      return this.K.aJ();
   }

   public ayv h() {
      return this.O;
   }

   private void aw() {
      boolean $$0 = this.ah();
      if (this.G_().g()) {
         if (this.P().c(dmq.x)) {
            int $$1 = this.L.f();
            int $$2 = this.L.h();
            int $$3 = this.L.j();
            boolean $$4 = this.B.g();
            boolean $$5 = this.B.i();
            if ($$1 > 0) {
               $$1--;
               $$2 = $$4 ? 0 : 1;
               $$3 = $$5 ? 0 : 1;
               $$4 = false;
               $$5 = false;
            } else {
               if ($$2 > 0) {
                  if (--$$2 == 0) {
                     $$4 = !$$4;
                  }
               } else if ($$4) {
                  $$2 = d.a(this.A);
               } else {
                  $$2 = E.a(this.A);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = c.a(this.A);
               } else {
                  $$3 = b.a(this.A);
               }
            }

            this.L.b($$2);
            this.L.c($$3);
            this.L.a($$1);
            this.L.a($$4);
            this.L.b($$5);
         }

         this.y = this.z;
         if (this.B.g()) {
            this.z += 0.01F;
         } else {
            this.z -= 0.01F;
         }

         this.z = bcb.a(this.z, 0.0F, 1.0F);
         this.w = this.x;
         if (this.B.i()) {
            this.x += 0.01F;
         } else {
            this.x -= 0.01F;
         }

         this.x = bcb.a(this.x, 0.0F, 1.0F);
      }

      if (this.w != this.x) {
         this.K.ag().a(new adx(adx.i, this.x), this.aj());
      }

      if (this.y != this.z) {
         this.K.ag().a(new adx(adx.j, this.z), this.aj());
      }

      if ($$0 != this.ah()) {
         if ($$0) {
            this.K.ag().a(new adx(adx.d, 0.0F));
         } else {
            this.K.ag().a(new adx(adx.c, 0.0F));
         }

         this.K.ag().a(new adx(adx.i, this.x));
         this.K.ag().a(new adx(adx.j, this.z));
      }
   }

   @VisibleForTesting
   public void i() {
      this.L.c(0);
      this.L.b(false);
      this.L.b(0);
      this.L.a(false);
   }

   public void j() {
      this.S = 0;
   }

   private void a(jb $$0, fak $$1) {
      eeb $$2 = this.a_($$0);
      fal $$3 = $$2.y();
      if ($$3.b($$1)) {
         $$3.a(this, $$0, $$2);
      }
   }

   private void c(jb $$0, dpz $$1) {
      eeb $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.A);
      }
   }

   public void a(bzm $$0) {
      $$0.bC();
      btt $$1 = bts.a();
      $$0.as++;
      $$1.a(() -> mm.f.b($$0.ap()).toString());
      $$1.f("tickNonPassenger");
      $$0.g();
      $$1.c();

      for (bzm $$2 : $$0.da()) {
         this.a($$0, $$2);
      }
   }

   private void a(bzm $$0, bzm $$1) {
      if ($$1.dU() || $$1.dm() != $$0) {
         $$1.bS();
      } else if ($$1 instanceof cut || this.N.c($$1)) {
         $$1.bC();
         $$1.as++;
         btt $$2 = bts.a();
         $$2.a(() -> mm.f.b($$1.ap()).toString());
         $$2.f("tickPassenger");
         $$1.r();
         $$2.c();

         for (bzm $$3 : $$1.da()) {
            this.a($$1, $$3);
         }
      }
   }

   public void a(jb $$0, eeb $$1) {
      eeb $$2 = this.a_($$0);
      dpz $$3 = $$2.b();
      boolean $$4 = !$$1.a($$3);
      if ($$4) {
         $$1.a(this, $$0, false);
      }

      this.a($$0, $$2.b());
      if ($$2.q()) {
         this.b($$0, $$3);
      }
   }

   @Override
   public boolean a(bzm $$0, jb $$1) {
      return !($$0 instanceof cut $$2 && (this.K.a(this, $$1, $$2) || !this.F_().a($$1)));
   }

   public void a(@Nullable bcj $$0, boolean $$1, boolean $$2) {
      aty $$3 = this.n();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(xo.c("menu.savingLevel"));
         }

         this.b($$1);
         if ($$0 != null) {
            $$0.c(xo.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.P.d();
         } else {
            this.P.c();
         }
      }
   }

   private void b(boolean $$0) {
      if (this.ad != null) {
         this.K.aZ().a(this.ad.b());
      }

      fcm $$1 = this.n().l();
      if ($$0) {
         $$1.b();
      } else {
         $$1.a();
      }
   }

   public <T extends bzm> List<? extends T> a(ein<bzm, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.a($$0, $$1, $$2);
      return $$2;
   }

   public <T extends bzm> void a(ein<bzm, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
      this.a($$0, $$1, $$2, Integer.MAX_VALUE);
   }

   public <T extends bzm> void a(ein<bzm, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$3) {
      this.I().a($$0, $$3x -> {
         if ($$1.test((T)$$3x)) {
            $$2.add((T)$$3x);
            if ($$2.size() >= $$3) {
               return bak.a.b;
            }
         }

         return bak.a.a;
      });
   }

   public List<? extends cps> k() {
      return this.a(bzv.Q, cam::bO);
   }

   public List<auc> a(Predicate<? super auc> $$0) {
      return this.a($$0, Integer.MAX_VALUE);
   }

   public List<auc> a(Predicate<? super auc> $$0, int $$1) {
      List<auc> $$2 = Lists.newArrayList();

      for (auc $$3 : this.I) {
         if ($$0.test($$3)) {
            $$2.add($$3);
            if ($$2.size() >= $$1) {
               return $$2;
            }
         }
      }

      return $$2;
   }

   @Nullable
   public auc l() {
      List<auc> $$0 = this.a(cam::bO);
      return $$0.isEmpty() ? null : $$0.get(this.A.a($$0.size()));
   }

   @Override
   public boolean b(bzm $$0) {
      return this.i($$0);
   }

   public boolean c(bzm $$0) {
      return this.i($$0);
   }

   public void d(bzm $$0) {
      if ($$0 instanceof auc $$1) {
         this.c($$1);
      } else {
         this.i($$0);
      }
   }

   public void a(auc $$0) {
      this.c($$0);
   }

   public void b(auc $$0) {
      this.c($$0);
   }

   private void c(auc $$0) {
      bzm $$1 = this.b($$0.cK());
      if ($$1 != null) {
         F.warn("Force-added player with duplicate UUID {}", $$0.cK());
         $$1.an();
         this.a((auc)$$1, bzm.e.b);
      }

      this.P.a($$0);
   }

   private boolean i(bzm $$0) {
      if ($$0.dU()) {
         F.warn("Tried to add entity {} but it was marked as removed already", bzv.a($$0.ap()));
         return false;
      } else {
         return this.P.a($$0);
      }
   }

   public boolean e(bzm $$0) {
      if ($$0.dc().map(bzm::cK).anyMatch(this.P::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void b(egi $$0) {
      $$0.K();
      $$0.c(this);
   }

   public void a(auc $$0, bzm.e $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, jb $$1, int $$2) {
      for (auc $$3 : this.K.ag().t()) {
         if ($$3 != null && $$3.y() == this && $$3.ar() != $$0) {
            double $$4 = $$1.u() - $$3.dC();
            double $$5 = $$1.v() - $$3.dE();
            double $$6 = $$1.w() - $$3.dI();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.g.b(new acv($$0, $$1, $$2));
            }
         }
      }
   }

   @Override
   public void a(@Nullable bzm $$0, double $$1, double $$2, double $$3, jl<ayy> $$4, aza $$5, float $$6, float $$7, long $$8) {
      this.K.ag().a($$0 instanceof cut $$9 ? $$9 : null, $$1, $$2, $$3, $$4.a().a($$6), this.aj(), new agr($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable bzm $$0, bzm $$1, jl<ayy> $$2, aza $$3, float $$4, float $$5, long $$6) {
      this.K.ag().a($$0 instanceof cut $$7 ? $$7 : null, $$1.dC(), $$1.dE(), $$1.dI(), $$2.a().a($$4), this.aj(), new agq($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, jb $$1, int $$2) {
      if (this.P().c(dmq.Y)) {
         this.K.ag().t().forEach($$3 -> {
            fis $$5;
            if ($$3.y() == this) {
               fis $$4 = fis.b($$1);
               if ($$3.g($$4) < bcb.i(32)) {
                  $$5 = $$4;
               } else {
                  fis $$6 = $$4.d($$3.dv()).d();
                  $$5 = $$3.dv().e($$6.c(32.0));
               }
            } else {
               $$5 = $$3.dv();
            }

            $$3.g.b(new aed($$0, jb.a((jv)$$5), $$2, true));
         });
      } else {
         this.a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void a(@Nullable bzm $$0, int $$1, jb $$2, int $$3) {
      this.K.ag().a($$0 instanceof cut $$4 ? $$4 : null, $$2.u(), $$2.v(), $$2.w(), 64.0, this.aj(), new aed($$1, $$2, $$3, false));
   }

   public int m() {
      return this.G_().p();
   }

   @Override
   public void a(jl<ejb> $$0, fis $$1, ejb.a $$2) {
      this.Q.a($$0, $$1, $$2);
   }

   @Override
   public void a(jb $$0, eeb $$1, eeb $$2, int $$3) {
      if (this.Y) {
         String $$4 = "recursive call to sendBlockUpdated";
         ag.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.n().a($$0);
      this.W.a($$0);
      fjm $$5 = $$1.g(this, $$0);
      fjm $$6 = $$2.g(this, $$0);
      if (fjj.c($$5, $$6, fiw.g)) {
         List<cjw> $$7 = new ObjectArrayList();

         for (cao $$8 : this.X) {
            cjw $$9 = $$8.S();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.Y = true;

            for (cjw $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.Y = false;
         }
      }
   }

   @Override
   public void a(jb $$0, dpz $$1) {
      this.a($$0, $$1, fbp.a(this, null, null));
   }

   @Override
   public void a(jb $$0, dpz $$1, @Nullable fbt $$2) {
      this.t.a($$0, $$1, null, $$2);
   }

   @Override
   public void a(jb $$0, dpz $$1, jh $$2, @Nullable fbt $$3) {
      this.t.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jb $$0, dpz $$1, @Nullable fbt $$2) {
      this.t.a($$0, $$1, $$2);
   }

   @Override
   public void a(eeb $$0, jb $$1, dpz $$2, @Nullable fbt $$3, boolean $$4) {
      this.t.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bzm $$0, byte $$1) {
      this.n().a($$0, new adt($$0, $$1));
   }

   @Override
   public void a(bzm $$0, byb $$1) {
      this.n().a($$0, new adp($$0, $$1));
   }

   public aty n() {
      return this.J;
   }

   @Override
   public void a(
      @Nullable bzm $$0,
      @Nullable byb $$1,
      @Nullable dmo $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dmu.a $$8,
      mc $$9,
      mc $$10,
      jl<ayy> $$11
   ) {
      dmn.a $$12 = switch ($$8) {
         case a -> dmn.a.a;
         case b -> this.a(dmq.S);
         case c -> this.P().c(dmq.d) ? this.a(dmq.T) : dmn.a.a;
         case d -> this.a(dmq.U);
         case e -> dmn.a.d;
      };
      fis $$13 = new fis($$3, $$4, $$5);
      dnk $$14 = new dnk(this, $$0, $$1, $$2, $$13, $$6, $$7, $$12);
      $$14.i();
      mc $$15 = $$14.l() ? $$9 : $$10;

      for (auc $$16 : this.I) {
         if ($$16.g($$13) < 4096.0) {
            Optional<fis> $$17 = Optional.ofNullable($$14.j().get($$16));
            $$16.g.b(new adv($$13, $$17, $$15, $$11));
         }
      }
   }

   private dmn.a a(dmq.e<dmq.a> $$0) {
      return this.P().c($$0) ? dmn.a.c : dmn.a.b;
   }

   @Override
   public void a(jb $$0, dpz $$1, int $$2, int $$3) {
      this.Z.add(new dlx($$0, $$1, $$2, $$3));
   }

   private void ax() {
      this.aa.clear();

      while (!this.Z.isEmpty()) {
         dlx $$0 = (dlx)this.Z.removeFirst();
         if (this.n($$0.a())) {
            if (this.a($$0)) {
               this.K.ag().a(null, $$0.a().u(), $$0.a().v(), $$0.a().w(), 64.0, this.aj(), new acx($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.aa.add($$0);
         }
      }

      this.Z.addAll(this.aa);
   }

   private boolean a(dlx $$0) {
      eeb $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public fkh<dpz> o() {
      return this.U;
   }

   public fkh<fak> p() {
      return this.V;
   }

   @Nonnull
   @Override
   public MinecraftServer q() {
      return this.K;
   }

   public fbj r() {
      return this.T;
   }

   public ezb s() {
      return this.K.aY();
   }

   public <T extends mc> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public <T extends mc> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      aee $$11 = new aee($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      int $$12 = 0;

      for (int $$13 = 0; $$13 < this.I.size(); $$13++) {
         auc $$14 = this.I.get($$13);
         if (this.a($$14, $$1, $$3, $$4, $$5, $$11)) {
            $$12++;
         }
      }

      return $$12;
   }

   public <T extends mc> boolean a(
      auc $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11
   ) {
      zw<?> $$12 = new aee($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
      return this.a($$0, $$2, $$4, $$5, $$6, $$12);
   }

   private boolean a(auc $$0, boolean $$1, double $$2, double $$3, double $$4, zw<?> $$5) {
      if ($$0.y() != this) {
         return false;
      } else {
         jb $$6 = $$0.dx();
         if ($$6.a(new fis($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.g.b($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bzm a(int $$0) {
      return this.I().a($$0);
   }

   @Deprecated
   @Nullable
   public bzm b(int $$0) {
      bzm $$1 = this.I().a($$0);
      return $$1 != null ? $$1 : (bzm)this.ae.get($$0);
   }

   @Override
   public Collection<cpp> t() {
      return this.ae.values();
   }

   @Nullable
   public jb a(bae<euy> $$0, jb $$1, int $$2, boolean $$3) {
      if (!this.K.aZ().y().d()) {
         return null;
      } else {
         Optional<jp.c<euy>> $$4 = this.K_().f(mn.bj).a($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<jb, jl<euy>> $$5 = this.n().g().a(this, $$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (jb)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<jb, jl<dnx>> a(Predicate<jl<dnx>> $$0, jb $$1, int $$2, int $$3, int $$4) {
      return this.n().g().d().a($$1, $$2, $$3, $$4, $$0, this.n().i().b(), this);
   }

   public dht u() {
      return this.K.aI();
   }

   @Override
   public bxt v() {
      return this.K.aP();
   }

   @Override
   public boolean w() {
      return this.e;
   }

   public fcm x() {
      return this.n().l();
   }

   @Nullable
   @Override
   public fcg a(fce $$0) {
      return this.q().J().x().b(fcg.a($$0));
   }

   public void a(fce $$0, fcg $$1) {
      this.q().J().x().a(fcg.a($$0), $$1);
   }

   public fce y() {
      return this.q().J().x().a(fcf.b).a();
   }

   public void a(jb $$0, float $$1) {
      jb $$2 = this.B.a();
      float $$3 = this.B.b();
      if (!$$2.equals($$0) || $$3 != $$1) {
         this.B.a($$0, $$1);
         this.q().ag().a(new afx($$0, $$1));
      }

      if (this.M > 1) {
         this.n().b(aui.b, new dlz($$2), this.M);
      }

      int $$4 = this.P().d(dmq.ac) + 1;
      if ($$4 > 1) {
         this.n().a(aui.b, new dlz($$0), $$4);
      }

      this.M = $$4;
   }

   public LongSet z() {
      return this.J.k();
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      boolean $$3 = this.J.a(new dlz($$0, $$1), $$2);
      if ($$2 && $$3) {
         this.d($$0, $$1);
      }

      return $$3;
   }

   @Override
   public List<auc> A() {
      return this.I;
   }

   @Override
   public void a(jb $$0, eeb $$1, eeb $$2) {
      Optional<jl<cls>> $$3 = clt.a($$1);
      Optional<jl<cls>> $$4 = clt.a($$2);
      if (!Objects.equals($$3, $$4)) {
         jb $$5 = $$0.j();
         $$3.ifPresent($$1x -> this.q().execute(() -> {
            this.B().a($$5);
            ahj.b(this, $$5);
         }));
         $$4.ifPresent($$1x -> this.q().execute(() -> {
            this.B().a($$5, $$1x);
            ahj.a(this, $$5);
         }));
      }
   }

   public clp B() {
      return this.n().m();
   }

   public boolean c(jb $$0) {
      return this.a($$0, 1);
   }

   public boolean a(ke $$0) {
      return this.c($$0.k());
   }

   public boolean a(jb $$0, int $$1) {
      return $$1 > 6 ? false : this.b(ke.a($$0)) <= $$1;
   }

   public int b(ke $$0) {
      return this.B().a($$0);
   }

   public cwl C() {
      return this.f;
   }

   @Nullable
   public cwj d(jb $$0) {
      return this.f.a($$0, 9216);
   }

   public boolean e(jb $$0) {
      return this.d($$0) != null;
   }

   public void a(clm $$0, bzm $$1, cbb $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      atf $$1 = this.n().a;

      try (Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"))) {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.j().a()));
         dnf.d $$3 = this.n().o();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while ($$9.hasNext()) {
               Entry<cap> $$4 = (Entry<cap>)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((cap)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.P.f()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.s.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.o().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.p().a()));
         $$2.write("distance_manager: " + $$1.j().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.n().f()));
      }

      p $$5 = new p("Level dump", new Exception("dummy"));
      this.a($$5);

      try (Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"))) {
         $$6.write($$5.a(z.c));
      }

      Path $$7 = $$0.resolve("chunks.csv");

      try (Writer $$8 = Files.newBufferedWriter($$7)) {
         $$1.a($$8);
      }

      Path $$9 = $$0.resolve("entity_chunks.csv");

      try (Writer $$10 = Files.newBufferedWriter($$9)) {
         this.P.a($$10);
      }

      Path $$11 = $$0.resolve("entities.csv");

      try (Writer $$12 = Files.newBufferedWriter($$11)) {
         a($$12, this.I().a());
      }

      Path $$13 = $$0.resolve("block_entities.csv");

      try (Writer $$14 = Files.newBufferedWriter($$13)) {
         this.a($$14);
      }
   }

   private static void a(Writer $$0, Iterable<bzm> $$1) throws IOException {
      baz $$2 = baz.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for (bzm $$3 : $$1) {
         xo $$4 = $$3.al();
         xo $$5 = $$3.Q_();
         $$2.a($$3.dC(), $$3.dE(), $$3.dI(), $$3.cK(), mm.f.b($$3.ap()), $$3.bO(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }
   }

   private void a(Writer $$0) throws IOException {
      baz $$1 = baz.a().a("x").a("y").a("z").a("type").a($$0);

      for (ecx $$2 : this.s) {
         jb $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }
   }

   @VisibleForTesting
   public void a(euq $$0) {
      this.Z.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public float a(jh $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bzm> D() {
      return this.I().a();
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.L.e() + "]";
   }

   public boolean E() {
      return this.K.aZ().z();
   }

   @Override
   public long F() {
      return this.K.aZ().y().c();
   }

   @Nullable
   public eib G() {
      return this.ad;
   }

   @Override
   public aub a() {
      return this;
   }

   @VisibleForTesting
   public String H() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.I.size(),
         this.P.f(),
         a(this.P.e().a(), $$0 -> mm.f.b($$0.ap()).toString()),
         this.s.size(),
         a(this.s, ecx::d),
         this.o().a(),
         this.p().a(),
         this.K()
      );
   }

   private static <T> String a(Iterable<T> $$0, Function<T, String> $$1) {
      try {
         Object2IntOpenHashMap<String> $$2 = new Object2IntOpenHashMap();

         for (T $$3 : $$0) {
            String $$4 = $$1.apply($$3);
            $$2.addTo($$4, 1);
         }

         return $$2.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(Entry::getIntValue).reversed())
            .limit(5L)
            .map($$0x -> (String)$$0x.getKey() + ":" + $$0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var6) {
         return "";
      }
   }

   @Override
   protected eip<bzm> I() {
      return this.P.e();
   }

   public void a(Stream<bzm> $$0) {
      this.P.a($$0);
   }

   public void b(Stream<bzm> $$0) {
      this.P.b($$0);
   }

   public void c(egi $$0) {
      $$0.d(this.D_().c());
   }

   public void a(efy $$0) {
      this.K.execute(() -> this.ag.a($$0.f(), $$0.g()));
   }

   public fbd J() {
      return this.W;
   }

   public void a(dlz $$0, int $$1) {
      List<dlz> $$2 = dlz.a($$0, $$1).toList();
      this.J.a(aui.i, $$0, $$1);
      $$2.forEach($$0x -> this.d($$0x.h, $$0x.i));
      this.K.b((BooleanSupplier)(() -> {
         this.P.a();

         for (dlz $$1x : $$2) {
            if (!this.c($$1x.a())) {
               return false;
            }
         }

         return true;
      }));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.P.close();
   }

   @Override
   public String K() {
      return "Chunks[S] W: " + this.J.e() + " E: " + this.P.f();
   }

   public boolean c(long $$0) {
      return this.P.a($$0);
   }

   public boolean d(long $$0) {
      return this.c($$0) && this.J.a($$0);
   }

   public boolean f(jb $$0) {
      return this.P.a($$0) && this.J.a.j().c(dlz.a($$0));
   }

   public boolean a(dlz $$0) {
      return this.P.a($$0) && this.P.a($$0.a());
   }

   public boolean g(jb $$0) {
      return this.b(new dlz($$0));
   }

   public boolean b(dlz $$0) {
      return this.J.a.b($$0);
   }

   public boolean c(dlz $$0) {
      return this.P.b($$0) && this.F_().a($$0);
   }

   @Override
   public cyd L() {
      return this.K.aZ().K();
   }

   @Override
   public deq M() {
      return this.K.bn();
   }

   @Override
   public eby N() {
      return this.K.bo();
   }

   public bck a(ame $$0) {
      return this.ai.a($$0);
   }

   public bxp O() {
      return this.ai;
   }

   public dmq P() {
      return this.L.o();
   }

   @Override
   public q a(p $$0) {
      q $$1 = super.a($$0);
      $$1.a("Loaded entity count", () -> String.valueOf(this.P.g()));
      return $$1;
   }

   @Override
   public int Q() {
      return this.J.g().f();
   }

   final class a implements eio<bzm> {
      public void a(bzm $$0) {
         if ($$0 instanceof fkx $$1 && $$1.ge()) {
            aub.this.h().a($$1);
         }
      }

      public void b(bzm $$0) {
         if ($$0 instanceof fkx $$1) {
            aub.this.h().c($$1);
         }

         aub.this.g().a($$0);
      }

      public void c(bzm $$0) {
         aub.this.N.a($$0);
      }

      public void d(bzm $$0) {
         aub.this.N.b($$0);
      }

      public void e(bzm $$0) {
         aub.this.n().b($$0);
         if ($$0 instanceof auc $$1) {
            aub.this.I.add($$1);
            if ($$1.m()) {
               aub.this.h().a($$1);
            }

            aub.this.f();
         }

         if ($$0 instanceof fkx $$2 && $$2.ge()) {
            aub.this.h().a($$2);
         }

         if ($$0 instanceof cao $$3) {
            if (aub.this.Y) {
               String $$4 = "onTrackingStart called during navigation iteration";
               ag.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aub.this.X.add($$3);
         }

         if ($$0 instanceof cps $$5) {
            for (cpp $$6 : $$5.t()) {
               aub.this.ae.put($$6.ar(), $$6);
            }
         }

         $$0.a(eiy::a);
      }

      public void f(bzm $$0) {
         aub.this.n().a($$0);
         if ($$0 instanceof auc $$1) {
            aub.this.I.remove($$1);
            aub.this.h().c($$1);
            aub.this.f();
         }

         if ($$0 instanceof cao $$2) {
            if (aub.this.Y) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ag.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            aub.this.X.remove($$2);
         }

         if ($$0 instanceof cps $$4) {
            for (cpp $$5 : $$4.t()) {
               aub.this.ae.remove($$5.ar());
            }
         }

         $$0.a(eiy::b);
      }

      public void g(bzm $$0) {
         $$0.a(eiy::c);
      }
   }
}
