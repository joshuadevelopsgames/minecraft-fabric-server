import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chq extends chi {
   public static final float a = 0.02F;
   protected final cao b;
   @Nullable
   protected bzm c;
   protected final float d;
   private int h;
   protected final float e;
   private final boolean i;
   protected final Class<? extends cam> f;
   protected final clc g;

   public chq(cao $$0, Class<? extends cam> $$1, float $$2) {
      this($$0, $$1, $$2, 0.02F);
   }

   public chq(cao $$0, Class<? extends cam> $$1, float $$2, float $$3) {
      this($$0, $$1, $$2, $$3, false);
   }

   public chq(cao $$0, Class<? extends cam> $$1, float $$2, float $$3, boolean $$4) {
      this.b = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
      this.i = $$4;
      this.a(EnumSet.of(chi.a.b));
      if ($$1 == cut.class) {
         Predicate<bzm> $$5 = bzt.b($$0);
         this.g = clc.b().a($$2).a(($$1x, $$2x) -> $$5.test($$1x));
      } else {
         this.g = clc.b().a($$2);
      }
   }

   @Override
   public boolean b() {
      if (this.b.ec().i() >= this.e) {
         return false;
      } else {
         if (this.b.e() != null) {
            this.c = this.b.e();
         }

         aub $$0 = a(this.b);
         if (this.f == cut.class) {
            this.c = $$0.a(this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
         } else {
            this.c = $$0.a(this.b.ai().a(this.f, this.b.cV().c(this.d, 3.0, this.d), $$0x -> true), this.g, this.b, this.b.dC(), this.b.dG(), this.b.dI());
         }

         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      if (!this.c.bO()) {
         return false;
      } else {
         return this.b.g(this.c) > this.d * this.d ? false : this.h > 0;
      }
   }

   @Override
   public void d() {
      this.h = this.a(40 + this.b.ec().a(40));
   }

   @Override
   public void e() {
      this.c = null;
   }

   @Override
   public void a() {
      if (this.c.bO()) {
         double $$0 = this.i ? this.b.dG() : this.c.dG();
         this.b.P().a(this.c.dC(), $$0, this.c.dI());
         this.h--;
      }
   }
}
