import java.util.EnumSet;

public class chc extends chi {
   private final cao a;

   public chc(cao $$0) {
      this.a = $$0;
      this.a(EnumSet.of(chi.a.c));
      $$0.S().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bm() && this.a.b(azu.a) > this.a.dr() || this.a.bA();
   }

   @Override
   public boolean X_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.ec().i() < 0.8F) {
         this.a.R().a();
      }
   }
}
