import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyu extends dpl implements dtm {
   public static final MapCodec<dyu> a = b(dyu::new);

   public dyu(eea.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecu($$0, $$1);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.c_($$2) instanceof ecu $$6) {
         if (!$$3.gQ()) {
            return bxj.e;
         } else {
            if ($$3.ai().C) {
               $$3.a($$6);
            }

            return bxj.a;
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected MapCodec<dyu> a() {
      return a;
   }
}
