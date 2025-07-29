import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class fxw {
   private static final float a = 0.01F;
   private static final int b = 18;
   private static final int c = -2039584;
   private static final int d = 2;
   private static final int e = 2;
   private static final int f = 2;
   private static final Map<eka.a, String> g = Maps.newEnumMap(Map.of(eka.a.a, "SW", eka.a.b, "S", eka.a.c, "OW", eka.a.d, "O", eka.a.e, "M", eka.a.f, "ML"));
   private final fue h;
   private final fxw.a i;
   private final fwz j;
   private final GpuBuffer k;
   private final RenderSystem.a l = RenderSystem.getSequentialBuffer(VertexFormat.b.a);
   private fiq m;
   private fiq n;
   @Nullable
   private dlz o;
   @Nullable
   private egi p;
   @Nullable
   private CompletableFuture<egi> q;
   private boolean r;
   private boolean s;
   private boolean t;
   private boolean u;
   private final bru v = new bru(1);
   private final bru w = new bru(brz.values().length);
   private final bru x = new bru(1);
   private final bru y = new bru(1);
   private final Map<brv, bru> z = Map.of(brv.a, this.w);
   private final fzh A;
   private final fzk B;
   private final fzi C;
   private final fzg D;
   private final fzj E;

   public fxw(fue $$0) {
      this.h = $$0;
      this.i = new fxw.a();
      this.j = $$0.h;
      this.A = new fzh(this.j, this.v);
      this.B = new fzk(this.j, this.w, () -> $$0.s.v().g());
      this.C = new fzi(this.j, this.x);
      this.D = new fzg(this.j, this.y);
      this.E = new fzj(this.j);

      try (foa $$1 = foa.a(fob.h.getVertexSize() * 12)) {
         fnz $$2 = new fnz($$1, VertexFormat.b.a, fob.h);
         $$2.a(0.0F, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
         $$2.a(1.0F, 0.0F, 0.0F).a(-65536).b(1.0F, 0.0F, 0.0F);
         $$2.a(0.0F, 0.0F, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
         $$2.a(0.0F, 1.0F, 0.0F).a(-16711936).b(0.0F, 1.0F, 0.0F);
         $$2.a(0.0F, 0.0F, 0.0F).a(-8421377).b(0.0F, 0.0F, 1.0F);
         $$2.a(0.0F, 0.0F, 1.0F).a(-8421377).b(0.0F, 0.0F, 1.0F);

         try (foc $$3 = $$2.b()) {
            this.k = RenderSystem.getDevice().createBuffer(() -> "Crosshair vertex buffer", 32, $$3.a());
         }
      }
   }

   public void a() {
      this.q = null;
      this.p = null;
   }

   public void a(fxb $$0) {
      btt $$1 = bts.a();
      $$1.a("debug");
      bzm $$2 = this.h.ap();
      this.m = $$2.a(20.0, 0.0F, false);
      this.n = $$2.a(20.0, 0.0F, true);
      this.b($$0);
      this.c($$0);
      $$0.c();
      this.E.a(10);
      if (this.t) {
         int $$3 = $$0.a();
         int $$4 = $$3 / 2;
         this.A.a($$0, 0, this.A.a($$4));
         if (this.w.d() > 0) {
            int $$5 = this.B.a($$4);
            this.B.a($$0, $$3 - $$5, $$5);
         }

         this.E.a(this.B.a());
      }

      if (this.u) {
         int $$6 = $$0.a();
         int $$7 = $$6 / 2;
         if (!this.h.U()) {
            this.D.a($$0, 0, this.D.a($$7));
         }

         int $$8 = this.C.a($$7);
         this.C.a($$0, $$6 - $$8, $$8);
         this.E.a(this.C.a());
      }

      try (bty $$9 = $$1.d("profilerPie")) {
         this.E.a($$0);
      }

      $$1.c();
   }

   protected void b(fxb $$0) {
      List<String> $$1 = this.b();
      $$1.add("");
      boolean $$2 = this.h.W() != null;
      $$1.add(
         "Debug charts: [F3+1] Profiler "
            + (this.s ? "visible" : "hidden")
            + "; [F3+2] "
            + ($$2 ? "FPS + TPS " : "FPS ")
            + (this.t ? "visible" : "hidden")
            + "; [F3+3] "
            + (!this.h.U() ? "Bandwidth + Ping" : "Ping")
            + (this.u ? " visible" : " hidden")
      );
      $$1.add("For help: press F3 + Q");
      this.a($$0, $$1, true);
   }

   protected void c(fxb $$0) {
      List<String> $$1 = this.c();
      this.a($$0, $$1, false);
   }

   private void a(fxb $$0, List<String> $$1, boolean $$2) {
      int $$3 = 9;

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         String $$5 = $$1.get($$4);
         if (!Strings.isNullOrEmpty($$5)) {
            int $$6 = this.j.b($$5);
            int $$7 = $$2 ? 2 : $$0.a() - 2 - $$6;
            int $$8 = 2 + $$3 * $$4;
            $$0.a($$7 - 1, $$8 - 1, $$7 + $$6 + 1, $$8 + $$3 - 1, -1873784752);
         }
      }

      for (int $$9 = 0; $$9 < $$1.size(); $$9++) {
         String $$10 = $$1.get($$9);
         if (!Strings.isNullOrEmpty($$10)) {
            int $$11 = this.j.b($$10);
            int $$12 = $$2 ? 2 : $$0.a() - 2 - $$11;
            int $$13 = 2 + $$3 * $$9;
            $$0.a(this.j, $$10, $$12, $$13, -2039584, false);
         }
      }
   }

   protected List<String> b() {
      hwf $$0 = this.h.W();
      grl $$1 = this.h.M();
      wd $$2 = $$1.m();
      float $$3 = $$2.p();
      float $$4 = $$2.o();
      bxt $$5 = this.s().v();
      String $$6;
      if ($$5.j()) {
         $$6 = " (frozen - stepping)";
      } else if ($$5.l()) {
         $$6 = " (frozen)";
      } else {
         $$6 = "";
      }

      String $$12;
      if ($$0 != null) {
         amy $$9 = $$0.aP();
         boolean $$10 = $$9.a();
         if ($$10) {
            $$6 = " (sprinting)";
         }

         String $$11 = $$10 ? "-" : String.format(Locale.ROOT, "%.1f", $$5.g());
         $$12 = String.format(Locale.ROOT, "Integrated server @ %.1f/%s ms%s, %.0f tx, %.0f rx", $$0.aO(), $$11, $$6, $$3, $$4);
      } else {
         $$12 = String.format(Locale.ROOT, "\"%s\" server%s, %.0f tx, %.0f rx", $$1.h(), $$6, $$3, $$4);
      }

      jb $$14 = this.h.ap().dx();
      if (this.h.aA()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + ac.b().c() + " (" + this.h.i() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.h.A,
               $$12,
               this.h.f.e(),
               this.h.f.j(),
               "P: " + this.h.g.c() + ". T: " + this.h.s.h(),
               this.h.s.K(),
               "",
               String.format(Locale.ROOT, "Chunk-relative: %d %d %d", $$14.u() & 15, $$14.v() & 15, $$14.w() & 15)
            }
         );
      } else {
         bzm $$15 = this.h.ap();
         jh $$16 = $$15.cS();

         String $$21 = switch ($$16) {
            case c -> "Towards negative Z";
            case d -> "Towards positive Z";
            case e -> "Towards negative X";
            case f -> "Towards positive X";
            default -> "Invalid";
         };
         dlz $$22 = new dlz($$14);
         if (!Objects.equals(this.o, $$22)) {
            this.o = $$22;
            this.a();
         }

         dmu $$23 = this.s();
         LongSet $$24 = (LongSet)($$23 instanceof aub ? ((aub)$$23).z() : LongSets.EMPTY_SET);
         List<String> $$25 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + ac.b().c()
                  + " ("
                  + this.h.i()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.h.j()) ? "" : "/" + this.h.j())
                  + ")",
               this.h.A,
               $$12,
               this.h.f.e(),
               this.h.f.j(),
               "P: " + this.h.g.c() + ". T: " + this.h.s.h(),
               this.h.s.K()
            }
         );
         String $$26 = this.r();
         if ($$26 != null) {
            $$25.add($$26);
         }

         $$25.add(this.h.s.aj().a() + " FC: " + $$24.size());
         $$25.add("");
         $$25.add(String.format(Locale.ROOT, "XYZ: %.3f / %.5f / %.3f", this.h.ap().dC(), this.h.ap().dE(), this.h.ap().dI()));
         $$25.add(String.format(Locale.ROOT, "Block: %d %d %d [%d %d %d]", $$14.u(), $$14.v(), $$14.w(), $$14.u() & 15, $$14.v() & 15, $$14.w() & 15));
         $$25.add(String.format(Locale.ROOT, "Chunk: %d %d %d [%d %d in r.%d.%d.mca]", $$22.h, ke.a($$14.v()), $$22.i, $$22.j(), $$22.k(), $$22.h(), $$22.i()));
         $$25.add(String.format(Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", $$16, $$21, bcb.h($$15.dP()), bcb.h($$15.dR())));
         egi $$27 = this.u();
         if ($$27.F()) {
            $$25.add("Waiting for chunk...");
         } else {
            int $$28 = this.h.s.i().q().a($$14, 0);
            int $$29 = this.h.s.a(dnd.a, $$14);
            int $$30 = this.h.s.a(dnd.b, $$14);
            $$25.add("Client Light: " + $$28 + " (" + $$29 + " sky, " + $$30 + " block)");
            egi $$31 = this.t();
            StringBuilder $$32 = new StringBuilder("CH");

            for (eka.a $$33 : eka.a.values()) {
               if ($$33.b()) {
                  $$32.append(" ").append(g.get($$33)).append(": ").append($$27.a($$33, $$14.u(), $$14.w()));
               }
            }

            $$25.add($$32.toString());
            $$32.setLength(0);
            $$32.append("SH");

            for (eka.a $$34 : eka.a.values()) {
               if ($$34.d()) {
                  $$32.append(" ").append(g.get($$34)).append(": ");
                  if ($$31 != null) {
                     $$32.append($$31.a($$34, $$14.u(), $$14.w()));
                  } else {
                     $$32.append("??");
                  }
               }
            }

            $$25.add($$32.toString());
            if (this.h.s.d($$14.v())) {
               $$25.add("Biome: " + a(this.h.s.v($$14)));
               if ($$31 != null) {
                  float $$35 = $$23.as();
                  long $$36 = $$31.w();
                  bxh $$37 = new bxh($$23.an(), $$23.af(), $$36, $$35);
                  $$25.add(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", $$37.b(), $$37.d(), this.h.s.af() / 24000L));
               } else {
                  $$25.add("Local Difficulty: ??");
               }
            }

            if ($$31 != null && $$31.u()) {
               $$25.add("Blending: Old");
            }
         }

         aub $$38 = this.q();
         if ($$38 != null) {
            aty $$39 = $$38.n();
            efz $$40 = $$39.g();
            eko $$41 = $$39.i();
            $$40.a($$25, $$41, $$14);
            dog.f $$42 = $$41.b();
            dob $$43 = $$40.d();
            $$43.a($$25, $$14, $$42);
            dnf.d $$44 = $$39.o();
            if ($$44 != null) {
               Object2IntMap<cap> $$45 = $$44.b();
               int $$46 = $$44.a();
               $$25.add(
                  "SC: "
                     + $$46
                     + ", "
                     + Stream.of(cap.values())
                        .map($$1x -> Character.toUpperCase($$1x.a().charAt(0)) + ": " + $$45.getInt($$1x))
                        .collect(Collectors.joining(", "))
               );
            } else {
               $$25.add("SC: N/A");
            }
         }

         ame $$47 = this.h.j.g();
         if ($$47 != null) {
            $$25.add("Post: " + $$47);
         }

         $$25.add(this.h.al().h() + String.format(Locale.ROOT, " (Mood %d%%)", Math.round(this.h.t.d() * 100.0F)));
         return $$25;
      }
   }

   private static String a(jl<dnx> $$0) {
      return (String)$$0.d().map($$0x -> $$0x.a().toString(), $$0x -> "[unregistered " + $$0x + "]");
   }

   @Nullable
   private aub q() {
      hwf $$0 = this.h.W();
      return $$0 != null ? $$0.a(this.h.s.aj()) : null;
   }

   @Nullable
   private String r() {
      aub $$0 = this.q();
      return $$0 != null ? $$0.K() : null;
   }

   private dmu s() {
      return (dmu)DataFixUtils.orElse(Optional.ofNullable(this.h.W()).flatMap($$0 -> Optional.ofNullable($$0.a(this.h.s.aj()))), this.h.s);
   }

   @Nullable
   private egi t() {
      if (this.q == null) {
         aub $$0 = this.q();
         if ($$0 == null) {
            return null;
         }

         this.q = $$0.n().b(this.o.h, this.o.i, egz.n, false).thenApply($$0x -> (egi)$$0x.b(null));
      }

      return this.q.getNow(null);
   }

   private egi u() {
      if (this.p == null) {
         this.p = this.h.s.d(this.o.h, this.o.i);
      }

      return this.p;
   }

   protected List<String> c() {
      long $$0 = Runtime.getRuntime().maxMemory();
      long $$1 = Runtime.getRuntime().totalMemory();
      long $$2 = Runtime.getRuntime().freeMemory();
      long $$3 = $$1 - $$2;
      GpuDevice $$4 = RenderSystem.getDevice();
      List<String> $$5 = Lists.newArrayList(
         new String[]{
            String.format(Locale.ROOT, "Java: %s", System.getProperty("java.version")),
            String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", $$3 * 100L / $$0, b($$3), b($$0)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB/s", b(this.i.a($$3))),
            String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", $$1 * 100L / $$0, b($$1)),
            "",
            String.format(Locale.ROOT, "CPU: %s", GLX._getCpuInfo()),
            "",
            String.format(Locale.ROOT, "Display: %dx%d (%s)", fue.R().aP().k(), fue.R().aP().l(), $$4.getVendor()),
            $$4.getRenderer(),
            String.format(Locale.ROOT, "%s %s", $$4.getBackendName(), $$4.getVersion())
         }
      );
      if (this.h.aA()) {
         return $$5;
      } else {
         if (this.m.d() == fiq.a.b) {
            jb $$6 = ((fio)this.m).b();
            eeb $$7 = this.h.s.a_($$6);
            $$5.add("");
            $$5.add(o.t + "Targeted Block: " + $$6.u() + ", " + $$6.v() + ", " + $$6.w());
            $$5.add(String.valueOf(mm.e.b($$7.b())));

            for (Entry<efe<?>, Comparable<?>> $$8 : $$7.G().entrySet()) {
               $$5.add(this.a($$8));
            }

            $$7.w().map($$0x -> "#" + $$0x.b()).forEach($$5::add);
         }

         if (this.n.d() == fiq.a.b) {
            jb $$9 = ((fio)this.n).b();
            fal $$10 = this.h.s.b_($$9);
            $$5.add("");
            $$5.add(o.t + "Targeted Fluid: " + $$9.u() + ", " + $$9.v() + ", " + $$9.w());
            $$5.add(String.valueOf(mm.c.b($$10.a())));

            for (Entry<efe<?>, Comparable<?>> $$11 : $$10.G().entrySet()) {
               $$5.add(this.a($$11));
            }

            $$10.k().map($$0x -> "#" + $$0x.b()).forEach($$5::add);
         }

         bzm $$12 = this.h.v;
         if ($$12 != null) {
            $$5.add("");
            $$5.add(o.t + "Targeted Entity");
            $$5.add(String.valueOf(mm.f.b($$12.ap())));
         }

         return $$5;
      }
   }

   private String a(Entry<efe<?>, Comparable<?>> $$0) {
      efe<?> $$1 = $$0.getKey();
      Comparable<?> $$2 = $$0.getValue();
      String $$3 = ag.a($$1, $$2);
      if (Boolean.TRUE.equals($$2)) {
         $$3 = o.k + $$3;
      } else if (Boolean.FALSE.equals($$2)) {
         $$3 = o.m + $$3;
      }

      return $$1.f() + ": " + $$3;
   }

   private static long b(long $$0) {
      return $$0 / 1024L / 1024L;
   }

   public boolean d() {
      return this.r && !this.h.n.Y;
   }

   public boolean e() {
      return this.d() && this.s;
   }

   public boolean f() {
      return this.d() && this.u;
   }

   public boolean g() {
      return this.d() && this.t;
   }

   public void h() {
      this.r = !this.r;
   }

   public void i() {
      this.u = !this.r || !this.u;
      if (this.u) {
         this.r = true;
         this.t = false;
      }
   }

   public void j() {
      this.t = !this.r || !this.t;
      if (this.t) {
         this.r = true;
         this.u = false;
      }
   }

   public void k() {
      this.s = !this.r || !this.s;
      if (this.s) {
         this.r = true;
      }
   }

   public void a(long $$0) {
      this.v.a($$0);
   }

   public bru l() {
      return this.w;
   }

   public bru m() {
      return this.x;
   }

   public bru n() {
      return this.y;
   }

   public fzj o() {
      return this.E;
   }

   public void a(long[] $$0, brv $$1) {
      bru $$2 = this.z.get($$1);
      if ($$2 != null) {
         $$2.a($$0);
      }
   }

   public void p() {
      this.r = false;
      this.w.e();
      this.x.e();
      this.y.e();
   }

   public void a(ftm $$0) {
      Matrix4fStack $$1 = RenderSystem.getModelViewStack();
      $$1.pushMatrix();
      $$1.translate(0.0F, 0.0F, -1.0F);
      $$1.rotateX($$0.f() * (float) (Math.PI / 180.0));
      $$1.rotateY($$0.g() * (float) (Math.PI / 180.0));
      float $$2 = 0.01F * this.h.aP().s();
      $$1.scale(-$$2, $$2, -$$2);
      RenderPipeline $$3 = gxx.V;
      fmr $$4 = fue.R().h();
      GpuTextureView $$5 = $$4.d();
      GpuTextureView $$6 = $$4.f();
      GpuBuffer $$7 = this.l.b(18);
      GpuBufferSlice[] $$8 = RenderSystem.getDynamicUniforms()
         .a(
            new gwz.a(new Matrix4f($$1), new Vector4f(0.0F, 0.0F, 0.0F, 1.0F), new Vector3f(), new Matrix4f(), 4.0F),
            new gwz.a(new Matrix4f($$1), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f(), 2.0F)
         );

      try (RenderPass $$9 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "3d crosshair", $$5, OptionalInt.empty(), $$6, OptionalDouble.empty())) {
         $$9.setPipeline($$3);
         RenderSystem.bindDefaultUniforms($$9);
         $$9.setVertexBuffer(0, this.k);
         $$9.setIndexBuffer($$7, this.l.a());
         $$9.setUniform("DynamicTransforms", $$8[0]);
         $$9.drawIndexed(0, 0, 18, 1);
         $$9.setUniform("DynamicTransforms", $$8[1]);
         $$9.drawIndexed(0, 0, 18, 1);
      }

      $$1.popMatrix();
   }

   static class a {
      private static final int a = 500;
      private static final List<GarbageCollectorMXBean> b = ManagementFactory.getGarbageCollectorMXBeans();
      private long c = 0L;
      private long d = -1L;
      private long e = -1L;
      private long f = 0L;

      long a(long $$0) {
         long $$1 = System.currentTimeMillis();
         if ($$1 - this.c < 500L) {
            return this.f;
         } else {
            long $$2 = a();
            if (this.c != 0L && $$2 == this.e) {
               double $$3 = (double)TimeUnit.SECONDS.toMillis(1L) / ($$1 - this.c);
               long $$4 = $$0 - this.d;
               this.f = Math.round($$4 * $$3);
            }

            this.c = $$1;
            this.d = $$0;
            this.e = $$2;
            return this.f;
         }
      }

      private static long a() {
         long $$0 = 0L;

         for (GarbageCollectorMXBean $$1 : b) {
            $$0 += $$1.getCollectionCount();
         }

         return $$0;
      }
   }
}
