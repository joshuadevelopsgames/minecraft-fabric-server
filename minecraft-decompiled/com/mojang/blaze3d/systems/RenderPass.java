package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

@fkz
public interface RenderPass extends AutoCloseable {
   void pushDebugGroup(Supplier<String> var1);

   void popDebugGroup();

   void setPipeline(RenderPipeline var1);

   void bindSampler(String var1, @Nullable GpuTextureView var2);

   void setUniform(String var1, GpuBuffer var2);

   void setUniform(String var1, GpuBufferSlice var2);

   void enableScissor(int var1, int var2, int var3, int var4);

   void disableScissor();

   void setVertexBuffer(int var1, GpuBuffer var2);

   void setIndexBuffer(GpuBuffer var1, VertexFormat.a var2);

   void drawIndexed(int var1, int var2, int var3, int var4);

   <T> void drawMultipleIndexed(Collection<RenderPass.a<T>> var1, @Nullable GpuBuffer var2, @Nullable VertexFormat.a var3, Collection<String> var4, T var5);

   void draw(int var1, int var2);

   @Override
   void close();

   public record a<T>(int a, GpuBuffer b, @Nullable GpuBuffer c, @Nullable VertexFormat.a d, int e, int f, @Nullable BiConsumer<T, RenderPass.b> g) {
      public a(int $$0, GpuBuffer $$1, GpuBuffer $$2, VertexFormat.a $$3, int $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, null);
      }
   }

   public interface b {
      void upload(String var1, GpuBufferSlice var2);
   }
}
