import java.util.EnumSet;
import java.util.function.Predicate;

public class cha extends chi {
   private static final int a = 40;
   private static final Predicate<eeb> b = $$0 -> $$0.a(azo.be);
   private final cao c;
   private final dmu d;
   private int e;

   public cha(cao $$0) {
      this.c = $$0;
      this.d = $$0.ai();
      this.a(EnumSet.of(chi.a.a, chi.a.b, chi.a.c));
   }

   @Override
   public boolean b() {
      if (this.c.ec().a(this.c.g_() ? 50 : 1000) != 0) {
         return false;
      } else {
         jb $$0 = this.c.dx();
         return b.test(this.d.a_($$0)) ? true : this.d.a_($$0.e()).a(dqb.i);
      }
   }

   @Override
   public void d() {
      this.e = this.a(40);
      this.d.a(this.c, (byte)10);
      this.c.S().n();
   }

   @Override
   public void e() {
      this.e = 0;
   }

   @Override
   public boolean c() {
      return this.e > 0;
   }

   public int h() {
      return this.e;
   }

   @Override
   public void a() {
      this.e = Math.max(0, this.e - 1);
      if (this.e == this.a(4)) {
         jb $$0 = this.c.dx();
         if (b.test(this.d.a_($$0))) {
            if (a(this.d).P().c(dmq.d)) {
               this.d.b($$0, false);
            }

            this.c.V();
         } else {
            jb $$1 = $$0.e();
            if (this.d.a_($$1).a(dqb.i)) {
               if (a(this.d).P().c(dmq.d)) {
                  this.d.c(2001, $$1, dpz.j(dqb.i.m()));
                  this.d.a($$1, dqb.j.m(), 2);
               }

               this.c.V();
            }
         }
      }
   }
}
