import javax.annotation.Nullable;

public class fjg extends fjc {
   @Nullable
   private jb b;
   @Nullable
   private jb c;

   protected fjg(cxg $$0, boolean $$1) {
      super($$0, $$1, false);
      this.a($$0);
   }

   private void a(cxg $$0) {
      jb $$1 = $$0.l();
      eeb $$2 = $$0.ai().a_($$1);
      boolean $$3 = dpo.h($$2);
      if ($$3) {
         this.b = $$1.e();
         eff $$4 = $$2.c(((dpo)$$2.b()).c());
         if ($$4.b()) {
            this.c = switch ($$4) {
               case c -> $$1.i();
               case d -> $$1.h();
               case e -> $$1.f();
               case f -> $$1.g();
               default -> null;
            };
         }
      }
   }

   @Override
   public fjm a(eeb $$0, dmc $$1, jb $$2) {
      return !$$2.equals(this.b) && !$$2.equals(this.c) ? super.a($$0, $$1, $$2) : fjj.a();
   }
}
