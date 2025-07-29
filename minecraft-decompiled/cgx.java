import java.util.EnumSet;

public class cgx extends chi {
   private final cao a;
   private final dmu b;

   public cgx(cao $$0, dmu $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(chi.a.c));
   }

   @Override
   public boolean b() {
      boolean $$0 = this.a.aJ || this.a.aI;
      if ($$0 && this.a.ap().a(azs.h)) {
         jb $$1 = this.a.dx().d();
         eeb $$2 = this.b.a_($$1);
         return $$2.a(dqb.ry) || $$2.g(this.b, $$1) == fjj.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      this.a.R().a();
   }
}
