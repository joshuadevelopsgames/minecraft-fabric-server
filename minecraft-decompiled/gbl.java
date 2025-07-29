import java.util.function.Consumer;

public interface gbl extends gbm {
   void b(Consumer<gbm> var1);

   @Override
   default void a(Consumer<fxm> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof gbl $$1) {
            $$1.a();
         }
      });
   }
}
