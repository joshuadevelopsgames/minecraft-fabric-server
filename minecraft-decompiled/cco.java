import java.util.Optional;

public class cco implements cdr {
   private final bzm a;
   private final boolean b;
   private final boolean c;

   public cco(bzm $$0, boolean $$1) {
      this($$0, $$1, false);
   }

   public cco(bzm $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fis a() {
      return this.b ? this.a.dv().b(0.0, this.a.cW(), 0.0) : this.a.dv();
   }

   @Override
   public jb b() {
      return this.c ? jb.a((jv)this.a.bI()) : this.a.dx();
   }

   @Override
   public boolean a(cam $$0) {
      if (this.a instanceof cam $$1) {
         if (!$$1.bO()) {
            return false;
         } else {
            Optional<cjq> $$3 = $$0.eh().c(cjo.h);
            return $$3.isPresent() && $$3.get().a($$1);
         }
      } else {
         return true;
      }
   }

   public bzm c() {
      return this.a;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.a;
   }
}
