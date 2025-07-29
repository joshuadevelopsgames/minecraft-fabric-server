import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdn extends ccd<cao> {
   private static final int c = 40;
   private int d;
   @Nullable
   private faz e;
   @Nullable
   private jb f;
   private float g;

   public cdn() {
      this(150, 250);
   }

   public cdn(int $$0, int $$1) {
      super(ImmutableMap.of(cjo.F, cjp.c, cjo.u, cjp.b, cjo.n, cjp.a), $$0, $$1);
   }

   protected boolean a(aub $$0, cao $$1) {
      if (this.d > 0) {
         this.d--;
         return false;
      } else {
         cbm<?> $$2 = $$1.eh();
         cjr $$3 = $$2.c(cjo.n).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.ae())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(cjo.n);
            if ($$4) {
               $$2.b(cjo.F);
            }

            return false;
         }
      }
   }

   protected boolean a(aub $$0, cao $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<cjr> $$3 = $$1.eh().c(cjo.n);
         boolean $$4 = $$3.<Boolean>map(cdn::a).orElse(false);
         cjw $$5 = $$1.S();
         return !$$5.l() && $$3.isPresent() && !this.a($$1, $$3.get()) && !$$4;
      } else {
         return false;
      }
   }

   protected void b(aub $$0, cao $$1, long $$2) {
      if ($$1.eh().a(cjo.n) && !this.a($$1, $$1.eh().c(cjo.n).get()) && $$1.S().r()) {
         this.d = $$0.H_().a(40);
      }

      $$1.S().n();
      $$1.eh().b(cjo.n);
      $$1.eh().b(cjo.u);
      this.e = null;
   }

   protected void c(aub $$0, cao $$1, long $$2) {
      $$1.eh().a(cjo.u, this.e);
      $$1.S().a(this.e, (double)this.g);
   }

   protected void d(aub $$0, cao $$1, long $$2) {
      faz $$3 = $$1.S().j();
      cbm<?> $$4 = $$1.eh();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(cjo.u, $$3);
      }

      if ($$3 != null && this.f != null) {
         cjr $$5 = $$4.c(cjo.n).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.ae())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }
      }
   }

   private boolean a(cao $$0, cjr $$1, long $$2) {
      jb $$3 = $$1.a().b();
      this.e = $$0.S().a($$3, 0);
      this.g = $$1.b();
      cbm<?> $$4 = $$0.eh();
      if (this.a($$0, $$1)) {
         $$4.b(cjo.F);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(cjo.F);
         } else if (!$$4.a(cjo.F)) {
            $$4.a(cjo.F, $$2);
         }

         if (this.e != null) {
            return true;
         }

         fis $$6 = clg.a((cau)$$0, 10, 7, fis.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.S().a($$6.d, $$6.e, $$6.f, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(cao $$0, cjr $$1) {
      return $$1.a().b().k($$0.dx()) <= $$1.c();
   }

   private static boolean a(cjr $$0) {
      return $$0.a() instanceof cco $$2 ? $$2.c().am() : false;
   }
}
