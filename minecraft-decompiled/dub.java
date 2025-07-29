import com.mojang.serialization.MapCodec;

public abstract class dub extends dpz {
   public static final eez<jh> f = eer.T;

   protected dub(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dub> a();

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(f, $$1.a($$0.c(f)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(f)));
   }
}
