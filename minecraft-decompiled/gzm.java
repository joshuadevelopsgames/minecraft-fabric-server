import java.util.function.UnaryOperator;

@FunctionalInterface
public interface gzm extends UnaryOperator<gzl> {
   gzm.a<i> a = gzl::a;
   gzm.a<i> b = gzl::b;
   gzm.a<ame> c = gzl::a;
   gzm.a<Boolean> d = gzl::a;

   default gzm then(gzm $$0) {
      return $$1 -> $$0.apply(this.apply($$1));
   }

   @FunctionalInterface
   public interface a<T> {
      gzl apply(gzl var1, T var2);

      default gzm withValue(T $$0) {
         return $$1 -> this.apply($$1, $$0);
      }
   }
}
