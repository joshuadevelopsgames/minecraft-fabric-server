import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dsa extends dpl implements dxl {
   public static final MapCodec<dsa> a = b(dsa::new);
   public static final ame b = ame.b("sherds");
   public static final eez<jh> c = eer.T;
   public static final ees d = eer.bA;
   public static final ees e = eer.I;
   private static final fjm f = dpz.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dsa> a() {
      return a;
   }

   protected dsa(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, jh.c).b(e, false).b(d, false));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g()).b(e, $$1.a() == fam.c).b(d, false);
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$2.c_($$3) instanceof ebr $$7) {
         if ($$2.C) {
            return bxj.a;
         } else {
            dcv $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || dcv.c($$9, $$0) && $$9.M() < $$9.k())) {
               $$7.a(ebr.a.a);
               $$4.b(azj.c.b($$0.h()));
               dcv $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / $$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / $$9.k();
               }

               $$2.a(null, $$3, ayz.gW, aza.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aub $$13) {
                  $$13.a(me.ba, $$3.u() + 0.5, $$3.v() + 1.2, $$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, ejb.c, $$3);
               return bxj.a;
            } else {
               return bxj.f;
            }
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.c_($$2) instanceof ebr $$5) {
         $$1.a(null, $$2, ayz.gX, aza.e, 1.0F, 1.0F);
         $$5.a(ebr.a.b);
         $$1.a($$3, ejb.c, $$2);
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return f;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebr($$0, $$1);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      eaz $$2 = $$1.b(fgd.h);
      if ($$2 instanceof ebr $$3) {
         $$1.a(b, $$1x -> {
            for (dcr $$2x : $$3.u().a()) {
               $$1x.accept($$2x.m());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      dcv $$4 = $$3.fh();
      eeb $$5 = $$2;
      if ($$4.a(azx.bQ) && !djk.a($$4, azr.r)) {
         $$5 = $$2.b(d, true);
         $$0.a($$1, $$5, 260);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxx h_(eeb $$0) {
      return $$0.c(d) ? dxx.be : dxx.bd;
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      jb $$4 = $$2.b();
      if ($$0 instanceof aub $$5 && $$3.c($$5, $$4) && $$3.a($$5)) {
         $$0.a($$4, $$1.b(d, true), 260);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      if ($$0.c_($$1) instanceof ebr $$4) {
         ech $$5 = $$4.u();
         return ebr.a($$5);
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.a($$1.c_($$2));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
