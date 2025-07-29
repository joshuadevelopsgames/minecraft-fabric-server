import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dwj extends dpz {
   public static final MapCodec<dwj> a = b(dwj::new);
   public static final eez<efg> b = eer.ae;
   public static final eez<efg> c = eer.ad;
   public static final eez<efg> d = eer.af;
   public static final eez<efg> e = eer.ag;
   public static final efb f = eer.aW;
   public static final Map<jh, eez<efg>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jh.c, b, jh.f, c, jh.d, d, jh.e, e)));
   private static final int[] h = ag.a(new int[16], $$0 -> {
      for (int $$1 = 0; $$1 <= 15; $$1++) {
         float $$2 = $$1 / 15.0F;
         float $$3 = $$2 * 0.6F + ($$2 > 0.0F ? 0.4F : 0.3F);
         float $$4 = bcb.a($$2 * $$2 * 0.7F - 0.5F, 0.0F, 1.0F);
         float $$5 = bcb.a($$2 * $$2 * 0.6F - 0.7F, 0.0F, 1.0F);
         $$0[$$1] = baj.a(1.0F, $$3, $$4, $$5);
      }
   });
   private static final float i = 0.2F;
   private final Function<eeb, fjm> D;
   private final eeb R;
   private final fbv S = new fbo(this);
   private boolean T = true;

   @Override
   public MapCodec<dwj> a() {
      return a;
   }

   public dwj(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, efg.c).b(c, efg.c).b(d, efg.c).b(e, efg.c).b(f, 0));
      this.D = this.b();
      this.R = this.m().b(b, efg.b).b(c, efg.b).b(d, efg.b).b(e, efg.b);
   }

   private Function<eeb, fjm> b() {
      int $$0 = 1;
      int $$1 = 10;
      fjm $$2 = dpz.b(10.0, 0.0, 1.0);
      Map<jh, fjm> $$3 = fjj.c(dpz.a(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<jh, fjm> $$4 = fjj.c(dpz.b(10.0, 16.0, 0.0, 1.0));
      return this.a($$3x -> {
         fjm $$4x = $$2;

         for (Entry<jh, eez<efg>> $$5 : g.entrySet()) {
            $$4x = switch ((efg)$$3x.c($$5.getValue())) {
               case a -> fjj.a($$4x, $$3.get($$5.getKey()), $$4.get($$5.getKey()));
               case b -> fjj.a($$4x, $$3.get($$5.getKey()));
               case c -> $$4x;
            };
         }

         return $$4x;
      }, new efe[]{f});
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.D.apply($$0);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.a($$0.q(), this.R, $$0.a());
   }

   private eeb a(dly $$0, eeb $$1, jb $$2) {
      boolean $$3 = r($$1);
      $$1 = this.b($$0, this.m().b(f, $$1.c(f)), $$2);
      if ($$3 && r($$1)) {
         return $$1;
      } else {
         boolean $$4 = $$1.c(b).a();
         boolean $$5 = $$1.c(d).a();
         boolean $$6 = $$1.c(c).a();
         boolean $$7 = $$1.c(e).a();
         boolean $$8 = !$$4 && !$$5;
         boolean $$9 = !$$6 && !$$7;
         if (!$$7 && $$8) {
            $$1 = $$1.b(e, efg.b);
         }

         if (!$$6 && $$8) {
            $$1 = $$1.b(c, efg.b);
         }

         if (!$$4 && $$9) {
            $$1 = $$1.b(b, efg.b);
         }

         if (!$$5 && $$9) {
            $$1 = $$1.b(d, efg.b);
         }

         return $$1;
      }
   }

   private eeb b(dly $$0, eeb $$1, jb $$2) {
      boolean $$3 = !$$0.a_($$2.d()).d($$0, $$2);

      for (jh $$4 : jh.c.a) {
         if (!$$1.c(g.get($$4)).a()) {
            efg $$5 = this.a($$0, $$2, $$4, $$3);
            $$1 = $$1.b(g.get($$4), $$5);
         }
      }

      return $$1;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.a) {
         return !this.a($$1, $$5, $$6) ? dqb.a.m() : $$0;
      } else if ($$4 == jh.b) {
         return this.a($$1, $$0, $$3);
      } else {
         efg $$8 = this.a($$1, $$3, $$4);
         return $$8.a() == $$0.c(g.get($$4)).a() && !q($$0) ? $$0.b(g.get($$4), $$8) : this.a($$1, this.R.b(f, $$0.c(f)).b(g.get($$4), $$8), $$3);
      }
   }

   private static boolean q(eeb $$0) {
      return $$0.c(b).a() && $$0.c(d).a() && $$0.c(c).a() && $$0.c(e).a();
   }

   private static boolean r(eeb $$0) {
      return !$$0.c(b).a() && !$$0.c(d).a() && !$$0.c(c).a() && !$$0.c(e).a();
   }

   @Override
   protected void a(eeb $$0, dmv $$1, jb $$2, int $$3, int $$4) {
      jb.a $$5 = new jb.a();

      for (jh $$6 : jh.c.a) {
         efg $$7 = $$0.c(g.get($$6));
         if ($$7 != efg.c && !$$1.a_($$5.a($$2, $$6)).a(this)) {
            $$5.c(jh.a);
            eeb $$8 = $$1.a_($$5);
            if ($$8.a(this)) {
               jb $$9 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$9, $$1.a_($$9), $$3, $$4);
            }

            $$5.a($$2, $$6).c(jh.b);
            eeb $$10 = $$1.a_($$5);
            if ($$10.a(this)) {
               jb $$11 = $$5.a($$6.g());
               $$1.a($$6.g(), $$5, $$11, $$1.a_($$11), $$3, $$4);
            }
         }
      }
   }

   private efg a(dly $$0, jb $$1, jh $$2) {
      return this.a($$0, $$1, $$2, !$$0.a_($$1.d()).d($$0, $$1));
   }

   private efg a(dly $$0, jb $$1, jh $$2, boolean $$3) {
      jb $$4 = $$1.a($$2);
      eeb $$5 = $$0.a_($$4);
      if ($$3) {
         boolean $$6 = $$5.b() instanceof dzb || this.a($$0, $$4, $$5);
         if ($$6 && o($$0.a_($$4.d()))) {
            if ($$5.c($$0, $$4, $$2.g())) {
               return efg.a;
            }

            return efg.b;
         }
      }

      return !a($$5, $$2) && ($$5.d($$0, $$4) || !o($$0.a_($$4.e()))) ? efg.c : efg.b;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      eeb $$4 = $$1.a_($$3);
      return this.a($$1, $$3, $$4);
   }

   private boolean a(dly $$0, jb $$1, eeb $$2) {
      return $$2.c($$0, $$1, jh.b) || $$2.a(dqb.hD);
   }

   private void a(dmu $$0, jb $$1, eeb $$2, @Nullable fbt $$3, boolean $$4) {
      if (a($$0)) {
         new fbq(this).a($$0, $$1, $$2, $$3, $$4);
      } else {
         this.S.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   public int a(dmu $$0, jb $$1) {
      this.T = false;
      int $$2 = $$0.F($$1);
      this.T = true;
      return $$2;
   }

   private void b(dmu $$0, jb $$1) {
      if ($$0.a_($$1).a(this)) {
         $$0.a($$1, this);

         for (jh $$2 : jh.values()) {
            $$0.a($$1.a($$2), this);
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b()) && !$$1.C) {
         this.a($$1, $$2, $$0, null, true);

         for (jh $$5 : jh.c.b) {
            $$1.a($$2.a($$5), this);
         }

         this.c($$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3) {
         for (jh $$4 : jh.values()) {
            $$1.a($$2.a($$4), this);
         }

         this.a($$1, $$2, $$0, null, false);
         this.c($$1, $$2);
      }
   }

   private void c(dmu $$0, jb $$1) {
      for (jh $$2 : jh.c.a) {
         this.b($$0, $$1.a($$2));
      }

      for (jh $$3 : jh.c.a) {
         jb $$4 = $$1.a($$3);
         if ($$0.a_($$4).d($$0, $$4)) {
            this.b($$0, $$4.d());
         } else {
            this.b($$0, $$4.e());
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$3 != this || !a($$1)) {
            if ($$0.a((dmx)$$1, $$2)) {
               this.a($$1, $$2, $$0, $$4, false);
            } else {
               c($$0, $$1, $$2);
               $$1.a($$2, false);
            }
         }
      }
   }

   private static boolean a(dmu $$0) {
      return $$0.L().b(cyf.c);
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return !this.T ? 0 : $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if (this.T && $$3 != jh.a) {
         int $$4 = $$0.c(f);
         if ($$4 == 0) {
            return 0;
         } else {
            return $$3 != jh.b && !this.a($$1, $$0, $$2).c(g.get($$3.g())).a() ? 0 : $$4;
         }
      } else {
         return 0;
      }
   }

   protected static boolean o(eeb $$0) {
      return a($$0, null);
   }

   protected static boolean a(eeb $$0, @Nullable jh $$1) {
      if ($$0.a(dqb.cH)) {
         return true;
      } else if ($$0.a(dqb.ey)) {
         jh $$2 = $$0.c(dwo.f);
         return $$2 == $$1 || $$2.g() == $$1;
      } else {
         return $$0.a(dqb.lu) ? $$1 == $$0.c(dvs.a) : $$0.p() && $$1 != null;
      }
   }

   @Override
   protected boolean f_(eeb $$0) {
      return this.T;
   }

   public static int b(int $$0) {
      return h[$$0];
   }

   private static void a(dmu $$0, bck $$1, jb $$2, int $$3, jh $$4, jh $$5, float $$6, float $$7) {
      float $$8 = $$7 - $$6;
      if (!($$1.i() >= 0.2F * $$8)) {
         float $$9 = 0.4375F;
         float $$10 = $$6 + $$8 * $$1.i();
         double $$11 = 0.5 + 0.4375F * $$4.j() + $$10 * $$5.j();
         double $$12 = 0.5 + 0.4375F * $$4.k() + $$10 * $$5.k();
         double $$13 = 0.5 + 0.4375F * $$4.l() + $$10 * $$5.l();
         $$0.a(new lz($$3, 1.0F), $$2.u() + $$11, $$2.v() + $$12, $$2.w() + $$13, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      int $$4 = $$0.c(f);
      if ($$4 != 0) {
         for (jh $$5 : jh.c.a) {
            efg $$6 = $$0.c(g.get($$5));
            switch ($$6) {
               case a:
                  a($$1, $$3, $$2, h[$$4], $$5, jh.b, -0.5F, 0.5F);
               case b:
                  a($$1, $$3, $$2, h[$$4], jh.a, $$5, 0.0F, 0.5F);
                  break;
               case c:
               default:
                  a($$1, $$3, $$2, h[$$4], jh.a, $$5, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(b, $$0.c(d)).b(c, $$0.c(e)).b(d, $$0.c(b)).b(e, $$0.c(c));
         case d:
            return $$0.b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(b));
         case b:
            return $$0.b(b, $$0.c(e)).b(c, $$0.c(b)).b(d, $$0.c(c)).b(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         case c:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$3.gt().e) {
         return bxj.e;
      } else {
         if (q($$0) || r($$0)) {
            eeb $$5 = q($$0) ? this.m() : this.R;
            $$5 = $$5.b(f, $$0.c(f));
            $$5 = this.a($$1, $$5, $$2);
            if ($$5 != $$0) {
               $$1.a($$2, $$5, 3);
               this.a($$1, $$2, $$0, $$5);
               return bxj.a;
            }
         }

         return bxj.e;
      }
   }

   private void a(dmu $$0, jb $$1, eeb $$2, eeb $$3) {
      fbt $$4 = fbp.a($$0, null, jh.b);

      for (jh $$5 : jh.c.a) {
         jb $$6 = $$1.a($$5);
         if ($$2.c(g.get($$5)).a() != $$3.c(g.get($$5)).a() && $$0.a_($$6).d($$0, $$6)) {
            $$0.a($$6, $$3.b(), $$5.g(), fbp.a($$4, $$5));
         }
      }
   }
}
