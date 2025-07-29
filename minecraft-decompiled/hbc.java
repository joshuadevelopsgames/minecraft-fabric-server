import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.EnumMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public record hbc(EnumMap<hba, List<RenderPass.a<GpuBufferSlice[]>>> a, int b, GpuBufferSlice[] c) {
   public void a(hbb $$0) {
      RenderSystem.a $$1 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$2 = this.b == 0 ? null : $$1.b(this.b);
      VertexFormat.a $$3 = this.b == 0 ? null : $$1.a();
      hba[] $$4 = $$0.b();
      fue $$5 = fue.R();
      boolean $$6 = false;
      fmr $$7 = $$0.c();

      try (RenderPass $$8 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Section layers for " + $$0.a(), $$7.d(), OptionalInt.empty(), $$7.f(), OptionalDouble.empty())) {
         RenderSystem.bindDefaultUniforms($$8);
         $$8.bindSampler("Sampler2", $$5.j.m().a());

         for (hba $$9 : $$4) {
            List<RenderPass.a<GpuBufferSlice[]>> $$10 = this.a.get($$9);
            if (!$$10.isEmpty()) {
               if ($$9 == hba.d) {
                  $$10 = $$10.reversed();
               }

               $$8.setPipeline($$6 ? gxx.c : $$9.a());
               $$8.bindSampler("Sampler0", $$9.e());
               $$8.drawMultipleIndexed($$10, $$2, $$3, List.of("DynamicTransforms"), this.c);
            }
         }
      }
   }
}
