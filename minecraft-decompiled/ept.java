import com.mojang.serialization.Codec;

public class ept implements epm {
   public static final Codec<ept> a = Codec.unit(() -> ept.b);
   public static final ept b = new ept();
}
