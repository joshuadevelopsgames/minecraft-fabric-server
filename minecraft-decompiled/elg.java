import com.mojang.serialization.MapCodec;
import java.util.List;

class elg extends elj {
   public static final MapCodec<elg> a = a(elg::new);

   public elg(List<elh> $$0) {
      super($$0);
   }

   public boolean a(dnt $$0, jb $$1) {
      for (elh $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public eli<?> a() {
      return eli.i;
   }
}
