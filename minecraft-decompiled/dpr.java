import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpr extends dpl implements dpq {
   public static final MapCodec<dpr> a = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(eea.d $$0) {
      super($$0);
   }

   @Override
   public dbt b() {
      return dbt.a;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eau($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.p, eau::a);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof eau $$5) {
         $$3.a($$5);
         $$3.a(azj.ac);
      }

      return bxj.a;
   }
}
