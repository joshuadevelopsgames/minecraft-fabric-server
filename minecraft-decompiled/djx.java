import com.mojang.serialization.Codec;

public record djx() {
   public static final djx a = new djx();
   public static final Codec<djx> b = Codec.unit(() -> a);
}
