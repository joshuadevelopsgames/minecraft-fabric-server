import javax.annotation.Nullable;

public abstract class fbv {
   protected final dwj a;

   protected fbv(dwj $$0) {
      this.a = $$0;
   }

   public abstract void a(dmu var1, jb var2, eeb var3, @Nullable fbt var4, boolean var5);

   protected int a(dmu $$0, jb $$1) {
      return this.a.a($$0, $$1);
   }

   protected int a(jb $$0, eeb $$1) {
      return $$1.a(this.a) ? $$1.c(dwj.f) : 0;
   }

   protected int b(dmu $$0, jb $$1) {
      int $$2 = 0;

      for (jh $$3 : jh.c.a) {
         jb $$4 = $$1.a($$3);
         eeb $$5 = $$0.a_($$4);
         $$2 = Math.max($$2, this.a($$4, $$5));
         jb $$6 = $$1.d();
         if ($$5.d($$0, $$4) && !$$0.a_($$6).d($$0, $$6)) {
            jb $$7 = $$4.d();
            $$2 = Math.max($$2, this.a($$7, $$0.a_($$7)));
         } else if (!$$5.d($$0, $$4)) {
            jb $$8 = $$4.e();
            $$2 = Math.max($$2, this.a($$8, $$0.a_($$8)));
         }
      }

      return Math.max(0, $$2 - 1);
   }
}
