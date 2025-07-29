import com.mojang.serialization.MapCodec;

public class dwr extends dpz implements dqc {
   public static final MapCodec<dwr> a = b(dwr::new);

   @Override
   public MapCodec<dwr> a() {
      return a;
   }

   public dwr(eea.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.c($$2.e(), dqb.tr.m());
   }

   @Override
   public jb a(jb $$0) {
      return $$0.e();
   }
}
