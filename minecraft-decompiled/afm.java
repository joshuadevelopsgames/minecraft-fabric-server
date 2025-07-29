import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afm(xo b, Optional<byte[]> c) implements zw<acq> {
   public static final zm<ByteBuf, afm> a = zm.a(xq.f, afm::b, zk.n.a(zk::a), afm::e, afm::new);

   @Override
   public zy<afm> a() {
      return ahk.at;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
