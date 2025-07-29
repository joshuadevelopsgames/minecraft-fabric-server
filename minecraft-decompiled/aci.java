import io.netty.buffer.ByteBuf;
import java.util.List;

public record aci(List<awv> b) implements zw<acg> {
   public static final zm<ByteBuf, aci> a = zm.a(awv.a.a(zk.c(64)), aci::b, aci::new);

   @Override
   public zy<aci> a() {
      return ace.g;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }
}
