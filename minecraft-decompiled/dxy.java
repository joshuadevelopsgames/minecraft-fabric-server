import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxy extends dpl {
   public static final MapCodec<dxy> a = b(dxy::new);

   @Override
   public MapCodec<dxy> a() {
      return a;
   }

   protected dxy(eea.d $$0) {
      super($$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.j, $$0.C ? ecr::a : ecr::b);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
