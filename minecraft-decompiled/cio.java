import java.util.EnumSet;
import javax.annotation.Nullable;

public class cio extends chi {
   private static final int a = 10;
   private final cau b;
   private final int c;
   @Nullable
   private jb d;

   public cio(cau $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
      this.a(EnumSet.of(chi.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cZ()) {
         return false;
      } else if (this.b.ai().W()) {
         return false;
      } else if (this.b.ec().a(this.c) != 0) {
         return false;
      } else {
         aub $$0 = (aub)this.b.ai();
         jb $$1 = this.b.dx();
         if (!$$0.a($$1, 6)) {
            return false;
         } else {
            fis $$2 = clj.a(this.b, 15, 7, $$1x -> -$$0.b(ke.a($$1x)));
            this.d = $$2 == null ? null : jb.a((jv)$$2);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean c() {
      return this.d != null && !this.b.S().l() && this.b.S().h().equals(this.d);
   }

   @Override
   public void a() {
      if (this.d != null) {
         cjw $$0 = this.b.S();
         if ($$0.l() && !this.d.a(this.b.dv(), 10.0)) {
            fis $$1 = fis.c(this.d);
            fis $$2 = this.b.dv();
            fis $$3 = $$2.d($$1);
            $$1 = $$3.c(0.4).e($$1);
            fis $$4 = $$1.d($$2).d().c(10.0).e($$2);
            jb $$5 = jb.a((jv)$$4);
            $$5 = this.b.ai().a(eka.a.f, $$5);
            if (!$$0.a((double)$$5.u(), (double)$$5.v(), (double)$$5.w(), 1.0)) {
               this.h();
            }
         }
      }
   }

   private void h() {
      bck $$0 = this.b.ec();
      jb $$1 = this.b.ai().a(eka.a.f, this.b.dx().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
      this.b.S().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 1.0);
   }
}
