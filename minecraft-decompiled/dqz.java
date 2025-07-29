import com.mojang.serialization.MapCodec;

public class dqz extends dts implements dqx {
   public static final MapCodec<dqz> c = b(dqz::new);

   @Override
   public MapCodec<dqz> a() {
      return c;
   }

   public dqz(eea.d $$0) {
      super($$0, jh.a, z_, false);
      this.l(this.C.b().b(A_, false));
   }

   @Override
   protected dtt c() {
      return (dtt)dqb.te;
   }

   @Override
   protected eeb a(eeb $$0, eeb $$1) {
      return $$1.b(A_, $$0.c(A_));
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dcz.yb);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      return dqx.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(A_);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return !$$2.c(A_);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.a($$2, $$3.b(A_, true), 2);
   }
}
