import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class avf extends avc implements ahl.a, ahm, avi, xc {
   static final Logger h = LogUtils.getLogger();
   private static final int i = -1;
   private static final int j = 4096;
   private static final int k = 80;
   private static final xo l = xo.c("multiplayer.disconnect.chat_validation_failed");
   private static final xo m = xo.c("chat.disabled.invalid_command_signature").a(o.m);
   private static final int n = 1000;
   public auc f;
   public final ava g;
   private int o;
   private int p = -1;
   private final bde q = new bde(20, 200);
   private final bde r = new bde(20, 1480);
   private double s;
   private double t;
   private double u;
   private double v;
   private double w;
   private double x;
   @Nullable
   private bzm y;
   private double z;
   private double A;
   private double B;
   private double C;
   private double D;
   private double E;
   @Nullable
   private fis F;
   private int G;
   private int H;
   private boolean I;
   private int J;
   private boolean K;
   private int L;
   private int M;
   private int N;
   private boolean O;
   @Nullable
   private yf P;
   private yi.b Q;
   private final xx R = new xx(20);
   private int S;
   private final yb T = yb.a();
   private final bbo U;
   private boolean V;

   public avf(MinecraftServer $$0, wd $$1, auc $$2, aur $$3) {
      super($$0, $$1, $$3);
      this.g = new ava($$1.e());
      this.f = $$2;
      $$2.g = this;
      $$2.W().a();
      this.Q = yi.b.unsigned($$2.cK(), $$0::aA);
      this.U = new bbo($$0);
   }

   @Override
   public void d() {
      if (this.p > -1) {
         this.b(new acu(this.p));
         this.p = -1;
      }

      this.l();
      this.f.X = this.f.dC();
      this.f.Y = this.f.dE();
      this.f.Z = this.f.dI();
      this.f.h();
      this.f.a(this.s, this.t, this.u, this.f.dP(), this.f.dR());
      this.o++;
      this.N = this.M;
      if (this.I && !this.f.fY() && !this.f.cc() && !this.f.eM()) {
         if (++this.J > this.a((bzm)this.f)) {
            h.warn("{} was kicked for floating too long!", this.f.aj().getString());
            this.a(xo.c("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.I = false;
         this.J = 0;
      }

      this.y = this.f.dh();
      if (this.y != this.f && this.y.cY() == this.f) {
         this.z = this.y.dC();
         this.A = this.y.dE();
         this.B = this.y.dI();
         this.C = this.y.dC();
         this.D = this.y.dE();
         this.E = this.y.dI();
         if (this.K && this.y.cY() == this.f) {
            if (++this.L > this.a(this.y)) {
               h.warn("{} was kicked for floating a vehicle too long!", this.f.aj().getString());
               this.a(xo.c("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.K = false;
            this.L = 0;
         }
      } else {
         this.y = null;
         this.K = false;
         this.L = 0;
      }

      this.e();
      this.q.b();
      this.r.b();
      if (this.f.N() > 0L && this.d.ap() > 0 && ag.c() - this.f.N() > this.d.ap() * 1000L * 60L) {
         this.a(xo.c("multiplayer.disconnect.idling"));
      }
   }

   private int a(bzm $$0) {
      double $$1 = $$0.bh();
      if ($$1 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double $$2 = 0.08 / $$1;
         return bcb.c(80.0 * Math.max($$2, 1.0));
      }
   }

   @Override
   public void l() {
      this.s = this.f.dC();
      this.t = this.f.dE();
      this.u = this.f.dI();
      this.v = this.f.dC();
      this.w = this.f.dE();
      this.x = this.f.dI();
   }

   @Override
   public boolean c() {
      return this.e.i() && !this.V;
   }

   @Override
   public boolean a(zw<?> $$0) {
      return super.a($$0) ? true : this.V && this.e.i() && $$0 instanceof aib;
   }

   @Override
   protected GameProfile i() {
      return this.f.gr();
   }

   private <T, R> CompletableFuture<R> a(T $$0, BiFunction<avl, T, CompletableFuture<R>> $$1) {
      return $$1.apply(this.f.W(), $$0).thenApply($$0x -> {
         if (!this.c()) {
            h.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)$$0x;
         }
      });
   }

   private CompletableFuture<auu> a(String $$0) {
      return this.a($$0, avl::a);
   }

   private CompletableFuture<List<auu>> a(List<String> $$0) {
      return this.a($$0, avl::a);
   }

   @Override
   public void a(aiv $$0) {
      zz.a($$0, this, this.f.y());
      this.f.a($$0.b());
      if (this.f.gT()) {
         this.f.H();
         this.f.h($$0.b().f());
      }
   }

   private static boolean b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      return Double.isNaN($$0) || Double.isNaN($$1) || Double.isNaN($$2) || !Floats.isFinite($$4) || !Floats.isFinite($$3);
   }

   private static double a(double $$0) {
      return bcb.a($$0, -3.0E7, 3.0E7);
   }

   private static double b(double $$0) {
      return bcb.a($$0, -2.0E7, 2.0E7);
   }

   @Override
   public void a(ain $$0) {
      zz.a($$0, this, this.f.y());
      if (b($$0.b().a(), $$0.b().b(), $$0.b().c(), $$0.e(), $$0.f())) {
         this.a(xo.c("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.p() && this.f.gT()) {
         bzm $$1 = this.f.dh();
         if ($$1 != this.f && $$1.cY() == this.f && $$1 == this.y) {
            aub $$2 = this.f.y();
            double $$3 = $$1.dC();
            double $$4 = $$1.dE();
            double $$5 = $$1.dI();
            double $$6 = a($$0.b().a());
            double $$7 = b($$0.b().b());
            double $$8 = a($$0.b().c());
            float $$9 = bcb.h($$0.e());
            float $$10 = bcb.h($$0.f());
            double $$11 = $$6 - this.z;
            double $$12 = $$7 - this.A;
            double $$13 = $$8 - this.B;
            double $$14 = $$1.dA().h();
            double $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            if ($$15 - $$14 > 100.0 && !this.h()) {
               h.warn("{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{$$1.aj().getString(), this.f.aj().getString(), $$11, $$12, $$13});
               this.b(aem.a($$1));
               return;
            }

            fin $$16 = $$1.cV();
            $$11 = $$6 - this.C;
            $$12 = $$7 - this.D;
            $$13 = $$8 - this.E;
            boolean $$17 = $$1.ae;
            if ($$1 instanceof cam $$18 && $$18.eV()) {
               $$18.j();
            }

            $$1.a(caq.b, new fis($$11, $$12, $$13));
            $$11 = $$6 - $$1.dC();
            $$12 = $$7 - $$1.dE();
            if ($$12 > -0.5 || $$12 < 0.5) {
               $$12 = 0.0;
            }

            $$13 = $$8 - $$1.dI();
            $$15 = $$11 * $$11 + $$12 * $$12 + $$13 * $$13;
            boolean $$20 = false;
            if ($$15 > 0.0625) {
               $$20 = true;
               h.warn("{} (vehicle of {}) moved wrongly! {}", new Object[]{$$1.aj().getString(), this.f.aj().getString(), Math.sqrt($$15)});
            }

            if ($$20 && $$2.a($$1, $$16) || this.a($$2, $$1, $$16, $$6, $$7, $$8)) {
               $$1.a($$3, $$4, $$5, $$9, $$10);
               this.b(aem.a($$1));
               $$1.aM();
               return;
            }

            $$1.a($$6, $$7, $$8, $$9, $$10);
            this.f.y().n().a(this.f);
            fis $$21 = new fis($$1.dC() - $$3, $$1.dE() - $$4, $$1.dI() - $$5);
            this.a($$21);
            $$1.a($$0.g(), $$21);
            $$1.a($$21.d, $$21.e, $$21.f, $$0.g());
            this.f.a($$21.d, $$21.e, $$21.f);
            this.K = $$12 >= -0.03125 && !$$17 && !this.d.ad() && !$$1.dZ() && !$$1.bf() && this.b($$1);
            this.C = $$1.dC();
            this.D = $$1.dE();
            this.E = $$1.dI();
         }
      }
   }

   private boolean b(bzm $$0) {
      return $$0.ai().a($$0.cV().g(0.0625).b(0.0, -0.55, 0.0)).allMatch(eea.a::l);
   }

   @Override
   public void a(aho $$0) {
      zz.a($$0, this, this.f.y());
      if ($$0.b() == this.G) {
         if (this.F == null) {
            this.a(xo.c("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.f.a(this.F.d, this.F.e, this.F.f, this.f.dP(), this.f.dR());
         this.v = this.F.d;
         this.w = this.F.e;
         this.x = this.F.f;
         this.f.R();
         this.F = null;
      }
   }

   @Override
   public void a(aiw $$0) {
      zz.a($$0, this, this.f.y());
      this.f.w(true);
   }

   @Override
   public void a(aiy $$0) {
      zz.a($$0, this, this.f.y());
      dht.d $$1 = this.d.aI().a($$0.b());
      if ($$1 != null) {
         this.f.J().d($$1.b().a());
      }
   }

   @Override
   public void a(ajb $$0) {
      zz.a($$0, this, this.f.y());
      this.f.cn.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aix $$0) {
      zz.a($$0, this, this.f.y());
      this.f.J().a($$0.b(), $$0.e(), $$0.f());
   }

   @Override
   public void a(aja $$0) {
      zz.a($$0, this, this.f.y());
      if ($$0.e() == aja.a.a) {
         ame $$1 = Objects.requireNonNull($$0.f());
         aj $$2 = this.d.aD().a($$1);
         if ($$2 != null) {
            this.f.S().a($$2);
         }
      }
   }

   @Override
   public void a(aia $$0) {
      zz.a($$0, this, this.f.y());
      StringReader $$1 = new StringReader($$0.e());
      if ($$1.canRead() && $$1.peek() == '/') {
         $$1.skip();
      }

      ParseResults<ek> $$2 = this.d.aG().a().parse($$1, this.f.A());
      this.d.aG().a().getCompletionSuggestions($$2).thenAccept($$1x -> {
         Suggestions $$2x = $$1x.getList().size() <= 1000 ? $$1x : new Suggestions($$1x.getRange(), $$1x.getList().subList(0, 1000));
         this.b(new adh($$0.b(), $$2x));
      });
   }

   @Override
   public void a(ajf $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xo.c("advMode.notEnabled"));
      } else if (!this.f.gQ()) {
         this.f.a(xo.c("advMode.notAllowed"));
      } else {
         dlt $$1 = null;
         ebk $$2 = null;
         jb $$3 = $$0.b();
         eaz $$4 = this.f.y().c_($$3);
         if ($$4 instanceof ebk) {
            $$2 = (ebk)$$4;
            $$1 = $$2.a();
         }

         String $$5 = $$0.e();
         boolean $$6 = $$0.f();
         if ($$1 != null) {
            ebk.a $$7 = $$2.u();
            eeb $$8 = this.f.y().a_($$3);
            jh $$9 = $$8.c(drj.b);

            eeb $$10 = switch ($$0.i()) {
               case a -> dqb.ln.m();
               case b -> dqb.lm.m();
               default -> dqb.gm.m();
            };
            eeb $$11 = $$10.b(drj.b, $$9).b(drj.c, $$0.g());
            if ($$11 != $$8) {
               this.f.y().a($$3, $$11, 2);
               $$4.c($$11);
               this.f.y().m($$3).a($$4);
            }

            $$1.a($$5);
            $$1.a($$6);
            if (!$$6) {
               $$1.c(null);
            }

            $$2.b($$0.h());
            if ($$7 != $$0.i()) {
               $$2.f();
            }

            $$1.f();
            if (!bdb.b($$5)) {
               this.f.a(xo.a("advMode.setCommand.success", $$5));
            }
         }
      }
   }

   @Override
   public void a(ajg $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.d.q()) {
         this.f.a(xo.c("advMode.notEnabled"));
      } else if (!this.f.gQ()) {
         this.f.a(xo.c("advMode.notAllowed"));
      } else {
         dlt $$1 = $$0.a(this.f.y());
         if ($$1 != null) {
            $$1.a($$0.b());
            $$1.a($$0.e());
            if (!$$0.e()) {
               $$1.c(null);
            }

            $$1.f();
            this.f.a(xo.a("advMode.setCommand.success", $$0.b()));
         }
      }
   }

   @Override
   public void a(aip $$0) {
      aub $$1 = this.f.y();
      zz.a($$0, this, $$1);
      jb $$2 = $$0.b();
      if (this.f.a($$2, 1.0)) {
         if ($$1.p($$2)) {
            eeb $$3 = $$1.a_($$2);
            boolean $$4 = this.f.gc() && $$0.e();
            dcv $$5 = $$3.a((dmx)$$1, $$2, $$4);
            if (!$$5.f()) {
               if ($$4) {
                  a($$3, $$1, $$2, $$5);
               }

               this.a($$5);
            }
         }
      }
   }

   private static void a(eeb $$0, aub $$1, jb $$2, dcv $$3) {
      eaz $$4 = $$0.x() ? $$1.c_($$2) : null;
      if ($$4 != null) {
         try (bci.j $$5 = new bci.j($$4.t(), h)) {
            fcz $$6 = fcz.a($$5, $$1.K_());
            $$4.f($$6);
            $$4.b($$6);
            dbd.a($$3, $$4.q(), $$6);
            $$3.b($$4.r());
         }
      }
   }

   @Override
   public void a(aiq $$0) {
      aub $$1 = this.f.y();
      zz.a($$0, this, $$1);
      bzm $$2 = $$1.b($$0.b());
      if ($$2 != null && this.f.b($$2, 3.0)) {
         dcv $$3 = $$2.dM();
         if ($$3 != null && !$$3.f()) {
            this.a($$3);
         }
      }
   }

   private void a(dcv $$0) {
      if ($$0.a(this.f.y().L())) {
         cus $$1 = this.f.gs();
         int $$2 = $$1.d($$0);
         if ($$2 != -1) {
            if (cus.e($$2)) {
               $$1.c($$2);
            } else {
               $$1.d($$2);
            }
         } else if (this.f.gc()) {
            $$1.c($$0);
         }

         this.b(new agf($$1.f()));
         this.f.cm.d();
      }
   }

   @Override
   public void a(aiz $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.cn instanceof cyp $$1) {
         if (!$$1.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$1);
            return;
         }

         $$1.a($$0.b());
      }
   }

   @Override
   public void a(ajd $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.cn instanceof cyr $$1) {
         if (!this.f.cn.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cn);
            return;
         }

         $$1.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(ajj $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gQ()) {
         jb $$1 = $$0.b();
         eeb $$2 = this.f.y().a_($$1);
         if (this.f.y().c_($$1) instanceof ecs $$4) {
            $$4.a($$0.f());
            $$4.a($$0.g());
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.j());
            $$4.a($$0.k());
            $$4.b($$0.l());
            $$4.a($$0.m());
            $$4.b($$0.n());
            $$4.e($$0.o());
            $$4.f($$0.p());
            $$4.a($$0.q());
            $$4.a($$0.r());
            if ($$4.f()) {
               String $$5 = $$4.d();
               if ($$0.e() == ecs.a.b) {
                  if ($$4.D()) {
                     this.f.a(xo.a("structure_block.save_success", $$5), false);
                  } else {
                     this.f.a(xo.a("structure_block.save_failure", $$5), false);
                  }
               } else if ($$0.e() == ecs.a.c) {
                  if (!$$4.F()) {
                     this.f.a(xo.a("structure_block.load_not_found", $$5), false);
                  } else if ($$4.a(this.f.y())) {
                     this.f.a(xo.a("structure_block.load_success", $$5), false);
                  } else {
                     this.f.a(xo.a("structure_block.load_prepare", $$5), false);
                  }
               } else if ($$0.e() == ecs.a.d) {
                  if ($$4.C()) {
                     this.f.a(xo.a("structure_block.size_success", $$5), false);
                  } else {
                     this.f.a(xo.c("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.f.a(xo.a("structure_block.invalid_structure_name", $$0.g()), false);
            }

            $$4.e();
            this.f.y().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(ajk $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gQ()) {
         jb $$1 = $$0.b();
         eeb $$2 = this.f.y().a_($$1);
         if (this.f.y().c_($$1) instanceof ect $$4) {
            $$4.a($$0.e());
            $$4.a($$0.f());
            $$4.e();
            this.f.y().a($$1, $$2, $$4.m(), 3);
         }
      }
   }

   @Override
   public void a(ajo $$0) {
      zz.a($$0, this, this.f.y());
      jb $$1 = $$0.b();
      if (this.f.gQ() && this.f.y().c_($$1) instanceof ecu $$2) {
         if ($$0.e() != ajo.a.b && $$0.e() != ajo.a.a) {
            $$2.a($$0.f());
            if ($$0.e() == ajo.a.d) {
               $$2.a(this.f::a);
            } else if ($$0.e() == ajo.a.e) {
               $$2.b(this.f::a);
            } else if ($$0.e() == ajo.a.f) {
               $$2.c(this.f::a);
            } else if ($$0.e() == ajo.a.g) {
               $$2.d(this.f::a);
            }

            eeb $$10 = this.f.y().a_($$1);
            this.f.y().a($$1, dqb.a.m(), $$10, 3);
         } else {
            jy<ta> $$4 = this.f.eb().f(mn.bm);
            Optional<jl.c<ta>> $$5 = $$0.f().a().flatMap($$4::a);
            xo $$6;
            if ($$5.isPresent()) {
               $$6 = $$5.get().a().c();
            } else {
               $$6 = xo.c("test_instance.description.no_test").a(o.m);
            }

            Optional<kg> $$8;
            if ($$0.e() == ajo.a.b) {
               $$8 = $$0.f().a().flatMap($$0x -> ecu.a(this.f.y(), $$0x));
            } else {
               $$8 = Optional.empty();
            }

            this.e.a(new agz($$6, $$8));
         }
      }
   }

   @Override
   public void a(aji $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gQ()) {
         jb $$1 = $$0.b();
         eeb $$2 = this.f.y().a_($$1);
         if (this.f.y().c_($$1) instanceof ecd $$4) {
            $$4.a($$0.e());
            $$4.b($$0.f());
            $$4.a(amd.a(mn.bk, $$0.g()));
            $$4.a($$0.h());
            $$4.a($$0.i());
            $$4.a($$0.k());
            $$4.b($$0.j());
            $$4.e();
            this.f.y().a($$1, $$2, $$2, 3);
         }
      }
   }

   @Override
   public void a(aik $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gQ()) {
         jb $$1 = $$0.b();
         if (this.f.y().c_($$1) instanceof ecd $$3) {
            $$3.a(this.f.y(), $$0.e(), $$0.f());
         }
      }
   }

   @Override
   public void a(ajc $$0) {
      zz.a($$0, this, this.f.y());
      int $$1 = $$0.b();
      if (this.f.cn instanceof czx $$2) {
         if (!$$2.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, $$2);
            return;
         }

         $$2.e($$1);
         $$2.h($$1);
      }
   }

   @Override
   public void a(aih $$0) {
      int $$1 = $$0.b();
      if (cus.e($$1) || $$1 == 40) {
         List<String> $$2 = Lists.newArrayList();
         Optional<String> $$3 = $$0.f();
         $$3.ifPresent($$2::add);
         $$2.addAll($$0.e());
         Consumer<List<auu>> $$4 = $$3.isPresent() ? $$1x -> this.a((auu)$$1x.get(0), $$1x.subList(1, $$1x.size()), $$1) : $$1x -> this.a($$1x, $$1);
         this.a($$2).thenAcceptAsync($$4, this.d);
      }
   }

   private void a(List<auu> $$0, int $$1) {
      dcv $$2 = this.f.gs().a($$1);
      if ($$2.c(kq.U)) {
         List<aut<String>> $$3 = $$0.stream().map(this::a).toList();
         $$2.b(kq.U, new dge($$3));
      }
   }

   private void a(auu $$0, List<auu> $$1, int $$2) {
      dcv $$3 = this.f.gs().a($$2);
      if ($$3.c(kq.U)) {
         dcv $$4 = $$3.a((dmt)dcz.vB);
         $$4.e(kq.U);
         List<aut<xo>> $$5 = $$1.stream().map($$0x -> this.a($$0x).a(xo::b)).toList();
         $$4.b(kq.V, new dgf(this.a($$0), this.f.aj().getString(), 0, $$5, true));
         this.f.gs().a($$2, $$4);
      }
   }

   private aut<String> a(auu $$0) {
      return this.f.X() ? aut.a($$0.b()) : aut.a($$0);
   }

   @Override
   public void a(aii $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         bzm $$1 = this.f.y().a($$0.e());
         if ($$1 != null) {
            try (bci.j $$2 = new bci.j($$1.ef(), h)) {
               fcz $$3 = fcz.a($$2, $$1.eb());
               $$1.d($$3);
               ui $$4 = $$3.b();
               this.b(new agw($$0.b(), $$4));
            }
         }
      }
   }

   @Override
   public void a(aif $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.f.am() && $$0.e() == this.f.cn.l) {
         if (this.f.cn instanceof czc $$1 && $$1.m() instanceof ebo $$2) {
            $$2.a($$0.b(), $$0.f());
         }
      }
   }

   @Override
   public void a(ahp $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.s(2)) {
         eaz $$1 = this.f.y().c_($$0.e());
         ui $$2 = $$1 != null ? $$1.c(this.f.eb()) : null;
         this.b(new agw($$0.b(), $$2));
      }
   }

   @Override
   public void a(aim $$0) {
      zz.a($$0, this, this.f.y());
      if (b($$0.a(0.0), $$0.b(0.0), $$0.c(0.0), $$0.a(0.0F), $$0.b(0.0F))) {
         this.a(xo.c("multiplayer.disconnect.invalid_player_movement"));
      } else {
         aub $$1 = this.f.y();
         if (!this.f.k) {
            if (this.o == 0) {
               this.l();
            }

            if (this.f.gT()) {
               float $$2 = bcb.h($$0.a(this.f.dP()));
               float $$3 = bcb.h($$0.b(this.f.dR()));
               if (this.p()) {
                  this.f.c($$2, $$3);
               } else {
                  double $$4 = a($$0.a(this.f.dC()));
                  double $$5 = b($$0.b(this.f.dE()));
                  double $$6 = a($$0.c(this.f.dI()));
                  if (this.f.cc()) {
                     this.f.a(this.f.dC(), this.f.dE(), this.f.dI(), $$2, $$3);
                     this.f.y().n().a(this.f);
                  } else {
                     double $$7 = this.f.dC();
                     double $$8 = this.f.dE();
                     double $$9 = this.f.dI();
                     double $$10 = $$4 - this.s;
                     double $$11 = $$5 - this.t;
                     double $$12 = $$6 - this.u;
                     double $$13 = this.f.dA().h();
                     double $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                     if (this.f.fY()) {
                        if ($$14 > 1.0) {
                           this.a(this.f.dC(), this.f.dE(), this.f.dI(), $$2, $$3);
                        }
                     } else {
                        boolean $$15 = this.f.fQ();
                        if ($$1.v().i()) {
                           this.M++;
                           int $$16 = this.M - this.N;
                           if ($$16 > 5) {
                              h.debug("{} is sending move packets too frequently ({} packets since last tick)", this.f.aj().getString(), $$16);
                              $$16 = 1;
                           }

                           if (this.a($$15)) {
                              float $$17 = $$15 ? 300.0F : 100.0F;
                              if ($$14 - $$13 > $$17 * $$16) {
                                 h.warn("{} moved too quickly! {},{},{}", new Object[]{this.f.aj().getString(), $$10, $$11, $$12});
                                 this.a(this.f.dC(), this.f.dE(), this.f.dI(), this.f.dP(), this.f.dR());
                                 return;
                              }
                           }
                        }

                        fin $$18 = this.f.cV();
                        $$10 = $$4 - this.v;
                        $$11 = $$5 - this.w;
                        $$12 = $$6 - this.x;
                        boolean $$19 = $$11 > 0.0;
                        if (this.f.aK() && !$$0.b() && $$19) {
                           this.f.s();
                        }

                        boolean $$20 = this.f.ae;
                        this.f.a(caq.b, new fis($$10, $$11, $$12));
                        $$10 = $$4 - this.f.dC();
                        $$11 = $$5 - this.f.dE();
                        if ($$11 > -0.5 || $$11 < 0.5) {
                           $$11 = 0.0;
                        }

                        $$12 = $$6 - this.f.dI();
                        $$14 = $$10 * $$10 + $$11 * $$11 + $$12 * $$12;
                        boolean $$22 = false;
                        if (!this.f.Q() && $$14 > 0.0625 && !this.f.fY() && !this.f.gI() && !this.f.am()) {
                           $$22 = true;
                           h.warn("{} moved wrongly!", this.f.aj().getString());
                        }

                        if (this.f.aq || this.f.fY() || (!$$22 || !$$1.a(this.f, $$18)) && !this.a($$1, this.f, $$18, $$4, $$5, $$6)) {
                           this.f.a($$4, $$5, $$6, $$2, $$3);
                           boolean $$23 = this.f.fC();
                           this.I = $$11 >= -0.03125
                              && !$$20
                              && !this.f.am()
                              && !this.d.ad()
                              && !this.f.gt().c
                              && !this.f.d(bys.y)
                              && !$$15
                              && !$$23
                              && this.b(this.f);
                           this.f.y().n().a(this.f);
                           fis $$24 = new fis(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9);
                           this.f.a($$0.b(), $$0.e(), $$24);
                           this.f.a($$24.d, $$24.e, $$24.f, $$0.b());
                           this.a($$24);
                           if ($$19) {
                              this.f.j();
                           }

                           if ($$0.b() || this.f.el() || this.f.eV() || this.f.am() || $$15 || $$23) {
                              this.f.gY();
                           }

                           this.f.a(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9);
                           this.v = this.f.dC();
                           this.w = this.f.dE();
                           this.x = this.f.dI();
                        } else {
                           this.a($$7, $$8, $$9, $$2, $$3);
                           this.f.a(this.f.dC() - $$7, this.f.dE() - $$8, this.f.dI() - $$9, $$0.b());
                           this.f.aM();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(boolean $$0) {
      if (this.h()) {
         return false;
      } else if (this.f.Q()) {
         return false;
      } else {
         dmq $$1 = this.f.y().P();
         return $$1.c(dmq.u) ? false : !$$0 || !$$1.c(dmq.v);
      }
   }

   private boolean p() {
      if (this.F != null) {
         if (this.o - this.H > 20) {
            this.H = this.o;
            this.a(this.F.d, this.F.e, this.F.f, this.f.dP(), this.f.dR());
         }

         return true;
      } else {
         this.H = this.o;
         return false;
      }
   }

   private boolean a(dmx $$0, bzm $$1, fin $$2, double $$3, double $$4, double $$5) {
      fin $$6 = $$1.cV().d($$3 - $$1.dC(), $$4 - $$1.dE(), $$5 - $$1.dI());
      Iterable<fjm> $$7 = $$0.a($$1, $$6.h(1.0E-5F), $$2.g());
      fjm $$8 = fjj.a($$2.h(1.0E-5F));

      for (fjm $$9 : $$7) {
         if (!fjj.c($$9, $$8, fiw.i)) {
            return true;
         }
      }

      return false;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a(new caz(new fis($$0, $$1, $$2), fis.c, $$3, $$4), Collections.emptySet());
   }

   public void a(caz $$0, Set<cba> $$1) {
      this.H = this.o;
      if (++this.G == Integer.MAX_VALUE) {
         this.G = 0;
      }

      this.f.a($$0, $$1);
      this.F = this.f.dv();
      this.b(aez.a(this.G, $$0, $$1));
   }

   @Override
   public void a(ait $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gT()) {
         jb $$1 = $$0.b();
         this.f.H();
         ait.a $$2 = $$0.f();
         switch ($$2) {
            case g:
               if (!this.f.am()) {
                  dcv $$3 = this.f.b(bxi.b);
                  this.f.a(bxi.b, this.f.b(bxi.a));
                  this.f.a(bxi.a, $$3);
                  this.f.fM();
               }

               return;
            case e:
               if (!this.f.am()) {
                  this.f.a(false);
               }

               return;
            case d:
               if (!this.f.am()) {
                  this.f.a(true);
               }

               return;
            case f:
               this.f.fL();
               return;
            case a:
            case b:
            case c:
               this.f.h.a($$1, $$2, $$0.e(), this.f.y().ao(), $$0.g());
               this.a($$0.g());
               return;
            default:
               throw new IllegalArgumentException("Invalid player action");
         }
      }
   }

   private static boolean a(auc $$0, dcv $$1) {
      if ($$1.f()) {
         return false;
      } else {
         dcr $$2 = $$1.h();
         return ($$2 instanceof dbd || $$2 instanceof dbj) && !$$0.gP().a($$1);
      }
   }

   @Override
   public void a(ajp $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gT()) {
         this.a($$0.f());
         aub $$1 = this.f.y();
         bxi $$2 = $$0.b();
         dcv $$3 = this.f.b($$2);
         if ($$3.a($$1.L())) {
            fio $$4 = $$0.e();
            fis $$5 = $$4.g();
            jb $$6 = $$4.b();
            if (this.f.a($$6, 1.0)) {
               fis $$7 = $$5.d(fis.b($$6));
               double $$8 = 1.0000001;
               if (Math.abs($$7.a()) < 1.0000001 && Math.abs($$7.b()) < 1.0000001 && Math.abs($$7.c()) < 1.0000001) {
                  jh $$9 = $$4.c();
                  this.f.H();
                  int $$10 = this.f.y().ao();
                  if ($$6.v() <= $$10) {
                     if (this.F == null && $$1.a(this.f, $$6)) {
                        bxj $$11 = this.f.h.a(this.f, $$1, $$3, $$2, $$4);
                        if ($$11.a()) {
                           aq.P.a(this.f, $$4.b(), $$3.v());
                        }

                        if ($$9 == jh.b && !$$11.a() && $$6.v() >= $$10 && a(this.f, $$3)) {
                           xo $$12 = xo.a("build.tooHigh", $$10).a(o.m);
                           this.f.b($$12, true);
                        } else if ($$11 instanceof bxj.d $$13 && $$13.e() == bxj.e.c) {
                           this.f.a($$2, true);
                        }
                     }
                  } else {
                     xo $$14 = xo.a("build.tooHigh", $$10).a(o.m);
                     this.f.b($$14, true);
                  }

                  this.b(new acy($$1, $$6));
                  this.b(new acy($$1, $$6.a($$9)));
               } else {
                  h.warn("Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.", new Object[]{this.f.gr().getName(), $$5, $$6});
               }
            }
         }
      }
   }

   @Override
   public void a(ajq $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gT()) {
         this.a($$0.e());
         aub $$1 = this.f.y();
         bxi $$2 = $$0.b();
         dcv $$3 = this.f.b($$2);
         this.f.H();
         if (!$$3.f() && $$3.a($$1.L())) {
            float $$4 = bcb.h($$0.f());
            float $$5 = bcb.h($$0.g());
            if ($$5 != this.f.dR() || $$4 != this.f.dP()) {
               this.f.c($$4, $$5);
            }

            if (this.f.h.a(this.f, $$1, $$3, $$2) instanceof bxj.d $$7 && $$7.e() == bxj.e.c) {
               this.f.a($$2, true);
            }
         }
      }
   }

   @Override
   public void a(ajn $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.am()) {
         for (aub $$1 : this.d.L()) {
            bzm $$2 = $$0.a($$1);
            if ($$2 != null) {
               this.f.a($$1, $$2.dC(), $$2.dE(), $$2.dI(), Set.of(), $$2.dP(), $$2.dR(), true);
               return;
            }
         }
      }
   }

   @Override
   public void a(aio $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.dn() instanceof cxe $$2) {
         $$2.a($$0.b(), $$0.e());
      }
   }

   @Override
   public void a(wf $$0) {
      h.info("{} lost connection: {}", this.f.aj().getString(), $$0.a().getString());
      this.q();
      super.a($$0);
   }

   private void q() {
      this.U.close();
      this.d.av();
      this.d.ag().a(xo.a("multiplayer.player.left", this.f.Q_()).a(o.o), false);
      this.f.t();
      this.d.ag().b(this.f);
      this.f.W().b();
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.p = Math.max($$0, this.p);
      }
   }

   @Override
   public void a(aje $$0) {
      zz.a($$0, this, this.f.y());
      if ($$0.b() >= 0 && $$0.b() < cus.h()) {
         if (this.f.gs().f() != $$0.b() && this.f.fH() == bxi.a) {
            this.f.fM();
         }

         this.f.gs().c($$0.b());
         this.f.H();
      } else {
         h.warn("{} tried to set an invalid carried item", this.f.aj().getString());
      }
   }

   @Override
   public void a(ahv $$0) {
      Optional<xv> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            ye $$2;
            try {
               $$2 = this.a($$0, $$1.get());
            } catch (yi.a var6) {
               this.a(var6);
               return;
            }

            CompletableFuture<auu> $$5 = this.a($$2.c());
            xo $$6 = this.d.bk().decorate(this.f, $$2.d());
            this.U.append($$5, $$2x -> {
               ye $$3 = $$2.a($$6).a($$2x.e());
               this.a($$3);
            });
         });
      }
   }

   @Override
   public void a(aht $$0) {
      this.a($$0.b(), () -> {
         this.b($$0.b());
         this.r();
      });
   }

   private void b(String $$0) {
      ParseResults<ek> $$1 = this.c($$0);
      if (this.d.aA() && yg.a($$1)) {
         h.error("Received unsigned command packet from {}, but the command requires signable arguments: {}", this.f.gr().getName(), $$0);
         this.f.a(m);
      } else {
         this.d.aG().a($$1, $$0);
      }
   }

   @Override
   public void a(ahu $$0) {
      Optional<xv> $$1 = this.a($$0.h());
      if (!$$1.isEmpty()) {
         this.a($$0.b(), () -> {
            this.a($$0, $$1.get());
            this.r();
         });
      }
   }

   private void a(ahu $$0, xv $$1) {
      ParseResults<ek> $$2 = this.c($$0.b());

      Map<String, ye> $$3;
      try {
         $$3 = this.a($$0, yg.b($$2), $$1);
      } catch (yi.a var6) {
         this.a(var6);
         return;
      }

      ei $$6 = new ei.a($$3);
      $$2 = el.a($$2, $$1x -> $$1x.a($$6, this.U));
      this.d.aG().a($$2, $$0.b());
   }

   private void a(yi.a $$0) {
      h.warn("Failed to update secure chat state for {}: '{}'", this.f.gr().getName(), $$0.a().getString());
      this.f.a($$0.a().f().a(o.m));
   }

   private <S> Map<String, ye> a(ahu $$0, yg<S> $$1, xv $$2) throws yi.a {
      List<es.a> $$3 = $$0.g().a();
      List<yg.a<S>> $$4 = $$1.a();
      if ($$3.isEmpty()) {
         return this.b($$4);
      } else {
         Map<String, ye> $$5 = new Object2ObjectOpenHashMap();

         for (es.a $$6 : $$3) {
            yg.a<S> $$7 = $$1.a($$6.a());
            if ($$7 == null) {
               this.Q.setChainBroken();
               throw a($$0.b(), $$3, $$4);
            }

            yh $$8 = new yh($$7.c(), $$0.e(), $$0.f(), $$2);
            $$5.put($$7.a(), this.Q.unpack($$6.b(), $$8));
         }

         for (yg.a<S> $$9 : $$4) {
            if (!$$5.containsKey($$9.a())) {
               throw a($$0.b(), $$3, $$4);
            }
         }

         return $$5;
      }
   }

   private <S> Map<String, ye> b(List<yg.a<S>> $$0) throws yi.a {
      Map<String, ye> $$1 = new HashMap<>();

      for (yg.a<S> $$2 : $$0) {
         yh $$3 = yh.a($$2.c());
         $$1.put($$2.a(), this.Q.unpack(null, $$3));
      }

      return $$1;
   }

   private static <S> yi.a a(String $$0, List<es.a> $$1, List<yg.a<S>> $$2) {
      String $$3 = $$1.stream().map(es.a::a).collect(Collectors.joining(", "));
      String $$4 = $$2.stream().map(yg.a::a).collect(Collectors.joining(", "));
      h.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{$$0, $$3, $$4});
      return new yi.a(m);
   }

   private ParseResults<ek> c(String $$0) {
      CommandDispatcher<ek> $$1 = this.d.aG().a();
      return $$1.parse($$0, this.f.A());
   }

   private void a(String $$0, Runnable $$1) {
      if (d($$0)) {
         this.a(xo.c("multiplayer.disconnect.illegal_characters"));
      } else if (this.f.E() == cuq.c) {
         this.b(new agu(xo.c("chat.disabled.options").a(o.m), false));
      } else {
         this.f.H();
         this.d.execute($$1);
      }
   }

   private Optional<xv> a(xv.b $$0) {
      synchronized (this.R) {
         Optional var10000;
         try {
            xv $$1 = this.R.a($$0);
            var10000 = Optional.of($$1);
         } catch (xx.a var5) {
            h.error("Failed to validate message acknowledgements from {}: {}", this.f.aj().getString(), var5.getMessage());
            this.a(l);
            return Optional.empty();
         }

         return var10000;
      }
   }

   private static boolean d(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         if (!bdb.a($$0.charAt($$1))) {
            return true;
         }
      }

      return false;
   }

   private ye a(ahv $$0, xv $$1) throws yi.a {
      yh $$2 = new yh($$0.b(), $$0.e(), $$0.f(), $$1);
      return this.Q.unpack($$0.g(), $$2);
   }

   private void a(ye $$0) {
      this.d.ag().a($$0, this.f, xk.a(xk.e, this.f));
      this.r();
   }

   private void r() {
      this.q.a();
      if (!this.q.c() && !this.d.ag().f(this.f.gr()) && !this.d.a(this.f.gr())) {
         this.a(xo.c("disconnect.spam"));
      }
   }

   @Override
   public void a(ahs $$0) {
      synchronized (this.R) {
         try {
            this.R.a($$0.b());
         } catch (xx.a var5) {
            h.error("Failed to validate message acknowledgement offset from {}: {}", this.f.aj().getString(), var5.getMessage());
            this.a(l);
         }
      }
   }

   @Override
   public void a(ajm $$0) {
      zz.a($$0, this, this.f.y());
      this.f.H();
      this.f.a($$0.b());
   }

   @Override
   public void a(aiu $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gT()) {
         this.f.H();
         switch ($$0.e()) {
            case b:
               this.f.i(true);
               break;
            case c:
               this.f.i(false);
               break;
            case a:
               if (this.f.fY()) {
                  this.f.a(false, true);
                  this.F = this.f.dv();
               }
               break;
            case d:
               if (this.f.dn() instanceof caw $$1) {
                  int $$2 = $$0.f();
                  if ($$1.a() && $$2 > 0) {
                     $$1.c($$2);
                  }
               }
               break;
            case e:
               if (this.f.dn() instanceof caw $$3) {
                  $$3.b();
               }
               break;
            case f:
               if (this.f.dm() instanceof cac $$4) {
                  $$4.b(this.f);
               }
               break;
            case g:
               if (!this.f.gz()) {
                  this.f.fs();
               }
               break;
            default:
               throw new IllegalArgumentException("Invalid client command!");
         }
      }
   }

   public void a(ye $$0, xk.a $$1) {
      this.b(new aes(this.S++, $$0.k().c(), $$0.k().b(), $$0.l(), $$0.m().a(this.T), $$0.n(), $$0.o(), $$1));
      ya $$2 = $$0.l();
      if ($$2 != null) {
         this.T.a($$0.m(), $$0.l());
         int $$3;
         synchronized (this.R) {
            this.R.a($$2);
            $$3 = this.R.a();
         }

         if ($$3 > 4096) {
            this.a(xo.c("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public void a(xo $$0, xk.a $$1) {
      this.b(new ads($$0, $$1));
   }

   public SocketAddress m() {
      return this.e.d();
   }

   public void n() {
      this.V = true;
      this.q();
      this.b(ags.a);
      this.e.a(acf.d);
   }

   @Override
   public void a(akx $$0) {
      this.e.a(new aku($$0.b()));
   }

   @Override
   public void a(aij $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gT()) {
         final aub $$1 = this.f.y();
         final bzm $$2 = $$0.a($$1);
         this.f.H();
         this.f.h($$0.b());
         if ($$2 != null) {
            if (!$$1.F_().a($$2.dx())) {
               return;
            }

            fin $$3 = $$2.cV();
            if (this.f.a($$3, 3.0)) {
               $$0.a(new aij.c() {
                  private void a(bxi $$0, avf.a $$1x) {
                     dcv $$2x = avf.this.f.b($$0);
                     if ($$2x.a($$1.L())) {
                        dcv $$3x = $$2x.v();
                        if ($$1.run(avf.this.f, $$2, $$0) instanceof bxj.d $$5) {
                           dcv $$6 = $$5.c() ? $$3x : dcv.l;
                           aq.T.a(avf.this.f, $$6, $$2);
                           if ($$5.e() == bxj.e.c) {
                              avf.this.f.a($$0, true);
                           }
                        }
                     }
                  }

                  @Override
                  public void a(bxi $$0) {
                     this.a($$0, cut::a);
                  }

                  @Override
                  public void a(bxi $$0, fis $$1x) {
                     this.a($$0, ($$1xxx, $$2xx, $$3x) -> $$2xx.a($$1xxx, $$1, $$3x));
                  }

                  @Override
                  public void a() {
                     if (!($$2 instanceof cqz) && !($$2 instanceof caa) && $$2 != avf.this.f && !($$2 instanceof cvb $$0x && !$$0x.cF())) {
                        dcv $$1x = avf.this.f.b(bxi.a);
                        if ($$1x.a($$1.L())) {
                           avf.this.f.e($$2);
                        }
                     } else {
                        avf.this.a(xo.c("multiplayer.disconnect.invalid_entity_attacked"));
                        avf.h.warn("Player {} tried to attack an invalid entity", avf.this.f.aj().getString());
                     }
                  }
               });
            }
         }
      }
   }

   @Override
   public void a(ahy $$0) {
      zz.a($$0, this, this.f.y());
      this.f.H();
      ahy.a $$1 = $$0.b();
      switch ($$1) {
         case a:
            if (this.f.k) {
               this.f.k = false;
               this.f = this.d.ag().a(this.f, true, bzm.e.e);
               this.l();
               aq.w.a(this.f, dmu.k, dmu.i);
            } else {
               if (this.f.eL() > 0.0F) {
                  return;
               }

               this.f = this.d.ag().a(this.f, false, bzm.e.a);
               this.l();
               if (this.d.v_()) {
                  this.f.a(dmr.d);
                  this.f.y().P().b(dmq.s).a(false, this.d);
               }
            }
            break;
         case b:
            this.f.I().a(this.f);
      }
   }

   @Override
   public void a(aie $$0) {
      zz.a($$0, this, this.f.y());
      this.f.q();
   }

   @Override
   public void a(aid $$0) {
      zz.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cn.l == $$0.b()) {
         if (this.f.am()) {
            this.f.cn.b();
         } else if (!this.f.cn.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cn);
         } else {
            int $$1 = $$0.f();
            if (!this.f.cn.a($$1)) {
               h.debug("Player {} clicked invalid slot index: {}, available slots: {}", new Object[]{this.f.aj(), $$1, this.f.cn.k.size()});
            } else {
               boolean $$2 = $$0.e() != this.f.cn.j();
               this.f.cn.h();
               this.f.cn.a($$1, $$0.g(), $$0.h(), this.f);
               ObjectIterator var4 = Int2ObjectMaps.fastIterable($$0.i()).iterator();

               while (var4.hasNext()) {
                  Entry<wj> $$3 = (Entry<wj>)var4.next();
                  this.f.cn.a($$3.getIntKey(), (wj)$$3.getValue());
               }

               this.f.cn.a($$0.j());
               this.f.cn.i();
               if ($$2) {
                  this.f.cn.e();
               } else {
                  this.f.cn.d();
               }
            }
         }
      }
   }

   @Override
   public void a(air $$0) {
      zz.a($$0, this, this.f.y());
      this.f.H();
      if (!this.f.am() && this.f.cn.l == $$0.b()) {
         if (!this.f.cn.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cn);
         } else {
            dht.d $$1 = this.d.aI().a($$0.e());
            if ($$1 != null) {
               dhr<?> $$2 = $$1.b();
               if (this.f.J().b($$2.a())) {
                  if (this.f.cn instanceof dab $$3) {
                     if ($$2.b().ao_().c()) {
                        h.debug("Player {} tried to place impossible recipe {}", this.f, $$2.a().a());
                        return;
                     }

                     dab.a $$4 = $$3.a($$0.f(), this.f.gI(), $$2, this.f.y(), this.f.gs());
                     if ($$4 == dab.a.b) {
                        this.b(new aeq(this.f.cn.l, $$1.a().b()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(aic $$0) {
      zz.a($$0, this, this.f.y());
      this.f.H();
      if (this.f.cn.l == $$0.b() && !this.f.am()) {
         if (!this.f.cn.b(this.f)) {
            h.debug("Player {} interacted with invalid menu {}", this.f, this.f.cn);
         } else {
            boolean $$1 = this.f.cn.a(this.f, $$0.e());
            if ($$1) {
               this.f.cn.d();
            }
         }
      }
   }

   @Override
   public void a(ajh $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.gc()) {
         boolean $$1 = $$0.b() < 0;
         dcv $$2 = $$0.e();
         if (!$$2.a(this.f.y().L())) {
            return;
         }

         boolean $$3 = $$0.b() >= 1 && $$0.b() <= 45;
         boolean $$4 = $$2.f() || $$2.M() <= $$2.k();
         if ($$3 && $$4) {
            this.f.cm.b($$0.b()).e($$2);
            this.f.cm.a($$0.b(), $$2);
            this.f.cm.d();
         } else if ($$1 && $$4) {
            if (this.r.c()) {
               this.r.a();
               this.f.a($$2, true);
            } else {
               h.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.f.aj().getString());
            }
         }
      }
   }

   @Override
   public void a(ajl $$0) {
      List<String> $$1 = Stream.of($$0.f()).map(o::a).collect(Collectors.toList());
      this.a($$1).thenAcceptAsync($$1x -> this.a($$0, $$1x), this.d);
   }

   private void a(ajl $$0, List<auu> $$1) {
      this.f.H();
      aub $$2 = this.f.y();
      jb $$3 = $$0.b();
      if ($$2.D($$3)) {
         if (!($$2.c_($$3) instanceof ecn $$5)) {
            return;
         }

         $$5.a(this.f, $$0.e(), $$1);
      }
   }

   @Override
   public void a(ais $$0) {
      zz.a($$0, this, this.f.y());
      this.f.gt().b = $$0.b() && this.f.gt().c;
   }

   @Override
   public void a(aau $$0) {
      zz.a($$0, this, this.f.y());
      boolean $$1 = this.f.a(cuv.g);
      this.f.a($$0.b());
      if (this.f.a(cuv.g) != $$1) {
         this.d.ag().a(new aex(aex.a.h, this.f));
      }
   }

   @Override
   public void a(ahq $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.f.s(2) && !this.h()) {
         h.warn("Player {} tried to change difficulty to {} without required permissions", this.f.gr().getName(), $$0.b().b());
      } else {
         this.d.a($$0.b(), false);
      }
   }

   @Override
   public void a(ahr $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.f.s(2)) {
         h.warn("Player {} tried to change game mode to {} without required permissions", this.f.gr().getName(), $$0.b().e());
      } else {
         aoo.a(this.f, $$0.b());
      }
   }

   @Override
   public void a(ail $$0) {
      zz.a($$0, this, this.f.y());
      if (this.f.s(2) || this.h()) {
         this.d.b($$0.b());
      }
   }

   @Override
   public void a(ahw $$0) {
      zz.a($$0, this, this.f.y());
      yf.a $$1 = $$0.b();
      cux.a $$2 = this.P != null ? this.P.d().b() : null;
      cux.a $$3 = $$1.b();
      if (!Objects.equals($$2, $$3)) {
         if ($$2 != null && $$3.b().isBefore($$2.b())) {
            this.a(cux.a);
         } else {
            try {
               bcq $$4 = this.d.ar();
               if ($$4 == null) {
                  h.warn("Ignoring chat session from {} due to missing Services public key", this.f.gr().getName());
                  return;
               }

               this.a($$1.a(this.f.gr(), $$4));
            } catch (cux.b var6) {
               h.error("Failed to validate profile key: {}", var6.getMessage());
               this.a(var6.a());
            }
         }
      }
   }

   @Override
   public void a(aib $$0) {
      if (!this.V) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         this.e.a(acf.b, new avd(this.d, this.e, this.a(this.f.C())));
      }
   }

   @Override
   public void a(ahx $$0) {
      zz.a($$0, this, this.f.y());
      this.g.a($$0.b());
   }

   @Override
   public void a(aig $$0) {
      zz.a($$0, this, this.f.y());
      this.d.a(this.f, $$0.b());
   }

   private void a(yf $$0) {
      this.P = $$0;
      this.Q = $$0.a(this.f.cK());
      this.U.append(() -> {
         this.f.a($$0);
         this.d.ag().a(new aex(EnumSet.of(aex.a.b), List.of(this.f)));
      });
   }

   @Override
   public void a(aaw $$0) {
   }

   @Override
   public void a(ahz $$0) {
      zz.a($$0, this, this.f.y());
      if (!this.O) {
         this.f.a(fis.c);
      }

      this.O = false;
   }

   private void a(fis $$0) {
      if ($$0.h() > 1.0E-5F) {
         this.f.H();
      }

      this.f.a($$0);
      this.O = true;
   }

   @Override
   public boolean a() {
      return this.f.gc();
   }

   @Override
   public auc o() {
      return this.f;
   }

   @FunctionalInterface
   interface a {
      bxj run(auc var1, bzm var2, bxi var3);
   }
}
