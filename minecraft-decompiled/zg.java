import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class zg {
   public static final MapCodec<ze> a = mm.al.q().dispatchMap(ze::a, zf::a);
   public static final Codec<ze> b = a.codec();
   public static final zm<wx, ze> c = zk.a(mn.aa).b(ze::a, zf::b);
   public static final zm<wx, Optional<ze>> d = c.a(zk::a);

   public static zf<?> a(jy<zf<?>> $$0) {
      jy.a($$0, "blank", zc.b);
      jy.a($$0, "styled", zh.a);
      return jy.a($$0, "fixed", zd.a);
   }
}
