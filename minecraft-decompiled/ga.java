import com.mojang.brigadier.context.CommandContext;

public class ga extends fx<dvd> {
   private ga() {
      super(dvd.d, dvd::values);
   }

   public static fx<dvd> a() {
      return new ga();
   }

   public static dvd a(CommandContext<ek> $$0, String $$1) {
      return (dvd)$$0.getArgument($$1, dvd.class);
   }
}
