import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.util.ReferenceCounted;

public record wk(ByteBuf a) implements ReferenceCounted {
   public wk(final ByteBuf a) {
      this.a = ByteBufUtil.ensureAccessible(a);
   }

   public static Object a(Object $$0) {
      return $$0 instanceof ByteBuf $$1 ? new wk($$1) : $$0;
   }

   public static Object b(Object $$0) {
      return $$0 instanceof wk $$1 ? ByteBufUtil.ensureAccessible($$1.a) : $$0;
   }

   public int refCnt() {
      return this.a.refCnt();
   }

   public wk a() {
      this.a.retain();
      return this;
   }

   public wk a(int $$0) {
      this.a.retain($$0);
      return this;
   }

   public wk b() {
      this.a.touch();
      return this;
   }

   public wk c(Object $$0) {
      this.a.touch($$0);
      return this;
   }

   public boolean release() {
      return this.a.release();
   }

   public boolean release(int $$0) {
      return this.a.release($$0);
   }

   public ByteBuf c() {
      return this.a;
   }
}
