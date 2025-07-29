import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;

public record aah(Map<String, String> b) implements zw<aae> {
   private static final int c = 128;
   private static final int d = 4096;
   private static final int e = 32;
   private static final zm<ByteBuf, Map<String, String>> f = zk.a(HashMap::new, zk.b(128), zk.b(4096), 32);
   public static final zm<ByteBuf, aah> a = zm.a(f, aah::b, aah::new);

   @Override
   public zy<aah> a() {
      return aas.c;
   }

   public void a(aae $$0) {
      $$0.a(this);
   }
}
