import java.util.ArrayList;
import java.util.List;

public class bab {
   private final List<bac> a = new ArrayList<>();

   public static bab a() {
      return new bab();
   }

   public List<bac> b() {
      return List.copyOf(this.a);
   }

   public bab a(bac $$0) {
      this.a.add($$0);
      return this;
   }

   public bab a(ame $$0) {
      return this.a(bac.a($$0));
   }

   public bab b(ame $$0) {
      return this.a(bac.b($$0));
   }

   public bab c(ame $$0) {
      return this.a(bac.c($$0));
   }

   public bab d(ame $$0) {
      return this.a(bac.d($$0));
   }
}
