import com.mojang.serialization.MapCodec;

public class dyq extends dzl implements dqc {
   public static final MapCodec<dyq> a = b(dyq::new);
   private static final fjm b = dpz.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dyq> a() {
      return a;
   }

   protected dyq(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return o($$2).m().a($$0, $$1) && $$0.w($$1.d());
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      dsi.a($$0, o($$3).m(), $$2, 2);
   }

   private static dsi o(eeb $$0) {
      return (dsi)($$0.a(dqb.bB) ? dqb.jk : dqb.jj);
   }
}
