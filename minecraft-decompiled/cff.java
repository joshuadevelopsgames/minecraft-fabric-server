import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cff extends ccd<cuf> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<jb> g = Optional.empty();

   public cff() {
      super(ImmutableMap.of(cjo.o, cjp.b, cjo.n, cjp.b));
   }

   protected boolean a(aub $$0, cuf $$1) {
      if ($$1.as % 10 == 0 && (this.e == 0L || this.e + 160L <= $$1.as)) {
         if ($$1.n().a_(dcz.sX) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<jb> b(aub $$0, cuf $$1) {
      jb.a $$2 = new jb.a();
      Optional<jb> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dx(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.A.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.j());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(jb $$0, aub $$1) {
      eeb $$2 = $$1.a_($$0);
      dpz $$3 = $$2.b();
      return $$3 instanceof drw && !((drw)$$3).i($$2);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      this.a($$1);
      $$1.a(bzw.a, new dcv(dcz.sX));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cuf $$0) {
      this.g.ifPresent($$1 -> {
         ccg $$2 = new ccg($$1);
         $$0.eh().a(cjo.o, $$2);
         $$0.eh().a(cjo.n, new cjr($$2, 0.5F, 1));
      });
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      $$1.a(bzw.a, dcv.l);
      this.e = $$1.as;
   }

   protected void d(aub $$0, cuf $$1, long $$2) {
      jb $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dv(), 1.0)) {
         dcv $$4 = dcv.l;
         bxr $$5 = $$1.n();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            dcv $$8 = $$5.a($$7);
            if ($$8.a(dcz.sX)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.f() && dbf.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 15);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
