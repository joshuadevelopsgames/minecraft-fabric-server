import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class gkz extends fyl<gkz.a> {
   public static final DateTimeFormatter a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withZone(ZoneId.systemDefault());
   static final ame m = ame.b("world_list/error_highlighted");
   static final ame n = ame.b("world_list/error");
   static final ame o = ame.b("world_list/marked_join_highlighted");
   static final ame p = ame.b("world_list/marked_join");
   static final ame q = ame.b("world_list/warning_highlighted");
   static final ame r = ame.b("world_list/warning");
   static final ame s = ame.b("world_list/join_highlighted");
   static final ame u = ame.b("world_list/join");
   static final Logger v = LogUtils.getLogger();
   static final xo w = xo.c("selectWorld.tooltip.fromNewerVersion1").a(o.m);
   static final xo x = xo.c("selectWorld.tooltip.fromNewerVersion2").a(o.m);
   static final xo y = xo.c("selectWorld.tooltip.snapshot1").a(o.g);
   static final xo z = xo.c("selectWorld.tooltip.snapshot2").a(o.g);
   static final xo A = xo.c("selectWorld.locked").a(o.m);
   static final xo B = xo.c("selectWorld.conversion.tooltip").a(o.m);
   static final xo C = xo.c("selectWorld.incompatible.tooltip").a(o.m);
   static final xo D = xo.c("selectWorld.experimental");
   private final gkt E;
   private CompletableFuture<List<fct>> F;
   @Nullable
   private List<fct> G;
   private String H;
   private final gkz.b I;

   public gkz(gkt $$0, fue $$1, int $$2, int $$3, int $$4, int $$5, String $$6, @Nullable gkz $$7) {
      super($$1, $$2, $$3, $$4, $$5);
      this.E = $$0;
      this.I = new gkz.b($$1);
      this.H = $$6;
      if ($$7 != null) {
         this.F = $$7.F;
      } else {
         this.F = this.N();
      }

      this.a(this.L());
   }

   @Override
   protected void s() {
      this.aH_().forEach(gkz.a::close);
      super.s();
   }

   @Nullable
   private List<fct> L() {
      try {
         return this.F.getNow(null);
      } catch (CancellationException | CompletionException var2) {
         return null;
      }
   }

   void M() {
      this.F = this.N();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (gby.a($$0)) {
         Optional<gkz.c> $$3 = this.c();
         if ($$3.isPresent()) {
            if ($$3.get().b()) {
               this.c.al().a(hvm.a(ayz.BU, 1.0F));
               $$3.get().c();
            }

            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      List<fct> $$4 = this.L();
      if ($$4 != this.G) {
         this.a($$4);
      }

      super.b($$0, $$1, $$2, $$3);
   }

   private void a(@Nullable List<fct> $$0) {
      if ($$0 == null) {
         this.O();
      } else {
         this.a(this.H, $$0);
      }

      this.G = $$0;
   }

   public void a(String $$0) {
      if (this.G != null && !$$0.equals(this.H)) {
         this.a($$0, this.G);
      }

      this.H = $$0;
   }

   private CompletableFuture<List<fct>> N() {
      fcs.a $$0;
      try {
         $$0 = this.c.m().b();
      } catch (fcr var3) {
         v.error("Couldn't load level list", var3);
         this.c(var3.a());
         return CompletableFuture.completedFuture(List.of());
      }

      if ($$0.a()) {
         gkl.a(this.c, null);
         return CompletableFuture.completedFuture(List.of());
      } else {
         return this.c.m().a($$0).exceptionally($$0x -> {
            this.c.a(p.a($$0x, "Couldn't load level list"));
            return List.of();
         });
      }
   }

   private void a(String $$0, List<fct> $$1) {
      this.s();
      $$0 = $$0.toLowerCase(Locale.ROOT);

      for (fct $$2 : $$1) {
         if (this.a($$0, $$2)) {
            this.b(new gkz.c(this, $$2));
         }
      }

      this.P();
   }

   private boolean a(String $$0, fct $$1) {
      return $$1.b().toLowerCase(Locale.ROOT).contains($$0) || $$1.a().toLowerCase(Locale.ROOT).contains($$0);
   }

   private void O() {
      this.s();
      this.b(this.I);
      this.P();
   }

   private void P() {
      this.h();
      this.E.d(true);
   }

   private void c(xo $$0) {
      this.c.a(new gec(xo.c("selectWorld.unable_to_load"), $$0));
   }

   @Override
   public int a() {
      return 270;
   }

   public void a(@Nullable gkz.a $$0) {
      super.a($$0);
      this.E.a($$0 instanceof gkz.c $$1 ? $$1.f : null);
   }

   public Optional<gkz.c> c() {
      gkz.a $$0 = this.p();
      return $$0 instanceof gkz.c $$1 ? Optional.of($$1) : Optional.empty();
   }

   public gkt K() {
      return this.E;
   }

   @Override
   public void a(gbt $$0) {
      if (this.aH_().contains(this.I)) {
         this.I.b($$0);
      } else {
         super.a($$0);
      }
   }

   public abstract static class a extends fyl.a<gkz.a> implements AutoCloseable {
      @Override
      public void close() {
      }
   }

   public static class b extends gkz.a {
      private static final xo a = xo.c("selectWorld.loading_list");
      private final fue b;

      public b(fue $$0) {
         this.b = $$0;
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = (this.b.z.o - this.b.h.a(a)) / 2;
         int $$11 = $$2 + ($$5 - 9) / 2;
         $$0.b(this.b.h, a, $$10, $$11, -1);
         String $$12 = gei.a(ag.c());
         int $$13 = (this.b.z.o - this.b.h.b($$12)) / 2;
         int $$14 = $$11 + 9;
         $$0.b(this.b.h, $$12, $$13, $$14, -8355712);
      }

      @Override
      public xo a() {
         return a;
      }
   }

   public final class c extends gkz.a {
      private static final int b = 32;
      private static final int c = 32;
      private final fue d;
      private final gkt e;
      final fct f;
      private final ged g;
      @Nullable
      private Path h;
      private long i;

      public c(final gkz $$1, final fct $$2) {
         this.d = $$1.c;
         this.e = $$1.K();
         this.f = $$2;
         this.g = ged.a(this.d.ab(), $$2.a());
         this.h = $$2.c();
         this.j();
         this.l();
      }

      private void j() {
         if (this.h != null) {
            try {
               BasicFileAttributes $$0 = Files.readAttributes(this.h, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
               if ($$0.isSymbolicLink()) {
                  List<fij> $$1 = this.d.bf().a(this.h);
                  if (!$$1.isEmpty()) {
                     gkz.v.warn("{}", fih.a(this.h, $$1));
                     this.h = null;
                  } else {
                     $$0 = Files.readAttributes(this.h, BasicFileAttributes.class);
                  }
               }

               if (!$$0.isRegularFile()) {
                  this.h = null;
               }
            } catch (NoSuchFileException var3) {
               this.h = null;
            } catch (IOException var4) {
               gkz.v.error("could not validate symlink", var4);
               this.h = null;
            }
         }
      }

      @Override
      public xo a() {
         xo $$0 = xo.a("narrator.select.world_info", this.f.b(), xo.a(new Date(this.f.f())), this.f.s());
         if (this.f.p()) {
            $$0 = xn.a($$0, gkz.A);
         }

         if (this.f.e()) {
            $$0 = xn.a($$0, gkz.D);
         }

         return xo.a("narrator.select", $$0);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         String $$10 = this.f.b();
         String $$11 = this.f.a();
         long $$12 = this.f.f();
         if ($$12 != -1L) {
            $$11 = $$11 + " (" + gkz.a.format(Instant.ofEpochMilli($$12)) + ")";
         }

         if (StringUtils.isEmpty($$10)) {
            $$10 = htb.a("selectWorld.world") + " " + ($$1 + 1);
         }

         xo $$13 = this.f.s();
         $$0.b(this.d.h, $$10, $$3 + 32 + 3, $$2 + 1, -1);
         $$0.b(this.d.h, $$11, $$3 + 32 + 3, $$2 + 9 + 3, -8355712);
         $$0.b(this.d.h, $$13, $$3 + 32 + 3, $$2 + 9 + 9 + 3, -8355712);
         $$0.a(gxx.ar, this.g.b(), $$3, $$2, 0.0F, 0.0F, 32, 32, 32, 32);
         if (this.d.n.ad().c() || $$8) {
            $$0.a($$3, $$2, $$3 + 32, $$2 + 32, -1601138544);
            int $$14 = $$6 - $$3;
            boolean $$15 = $$14 < 32;
            ame $$16 = $$15 ? gkz.s : gkz.u;
            ame $$17 = $$15 ? gkz.q : gkz.r;
            ame $$18 = $$15 ? gkz.m : gkz.n;
            ame $$19 = $$15 ? gkz.o : gkz.p;
            if (this.f instanceof fct.c || this.f instanceof fct.b) {
               $$0.a(gxx.ar, $$18, $$3, $$2, 32, 32);
               $$0.a(gxx.ar, $$19, $$3, $$2, 32, 32);
               return;
            }

            if (this.f.p()) {
               $$0.a(gxx.ar, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  $$0.a(this.d.h.c(gkz.A, 175), $$6, $$7);
               }
            } else if (this.f.d()) {
               $$0.a(gxx.ar, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  $$0.a(this.d.h.c(gkz.B, 175), $$6, $$7);
               }
            } else if (!this.f.r()) {
               $$0.a(gxx.ar, $$18, $$3, $$2, 32, 32);
               if ($$15) {
                  $$0.a(this.d.h.c(gkz.C, 175), $$6, $$7);
               }
            } else if (this.f.m()) {
               $$0.a(gxx.ar, $$19, $$3, $$2, 32, 32);
               if (this.f.n()) {
                  $$0.a(gxx.ar, $$18, $$3, $$2, 32, 32);
                  if ($$15) {
                     $$0.a(ImmutableList.of(gkz.w.g(), gkz.x.g()), $$6, $$7);
                  }
               } else if (!ac.b().f()) {
                  $$0.a(gxx.ar, $$17, $$3, $$2, 32, 32);
                  if ($$15) {
                     $$0.a(ImmutableList.of(gkz.y.g(), gkz.z.g()), $$6, $$7);
                  }
               }
            } else {
               $$0.a(gxx.ar, $$16, $$3, $$2, 32, 32);
            }
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (!this.f.u()) {
            return true;
         } else {
            gkz.this.a((gkz.a)this);
            if (!($$0 - gkz.this.u() <= 32.0) && ag.c() - this.i >= 250L) {
               this.i = ag.c();
               return super.a($$0, $$1, $$2);
            } else {
               if (this.b()) {
                  this.d.al().a(hvm.a(ayz.BU, 1.0F));
                  this.c();
               }

               return true;
            }
         }
      }

      public boolean b() {
         return this.f.u();
      }

      public void c() {
         if (this.f.u()) {
            if (this.f instanceof fct.c) {
               this.d.a(gel.a(() -> this.d.a(this.e)));
            } else {
               this.d.x().a(this.f.a(), () -> {
                  gkz.this.M();
                  this.d.a(this.e);
               });
            }
         }
      }

      public void d() {
         this.d.a(new gdr($$0 -> {
            if ($$0) {
               this.d.a(new geq(true));
               this.e();
            }

            this.d.a(this.e);
         }, xo.c("selectWorld.deleteQuestion"), xo.a("selectWorld.deleteWarning", this.f.b()), xo.c("selectWorld.deleteButton"), xn.e));
      }

      public void e() {
         fcs $$0 = this.d.m();
         String $$1 = this.f.a();

         try (fcs.c $$2 = $$0.e($$1)) {
            $$2.k();
         } catch (IOException var8) {
            gab.b(this.d, $$1);
            gkz.v.error("Failed to delete world {}", $$1, var8);
         }

         gkz.this.M();
      }

      public void g() {
         this.k();
         String $$0 = this.f.a();

         fcs.c $$1;
         try {
            $$1 = this.d.m().d($$0);
         } catch (IOException var6) {
            gab.a(this.d, $$0);
            gkz.v.error("Failed to access level {}", $$0, var6);
            gkz.this.M();
            return;
         } catch (fih var7) {
            gkz.v.warn("{}", var7.getMessage());
            this.d.a(gel.a(() -> this.d.a(this.e)));
            return;
         }

         gko $$5;
         try {
            $$5 = gko.a(this.d, $$1, $$1x -> {
               $$1.c();
               if ($$1x) {
                  gkz.this.M();
               }

               this.d.a(this.e);
            });
         } catch (ut | va | IOException var5) {
            $$1.c();
            gab.a(this.d, $$0);
            gkz.v.error("Failed to load world data {}", $$0, var5);
            gkz.this.M();
            return;
         }

         this.d.a($$5);
      }

      public void h() {
         this.k();

         try (fcs.c $$0 = this.d.m().d(this.f.a())) {
            Pair<dmy, gkv> $$1 = this.d.x().a($$0);
            dmy $$2 = (dmy)$$1.getFirst();
            gkv $$3 = (gkv)$$1.getSecond();
            Path $$4 = gkl.a($$0.a(fcq.j), this.d);
            $$3.b();
            if ($$3.c().f()) {
               this.d
                  .a(
                     new gdr(
                        $$3x -> this.d.a((get)($$3x ? gkl.a(this.d, this.e, $$2, $$3, $$4) : this.e)),
                        xo.c("selectWorld.recreate.customized.title"),
                        xo.c("selectWorld.recreate.customized.text"),
                        xn.i,
                        xn.e
                     )
                  );
            } else {
               this.d.a(gkl.a(this.d, this.e, $$2, $$3, $$4));
            }
         } catch (fih var8) {
            gkz.v.warn("{}", var8.getMessage());
            this.d.a(gel.a(() -> this.d.a(this.e)));
         } catch (Exception var9) {
            gkz.v.error("Unable to recreate world", var9);
            this.d.a(new gdm(() -> this.d.a(this.e), xo.c("selectWorld.recreate.error.title"), xo.c("selectWorld.recreate.error.text")));
         }
      }

      private void k() {
         this.d.c(new gee(xo.c("selectWorld.data_read")));
      }

      private void l() {
         boolean $$0 = this.h != null && Files.isRegularFile(this.h);
         if ($$0) {
            try (InputStream $$1 = Files.newInputStream(this.h)) {
               this.g.a(fnf.a($$1));
            } catch (Throwable var7) {
               gkz.v.error("Invalid icon for world {}", this.f.a(), var7);
               this.h = null;
            }
         } else {
            this.g.a();
         }
      }

      @Override
      public void close() {
         this.g.close();
      }

      public String i() {
         return this.f.b();
      }
   }
}
