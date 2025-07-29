import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class evc {
   protected static final eeb e = dqb.nJ.m();
   protected euq f;
   @Nullable
   private jh a;
   private dvd b;
   private dwu c;
   protected int g;
   private final evp d;
   private static final Set<dpz> h = ImmutableSet.builder()
      .add(dqb.fN)
      .add(dqb.cz)
      .add(dqb.cA)
      .add(dqb.el)
      .add(dqb.kH)
      .add(dqb.kM)
      .add(dqb.kN)
      .add(dqb.kK)
      .add(dqb.kI)
      .add(dqb.kJ)
      .add(dqb.da)
      .add(dqb.fo)
      .build();

   protected evc(evp $$0, int $$1, euq $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public evc(evp $$0, ui $$1) {
      this($$0, $$1.b("GD", 0), $$1.<euq>a("BB", euq.a).orElseThrow());
      int $$2 = $$1.b("O", 0);
      this.a($$2 == -1 ? null : jh.b($$2));
   }

   protected static euq a(int $$0, int $$1, int $$2, jh $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jh.a.c
         ? new euq($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new euq($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jh a(bck $$0) {
      return jh.c.a.a($$0);
   }

   public final ui a(evo $$0) {
      ui $$1 = new ui();
      $$1.a("id", mm.Q.b(this.k()).toString());
      $$1.a("BB", euq.a, this.f);
      jh $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(evo var1, ui var2);

   public void a(evc $$0, evd $$1, bck $$2) {
   }

   public abstract void a(dnt var1, dnq var2, efz var3, bck var4, euq var5, dlz var6, jb var7);

   public euq f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dlz $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jb h() {
      return new jb(this.f.g());
   }

   protected jb.a b(int $$0, int $$1, int $$2) {
      return new jb.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jh $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch ($$2) {
            case c:
            case d:
               return this.f.h() + $$0;
            case e:
               return this.f.k() - $$1;
            case f:
               return this.f.h() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.i();
   }

   protected int b(int $$0, int $$1) {
      jh $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch ($$2) {
            case c:
               return this.f.m() - $$1;
            case d:
               return this.f.j() + $$1;
            case e:
            case f:
               return this.f.j() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(dnt $$0, eeb $$1, int $$2, int $$3, int $$4, euq $$5) {
      jb $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dmx)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != dvd.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dwu.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            fal $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.A($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dmx $$0, int $$1, int $$2, int $$3, euq $$4) {
      return true;
   }

   protected eeb a(dly $$0, int $$1, int $$2, int $$3, euq $$4) {
      jb $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dqb.a.m() : $$0.a_($$5);
   }

   protected boolean b(dmx $$0, int $$1, int $$2, int $$3, euq $$4) {
      jb $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(eka.a.c, $$5.u(), $$5.w());
   }

   protected void a(dnt $$0, euq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dqb.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dnt $$0, euq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eeb $$8, eeb $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dly)$$0, $$12, $$11, $$13, $$1).l()) {
                  if ($$11 != $$3 && $$11 != $$6 && $$12 != $$2 && $$12 != $$5 && $$13 != $$4 && $$13 != $$7) {
                     this.a($$0, $$9, $$12, $$11, $$13, $$1);
                  } else {
                     this.a($$0, $$8, $$12, $$11, $$13, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(dnt $$0, euq $$1, euq $$2, eeb $$3, eeb $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dnt $$0, euq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, bck $$9, evc.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dly)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dnt $$0, euq $$1, euq $$2, boolean $$3, bck $$4, evc.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dnt $$0, euq $$1, bck $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, eeb $$10, eeb $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dly)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
                  if ($$14 != $$5 && $$14 != $$8 && $$15 != $$4 && $$15 != $$7 && $$16 != $$6 && $$16 != $$9) {
                     this.a($$0, $$11, $$15, $$14, $$16, $$1);
                  } else {
                     this.a($$0, $$10, $$15, $$14, $$16, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(dnt $$0, euq $$1, bck $$2, float $$3, int $$4, int $$5, int $$6, eeb $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dnt $$0, euq $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eeb $$8, boolean $$9) {
      float $$10 = $$5 - $$2 + 1;
      float $$11 = $$6 - $$3 + 1;
      float $$12 = $$7 - $$4 + 1;
      float $$13 = $$2 + $$10 / 2.0F;
      float $$14 = $$4 + $$12 / 2.0F;

      for (int $$15 = $$3; $$15 <= $$6; $$15++) {
         float $$16 = ($$15 - $$3) / $$11;

         for (int $$17 = $$2; $$17 <= $$5; $$17++) {
            float $$18 = ($$17 - $$13) / ($$10 * 0.5F);

            for (int $$19 = $$4; $$19 <= $$7; $$19++) {
               float $$20 = ($$19 - $$14) / ($$12 * 0.5F);
               if (!$$9 || !this.a((dly)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dnt $$0, eeb $$1, int $$2, int $$3, int $$4, euq $$5) {
      jb.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.L_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jh.a);
         }
      }
   }

   protected boolean a(eeb $$0) {
      return $$0.l() || $$0.n() || $$0.a(dqb.fy) || $$0.a(dqb.bG) || $$0.a(dqb.bH);
   }

   protected boolean a(dnt $$0, euq $$1, bck $$2, int $$3, int $$4, int $$5, amd<fdo> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static eeb a(dly $$0, jb $$1, eeb $$2) {
      jh $$3 = null;

      for (jh $$4 : jh.c.a) {
         jb $$5 = $$1.a($$4);
         eeb $$6 = $$0.a_($$5);
         if ($$6.a(dqb.cG)) {
            return $$2;
         }

         if ($$6.s()) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.b(dub.f, $$3.g());
      } else {
         jh $$7 = $$2.c(dub.f);
         jb $$8 = $$1.a($$7);
         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.b(dub.f, $$7);
      }
   }

   protected boolean a(dnl $$0, euq $$1, bck $$2, jb $$3, amd<fdo> $$4, @Nullable eeb $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dqb.cG)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dqb.cG.m());
         }

         $$0.a($$3, $$5, 2);
         eaz $$6 = $$0.c_($$3);
         if ($$6 instanceof ebh) {
            ((ebh)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dnt $$0, euq $$1, bck $$2, int $$3, int $$4, int $$5, jh $$6, amd<fdo> $$7) {
      jb $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dqb.bb)) {
         this.a($$0, dqb.bb.m().b(dsf.b, $$6), $$3, $$4, $$5, $$1);
         eaz $$9 = $$0.c_($$8);
         if ($$9 instanceof ebu) {
            ((ebu)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static euq a(Stream<evc> $$0) {
      return euq.b($$0.map(evc::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static evc a(List<evc> $$0, euq $$1) {
      for (evc $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jh i() {
      return this.a;
   }

   public void a(@Nullable jh $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.c = dwu.a;
         this.b = dvd.a;
      } else {
         switch ($$0) {
            case d:
               this.b = dvd.b;
               this.c = dwu.a;
               break;
            case e:
               this.b = dvd.b;
               this.c = dwu.b;
               break;
            case f:
               this.b = dvd.a;
               this.c = dwu.b;
               break;
            default:
               this.b = dvd.a;
               this.c = dwu.a;
         }
      }
   }

   public dwu a() {
      return this.c;
   }

   public dvd j() {
      return this.b;
   }

   public evp k() {
      return this.d;
   }

   public abstract static class a {
      protected eeb a = dqb.a.m();

      public abstract void a(bck var1, int var2, int var3, int var4, boolean var5);

      public eeb a() {
         return this.a;
      }
   }
}
