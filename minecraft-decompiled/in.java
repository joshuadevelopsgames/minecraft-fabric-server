import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class in<A extends ArgumentType<?>> implements ik<A, in<A>.a> {
   private final in<A>.a a;

   private in(Function<eg, A> $$0) {
      this.a = new in.a($$0);
   }

   public static <T extends ArgumentType<?>> in<T> a(Supplier<T> $$0) {
      return new in<>($$1 -> $$0.get());
   }

   public static <T extends ArgumentType<?>> in<T> a(Function<eg, T> $$0) {
      return new in<>($$0);
   }

   public void a(in<A>.a $$0, wg $$1) {
   }

   public void a(in<A>.a $$0, JsonObject $$1) {
   }

   public in<A>.a a(wg $$0) {
      return this.a;
   }

   public in<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements ik.a<A> {
      private final Function<eg, A> b;

      public a(final Function<eg, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(eg $$0) {
         return this.b.apply($$0);
      }

      @Override
      public ik<A, ?> a() {
         return in.this;
      }
   }
}
