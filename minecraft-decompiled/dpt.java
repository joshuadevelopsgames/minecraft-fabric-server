import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpt extends dpl {
   public static final MapCodec<dpt> a = b(dpt::new);
   public static final eez<jh> b = dub.f;
   public static final efb c = eer.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dpt> a() {
      return a;
   }

   public dpt(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0).b(b, jh.c));
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dmu $$0, cut $$1, jb $$2, eeb $$3, @Nullable eaz $$4, dcv $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof eaw $$6) {
         if (!djk.a($$5, azr.q)) {
            $$6.a($$1, $$3, eaw.b.c);
            bxf.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((auc)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dmu $$0, jb $$1) {
      fin $$2 = new fin($$1).c(8.0, 6.0, 8.0);
      List<cme> $$3 = $$0.a(cme.class, $$2);
      if (!$$3.isEmpty()) {
         List<cut> $$4 = $$0.a(cut.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cme $$5 : $$3) {
            if ($$5.e() == null) {
               cut $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(dmu $$0, jb $$1) {
      a($$0, $$1, new dcv(dcz.yf, 3));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         dcr $$9 = $$0.h();
         if ($$0.a(dcz.tu)) {
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), ayz.bX, aza.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, cam.d($$5));
            $$8 = true;
            $$2.a($$4, ejb.M, $$3);
         } else if ($$0.a(dcz.tJ)) {
            $$0.h(1);
            $$2.a($$4, $$4.dC(), $$4.dE(), $$4.dI(), ayz.cC, aza.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new dcv(dcz.yi));
            } else if (!$$4.gs().g(new dcv(dcz.yi))) {
               $$4.a(new dcv(dcz.yi), false);
            }

            $$8 = true;
            $$2.a($$4, ejb.y, $$3);
         }

         if (!$$2.B_() && $$8) {
            $$4.b(azj.c.b($$9));
         }
      }

      if ($$8) {
         if (!dqp.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, eaw.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return bxj.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dmu $$0, jb $$1) {
      return $$0.c_($$1) instanceof eaw $$3 ? !$$3.c() : false;
   }

   public void a(dmu $$0, eeb $$1, jb $$2, @Nullable cut $$3, eaw.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof eaw $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dmu $$0, eeb $$1, jb $$2) {
      $$0.a($$2, $$1.b(c, 0), 3);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fjm $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jh.a.b);
         if ($$4 >= 1.0 && !$$2.a(azo.aw)) {
            double $$5 = $$3.b(jh.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, $$1.v() + $$5 - 0.05);
            } else {
               jb $$6 = $$1.e();
               eeb $$7 = $$0.a_($$6);
               fjm $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jh.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, $$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dmu $$0, jb $$1, fjm $$2, double $$3) {
      this.a($$0, $$1.u() + $$2.b(jh.a.a), $$1.u() + $$2.c(jh.a.a), $$1.w() + $$2.b(jh.a.c), $$1.w() + $$2.c(jh.a.c), $$3);
   }

   private void a(dmu $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(me.ay, bcb.d($$0.A.j(), $$1, $$2), $$5, bcb.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eaw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? null : a($$2, ebb.I, eaw::a);
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if ($$0 instanceof aub $$4 && $$3.gu() && $$4.P().c(dmq.i) && $$0.c_($$1) instanceof eaw $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            dcv $$9 = new dcv(this);
            $$9.b($$6.r());
            $$9.b(kq.aq, dev.a.a(c, $$7));
            cqz $$10 = new cqz($$0, $$1.u(), $$1.v(), $$1.w(), $$9);
            $$10.i();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      bzm $$2 = $$1.b(fgd.a);
      if ($$2 instanceof cra || $$2 instanceof crh || $$2 instanceof cwd || $$2 instanceof cqm || $$2 instanceof cxu) {
         eaz $$3 = $$1.b(fgd.h);
         if ($$3 instanceof eaw $$4) {
            $$4.a(null, $$0, eaw.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      dcv $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kq.aq, dev.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$1.a_($$5).b() instanceof dtc && $$1.c_($$3) instanceof eaw $$9) {
         $$9.a(null, $$0, eaw.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
