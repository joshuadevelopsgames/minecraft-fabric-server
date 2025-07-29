public class gqt {
   private final gqv a;
   private final gqu b;

   private gqt(gqv $$0, gqu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gqt a(gqw $$0) {
      return new gqt($$0.apply(this.a), this.b);
   }

   public gqn a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gqt a(gqv $$0, int $$1, int $$2) {
      return new gqt($$0, new gqu($$1, $$2));
   }
}
