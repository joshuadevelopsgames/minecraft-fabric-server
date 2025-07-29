import com.mojang.serialization.MapCodec;

public class dwt extends dpz {
   public static final MapCodec<dwt> c = b(dwt::new);
   public static final eez<jh.a> d = eer.K;

   @Override
   public MapCodec<? extends dwt> a() {
      return c;
   }

   public dwt(eea.d $$0) {
      super($$0);
      this.l(this.m().b(d, jh.a.b));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return b($$0, $$1);
   }

   public static eeb b(eeb $$0, dwu $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jh.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, jh.a.c);
               case c:
                  return $$0.b(d, jh.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
