import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvq extends dpz {
   public static final MapCodec<dvq> a = b(dvq::new);
   public static final eez<efc> b = eer.bj;
   public static final ees c = eer.A;
   public static final efb d = eer.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dvq> a() {
      return a;
   }

   public dvq(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, efc.a).b(d, 0).b(c, false));
   }

   private eeb a(dmx $$0, jb $$1, eeb $$2) {
      efc $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         efc $$4 = $$0.a_($$1.e()).E();
         efc $$5 = $$4.e() ? efc.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public eeb a(dgo $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      boolean $$8 = $$4.o() == jh.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      boolean $$6 = $$1.E($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, $$6), 3);
      }
   }

   private void a(@Nullable bzm $$0, eeb $$1, dmu $$2, jb $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ejb.H, $$3);
      }
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      return (bxj)($$0.a(azx.bB) && $$6.c() == jh.b ? bxj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(azj.ah);
      }

      return bxj.a;
   }

   @Override
   protected void a_(eeb $$0, dmu $$1, jb $$2, cut $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(azj.ag);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, ($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(eeb $$0, dmu $$1, jb $$2, int $$3, int $$4) {
      efc $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(me.ad, $$2.u() + 0.5, $$2.v() + 1.2, $$2.w() + 0.5, $$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jl<ayy> $$10;
      if ($$5.d()) {
         ame $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jl.a(ayy.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, $$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, $$10, aza.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private ame a(dmu $$0, jb $$1) {
      return $$0.c_($$1.d()) instanceof ecp $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }
}
