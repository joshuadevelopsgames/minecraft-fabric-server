import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fgf extends fgi {
   public static final MapCodec<fgf> a = a(fgf::new);
   public static final Codec<fgf> b = b(fgf::new);

   fgf(List<fgs> $$0) {
      super($$0, ag.a($$0));
   }

   public static fgf a(List<fgs> $$0) {
      return new fgf(List.copyOf($$0));
   }

   @Override
   public fgt b() {
      return fgu.c;
   }

   public static fgf.a a(fgs.a... $$0) {
      return new fgf.a($$0);
   }

   public static class a extends fgi.a {
      public a(fgs.a... $$0) {
         super($$0);
      }

      @Override
      public fgf.a and(fgs.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fgs a(List<fgs> $$0) {
         return new fgf($$0);
      }
   }
}
