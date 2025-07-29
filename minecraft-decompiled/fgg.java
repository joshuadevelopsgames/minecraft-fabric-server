import com.mojang.serialization.MapCodec;
import java.util.List;

public class fgg extends fgi {
   public static final MapCodec<fgg> a = a(fgg::new);

   fgg(List<fgs> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fgt b() {
      return fgu.b;
   }

   public static fgg.a a(fgs.a... $$0) {
      return new fgg.a($$0);
   }

   public static class a extends fgi.a {
      public a(fgs.a... $$0) {
         super($$0);
      }

      @Override
      public fgg.a or(fgs.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fgs a(List<fgs> $$0) {
         return new fgg($$0);
      }
   }
}
