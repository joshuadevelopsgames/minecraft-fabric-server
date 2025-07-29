import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cln implements dmg {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private cln.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public cln() {
      this.c = cln.a.c;
   }

   @Override
   public void a(aub $$0, boolean $$1, boolean $$2) {
      if (!$$0.W() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ($$3 == 0.5) {
            this.c = $$0.A.a(10) == 0 ? cln.a.b : cln.a.c;
         }

         if (this.c != cln.a.c) {
            if (!this.b) {
               if (!this.a($$0)) {
                  return;
               }

               this.b = true;
            }

            if (this.e > 0) {
               this.e--;
            } else {
               this.e = 2;
               if (this.d > 0) {
                  this.b($$0);
                  this.d--;
               } else {
                  this.c = cln.a.c;
               }
            }
         }
      } else {
         this.c = cln.a.c;
         this.b = false;
      }
   }

   private boolean a(aub $$0) {
      for (cut $$1 : $$0.A()) {
         if (!$$1.am()) {
            jb $$2 = $$1.dx();
            if ($$0.c($$2) && !$$0.v($$2).a(azn.af)) {
               for (int $$3 = 0; $$3 < 10; $$3++) {
                  float $$4 = $$0.A.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + bcb.d(bcb.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + bcb.d(bcb.a($$4) * 32.0F);
                  if (this.a($$0, new jb(this.f, this.g, this.h)) != null) {
                     this.e = 0;
                     this.d = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void b(aub $$0) {
      fis $$1 = this.a($$0, new jb(this.f, this.g, this.h));
      if ($$1 != null) {
         cso $$2;
         try {
            $$2 = new cso($$0);
            $$2.a($$0, $$0.d_($$2.dx()), bzu.h, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.d, $$1.e, $$1.f, $$0.A.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private fis a(aub $$0, jb $$1) {
      for (int $$2 = 0; $$2 < 10; $$2++) {
         int $$3 = $$1.u() + $$0.A.a(16) - 8;
         int $$4 = $$1.w() + $$0.A.a(16) - 8;
         int $$5 = $$0.a(eka.a.b, $$3, $$4);
         jb $$6 = new jb($$3, $$5, $$4);
         if ($$0.c($$6) && crv.b(bzv.bQ, $$0, bzu.h, $$6, $$0.A)) {
            return fis.c($$6);
         }
      }

      return null;
   }

   static enum a {
      a,
      b,
      c;
   }
}
