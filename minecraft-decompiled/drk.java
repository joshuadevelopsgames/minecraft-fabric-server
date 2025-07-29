import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drk extends dsc implements dsu {
   public static final MapCodec<drk> a = b(drk::new);
   public static final eez<eeu> b = eer.bh;

   @Override
   public MapCodec<drk> a() {
      return a;
   }

   public drk(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(f, jh.c).b(c, false).b(b, eeu.a));
   }

   @Override
   protected int h(eeb $$0) {
      return 2;
   }

   @Override
   public eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !this.a($$1, $$5, $$6) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected int a(dly $$0, jb $$1, eeb $$2) {
      eaz $$3 = $$0.c_($$1);
      return $$3 instanceof ebl ? ((ebl)$$3).a() : 0;
   }

   private int e(dmu $$0, jb $$1, eeb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((dnm)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == eeu.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dmu $$0, jb $$1, eeb $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((dnm)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == eeu.a;
      }
   }

   @Override
   protected int b(dmu $$0, jb $$1, eeb $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      jh $$4 = $$2.c(f);
      jb $$5 = $$1.a($$4);
      eeb $$6 = $$0.a_($$5);
      if ($$6.q()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.d($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         cqs $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.y(), $$6.q() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private cqs a(dmu $$0, jh $$1, jb $$2) {
      List<cqs> $$3 = $$0.a(cqs.class, new fin($$2.u(), $$2.v(), $$2.w(), $$2.u() + 1, $$2.v() + 1, $$2.w() + 1), $$1x -> $$1x != null && $$1x.cS() == $$1);
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$3.gt().e) {
         return bxj.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == eeu.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, ayz.fv, aza.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bxj.a;
      }
   }

   @Override
   protected void c(dmu $$0, jb $$1, eeb $$2) {
      if (!$$0.V().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         eaz $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof ebl ? ((ebl)$$4).a() : 0;
         if ($$3 != $$5 || $$2.c(c) != this.a($$0, $$1, $$2)) {
            fko $$6 = this.b($$0, $$1, $$2) ? fko.c : fko.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dmu $$0, jb $$1, eeb $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      eaz $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof ebl $$6) {
         $$5 = $$6.a();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == eeu.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(c);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.b(c, false), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.b(c, true), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(eeb $$0, dmu $$1, jb $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      eaz $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebl($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f, b, c);
   }
}
