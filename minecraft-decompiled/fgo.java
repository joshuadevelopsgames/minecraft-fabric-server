import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fgo implements fgs {
   private static final fgo b = new fgo();
   public static final MapCodec<fgo> a = MapCodec.unit(b);

   private fgo() {
   }

   @Override
   public fgt b() {
      return fgu.l;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.j);
   }

   public boolean a(fdj $$0) {
      Float $$1 = $$0.c(fgd.j);
      if ($$1 != null) {
         bck $$2 = $$0.b();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static fgs.a c() {
      return () -> b;
   }
}
