import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class edu extends dsd {
   public static final MapCodec<edu> b = b(edu::new);
   public static final eez<efd> c = eer.bk;
   public static final ees d = eer.B;
   public static final int e = 4;
   private static final fjm f = dpz.c(16.0, 0.0, 4.0);
   private static final Map<jh, fjm> g = fjj.d(fjj.a(f, dpz.c(4.0, 4.0, 16.0)));
   private static final Map<jh, fjm> h = fjj.d(fjj.a(f, dpz.c(4.0, 4.0, 20.0)));

   @Override
   protected MapCodec<edu> a() {
      return b;
   }

   public edu(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jh.c).b(c, efd.a).b(d, false));
   }

   @Override
   protected boolean g_(eeb $$0) {
      return true;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return ($$0.c(d) ? g : h).get($$0.c(a));
   }

   private boolean a(eeb $$0, eeb $$1) {
      dpz $$2 = $$0.c(c) == efd.a ? dqb.bI : dqb.by;
      return $$1.a($$2) && $$1.c(edt.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.C && $$3.gu()) {
         jb $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      jb $$4 = $$2.a($$0.c(a).g());
      if (this.a($$0, $$1.a_($$4))) {
         $$1.b($$4, true);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.g() == $$0.c(a) && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      eeb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dqb.ca) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$0.a((dmx)$$1, $$2)) {
         $$1.b($$2.a($$0.c(a).g()), $$3, fbp.a($$4, $$0.c(a).g()));
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv($$2.c(c) == efd.b ? dqb.by : dqb.bI);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
