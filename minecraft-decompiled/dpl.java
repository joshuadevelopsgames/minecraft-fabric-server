import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpl extends dpz implements dsu {
   protected dpl(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpl> a();

   @Override
   protected boolean a(eeb $$0, dmu $$1, jb $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      eaz $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      eaz $$3 = $$1.c_($$2);
      return $$3 instanceof bxm ? (bxm)$$3 : null;
   }

   @Nullable
   protected static <E extends eaz, A extends eaz> eba<A> a(ebb<A> $$0, ebb<E> $$1, eba<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
