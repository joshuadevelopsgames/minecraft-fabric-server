import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dpx extends dub implements dqc, dxl {
   public static final MapCodec<dpx> a = b(dpx::new);
   private static final ees b = eer.I;
   private static final Map<jh, fjm> c = fjj.c(dpz.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   protected dpx(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(f, jh.c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(f));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, f);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      eeb $$4 = $$1.a_($$3);
      eeb $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(azo.bC)) && ($$5.a(this) || $$5.a(dqb.to));
   }

   protected static boolean a(dmv $$0, jb $$1, fal $$2, jh $$3) {
      eeb $$4 = dqb.tp.m().b(b, $$2.a(fam.c)).b(f, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (($$4 == jh.a || $$4 == jh.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      Optional<jb> $$3 = m.a($$0, $$1, $$2.b(), jh.b, dqb.to);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jb $$4 = $$3.get().d();
         eeb $$5 = $$0.a_($$4);
         return dpw.a((dmw)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      Optional<jb> $$4 = m.a($$0, $$2, $$3.b(), jh.b, dqb.to);
      if (!$$4.isEmpty()) {
         jb $$5 = $$4.get();
         jb $$6 = $$5.d();
         jh $$7 = $$3.c(f);
         a($$0, $$5, $$0.b_($$5), $$7);
         dpw.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dqb.to);
   }
}
