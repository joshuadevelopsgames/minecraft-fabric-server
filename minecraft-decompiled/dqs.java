import com.mojang.serialization.MapCodec;

public class dqs extends dpz {
   public static final MapCodec<dqs> a = b(dqs::new);
   private static final fjm b = dpz.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dqs> a() {
      return a;
   }

   public dqs(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return !$$1.w($$2.e());
   }
}
