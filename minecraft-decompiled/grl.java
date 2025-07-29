import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class grl extends grh implements acq, xc {
   private static final Logger k = LogUtils.getLogger();
   private static final xo l = xo.c("multiplayer.unsecureserver.toast.title");
   private static final xo m = xo.c("multiplayer.unsecureserver.toast");
   private static final xo n = xo.c("multiplayer.disconnect.invalid_packet");
   private static final xo o = xo.c("connect.reconfiguring");
   private static final xo p = xo.c("multiplayer.disconnect.bad_chat_index");
   private static final xo q = xo.c("multiplayer.confirm_command.title");
   private static final int r = 64;
   public static final int j = 64;
   private static final adi.d<gro> s = new adi.d<gro>() {
      @Override
      public ArgumentBuilder<gro, ?> a(String $$0) {
         return LiteralArgumentBuilder.literal($$0);
      }

      @Override
      public ArgumentBuilder<gro, ?> a(String $$0, ArgumentType<?> $$1, @Nullable ame $$2) {
         RequiredArgumentBuilder<gro, ?> $$3 = RequiredArgumentBuilder.argument($$0, $$1);
         if ($$2 != null) {
            $$3.suggests(ip.a($$2));
         }

         return $$3;
      }

      @Override
      public ArgumentBuilder<gro, ?> a(ArgumentBuilder<gro, ?> $$0, boolean $$1, boolean $$2) {
         if ($$1) {
            $$0.executes($$0x -> 0);
         }

         if ($$2) {
            $$0.requires(gro::a);
         }

         return $$0;
      }
   };
   private final GameProfile t;
   private grk u;
   private grk.a v;
   private final Map<UUID, grw> w = Maps.newHashMap();
   private final Set<grw> x = new ReferenceOpenHashSet();
   private final grf y;
   private final gro z;
   private final gro A;
   private final ftt B = new ftt(this);
   private int C = 3;
   private int D = 3;
   private final bck E = bck.b();
   private CommandDispatcher<gro> F = new CommandDispatcher();
   private grm G = new grm(Map.of(), dhz.b.a());
   private final UUID H = UUID.randomUUID();
   private Set<amd<dmu>> I;
   private final jz.b J;
   private final cyd K;
   private final deq L;
   private eby M;
   private final wi.a N;
   private OptionalInt O = OptionalInt.empty();
   @Nullable
   private xz P;
   private yi.c Q = yi.c.a;
   private int R;
   private xw S = new xw(20);
   private yb T = yb.a();
   @Nullable
   private CompletableFuture<Optional<cuw>> U;
   @Nullable
   private atl V;
   private final gre W = new gre();
   private final grv X;
   private final grq Y;
   @Nullable
   private grt Z;
   private boolean aa;
   private boolean ab = false;
   private volatile boolean ac;
   private final fjx ad = new fjx();
   private final hyd ae = new hyd();
   private final gsc af = new gsc();
   private final List<WeakReference<grd<?, ?>>> ag = new ArrayList<>();

   public grl(fue $$0, wd $$1, grp $$2) {
      super($$0, $$1, $$2);
      this.t = $$2.a();
      this.J = $$2.c();
      amc<HashCode> $$3 = this.J.a(bbr.c);
      this.N = $$1x -> ((HashCode)$$1x.a($$3).getOrThrow($$1xx -> new IllegalArgumentException("Failed to hash " + $$1x + ": " + $$1xx))).asInt();
      this.K = $$2.d();
      this.y = new grf($$0, this.e);
      this.z = new gro(this, $$0, true);
      this.A = new gro(this, $$0, false);
      this.X = new grv(this, $$0.aR().m());
      this.Y = new grq(this, $$0.aR());
      if ($$2.i() != null) {
         $$0.m.e().a($$2.i());
      }

      this.L = deq.a(this.K);
      this.M = eby.a($$2.c(), this.K);
   }

   public gro i() {
      return this.z;
   }

   public void j() {
      this.ac = true;
      this.k();
      this.e.c();
   }

   public void k() {
      this.I();
      this.u = null;
      this.Z = null;
   }

   private void I() {
      for (WeakReference<grd<?, ?>> $$0 : this.ag) {
         grd<?, ?> $$1 = $$0.get();
         if ($$1 != null) {
            $$1.a();
         }
      }

      this.ag.clear();
   }

   public dhn l() {
      return this.G;
   }

   @Override
   public void a(aeh $$0) {
      zz.a($$0, this, this.a);
      this.a.r = new gru(this.a, this);
      ahh $$1 = $$0.m();
      List<amd<dmu>> $$2 = Lists.newArrayList($$0.f());
      Collections.shuffle($$2);
      this.I = Sets.newLinkedHashSet($$2);
      amd<dmu> $$3 = $$1.b();
      jl<ehy> $$4 = $$1.a();
      this.C = $$0.h();
      this.D = $$0.i();
      boolean $$5 = $$1.f();
      boolean $$6 = $$1.g();
      int $$7 = $$1.j();
      grk.a $$8 = new grk.a(bxg.c, $$0.e(), $$6);
      this.v = $$8;
      this.u = new grk(this, $$8, $$3, $$4, this.C, this.D, this.a.f, $$5, $$1.c(), $$7);
      this.a.a(this.u, ger.a.c);
      if (this.a.t == null) {
         this.a.t = this.a.r.a(this.u, new azk(), new ftp());
         this.a.t.v(-180.0F);
         if (this.a.W() != null) {
            this.a.W().a(this.a.t.cK());
         }
      }

      this.a.l.a();
      this.a.t.A();
      this.a.t.e($$0.b());
      this.u.d(this.a.t);
      this.a.t.k = new gwh(this.a.n);
      this.a.r.a(this.a.t);
      this.a.u = this.a.t;
      this.a(this.a.t, this.u, ger.a.c);
      this.a.t.v($$0.j());
      this.a.t.b($$0.k());
      this.a.t.y($$0.l());
      this.a.t.a($$1.h());
      this.a.t.f($$1.i());
      this.a.r.a($$1.d(), $$1.e());
      this.a.n.b($$0.h());
      this.P = null;
      this.Q = yi.c.a;
      this.R = 0;
      this.S = new xw(20);
      this.T = yb.a();
      if (this.b.h()) {
         this.y();
      }

      this.e.a($$1.d(), $$0.e());
      this.a.bd().a(this.a);
      this.aa = $$0.n();
      if (this.c != null && !this.ab && !this.J()) {
         gab $$9 = gab.a(this.a, gab.a.k, l, m);
         this.a.aB().a($$9);
         this.ab = true;
      }
   }

   @Override
   public void a(acr $$0) {
      zz.a($$0, this, this.a);
      if (this.O.isPresent() && this.O.getAsInt() == $$0.b()) {
         this.O = OptionalInt.empty();
      }

      bzm $$1 = this.b($$0);
      if ($$1 != null) {
         $$1.a($$0);
         this.u.d($$1);
         this.a($$1);
      } else {
         k.warn("Skipping Entity with id {}", $$0.f());
      }
   }

   @Nullable
   private bzm b(acr $$0) {
      bzv<?> $$1 = $$0.f();
      if ($$1 == bzv.bU) {
         grw $$2 = this.a($$0.e());
         if ($$2 == null) {
            k.warn("Server attempted to add player prior to sending player info (Player id {})", $$0.e());
            return null;
         } else {
            return new gwj(this.u, $$2.a());
         }
      } else {
         return $$1.a(this.u, bzu.r);
      }
   }

   private void a(bzm $$0) {
      if ($$0 instanceof cxg $$1) {
         this.a.al().a((hvr)(new hvj($$1)));
      } else if ($$0 instanceof cme $$2) {
         boolean $$3 = $$2.ad_();
         hvd $$4;
         if ($$3) {
            $$4 = new hvb($$2);
         } else {
            $$4 = new hvc($$2);
         }

         this.a.al().a((hvs)$$4);
      }
   }

   @Override
   public void a(agb $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         $$1.k($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(afz $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         $$1.au().a($$0.e());
      }
   }

   @Override
   public void a(adu $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         fis $$2 = $$0.e().a();
         $$1.ao().e($$2);
         if (!$$1.di()) {
            float $$3 = $$0.e().c();
            float $$4 = $$0.e().d();
            boolean $$5 = $$1.dv().g($$2) > 4096.0;
            if (this.u.a($$1) && !$$5) {
               $$1.d($$2, $$3, $$4);
            } else {
               $$1.b($$2, $$3, $$4);
            }

            if (!$$1.bU() && $$1.B(this.a.t)) {
               $$1.k(this.a.t);
               this.a.t.bC();
            }

            $$1.e($$0.f());
         }
      }
   }

   @Override
   public void a(agy $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 == null) {
         if (this.O.isPresent() && this.O.getAsInt() == $$0.b()) {
            k.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", $$0.b());
            a($$0.e(), $$0.f(), this.a.t, false);
            this.b.a(new aim.b(this.a.t.dC(), this.a.t.dE(), this.a.t.dI(), this.a.t.dP(), this.a.t.dR(), false, false));
         }
      } else {
         boolean $$2 = $$0.f().contains(cba.a) || $$0.f().contains(cba.b) || $$0.f().contains(cba.c);
         boolean $$3 = this.u.a($$1) || !$$1.di() || $$2;
         boolean $$4 = a($$0.e(), $$0.f(), $$1, $$3);
         $$1.e($$0.g());
         if (!$$4 && $$1.B(this.a.t)) {
            $$1.k(this.a.t);
            this.a.t.bC();
            if ($$1.di()) {
               this.b.a(ain.a($$1));
            }
         }
      }
   }

   @Override
   public void a(aha $$0) {
      zz.a($$0, this, this.a);
      if (this.a.s != null) {
         bxt $$1 = this.a.s.v();
         $$1.a($$0.b());
         $$1.a($$0.e());
      }
   }

   @Override
   public void a(ahb $$0) {
      zz.a($$0, this, this.a);
      if (this.a.s != null) {
         bxt $$1 = this.a.s.v();
         $$1.c($$0.b());
      }
   }

   @Override
   public void a(agf $$0) {
      zz.a($$0, this, this.a);
      if (cus.e($$0.b())) {
         this.a.t.gs().c($$0.b());
      }
   }

   @Override
   public void a(aek $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = $$0.a(this.u);
      if ($$1 != null) {
         if ($$1.di()) {
            ajr $$2 = $$1.ao();
            fis $$3 = $$2.a($$0.b(), $$0.e(), $$0.f());
            $$2.e($$3);
         } else {
            if ($$0.j()) {
               ajr $$4 = $$1.ao();
               fis $$5 = $$4.a($$0.b(), $$0.e(), $$0.f());
               $$4.e($$5);
               if ($$0.i()) {
                  $$1.d($$5, $$0.g(), $$0.h());
               } else {
                  $$1.d($$5, $$1.dP(), $$1.dR());
               }
            } else if ($$0.i()) {
               $$1.d($$1.dv(), $$0.g(), $$0.h());
            }

            $$1.e($$0.k());
         }
      }
   }

   @Override
   public void a(ael $$0) {
      zz.a($$0, this, this.a);
      if ($$0.a(this.u) instanceof cxg $$2) {
         if ($$2.f() instanceof cxv $$4) {
            $$4.e.addAll($$0.e());
         }
      }
   }

   @Override
   public void a(afj $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = $$0.a(this.u);
      if ($$1 != null) {
         $$1.a($$0.b(), 3);
      }
   }

   @Override
   public void a(aff $$0) {
      zz.a($$0, this, this.a);
      $$0.b().forEach($$0x -> {
         bzm $$1 = this.u.a($$0x);
         if ($$1 != null) {
            if ($$1.B(this.a.t)) {
               k.debug("Remove entity {}:{} that has player as passenger", $$1.ap(), $$0x);
               this.O = OptionalInt.of($$0x);
            }

            this.u.a($$0x, bzm.e.b);
         }
      });
   }

   @Override
   public void a(aez $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      if (!$$1.cc()) {
         a($$0.e(), $$0.f(), $$1, false);
      }

      this.b.a(new aho($$0.b()));
      this.b.a(new aim.b($$1.dC(), $$1.dE(), $$1.dI(), $$1.dP(), $$1.dR(), false, false));
   }

   private static boolean a(caz $$0, Set<cba> $$1, bzm $$2, boolean $$3) {
      caz $$4 = caz.a($$2);
      caz $$5 = caz.a($$4, $$0, $$1);
      boolean $$6 = $$4.a().g($$5.a()) > 4096.0;
      if ($$3 && !$$6) {
         $$2.d($$5.a(), $$5.c(), $$5.d());
         $$2.i($$5.b());
         return true;
      } else {
         $$2.b($$5.a());
         $$2.i($$5.b());
         $$2.v($$5.c());
         $$2.w($$5.d());
         caz $$7 = new caz($$2.bF(), fis.c, $$2.aa, $$2.ab);
         caz $$8 = caz.a($$7, $$0, $$1);
         $$2.c($$8.a(), $$8.c(), $$8.d());
         return false;
      }
   }

   @Override
   public void a(afa $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      $$1.v($$0.b());
      $$1.w($$0.e());
      $$1.bE();
      this.b.a(new aim.c($$1.dP(), $$1.dR(), false, false));
   }

   @Override
   public void a(afk $$0) {
      zz.a($$0, this, this.a);
      $$0.a(($$0x, $$1) -> this.u.b($$0x, $$1, 19));
   }

   @Override
   public void a(aec $$0) {
      zz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      this.a($$1, $$2, $$0.f());
      aeg $$3 = $$0.g();
      this.u.a(() -> {
         this.a($$1, $$2, $$3, false);
         egi $$3x = this.u.i().a($$1, $$2, false);
         if ($$3x != null) {
            this.a($$3x, $$1, $$2);
            this.a.f.a($$3x.f());
         }
      });
   }

   @Override
   public void a(adf $$0) {
      zz.a($$0, this, this.a);

      for (adf.a $$1 : $$0.b()) {
         this.u.i().a($$1.b().h, $$1.b().i, $$1.a());
      }

      for (adf.a $$2 : $$0.b()) {
         this.u.a(new dlz($$2.b().h, $$2.b().i));
      }

      for (adf.a $$3 : $$0.b()) {
         for (int $$4 = -1; $$4 <= 1; $$4++) {
            for (int $$5 = -1; $$5 <= 1; $$5++) {
               for (int $$6 = this.u.aq(); $$6 <= this.u.ar(); $$6++) {
                  this.a.f.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
               }
            }
         }
      }
   }

   private void a(int $$0, int $$1, aeb $$2) {
      this.u.i().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
   }

   private void a(egi $$0, int $$1, int $$2) {
      faa $$3 = this.u.i().q();
      egj[] $$4 = $$0.d();
      dlz $$5 = $$0.f();

      for (int $$6 = 0; $$6 < $$4.length; $$6++) {
         egj $$7 = $$4[$$6];
         int $$8 = this.u.h($$6);
         $$3.a(ke.a($$5, $$8), $$7.c());
      }

      this.u.b($$1 - 1, this.u.aq(), $$2 - 1, $$1 + 1, this.u.ar(), $$2 + 1);
   }

   @Override
   public void a(adw $$0) {
      zz.a($$0, this, this.a);
      this.u.i().a($$0.b());
      this.b($$0);
   }

   private void b(adw $$0) {
      dlz $$1 = $$0.b();
      this.u.a(() -> {
         faa $$1x = this.u.C_();
         $$1x.a($$1, false);

         for (int $$2 = $$1x.d(); $$2 < $$1x.e(); $$2++) {
            ke $$3 = ke.a($$1, $$2);
            $$1x.a(dnd.b, $$3, null);
            $$1x.a(dnd.a, $$3, null);
         }

         for (int $$4 = this.u.aq(); $$4 <= this.u.ar(); $$4++) {
            $$1x.a(ke.a($$1, $$4), true);
         }
      });
   }

   @Override
   public void a(acy $$0) {
      zz.a($$0, this, this.a);
      this.u.b($$0.e(), $$0.b(), 19);
   }

   @Override
   public void a(ags $$0) {
      zz.a($$0, this, this.a);
      this.a.ba().d();
      this.K();
      fxp.c $$1 = this.a.m.e().k();
      this.a.b(new gif(o, this.b));
      this.b.a(acf.d, new gri(this.a, this.b, new grp(this.t, this.e, this.J, this.K, this.d, this.c, this.f, this.h, $$1, this.i, this.a())));
      this.b(aib.a);
      this.b.a(acf.b);
   }

   @Override
   public void a(agx $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      cam $$2 = (cam)this.u.a($$0.e());
      if ($$2 == null) {
         $$2 = this.a.t;
      }

      if ($$1 != null) {
         if ($$1 instanceof caa) {
            this.u.a($$1.dC(), $$1.dE(), $$1.dI(), ayz.jo, aza.h, 0.1F, (this.E.i() - this.E.i()) * 0.35F + 0.9F, false);
         } else {
            this.u.a($$1.dC(), $$1.dE(), $$1.dI(), ayz.oF, aza.h, 0.2F, (this.E.i() - this.E.i()) * 1.4F + 2.0F, false);
         }

         this.a.g.a(new gun(this.a.ar(), this.u, $$1, $$2));
         if ($$1 instanceof cqz $$3) {
            dcv $$4 = $$3.e();
            if (!$$4.f()) {
               $$4.h($$0.f());
            }

            if ($$4.f()) {
               this.u.a($$0.b(), bzm.e.b);
            }
         } else if (!($$1 instanceof caa)) {
            this.u.a($$0.b(), bzm.e.b);
         }
      }
   }

   @Override
   public void a(agu $$0) {
      zz.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aes $$0) {
      zz.a($$0, this, this.a);
      int $$1 = this.R++;
      if ($$0.b() != $$1) {
         k.error("Missing or out-of-order chat message from server, expected index {} but got {}", $$1, $$0.b());
         this.b.a(p);
      } else {
         Optional<yh> $$2 = $$0.h().a(this.T);
         if ($$2.isEmpty()) {
            k.error("Message from player with ID {} referenced unrecognized signature id", $$0.e());
            this.b.a(n);
         } else {
            this.T.a($$2.get(), $$0.g());
            UUID $$3 = $$0.e();
            grw $$4 = this.a($$3);
            if ($$4 == null) {
               k.error("Received player chat packet for unknown player with ID: {}", $$3);
               this.a.ba().a($$3, $$0.g(), $$0.k());
            } else {
               yf $$5 = $$4.b();
               yj $$6;
               if ($$5 != null) {
                  $$6 = new yj($$0.f(), $$3, $$5.c());
               } else {
                  $$6 = yj.a($$3);
               }

               ye $$8 = new ye($$6, $$0.g(), $$2.get(), $$0.i(), $$0.j());
               $$8 = $$4.c().updateAndValidate($$8);
               if ($$8 != null) {
                  this.a.ba().a($$8, $$4.a(), $$0.k());
               } else {
                  this.a.ba().a($$3, $$0.g(), $$0.k());
               }
            }
         }
      }
   }

   @Override
   public void a(ads $$0) {
      zz.a($$0, this, this.a);
      this.a.ba().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adr $$0) {
      zz.a($$0, this, this.a);
      Optional<ya> $$1 = $$0.b().a(this.T);
      if ($$1.isEmpty()) {
         this.b.a(n);
      } else {
         this.S.a($$1.get());
         if (!this.a.ba().a($$1.get())) {
            this.a.m.e().a($$1.get());
         }
      }
   }

   @Override
   public void a(acs $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         if ($$0.e() == 0) {
            cam $$2 = (cam)$$1;
            $$2.a(bxi.a);
         } else if ($$0.e() == 3) {
            cam $$3 = (cam)$$1;
            $$3.a(bxi.b);
         } else if ($$0.e() == 2) {
            cut $$4 = (cut)$$1;
            $$4.a(false, false);
         } else if ($$0.e() == 4) {
            this.a.g.a($$1, me.f);
         } else if ($$0.e() == 5) {
            this.a.g.a($$1, me.r);
         }
      }
   }

   @Override
   public void a(adz $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         $$1.q($$0.e());
      }
   }

   @Override
   public void a(agn $$0) {
      zz.a($$0, this, this.a);
      this.u.a($$0.b(), $$0.e(), $$0.f());
      this.e.a($$0.b());
   }

   @Override
   public void a(afx $$0) {
      zz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e());
   }

   @Override
   public void a(agh $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.e());
      if ($$1 == null) {
         k.warn("Received passengers for unknown entity");
      } else {
         boolean $$2 = $$1.B(this.a.t);
         $$1.bR();

         for (int $$3 : $$0.b()) {
            bzm $$4 = this.u.a($$3);
            if ($$4 != null) {
               $$4.a($$1, true);
               if ($$4 == this.a.t) {
                  this.O = OptionalInt.empty();
                  if (!$$2) {
                     if ($$1 instanceof cxe) {
                        this.a.t.aa = $$1.dP();
                        this.a.t.v($$1.dP());
                        this.a.t.r($$1.dP());
                     }

                     xo $$5 = xo.a("mount.onboard", this.a.n.A.k());
                     this.a.m.a($$5, false);
                     this.a.aZ().d($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aga $$0) {
      zz.a($$0, this, this.a);
      if (this.u.a($$0.b()) instanceof cak $$2) {
         $$2.e_($$0.e());
      }
   }

   private static dcv a(cut $$0) {
      for (bxi $$1 : bxi.values()) {
         dcv $$2 = $$0.b($$1);
         if ($$2.c(kq.H)) {
            return $$2;
         }
      }

      return new dcv(dcz.wW);
   }

   @Override
   public void a(adt $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = $$0.a(this.u);
      if ($$1 != null) {
         switch ($$0.b()) {
            case 21:
               this.a.al().a((hvr)(new hvi((crr)$$1)));
               break;
            case 35:
               int $$2 = 40;
               this.a.g.a($$1, me.an, 30);
               this.u.a($$1.dC(), $$1.dE(), $$1.dI(), ayz.Bc, $$1.do(), 1.0F, 1.0F, false);
               if ($$1 == this.a.t) {
                  this.a.j.a(a((cut)this.a.t));
               }
               break;
            case 63:
               this.a.al().a((hvr)(new hvn((cpg)$$1)));
               break;
            default:
               $$1.b($$0.b());
         }
      }
   }

   @Override
   public void a(adp $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         $$1.c($$0.a(this.u));
      }
   }

   @Override
   public void a(age $$0) {
      zz.a($$0, this, this.a);
      this.a.t.I($$0.b());
      this.a.t.gD().a($$0.e());
      this.a.t.gD().b($$0.f());
   }

   @Override
   public void a(agd $$0) {
      zz.a($$0, this, this.a);
      this.a.t.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afi $$0) {
      zz.a($$0, this, this.a);
      ahh $$1 = $$0.b();
      amd<dmu> $$2 = $$1.b();
      jl<ehy> $$3 = $$1.a();
      gwi $$4 = this.a.t;
      amd<dmu> $$5 = $$4.ai().aj();
      boolean $$6 = $$2 != $$5;
      ger.a $$7 = this.a($$4.eM(), $$2, $$5);
      if ($$6) {
         Map<fce, fcg> $$8 = this.u.m();
         boolean $$9 = $$1.f();
         boolean $$10 = $$1.g();
         int $$11 = $$1.j();
         grk.a $$12 = new grk.a(this.v.q(), this.v.l(), $$10);
         this.v = $$12;
         this.u = new grk(this, $$12, $$2, $$3, this.C, this.D, this.a.f, $$9, $$1.c(), $$11);
         this.u.a($$8);
         this.a.a(this.u, $$7);
      }

      this.a.u = null;
      if ($$4.gv()) {
         $$4.p();
      }

      gwi $$13;
      if ($$0.a((byte)2)) {
         $$13 = this.a.r.a(this.u, $$4.l(), $$4.m(), $$4.H(), $$4.cm());
      } else {
         $$13 = this.a.r.a(this.u, $$4.l(), $$4.m());
      }

      this.a($$13, this.u, $$7);
      $$13.e($$4.ar());
      this.a.t = $$13;
      if ($$6) {
         this.a.s().c();
      }

      this.a.u = $$13;
      if ($$0.a((byte)2)) {
         List<all.c<?>> $$15 = $$4.au().c();
         if ($$15 != null) {
            $$13.au().a($$15);
         }

         $$13.i($$4.dA());
         $$13.v($$4.dP());
         $$13.w($$4.dR());
      } else {
         $$13.A();
         $$13.v(-180.0F);
      }

      if ($$0.a((byte)1)) {
         $$13.fg().a($$4.fg());
      } else {
         $$13.fg().b($$4.fg());
      }

      this.u.d($$13);
      $$13.k = new gwh(this.a.n);
      this.a.r.a($$13);
      $$13.v($$4.gK());
      $$13.b($$4.n());
      $$13.a($$1.h());
      $$13.f($$1.i());
      $$13.cT = $$4.cT;
      $$13.cU = $$4.cU;
      if (this.a.z instanceof gdx || this.a.z instanceof gdx.a) {
         this.a.a(null);
      }

      this.a.r.a($$1.d(), $$1.e());
   }

   private ger.a a(boolean $$0, amd<dmu> $$1, amd<dmu> $$2) {
      ger.a $$3 = ger.a.c;
      if (!$$0) {
         if ($$1 == dmu.j || $$2 == dmu.j) {
            $$3 = ger.a.a;
         } else if ($$1 == dmu.k || $$2 == dmu.k) {
            $$3 = ger.a.b;
         }
      }

      return $$3;
   }

   @Override
   public void a(adv $$0) {
      zz.a($$0, this, this.a);
      fis $$1 = $$0.b();
      this.a.s.a($$1.a(), $$1.b(), $$1.c(), $$0.g().a(), aza.e, 4.0F, (1.0F + (this.a.s.A.i() - this.a.s.A.i()) * 0.2F) * 0.7F, false);
      this.a.s.a($$0.f(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
      $$0.e().ifPresent(this.a.t::j);
   }

   @Override
   public void a(ady $$0) {
      zz.a($$0, this, this.a);
      if (this.u.a($$0.f()) instanceof coq $$2) {
         gwi $$3 = this.a.t;
         int $$4 = $$0.e();
         bxr $$5 = new bxr(coq.v($$4));
         czo $$6 = new czo($$0.b(), $$3.gs(), $$5, $$2, $$4);
         $$3.cn = $$6;
         this.a.a(new gha($$6, $$3.gs(), $$2, $$4));
      }
   }

   @Override
   public void a(aeo $$0) {
      zz.a($$0, this, this.a);
      gek.a($$0.e(), this.a, $$0.b(), $$0.f());
   }

   @Override
   public void a(adm $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      dcv $$2 = $$0.f();
      int $$3 = $$0.e();
      this.a.aC().a($$2);
      boolean $$5;
      if (this.a.z instanceof ggq $$4) {
         $$5 = !$$4.E();
      } else {
         $$5 = false;
      }

      if ($$0.b() == 0) {
         if (czp.e($$3) && !$$2.f()) {
            dcv $$7 = $$1.cm.b($$3).g();
            if ($$7.f() || $$7.M() < $$2.M()) {
               $$2.d(5);
            }
         }

         $$1.cm.a($$3, $$0.g(), $$2);
      } else if ($$0.b() == $$1.cn.l && ($$0.b() != 0 || !$$5)) {
         $$1.cn.a($$3, $$0.g(), $$2);
      }

      if (this.a.z instanceof ggq) {
         $$1.cm.a($$3, $$2);
         $$1.cm.d();
      }
   }

   @Override
   public void a(afw $$0) {
      zz.a($$0, this, this.a);
      this.a.aC().a($$0.b());
      if (!(this.a.z instanceof ggq)) {
         this.a.t.cn.a($$0.b());
      }
   }

   @Override
   public void a(agi $$0) {
      zz.a($$0, this, this.a);
      this.a.aC().a($$0.e());
      this.a.t.gs().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adk $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      if ($$0.b() == 0) {
         $$1.cm.a($$0.e(), $$0.f(), $$0.g());
      } else if ($$0.b() == $$1.cn.l) {
         $$1.cn.a($$0.e(), $$0.f(), $$0.g());
      }
   }

   @Override
   public void a(aep $$0) {
      zz.a($$0, this, this.a);
      jb $$1 = $$0.b();
      if (this.u.c_($$1) instanceof ecn $$2) {
         this.a.t.a($$2, $$0.e());
      } else {
         k.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", this.u.c_($$1), $$1);
      }
   }

   @Override
   public void a(acw $$0) {
      zz.a($$0, this, this.a);
      jb $$1 = $$0.b();
      this.a.s.a($$1, $$0.e()).ifPresent($$1x -> {
         bci.j $$2 = new bci.j($$1x.t(), k);

         try {
            $$1x.b(fcy.a($$2, this.J, $$0.f()));
         } catch (Throwable var7) {
            try {
               $$2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         $$2.close();
         if ($$1x instanceof ebk && this.a.z instanceof ggl) {
            ((ggl)this.a.z).E();
         }
      });
   }

   @Override
   public void a(adl $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      if ($$1.cn != null && $$1.cn.l == $$0.b()) {
         $$1.cn.b($$0.e(), $$0.f());
      }
   }

   @Override
   public void a(agc $$0) {
      zz.a($$0, this, this.a);
      if (this.u.a($$0.b()) instanceof cam $$2) {
         $$0.e().forEach($$1 -> $$2.a((bzw)$$1.getFirst(), (dcv)$$1.getSecond()));
      }
   }

   @Override
   public void a(adj $$0) {
      zz.a($$0, this, this.a);
      this.a.t.e();
   }

   @Override
   public void a(acx $$0) {
      zz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
   }

   @Override
   public void a(acv $$0) {
      zz.a($$0, this, this.a);
      this.a.s.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(adx $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      adx.a $$2 = $$0.b();
      float $$3 = $$0.e();
      int $$4 = bcb.d($$3 + 0.5F);
      if ($$2 == adx.b) {
         $$1.a(xo.c("block.minecraft.spawn.not_valid"), false);
      } else if ($$2 == adx.c) {
         this.u.l().b(true);
         this.u.e(0.0F);
      } else if ($$2 == adx.d) {
         this.u.l().b(false);
         this.u.e(1.0F);
      } else if ($$2 == adx.e) {
         this.a.r.a(dmr.a($$4));
      } else if ($$2 == adx.f) {
         this.a.a(new gew(true, () -> {
            this.a.t.j.b(new ahy(ahy.a.a));
            this.a.a(null);
         }));
      } else if ($$2 == adx.g) {
         fui $$5 = this.a.n;
         xo $$6 = null;
         if ($$3 == 0.0F) {
            this.a.a(new gdy());
         } else if ($$3 == 101.0F) {
            $$6 = xo.a("demo.help.movement", $$5.v.k(), $$5.w.k(), $$5.x.k(), $$5.y.k());
         } else if ($$3 == 102.0F) {
            $$6 = xo.a("demo.help.jump", $$5.z.k());
         } else if ($$3 == 103.0F) {
            $$6 = xo.a("demo.help.inventory", $$5.C.k());
         } else if ($$3 == 104.0F) {
            $$6 = xo.a("demo.day.6", $$5.M.k());
         }

         if ($$6 != null) {
            this.a.m.e().a($$6);
            this.a.aZ().c($$6);
         }
      } else if ($$2 == adx.h) {
         this.u.a($$1, $$1.dC(), $$1.dG(), $$1.dI(), ayz.aF, aza.h, 0.18F, 0.45F);
      } else if ($$2 == adx.i) {
         this.u.e($$3);
      } else if ($$2 == adx.j) {
         this.u.c($$3);
      } else if ($$2 == adx.k) {
         this.u.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), ayz.wi, aza.g, 1.0F, 1.0F);
      } else if ($$2 == adx.l) {
         this.u.a(me.q, $$1.dC(), $$1.dE(), $$1.dI(), 0.0, 0.0, 0.0);
         if ($$4 == 1) {
            this.u.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), ayz.ix, aza.f, 1.0F, 1.0F);
         }
      } else if ($$2 == adx.m) {
         this.a.t.b($$3 == 0.0F);
      } else if ($$2 == adx.n) {
         this.a.t.y($$3 == 1.0F);
      } else if ($$2 == adx.o && this.Z != null) {
         this.Z.c();
      }
   }

   private void a(gwi $$0, grk $$1, ger.a $$2) {
      this.Z = new grt($$0, $$1, this.a.f);
      this.a.a(new ger(this.Z::b, $$2));
   }

   @Override
   public void a(aei $$0) {
      zz.a($$0, this, this.a);
      fce $$1 = $$0.b();
      fcg $$2 = this.a.s.a($$1);
      if ($$2 == null) {
         $$2 = fcg.a($$0.e(), $$0.f(), this.a.s.aj());
         this.a.s.a($$1, $$2);
      }

      $$0.a($$2);
      this.a.aH().a($$1, $$2);
   }

   @Override
   public void a(aed $$0) {
      zz.a($$0, this, this.a);
      if ($$0.b()) {
         this.a.s.b($$0.e(), $$0.g(), $$0.f());
      } else {
         this.a.s.c($$0.e(), $$0.g(), $$0.f());
      }
   }

   @Override
   public void a(ahd $$0) {
      zz.a($$0, this, this.a);
      this.y.a($$0);
   }

   @Override
   public void a(afl $$0) {
      zz.a($$0, this, this.a);
      ame $$1 = $$0.b();
      if ($$1 == null) {
         this.y.a(null, false);
      } else {
         aj $$2 = this.y.a($$1);
         this.y.a($$2, false);
      }
   }

   @Override
   public void a(adi $$0) {
      zz.a($$0, this, this.a);
      this.F = new CommandDispatcher($$0.a(eg.a(this.J, this.K), s));
   }

   @Override
   public void a(agt $$0) {
      zz.a($$0, this, this.a);
      this.a.al().a($$0.b(), $$0.e());
   }

   @Override
   public void a(adh $$0) {
      zz.a($$0, this, this.a);
      this.z.a($$0.e(), $$0.b());
   }

   @Override
   public void a(ahg $$0) {
      zz.a($$0, this, this.a);
      this.G = new grm($$0.b(), $$0.e());
   }

   @Override
   public void a(aey $$0) {
      zz.a($$0, this, this.a);
      fis $$1 = $$0.a(this.u);
      if ($$1 != null) {
         this.a.t.a($$0.b(), $$1);
      }
   }

   @Override
   public void a(agw $$0) {
      zz.a($$0, this, this.a);
      if (!this.B.a($$0.b(), $$0.e())) {
         k.debug("Got unhandled response to tag query {}", $$0.b());
      }
   }

   @Override
   public void a(act $$0) {
      zz.a($$0, this, this.a);
      ObjectIterator $$4 = $$0.b().object2IntEntrySet().iterator();

      while ($$4.hasNext()) {
         Entry<azg<?>> $$1 = (Entry<azg<?>>)$$4.next();
         azg<?> $$2 = (azg<?>)$$1.getKey();
         int $$3 = $$1.getIntValue();
         this.a.t.l().a(this.a.t, $$2, $$3);
      }

      if (this.a.z instanceof gex $$4x) {
         $$4x.n();
      }
   }

   @Override
   public void a(afc $$0) {
      zz.a($$0, this, this.a);
      ftp $$1 = this.a.t.m();
      if ($$0.e()) {
         $$1.b();
      }

      for (afc.a $$2 : $$0.b()) {
         $$1.a($$2.c());
         if ($$2.b()) {
            $$1.d($$2.c().a());
         }

         if ($$2.a()) {
            gaa.a(this.a.aB(), $$2.c().b());
         }
      }

      this.a($$1);
   }

   @Override
   public void a(afd $$0) {
      zz.a($$0, this, this.a);
      ftp $$1 = this.a.t.m();

      for (diu $$2 : $$0.b()) {
         $$1.a($$2);
      }

      this.a($$1);
   }

   @Override
   public void a(afe $$0) {
      zz.a($$0, this, this.a);
      ftp $$1 = this.a.t.m();
      $$1.a($$0.b());
      this.a($$1);
   }

   private void a(ftp $$0) {
      $$0.c();
      this.af.a($$0, this.u);
      if (this.a.z instanceof gjo $$1) {
         $$1.H();
      }
   }

   @Override
   public void a(ahf $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 instanceof cam) {
         jl<byo> $$2 = $$0.e();
         byq $$3 = new byq($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
         if (!$$0.k()) {
            $$3.k();
         }

         ((cam)$$1).c($$3, null);
      }
   }

   private <T> jy.a<T> a(amd<? extends jy<? extends T>> $$0, bag.a $$1) {
      jy<T> $$2 = this.J.f($$0);
      return $$2.a($$1.a($$2));
   }

   @Override
   public void a(aar $$0) {
      zz.a($$0, this, this.a);
      List<jy.a<?>> $$1 = new ArrayList<>($$0.b().size());
      boolean $$2 = this.b.e();
      $$0.b().forEach(($$2x, $$3x) -> {
         if (!$$2 || kc.a($$2x)) {
            $$1.add(this.a($$2x, $$3x));
         }
      });
      $$1.forEach(jy.a::d);
      this.M = eby.a(this.J, this.K);
      List<dcv> $$3 = List.copyOf(dbn.e().l());
      this.af.a($$3);
   }

   @Override
   public void a(aet $$0) {
   }

   @Override
   public void a(aeu $$0) {
   }

   @Override
   public void a(aev $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 == this.a.t) {
         if (this.a.t.n()) {
            this.a.a(new gdx($$0.e(), this.u.l().l()));
         } else {
            this.a.t.gp();
         }
      }
   }

   @Override
   public void a(adc $$0) {
      zz.a($$0, this, this.a);
      this.v.a($$0.b());
      this.v.a($$0.e());
   }

   @Override
   public void a(aft $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = $$0.a(this.u);
      if ($$1 != null) {
         this.a.a($$1);
      }
   }

   @Override
   public void a(aea $$0) {
      zz.a($$0, this, this.a);
      eft $$1 = this.u.F_();
      $$1.d($$0.b(), $$0.e());
      long $$2 = $$0.h();
      if ($$2 > 0L) {
         $$1.a($$0.g(), $$0.f(), $$2);
      } else {
         $$1.a($$0.f());
      }

      $$1.a($$0.i());
      $$1.c($$0.k());
      $$1.b($$0.j());
   }

   @Override
   public void a(afo $$0) {
      zz.a($$0, this, this.a);
      this.u.F_().d($$0.e(), $$0.b());
   }

   @Override
   public void a(afp $$0) {
      zz.a($$0, this, this.a);
      this.u.F_().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(afq $$0) {
      zz.a($$0, this, this.a);
      this.u.F_().a($$0.b());
   }

   @Override
   public void a(afs $$0) {
      zz.a($$0, this, this.a);
      this.u.F_().c($$0.b());
   }

   @Override
   public void a(afr $$0) {
      zz.a($$0, this, this.a);
      this.u.F_().b($$0.b());
   }

   @Override
   public void a(adg $$0) {
      zz.a($$0, this, this.a);
      this.a.m.d();
      if ($$0.b()) {
         this.a.m.a();
      }
   }

   @Override
   public void a(afm $$0) {
      zz.a($$0, this, this.a);
      if (this.c != null) {
         this.c.d = $$0.b();
         $$0.e().map(grz::b).ifPresent(this.c::a);
         gsa.b(this.c);
      }
   }

   @Override
   public void a(ado $$0) {
      zz.a($$0, this, this.a);
      this.z.a($$0.b(), $$0.e());
   }

   @Override
   public void a(afn $$0) {
      zz.a($$0, this, this.a);
      this.a.m.a($$0.b(), false);
   }

   @Override
   public void a(ago $$0) {
      zz.a($$0, this, this.a);
      this.a.m.c($$0.b());
   }

   @Override
   public void a(agm $$0) {
      zz.a($$0, this, this.a);
      this.a.m.b($$0.b());
   }

   @Override
   public void a(agp $$0) {
      zz.a($$0, this, this.a);
      this.a.m.a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(agv $$0) {
      zz.a($$0, this, this.a);
      this.a.m.i().b($$0.b().getString().isEmpty() ? null : $$0.b());
      this.a.m.i().a($$0.e().getString().isEmpty() ? null : $$0.e());
   }

   @Override
   public void a(afg $$0) {
      zz.a($$0, this, this.a);
      if ($$0.a(this.u) instanceof cam $$1) {
         $$1.f($$0.e());
      }
   }

   @Override
   public void a(aew $$0) {
      zz.a($$0, this, this.a);

      for (UUID $$1 : $$0.b()) {
         this.a.aO().f($$1);
         grw $$2 = this.w.remove($$1);
         if ($$2 != null) {
            this.x.remove($$2);
         }
      }
   }

   @Override
   public void a(aex $$0) {
      zz.a($$0, this, this.a);

      for (aex.b $$1 : $$0.f()) {
         grw $$2 = new grw(Objects.requireNonNull($$1.b()), this.J());
         if (this.w.putIfAbsent($$1.a(), $$2) == null) {
            this.a.aO().a($$2);
         }
      }

      for (aex.b $$3 : $$0.e()) {
         grw $$4 = this.w.get($$3.a());
         if ($$4 == null) {
            k.warn("Ignoring player info update for unknown player {} ({})", $$3.a(), $$0.b());
         } else {
            for (aex.a $$5 : $$0.b()) {
               this.a($$5, $$3, $$4);
            }
         }
      }
   }

   private void a(aex.a $$0, aex.b $$1, grw $$2) {
      switch ($$0) {
         case b:
            this.a($$1, $$2);
            break;
         case c:
            if ($$2.e() != $$1.e() && this.a.t != null && this.a.t.cK().equals($$1.a())) {
               this.a.t.a($$1.e());
            }

            $$2.a($$1.e());
            break;
         case d:
            if ($$1.c()) {
               this.x.add($$2);
            } else {
               this.x.remove($$2);
            }
            break;
         case e:
            $$2.a($$1.d());
            break;
         case f:
            $$2.a($$1.f());
            break;
         case h:
            $$2.b($$1.g());
            break;
         case g:
            $$2.b($$1.h());
      }
   }

   private void a(aex.b $$0, grw $$1) {
      GameProfile $$2 = $$1.a();
      bcq $$3 = this.a.aW();
      if ($$3 == null) {
         k.warn("Ignoring chat session from {} due to missing Services public key", $$2.getName());
         $$1.a(this.J());
      } else {
         yf.a $$4 = $$0.i();
         if ($$4 != null) {
            try {
               yf $$5 = $$4.a($$2, $$3);
               $$1.a($$5);
            } catch (cux.b var7) {
               k.error("Failed to validate profile key for player: '{}'", $$2.getName(), var7);
               $$1.a(this.J());
            }
         } else {
            $$1.a(this.J());
         }
      }
   }

   private boolean J() {
      return this.a.aX() && this.aa;
   }

   @Override
   public void a(aer $$0) {
      zz.a($$0, this, this.a);
      cut $$1 = this.a.t;
      $$1.gt().b = $$0.e();
      $$1.gt().d = $$0.g();
      $$1.gt().a = $$0.b();
      $$1.gt().c = $$0.f();
      $$1.gt().a($$0.h());
      $$1.gt().b($$0.i());
   }

   @Override
   public void a(agr $$0) {
      zz.a($$0, this, this.a);
      this.a.s.a(this.a.t, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
   }

   @Override
   public void a(agq $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.f());
      if ($$1 != null) {
         this.a.s.a(this.a.t, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
      }
   }

   @Override
   public void a(acz $$0) {
      zz.a($$0, this, this.a);
      this.a.m.k().a($$0);
   }

   @Override
   public void a(adn $$0) {
      zz.a($$0, this, this.a);
      if ($$0.e() == 0) {
         this.a.t.gP().a($$0.b());
      } else {
         this.a.t.gP().a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(aem $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.a.t.dh();
      if ($$1 != this.a.t && $$1.di()) {
         fis $$2 = $$0.b();
         fis $$3;
         if ($$1.bU()) {
            $$3 = $$1.l_().a();
         } else {
            $$3 = $$1.dv();
         }

         if ($$2.f($$3) > 1.0E-5F) {
            if ($$1.bU()) {
               $$1.l_().f();
            }

            $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
         }

         this.b.a(ain.a($$1));
      }
   }

   @Override
   public void a(aen $$0) {
      zz.a($$0, this, this.a);
      dcv $$1 = this.a.t.b($$0.b());
      ggi.a $$2 = ggi.a.a($$1);
      if ($$2 != null) {
         this.a.a(new ggi($$2));
      }
   }

   @Override
   public void a(abe $$0) {
      if ($$0 instanceof abn $$1) {
         this.a.l.a.a($$1.b(), $$1.c(), $$1.d());
      } else if ($$0 instanceof abm $$2) {
         this.a.l.g.a($$2.b(), $$2.c());
      } else if ($$0 instanceof abs $$3) {
         this.a.l.h.a($$3);
      } else if ($$0 instanceof abt $$4) {
         this.a.l.i.a($$4.c(), $$4.d(), $$4.b());
      } else if ($$0 instanceof abv $$5) {
         ((hcq)this.a.l.k).a($$5.b(), $$5.c(), $$5.d(), $$5.e(), $$5.f(), $$5.g());
      } else if ($$0 instanceof abq $$6) {
         this.a.l.n.a($$6.b(), $$6.c());
      } else if ($$0 instanceof abo $$7) {
         hbt.a $$8 = new hbt.a($$7.b(), $$7.c(), $$7.d());
         this.a.l.n.a($$8);
      } else if ($$0 instanceof abp $$9) {
         this.a.l.n.a($$9.b());
      } else if ($$0 instanceof abu $$10) {
         hco $$11 = this.a.l.o;
         $$10.b().forEach($$11::a);
         $$10.c().forEach($$11::b);
      } else if ($$0 instanceof abk $$12) {
         this.a.l.r.a($$12.b(), $$12.c(), $$12.d());
      } else if ($$0 instanceof abb $$13) {
         this.a.l.n.a($$13.b());
      } else if ($$0 instanceof aba $$14) {
         this.a.l.p.a($$14.b());
      } else if ($$0 instanceof abl $$15) {
         this.a.l.p.a($$15.b(), this.u.ae());
      } else if ($$0 instanceof abi $$16) {
         this.a.l.s.a($$16.b(), $$16.c(), $$16.d(), $$16.e());
      } else if ($$0 instanceof abj) {
         this.a.l.s.a();
      } else if ($$0 instanceof abr $$17) {
         this.a.l.q.a($$17.b());
      } else if ($$0 instanceof abg $$18) {
         this.a.l.t.a($$18.b(), $$18.c());
      } else if ($$0 instanceof abh $$19) {
         this.a.l.t.a($$19.b(), $$19.c());
      } else if ($$0 instanceof abd $$20) {
         this.a.l.v.a($$20.b());
      } else {
         this.b($$0);
      }
   }

   private void b(abe $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(agg $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.b();
      if ($$0.f() == 0) {
         this.ad.a($$1, fka.c, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
      } else {
         fjp $$2 = this.ad.a($$1);
         if ($$2 != null) {
            if ($$0.f() == 1) {
               this.ad.j($$2);
            } else if ($$0.f() == 2) {
               $$2.a($$0.g());
               $$2.a($$0.e());
               $$2.b($$0.h().orElse(null));
            }
         }
      }
   }

   @Override
   public void a(agk $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fjw $$2 = fjw.c($$0.b());
      fjp $$3 = this.ad.a($$1);
      if ($$3 != null) {
         fjv $$4 = this.ad.a($$2, $$3, true);
         $$4.a($$0.f());
         $$4.a($$0.g().orElse(null));
         $$4.a($$0.h().orElse(null));
      } else {
         k.warn("Received packet for unknown scoreboard objective: {}", $$1);
      }
   }

   @Override
   public void a(afh $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fjw $$2 = fjw.c($$0.b());
      if ($$1 == null) {
         this.ad.b($$2);
      } else {
         fjp $$3 = this.ad.a($$1);
         if ($$3 != null) {
            this.ad.e($$2, $$3);
         } else {
            k.warn("Received packet for unknown scoreboard objective: {}", $$1);
         }
      }
   }

   @Override
   public void a(afy $$0) {
      zz.a($$0, this, this.a);
      String $$1 = $$0.e();
      fjp $$2 = $$1 == null ? null : this.ad.a($$1);
      this.ad.a($$0.b(), $$2);
   }

   @Override
   public void a(agj $$0) {
      zz.a($$0, this, this.a);
      agj.a $$1 = $$0.e();
      fjs $$2;
      if ($$1 == agj.a.a) {
         $$2 = this.ad.c($$0.f());
      } else {
         $$2 = this.ad.b($$0.f());
         if ($$2 == null) {
            k.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
            return;
         }
      }

      Optional<agj.b> $$4 = $$0.h();
      $$4.ifPresent($$1x -> {
         $$2.a($$1x.a());
         $$2.a($$1x.c());
         $$2.a($$1x.b());
         $$2.a($$1x.d());
         $$2.a($$1x.e());
         $$2.b($$1x.f());
         $$2.c($$1x.g());
      });
      agj.a $$5 = $$0.b();
      if ($$5 == agj.a.a) {
         for (String $$6 : $$0.g()) {
            this.ad.a($$6, $$2);
         }
      } else if ($$5 == agj.a.b) {
         for (String $$7 : $$0.g()) {
            this.ad.b($$7, $$2);
         }
      }

      if ($$1 == agj.a.b) {
         this.ad.d($$2);
      }
   }

   @Override
   public void a(aee $$0) {
      zz.a($$0, this, this.a);
      if ($$0.m() == 0) {
         double $$1 = $$0.l() * $$0.i();
         double $$2 = $$0.l() * $$0.j();
         double $$3 = $$0.l() * $$0.k();

         try {
            this.u.a($$0.n(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$1, $$2, $$3);
         } catch (Throwable var17) {
            k.warn("Could not spawn particle effect {}", $$0.n());
         }
      } else {
         for (int $$5 = 0; $$5 < $$0.m(); $$5++) {
            double $$6 = this.E.k() * $$0.i();
            double $$7 = this.E.k() * $$0.j();
            double $$8 = this.E.k() * $$0.k();
            double $$9 = this.E.k() * $$0.l();
            double $$10 = this.E.k() * $$0.l();
            double $$11 = this.E.k() * $$0.l();

            try {
               this.u.a($$0.n(), $$0.b(), $$0.e(), $$0.f() + $$6, $$0.g() + $$7, $$0.h() + $$8, $$9, $$10, $$11);
            } catch (Throwable var16) {
               k.warn("Could not spawn particle effect {}", $$0.n());
               return;
            }
         }
      }
   }

   @Override
   public void a(ahe $$0) {
      zz.a($$0, this, this.a);
      bzm $$1 = this.u.a($$0.b());
      if ($$1 != null) {
         if (!($$1 instanceof cam)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + $$1 + ")");
         } else {
            cbp $$2 = ((cam)$$1).fg();

            for (ahe.a $$3 : $$0.e()) {
               cbo $$4 = $$2.a($$3.a());
               if ($$4 == null) {
                  k.warn("Entity {} does not have attribute {}", $$1, $$3.a().g());
               } else {
                  $$4.a($$3.b());
                  $$4.f();

                  for (cbq $$5 : $$3.c()) {
                     $$4.b($$5);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aeq $$0) {
      zz.a($$0, this, this.a);
      cym $$1 = this.a.t.cn;
      if ($$1.l == $$0.b()) {
         if (this.a.z instanceof gjo $$2) {
            $$2.a($$0.e());
         }
      }
   }

   @Override
   public void a(aef $$0) {
      zz.a($$0, this, this.a);
      int $$1 = $$0.b();
      int $$2 = $$0.e();
      aeg $$3 = $$0.f();
      this.u.a(() -> this.a($$1, $$2, $$3, true));
   }

   private void a(int $$0, int $$1, aeg $$2, boolean $$3) {
      faa $$4 = this.u.i().q();
      BitSet $$5 = $$2.a();
      BitSet $$6 = $$2.b();
      Iterator<byte[]> $$7 = $$2.c().iterator();
      this.a($$0, $$1, $$4, dnd.a, $$5, $$6, $$7, $$3);
      BitSet $$8 = $$2.d();
      BitSet $$9 = $$2.e();
      Iterator<byte[]> $$10 = $$2.f().iterator();
      this.a($$0, $$1, $$4, dnd.b, $$8, $$9, $$10, $$3);
      $$4.a(new dlz($$0, $$1), true);
   }

   @Override
   public void a(aej $$0) {
      zz.a($$0, this, this.a);
      cym $$1 = this.a.t.cn;
      if ($$0.b() == $$1.l && $$1 instanceof czx $$2) {
         $$2.a($$0.e());
         $$2.f($$0.g());
         $$2.g($$0.f());
         $$2.a($$0.h());
         $$2.b($$0.i());
      }
   }

   @Override
   public void a(afv $$0) {
      zz.a($$0, this, this.a);
      this.C = $$0.b();
      this.a.n.b(this.C);
      this.u.i().a($$0.b());
   }

   @Override
   public void a(agl $$0) {
      zz.a($$0, this, this.a);
      this.D = $$0.b();
      this.u.i(this.D);
   }

   @Override
   public void a(afu $$0) {
      zz.a($$0, this, this.a);
      this.u.i().d($$0.b(), $$0.e());
   }

   @Override
   public void a(acu $$0) {
      zz.a($$0, this, this.a);
      this.u.b($$0.b());
   }

   @Override
   public void a(adb $$0) {
      zz.a($$0, this, this.a);

      for (zw<? super acq> $$1 : $$0.b()) {
         $$1.a(this);
      }
   }

   @Override
   public void a(afb $$0) {
      zz.a($$0, this, this.a);
      if (this.u.a($$0.b()) instanceof cvc $$2) {
         $$2.c = $$0.e();
      }
   }

   @Override
   public void a(ade $$0) {
      this.W.a();
   }

   @Override
   public void a(add $$0) {
      this.W.a($$0.b());
      this.b(new ahx(this.W.b()));
   }

   @Override
   public void a(adq $$0) {
      this.a.aR().a($$0.b(), $$0.e());
   }

   @Override
   public void a(aku $$0) {
      this.X.a($$0);
   }

   @Override
   public void a(agz $$0) {
      zz.a($$0, this, this.a);
      if (this.a.z instanceof ghr $$1) {
         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ahc $$0) {
      zz.a($$0, this, this.a);
      $$0.a(this.ae);
   }

   private void a(int $$0, int $$1, faa $$2, dnd $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
      for (int $$8 = 0; $$8 < $$2.c(); $$8++) {
         int $$9 = $$2.d() + $$8;
         boolean $$10 = $$4.get($$8);
         boolean $$11 = $$5.get($$8);
         if ($$10 || $$11) {
            $$2.a($$3, ke.a($$0, $$9, $$1), $$10 ? new egd((byte[])$$6.next().clone()) : new egd());
            if ($$7) {
               this.u.c($$0, $$9, $$1);
            }
         }
      }
   }

   public wd m() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.b.i() && !this.ac;
   }

   public Collection<grw> n() {
      return this.x;
   }

   public Collection<grw> o() {
      return this.w.values();
   }

   public Collection<UUID> p() {
      return this.w.keySet();
   }

   @Nullable
   public grw a(UUID $$0) {
      return this.w.get($$0);
   }

   @Nullable
   public grw a(String $$0) {
      for (grw $$1 : this.w.values()) {
         if ($$1.a().getName().equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public GameProfile q() {
      return this.t;
   }

   public grf r() {
      return this.y;
   }

   public CommandDispatcher<gro> s() {
      return this.F;
   }

   public grk t() {
      return this.u;
   }

   public ftt u() {
      return this.B;
   }

   public UUID v() {
      return this.H;
   }

   public Set<amd<dmu>> w() {
      return this.I;
   }

   public jz.b x() {
      return this.J;
   }

   public void a(ya $$0, boolean $$1) {
      if (this.S.a($$0, $$1) && this.S.c() > 64) {
         this.K();
      }
   }

   private void K() {
      int $$0 = this.S.a();
      if ($$0 > 0) {
         this.b(new ahs($$0));
      }
   }

   public void b(String $$0) {
      Instant $$1 = Instant.now();
      long $$2 = bax.c.a();
      xw.a $$3 = this.S.b();
      ya $$4 = this.Q.pack(new yh($$0, $$1, $$2, $$3.a()));
      this.b(new ahv($$0, $$1, $$2, $$4, $$3.b()));
   }

   public void c(String $$0) {
      yg<gro> $$1 = yg.b(this.F.parse($$0, this.z));
      if ($$1.a().isEmpty()) {
         this.b(new aht($$0));
      } else {
         Instant $$2 = Instant.now();
         long $$3 = bax.c.a();
         xw.a $$4 = this.S.b();
         es $$5 = es.a($$1, $$3x -> {
            yh $$4x = new yh($$3x, $$2, $$3, $$4.a());
            return this.Q.pack($$4x);
         });
         this.b(new ahu($$0, $$2, $$3, $$5, $$4.b()));
      }
   }

   public void a(String $$0, @Nullable get $$1) {
      switch (this.d($$0)) {
         case a:
            this.b(new aht($$0));
            this.a.a($$1);
            break;
         case b:
            this.a($$0, "multiplayer.confirm_command.parse_errors", $$1);
            break;
         case c:
            k.error("Not allowed to run command with signed argument from click event: '{}'", $$0);
            break;
         case d:
            this.a($$0, "multiplayer.confirm_command.permissions_required", $$1);
      }
   }

   private grl.a d(String $$0) {
      ParseResults<gro> $$1 = this.F.parse($$0, this.z);
      if (!a($$1)) {
         return grl.a.b;
      } else if (yg.a($$1)) {
         return grl.a.c;
      } else {
         ParseResults<gro> $$2 = this.F.parse($$0, this.A);
         return !a($$2) ? grl.a.d : grl.a.a;
      }
   }

   private static boolean a(ParseResults<?> $$0) {
      return !$$0.getReader().canRead() && $$0.getExceptions().isEmpty() && $$0.getContext().getLastChild().getCommand() != null;
   }

   private void a(String $$0, String $$1, @Nullable get $$2) {
      get $$3 = this.a.z;
      this.a.a(new gdr($$3x -> {
         if ($$3x) {
            this.b(new aht($$0));
         }

         if ($$3x) {
            this.a.a($$2);
         } else {
            this.a.a($$3);
         }
      }, q, xo.a($$1, xo.b($$0).a(o.o))));
   }

   public void a(atl $$0) {
      if (!$$0.equals(this.V)) {
         this.b(new aau($$0));
         this.V = $$0;
      }
   }

   @Override
   public void d() {
      if (this.P != null && this.a.w().b()) {
         this.y();
      }

      if (this.U != null && this.U.isDone()) {
         this.U.join().ifPresent(this::a);
         this.U = null;
      }

      this.g();
      if (this.a.aR().f()) {
         this.X.a();
      }

      this.Y.a();
      this.e.a();
      if (this.Z != null) {
         this.Z.a();
         if (this.Z.b() && !this.a.t.gT()) {
            this.b.a(new aiw());
            this.a.t.w(true);
         }
      }
   }

   public void y() {
      this.U = this.a.w().a();
   }

   private void a(cuw $$0) {
      if (this.a.b(this.t.getId())) {
         if (this.P == null || !this.P.c().equals($$0)) {
            this.P = xz.a($$0);
            this.Q = this.P.a(this.t.getId());
            this.b(new ahw(this.P.a().a()));
         }
      }
   }

   @Override
   protected gfi e() {
      return new gfi() {
         @Override
         public void a(xo $$0) {
            grl.this.m().a($$0);
         }

         @Override
         public void a(String $$0, @Nullable get $$1) {
            grl.this.a($$0, $$1);
         }

         @Override
         public void a(jl<art> $$0, @Nullable get $$1) {
            grl.this.a($$0, this, $$1);
         }

         @Override
         public void a(ame $$0, Optional<vi> $$1) {
            grl.this.b(new aav($$0, $$1));
         }

         @Override
         public amw a() {
            return grl.this.a();
         }
      };
   }

   @Nullable
   public grz z() {
      return this.c;
   }

   public cyd A() {
      return this.K;
   }

   public boolean a(cyd $$0) {
      return $$0.a(this.A());
   }

   public fjx B() {
      return this.ad;
   }

   public deq C() {
      return this.L;
   }

   public eby D() {
      return this.M;
   }

   public void E() {
      this.af.a();
   }

   public gsc F() {
      return this.af;
   }

   public void a(grd<?, ?> $$0) {
      this.ag.add(new WeakReference<>($$0));
   }

   public wi.a G() {
      return this.N;
   }

   public hyd H() {
      return this.ae;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
