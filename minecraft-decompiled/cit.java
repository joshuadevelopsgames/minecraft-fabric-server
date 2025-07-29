import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cit<T extends cao> extends chi {
   private final T a;
   private final dcv b;
   private final Predicate<? super T> c;
   @Nullable
   private final ayy d;

   public cit(T $$0, dcv $$1, @Nullable ayy $$2, Predicate<? super T> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = $$3;
   }

   @Override
   public boolean b() {
      return this.c.test(this.a);
   }

   @Override
   public boolean c() {
      return this.a.fG();
   }

   @Override
   public void d() {
      this.a.a(bzw.a, this.b.v());
      this.a.c(bxi.a);
   }

   @Override
   public void e() {
      this.a.a(bzw.a, dcv.l);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.ec().i() * 0.2F + 0.9F);
      }
   }
}
