import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public abstract class hfg<T extends cam, S extends hlq, M extends gnh<? super S>> extends hed<T, S> implements hgc<S, M> {
   private static final float a = 0.1F;
   protected M h;
   protected final hof i;
   protected final List<hit<S, M>> j = Lists.newArrayList();

   public hfg(hee.a $$0, M $$1, float $$2) {
      super($$0);
      this.i = $$0.b();
      this.h = $$1;
      this.f = $$2;
   }

   protected final boolean a(hit<S, M> $$0) {
      return this.j.add($$0);
   }

   @Override
   public M c() {
      return this.h;
   }

   protected fin a(T $$0) {
      fin $$1 = super.a($$0);
      if ($$0.a(bzw.f).a(dcz.vS)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fod $$1, gxn $$2, int $$3) {
      $$1.a();
      if ($$0.a(cay.c)) {
         jh $$4 = $$0.as;
         if ($$4 != null) {
            float $$5 = $$0.y - 0.1F;
            $$1.a(-$$4.j() * $$5, 0.0F, -$$4.l() * $$5);
         }
      }

      float $$6 = $$0.ai;
      $$1.b($$6, $$6, $$6);
      this.a($$0, $$1, $$0.ac, $$6);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$1);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.h.a($$0);
      boolean $$7 = this.d($$0);
      boolean $$8 = !$$7 && !$$0.aq;
      gxz $$9 = this.a($$0, $$7, $$8, $$0.ar);
      if ($$9 != null) {
         fog $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = baj.a($$12, this.f($$0));
         this.h.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (hit<S, M> $$14 : this.j) {
            $$14.a($$1, $$2, $$3, $$0, $$0.ad, $$0.ae);
         }
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected boolean e(S $$0) {
      return true;
   }

   protected int f(S $$0) {
      return -1;
   }

   public abstract ame b(S var1);

   @Nullable
   protected gxz a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      ame $$4 = this.b($$0);
      if ($$2) {
         return gxz.i($$4);
      } else if ($$1) {
         return this.h.a($$4);
      } else {
         return $$3 ? gxz.s($$4) : null;
      }
   }

   public static int a(hlq $$0, float $$1) {
      return hri.a(hri.a($$1), hri.a($$0.ap));
   }

   protected boolean d(S $$0) {
      return !$$0.A;
   }

   private static float a(jh $$0) {
      switch ($$0) {
         case d:
            return 90.0F;
         case e:
            return 0.0F;
         case c:
            return 270.0F;
         case f:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   protected boolean a(S $$0) {
      return $$0.al;
   }

   protected void a(S $$0, fod $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos(bcb.d($$0.v) * 3.25F) * Math.PI * 0.4F);
      }

      if (!$$0.a(cay.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.af > 0.0F) {
         float $$4 = ($$0.af - 1.0F) / 20.0F * 1.6F;
         $$4 = bcb.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.ba_()));
      } else if ($$0.ao) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.ae));
         $$1.a(a.d.rotationDegrees($$0.v * -75.0F));
      } else if ($$0.a(cay.c)) {
         jh $$5 = $$0.as;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.ba_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ak) {
         $$1.a(0.0F, ($$0.x + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float ba_() {
      return 90.0F;
   }

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fod $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cj()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fue $$3 = fue.R();
      gwi $$4 = $$3.t;
      boolean $$5 = !$$0.f($$4);
      if ($$0 != $$4) {
         fjz $$6 = $$0.cu();
         fjz $$7 = $$4.cu();
         if ($$6 != null) {
            fjz.b $$8 = $$6.k();
            switch ($$8) {
               case a:
                  return $$5;
               case b:
                  return false;
               case c:
                  return $$7 == null ? $$5 : $$6.a($$7) && ($$6.j() || $$5);
               case d:
                  return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
               default:
                  return true;
            }
         }
      }

      return fue.N() && $$0 != $$3.ap() && $$5 && !$$0.cd();
   }

   public static boolean b(cam $$0) {
      if ($$0 instanceof cut || $$0.i_()) {
         String $$1 = o.a($$0.aj().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cut $$2 && !$$2.a(cuv.a));
         }
      }

      return false;
   }

   protected float g(S $$0) {
      return super.c($$0) * $$0.ai;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = bcb.i($$2, $$0.bu, $$0.bt);
      $$1.ac = a($$0, $$3, $$2);
      $$1.ad = bcb.h($$3 - $$1.ac);
      $$1.ae = $$0.k($$2);
      $$1.at = $$0.al();
      $$1.ak = b($$0);
      if ($$1.ak) {
         $$1.ae *= -1.0F;
         $$1.ad *= -1.0F;
      }

      if (!$$0.cc() && $$0.bO()) {
         $$1.ag = $$0.bp.c($$2);
         $$1.ah = $$0.bp.b($$2);
      } else {
         $$1.ag = 0.0F;
         $$1.ah = 0.0F;
      }

      if ($$0.dm() instanceof cam $$4) {
         $$1.aw = $$4.bp.c($$2);
      } else {
         $$1.aw = $$1.ag;
      }

      $$1.ai = $$0.eq();
      $$1.aj = $$0.ep();
      $$1.au = $$0.aw();
      $$1.as = $$0.ga();
      if ($$1.as != null) {
         $$1.y = $$0.d(cay.a);
      }

      $$1.al = $$0.cA();
      $$1.am = $$0.g_();
      $$1.an = $$0.bm();
      $$1.ao = $$0.fC();
      $$1.ap = $$0.bj > 0 || $$0.bl > 0;
      dcv $$5 = $$0.a(bzw.f);
      if ($$5.h() instanceof dbd $$6 && $$6.c() instanceof dov $$7) {
         $$1.ax = $$7.b();
         $$1.ay = $$5.a(kq.ak);
         $$1.av.b();
      } else {
         $$1.ax = null;
         $$1.ay = null;
         if (!hii.a($$5, bzw.f)) {
            this.i.a($$1.av, $$5, dct.f, $$0);
         } else {
            $$1.av.b();
         }
      }

      $$1.af = $$0.bl > 0 ? $$0.bl + $$2 : 0.0F;
      fue $$8 = fue.R();
      $$1.aq = $$1.A && $$0.f($$8.t);
      $$1.ar = $$8.b($$0);
   }

   protected void a(T $$0, Builder<hlc> $$1, float $$2) {
      fin $$3 = $$0.cV();
      float $$4 = 0.01F;
      hlc $$5 = new hlc($$3.a - $$0.dC(), $$0.cW() - 0.01F, $$3.c - $$0.dI(), $$3.d - $$0.dC(), $$0.cW() + 0.01F, $$3.f - $$0.dI(), 1.0F, 0.0F, 0.0F);
      $$1.add($$5);
   }

   private static float a(cam $$0, float $$1, float $$2) {
      if ($$0.dm() instanceof cam $$3) {
         float $$4 = bcb.i($$2, $$3.bs, $$3.br);
         float $$5 = 85.0F;
         float $$6 = bcb.a(bcb.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return bcb.i($$2, $$0.bs, $$0.br);
      }
   }
}
