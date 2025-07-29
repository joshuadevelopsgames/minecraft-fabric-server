import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gep extends get {
   static final ame b = ame.b("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int e = 20;
   private static final int f = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private static final amd<dnx> x = doe.b;
   public static final xo a = xo.c("flat_world_preset.unknown");
   private final gdu y;
   private xo z;
   private xo A;
   private gep.a B;
   private fxo C;
   fxx D;
   etb E;

   public gep(gdu $$0) {
      super(xo.c("createWorld.customize.presets.title"));
      this.y = $$0;
   }

   @Nullable
   private static esy a(jm<dpz> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, ehy.c);
      int $$10 = $$9 - $$2;

      Optional<jl.c<dpz>> $$11;
      try {
         $$11 = $$0.a(amd.a(mn.i, ame.a($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new esy($$10, $$11.get().a());
      }
   }

   private static List<esy> a(jm<dpz> $$0, String $$1) {
      List<esy> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         esy $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         int $$7 = ehy.c - $$4;
         if ($$7 > 0) {
            $$2.add($$6.a($$7));
            $$4 += $$6.a();
         }
      }

      return $$2;
   }

   public static etb a(jm<dpz> $$0, jm<dnx> $$1, jm<eve> $$2, jm<euc> $$3, String $$4, etb $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return etb.a($$1, $$2, $$3);
      } else {
         List<esy> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return etb.a($$1, $$2, $$3);
         } else {
            jl.c<dnx> $$8 = $$1.b(x);
            jl<dnx> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(ame.c($$10)).map($$0x -> amd.a(mn.aK, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(etb $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(amd::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aV_() {
      this.z = xo.c("createWorld.customize.presets.share");
      this.A = xo.c("createWorld.customize.presets.list");
      this.D = new fxx(this.q, 50, 40, this.o - 100, 20, this.z);
      this.D.f(1230);
      gkv $$0 = this.y.a.l().k();
      jz $$1 = $$0.a();
      cyd $$2 = $$0.h().b();
      jm<dnx> $$3 = $$1.f(mn.aK);
      jm<eve> $$4 = $$1.f(mn.bi);
      jm<euc> $$5 = $$1.f(mn.bg);
      jm<dpz> $$6 = $$1.f(mn.i).a($$2);
      this.D.a(a(this.y.k()));
      this.E = this.y.k();
      this.d(this.D);
      this.B = this.c(new gep.a($$1, $$2));
      this.C = this.c(fxo.a(xo.c("createWorld.customize.presets.select"), $$4x -> {
         etb $$5x = a($$6, $$3, $$4, $$5, this.D.a(), this.E);
         this.y.a($$5x);
         this.n.a(this.y);
      }).a(this.o / 2 - 155, this.p - 28, 150, 20).a());
      this.c(fxo.a(xn.e, $$0x -> this.n.a(this.y)).a(this.o / 2 + 5, this.p - 28, 150, 20).a());
      this.c(this.B.p() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.B.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fue $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
   }

   @Override
   public void aP_() {
      this.n.a(this.y);
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 8, -1);
      $$0.b(this.q, this.z, 51, 30, -6250336);
      $$0.b(this.q, this.A, 51, 68, -6250336);
      this.D.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.C.j = $$0 || this.D.a().length() > 1;
   }

   class a extends fyl<gep.a.a> {
      public a(final jz $$0, final cyd $$1) {
         super(gep.this.n, gep.this.o, gep.this.p - 117, 80, 24);

         for (jl<esz> $$2 : $$0.f(mn.aX).c(azt.a)) {
            Set<dpz> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               gep.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new gep.a.a($$2));
            }
         }
      }

      public void a(@Nullable gep.a.a $$0) {
         super.a($$0);
         gep.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (gby.a($$0) && this.p() != null) {
               this.p().b();
            }

            return false;
         }
      }

      public class a extends fyl.a<gep.a.a> {
         private static final ame b = ame.b("textures/gui/container/stats_icons.png");
         private final esz c;
         private final xo d;

         public a(final jl<esz> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> xo.c($$0x.a().h("flat_world_preset"))).orElse(gep.a);
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.b(gep.this.q, this.d, $$3 + 18 + 5, $$2 + 6, -1);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            gep.this.E = this.c.b();
            gep.this.D.a(gep.a(gep.this.E));
            gep.this.D.b(false);
         }

         private void a(fxb $$0, int $$1, int $$2, dcr $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new dcv($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fxb $$0, int $$1, int $$2) {
            $$0.a(gxx.ar, gep.b, $$1, $$2, 18, 18);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.d);
         }
      }
   }
}
