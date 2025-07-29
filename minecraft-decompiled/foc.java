import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableLong;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryUtil;

public class foc implements AutoCloseable {
   private final foa.a a;
   @Nullable
   private foa.a b;
   private final foc.a c;

   public foc(foa.a $$0, foc.a $$1) {
      this.a = $$0;
      this.c = $$1;
   }

   private static Vector3f[] a(ByteBuffer $$0, int $$1, VertexFormat $$2) {
      int $$3 = $$2.getOffset(VertexFormatElement.POSITION);
      if ($$3 == -1) {
         throw new IllegalArgumentException("Cannot identify quad centers with no position element");
      } else {
         FloatBuffer $$4 = $$0.asFloatBuffer();
         int $$5 = $$2.getVertexSize() / 4;
         int $$6 = $$5 * 4;
         int $$7 = $$1 / 4;
         Vector3f[] $$8 = new Vector3f[$$7];

         for (int $$9 = 0; $$9 < $$7; $$9++) {
            int $$10 = $$9 * $$6 + $$3;
            int $$11 = $$10 + $$5 * 2;
            float $$12 = $$4.get($$10 + 0);
            float $$13 = $$4.get($$10 + 1);
            float $$14 = $$4.get($$10 + 2);
            float $$15 = $$4.get($$11 + 0);
            float $$16 = $$4.get($$11 + 1);
            float $$17 = $$4.get($$11 + 2);
            $$8[$$9] = new Vector3f(($$12 + $$15) / 2.0F, ($$13 + $$16) / 2.0F, ($$14 + $$17) / 2.0F);
         }

         return $$8;
      }
   }

   public ByteBuffer a() {
      return this.a.a();
   }

   @Nullable
   public ByteBuffer b() {
      return this.b != null ? this.b.a() : null;
   }

   public foc.a c() {
      return this.c;
   }

   @Nullable
   public foc.b a(foa $$0, foi $$1) {
      if (this.c.d() != VertexFormat.b.h) {
         return null;
      } else {
         Vector3f[] $$2 = a(this.a.a(), this.c.b(), this.c.a());
         foc.b $$3 = new foc.b($$2, this.c.e());
         this.b = $$3.a($$0, $$1);
         return $$3;
      }
   }

   @Override
   public void close() {
      this.a.close();
      if (this.b != null) {
         this.b.close();
      }
   }

   public record a(VertexFormat a, int b, int c, VertexFormat.b d, VertexFormat.a e) {
   }

   public record b(Vector3f[] a, VertexFormat.a b) {
      @Nullable
      public foa.a a(foa $$0, foi $$1) {
         int[] $$2 = $$1.sort(this.a);
         long $$3 = $$0.b($$2.length * 6 * this.b.c);
         IntConsumer $$4 = this.a($$3, this.b);

         for (int $$5 : $$2) {
            $$4.accept($$5 * 4 + 0);
            $$4.accept($$5 * 4 + 1);
            $$4.accept($$5 * 4 + 2);
            $$4.accept($$5 * 4 + 2);
            $$4.accept($$5 * 4 + 3);
            $$4.accept($$5 * 4 + 0);
         }

         return $$0.a();
      }

      private IntConsumer a(long $$0, VertexFormat.a $$1) {
         MutableLong $$2 = new MutableLong($$0);

         return switch ($$1) {
            case a -> $$1x -> MemoryUtil.memPutShort($$2.getAndAdd(2L), (short)$$1x);
            case b -> $$1x -> MemoryUtil.memPutInt($$2.getAndAdd(4L), $$1x);
         };
      }
   }
}
