import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface dmf extends dmm, dmx, dmz {
   @Override
   default <T extends eaz> Optional<T> a(jb $$0, ebb<T> $$1) {
      return dmx.super.a($$0, $$1);
   }

   @Override
   default List<fjm> c(@Nullable bzm $$0, fin $$1) {
      return dmm.super.c($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bzm $$0, fjm $$1) {
      return dmm.super.a($$0, $$1);
   }

   @Override
   default jb a(eka.a $$0, jb $$1) {
      return dmx.super.a($$0, $$1);
   }
}
