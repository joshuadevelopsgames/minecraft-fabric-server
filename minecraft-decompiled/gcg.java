import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class gcg implements AutoCloseable {
   private static final Logger e = LogUtils.getLogger();
   private static final float f = 10000.0F;
   private static final float g = 0.0F;
   private static final float h = 1000.0F;
   public static final int a = 1000;
   public static final int b = -1000;
   public static final int c = 16;
   private static final int i = 512;
   private static final int j = RenderSystem.getDevice().getMaxTextureSize();
   public static final int d = 0;
   private static final Comparator<gcd> k = Comparator.nullsFirst(
      Comparator.<gcd, Integer>comparing(gcd::b).thenComparing(gcd::c).thenComparing(gcd::d).thenComparing(gcd::e)
   );
   private static final Comparator<gch> l = Comparator.nullsFirst(Comparator.comparing(gch::b));
   private static final Comparator<gcw> m = Comparator.comparing(gcw::m, k)
      .thenComparing(gcw::a, Comparator.comparing(RenderPipeline::getSortKey))
      .thenComparing(gcw::b, l);
   private final Map<Object, gcg.a> n = new Object2ObjectOpenHashMap();
   private final Map<Object, gcp> o = new Object2ObjectOpenHashMap();
   final gcy p;
   private final List<gcg.b> q = new ArrayList<>();
   private final List<gcg.c> r = new ArrayList<>();
   private final foa s = new foa(786432);
   private final Map<VertexFormat, gxl> t = new Object2ObjectOpenHashMap();
   private int u = Integer.MAX_VALUE;
   private final gwt v = new gwt("gui", 1000.0F, 11000.0F, true);
   private final gwt w = new gwt("items", -1000.0F, 1000.0F, true);
   private final gxn.a x;
   private final Map<Class<? extends gdj>, gcq<?>> y;
   @Nullable
   private GpuTexture z;
   @Nullable
   private GpuTextureView A;
   @Nullable
   private GpuTexture B;
   @Nullable
   private GpuTextureView C;
   private int D;
   private int E;
   private int F;
   private int G;
   @Nullable
   private gcd H = null;
   @Nullable
   private RenderPipeline I = null;
   @Nullable
   private gch J = null;
   @Nullable
   private fnz K = null;

   public gcg(gcy $$0, gxn.a $$1, List<gcq<?>> $$2) {
      this.p = $$0;
      this.x = $$1;
      Builder<Class<? extends gdj>, gcq<?>> $$3 = ImmutableMap.builder();

      for (gcq<?> $$4 : $$2) {
         $$3.put($$4.a(), $$4);
      }

      this.y = $$3.buildOrThrow();
   }

   public void a() {
      this.G++;
   }

   public void a(GpuBufferSlice $$0) {
      this.c();
      this.b($$0);

      for (gxl $$1 : this.t.values()) {
         $$1.c();
      }

      this.q.clear();
      this.r.clear();
      this.p.f();
      this.u = Integer.MAX_VALUE;
      this.b();
   }

   private void b() {
      Iterator<Entry<Object, gcp>> $$0 = this.o.entrySet().iterator();

      while ($$0.hasNext()) {
         Entry<Object, gcp> $$1 = $$0.next();
         gcp $$2 = $$1.getValue();
         if (!$$2.c()) {
            $$2.close();
            $$0.remove();
         } else {
            $$2.d();
         }
      }
   }

   private void c() {
      this.x.b();
      this.f();
      this.e();
      this.d();
      this.p.a(m);
      this.a(gcy.c.b);
      this.u = this.r.size();
      this.a(gcy.c.c);
      this.i();
   }

   private void a(gcy.c $$0) {
      this.H = null;
      this.I = null;
      this.J = null;
      this.K = null;
      this.p.a(this::a, $$0);
      if (this.K != null) {
         this.a(this.K, this.I, this.J, this.H);
      }
   }

   private void b(GpuBufferSlice $$0) {
      if (!this.q.isEmpty()) {
         fue $$1 = fue.R();
         fni $$2 = $$1.aP();
         RenderSystem.setProjectionMatrix(this.v.a((float)$$2.k() / $$2.s(), (float)$$2.l() / $$2.s()), fle.b);
         fmr $$3 = $$1.h();
         int $$4 = 0;

         for (gcg.b $$5 : this.q) {
            if ($$5.d > $$4) {
               $$4 = $$5.d;
            }
         }

         RenderSystem.a $$6 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
         GpuBuffer $$7 = $$6.b($$4);
         VertexFormat.a $$8 = $$6.a();
         GpuBufferSlice $$9 = RenderSystem.getDynamicUniforms()
            .a(new Matrix4f().setTranslation(0.0F, 0.0F, -11000.0F), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);
         if (this.u > 0) {
            this.a(() -> "GUI before blur", $$3, $$0, $$9, $$7, $$8, 0, Math.min(this.u, this.q.size()));
         }

         if (this.q.size() > this.u) {
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$3.e(), 1.0);
            $$1.j.e();
            this.a(() -> "GUI after blur", $$3, $$0, $$9, $$7, $$8, this.u, this.q.size());
         }
      }
   }

   private void a(Supplier<String> $$0, fmr $$1, GpuBufferSlice $$2, GpuBufferSlice $$3, GpuBuffer $$4, VertexFormat.a $$5, int $$6, int $$7) {
      try (RenderPass $$8 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass($$0, $$1.d(), OptionalInt.empty(), $$1.h ? $$1.f() : null, OptionalDouble.empty())) {
         RenderSystem.bindDefaultUniforms($$8);
         $$8.setUniform("Fog", $$2);
         $$8.setUniform("DynamicTransforms", $$3);

         for (int $$9 = $$6; $$9 < $$7; $$9++) {
            gcg.b $$10 = this.q.get($$9);
            this.a($$10, $$8, $$4, $$5);
         }
      }
   }

   private void a(gcw $$0, int $$1) {
      RenderPipeline $$2 = $$0.a();
      gch $$3 = $$0.b();
      gcd $$4 = $$0.m();
      if ($$2 != this.I || this.a($$4, this.H) || !$$3.equals(this.J)) {
         if (this.K != null) {
            this.a(this.K, this.I, this.J, this.H);
         }

         this.K = this.a($$2);
         this.I = $$2;
         this.J = $$3;
         this.H = $$4;
      }

      $$0.a(this.K, 0.0F + $$1);
   }

   private void d() {
      this.p.b($$0 -> {
         final Matrix3x2f $$1 = $$0.c;
         final gcd $$2 = $$0.i;
         $$0.a().a(new fwz.b() {
            @Override
            public void a(gas.b $$0) {
               if ($$0.i().a() != null) {
                  gcg.this.p.b(new gcv($$1, $$0, $$2));
               }
            }

            @Override
            public void a(gas $$0, gas.a $$1x) {
               if ($$0.a() != null) {
                  gcg.this.p.b(new gcu($$1, $$0, $$1, $$2));
               }
            }
         });
      });
   }

   private void e() {
      if (!this.p.e().isEmpty()) {
         int $$0 = this.g();
         int $$1 = 16 * $$0;
         int $$2 = this.b($$1);
         if (this.z == null) {
            this.a($$2);
         }

         RenderSystem.outputColorTextureOverride = this.A;
         RenderSystem.outputDepthTextureOverride = this.C;
         RenderSystem.setProjectionMatrix(this.w.a($$2, $$2), fle.b);
         fue.R().j.p().a(fnb.a.c);
         fod $$3 = new fod();
         MutableBoolean $$4 = new MutableBoolean(false);
         MutableBoolean $$5 = new MutableBoolean(false);
         this.p.a($$5x -> {
            if ($$5x.g() != null) {
               $$5.setTrue();
            } else {
               hon $$6 = $$5x.c();
               gcg.a $$7 = this.n.get($$6.i());
               if ($$7 == null || $$6.d() && $$7.e != this.G) {
                  if (this.D + $$1 > $$2) {
                     this.D = 0;
                     this.E += $$1;
                  }

                  boolean $$8 = $$6.d() && $$7 != null;
                  if (!$$8 && this.E + $$1 > $$2) {
                     if ($$4.isFalse()) {
                        e.warn("Trying to render too many items in GUI at the same time. Skipping some of them.");
                        $$4.setTrue();
                     }
                  } else {
                     int $$9 = $$8 ? $$7.a : this.D;
                     int $$10 = $$8 ? $$7.b : this.E;
                     if ($$8) {
                        RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(this.z, 0, this.B, 1.0, $$9, $$2 - $$10 - $$1, $$1, $$1);
                     }

                     this.a($$6, $$3, $$9, $$10, $$1);
                     float $$11 = (float)$$9 / $$2;
                     float $$12 = (float)($$2 - $$10) / $$2;
                     this.a($$5x, $$11, $$12, $$1, $$2);
                     if ($$8) {
                        $$7.e = this.G;
                     } else {
                        this.n.put($$5x.c().i(), new gcg.a(this.D, this.E, $$11, $$12, this.G));
                        this.D += $$1;
                     }
                  }
               } else {
                  this.a($$5x, $$7.c, $$7.d, $$1, $$2);
               }
            }
         });
         RenderSystem.outputColorTextureOverride = null;
         RenderSystem.outputDepthTextureOverride = null;
         if ($$5.getValue()) {
            this.p.a($$1x -> {
               if ($$1x.g() != null) {
                  hon $$2x = $$1x.c();
                  gcp $$3x = this.o.computeIfAbsent($$2x.i(), $$0xx -> new gcp(this.x));
                  gcd $$4x = $$1x.g();
                  gdi $$5x = new gdi($$1x, $$4x.d(), $$4x.b(), $$4x.e(), $$4x.c());
                  $$3x.a($$5x, this.p, $$0);
               }
            });
         }
      }
   }

   private void f() {
      int $$0 = fue.R().aP().s();
      this.p.c($$1 -> this.a($$1, $$0));
   }

   private <T extends gdj> void a(T $$0, int $$1) {
      gcq<T> $$2 = (gcq<T>)this.y.get($$0.getClass());
      if ($$2 != null) {
         $$2.a($$0, this.p, $$1);
      }
   }

   private void a(hon $$0, fod $$1, int $$2, int $$3, int $$4) {
      $$1.a();
      $$1.a($$2 + $$4 / 2.0F, $$3 + $$4 / 2.0F, 0.0F);
      $$1.b($$4, -$$4, $$4);
      boolean $$5 = !$$0.f();
      if ($$5) {
         fue.R().j.p().a(fnb.a.b);
      } else {
         fue.R().j.p().a(fnb.a.c);
      }

      RenderSystem.enableScissorForRenderTypeDraws($$2, this.z.getHeight(0) - $$3 - $$4, $$4, $$4);
      $$0.a($$1, this.x, 15728880, hri.d);
      this.x.b();
      RenderSystem.disableScissorForRenderTypeDraws();
      $$1.b();
   }

   private void a(gcx $$0, float $$1, float $$2, int $$3, int $$4) {
      float $$5 = $$1 + (float)$$3 / $$4;
      float $$6 = $$2 + (float)(-$$3) / $$4;
      this.p.a(new gcs(gxx.as, gch.a(this.A), $$0.b(), $$0.d(), $$0.e(), $$0.d() + 16, $$0.e() + 16, $$1, $$5, $$2, $$6, -1, $$0.f(), null));
   }

   private void a(int $$0) {
      GpuDevice $$1 = RenderSystem.getDevice();
      this.z = $$1.createTexture("UI items atlas", 12, TextureFormat.RGBA8, $$0, $$0, 1, 1);
      this.z.setTextureFilter(FilterMode.NEAREST, false);
      this.A = $$1.createTextureView(this.z);
      this.B = $$1.createTexture("UI items atlas depth", 8, TextureFormat.DEPTH32, $$0, $$0, 1, 1);
      this.C = $$1.createTextureView(this.B);
      $$1.createCommandEncoder().clearColorAndDepthTextures(this.z, 0, this.B, 1.0);
   }

   private int b(int $$0) {
      Set<Object> $$1 = this.p.e();
      int $$2;
      if (this.n.isEmpty()) {
         $$2 = $$1.size();
      } else {
         $$2 = this.n.size();

         for (Object $$4 : $$1) {
            if (!this.n.containsKey($$4)) {
               $$2++;
            }
         }
      }

      if (this.z != null) {
         int $$5 = this.z.getWidth(0) / $$0;
         int $$6 = $$5 * $$5;
         if ($$2 < $$6) {
            return this.z.getWidth(0);
         }

         this.h();
      }

      int $$7 = $$1.size();
      int $$8 = bcb.d($$7 + $$7 / 2);
      return Math.clamp((long)bcb.c($$8 * $$0), 512, j);
   }

   private int g() {
      int $$0 = fue.R().aP().s();
      if ($$0 != this.F) {
         this.h();

         for (gcp $$1 : this.o.values()) {
            $$1.e();
         }

         this.F = $$0;
      }

      return $$0;
   }

   private void h() {
      this.D = 0;
      this.E = 0;
      this.n.clear();
      if (this.z != null) {
         this.z.close();
         this.z = null;
      }

      if (this.A != null) {
         this.A.close();
         this.A = null;
      }

      if (this.B != null) {
         this.B.close();
         this.B = null;
      }

      if (this.C != null) {
         this.C.close();
         this.C = null;
      }
   }

   private void a(fnz $$0, RenderPipeline $$1, gch $$2, @Nullable gcd $$3) {
      foc $$4 = $$0.b();
      this.r.add(new gcg.c($$4, $$1, $$2, $$3));
   }

   private void i() {
      this.j();
      CommandEncoder $$0 = RenderSystem.getDevice().createCommandEncoder();
      Object2IntMap<VertexFormat> $$1 = new Object2IntOpenHashMap();

      for (gcg.c $$2 : this.r) {
         foc $$3 = $$2.a;
         foc.a $$4 = $$3.c();
         VertexFormat $$5 = $$4.a();
         gxl $$6 = this.t.get($$5);
         if (!$$1.containsKey($$5)) {
            $$1.put($$5, 0);
         }

         ByteBuffer $$7 = $$3.a();
         int $$8 = $$7.remaining();
         int $$9 = $$1.getInt($$5);

         try (GpuBuffer.MappedView $$10 = $$0.mapBuffer($$6.b().slice($$9, $$8), false, true)) {
            MemoryUtil.memCopy($$7, $$10.data());
         }

         $$1.put($$5, $$9 + $$8);
         this.q.add(new gcg.b($$6.b(), $$9 / $$5.getVertexSize(), $$4.d(), $$4.c(), $$2.b, $$2.c, $$2.d));
         $$2.close();
      }
   }

   private void j() {
      Object2IntMap<VertexFormat> $$0 = this.k();
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<VertexFormat> $$1 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<VertexFormat>)var2.next();
         VertexFormat $$2 = (VertexFormat)$$1.getKey();
         int $$3 = $$1.getIntValue();
         gxl $$4 = this.t.get($$2);
         if ($$4 == null || $$4.a() < $$3) {
            if ($$4 != null) {
               $$4.close();
            }

            this.t.put($$2, new gxl(() -> "GUI vertex buffer for " + $$2, 34, $$3));
         }
      }
   }

   private Object2IntMap<VertexFormat> k() {
      Object2IntMap<VertexFormat> $$0 = new Object2IntOpenHashMap();

      for (gcg.c $$1 : this.r) {
         foc.a $$2 = $$1.a.c();
         VertexFormat $$3 = $$2.a();
         if (!$$0.containsKey($$3)) {
            $$0.put($$3, 0);
         }

         $$0.put($$3, $$0.getInt($$3) + $$2.b() * $$3.getVertexSize());
      }

      return $$0;
   }

   private void a(gcg.b $$0, RenderPass $$1, GpuBuffer $$2, VertexFormat.a $$3) {
      RenderPipeline $$4 = $$0.e();
      $$1.setPipeline($$4);
      $$1.setVertexBuffer(0, $$0.a);
      gcd $$5 = $$0.g();
      if ($$5 != null) {
         this.a($$5, $$1);
      } else {
         $$1.disableScissor();
      }

      if ($$0.f.d() != null) {
         $$1.bindSampler("Sampler0", $$0.f.d());
      }

      if ($$0.f.e() != null) {
         $$1.bindSampler("Sampler1", $$0.f.e());
      }

      if ($$0.f.f() != null) {
         $$1.bindSampler("Sampler2", $$0.f.f());
      }

      $$1.setIndexBuffer($$2, $$3);
      $$1.drawIndexed($$0.b, 0, $$0.d, 1);
   }

   private fnz a(RenderPipeline $$0) {
      return new fnz(this.s, $$0.getVertexFormatMode(), $$0.getVertexFormat());
   }

   private boolean a(@Nullable gcd $$0, @Nullable gcd $$1) {
      if ($$0 == $$1) {
         return false;
      } else {
         return $$0 != null ? !$$0.equals($$1) : true;
      }
   }

   private void a(gcd $$0, RenderPass $$1) {
      fni $$2 = fue.R().aP();
      int $$3 = $$2.l();
      int $$4 = $$2.s();
      double $$5 = $$0.d() * $$4;
      double $$6 = $$3 - $$0.c() * $$4;
      double $$7 = $$0.g() * $$4;
      double $$8 = $$0.h() * $$4;
      $$1.enableScissor((int)$$5, (int)$$6, Math.max(0, (int)$$7), Math.max(0, (int)$$8));
   }

   @Override
   public void close() {
      this.s.close();
      if (this.z != null) {
         this.z.close();
      }

      if (this.A != null) {
         this.A.close();
      }

      if (this.B != null) {
         this.B.close();
      }

      if (this.C != null) {
         this.C.close();
      }

      this.y.values().forEach(gcq::close);
      this.v.close();
      this.w.close();

      for (gxl $$0 : this.t.values()) {
         $$0.close();
      }

      this.o.values().forEach(gcq::close);
   }

   static final class a {
      final int a;
      final int b;
      final float c;
      final float d;
      int e;

      a(int $$0, int $$1, float $$2, float $$3, int $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }
   }

   record b(GpuBuffer a, int b, VertexFormat.b c, int d, RenderPipeline e, gch f, @Nullable gcd g) {
   }

   record c(foc a, RenderPipeline b, gch c, @Nullable gcd d) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }
}
