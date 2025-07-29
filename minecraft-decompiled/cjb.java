import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjb<T extends cam> extends cji {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected cam c;
   protected clc d;

   public cjb(cao $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cjb(cao $$0, Class<T> $$1, boolean $$2, clc.a $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cjb(cao $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cjb(cao $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable clc.a $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(chi.a.d));
      this.d = clc.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.ec().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected fin a(double $$0) {
      return this.e.cV().c($$0, $$0, $$0);
   }

   protected void h() {
      aub $$0 = a(this.e);
      if (this.a != cut.class && this.a != auc.class) {
         this.c = $$0.a(this.e.ai().a(this.a, this.a(this.l()), $$0x -> true), this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      } else {
         this.c = $$0.a(this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      }
   }

   @Override
   public void d() {
      this.e.g(this.c);
      super.d();
   }

   public void a(@Nullable cam $$0) {
      this.c = $$0;
   }

   private clc i() {
      return this.d.a(this.l());
   }
}
