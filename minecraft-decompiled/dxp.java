import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxp extends dsi implements dqc, dxl {
   public static final MapCodec<dxp> c = b(dxp::new);
   private static final ees e = eer.I;
   public static final eez<jh> d = eer.T;
   private static final fjm f = dpz.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dxp> a() {
      return c;
   }

   public dxp(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eex.b).b(e, false).b(d, jh.c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(azo.bB) || $$1.b_($$2.d()).a(fam.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      if (!$$0.B_()) {
         jb $$5 = $$1.d();
         eeb $$6 = dsi.b($$0, $$5, this.m().b(b, eex.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      if ($$0.c(b) == eex.a) {
         return super.a($$0, $$1, $$2);
      } else {
         jb $$3 = $$2.e();
         eeb $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, e, d);
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
      if ($$3.c(dsi.b) == eex.b) {
         jb $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dpw.a($$0, $$1, $$2, $$3.c(d));
      } else {
         jb $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
