import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class iv implements ik<StringArgumentType, iv.a> {
   public void a(iv.a $$0, wg $$1) {
      $$1.a((Enum<?>)$$0.b);
   }

   public iv.a a(wg $$0) {
      StringType $$1 = $$0.b(StringType.class);
      return new iv.a($$1);
   }

   public void a(iv.a $$0, JsonObject $$1) {
      $$1.addProperty("type", switch ($$0.b) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public iv.a a(StringArgumentType $$0) {
      return new iv.a($$0.getType());
   }

   public final class a implements ik.a<StringArgumentType> {
      final StringType b;

      public a(final StringType $$1) {
         this.b = $$1;
      }

      public StringArgumentType a(eg $$0) {
         return switch (this.b) {
            case SINGLE_WORD -> StringArgumentType.word();
            case QUOTABLE_PHRASE -> StringArgumentType.string();
            case GREEDY_PHRASE -> StringArgumentType.greedyString();
            default -> throw new MatchException(null, null);
         };
      }

      @Override
      public ik<StringArgumentType, ?> a() {
         return iv.this;
      }
   }
}
