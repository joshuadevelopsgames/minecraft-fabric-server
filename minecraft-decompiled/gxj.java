import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalInt;
import org.joml.Vector3f;

public class gxj implements AutoCloseable {
   public static final int a = 15728880;
   public static final int b = 15728640;
   public static final int c = 240;
   private static final int d = 16;
   private static final int e = new Std140SizeCalculator()
      .putFloat()
      .putFloat()
      .putFloat()
      .putInt()
      .putFloat()
      .putFloat()
      .putFloat()
      .putFloat()
      .putVec3()
      .get();
   private final GpuTexture f;
   private final GpuTextureView g;
   private boolean h;
   private float i;
   private final gxb j;
   private final fue k;
   private final gxl l;

   public gxj(gxb $$0, fue $$1) {
      this.j = $$0;
      this.k = $$1;
      GpuDevice $$2 = RenderSystem.getDevice();
      this.f = $$2.createTexture("Light Texture", 12, TextureFormat.RGBA8, 16, 16, 1, 1);
      this.f.setTextureFilter(FilterMode.LINEAR, false);
      this.g = $$2.createTextureView(this.f);
      $$2.createCommandEncoder().clearColorTexture(this.f, -1);
      this.l = new gxl(() -> "Lightmap UBO", 130, e);
   }

   public GpuTextureView a() {
      return this.g;
   }

   @Override
   public void close() {
      this.f.close();
      this.g.close();
      this.l.close();
   }

   public void b() {
      this.i = this.i + (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
      this.i *= 0.9F;
      this.h = true;
   }

   public void c() {
      RenderSystem.setShaderTexture(2, null);
   }

   public void d() {
      RenderSystem.setShaderTexture(2, this.g);
   }

   private float a(cam $$0, float $$1, float $$2) {
      float $$3 = 0.45F * $$1;
      return Math.max(0.0F, bcb.b(($$0.as - $$2) * (float) Math.PI * 0.025F) * $$3);
   }

   public void a(float $$0) {
      if (this.h) {
         this.h = false;
         btt $$1 = bts.a();
         $$1.a("lightTex");
         grk $$2 = this.k.s;
         if ($$2 != null) {
            float $$3 = $$2.g(1.0F);
            float $$4;
            if ($$2.k() > 0) {
               $$4 = 1.0F;
            } else {
               $$4 = $$3 * 0.95F + 0.05F;
            }

            float $$6 = this.k.n.ap().c().floatValue();
            float $$7 = this.k.t.a(bys.G, $$0) * $$6;
            float $$8 = this.a(this.k.t, $$7, $$0) * $$6;
            float $$9 = this.k.t.E();
            float $$10;
            if (this.k.t.d(bys.p)) {
               $$10 = gxb.a(this.k.t, $$0);
            } else if ($$9 > 0.0F && this.k.t.d(bys.C)) {
               $$10 = $$9;
            } else {
               $$10 = 0.0F;
            }

            Vector3f $$13 = new Vector3f($$3, $$3, 1.0F).lerp(new Vector3f(1.0F, 1.0F, 1.0F), 0.35F);
            float $$14 = this.i + 1.5F;
            float $$15 = $$2.G_().s();
            boolean $$16 = $$2.d().b();
            float $$17 = this.k.n.at().c().floatValue();
            RenderSystem.a $$18 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
            GpuBuffer $$19 = $$18.b(6);
            CommandEncoder $$20 = RenderSystem.getDevice().createCommandEncoder();

            try (GpuBuffer.MappedView $$21 = $$20.mapBuffer(this.l.b(), false, true)) {
               Std140Builder.intoBuffer($$21.data())
                  .putFloat($$15)
                  .putFloat($$4)
                  .putFloat($$14)
                  .putInt($$16 ? 1 : 0)
                  .putFloat($$10)
                  .putFloat($$8)
                  .putFloat(this.j.c($$0))
                  .putFloat(Math.max(0.0F, $$17 - $$7))
                  .putVec3($$13);
            }

            try (RenderPass $$22 = $$20.createRenderPass(() -> "Update light", this.g, OptionalInt.empty())) {
               $$22.setPipeline(gxx.aF);
               RenderSystem.bindDefaultUniforms($$22);
               $$22.setUniform("LightmapInfo", this.l.b());
               $$22.setVertexBuffer(0, RenderSystem.getQuadVertexBuffer());
               $$22.setIndexBuffer($$19, $$18.a());
               $$22.drawIndexed(0, 0, 6, 1);
            }

            this.l.c();
            $$1.c();
         }
      }
   }

   public static float a(ehy $$0, int $$1) {
      return a($$0.s(), $$1);
   }

   public static float a(float $$0, int $$1) {
      float $$2 = $$1 / 15.0F;
      float $$3 = $$2 / (4.0F - 3.0F * $$2);
      return bcb.h($$0, $$3, 1.0F);
   }

   public static int a(int $$0, int $$1) {
      return $$0 << 4 | $$1 << 20;
   }

   public static int a(int $$0) {
      return $$0 >>> 4 & 15;
   }

   public static int b(int $$0) {
      return $$0 >>> 20 & 15;
   }

   public static int b(int $$0, int $$1) {
      if ($$1 == 0) {
         return $$0;
      } else {
         int $$2 = Math.max(b($$0), $$1);
         int $$3 = Math.max(a($$0), $$1);
         return a($$3, $$2);
      }
   }
}
