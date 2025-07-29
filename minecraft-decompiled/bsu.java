import java.util.stream.Stream;

public interface bsu<S> {
   Stream<String> possibleValues(bsr<S> var1);

   static <S> bsu<S> b() {
      return $$0 -> Stream.empty();
   }
}
