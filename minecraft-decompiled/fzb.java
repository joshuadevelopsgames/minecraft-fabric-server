import java.util.List;
import javax.annotation.Nullable;

public class fzb implements gbu {
   private static final int a = 170;
   private final xo b;
   @Nullable
   private List<bbm> c;
   @Nullable
   private ud d;
   @Nullable
   private final xo e;

   private fzb(xo $$0, @Nullable xo $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static fzb a(xo $$0, @Nullable xo $$1) {
      return new fzb($$0, $$1);
   }

   public static fzb a(xo $$0) {
      return new fzb($$0, $$0);
   }

   @Override
   public void b(gbt $$0) {
      if (this.e != null) {
         $$0.a(gbs.c, this.e);
      }
   }

   public List<bbm> a(fue $$0) {
      ud $$1 = ud.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<bbm> a(fue $$0, xo $$1) {
      return $$0.h.c($$1, 170);
   }
}
