import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cja extends cji {
   private static final clc a = clc.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cja(cau $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(chi.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.ey();
      cam $$1 = this.e.ew();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ap() == bzv.bU && a(this.e).P().c(dmq.Q)) {
            return false;
         } else {
            for (Class<?> $$2 : this.i) {
               if ($$2.isAssignableFrom($$1.getClass())) {
                  return false;
               }
            }

            return this.a($$1, a);
         }
      } else {
         return false;
      }
   }

   public cja a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.g(this.e.ew());
      this.g = this.e.e();
      this.d = this.e.ey();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      fin $$1 = fin.a(this.e.dv()).c($$0, 10.0, $$0);
      List<? extends cao> $$2 = this.e.ai().a((Class<? extends cao>)this.e.getClass(), $$1, bzt.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         cao $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (cao)var5.next();
            if (this.e != $$3 && $$3.e() == null && (!(this.e instanceof cbi) || ((cbi)this.e).U_() == ((cbi)$$3).U_()) && !$$3.t(this.e.ew())) {
               if (this.j == null) {
                  break;
               }

               boolean $$4 = false;

               for (Class<?> $$5 : this.j) {
                  if ($$3.getClass() == $$5) {
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  break;
               }
            }
         }

         this.a($$3, this.e.ew());
      }
   }

   protected void a(cao $$0, cam $$1) {
      $$0.g($$1);
   }
}
