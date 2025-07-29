import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egs extends efy {
   private static final Logger n = LogUtils.getLogger();
   @Nullable
   private volatile faa o;
   private volatile egz p = egz.c;
   private final List<ui> q = Lists.newArrayList();
   @Nullable
   private efx r;
   @Nullable
   private ejo s;
   private final fki<dpz> t;
   private final fki<fak> u;

   public egs(dlz $$0, egv $$1, dmw $$2, jy<dnx> $$3, @Nullable eld $$4) {
      this($$0, $$1, null, new fki<>(), new fki<>(), $$2, $$3, $$4);
   }

   public egs(dlz $$0, egv $$1, @Nullable egj[] $$2, fki<dpz> $$3, fki<fak> $$4, dmw $$5, jy<dnx> $$6, @Nullable eld $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.t = $$3;
      this.u = $$4;
   }

   @Override
   public fkn<dpz> q() {
      return this.t;
   }

   @Override
   public fkn<fak> r() {
      return this.u;
   }

   @Override
   public efy.b a(long $$0) {
      return new efy.b(this.t.a($$0), this.u.a($$0));
   }

   @Override
   public eeb a_(jb $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return dqb.nI.m();
      } else {
         egj $$2 = this.b(this.f($$1));
         return $$2.c() ? dqb.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public fal b_(jb $$0) {
      int $$1 = $$0.v();
      if (this.e($$1)) {
         return fam.a.g();
      } else {
         egj $$2 = this.b(this.f($$1));
         return $$2.c() ? fam.a.g() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Nullable
   @Override
   public eeb a(jb $$0, eeb $$1, int $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if (this.e($$4)) {
         return dqb.nI.m();
      } else {
         int $$6 = this.f($$4);
         egj $$7 = this.b($$6);
         boolean $$8 = $$7.c();
         if ($$8 && $$1.a(dqb.a)) {
            return $$1;
         } else {
            int $$9 = ke.b($$3);
            int $$10 = ke.b($$4);
            int $$11 = ke.b($$5);
            eeb $$12 = $$7.a($$9, $$10, $$11, $$1);
            if (this.p.a(egz.k)) {
               boolean $$13 = $$7.c();
               if ($$13 != $$8) {
                  this.o.a($$0, $$13);
               }

               if (fac.a($$12, $$1)) {
                  this.i.a(this, $$9, $$4, $$11);
                  this.o.a($$0);
               }
            }

            EnumSet<eka.a> $$14 = this.n().e();
            EnumSet<eka.a> $$15 = null;

            for (eka.a $$16 : $$14) {
               eka $$17 = this.h.get($$16);
               if ($$17 == null) {
                  if ($$15 == null) {
                     $$15 = EnumSet.noneOf(eka.a.class);
                  }

                  $$15.add($$16);
               }
            }

            if ($$15 != null) {
               eka.a(this, $$15);
            }

            for (eka.a $$18 : $$14) {
               this.h.get($$18).a($$9, $$4, $$11, $$1);
            }

            return $$12;
         }
      }
   }

   @Override
   public void a(eaz $$0) {
      this.j.remove($$0.aA_());
      this.k.put($$0.aA_(), $$0);
   }

   @Nullable
   @Override
   public eaz c_(jb $$0) {
      return this.k.get($$0);
   }

   public Map<jb, eaz> I() {
      return this.k;
   }

   public void b(ui $$0) {
      this.q.add($$0);
   }

   @Override
   public void a(bzm $$0) {
      if (!$$0.cc()) {
         try (bci.j $$1 = new bci.j($$0.ef(), n)) {
            fcz $$2 = fcz.a($$1, $$0.eb());
            $$0.c($$2);
            this.b($$2.b());
         }
      }
   }

   @Override
   public void a(euy $$0, evg $$1) {
      ejo $$2 = this.z();
      if ($$2 != null && $$1.b()) {
         euq $$3 = $$1.a();
         dmw $$4 = this.B();
         if ($$3.i() < $$4.L_() || $$3.l() > $$4.ao()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<ui> J() {
      return this.q;
   }

   @Override
   public egz n() {
      return this.p;
   }

   public void a(egz $$0) {
      this.p = $$0;
      if (this.s != null && $$0.a(this.s.a())) {
         this.a(null);
      }

      this.i();
   }

   @Override
   public jl<dnx> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (this.o().a(egz.f)) {
         return super.getNoiseBiome($$0, $$1, $$2);
      } else {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      }
   }

   public static short g(jb $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static jb a(short $$0, int $$1, dlz $$2) {
      int $$3 = ke.a($$2.h, $$0 & 15);
      int $$4 = ke.a($$1, $$0 >>> 4 & 15);
      int $$5 = ke.a($$2.i, $$0 >>> 8 & 15);
      return new jb($$3, $$4, $$5);
   }

   @Override
   public void e(jb $$0) {
      if (!this.u($$0)) {
         efy.a(this.b, this.f($$0.v())).add(g($$0));
      }
   }

   @Override
   public void a(ShortList $$0, int $$1) {
      efy.a(this.b, $$1).addAll($$0);
   }

   public Map<jb, ui> K() {
      return Collections.unmodifiableMap(this.j);
   }

   @Nullable
   @Override
   public ui a(jb $$0, jn.a $$1) {
      eaz $$2 = this.c_($$0);
      return $$2 != null ? $$2.b($$1) : this.j.get($$0);
   }

   @Override
   public void d(jb $$0) {
      this.k.remove($$0);
      this.j.remove($$0);
   }

   @Nullable
   public efx F() {
      return this.r;
   }

   public efx G() {
      if (this.r == null) {
         this.r = new efx(this.M_(), this.L_());
      }

      return this.r;
   }

   public void a(efx $$0) {
      this.r = $$0;
   }

   public void a(faa $$0) {
      this.o = $$0;
   }

   public void a(@Nullable ejo $$0) {
      this.s = $$0;
   }

   @Nullable
   @Override
   public ejo z() {
      return this.s;
   }

   private static <T> fkf<T> a(fki<T> $$0) {
      return new fkf<>($$0.b());
   }

   public fkf<dpz> L() {
      return a(this.t);
   }

   public fkf<fak> M() {
      return a(this.u);
   }

   @Override
   public dmw B() {
      return (dmw)(this.A() ? ejo.b : this);
   }
}
