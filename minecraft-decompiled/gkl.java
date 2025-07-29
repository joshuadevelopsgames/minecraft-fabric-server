import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gkl extends get {
   private static final int b = 1;
   private static final int c = 210;
   private static final Logger d = LogUtils.getLogger();
   private static final String e = "mcworld-";
   static final xo f = xo.c("selectWorld.gameMode");
   static final xo u = xo.c("selectWorld.enterName");
   static final xo v = xo.c("selectWorld.experiments");
   static final xo w = xo.c("selectWorld.allowCommands.info");
   private static final xo x = xo.c("createWorld.preparing");
   private static final int y = 10;
   private static final int z = 8;
   public static final ame a = ame.b("textures/gui/tab_header_background.png");
   private final gbk A = new gbk(this);
   final gkx B;
   private final fzv C = new fzv($$1x -> {
      fxm var10000 = this.c($$1x);
   }, $$1x -> this.e($$1x));
   private boolean D;
   private final fii E;
   private final gkk F;
   @Nullable
   private final get G;
   @Nullable
   private Path H;
   @Nullable
   private awz I;
   @Nullable
   private fzw J;

   public static void a(fue $$0, @Nullable get $$1) {
      a($$0, $$1, ($$0x, $$1x, $$2, $$3) -> $$0x.a($$1x, (fdd)$$2));
   }

   public static void a(fue $$0, @Nullable get $$1, gkk $$2) {
      gkw $$3 = ($$0x, $$1x, $$2x) -> new gkv($$2x.a(), $$1x, $$0x, $$2x.b());
      Function<anc.a, ekw> $$4 = $$0x -> new ekw(eky.a(), euo.a($$0x.c()));
      a($$0, $$1, $$4, $$3, euo.a, $$2);
   }

   public static void b(fue $$0, @Nullable get $$1) {
      gkw $$2 = ($$0x, $$1x, $$2x) -> new gkv($$2x.a().a(), $$2x.a().b(), $$1x, $$0x, $$2x.b(), new gkq(gkx.a.c, Set.of(dmq.m, dmq.x, dmq.f), eta.h));
      Function<anc.a, ekw> $$3 = $$0x -> new ekw(eky.b(), euo.c($$0x.c()));
      a($$0, $$1, $$3, $$2, euo.b, ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fdd)$$2x));
   }

   private static void a(fue $$0, @Nullable get $$1, Function<anc.a, ekw> $$2, gkw $$3, amd<eun> $$4, gkk $$5) {
      a($$0, x);
      awz $$6 = new awz(new axc($$0.bf()));
      dns $$7 = ac.aZ ? new dns(new dmh(List.of("vanilla", "tests"), List.of()), cyf.h) : dns.d;
      anc.c $$8 = a($$6, $$7);
      CompletableFuture<gkv> $$9 = anc.a($$8, $$1x -> new anc.b<>(new gkm($$2.apply($$1x), $$1x.b()), $$1x.d()), ($$1x, $$2x, $$3x, $$4x) -> {
         $$1x.close();
         return $$3.apply($$2x, $$3x, $$4x);
      }, ag.h(), $$0);
      $$0.b($$9::isDone);
      $$0.a(new gkl($$0, $$1, $$9.join(), Optional.of($$4), OptionalLong.empty(), $$5));
   }

   public static gkl a(fue $$0, @Nullable get $$1, dmy $$2, gkv $$3, @Nullable Path $$4) {
      gkl $$5 = new gkl($$0, $$1, $$3, euo.a($$3.e()), OptionalLong.of($$3.c().c()), ($$0x, $$1x, $$2x, $$3x) -> $$0x.a($$1x, (fdd)$$2x));
      $$5.D = true;
      $$5.B.a($$2.a());
      $$5.B.a($$2.e());
      $$5.B.a($$2.d());
      $$5.B.q().a($$2.f(), null);
      if ($$2.c()) {
         $$5.B.a(gkx.a.b);
      } else if ($$2.b().h()) {
         $$5.B.a(gkx.a.a);
      } else if ($$2.b().g()) {
         $$5.B.a(gkx.a.c);
      }

      $$5.H = $$4;
      return $$5;
   }

   private gkl(fue $$0, @Nullable get $$1, gkv $$2, Optional<amd<eun>> $$3, OptionalLong $$4, gkk $$5) {
      super(xo.c("selectWorld.create"));
      this.G = $$1;
      this.E = $$0.bf();
      this.F = $$5;
      this.B = new gkx($$0.m().c(), $$2, $$3, $$4);
   }

   public gkx l() {
      return this.B;
   }

   @Override
   protected void aV_() {
      this.J = fzw.a(this.C, this.o).a(new gkl.a(), new gkl.c(), new gkl.b()).a();
      this.c(this.J);
      gbo $$0 = this.A.b(gbo.e().a(8));
      $$0.a(fxo.a(xo.c("selectWorld.create"), $$0x -> this.n()).a());
      $$0.a(fxo.a(xn.e, $$0x -> this.m()).a());
      this.A.a($$0x -> {
         $$0x.l(1);
         this.c($$0x);
      });
      this.J.a(0, false);
      this.B.a();
      this.c();
   }

   @Override
   protected void aF_() {
   }

   @Override
   public void c() {
      if (this.J != null) {
         this.J.a(this.o);
         this.J.g();
         int $$0 = this.J.I().c();
         gcd $$1 = new gcd(0, $$0, this.o, this.p - this.A.b() - $$0);
         this.C.a($$1);
         this.A.b($$0);
         this.A.a();
      }
   }

   private static void a(fue $$0, xo $$1) {
      $$0.c(new gee($$1));
   }

   private void n() {
      gkv $$0 = this.B.k();
      ekv.b $$1 = $$0.e().a($$0.d());
      js<amn> $$2 = $$0.f().a(amn.c, $$1.b());
      Lifecycle $$3 = cyf.a($$0.h().b()) ? Lifecycle.experimental() : Lifecycle.stable();
      Lifecycle $$4 = $$2.a().d();
      Lifecycle $$5 = $$4.add($$3);
      boolean $$6 = !this.D && $$4 == Lifecycle.stable();
      dmy $$7 = this.c($$1.d() == fcw.a.c);
      fcw $$8 = new fcw($$7, this.B.k().c(), $$1.d(), $$5);
      gky.a(this.n, this, $$5, () -> this.a($$2, $$8), $$6);
   }

   private void a(js<amn> $$0, fcw $$1) {
      boolean $$2 = this.F.create(this, $$0, $$1, this.H);
      this.F();
      if (!$$2) {
         this.m();
      }
   }

   private boolean a(js<amn> $$0, fdd $$1) {
      String $$2 = this.B.c();
      gkv $$3 = this.B.k();
      a(this.n, x);
      Optional<fcs.c> $$4 = a(this.n, $$2, this.H);
      if ($$4.isEmpty()) {
         gab.c(this.n, $$2);
         return false;
      } else {
         this.n.x().a($$4.get(), $$3.g(), $$0, $$1);
         return true;
      }
   }

   private dmy c(boolean $$0) {
      String $$1 = this.B.b().trim();
      if ($$0) {
         dmq $$2 = new dmq(dns.d.b());
         $$2.b(dmq.m).a(false, null);
         return new dmy($$1, dmr.d, false, bxg.a, true, $$2, dns.d);
      } else {
         return new dmy($$1, this.B.d().e, this.B.f(), this.B.e(), this.B.g(), this.B.q(), this.B.k().h());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.J.b($$0)) {
         return true;
      } else if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.n();
         return true;
      }
   }

   @Override
   public void aP_() {
      this.m();
   }

   public void m() {
      this.n.a(this.G);
      this.F();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(gxx.ar, get.i, 0, this.p - this.A.b() - 2, 0.0F, 0.0F, this.o, 2, 32, 2);
   }

   @Override
   protected void a(fxb $$0) {
      $$0.a(gxx.ar, a, 0, 0, 0.0F, 0.0F, this.o, this.A.c(), 16, 16);
      this.a($$0, 0, this.A.c(), this.o, this.p);
   }

   @Nullable
   private Path E() {
      if (this.H == null) {
         try {
            this.H = Files.createTempDirectory("mcworld-");
         } catch (IOException var2) {
            d.warn("Failed to create temporary dir", var2);
            gab.c(this.n, this.B.c());
            this.m();
         }
      }

      return this.H;
   }

   void a(dns $$0) {
      Pair<Path, awz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.n.a(new gkp(this, (awz)$$1.getSecond(), $$0x -> this.a($$0x, false, this::a)));
      }
   }

   void b(dns $$0) {
      Pair<Path, awz> $$1 = this.c($$0);
      if ($$1 != null) {
         this.n.a(new gjc((awz)$$1.getSecond(), $$0x -> this.a($$0x, true, this::b), (Path)$$1.getFirst(), xo.c("dataPack.title")));
      }
   }

   private void a(awz $$0, boolean $$1, Consumer<dns> $$2) {
      List<String> $$3 = ImmutableList.copyOf($$0.e());
      List<String> $$4 = $$0.c().stream().filter($$1x -> !$$3.contains($$1x)).collect(ImmutableList.toImmutableList());
      dns $$5 = new dns(new dmh($$3, $$4), this.B.k().h().b());
      if (this.B.a($$5)) {
         this.n.a(this);
      } else {
         cyd $$6 = $$0.f();
         if (cyf.a($$6) && $$1) {
            this.n.a(new gkj($$0.g(), $$3x -> {
               if ($$3x) {
                  this.a($$0, $$5, $$2);
               } else {
                  $$2.accept(this.B.k().h());
               }
            }));
         } else {
            this.a($$0, $$5, $$2);
         }
      }
   }

   private void a(awz $$0, dns $$1, Consumer<dns> $$2) {
      this.n.c(new gee(xo.c("dataPack.validation.working")));
      anc.c $$3 = a($$0, $$1);
      anc.<gkm, gkv>a(
            $$3,
            $$0x -> {
               if ($$0x.c().e(mn.bt).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one world preset to continue");
               } else if ($$0x.c().e(mn.aK).c().findAny().isEmpty()) {
                  throw new IllegalStateException("Needs at least one biome continue");
               } else {
                  gkv $$1x = this.B.k();
                  DynamicOps<JsonElement> $$2x = $$1x.a().a(JsonOps.INSTANCE);
                  DataResult<JsonElement> $$3x = ekw.a($$2x, $$1x.c(), $$1x.e()).setLifecycle(Lifecycle.stable());
                  DynamicOps<JsonElement> $$4 = $$0x.c().a(JsonOps.INSTANCE);
                  ekw $$5 = (ekw)$$3x.flatMap($$1xx -> ekw.a.parse($$4, $$1xx))
                     .getOrThrow($$0xx -> new IllegalStateException("Error parsing worldgen settings after loading data packs: " + $$0xx));
                  return new anc.b<>(new gkm($$5, $$0x.b()), $$0x.d());
               }
            },
            ($$0x, $$1x, $$2x, $$3x) -> {
               $$0x.close();
               return new gkv($$3x.a(), $$2x, $$1x, $$3x.b());
            },
            ag.h(),
            this.n
         )
         .thenApply($$0x -> {
            $$0x.b();
            return $$0x;
         })
         .thenAcceptAsync(this.B::a, this.n)
         .handleAsync(($$1x, $$2x) -> {
            if ($$2x != null) {
               d.warn("Failed to validate datapack", $$2x);
               this.n.a(new gdr($$1xx -> {
                  if ($$1xx) {
                     $$2.accept(this.B.k().h());
                  } else {
                     $$2.accept(dns.d);
                  }
               }, xo.c("dataPack.validation.failed"), xn.a, xo.c("dataPack.validation.back"), xo.c("dataPack.validation.reset")));
            } else {
               this.n.a(this);
            }

            return null;
         }, this.n);
   }

   private static anc.c a(awz $$0, dns $$1) {
      anc.d $$2 = new anc.d($$0, $$1, false, true);
      return new anc.c($$2, el.a.c, 2);
   }

   private void F() {
      if (this.H != null && Files.exists(this.H)) {
         try (Stream<Path> $$0 = Files.walk(this.H)) {
            $$0.sorted(Comparator.reverseOrder()).forEach($$0x -> {
               try {
                  Files.delete($$0x);
               } catch (IOException var2) {
                  d.warn("Failed to remove temporary file {}", $$0x, var2);
               }
            });
         } catch (IOException var6) {
            d.warn("Failed to list temporary dir {}", this.H);
         }
      }

      this.H = null;
   }

   private static void a(Path $$0, Path $$1, Path $$2) {
      try {
         ag.b($$0, $$1, $$2);
      } catch (IOException var4) {
         d.warn("Failed to copy datapack file from {} to {}", $$2, $$1);
         throw new UncheckedIOException(var4);
      }
   }

   private static Optional<fcs.c> a(fue $$0, String $$1, @Nullable Path $$2) {
      try {
         fcs.c $$3 = $$0.m().e($$1);
         if ($$2 == null) {
            return Optional.of($$3);
         }

         try {
            Optional var6;
            try (Stream<Path> $$4 = Files.walk($$2)) {
               Path $$5 = $$3.a(fcq.j);
               w.c($$5);
               $$4.filter($$1x -> !$$1x.equals($$2)).forEach($$2x -> a($$2, $$5, $$2x));
               var6 = Optional.of($$3);
            }

            return var6;
         } catch (UncheckedIOException | IOException var9) {
            d.warn("Failed to copy datapacks to world {}", $$1, var9);
            $$3.close();
         }
      } catch (UncheckedIOException | IOException var10) {
         d.warn("Failed to create access for {}", $$1, var10);
      }

      return Optional.empty();
   }

   @Nullable
   public static Path a(Path $$0, fue $$1) {
      MutableObject<Path> $$2 = new MutableObject();

      try (Stream<Path> $$3 = Files.walk($$0)) {
         $$3.filter($$1x -> !$$1x.equals($$0)).forEach($$2x -> {
            Path $$3x = (Path)$$2.getValue();
            if ($$3x == null) {
               try {
                  $$3x = Files.createTempDirectory("mcworld-");
               } catch (IOException var5) {
                  d.warn("Failed to create temporary dir");
                  throw new UncheckedIOException(var5);
               }

               $$2.setValue($$3x);
            }

            a($$0, $$3x, $$2x);
         });
      } catch (UncheckedIOException | IOException var8) {
         d.warn("Failed to copy datapacks from world {}", $$0, var8);
         gab.c($$1, $$0.toString());
         return null;
      }

      return (Path)$$2.getValue();
   }

   @Nullable
   private Pair<Path, awz> c(dns $$0) {
      Path $$1 = this.E();
      if ($$1 != null) {
         if (this.I == null) {
            this.I = axc.a($$1, this.E);
            this.I.a();
         }

         this.I.b($$0.a().a());
         return Pair.of($$1, this.I);
      } else {
         return null;
      }
   }

   class a extends fzs {
      private static final xo b = xo.c("createWorld.tab.game.title");
      private static final xo d = xo.c("selectWorld.allowCommands");
      private final fxx e;

      a() {
         super(b);
         gbj.b $$0 = this.c.b(8).d(1);
         gbn $$1 = $$0.b();
         this.e = new fxx(gkl.this.q, 208, 20, xo.c("selectWorld.enterName"));
         this.e.a(gkl.this.B.b());
         this.e.b(gkl.this.B::a);
         gkl.this.B.a($$0x -> this.e.a(fzb.a(xo.a("selectWorld.targetFolder", xo.b($$0x.c()).a(o.u)))));
         gkl.this.b(this.e);
         $$0.a(gbg.a(gkl.this.q, this.e, gkl.u), $$0.b().b());
         fxv<gkx.a> $$2 = $$0.a(fxv.<gkx.a>a($$0x -> $$0x.f).a(gkx.a.a, gkx.a.b, gkx.a.c).a(0, 0, 210, 20, gkl.f, ($$0x, $$1x) -> gkl.this.B.a($$1x)), $$1);
         gkl.this.B.a($$1x -> {
            $$2.a($$1x.d());
            $$2.j = !$$1x.l();
            $$2.a(fzb.a($$1x.d().a()));
         });
         fxv<bxg> $$3 = $$0.a(fxv.a(bxg::b).a(bxg.values()).a(0, 0, 210, 20, xo.c("options.difficulty"), ($$0x, $$1x) -> gkl.this.B.a($$1x)), $$1);
         gkl.this.B.a($$1x -> {
            $$3.a(gkl.this.B.e());
            $$3.j = !gkl.this.B.f();
            $$3.a(fzb.a(gkl.this.B.e().d()));
         });
         fxv<Boolean> $$4 = $$0.a(fxv.e().a($$0x -> fzb.a(gkl.w)).a(0, 0, 210, 20, d, ($$0x, $$1x) -> gkl.this.B.a($$1x)));
         gkl.this.B.a($$1x -> {
            $$4.a(gkl.this.B.g());
            $$4.j = !gkl.this.B.l() && !gkl.this.B.f();
         });
         if (!ac.b().f()) {
            $$0.a(fxo.a(gkl.v, $$0x -> gkl.this.a(gkl.this.B.k().h())).a(210).a());
         }
      }
   }

   class b extends fzs {
      private static final xo b = xo.c("createWorld.tab.more.title");
      private static final xo d = xo.c("selectWorld.gameRules");
      private static final xo e = xo.c("selectWorld.dataPacks");

      b() {
         super(b);
         gbj.b $$0 = this.c.b(8).d(1);
         $$0.a(fxo.a(d, $$0x -> this.c()).a(210).a());
         $$0.a(fxo.a(gkl.v, $$0x -> gkl.this.a(gkl.this.B.k().h())).a(210).a());
         $$0.a(fxo.a(e, $$0x -> gkl.this.b(gkl.this.B.k().h())).a(210).a());
      }

      private void c() {
         gkl.this.n.a(new gkn(gkl.this.B.q().a(gkl.this.B.k().h().b()), $$0 -> {
            gkl.this.n.a(gkl.this);
            $$0.ifPresent(gkl.this.B::a);
         }));
      }
   }

   class c extends fzs {
      private static final xo b = xo.c("createWorld.tab.world.title");
      private static final xo d = xo.c("generator.minecraft.amplified.info");
      private static final xo e = xo.c("selectWorld.mapFeatures");
      private static final xo f = xo.c("selectWorld.mapFeatures.info");
      private static final xo g = xo.c("selectWorld.bonusItems");
      private static final xo h = xo.c("selectWorld.enterSeed");
      static final xo i = xo.c("selectWorld.seedInfo").a(o.i);
      private static final int j = 310;
      private final fxx k;
      private final fxo l;

      c() {
         super(b);
         gbj.b $$0 = this.c.a(10).b(8).d(2);
         fxv<gkx.b> $$1 = $$0.a(
            fxv.<gkx.b>a(gkx.b::a).a(this.d()).a(gkl.c::a).a(0, 0, 150, 20, xo.c("selectWorld.mapType"), ($$0x, $$1x) -> gkl.this.B.a($$1x))
         );
         $$1.a(gkl.this.B.m());
         gkl.this.B.a($$1x -> {
            gkx.b $$2x = $$1x.m();
            $$1.a($$2x);
            if ($$2x.b()) {
               $$1.a(fzb.a(d));
            } else {
               $$1.a(null);
            }

            $$1.j = gkl.this.B.m().c() != null;
         });
         this.l = $$0.a(fxo.a(xo.c("selectWorld.customizeType"), $$0x -> this.c()).a());
         gkl.this.B.a($$0x -> this.l.j = !$$0x.l() && $$0x.n() != null);
         this.k = new fxx(gkl.this.q, 308, 20, xo.c("selectWorld.enterSeed")) {
            @Override
            protected yc d() {
               return super.d().b(xn.u).b(gkl.c.i);
            }
         };
         this.k.c(i);
         this.k.a(gkl.this.B.h());
         this.k.b($$0x -> gkl.this.B.b(this.k.a()));
         $$0.a(gbg.a(gkl.this.q, this.k, h), 2);
         gku.a $$2 = gku.a(310);
         $$2.a(e, gkl.this.B::i, gkl.this.B::b).a(() -> !gkl.this.B.l()).a(f);
         $$2.a(g, gkl.this.B::j, gkl.this.B::c).a(() -> !gkl.this.B.f() && !gkl.this.B.l());
         gku $$3 = $$2.a();
         $$0.a($$3.a(), 2);
         gkl.this.B.a($$1x -> $$3.b());
      }

      private void c() {
         gks $$0 = gkl.this.B.n();
         if ($$0 != null) {
            gkl.this.n.a($$0.createEditScreen(gkl.this, gkl.this.B.k()));
         }
      }

      private fxv.c<gkx.b> d() {
         return new fxv.c<gkx.b>() {
            @Override
            public List<gkx.b> a() {
               return fxv.a.getAsBoolean() ? gkl.this.B.p() : gkl.this.B.o();
            }

            @Override
            public List<gkx.b> b() {
               return gkl.this.B.o();
            }
         };
      }

      private static yc a(fxv<gkx.b> $$0) {
         return $$0.a().b() ? xn.a($$0.c(), d) : $$0.c();
      }
   }
}
