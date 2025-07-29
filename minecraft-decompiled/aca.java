import io.netty.buffer.ByteBuf;
import java.util.List;

public record aca(amd<? extends jy<?>> b, List<kc.a> c) implements zw<aby> {
   private static final zm<ByteBuf, amd<? extends jy<?>>> d = ame.b.a(amd::a, amd::a);
   public static final zm<wg, aca> a = zm.a(d, aca::b, kc.a.a.a(zk.a()), aca::e, aca::new);

   @Override
   public zy<aca> a() {
      return ace.b;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public List<kc.a> e() {
      return this.c;
   }
}
