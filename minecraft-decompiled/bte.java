import com.mojang.brigadier.StringReader;
import java.util.stream.Stream;

public interface bte extends bsu<StringReader> {
   Stream<ame> a();

   @Override
   default Stream<String> possibleValues(bsr<StringReader> $$0) {
      return this.a().map(ame::toString);
   }
}
