import com.mojang.serialization.MapCodec;
import java.util.Set;

public class fgw implements fgs {
   private static final fgw b = new fgw();
   public static final MapCodec<fgw> a = MapCodec.unit(b);

   private fgw() {
   }

   @Override
   public fgt b() {
      return fgu.g;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(fgd.b);
   }

   public boolean a(fdj $$0) {
      return $$0.a(fgd.b);
   }

   public static fgs.a c() {
      return () -> b;
   }
}
