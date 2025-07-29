import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dqp extends dpl implements dxl {
   public static final MapCodec<dqp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.BOOL.fieldOf("spawn_particles").forGetter($$0x -> $$0x.i), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter($$0x -> $$0x.D), t()
         )
         .apply($$0, dqp::new)
   );
   public static final ees b = eer.u;
   public static final ees c = eer.D;
   public static final ees d = eer.I;
   public static final eez<jh> e = eer.T;
   private static final fjm f = dpz.b(16.0, 0.0, 7.0);
   private static final fjm g = dpz.b(4.0, 0.0, 16.0);
   private static final int h = 5;
   private final boolean i;
   private final int D;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(boolean $$0, int $$1, eea.d $$2) {
      super($$2);
      this.i = $$0;
      this.D = $$1;
      this.l(this.C.b().b(b, true).b(c, false).b(d, false).b(e, jh.c));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$2.c_($$3) instanceof ebg $$8) {
         dcv $$9 = $$4.b($$5);
         if ($$2.R().a(dhv.h).a($$9)) {
            if ($$2 instanceof aub $$10 && $$8.a($$10, $$4, $$9)) {
               $$4.a(azj.aw);
               return bxj.b;
            }

            return bxj.c;
         }
      }

      return bxj.f;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$0.c(b) && $$3 instanceof cam) {
         $$3.a($$1.al().b(), (float)this.D);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      dmv $$1 = $$0.q();
      jb $$2 = $$0.a();
      boolean $$3 = $$1.b_($$2).a() == fam.c;
      return this.m().b(d, $$3).b(c, this.o($$1.a_($$2.e()))).b(b, !$$3).b(e, $$0.g());
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4 == jh.a ? $$0.b(c, this.o($$6)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private boolean o(eeb $$0) {
      return $$0.a(dqb.iL);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         if ($$3.a(10) == 0) {
            $$1.a($$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, ayz.dM, aza.e, 0.5F + $$3.i(), $$3.i() * 0.7F + 0.6F, false);
         }

         if (this.i && $$3.a(5) == 0) {
            for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
               $$1.a(me.ab, $$2.u() + 0.5, $$2.v() + 0.5, $$2.w() + 0.5, $$3.i() / 2.0F, 5.0E-5, $$3.i() / 2.0F);
            }
         }
      }
   }

   public static void a(@Nullable bzm $$0, dmv $$1, jb $$2, eeb $$3) {
      if ($$1.B_()) {
         for (int $$4 = 0; $$4 < 20; $$4++) {
            a((dmu)$$1, $$2, $$3.c(c), true);
         }
      }

      $$1.a($$0, ejb.c, $$2);
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      if (!$$2.c(eer.I) && $$3.a() == fam.c) {
         boolean $$4 = $$2.c(b);
         if ($$4) {
            if (!$$0.B_()) {
               $$0.a(null, $$1, ayz.kS, aza.e, 1.0F, 1.0F);
            }

            a(null, $$0, $$1, $$2);
         }

         $$0.a($$1, $$2.b(d, true).b(b, false), 3);
         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      jb $$4 = $$2.b();
      if ($$0 instanceof aub $$5 && $$3.cb() && $$3.c($$5, $$4) && !$$1.c(b) && !$$1.c(d)) {
         $$0.a($$4, $$1.b(eer.u, true), 11);
      }
   }

   public static void a(dmu $$0, jb $$1, boolean $$2, boolean $$3) {
      bck $$4 = $$0.H_();
      mi $$5 = $$2 ? me.ax : me.aw;
      $$0.a(
         $$5,
         true,
         $$1.u() + 0.5 + $$4.j() / 3.0 * ($$4.h() ? 1 : -1),
         $$1.v() + $$4.j() + $$4.j(),
         $$1.w() + 0.5 + $$4.j() / 3.0 * ($$4.h() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if ($$3) {
         $$0.a(me.ah, $$1.u() + 0.5 + $$4.j() / 4.0 * ($$4.h() ? 1 : -1), $$1.v() + 0.4, $$1.w() + 0.5 + $$4.j() / 4.0 * ($$4.h() ? 1 : -1), 0.0, 0.005, 0.0);
      }
   }

   public static boolean a(dmu $$0, jb $$1) {
      for (int $$2 = 1; $$2 <= 5; $$2++) {
         jb $$3 = $$1.c($$2);
         eeb $$4 = $$0.a_($$3);
         if (h($$4)) {
            return true;
         }

         boolean $$5 = fjj.c(g, $$4.b($$0, $$1, fix.a()), fiw.i);
         if ($$5) {
            eeb $$6 = $$0.a_($$3.e());
            return h($$6);
         }
      }

      return false;
   }

   public static boolean h(eeb $$0) {
      return $$0.b(b) && $$0.a(azo.aZ) && $$0.c(b);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      if ($$0 instanceof aub $$3) {
         if ($$1.c(b)) {
            dht.a<dif, dgx> $$4 = dht.a(dhx.e);
            return a($$2, ebb.H, ($$2x, $$3x, $$4x, $$5) -> ebg.a($$3, $$3x, $$4x, $$5, $$4));
         } else {
            return a($$2, ebb.H, ebg::a);
         }
      } else {
         return $$1.c(b) ? a($$2, ebb.H, ebg::b) : null;
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   public static boolean i(eeb $$0) {
      return $$0.a(azo.aZ, $$0x -> $$0x.b(d) && $$0x.b(b)) && !$$0.c(d) && !$$0.c(b);
   }
}
