import com.mojang.serialization.MapCodec;

public class duz extends dpz {
   public static final MapCodec<duz> a = b(duz::new);
   private static final int b = 20;

   @Override
   public MapCodec<duz> a() {
      return a;
   }

   public duz(eea.d $$0) {
      super($$0);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
      if (!$$3.ch() && $$3 instanceof cam) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      dqg.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.b && $$6.a(dqb.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
