import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;

public record ci(List<dmr> d) {
   public static final ci a = a(dmr.values());
   public static final ci b = a(dmr.a, dmr.c);
   public static final Codec<ci> c = dmr.f.listOf().xmap(ci::new, ci::a);

   public static ci a(dmr... $$0) {
      return new ci(Arrays.stream($$0).toList());
   }

   public boolean a(dmr $$0) {
      return this.d.contains($$0);
   }

   public List<dmr> a() {
      return this.d;
   }
}
