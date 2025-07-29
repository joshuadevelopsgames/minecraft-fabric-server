import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface hbk extends AutoCloseable {
   default boolean b(hbm $$0) {
      return false;
   }

   default boolean a() {
      return false;
   }

   default boolean c() {
      return false;
   }

   default boolean a(hba $$0) {
      return true;
   }

   default List<eaz> b() {
      return Collections.emptyList();
   }

   boolean a(jh var1, jh var2);

   @Nullable
   default hbh b(hba $$0) {
      return null;
   }

   @Override
   default void close() {
   }
}
