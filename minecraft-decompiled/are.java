import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Locale;
import java.util.function.Function;

public class are implements arb {
   static final SuggestionProvider<ek> b = ($$0, $$1) -> eq.a(a($$0).a(), $$1);
   public static final Function<String, arc.c> a = $$0 -> new arc.c() {
      @Override
      public arb a(CommandContext<ek> $$0x) {
         return new are(are.a($$0), fn.a($$0, $$0));
      }

      @Override
      public ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0x, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$1) {
         return $$0.then(el.b("storage").then($$1.apply(el.a($$0, fn.a()).suggests(are.b))));
      }
   };
   private final fcj c;
   private final ame d;

   static fcj a(CommandContext<ek> $$0) {
      return ((ek)$$0.getSource()).l().aK();
   }

   are(fcj $$0, ame $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ui $$0) {
      this.c.a(this.d, $$0);
   }

   @Override
   public ui a() {
      return this.c.a(this.d);
   }

   @Override
   public xo b() {
      return xo.a("commands.data.storage.modified", xo.a(this.d));
   }

   @Override
   public xo a(vi $$0) {
      return xo.a("commands.data.storage.query", xo.a(this.d), ux.b($$0));
   }

   @Override
   public xo a(fe.g $$0, double $$1, int $$2) {
      return xo.a("commands.data.storage.get", $$0.a(), xo.a(this.d), String.format(Locale.ROOT, "%.2f", $$1), $$2);
   }
}
