import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class drv extends dpl {
   public static final MapCodec<drv> a = b(drv::new);
   public static final eez<jh.a> b = eer.K;
   public static final eez<eev> c = eer.bE;
   public static final ees d = eer.w;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, jh.a.b).b(c, eev.a).b(d, false));
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eev.a ? a($$2, ebb.k, ebp::a) : null;
      }
   }

   public static boolean a(dmu $$0) {
      return $$0.Y();
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eev.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a($$2.u(), $$2.v(), $$2.w(), ayz.gD, aza.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      eeb $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static eeb d(eeb $$0, dmu $$1, jb $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eev.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eev.c : eev.b) : $$0;
   }

   public static boolean b(eeb $$0, dmx $$1, jb $$2) {
      jh.a $$3 = $$0.c(b);

      for (jh $$4 : $$3.g()) {
         eeb $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(azo.s) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(dmv $$0, jb $$1) {
      for (jh $$2 : jh.values()) {
         jb $$3 = $$1.a($$2);
         eeb $$4 = $$0.a_($$3);
         if (!$$4.a(azo.s)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return dwt.b($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$1.c_($$2) instanceof ebp $$5 && $$3 instanceof dnk $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cut $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if ($$0.c_($$1) instanceof ebp $$4) {
         $$4.a($$3.ea().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cut $$0, eeb $$1, dmu $$2, jb $$3) {
      if (!$$0.gu() && !$$0.am() && $$1.c(d) && $$2 instanceof aub $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      if ($$0.c(c) == eev.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof ebp $$3 ? $$3.d() : 0;
      }
   }
}
