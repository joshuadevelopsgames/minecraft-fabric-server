import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dwq extends dsd {
   private static final Map<jh.a, fjm> b = fjj.b(dpz.a(4.0, 4.0, 16.0));

   protected dwq(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dwq> a();

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b.get($$0.c(a).o());
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
