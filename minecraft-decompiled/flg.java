import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.jtracy.TracyClient;
import java.util.OptionalInt;

public class flg implements AutoCloseable {
   private static final int a = 320;
   private static final int b = 180;
   private static final int c = 4;
   private int d;
   private int e;
   private int f;
   private int g;
   private GpuTexture h;
   private GpuTextureView i;
   private GpuBuffer j;
   private int k;
   private boolean l;
   private flg.a m = flg.a.a;

   public flg() {
      this.f = 320;
      this.g = 180;
      GpuDevice $$0 = RenderSystem.getDevice();
      this.h = $$0.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, this.f, this.g, 1, 1);
      this.i = $$0.createTextureView(this.h);
      this.j = $$0.createBuffer(() -> "Tracy Frame Capture buffer", 9, this.f * this.g * 4);
   }

   private void a(int $$0, int $$1) {
      float $$2 = (float)$$0 / $$1;
      if ($$0 > 320) {
         $$0 = 320;
         $$1 = (int)(320.0F / $$2);
      }

      if ($$1 > 180) {
         $$0 = (int)(180.0F * $$2);
         $$1 = 180;
      }

      $$0 = $$0 / 4 * 4;
      $$1 = $$1 / 4 * 4;
      if (this.f != $$0 || this.g != $$1) {
         this.f = $$0;
         this.g = $$1;
         GpuDevice $$3 = RenderSystem.getDevice();
         this.h.close();
         this.h = $$3.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, $$0, $$1, 1, 1);
         this.i.close();
         this.i = $$3.createTextureView(this.h);
         this.j.close();
         this.j = $$3.createBuffer(() -> "Tracy Frame Capture buffer", 9, $$0 * $$1 * 4);
      }
   }

   public void a(fmr $$0) {
      if (this.m == flg.a.a && !this.l && $$0.c() != null) {
         this.l = true;
         if ($$0.c != this.d || $$0.d != this.e) {
            this.d = $$0.c;
            this.e = $$0.d;
            this.a(this.d, this.e);
         }

         this.m = flg.a.b;
         CommandEncoder $$1 = RenderSystem.getDevice().createCommandEncoder();
         RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
         GpuBuffer $$3 = $$2.b(6);

         try (RenderPass $$4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Tracy blit", this.i, OptionalInt.empty())) {
            $$4.setPipeline(gxx.aB);
            $$4.setVertexBuffer(0, RenderSystem.getQuadVertexBuffer());
            $$4.setIndexBuffer($$3, $$2.a());
            $$4.bindSampler("InSampler", $$0.d());
            $$4.drawIndexed(0, 0, 6, 1);
         }

         $$1.copyTextureToBuffer(this.h, this.j, 0, () -> this.m = flg.a.c, 0);
         this.k = 0;
      }
   }

   public void a() {
      if (this.m == flg.a.c) {
         this.m = flg.a.a;

         try (GpuBuffer.MappedView $$0 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.j, true, false)) {
            TracyClient.frameImage($$0.data(), this.f, this.g, this.k, true);
         }
      }
   }

   public void b() {
      this.k++;
      this.l = false;
      TracyClient.markFrame();
   }

   @Override
   public void close() {
      this.h.close();
      this.i.close();
      this.j.close();
   }

   static enum a {
      a,
      b,
      c;
   }
}
