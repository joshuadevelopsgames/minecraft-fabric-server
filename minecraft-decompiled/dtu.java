import com.mojang.serialization.MapCodec;

public class dtu extends dpz {
   public static final MapCodec<dtu> d = b(dtu::new);

   @Override
   protected MapCodec<? extends dtu> a() {
      return d;
   }

   protected dtu(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
