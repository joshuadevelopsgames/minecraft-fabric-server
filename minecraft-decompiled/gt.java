import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gt implements gm {
   private final gs a;
   private final gs b;
   private final gs c;

   public gt(gs $$0, gs $$1, gs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fis a(ek $$0) {
      fis $$1 = $$0.d();
      return new fis(this.a.a($$1.d), this.b.a($$1.e), this.c.a($$1.f));
   }

   @Override
   public fir b(ek $$0) {
      fir $$1 = $$0.k();
      return new fir((float)this.a.a($$1.j), (float)this.b.a($$1.k));
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.b.a();
   }

   @Override
   public boolean c() {
      return this.c.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof gt $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gt a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gs $$2 = gs.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gs $$3 = gs.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gs $$4 = gs.a($$0);
            return new gt($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gr.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gr.a.createWithContext($$0);
      }
   }

   public static gt a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gs $$3 = gs.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gs $$4 = gs.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gs $$5 = gs.a($$0, $$1);
            return new gt($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gr.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gr.a.createWithContext($$0);
      }
   }

   public static gt a(double $$0, double $$1, double $$2) {
      return new gt(new gs(false, $$0), new gs(false, $$1), new gs(false, $$2));
   }

   public static gt a(fir $$0) {
      return new gt(new gs(false, $$0.j), new gs(false, $$0.k), new gs(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
