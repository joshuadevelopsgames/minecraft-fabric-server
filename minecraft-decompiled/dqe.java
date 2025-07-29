import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqe extends dpl {
   public static final MapCodec<dqe> a = b(dqe::new);
   public static final ees[] b = new ees[]{eer.n, eer.o, eer.p};
   private static final fjm c = fjj.a(dpz.b(2.0, 2.0, 14.0), dpz.b(14.0, 0.0, 2.0));

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b[0], false).b(b[1], false).b(b[2], false));
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? null : a($$2, ebb.m, ebd::a);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof ebd $$5) {
         $$3.a($$5);
         $$3.a(azj.ab);
      }

      return bxj.a;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      double $$4 = $$2.u() + 0.4 + $$3.i() * 0.2;
      double $$5 = $$2.v() + 0.7 + $$3.i() * 0.3;
      double $$6 = $$2.w() + 0.4 + $$3.i() * 0.2;
      $$1.a(me.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
