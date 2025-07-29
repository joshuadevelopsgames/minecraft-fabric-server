import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ciz extends cji {
   private final cmv a;
   @Nullable
   private cam b;
   private final clc c = clc.a().a(64.0);

   public ciz(cmv $$0) {
      super($$0, false, true);
      this.a = $$0;
      this.a(EnumSet.of(chi.a.d));
   }

   @Override
   public boolean b() {
      fin $$0 = this.a.cV().c(10.0, 8.0, 10.0);
      aub $$1 = a(this.a);
      List<? extends cam> $$2 = $$1.a(cuf.class, this.c, this.a, $$0);
      List<cut> $$3 = $$1.a(this.c, this.a, $$0);

      for (cam $$4 : $$2) {
         cuf $$5 = (cuf)$$4;

         for (cut $$6 : $$3) {
            int $$7 = $$5.i($$6);
            if ($$7 <= -100) {
               this.b = $$6;
            }
         }
      }

      return this.b == null ? false : !(this.b instanceof cut $$8 && ($$8.am() || $$8.gI()));
   }

   @Override
   public void d() {
      this.a.g(this.b);
      super.d();
   }
}
