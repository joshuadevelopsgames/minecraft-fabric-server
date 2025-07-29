import com.mojang.serialization.MapCodec;

public class dry extends dpz {
   public static final MapCodec<dry> a = b(dry::new);

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   public dry(eea.d $$0) {
      super($$0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(5) == 0) {
         jh $$4 = jh.b($$3);
         if ($$4 != jh.b) {
            jb $$5 = $$2.a($$4);
            eeb $$6 = $$1.a_($$5);
            if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
               double $$7 = $$4.j() == 0 ? $$3.j() : 0.5 + $$4.j() * 0.6;
               double $$8 = $$4.k() == 0 ? $$3.j() : 0.5 + $$4.k() * 0.6;
               double $$9 = $$4.l() == 0 ? $$3.j() : 0.5 + $$4.l() * 0.6;
               $$1.a(me.aH, $$2.u() + $$7, $$2.v() + $$8, $$2.w() + $$9, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
