import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class gww implements AutoCloseable {
   private static final int a = 6;
   private final GpuBuffer b;
   private final gwu c;
   private final ame d;

   public gww(ame $$0) {
      this.d = $$0;
      this.c = new gwu("cubemap", 0.05F, 10.0F);
      this.b = a();
   }

   public void a(fue $$0, float $$1, float $$2) {
      RenderSystem.setProjectionMatrix(this.c.a($$0.aP().k(), $$0.aP().l(), 85.0F), fle.a);
      RenderPipeline $$3 = gxx.aC;
      fmr $$4 = fue.R().h();
      GpuTextureView $$5 = $$4.d();
      GpuTextureView $$6 = $$4.f();
      RenderSystem.a $$7 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$8 = $$7.b(36);
      Matrix4fStack $$9 = RenderSystem.getModelViewStack();
      $$9.pushMatrix();
      $$9.rotationX((float) Math.PI);
      $$9.rotateX($$1 * (float) (Math.PI / 180.0));
      $$9.rotateY($$2 * (float) (Math.PI / 180.0));
      GpuBufferSlice $$10 = RenderSystem.getDynamicUniforms().a(new Matrix4f($$9), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);
      $$9.popMatrix();

      try (RenderPass $$11 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Cubemap", $$5, OptionalInt.empty(), $$6, OptionalDouble.empty())) {
         $$11.setPipeline($$3);
         RenderSystem.bindDefaultUniforms($$11);
         $$11.setVertexBuffer(0, this.b);
         $$11.setIndexBuffer($$8, $$7.a());
         $$11.setUniform("DynamicTransforms", $$10);
         $$11.bindSampler("Sampler0", $$0.ab().b(this.d).b());
         $$11.drawIndexed(0, 0, 36, 1);
      }
   }

   private static GpuBuffer a() {
      GpuBuffer var3;
      try (foa $$0 = foa.a(fob.f.getVertexSize() * 4 * 6)) {
         fnz $$1 = new fnz($$0, VertexFormat.b.h, fob.f);
         $$1.a(-1.0F, -1.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F);
         $$1.a(1.0F, 1.0F, 1.0F);
         $$1.a(1.0F, 1.0F, -1.0F);
         $$1.a(1.0F, -1.0F, -1.0F);
         $$1.a(1.0F, -1.0F, -1.0F);
         $$1.a(1.0F, 1.0F, -1.0F);
         $$1.a(-1.0F, 1.0F, -1.0F);
         $$1.a(-1.0F, -1.0F, -1.0F);
         $$1.a(-1.0F, -1.0F, -1.0F);
         $$1.a(-1.0F, 1.0F, -1.0F);
         $$1.a(-1.0F, 1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, 1.0F);
         $$1.a(-1.0F, -1.0F, -1.0F);
         $$1.a(-1.0F, -1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, 1.0F);
         $$1.a(1.0F, -1.0F, -1.0F);
         $$1.a(-1.0F, 1.0F, 1.0F);
         $$1.a(-1.0F, 1.0F, -1.0F);
         $$1.a(1.0F, 1.0F, -1.0F);
         $$1.a(1.0F, 1.0F, 1.0F);

         try (foc $$2 = $$1.b()) {
            var3 = RenderSystem.getDevice().createBuffer(() -> "Cube map vertex buffer", 32, $$2.a());
         }
      }

      return var3;
   }

   public void a(hru $$0) {
      $$0.a(this.d, (hrc)(new hrd(this.d)));
   }

   @Override
   public void close() {
      this.b.close();
      this.c.close();
   }
}
