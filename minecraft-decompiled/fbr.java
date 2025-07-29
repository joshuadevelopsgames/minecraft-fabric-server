import javax.annotation.Nullable;

public class fbr implements fbs {
   private final dmu b;

   public fbr(dmu $$0) {
      this.b = $$0;
   }

   @Override
   public void a(jh $$0, eeb $$1, jb $$2, jb $$3, int $$4, int $$5) {
      fbs.a(this.b, $$0, $$2, $$3, $$1, $$4, $$5 - 1);
   }

   @Override
   public void a(jb $$0, dpz $$1, @Nullable fbt $$2) {
      eeb $$3 = this.b.a_($$0);
      this.a($$3, $$0, $$1, $$2, false);
   }

   @Override
   public void a(eeb $$0, jb $$1, dpz $$2, @Nullable fbt $$3, boolean $$4) {
      fbs.a(this.b, $$0, $$1, $$2, $$3, $$4);
   }
}
