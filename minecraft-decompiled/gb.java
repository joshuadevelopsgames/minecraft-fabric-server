import com.mojang.brigadier.context.CommandContext;

public class gb extends fx<dwu> {
   private gb() {
      super(dwu.f, dwu::values);
   }

   public static gb a() {
      return new gb();
   }

   public static dwu a(CommandContext<ek> $$0, String $$1) {
      return (dwu)$$0.getArgument($$1, dwu.class);
   }
}
