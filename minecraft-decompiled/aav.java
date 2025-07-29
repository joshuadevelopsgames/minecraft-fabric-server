import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Supplier;

public record aav(ame b, Optional<vi> c) implements zw<aat> {
   private static final zm<ByteBuf, Optional<vi>> d = zk.a((Supplier<ur>)(() -> new ur(32768L, 16))).a(zk.d(65536));
   public static final zm<ByteBuf, aav> a = zm.a(ame.b, aav::b, d, aav::e, aav::new);

   @Override
   public zy<aav> a() {
      return aas.s;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }

   public Optional<vi> e() {
      return this.c;
   }
}
