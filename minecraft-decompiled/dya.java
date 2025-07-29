import com.mojang.serialization.MapCodec;

public class dya extends dpz {
   public static final MapCodec<dya> a = b(dya::new);
   private static final fjm b = dpz.b(12.0, 13.0, 16.0);
   private static final int c = 14;
   private static final int d = 10;
   private static final int e = 10;

   @Override
   public MapCodec<dya> a() {
      return a;
   }

   public dya(eea.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return dpz.a($$1, $$2.d(), jh.a) && !$$1.B($$2);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.b && !this.a($$0, $$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = $$4 + $$3.j();
      double $$8 = $$5 + 0.7;
      double $$9 = $$6 + $$3.j();
      $$1.a(me.aC, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      jb.a $$10 = new jb.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + bcb.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + bcb.a($$3, -10, 10));
         eeb $$12 = $$1.a_($$10);
         if (!$$12.m($$1, $$10)) {
            $$1.a(me.aG, $$10.u() + $$3.j(), $$10.v() + $$3.j(), $$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }
}
