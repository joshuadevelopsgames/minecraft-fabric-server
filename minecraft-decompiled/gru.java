import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class gru {
   private static final Logger a = LogUtils.getLogger();
   private final fue b;
   private final grl c;
   private jb d = new jb(-1, -1, -1);
   private dcv e = dcv.l;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private dmr j = dmr.e;
   @Nullable
   private dmr k;
   private int l;

   public gru(fue $$0, grl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(cut $$0) {
      this.j.a($$0.gt());
   }

   public void a(dmr $$0, @Nullable dmr $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.gt());
   }

   public void a(dmr $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.gt());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(jb $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         dmu $$1 = this.b.s;
         eeb $$2 = $$1.a_($$0);
         if (!this.b.t.fh().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            dpz $$3 = $$2.b();
            if ($$3 instanceof dtm && !this.b.t.gQ()) {
               return false;
            } else if ($$2.l()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (cut)this.b.t);
               fal $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a($$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(jb $$0, jh $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.F_().a($$0)) {
         return false;
      } else {
         if (this.b.t.gt().d) {
            eeb $$2 = this.b.s.a_($$0);
            this.b.aC().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new ait(ait.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.b(new ait(ait.a.b, this.d, $$1));
            }

            eeb $$3 = this.b.s.a_($$0);
            this.b.aC().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.l();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.ai(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.fh();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.ar(), this.d, this.k());
               }

               return new ait(ait.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         eeb $$0 = this.b.s.a_(this.d);
         this.b.aC().a(this.b.s, this.d, $$0, -1.0F);
         this.c.b(new ait(ait.a.b, this.d, jh.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.ar(), this.d, -1);
         this.b.t.gO();
      }
   }

   public boolean b(jb $$0, jh $$1) {
      this.l();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.b.t.gt().d && this.b.s.F_().a($$0)) {
         this.h = 5;
         eeb $$2 = this.b.s.a_($$0);
         this.b.aC().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new ait(ait.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         eeb $$3 = this.b.s.a_($$0);
         if ($$3.l()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.ai(), $$0);
            if (this.g % 4.0F == 0.0F) {
               dxx $$4 = $$3.A();
               this.b.al().a(new hvm($$4.f(), aza.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, hvr.t(), $$0));
            }

            this.g++;
            this.b.aC().a(this.b.s, $$0, $$3, bcb.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new ait(ait.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.ar(), this.d, this.k());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(grk $$0, gsy $$1) {
      try (gsx $$2 = $$0.b().a()) {
         int $$3 = $$2.b();
         zw<ahm> $$4 = $$1.predict($$3);
         this.c.b($$4);
      }
   }

   public void c() {
      this.l();
      if (this.c.m().i()) {
         this.c.m().b();
      } else {
         this.c.m().n();
      }
   }

   private boolean b(jb $$0) {
      dcv $$1 = this.b.t.fh();
      return $$0.equals(this.d) && dcv.c($$1, this.e);
   }

   private void l() {
      int $$0 = this.b.t.gs().f();
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.b(new aje(this.l));
      }
   }

   public bxj a(gwi $$0, bxi $$1, fio $$2) {
      this.l();
      if (!this.b.s.F_().a($$2.b())) {
         return bxj.d;
      } else {
         MutableObject<bxj> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new ajp($$1, $$2, $$4);
         });
         return (bxj)$$3.getValue();
      }
   }

   private bxj b(gwi $$0, bxi $$1, fio $$2) {
      jb $$3 = $$2.b();
      dcv $$4 = $$0.b($$1);
      if (this.j == dmr.d) {
         return bxj.c;
      } else {
         boolean $$5 = !$$0.fh().f() || !$$0.fi().f();
         boolean $$6 = $$0.gh() && $$5;
         if (!$$6) {
            eeb $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().k())) {
               return bxj.d;
            }

            bxj $$8 = $$7.a($$0.b($$1), this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }

            if ($$8 instanceof bxj.f && $$1 == bxi.a) {
               bxj $$9 = $$7.a(this.b.s, $$0, $$2);
               if ($$9.a()) {
                  return $$9;
               }
            }
         }

         if (!$$4.f() && !$$0.gP().a($$4)) {
            dgq $$10 = new dgq($$0, $$1, $$2);
            bxj $$12;
            if ($$0.gc()) {
               int $$11 = $$4.M();
               $$12 = $$4.a($$10);
               $$4.e($$11);
            } else {
               $$12 = $$4.a($$10);
            }

            return $$12;
         } else {
            return bxj.e;
         }
      }
   }

   public bxj a(cut $$0, bxi $$1) {
      if (this.j == dmr.d) {
         return bxj.e;
      } else {
         this.l();
         MutableObject<bxj> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            ajq $$4 = new ajq($$1, $$3, $$0.dP(), $$0.dR());
            dcv $$5 = $$0.b($$1);
            if ($$0.gP().a($$5)) {
               $$2.setValue(bxj.e);
               return $$4;
            } else {
               bxj $$6 = $$5.a(this.b.s, $$0, $$1);
               dcv $$8;
               if ($$6 instanceof bxj.d $$7) {
                  $$8 = Objects.requireNonNullElseGet($$7.d(), () -> $$0.b($$1));
               } else {
                  $$8 = $$0.b($$1);
               }

               if ($$8 != $$5) {
                  $$0.a($$1, $$8);
               }

               $$2.setValue($$6);
               return $$4;
            }
         });
         return (bxj)$$2.getValue();
      }
   }

   public gwi a(grk $$0, azk $$1, ftp $$2) {
      return this.a($$0, $$1, $$2, cur.b, false);
   }

   public gwi a(grk $$0, azk $$1, ftp $$2, cur $$3, boolean $$4) {
      return new gwi(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(cut $$0, bzm $$1) {
      this.l();
      this.c.b(aij.a($$1, $$0.cg()));
      if (this.j != dmr.d) {
         $$0.e($$1);
         $$0.gO();
      }
   }

   public bxj a(cut $$0, bzm $$1, bxi $$2) {
      this.l();
      this.c.b(aij.a($$1, $$0.cg(), $$2));
      return (bxj)(this.j == dmr.d ? bxj.e : $$0.a($$1, $$2));
   }

   public bxj a(cut $$0, bzm $$1, fip $$2, bxi $$3) {
      this.l();
      fis $$4 = $$2.g().a($$1.dC(), $$1.dE(), $$1.dI());
      this.c.b(aij.a($$1, $$0.cg(), $$3, $$4));
      return (bxj)(this.j == dmr.d ? bxj.e : $$1.a($$0, $$4, $$3));
   }

   public void a(int $$0, int $$1, int $$2, cyx $$3, cut $$4) {
      cym $$5 = $$4.cn;
      if ($$0 != $$5.l) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.l);
      } else {
         ju<dak> $$6 = $$5.k;
         int $$7 = $$6.size();
         List<dcv> $$8 = Lists.newArrayListWithCapacity($$7);

         for (dak $$9 : $$6) {
            $$8.add($$9.g().v());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<wj> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            dcv $$12 = $$8.get($$11);
            dcv $$13 = $$6.get($$11).g();
            if (!dcv.a($$12, $$13)) {
               $$10.put($$11, wj.b($$13, this.c.G()));
            }
         }

         wj $$14 = wj.b($$5.g(), this.c.G());
         this.c.b(new aid($$0, $$5.j(), Shorts.checkedCast($$1), SignedBytes.checkedCast($$2), $$3, $$10, $$14));
      }
   }

   public void a(int $$0, diu $$1, boolean $$2) {
      this.c.b(new air($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.b(new aic($$0, $$1));
   }

   public void a(dcv $$0, int $$1) {
      if (this.b.t.gc() && this.c.a($$0.h().k())) {
         this.c.b(new ajh($$1, $$0));
      }
   }

   public void a(dcv $$0) {
      boolean $$1 = this.b.z instanceof gfz && !(this.b.z instanceof ggq);
      if (this.b.t.gc() && !$$1 && !$$0.f() && this.c.a($$0.h().k())) {
         this.c.b(new ajh(-1, $$0));
         this.b.t.F().a();
      }
   }

   public void b(cut $$0) {
      this.l();
      this.c.b(new ait(ait.a.f, jb.c, jh.a));
      $$0.fL();
   }

   public boolean d() {
      return this.j.h();
   }

   public boolean e() {
      return !this.j.g();
   }

   public boolean f() {
      return this.b.t.cc() && this.b.t.dm() instanceof cac;
   }

   public boolean g() {
      return this.j == dmr.d;
   }

   @Nullable
   public dmr h() {
      return this.k;
   }

   public dmr i() {
      return this.j;
   }

   public boolean j() {
      return this.i;
   }

   public int k() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(jb $$0, boolean $$1) {
      this.c.b(new aip($$0, $$1));
   }

   public void a(bzm $$0, boolean $$1) {
      this.c.b(new aiq($$0.ar(), $$1));
   }

   public void a(int $$0, int $$1, boolean $$2) {
      this.c.b(new aif($$0, $$1, $$2));
   }
}
