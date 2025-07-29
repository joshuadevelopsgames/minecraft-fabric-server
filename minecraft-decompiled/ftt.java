import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftt {
   private final grl a;
   private int b = -1;
   @Nullable
   private Consumer<ui> c;

   public ftt(grl $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ui $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ui> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ui> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aii($$2, $$0));
   }

   public void a(jb $$0, Consumer<ui> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahp($$2, $$0));
   }
}
