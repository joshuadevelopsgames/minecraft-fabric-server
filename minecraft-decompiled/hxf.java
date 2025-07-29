import java.util.function.Consumer;

@FunctionalInterface
public interface hxf {
   hxf a = ($$0, $$1) -> {};

   default hxf decorate(Consumer<hxj.a> $$0) {
      return ($$1, $$2) -> this.send($$1, $$2x -> {
         $$2.accept($$2x);
         $$0.accept($$2x);
      });
   }

   void send(hxg var1, Consumer<hxj.a> var2);
}
