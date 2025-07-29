import java.util.function.Function;

public class fkp<T> implements fkg<T> {
   private final Function<jb, fkn<T>> a;

   public fkp(Function<jb, fkn<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(jb $$0, T $$1) {
      return this.a.apply($$0).a($$0, $$1);
   }

   @Override
   public void a(fkk<T> $$0) {
      this.a.apply($$0.b()).a($$0);
   }

   @Override
   public boolean b(jb $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
