import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fki<T> implements fkl<T>, fkn<T> {
   private final List<fkj<T>> a = Lists.newArrayList();
   private final Set<fkj<?>> b = new ObjectOpenCustomHashSet(fkj.a);

   @Override
   public void a(fkk<T> $$0) {
      fkj<T> $$1 = new fkj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fkj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jb $$0, T $$1) {
      return this.b.contains(fkj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fkj<T>> a(long $$0) {
      return this.a;
   }

   public List<fkj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fki<T> a(List<fkj<T>> $$0) {
      fki<T> $$1 = new fki<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
