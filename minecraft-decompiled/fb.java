import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class fb extends fx<eka.a> {
   private static final Codec<eka.a> a = bda.a(fb::b, $$0 -> $$0.toLowerCase(Locale.ROOT));

   private static eka.a[] b() {
      return Arrays.stream(eka.a.values()).filter(eka.a::d).toArray(eka.a[]::new);
   }

   private fb() {
      super(a, fb::b);
   }

   public static fb a() {
      return new fb();
   }

   public static eka.a a(CommandContext<ek> $$0, String $$1) {
      return (eka.a)$$0.getArgument($$1, eka.a.class);
   }

   @Override
   protected String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }
}
