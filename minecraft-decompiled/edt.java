import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class edt extends dsd {
   public static final MapCodec<edt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, edt::new)
   );
   public static final ees c = eer.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<jh, fjm> h = fjj.d(dpz.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<edt> a() {
      return b;
   }

   public edt(boolean $$0, eea.d $$1) {
      super($$1);
      this.l(this.C.b().b(a, jh.c).b(c, false));
      this.i = $$0;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fjj.b();
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(a, $$0.d().g()).b(c, false);
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new edx($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jb $$5 = $$1.a($$3, 2);
         eeb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dqb.ca) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof edw $$9 && $$9.a() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.v() || ((aub)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dnm $$0, jb $$1, jh $$2) {
      for (jh $$3 : jh.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jh.a)) {
         return true;
      } else {
         jb $$4 = $$1.d();

         for (jh $$5 : jh.values()) {
            if ($$5 != jh.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(eeb $$0, dmu $$1, jb $$2, int $$3, int $$4) {
      jh $$5 = $$0.c(a);
      eeb $$6 = $$0.b(c, true);
      if (!$$1.C) {
         boolean $$7 = this.a($$1, $$2, $$5);
         if ($$7 && ($$3 == 1 || $$3 == 2)) {
            $$1.a($$2, $$6, 2);
            return false;
         }

         if (!$$7 && $$3 == 0) {
            return false;
         }
      }

      if ($$3 == 0) {
         if (!this.a($$1, $$2, $$5, true)) {
            return false;
         }

         $$1.a($$2, $$6, 67);
         $$1.a(null, $$2, ayz.vo, aza.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ejb.a, $$2, ejb.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         eaz $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof edw) {
            ((edw)$$8).k();
         }

         eeb $$9 = dqb.ca.m().b(eds.b, $$5).b(eds.c, this.i ? efd.b : efd.a);
         $$1.a($$2, $$9, 276);
         $$1.a(eds.a($$2, $$9, this.m().b(a, jh.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            jb $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            eeb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dqb.ca) && $$1.c_($$10) instanceof edw $$14 && $$14.c() == $$5 && $$14.a()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != faq.a && !$$11.a(dqb.bI) && !$$11.a(dqb.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, ayz.vn, aza.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ejb.e, $$2, ejb.a.a($$9));
      }

      return true;
   }

   public static boolean a(eeb $$0, dmu $$1, jb $$2, jh $$3, boolean $$4, jh $$5) {
      if ($$2.v() < $$1.L_() || $$2.v() > $$1.ao() || !$$1.F_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dqb.cy) || $$0.a(dqb.pT) || $$0.a(dqb.pU) || $$0.a(dqb.tZ)) {
         return false;
      } else if ($$3 == jh.a && $$2.v() == $$1.L_()) {
         return false;
      } else if ($$3 == jh.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dqb.bI) && !$$0.a(dqb.by)) {
            if ($$0.e($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.r()) {
               case c:
                  return false;
               case b:
                  return $$4;
               case e:
                  return $$3 == $$5;
            }
         } else if ($$0.c(c)) {
            return false;
         }

         return !$$0.x();
      }
   }

   private boolean a(dmu $$0, jb $$1, jh $$2, boolean $$3) {
      jb $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dqb.bJ)) {
         $$0.a($$4, dqb.a.m(), 276);
      }

      edx $$5 = new edx($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jb, eeb> $$6 = Maps.newHashMap();
         List<jb> $$7 = $$5.c();
         List<eeb> $$8 = Lists.newArrayList();

         for (jb $$9 : $$7) {
            eeb $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jb> $$11 = $$5.d();
         eeb[] $$12 = new eeb[$$7.size() + $$11.size()];
         jh $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jb $$16 = $$11.get($$15);
            eeb $$17 = $$0.a_($$16);
            eaz $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            if (!$$17.a(azo.aQ) && $$0.B_()) {
               $$0.c(2001, $$16, j($$17));
            }

            $$0.a($$16, dqb.a.m(), 18);
            $$0.a(ejb.f, $$16, ejb.a.a($$17));
            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jb $$20 = $$7.get($$19);
            eeb $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            eeb $$22 = dqb.ca.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(eds.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            efd $$23 = this.i ? efd.b : efd.a;
            eeb $$24 = dqb.bJ.m().b(edu.a, $$2).b(edu.c, $$23);
            eeb $$25 = dqb.ca.m().b(eds.b, $$2).b(eds.c, this.i ? efd.b : efd.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(eds.a($$4, $$25, $$24, $$2, true, true));
         }

         eeb $$26 = dqb.a.m();

         for (jb $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jb, eeb> $$28 : $$6.entrySet()) {
            jb $$29 = $$28.getKey();
            eeb $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         fbt $$31 = fbp.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            eeb $$33 = $$12[$$14++];
            jb $$34 = $$11.get($$32);
            if ($$0 instanceof aub $$35) {
               $$33.a($$35, $$34, false);
            }

            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$36 = $$7.size() - 1; $$36 >= 0; $$36--) {
            $$0.a($$7.get($$36), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dqb.bJ, $$31);
         }

         return true;
      }
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
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(eeb $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
