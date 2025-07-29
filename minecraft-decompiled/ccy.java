import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ccy extends ccd<cuf> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jb e;
   private long f;
   private int g;
   private final List<jb> h = Lists.newArrayList();

   public ccy() {
      super(ImmutableMap.of(cjo.o, cjp.b, cjo.n, cjp.b, cjo.f, cjp.a));
   }

   protected boolean a(aub $$0, cuf $$1) {
      if (!$$0.P().c(dmq.d)) {
         return false;
      } else if (!$$1.gR().b().a(cui.g)) {
         return false;
      } else {
         jb.a $$2 = $$1.dx().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dC() + $$3, $$1.dE() + $$4, $$1.dI() + $$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jb($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jb a(aub $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.H_().a(this.h.size()));
   }

   private boolean a(jb $$0, aub $$1) {
      eeb $$2 = $$1.a_($$0);
      dpz $$3 = $$2.b();
      dpz $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof drw && ((drw)$$3).i($$2) || $$2.l() && $$4 instanceof dsz;
   }

   protected void a(aub $$0, cuf $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eh().a(cjo.o, new ccg(this.e));
         $$1.eh().a(cjo.n, new cjr(new ccg(this.e), 0.5F, 1));
      }
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      $$1.eh().b(cjo.o);
      $$1.eh().b(cjo.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dv(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            eeb $$3 = $$0.a_(this.e);
            dpz $$4 = $$3.b();
            dpz $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof drw && ((drw)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dsz && $$1.hb()) {
               bxr $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  dcv $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(azx.bR) && $$8.h() instanceof dbd $$10) {
                     eeb $$11 = $$10.c().m();
                     $$0.c(this.e, $$11);
                     $$0.a(ejb.i, this.e, ejb.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, this.e.u(), this.e.v(), this.e.w(), ayz.gJ, aza.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, dcv.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof drw && !((drw)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eh().a(cjo.n, new cjr(new ccg(this.e), 0.5F, 1));
                  $$1.eh().a(cjo.o, new ccg(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aub $$0, cuf $$1, long $$2) {
      return this.g < 200;
   }
}
