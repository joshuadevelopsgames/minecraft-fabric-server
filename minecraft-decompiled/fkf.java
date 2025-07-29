import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fkf<T> implements fkl<T>, fkn<T> {
   private final Queue<fkk<T>> a = new PriorityQueue<>(fkk.a);
   @Nullable
   private List<fkj<T>> b;
   private final Set<fkk<?>> c = new ObjectOpenCustomHashSet(fkk.c);
   @Nullable
   private BiConsumer<fkf<T>, fkk<T>> d;

   public fkf() {
   }

   public fkf(List<fkj<T>> $$0) {
      this.b = $$0;

      for (fkj<T> $$1 : $$0) {
         this.c.add(fkk.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fkf<T>, fkk<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fkk<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fkk<T> c() {
      fkk<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fkk<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fkk<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jb $$0, T $$1) {
      return this.c.contains(fkk.a($$1, $$0));
   }

   public void a(Predicate<fkk<T>> $$0) {
      Iterator<fkk<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fkk<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fkk<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fkj<T>> a(long $$0) {
      List<fkj<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fkk<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fkj<T> $$2 : this.b) {
            this.b($$2.a($$0, $$1++));
         }
      }

      this.b = null;
   }
}
