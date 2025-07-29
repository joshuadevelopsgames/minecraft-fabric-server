import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.slf4j.Logger;

public class gwv extends axt<Optional<gwv.b>> implements AutoCloseable {
   private static final int a = 16;
   private static final int b = 32;
   private static final int c = 128;
   private static final float d = 12.0F;
   private static final int e = new Std140SizeCalculator().putVec4().putVec3().putVec3().get();
   private static final Logger f = LogUtils.getLogger();
   private static final ame g = ame.b("textures/environment/clouds.png");
   private static final float h = 0.6F;
   private static final long i = 0L;
   private static final int j = 4;
   private static final int k = 3;
   private static final int l = 2;
   private static final int m = 1;
   private static final int n = 0;
   private boolean o = true;
   private int p = Integer.MIN_VALUE;
   private int q = Integer.MIN_VALUE;
   private gwv.a r = gwv.a.b;
   @Nullable
   private ftq s;
   @Nullable
   private gwv.b t;
   private int u = 0;
   private final RenderSystem.a v = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
   private final gxl w = new gxl(() -> "Cloud UBO", 130, e);
   @Nullable
   private gxl x;

   protected Optional<gwv.b> a(axo $$0, btt $$1) {
      try {
         Optional var20;
         try (
            InputStream $$2 = $$0.open(g);
            fnf $$3 = fnf.a($$2);
         ) {
            int $$4 = $$3.a();
            int $$5 = $$3.b();
            long[] $$6 = new long[$$4 * $$5];

            for (int $$7 = 0; $$7 < $$5; $$7++) {
               for (int $$8 = 0; $$8 < $$4; $$8++) {
                  int $$9 = $$3.a($$8, $$7);
                  if (b($$9)) {
                     $$6[$$8 + $$7 * $$4] = 0L;
                  } else {
                     boolean $$10 = b($$3.a($$8, Math.floorMod($$7 - 1, $$5)));
                     boolean $$11 = b($$3.a(Math.floorMod($$8 + 1, $$5), $$7));
                     boolean $$12 = b($$3.a($$8, Math.floorMod($$7 + 1, $$5)));
                     boolean $$13 = b($$3.a(Math.floorMod($$8 - 1, $$5), $$7));
                     $$6[$$8 + $$7 * $$4] = a($$9, $$10, $$11, $$12, $$13);
                  }
               }
            }

            var20 = Optional.of(new gwv.b($$6, $$4, $$5));
         }

         return var20;
      } catch (IOException var19) {
         f.error("Failed to load cloud texture", var19);
         return Optional.empty();
      }
   }

   private static int a(int $$0) {
      int $$1 = 4;
      int $$2 = ($$0 + 1) * 2 * ($$0 + 1) * 2 / 2;
      int $$3 = $$2 * 4 + 54;
      return $$3 * 3;
   }

   protected void a(Optional<gwv.b> $$0, axo $$1, btt $$2) {
      this.t = $$0.orElse(null);
      this.o = true;
   }

   private static boolean b(int $$0) {
      return baj.a($$0) < 10;
   }

   private static long a(int $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
      return (long)$$0 << 4 | ($$1 ? 1 : 0) << 3 | ($$2 ? 1 : 0) << 2 | ($$3 ? 1 : 0) << 1 | ($$4 ? 1 : 0) << 0;
   }

   private static boolean a(long $$0) {
      return ($$0 >> 3 & 1L) != 0L;
   }

   private static boolean b(long $$0) {
      return ($$0 >> 2 & 1L) != 0L;
   }

   private static boolean c(long $$0) {
      return ($$0 >> 1 & 1L) != 0L;
   }

   private static boolean d(long $$0) {
      return ($$0 >> 0 & 1L) != 0L;
   }

   public void a(int $$0, ftq $$1, float $$2, fis $$3, float $$4) {
      if (this.t != null) {
         int $$5 = Math.min(fue.R().n.k().c(), 128) * 16;
         int $$6 = bcb.f($$5 / 12.0F);
         int $$7 = a($$6);
         if (this.x == null || this.x.b().size() != $$7) {
            if (this.x != null) {
               this.x.close();
            }

            this.x = new gxl(() -> "Cloud UTB", 258, $$7);
         }

         float $$8 = (float)($$2 - $$3.e);
         float $$9 = $$8 + 4.0F;
         gwv.a $$10;
         if ($$9 < 0.0F) {
            $$10 = gwv.a.a;
         } else if ($$8 > 0.0F) {
            $$10 = gwv.a.c;
         } else {
            $$10 = gwv.a.b;
         }

         double $$13 = $$3.d + $$4 * 0.030000001F;
         double $$14 = $$3.f + 3.96F;
         double $$15 = this.t.b * 12.0;
         double $$16 = this.t.c * 12.0;
         $$13 -= bcb.a($$13 / $$15) * $$15;
         $$14 -= bcb.a($$14 / $$16) * $$16;
         int $$17 = bcb.a($$13 / 12.0);
         int $$18 = bcb.a($$14 / 12.0);
         float $$19 = (float)($$13 - $$17 * 12.0F);
         float $$20 = (float)($$14 - $$18 * 12.0F);
         boolean $$21 = $$1 == ftq.c;
         RenderPipeline $$22 = $$21 ? gxx.U : gxx.T;
         if (this.o || $$17 != this.p || $$18 != this.q || $$10 != this.r || $$1 != this.s) {
            this.o = false;
            this.p = $$17;
            this.q = $$18;
            this.r = $$10;
            this.s = $$1;
            this.x.c();

            try (GpuBuffer.MappedView $$23 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.x.b(), false, true)) {
               this.a($$10, $$23.data(), $$17, $$18, $$21, $$6);
               this.u = $$23.data().position() / 3;
            }
         }

         if (this.u != 0) {
            try (GpuBuffer.MappedView $$24 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.w.b(), false, true)) {
               Std140Builder.intoBuffer($$24.data()).putVec4(baj.j($$0), baj.k($$0), baj.l($$0), 1.0F).putVec3(-$$19, $$8, -$$20).putVec3(12.0F, 4.0F, 12.0F);
            }

            GpuBufferSlice $$25 = RenderSystem.getDynamicUniforms()
               .a(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);
            fmr $$26 = fue.R().h();
            fmr $$27 = fue.R().f.v();
            RenderSystem.a $$28 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
            GpuBuffer $$29 = $$28.b(6 * this.u);
            GpuTextureView $$30;
            GpuTextureView $$31;
            if ($$27 != null) {
               $$30 = $$27.d();
               $$31 = $$27.f();
            } else {
               $$30 = $$26.d();
               $$31 = $$26.f();
            }

            try (RenderPass $$34 = RenderSystem.getDevice()
                  .createCommandEncoder()
                  .createRenderPass(() -> "Clouds", $$30, OptionalInt.empty(), $$31, OptionalDouble.empty())) {
               $$34.setPipeline($$22);
               RenderSystem.bindDefaultUniforms($$34);
               $$34.setUniform("DynamicTransforms", $$25);
               $$34.setIndexBuffer($$29, $$28.a());
               $$34.setVertexBuffer(0, RenderSystem.getQuadVertexBuffer());
               $$34.setUniform("CloudInfo", this.w.b());
               $$34.setUniform("CloudFaces", this.x.b());
               $$34.setPipeline($$22);
               $$34.drawIndexed(0, 0, 6 * this.u, 1);
            }
         }
      }
   }

   private void a(gwv.a $$0, ByteBuffer $$1, int $$2, int $$3, boolean $$4, int $$5) {
      if (this.t != null) {
         long[] $$6 = this.t.a;
         int $$7 = this.t.b;
         int $$8 = this.t.c;

         for (int $$9 = 0; $$9 <= 2 * $$5; $$9++) {
            for (int $$10 = -$$9; $$10 <= $$9; $$10++) {
               int $$11 = $$9 - Math.abs($$10);
               if ($$11 >= 0 && $$11 <= $$5 && $$10 * $$10 + $$11 * $$11 <= $$5 * $$5) {
                  if ($$11 != 0) {
                     this.a($$0, $$1, $$2, $$3, $$4, $$10, $$7, -$$11, $$8, $$6);
                  }

                  this.a($$0, $$1, $$2, $$3, $$4, $$10, $$7, $$11, $$8, $$6);
               }
            }
         }
      }
   }

   private void a(gwv.a $$0, ByteBuffer $$1, int $$2, int $$3, boolean $$4, int $$5, int $$6, int $$7, int $$8, long[] $$9) {
      int $$10 = Math.floorMod($$2 + $$5, $$6);
      int $$11 = Math.floorMod($$3 + $$7, $$8);
      long $$12 = $$9[$$10 + $$11 * $$6];
      if ($$12 != 0L) {
         if ($$4) {
            this.a($$0, $$1, $$5, $$7, $$12);
         } else {
            this.a($$1, $$5, $$7);
         }
      }
   }

   private void a(ByteBuffer $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, jh.a, 32);
   }

   private void a(ByteBuffer $$0, int $$1, int $$2, jh $$3, int $$4) {
      int $$5 = $$3.d() | $$4;
      $$5 |= ($$1 & 1) << 7;
      $$5 |= ($$2 & 1) << 6;
      $$0.put((byte)($$1 >> 1)).put((byte)($$2 >> 1)).put((byte)$$5);
   }

   private void a(gwv.a $$0, ByteBuffer $$1, int $$2, int $$3, long $$4) {
      if ($$0 != gwv.a.c) {
         this.a($$1, $$2, $$3, jh.b, 0);
      }

      if ($$0 != gwv.a.a) {
         this.a($$1, $$2, $$3, jh.a, 0);
      }

      if (a($$4) && $$3 > 0) {
         this.a($$1, $$2, $$3, jh.c, 0);
      }

      if (c($$4) && $$3 < 0) {
         this.a($$1, $$2, $$3, jh.d, 0);
      }

      if (d($$4) && $$2 > 0) {
         this.a($$1, $$2, $$3, jh.e, 0);
      }

      if (b($$4) && $$2 < 0) {
         this.a($$1, $$2, $$3, jh.f, 0);
      }

      boolean $$5 = Math.abs($$2) <= 1 && Math.abs($$3) <= 1;
      if ($$5) {
         for (jh $$6 : jh.values()) {
            this.a($$1, $$2, $$3, $$6, 16);
         }
      }
   }

   public void a() {
      this.o = true;
   }

   public void b() {
      this.w.c();
   }

   @Override
   public void close() {
      this.w.close();
      if (this.x != null) {
         this.x.close();
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   public record b(long[] a, int b, int c) {
   }
}
