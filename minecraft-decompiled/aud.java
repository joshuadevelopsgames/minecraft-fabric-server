import com.mojang.logging.LogUtils;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aud {
   private static final Logger a = LogUtils.getLogger();
   protected aub c;
   protected final auc d;
   private dmr b;
   @Nullable
   private dmr e;
   private boolean f;
   private int g;
   private jb h;
   private int i;
   private boolean j;
   private jb k;
   private int l;
   private int m;

   public aud(auc $$0) {
      this.b = dmr.e;
      this.h = jb.c;
      this.k = jb.c;
      this.m = -1;
      this.d = $$0;
      this.c = $$0.y();
   }

   public boolean a(dmr $$0) {
      if ($$0 == this.b) {
         return false;
      } else {
         this.a($$0, this.e);
         this.d.x();
         this.c.q().ag().a(new aex(aex.a.c, this.d));
         this.c.f();
         if ($$0 == dmr.b) {
            this.d.gZ();
         }

         return true;
      }
   }

   protected void a(dmr $$0, @Nullable dmr $$1) {
      this.e = $$1;
      this.b = $$0;
      $$0.a(this.d.gt());
   }

   public dmr b() {
      return this.b;
   }

   @Nullable
   public dmr c() {
      return this.e;
   }

   public boolean d() {
      return this.b.h();
   }

   public boolean e() {
      return this.b.g();
   }

   public void a() {
      this.i++;
      if (this.j) {
         eeb $$0 = this.c.a_(this.k);
         if ($$0.l()) {
            this.j = false;
         } else {
            float $$1 = this.a($$0, this.k, this.l);
            if ($$1 >= 1.0F) {
               this.j = false;
               this.a(this.k);
            }
         }
      } else if (this.f) {
         eeb $$2 = this.c.a_(this.h);
         if ($$2.l()) {
            this.c.a(this.d.ar(), this.h, -1);
            this.m = -1;
            this.f = false;
         } else {
            this.a($$2, this.h, this.g);
         }
      }
   }

   private float a(eeb $$0, jb $$1, int $$2) {
      int $$3 = this.i - $$2;
      float $$4 = $$0.a(this.d, this.d.y(), $$1) * ($$3 + 1);
      int $$5 = (int)($$4 * 10.0F);
      if ($$5 != this.m) {
         this.c.a(this.d.ar(), $$1, $$5);
         this.m = $$5;
      }

      return $$4;
   }

   private void a(jb $$0, boolean $$1, int $$2, String $$3) {
   }

   public void a(jb $$0, ait.a $$1, jh $$2, int $$3, int $$4) {
      if (!this.d.a($$0, 1.0)) {
         this.a($$0, false, $$4, "too far");
      } else if ($$0.v() > $$3) {
         this.d.g.b(new acy($$0, this.c.a_($$0)));
         this.a($$0, false, $$4, "too high");
      } else {
         if ($$1 == ait.a.a) {
            if (!this.c.a(this.d, $$0)) {
               this.d.g.b(new acy($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "may not interact");
               return;
            }

            if (this.d.gt().d) {
               this.a($$0, $$4, "creative destroy");
               return;
            }

            if (this.d.a(this.c, $$0, this.b)) {
               this.d.g.b(new acy($$0, this.c.a_($$0)));
               this.a($$0, false, $$4, "block action restricted");
               return;
            }

            this.g = this.i;
            float $$5 = 1.0F;
            eeb $$6 = this.c.a_($$0);
            if (!$$6.l()) {
               djk.a(this.c, this.d.fh(), this.d, this.d, bzw.a, fis.b($$0), $$6, $$0x -> this.d.a($$0x, bzw.a));
               $$6.a(this.c, $$0, this.d);
               $$5 = $$6.a(this.d, this.d.y(), $$0);
            }

            if (!$$6.l() && $$5 >= 1.0F) {
               this.a($$0, $$4, "insta mine");
            } else {
               if (this.f) {
                  this.d.g.b(new acy(this.h, this.c.a_(this.h)));
                  this.a($$0, false, $$4, "abort destroying since another started (client insta mine, server disagreed)");
               }

               this.f = true;
               this.h = $$0.j();
               int $$7 = (int)($$5 * 10.0F);
               this.c.a(this.d.ar(), $$0, $$7);
               this.a($$0, true, $$4, "actual start of destroying");
               this.m = $$7;
            }
         } else if ($$1 == ait.a.c) {
            if ($$0.equals(this.h)) {
               int $$8 = this.i - this.g;
               eeb $$9 = this.c.a_($$0);
               if (!$$9.l()) {
                  float $$10 = $$9.a(this.d, this.d.y(), $$0) * ($$8 + 1);
                  if ($$10 >= 0.7F) {
                     this.f = false;
                     this.c.a(this.d.ar(), $$0, -1);
                     this.a($$0, $$4, "destroyed");
                     return;
                  }

                  if (!this.j) {
                     this.f = false;
                     this.j = true;
                     this.k = $$0;
                     this.l = this.g;
                  }
               }
            }

            this.a($$0, true, $$4, "stopped destroying");
         } else if ($$1 == ait.a.b) {
            this.f = false;
            if (!Objects.equals(this.h, $$0)) {
               a.warn("Mismatch in destroy block pos: {} {}", this.h, $$0);
               this.c.a(this.d.ar(), this.h, -1);
               this.a($$0, true, $$4, "aborted mismatched destroying");
            }

            this.c.a(this.d.ar(), $$0, -1);
            this.a($$0, true, $$4, "aborted destroying");
         }
      }
   }

   public void a(jb $$0, int $$1, String $$2) {
      if (this.a($$0)) {
         this.a($$0, true, $$1, $$2);
      } else {
         this.d.g.b(new acy($$0, this.c.a_($$0)));
         this.a($$0, false, $$1, $$2);
      }
   }

   public boolean a(jb $$0) {
      eeb $$1 = this.c.a_($$0);
      if (!this.d.fh().a($$1, this.c, $$0, this.d)) {
         return false;
      } else {
         eaz $$2 = this.c.c_($$0);
         dpz $$3 = $$1.b();
         if ($$3 instanceof dtm && !this.d.gQ()) {
            this.c.a($$0, $$1, $$1, 3);
            return false;
         } else if (this.d.a(this.c, $$0, this.b)) {
            return false;
         } else {
            eeb $$4 = $$3.a(this.c, $$0, $$1, (cut)this.d);
            boolean $$5 = this.c.a($$0, false);
            if ($$5) {
               $$3.a(this.c, $$0, $$4);
            }

            if (this.d.gu()) {
               return true;
            } else {
               dcv $$6 = this.d.fh();
               dcv $$7 = $$6.v();
               boolean $$8 = this.d.d($$4);
               $$6.a(this.c, $$4, $$0, this.d);
               if ($$5 && $$8) {
                  $$3.a(this.c, this.d, $$0, $$4, $$2, $$7);
               }

               return true;
            }
         }
      }
   }

   public bxj a(auc $$0, dmu $$1, dcv $$2, bxi $$3) {
      if (this.b == dmr.d) {
         return bxj.e;
      } else if ($$0.gP().a($$2)) {
         return bxj.e;
      } else {
         int $$4 = $$2.M();
         int $$5 = $$2.o();
         bxj $$6 = $$2.a($$1, $$0, $$3);
         dcv $$8;
         if ($$6 instanceof bxj.d $$7) {
            $$8 = Objects.requireNonNullElse($$7.d(), $$0.b($$3));
         } else {
            $$8 = $$0.b($$3);
         }

         if ($$8 == $$2 && $$8.M() == $$4 && $$8.a((cam)$$0) <= 0 && $$8.o() == $$5) {
            return $$6;
         } else if ($$6 instanceof bxj.a && $$8.a((cam)$$0) > 0 && !$$0.fG()) {
            return $$6;
         } else {
            if ($$2 != $$8) {
               $$0.a($$3, $$8);
            }

            if ($$8.f()) {
               $$0.a($$3, dcv.l);
            }

            if (!$$0.fG()) {
               $$0.cm.b();
            }

            return $$6;
         }
      }
   }

   public bxj a(auc $$0, dmu $$1, dcv $$2, bxi $$3, fio $$4) {
      jb $$5 = $$4.b();
      eeb $$6 = $$1.a_($$5);
      if (!$$6.b().a($$1.L())) {
         return bxj.d;
      } else if (this.b == dmr.d) {
         bxm $$7 = $$6.b($$1, $$5);
         if ($$7 != null) {
            $$0.a($$7);
            return bxj.c;
         } else {
            return bxj.e;
         }
      } else {
         boolean $$8 = !$$0.fh().f() || !$$0.fi().f();
         boolean $$9 = $$0.gh() && $$8;
         dcv $$10 = $$2.v();
         if (!$$9) {
            bxj $$11 = $$6.a($$0.b($$3), $$1, $$0, $$3, $$4);
            if ($$11.a()) {
               aq.N.a($$0, $$5, $$10);
               return $$11;
            }

            if ($$11 instanceof bxj.f && $$3 == bxi.a) {
               bxj $$12 = $$6.a($$1, $$0, $$4);
               if ($$12.a()) {
                  aq.O.a($$0, $$5);
                  return $$12;
               }
            }
         }

         if (!$$2.f() && !$$0.gP().a($$2)) {
            dgq $$13 = new dgq($$0, $$3, $$4);
            bxj $$15;
            if ($$0.gc()) {
               int $$14 = $$2.M();
               $$15 = $$2.a($$13);
               $$2.e($$14);
            } else {
               $$15 = $$2.a($$13);
            }

            if ($$15.a()) {
               aq.N.a($$0, $$5, $$10);
            }

            return $$15;
         } else {
            return bxj.e;
         }
      }
   }

   public void a(aub $$0) {
      this.c = $$0;
   }
}
