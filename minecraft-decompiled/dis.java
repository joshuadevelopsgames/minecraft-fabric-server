import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface dis {
   Codec<dis> d = mm.ax.q().dispatch(dis::a, dis.a::a);
   zm<wx, dis> e = zk.a(mn.aj).b(dis::a, dis.a::b);

   diy d();

   diy e();

   dis.a<? extends dis> a();

   default boolean a(cyd $$0) {
      return this.d().a($$0) && this.e().a($$0);
   }

   public record a<T extends dis>(MapCodec<T> a, zm<wx, T> b) {
   }
}
