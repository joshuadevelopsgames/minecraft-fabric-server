import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;
import org.slf4j.Logger;

public class foa implements AutoCloseable {
   private static final MemoryPool a = TracyClient.createMemoryPool("ByteBufferBuilder");
   private static final Logger b = LogUtils.getLogger();
   private static final MemoryAllocator c = MemoryUtil.getAllocator(false);
   private static final long d = 4294967295L;
   private static final int e = 2097152;
   private static final int f = -1;
   long g;
   private long h;
   private final long i;
   private long j;
   private long k;
   private int l;
   private int m;

   public foa(int $$0, long $$1) {
      this.h = $$0;
      this.i = $$1;
      this.g = c.malloc($$0);
      a.malloc(this.g, $$0);
      if (this.g == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + $$0 + " bytes");
      }
   }

   public foa(int $$0) {
      this($$0, 4294967295L);
   }

   public static foa a(int $$0) {
      return new foa($$0, $$0);
   }

   public long b(int $$0) {
      long $$1 = this.j;
      long $$2 = Math.addExact($$1, (long)$$0);
      this.a($$2);
      this.j = $$2;
      return Math.addExact(this.g, $$1);
   }

   private void a(long $$0) {
      if ($$0 > this.h) {
         if ($$0 > this.i) {
            throw new IllegalArgumentException("Maximum capacity of ByteBufferBuilder (" + this.i + ") exceeded, required " + $$0);
         }

         long $$1 = Math.min(this.h, 2097152L);
         long $$2 = bcb.a(this.h + $$1, $$0, this.i);
         this.b($$2);
      }
   }

   private void b(long $$0) {
      a.free(this.g);
      this.g = c.realloc(this.g, $$0);
      a.malloc(this.g, (int)Math.min($$0, 2147483647L));
      b.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", this.h, $$0);
      if (this.g == 0L) {
         throw new OutOfMemoryError("Failed to resize buffer from " + this.h + " bytes to " + $$0 + " bytes");
      } else {
         this.h = $$0;
      }
   }

   @Nullable
   public foa.a a() {
      this.f();
      long $$0 = this.k;
      long $$1 = this.j - $$0;
      if ($$1 == 0L) {
         return null;
      } else if ($$1 > 2147483647L) {
         throw new IllegalStateException("Cannot build buffer larger than 2147483647 bytes (was " + $$1 + ")");
      } else {
         this.k = this.j;
         this.l++;
         return new foa.a($$0, (int)$$1, this.m);
      }
   }

   public void b() {
      if (this.l > 0) {
         b.warn("Clearing BufferBuilder with unused batches");
      }

      this.c();
   }

   public void c() {
      this.f();
      if (this.l > 0) {
         this.e();
         this.l = 0;
      }
   }

   boolean c(int $$0) {
      return $$0 == this.m;
   }

   void d() {
      if (--this.l <= 0) {
         this.e();
      }
   }

   private void e() {
      long $$0 = this.j - this.k;
      if ($$0 > 0L) {
         MemoryUtil.memCopy(this.g + this.k, this.g, $$0);
      }

      this.j = $$0;
      this.k = 0L;
      this.m++;
   }

   @Override
   public void close() {
      if (this.g != 0L) {
         a.free(this.g);
         c.free(this.g);
         this.g = 0L;
         this.m = -1;
      }
   }

   private void f() {
      if (this.g == 0L) {
         throw new IllegalStateException("Buffer has been freed");
      }
   }

   public class a implements AutoCloseable {
      private final long b;
      private final int c;
      private final int d;
      private boolean e;

      a(final long $$1, final int $$2, final int $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ByteBuffer a() {
         if (!foa.this.c(this.d)) {
            throw new IllegalStateException("Buffer is no longer valid");
         } else {
            return MemoryUtil.memByteBuffer(foa.this.g + this.b, this.c);
         }
      }

      @Override
      public void close() {
         if (!this.e) {
            this.e = true;
            if (foa.this.c(this.d)) {
               foa.this.d();
            }
         }
      }
   }
}
