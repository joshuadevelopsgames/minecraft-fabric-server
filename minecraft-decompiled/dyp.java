import com.mojang.serialization.MapCodec;

public class dyp extends dsi implements dqc {
   public static final MapCodec<dyp> c = b(dyp::new);

   @Override
   public MapCodec<dyp> a() {
      return c;
   }

   public dyp(eea.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return true;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      a($$0, $$2, new dcv(this));
   }
}
