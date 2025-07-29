import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class gyq {
   public static final ame a = ame.b("textures/misc/forcefield.png");
   private boolean b = true;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private final GpuBuffer i = RenderSystem.getDevice().createBuffer(() -> "World border vertex buffer", 40, 16 * fob.j.getVertexSize());
   private final RenderSystem.a j = RenderSystem.getSequentialBuffer(VertexFormat.b.h);

   private void a(eft $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6) {
      try (foa $$7 = foa.a(fob.j.getVertexSize() * 4 * 4)) {
         double $$8 = $$0.e();
         double $$9 = $$0.g();
         double $$10 = $$0.f();
         double $$11 = $$0.h();
         double $$12 = Math.max((double)bcb.a($$2 - $$1), $$10);
         double $$13 = Math.min((double)bcb.c($$2 + $$1), $$11);
         float $$14 = (bcb.a($$12) & 1) * 0.5F;
         float $$15 = (float)($$13 - $$12) / 2.0F;
         double $$16 = Math.max((double)bcb.a($$3 - $$1), $$8);
         double $$17 = Math.min((double)bcb.c($$3 + $$1), $$9);
         float $$18 = (bcb.a($$16) & 1) * 0.5F;
         float $$19 = (float)($$17 - $$16) / 2.0F;
         fnz $$20 = new fnz($$7, VertexFormat.b.h, fob.j);
         $$20.a(0.0F, -$$4, (float)($$11 - $$12)).a($$18, $$5);
         $$20.a((float)($$17 - $$16), -$$4, (float)($$11 - $$12)).a($$19 + $$18, $$5);
         $$20.a((float)($$17 - $$16), $$4, (float)($$11 - $$12)).a($$19 + $$18, $$6);
         $$20.a(0.0F, $$4, (float)($$11 - $$12)).a($$18, $$6);
         $$20.a(0.0F, -$$4, 0.0F).a($$14, $$5);
         $$20.a(0.0F, -$$4, (float)($$13 - $$12)).a($$15 + $$14, $$5);
         $$20.a(0.0F, $$4, (float)($$13 - $$12)).a($$15 + $$14, $$6);
         $$20.a(0.0F, $$4, 0.0F).a($$14, $$6);
         $$20.a((float)($$17 - $$16), -$$4, 0.0F).a($$18, $$5);
         $$20.a(0.0F, -$$4, 0.0F).a($$19 + $$18, $$5);
         $$20.a(0.0F, $$4, 0.0F).a($$19 + $$18, $$6);
         $$20.a((float)($$17 - $$16), $$4, 0.0F).a($$18, $$6);
         $$20.a((float)($$9 - $$16), -$$4, (float)($$13 - $$12)).a($$14, $$5);
         $$20.a((float)($$9 - $$16), -$$4, 0.0F).a($$15 + $$14, $$5);
         $$20.a((float)($$9 - $$16), $$4, 0.0F).a($$15 + $$14, $$6);
         $$20.a((float)($$9 - $$16), $$4, (float)($$13 - $$12)).a($$14, $$6);

         try (foc $$21 = $$20.b()) {
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.i.slice(), $$21.a());
         }

         this.e = $$8;
         this.f = $$9;
         this.g = $$10;
         this.h = $$11;
         this.c = $$16;
         this.d = $$12;
         this.b = false;
      }
   }

   public void a(eft $$0, fis $$1, double $$2, double $$3) {
      double $$4 = $$0.e();
      double $$5 = $$0.g();
      double $$6 = $$0.f();
      double $$7 = $$0.h();
      if ((!($$1.d < $$5 - $$2) || !($$1.d > $$4 + $$2) || !($$1.f < $$7 - $$2) || !($$1.f > $$6 + $$2))
         && !($$1.d < $$4 - $$2)
         && !($$1.d > $$5 + $$2)
         && !($$1.f < $$6 - $$2)
         && !($$1.f > $$7 + $$2)) {
         double $$8 = 1.0 - $$0.b($$1.d, $$1.f) / $$2;
         $$8 = Math.pow($$8, 4.0);
         $$8 = bcb.a($$8, 0.0, 1.0);
         double $$9 = $$1.d;
         double $$10 = $$1.f;
         float $$11 = (float)$$3;
         int $$12 = $$0.d().a();
         float $$13 = baj.b($$12) / 255.0F;
         float $$14 = baj.c($$12) / 255.0F;
         float $$15 = baj.d($$12) / 255.0F;
         float $$16 = (float)(ag.c() % 3000L) / 3000.0F;
         float $$17 = (float)(-bcb.e($$1.e * 0.5));
         float $$18 = $$17 + $$11;
         if (this.a($$0)) {
            this.a($$0, $$2, $$10, $$9, $$11, $$18, $$17);
         }

         hru $$19 = fue.R().ab();
         hrc $$20 = $$19.b(a);
         $$20.b(false);
         RenderPipeline $$21 = gxx.ae;
         fmr $$22 = fue.R().h();
         fmr $$23 = fue.R().f.u();
         GpuTextureView $$24;
         GpuTextureView $$25;
         if ($$23 != null) {
            $$24 = $$23.d();
            $$25 = $$23.f();
         } else {
            $$24 = $$22.d();
            $$25 = $$22.f();
         }

         GpuBuffer $$28 = this.j.b(6);
         GpuBufferSlice $$29 = RenderSystem.getDynamicUniforms()
            .a(
               RenderSystem.getModelViewMatrix(),
               new Vector4f($$13, $$14, $$15, (float)$$8),
               new Vector3f((float)(this.c - $$9), (float)(-$$1.e), (float)(this.d - $$10)),
               new Matrix4f().translation($$16, $$16, 0.0F),
               0.0F
            );

         try (RenderPass $$30 = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "World border", $$24, OptionalInt.empty(), $$25, OptionalDouble.empty())) {
            $$30.setPipeline($$21);
            RenderSystem.bindDefaultUniforms($$30);
            $$30.setUniform("DynamicTransforms", $$29);
            $$30.setIndexBuffer($$28, this.j.a());
            $$30.bindSampler("Sampler0", $$20.b());
            $$30.setVertexBuffer(0, this.i);
            ArrayList<RenderPass.a<gyq>> $$31 = new ArrayList<>();

            for (eft.b $$32 : $$0.c($$9, $$10)) {
               if ($$32.b() < $$2) {
                  int $$33 = $$32.a().e();
                  $$31.add(new RenderPass.a<>(0, this.i, $$28, this.j.a(), 6 * $$33, 6));
               }
            }

            $$30.drawMultipleIndexed($$31, null, null, Collections.emptyList(), this);
         }
      }
   }

   public void a() {
      this.b = true;
   }

   private boolean a(eft $$0) {
      return this.b || $$0.e() != this.e || $$0.f() != this.g || $$0.g() != this.f || $$0.h() != this.h;
   }
}
