import io.netty.buffer.ByteBuf;

public record adc(bxg b, boolean c) implements zw<acq> {
   public static final zm<ByteBuf, adc> a = zm.a(bxg.f, adc::b, zk.b, adc::e, adc::new);

   @Override
   public zy<adc> a() {
      return ahk.l;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
