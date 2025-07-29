import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwm extends dwl {
   public static final MapCodec<dwm> f = b(dwm::new);
   public static final eez<jh> g = dub.f;
   public static final ees h = dwl.b;

   @Override
   public MapCodec<dwm> a() {
      return f;
   }

   protected dwm(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(g, jh.c).b(h, true));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return dzs.o($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return dzs.b($$1, $$2, $$0.c(g));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.g() == $$0.c(g) && !$$0.a($$1, $$3) ? dqb.a.m() : $$0;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = dqb.cA.a($$0);
      return $$1 == null ? null : this.m().b(g, $$1.c(g));
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(h)) {
         jh $$4 = $$0.c(g).g();
         double $$5 = 0.27;
         double $$6 = $$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * $$4.j();
         double $$7 = $$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = $$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * $$4.l();
         $$1.a(lz.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dmu $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(g).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(h) && $$0.c(g) != $$3 ? 15 : 0;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(g, h);
   }

   @Nullable
   @Override
   protected fbt a(dmu $$0, eeb $$1) {
      return fbp.a($$0, $$1.c(g).g(), jh.b);
   }
}
