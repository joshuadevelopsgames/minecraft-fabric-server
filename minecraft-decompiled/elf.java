import com.mojang.serialization.MapCodec;
import java.util.List;

class elf extends elj {
   public static final MapCodec<elf> a = a(elf::new);

   public elf(List<elh> $$0) {
      super($$0);
   }

   public boolean a(dnt $$0, jb $$1) {
      for (elh $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eli<?> a() {
      return eli.j;
   }
}
