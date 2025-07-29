import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eik<T extends eig> {
   private static final Logger a = LogUtils.getLogger();
   private final bar<T> b;
   private eiv c;

   public eik(Class<T> $$0, eiv $$1) {
      this.c = $$1;
      this.b = new bar<>($$0);
   }

   public void a(T $$0) {
      this.b.add($$0);
   }

   public boolean b(T $$0) {
      return this.b.remove($$0);
   }

   public bak.a a(fin $$0, bak<T> $$1) {
      for (T $$2 : this.b) {
         if ($$2.cV().c($$0) && $$1.accept($$2).a()) {
            return bak.a.b;
         }
      }

      return bak.a.a;
   }

   public <U extends T> bak.a a(ein<T, U> $$0, fin $$1, bak<? super U> $$2) {
      Collection<? extends T> $$3 = this.b.a($$0.a());
      if ($$3.isEmpty()) {
         return bak.a.a;
      } else {
         for (T $$4 : $$3) {
            U $$5 = (U)$$0.a($$4);
            if ($$5 != null && $$4.cV().c($$1) && $$2.accept($$5).a()) {
               return bak.a.b;
            }
         }

         return bak.a.a;
      }
   }

   public boolean a() {
      return this.b.isEmpty();
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public eiv c() {
      return this.c;
   }

   public eiv a(eiv $$0) {
      eiv $$1 = this.c;
      this.c = $$0;
      return $$1;
   }

   @bdl
   public int d() {
      return this.b.size();
   }
}
