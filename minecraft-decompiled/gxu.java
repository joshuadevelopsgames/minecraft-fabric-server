import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import org.lwjgl.system.MemoryStack;

public class gxu implements AutoCloseable {
   private static final int a = new Std140SizeCalculator().putVec2().get();
   private final String b;
   private final RenderPipeline c;
   private final ame d;
   private final Map<String, GpuBuffer> e = new HashMap<>();
   private final gxl f;
   private final List<gxu.a> g;

   public gxu(RenderPipeline $$0, ame $$1, Map<String, List<gym>> $$2, List<gxu.a> $$3) {
      this.c = $$0;
      this.b = $$0.getLocation().toString();
      this.d = $$1;
      this.g = $$3;

      for (Entry<String, List<gym>> $$4 : $$2.entrySet()) {
         List<gym> $$5 = $$4.getValue();
         if (!$$5.isEmpty()) {
            Std140SizeCalculator $$6 = new Std140SizeCalculator();

            for (gym $$7 : $$5) {
               $$7.a($$6);
            }

            int $$8 = $$6.get();
            MemoryStack $$9 = MemoryStack.stackPush();

            try {
               Std140Builder $$10 = Std140Builder.onStack($$9, $$8);

               for (gym $$11 : $$5) {
                  $$11.a($$10);
               }

               this.e.put($$4.getKey(), RenderSystem.getDevice().createBuffer(() -> this.b + " / " + $$4.getKey(), 128, $$10.get()));
            } catch (Throwable var15) {
               if ($$9 != null) {
                  try {
                     $$9.close();
                  } catch (Throwable var14) {
                     var15.addSuppressed(var14);
                  }
               }

               throw var15;
            }

            if ($$9 != null) {
               $$9.close();
            }
         }
      }

      this.f = new gxl(() -> this.b + " SamplerInfo", 130, ($$3.size() + 1) * a);
   }

   public void a(flv $$0, Map<ame, fnr<fmr>> $$1, GpuBufferSlice $$2) {
      flw $$3 = $$0.a(this.b);

      for (gxu.a $$4 : this.g) {
         $$4.a($$3, $$1);
      }

      fnr<fmr> $$5 = $$1.computeIfPresent(this.d, ($$1x, $$2x) -> $$3.b($$2x));
      if ($$5 == null) {
         throw new IllegalStateException("Missing handle for target " + this.d);
      } else {
         $$3.a(
            () -> {
               fmr $$3x = $$5.get();
               RenderSystem.backupProjectionMatrix();
               RenderSystem.setProjectionMatrix($$2, fle.b);
               CommandEncoder $$4x = RenderSystem.getDevice().createCommandEncoder();
               List<Pair<String, GpuTextureView>> $$5x = this.g.stream().map($$1xx -> Pair.of($$1xx.a(), $$1xx.b($$1))).toList();

               try (GpuBuffer.MappedView $$6 = $$4x.mapBuffer(this.f.b(), false, true)) {
                  Std140Builder $$7 = Std140Builder.intoBuffer($$6.data());
                  $$7.putVec2($$3x.c, $$3x.d);

                  for (Pair<String, GpuTextureView> $$8 : $$5x) {
                     $$7.putVec2(((GpuTextureView)$$8.getSecond()).getWidth(0), ((GpuTextureView)$$8.getSecond()).getHeight(0));
                  }
               }

               GpuBuffer $$9 = RenderSystem.getQuadVertexBuffer();
               RenderSystem.a $$10 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
               GpuBuffer $$11 = $$10.b(6);

               try (RenderPass $$12 = $$4x.createRenderPass(
                     () -> "Post pass " + this.b, $$3x.d(), OptionalInt.empty(), $$3x.h ? $$3x.f() : null, OptionalDouble.empty()
                  )) {
                  $$12.setPipeline(this.c);
                  RenderSystem.bindDefaultUniforms($$12);
                  $$12.setUniform("SamplerInfo", this.f.b());

                  for (Entry<String, GpuBuffer> $$13 : this.e.entrySet()) {
                     $$12.setUniform($$13.getKey(), $$13.getValue());
                  }

                  $$12.setVertexBuffer(0, $$9);
                  $$12.setIndexBuffer($$11, $$10.a());

                  for (Pair<String, GpuTextureView> $$14 : $$5x) {
                     $$12.bindSampler((String)$$14.getFirst() + "Sampler", (GpuTextureView)$$14.getSecond());
                  }

                  $$12.drawIndexed(0, 0, 6, 1);
               }

               this.f.c();
               RenderSystem.restoreProjectionMatrix();

               for (gxu.a $$15 : this.g) {
                  $$15.a($$1);
               }
            }
         );
      }
   }

   @Override
   public void close() {
      for (GpuBuffer $$0 : this.e.values()) {
         $$0.close();
      }

      this.f.close();
   }

   public interface a {
      void a(flw var1, Map<ame, fnr<fmr>> var2);

      default void a(Map<ame, fnr<fmr>> $$0) {
      }

      GpuTextureView b(Map<ame, fnr<fmr>> var1);

      String a();
   }

   public record b(String a, ame b, boolean c, boolean d) implements gxu.a {
      private fnr<fmr> c(Map<ame, fnr<fmr>> $$0) {
         fnr<fmr> $$1 = $$0.get(this.b);
         if ($$1 == null) {
            throw new IllegalStateException("Missing handle for target " + this.b);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(flw $$0, Map<ame, fnr<fmr>> $$1) {
         $$0.a(this.c($$1));
      }

      @Override
      public void a(Map<ame, fnr<fmr>> $$0) {
         if (this.d) {
            this.c($$0).get().a(FilterMode.NEAREST);
         }
      }

      @Override
      public GpuTextureView b(Map<ame, fnr<fmr>> $$0) {
         fnr<fmr> $$1 = this.c($$0);
         fmr $$2 = $$1.get();
         $$2.a(this.d ? FilterMode.LINEAR : FilterMode.NEAREST);
         GpuTextureView $$3 = this.c ? $$2.f() : $$2.d();
         if ($$3 == null) {
            throw new IllegalStateException("Missing " + (this.c ? "depth" : "color") + "texture for target " + this.b);
         } else {
            return $$3;
         }
      }
   }

   public record c(String a, hrc b, int c, int d) implements gxu.a {
      @Override
      public void a(flw $$0, Map<ame, fnr<fmr>> $$1) {
      }

      @Override
      public GpuTextureView b(Map<ame, fnr<fmr>> $$0) {
         return this.b.b();
      }
   }
}
