import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class gyj implements AutoCloseable {
   private static final ame b = ame.b("textures/environment/sun.png");
   private static final ame c = ame.b("textures/environment/moon_phases.png");
   public static final ame a = ame.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private static final int e = 10;
   private static final int f = 1500;
   private static final int g = 6;
   private final GpuBuffer h;
   private final RenderSystem.a i = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
   private final GpuBuffer j;
   private final GpuBuffer k;
   private final GpuBuffer l;
   private int m;

   public gyj() {
      this.h = this.c();
      this.l = d();

      try (foa $$0 = foa.a(10 * fob.f.getVertexSize())) {
         fnz $$1 = new fnz($$0, VertexFormat.b.g, fob.f);
         this.a($$1, 16.0F);

         try (foc $$2 = $$1.b()) {
            this.j = RenderSystem.getDevice().createBuffer(() -> "Top sky vertex buffer", 32, $$2.a());
         }

         $$1 = new fnz($$0, VertexFormat.b.g, fob.f);
         this.a($$1, -16.0F);

         try (foc $$3 = $$1.b()) {
            this.k = RenderSystem.getDevice().createBuffer(() -> "Bottom sky vertex buffer", 32, $$3.a());
         }
      }
   }

   private GpuBuffer c() {
      bck $$0 = bck.a(10842L);
      float $$1 = 100.0F;

      GpuBuffer var19;
      try (foa $$2 = foa.a(fob.f.getVertexSize() * 1500 * 4)) {
         fnz $$3 = new fnz($$2, VertexFormat.b.h, fob.f);

         for (int $$4 = 0; $$4 < 1500; $$4++) {
            float $$5 = $$0.i() * 2.0F - 1.0F;
            float $$6 = $$0.i() * 2.0F - 1.0F;
            float $$7 = $$0.i() * 2.0F - 1.0F;
            float $$8 = 0.15F + $$0.i() * 0.1F;
            float $$9 = bcb.k($$5, $$6, $$7);
            if (!($$9 <= 0.010000001F) && !($$9 >= 1.0F)) {
               Vector3f $$10 = new Vector3f($$5, $$6, $$7).normalize(100.0F);
               float $$11 = (float)($$0.j() * (float) Math.PI * 2.0);
               Matrix3f $$12 = new Matrix3f().rotateTowards(new Vector3f($$10).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-$$11);
               $$3.a(new Vector3f($$8, -$$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f($$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, -$$8, 0.0F).mul($$12).add($$10));
            }
         }

         try (foc $$13 = $$3.b()) {
            this.m = $$13.c().c();
            var19 = RenderSystem.getDevice().createBuffer(() -> "Stars vertex buffer", 40, $$13.a());
         }
      }

      return var19;
   }

   private void a(fog $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      $$0.a(0.0F, $$1, 0.0F);

      for (int $$3 = -180; $$3 <= 180; $$3 += 45) {
         $$0.a($$2 * bcb.b($$3 * (float) (Math.PI / 180.0)), $$1, 512.0F * bcb.a($$3 * (float) (Math.PI / 180.0)));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      GpuBufferSlice $$3 = RenderSystem.getDynamicUniforms()
         .a(RenderSystem.getModelViewMatrix(), new Vector4f($$0, $$1, $$2, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);
      GpuTextureView $$4 = fue.R().h().d();
      GpuTextureView $$5 = fue.R().h().f();

      try (RenderPass $$6 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Sky disc", $$4, OptionalInt.empty(), $$5, OptionalDouble.empty())) {
         $$6.setPipeline(gxx.aj);
         RenderSystem.bindDefaultUniforms($$6);
         $$6.setUniform("DynamicTransforms", $$3);
         $$6.setVertexBuffer(0, this.j);
         $$6.draw(0, 10);
      }
   }

   public void a() {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.translate(0.0F, 12.0F, 0.0F);
      GpuBufferSlice $$1 = RenderSystem.getDynamicUniforms().a($$0, new Vector4f(0.0F, 0.0F, 0.0F, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);
      GpuTextureView $$2 = fue.R().h().d();
      GpuTextureView $$3 = fue.R().h().f();

      try (RenderPass $$4 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Sky dark", $$2, OptionalInt.empty(), $$3, OptionalDouble.empty())) {
         $$4.setPipeline(gxx.aj);
         RenderSystem.bindDefaultUniforms($$4);
         $$4.setUniform("DynamicTransforms", $$1);
         $$4.setVertexBuffer(0, this.k);
         $$4.draw(0, 10);
      }

      $$0.popMatrix();
   }

   public void a(fod $$0, gxn.a $$1, float $$2, int $$3, float $$4, float $$5) {
      $$0.a();
      $$0.a(a.d.rotationDegrees(-90.0F));
      $$0.a(a.b.rotationDegrees($$2 * 360.0F));
      this.a($$4, $$1, $$0);
      this.a($$3, $$4, $$1, $$0);
      $$1.b();
      if ($$5 > 0.0F) {
         this.a($$5, $$0);
      }

      $$0.b();
   }

   private void a(float $$0, gxn $$1, fod $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      fog $$5 = $$1.getBuffer(gxz.C(b));
      int $$6 = baj.a($$0);
      Matrix4f $$7 = $$2.c().a();
      $$5.a($$7, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F).a($$6);
      $$5.a($$7, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F).a($$6);
   }

   private void a(int $$0, float $$1, gxn $$2, fod $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = ($$5 + 0) / 4.0F;
      float $$8 = ($$6 + 0) / 2.0F;
      float $$9 = ($$5 + 1) / 4.0F;
      float $$10 = ($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      fog $$12 = $$2.getBuffer(gxz.C(c));
      int $$13 = baj.a($$1);
      Matrix4f $$14 = $$3.c().a();
      $$12.a($$14, -20.0F, -100.0F, 20.0F).a($$9, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, 20.0F).a($$7, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, -20.0F).a($$7, $$8).a($$13);
      $$12.a($$14, -20.0F, -100.0F, -20.0F).a($$9, $$8).a($$13);
   }

   private void a(float $$0, fod $$1) {
      Matrix4fStack $$2 = RenderSystem.getModelViewStack();
      $$2.pushMatrix();
      $$2.mul($$1.c().a());
      RenderPipeline $$3 = gxx.am;
      GpuTextureView $$4 = fue.R().h().d();
      GpuTextureView $$5 = fue.R().h().f();
      GpuBuffer $$6 = this.i.b(this.m);
      GpuBufferSlice $$7 = RenderSystem.getDynamicUniforms().a($$2, new Vector4f($$0, $$0, $$0, $$0), new Vector3f(), new Matrix4f(), 0.0F);

      try (RenderPass $$8 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Stars", $$4, OptionalInt.empty(), $$5, OptionalDouble.empty())) {
         $$8.setPipeline($$3);
         RenderSystem.bindDefaultUniforms($$8);
         $$8.setUniform("DynamicTransforms", $$7);
         $$8.setVertexBuffer(0, this.h);
         $$8.setIndexBuffer($$6, this.i.a());
         $$8.drawIndexed(0, 0, this.m, 1);
      }

      $$2.popMatrix();
   }

   public void a(fod $$0, gxn.a $$1, float $$2, int $$3) {
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = bcb.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      fog $$6 = $$1.getBuffer(gxz.D());
      float $$7 = baj.i($$3);
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = baj.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = $$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = bcb.a($$11);
         float $$13 = bcb.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      $$0.b();
   }

   private static GpuBuffer d() {
      GpuBuffer var10;
      try (foa $$0 = foa.a(24 * fob.k.getVertexSize())) {
         fnz $$1 = new fnz($$0, VertexFormat.b.h, fob.k);

         for (int $$2 = 0; $$2 < 6; $$2++) {
            Matrix4f $$3 = new Matrix4f();
            switch ($$2) {
               case 1:
                  $$3.rotationX((float) (Math.PI / 2));
                  break;
               case 2:
                  $$3.rotationX((float) (-Math.PI / 2));
                  break;
               case 3:
                  $$3.rotationX((float) Math.PI);
                  break;
               case 4:
                  $$3.rotationZ((float) (Math.PI / 2));
                  break;
               case 5:
                  $$3.rotationZ((float) (-Math.PI / 2));
            }

            $$1.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
            $$1.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         }

         try (foc $$4 = $$1.b()) {
            var10 = RenderSystem.getDevice().createBuffer(() -> "End sky vertex buffer", 40, $$4.a());
         }
      }

      return var10;
   }

   public void b() {
      hru $$0 = fue.R().ab();
      hrc $$1 = $$0.b(a);
      $$1.b(false);
      RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$3 = $$2.b(36);
      GpuTextureView $$4 = fue.R().h().d();
      GpuTextureView $$5 = fue.R().h().f();
      GpuBufferSlice $$6 = RenderSystem.getDynamicUniforms()
         .a(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f(), 0.0F);

      try (RenderPass $$7 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "End sky", $$4, OptionalInt.empty(), $$5, OptionalDouble.empty())) {
         $$7.setPipeline(gxx.ak);
         RenderSystem.bindDefaultUniforms($$7);
         $$7.setUniform("DynamicTransforms", $$6);
         $$7.bindSampler("Sampler0", $$1.b());
         $$7.setVertexBuffer(0, this.l);
         $$7.setIndexBuffer($$3, $$2.a());
         $$7.drawIndexed(0, 0, 36, 1);
      }
   }

   @Override
   public void close() {
      this.h.close();
      this.j.close();
      this.k.close();
      this.l.close();
   }
}
