import javax.annotation.Nullable;

public class ebf extends eck {
   public ebf(jb $$0, eeb $$1) {
      super(ebb.K, $$0, $$1);
   }

   @Override
   public ejk.d a() {
      return new ebf.a(this.aA_());
   }

   protected class a extends eck.a {
      public a(final jb $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable ejb.a $$3) {
         int $$4 = this.a($$0, this.c, ebf.this.m());
         return $$4 != 0 && ejk.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dmu $$0, jb $$1, eeb $$2) {
         jh $$3 = $$2.c(dqo.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
