import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmh implements RenderPass {
   protected static final int a = 1;
   public static final boolean b = ac.aZ;
   private final fmb k;
   private final boolean l;
   private boolean m;
   @Nullable
   protected fmi c;
   protected final GpuBuffer[] d = new GpuBuffer[1];
   @Nullable
   protected GpuBuffer e;
   protected VertexFormat.a f = VertexFormat.a.b;
   private final fnv n = new fnv();
   protected final HashMap<String, GpuBufferSlice> g = new HashMap<>();
   protected final HashMap<String, GpuTextureView> h = new HashMap<>();
   protected final Set<String> i = new HashSet<>();
   protected int j;

   public fmh(fmb $$0, boolean $$1) {
      this.k = $$0;
      this.l = $$1;
   }

   public boolean a() {
      return this.l;
   }

   @Override
   public void pushDebugGroup(Supplier<String> $$0) {
      if (this.m) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.j++;
         this.k.b().a().a($$0);
      }
   }

   @Override
   public void popDebugGroup() {
      if (this.m) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else if (this.j == 0) {
         throw new IllegalStateException("Can't pop more debug groups than was pushed!");
      } else {
         this.j--;
         this.k.b().a().a();
      }
   }

   @Override
   public void setPipeline(RenderPipeline $$0) {
      if (this.c == null || this.c.a() != $$0) {
         this.i.addAll(this.g.keySet());
         this.i.addAll(this.h.keySet());
      }

      this.c = this.k.b().a($$0);
   }

   @Override
   public void bindSampler(String $$0, @Nullable GpuTextureView $$1) {
      if ($$1 == null) {
         this.h.remove($$0);
      } else {
         this.h.put($$0, $$1);
      }

      this.i.add($$0);
   }

   @Override
   public void setUniform(String $$0, GpuBuffer $$1) {
      this.g.put($$0, $$1.slice());
      this.i.add($$0);
   }

   @Override
   public void setUniform(String $$0, GpuBufferSlice $$1) {
      int $$2 = this.k.b().getUniformOffsetAlignment();
      if ($$1.offset() % $$2 > 0) {
         throw new IllegalArgumentException("Uniform buffer offset must be aligned to " + $$2);
      } else {
         this.g.put($$0, $$1);
         this.i.add($$0);
      }
   }

   @Override
   public void enableScissor(int $$0, int $$1, int $$2, int $$3) {
      this.n.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void disableScissor() {
      this.n.a();
   }

   public boolean b() {
      return this.n.b();
   }

   public int c() {
      return this.n.c();
   }

   public int d() {
      return this.n.d();
   }

   public int e() {
      return this.n.e();
   }

   public int f() {
      return this.n.f();
   }

   @Override
   public void setVertexBuffer(int $$0, GpuBuffer $$1) {
      if ($$0 >= 0 && $$0 < 1) {
         this.d[$$0] = $$1;
      } else {
         throw new IllegalArgumentException("Vertex buffer slot is out of range: " + $$0);
      }
   }

   @Override
   public void setIndexBuffer(@Nullable GpuBuffer $$0, VertexFormat.a $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void drawIndexed(int $$0, int $$1, int $$2, int $$3) {
      if (this.m) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.k.a(this, $$0, $$1, $$2, this.f, $$3);
      }
   }

   @Override
   public <T> void drawMultipleIndexed(Collection<RenderPass.a<T>> $$0, @Nullable GpuBuffer $$1, @Nullable VertexFormat.a $$2, Collection<String> $$3, T $$4) {
      if (this.m) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.k.a(this, $$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void draw(int $$0, int $$1) {
      if (this.m) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.k.a(this, $$0, 0, $$1, null, 1);
      }
   }

   @Override
   public void close() {
      if (!this.m) {
         if (this.j > 0) {
            throw new IllegalStateException("Render pass had debug groups left open!");
         }

         this.m = true;
         this.k.a();
      }
   }
}
