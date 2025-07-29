import io.netty.buffer.ByteBuf;

public class akx implements zw<akw> {
   public static final zm<ByteBuf, akx> a = zw.a(akx::a, akx::new);
   private final long b;

   public akx(long $$0) {
      this.b = $$0;
   }

   private akx(ByteBuf $$0) {
      this.b = $$0.readLong();
   }

   private void a(ByteBuf $$0) {
      $$0.writeLong(this.b);
   }

   @Override
   public zy<akx> a() {
      return akv.b;
   }

   public void a(akw $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.b;
   }
}
