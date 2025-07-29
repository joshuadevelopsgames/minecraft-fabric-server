import com.mojang.serialization.MapCodec;

public class duv extends dwq implements dxl {
   public static final MapCodec<duv> b = b(duv::new);
   public static final ees c = eer.I;
   public static final ees d = eer.A;
   private static final int f = 8;
   public static final int e = 128;
   private static final int g = 200;

   @Override
   public MapCodec<duv> a() {
      return b;
   }

   public duv(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jh.b).b(c, false).b(d, false));
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      return this.m().b(a, $$0.k()).b(c, $$2);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(eeb $$0, dmu $$1, jb $$2) {
      $$1.a($$2, $$0.b(d, true), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(eeb $$0, dmu $$1, jb $$2) {
      jh $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, fbp.a($$1, $$3, null));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      $$1.a($$2, $$0.b(d, false), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$1.ag() && $$1.A.a(200) <= $$1.ae() % 200L && $$2.v() == $$1.a(eka.a.b, $$2.u(), $$2.w()) - 1) {
         bcf.a($$0.c(a).o(), $$1, $$2, 0.125, me.aW, bwu.a(1, 2));
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if ($$0.c(d)) {
         this.e($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.V().a($$2, this)) {
            $$1.a($$2, $$0.b(d, false), 18);
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }
}
