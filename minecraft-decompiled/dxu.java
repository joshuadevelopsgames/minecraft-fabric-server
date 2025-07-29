import com.mojang.serialization.MapCodec;

public class dxu extends dpz {
   public static final MapCodec<dxu> b = b(dxu::new);
   public static final ees c = eer.E;

   @Override
   protected MapCodec<? extends dxu> a() {
      return b;
   }

   protected dxu(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, false));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.b ? $$0.b(c, o($$6)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, o($$1));
   }

   protected static boolean o(eeb $$0) {
      return $$0.a(azo.bD);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }
}
