import com.mojang.serialization.Codec;

public record awo<T>(String a, Codec<T> b) {
}
