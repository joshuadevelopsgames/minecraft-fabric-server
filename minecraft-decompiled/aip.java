import io.netty.buffer.ByteBuf;

public record aip(jb b, boolean c) implements zw<ahm> {
   public static final zm<ByteBuf, aip> a = zm.a(jb.b, aip::b, zk.b, aip::e, aip::new);

   @Override
   public zy<aip> a() {
      return ahk.bQ;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
