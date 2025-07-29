import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dvt extends dzr {
   public static final MapCodec<dvt> b = b(dvt::new);
   private static final Map<jh, fjm> e = fjj.c(dpz.b(10.0, 8.0, 8.0, 16.0));

   @Override
   public MapCodec<dvt> a() {
      return b;
   }

   public dvt(eea.d $$0) {
      super(dxm.b.h, $$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e.get($$0.c(d));
   }
}
