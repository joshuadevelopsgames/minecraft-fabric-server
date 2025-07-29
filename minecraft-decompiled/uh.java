import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public sealed interface uh extends Iterable<vi>, vi permits uo, uf, um, up {
   void clear();

   boolean a(int var1, vi var2);

   boolean b(int var1, vi var2);

   vi d(int var1);

   vi c(int var1);

   int size();

   default boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   default Iterator<vi> iterator() {
      return new Iterator<vi>() {
         private int b;

         @Override
         public boolean hasNext() {
            return this.b < uh.this.size();
         }

         public vi a() {
            if (!this.hasNext()) {
               throw new NoSuchElementException();
            } else {
               return uh.this.c(this.b++);
            }
         }
      };
   }

   default Stream<vi> stream() {
      return StreamSupport.stream(this.spliterator(), false);
   }
}
