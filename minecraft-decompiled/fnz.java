import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.nio.ByteOrder;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;

public class fnz implements fog {
   private static final int a = 16777215;
   private static final long b = -1L;
   private static final long c = -1L;
   private static final boolean d = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
   private final foa e;
   private long f = -1L;
   private int g;
   private final VertexFormat h;
   private final VertexFormat.b i;
   private final boolean j;
   private final boolean k;
   private final int l;
   private final int m;
   private final int[] n;
   private int o;
   private boolean p = true;

   public fnz(foa $$0, VertexFormat.b $$1, VertexFormat $$2) {
      if (!$$2.contains(VertexFormatElement.POSITION)) {
         throw new IllegalArgumentException("Cannot build mesh with no position element");
      } else {
         this.e = $$0;
         this.i = $$1;
         this.h = $$2;
         this.l = $$2.getVertexSize();
         this.m = $$2.getElementsMask() & ~VertexFormatElement.POSITION.mask();
         this.n = $$2.getOffsetsByElement();
         boolean $$3 = $$2 == fob.d;
         boolean $$4 = $$2 == fob.c;
         this.j = $$3 || $$4;
         this.k = $$3;
      }
   }

   @Nullable
   public foc a() {
      this.c();
      this.f();
      foc $$0 = this.d();
      this.p = false;
      this.f = -1L;
      return $$0;
   }

   public foc b() {
      foc $$0 = this.a();
      if ($$0 == null) {
         throw new IllegalStateException("BufferBuilder was empty");
      } else {
         return $$0;
      }
   }

   private void c() {
      if (!this.p) {
         throw new IllegalStateException("Not building!");
      }
   }

   @Nullable
   private foc d() {
      if (this.g == 0) {
         return null;
      } else {
         foa.a $$0 = this.e.a();
         if ($$0 == null) {
            return null;
         } else {
            int $$1 = this.i.a(this.g);
            VertexFormat.a $$2 = VertexFormat.a.a(this.g);
            return new foc($$0, new foc.a(this.h, this.g, $$1, this.i, $$2));
         }
      }
   }

   private long e() {
      this.c();
      this.f();
      if (this.g >= 16777215) {
         throw new IllegalStateException("Trying to write too many vertices (>16777215) into BufferBuilder");
      } else {
         this.g++;
         long $$0 = this.e.b(this.l);
         this.f = $$0;
         return $$0;
      }
   }

   private long a(VertexFormatElement $$0) {
      int $$1 = this.o;
      int $$2 = $$1 & ~$$0.mask();
      if ($$2 == $$1) {
         return -1L;
      } else {
         this.o = $$2;
         long $$3 = this.f;
         if ($$3 == -1L) {
            throw new IllegalArgumentException("Not currently building vertex");
         } else {
            return $$3 + this.n[$$0.id()];
         }
      }
   }

   private void f() {
      if (this.g != 0) {
         if (this.o != 0) {
            String $$0 = VertexFormatElement.elementsFromMask(this.o).map(this.h::getElementName).collect(Collectors.joining(", "));
            throw new IllegalStateException("Missing elements in vertex: " + $$0);
         } else {
            if (this.i == VertexFormat.b.a || this.i == VertexFormat.b.b) {
               long $$1 = this.e.b(this.l);
               MemoryUtil.memCopy($$1 - this.l, $$1, this.l);
               this.g++;
            }
         }
      }
   }

   private static void a(long $$0, int $$1) {
      int $$2 = baj.m($$1);
      MemoryUtil.memPutInt($$0, d ? $$2 : Integer.reverseBytes($$2));
   }

   private static void b(long $$0, int $$1) {
      if (d) {
         MemoryUtil.memPutInt($$0, $$1);
      } else {
         MemoryUtil.memPutShort($$0, (short)($$1 & 65535));
         MemoryUtil.memPutShort($$0 + 2L, (short)($$1 >> 16 & 65535));
      }
   }

   @Override
   public fog a(float $$0, float $$1, float $$2) {
      long $$3 = this.e() + this.n[VertexFormatElement.POSITION.id()];
      this.o = this.m;
      MemoryUtil.memPutFloat($$3, $$0);
      MemoryUtil.memPutFloat($$3 + 4L, $$1);
      MemoryUtil.memPutFloat($$3 + 8L, $$2);
      return this;
   }

   @Override
   public fog a(int $$0, int $$1, int $$2, int $$3) {
      long $$4 = this.a(VertexFormatElement.COLOR);
      if ($$4 != -1L) {
         MemoryUtil.memPutByte($$4, (byte)$$0);
         MemoryUtil.memPutByte($$4 + 1L, (byte)$$1);
         MemoryUtil.memPutByte($$4 + 2L, (byte)$$2);
         MemoryUtil.memPutByte($$4 + 3L, (byte)$$3);
      }

      return this;
   }

   @Override
   public fog a(int $$0) {
      long $$1 = this.a(VertexFormatElement.COLOR);
      if ($$1 != -1L) {
         a($$1, $$0);
      }

      return this;
   }

   @Override
   public fog a(float $$0, float $$1) {
      long $$2 = this.a(VertexFormatElement.UV0);
      if ($$2 != -1L) {
         MemoryUtil.memPutFloat($$2, $$0);
         MemoryUtil.memPutFloat($$2 + 4L, $$1);
      }

      return this;
   }

   @Override
   public fog a(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, VertexFormatElement.UV1);
   }

   @Override
   public fog b(int $$0) {
      long $$1 = this.a(VertexFormatElement.UV1);
      if ($$1 != -1L) {
         b($$1, $$0);
      }

      return this;
   }

   @Override
   public fog b(int $$0, int $$1) {
      return this.a((short)$$0, (short)$$1, VertexFormatElement.UV2);
   }

   @Override
   public fog c(int $$0) {
      long $$1 = this.a(VertexFormatElement.UV2);
      if ($$1 != -1L) {
         b($$1, $$0);
      }

      return this;
   }

   private fog a(short $$0, short $$1, VertexFormatElement $$2) {
      long $$3 = this.a($$2);
      if ($$3 != -1L) {
         MemoryUtil.memPutShort($$3, $$0);
         MemoryUtil.memPutShort($$3 + 2L, $$1);
      }

      return this;
   }

   @Override
   public fog b(float $$0, float $$1, float $$2) {
      long $$3 = this.a(VertexFormatElement.NORMAL);
      if ($$3 != -1L) {
         MemoryUtil.memPutByte($$3, a($$0));
         MemoryUtil.memPutByte($$3 + 1L, a($$1));
         MemoryUtil.memPutByte($$3 + 2L, a($$2));
      }

      return this;
   }

   private static byte a(float $$0) {
      return (byte)((int)(bcb.a($$0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }

   @Override
   public void a(float $$0, float $$1, float $$2, int $$3, float $$4, float $$5, int $$6, int $$7, float $$8, float $$9, float $$10) {
      if (this.j) {
         long $$11 = this.e();
         MemoryUtil.memPutFloat($$11 + 0L, $$0);
         MemoryUtil.memPutFloat($$11 + 4L, $$1);
         MemoryUtil.memPutFloat($$11 + 8L, $$2);
         a($$11 + 12L, $$3);
         MemoryUtil.memPutFloat($$11 + 16L, $$4);
         MemoryUtil.memPutFloat($$11 + 20L, $$5);
         long $$12;
         if (this.k) {
            b($$11 + 24L, $$6);
            $$12 = $$11 + 28L;
         } else {
            $$12 = $$11 + 24L;
         }

         b($$12 + 0L, $$7);
         MemoryUtil.memPutByte($$12 + 4L, a($$8));
         MemoryUtil.memPutByte($$12 + 5L, a($$9));
         MemoryUtil.memPutByte($$12 + 6L, a($$10));
      } else {
         fog.super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }
}
