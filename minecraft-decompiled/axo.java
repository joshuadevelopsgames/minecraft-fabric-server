import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface axo extends axr {
   Set<String> a();

   List<axm> a(ame var1);

   Map<ame, axm> b(String var1, Predicate<ame> var2);

   Map<ame, List<axm>> c(String var1, Predicate<ame> var2);

   Stream<awb> b();

   public static enum a implements axo {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<axm> getResource(ame $$0) {
         return Optional.empty();
      }

      @Override
      public List<axm> a(ame $$0) {
         return List.of();
      }

      @Override
      public Map<ame, axm> b(String $$0, Predicate<ame> $$1) {
         return Map.of();
      }

      @Override
      public Map<ame, List<axm>> c(String $$0, Predicate<ame> $$1) {
         return Map.of();
      }

      @Override
      public Stream<awb> b() {
         return Stream.of();
      }
   }
}
