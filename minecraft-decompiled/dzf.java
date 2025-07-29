import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dzf extends dpz {
   public static final MapCodec<dzf> a = b(dzf::new);
   public static final eez<jh> b = dub.f;
   public static final ees c = eer.A;
   public static final ees d = eer.a;
   protected static final int e = 1;
   protected static final int f = 42;
   private static final int g = 10;
   private static final Map<jh, fjm> h = fjj.c(dpz.a(6.0, 0.0, 10.0, 10.0, 16.0));

   @Override
   public MapCodec<dzf> a() {
      return a;
   }

   public dzf(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, false).b(d, false));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return h.get($$0.c(b));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = $$0.c(b);
      jb $$4 = $$2.a($$3.g());
      eeb $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.c($$1, $$4, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m().b(c, false).b(d, false);
      dmx $$2 = $$0.q();
      jb $$3 = $$0.a();
      jh[] $$4 = $$0.f();

      for (jh $$5 : $$4) {
         if ($$5.o().d()) {
            jh $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      a($$0, $$1, $$2, false, false, -1, null);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, boolean $$3, boolean $$4, int $$5, @Nullable eeb $$6) {
      Optional<jh> $$7 = $$2.d(b);
      if ($$7.isPresent()) {
         jh $$8 = $$7.get();
         boolean $$9 = $$2.d(d).orElse(false);
         boolean $$10 = $$2.d(c).orElse(false);
         dpz $$11 = $$2.b();
         boolean $$12 = !$$3;
         boolean $$13 = false;
         int $$14 = 0;
         eeb[] $$15 = new eeb[42];

         for (int $$16 = 1; $$16 < 42; $$16++) {
            jb $$17 = $$1.a($$8, $$16);
            eeb $$18 = $$0.a_($$17);
            if ($$18.a(dqb.gg)) {
               if ($$18.c(b) == $$8.g()) {
                  $$14 = $$16;
               }
               break;
            }

            if (!$$18.a(dqb.gh) && $$16 != $$5) {
               $$15[$$16] = null;
               $$12 = false;
            } else {
               if ($$16 == $$5) {
                  $$18 = (eeb)MoreObjects.firstNonNull($$6, $$18);
               }

               boolean $$19 = !$$18.c(dze.d);
               boolean $$20 = $$18.c(dze.b);
               $$13 |= $$19 && $$20;
               $$15[$$16] = $$18;
               if ($$16 == $$5) {
                  $$0.a($$1, $$11, 10);
                  $$12 &= $$19;
               }
            }
         }

         $$12 &= $$14 > 1;
         $$13 &= $$12;
         eeb $$21 = $$11.m().c(d, $$12).c(c, $$13);
         if ($$14 > 0) {
            jb $$22 = $$1.a($$8, $$14);
            jh $$23 = $$8.g();
            $$0.a($$22, $$21.b(b, $$23), 3);
            a($$11, $$0, $$22, $$23);
            a($$0, $$22, $$12, $$13, $$9, $$10);
         }

         a($$0, $$1, $$12, $$13, $$9, $$10);
         if (!$$3) {
            $$0.a($$1, $$21.b(b, $$8), 3);
            if ($$4) {
               a($$11, $$0, $$1, $$8);
            }
         }

         if ($$9 != $$12) {
            for (int $$24 = 1; $$24 < $$14; $$24++) {
               jb $$25 = $$1.a($$8, $$24);
               eeb $$26 = $$15[$$24];
               if ($$26 != null) {
                  eeb $$27 = $$0.a_($$25);
                  if ($$27.a(dqb.gh) || $$27.a(dqb.gg)) {
                     $$0.a($$25, $$26.c(d, $$12), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      a($$1, $$2, $$0, false, true, -1, null);
   }

   private static void a(dmu $$0, jb $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, ayz.Bn, aza.e, 0.4F, 0.6F);
         $$0.a(null, ejb.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, ayz.Bm, aza.e, 0.4F, 0.5F);
         $$0.a(null, ejb.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, ayz.Bl, aza.e, 0.4F, 0.7F);
         $$0.a(null, ejb.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, ayz.Bo, aza.e, 0.4F, 1.2F / ($$0.A.i() * 0.2F + 0.9F));
         $$0.a(null, ejb.g, $$1);
      }
   }

   private static void a(dpz $$0, dmu $$1, jb $$2, jh $$3) {
      jh $$4 = $$3.g();
      fbt $$5 = fbp.a($$1, $$4, jh.b);
      $$1.a($$2, $$0, $$5);
      $$1.a($$2.a($$4), $$0, $$5);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = $$0.c(c);
         if ($$4 || $$5) {
            a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$5) {
            a(this, $$1, $$2, $$0.c(b));
         }
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(b) == $$3 ? 15 : 0;
      }
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }
}
