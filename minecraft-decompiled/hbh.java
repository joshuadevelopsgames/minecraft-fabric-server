import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.vertex.VertexFormat;
import javax.annotation.Nullable;

public final class hbh implements AutoCloseable {
   private GpuBuffer a;
   @Nullable
   private GpuBuffer b;
   private int c;
   private VertexFormat.a d;

   public hbh(GpuBuffer $$0, @Nullable GpuBuffer $$1, int $$2, VertexFormat.a $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public GpuBuffer a() {
      return this.a;
   }

   @Nullable
   public GpuBuffer b() {
      return this.b;
   }

   public void a(@Nullable GpuBuffer $$0) {
      this.b = $$0;
   }

   public int c() {
      return this.c;
   }

   public VertexFormat.a d() {
      return this.d;
   }

   public void a(VertexFormat.a $$0) {
      this.d = $$0;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   public void b(GpuBuffer $$0) {
      this.a = $$0;
   }

   @Override
   public void close() {
      this.a.close();
      if (this.b != null) {
         this.b.close();
      }
   }
}
