import com.mojang.serialization.Codec;
import java.util.Map;

public record htn(Map<String, htc> d) {
   public static final Codec<String> a = Codec.string(1, 16);
   public static final Codec<htn> b = Codec.unboundedMap(a, htc.a).xmap(htn::new, htn::a);
   public static final awo<htn> c = new awo<>("language", b);

   public Map<String, htc> a() {
      return this.d;
   }
}
