import javax.annotation.Nullable;

public class cht extends cif {
   private static final int i = 10;
   private static final int j = 7;

   public cht(cau $$0, double $$1, boolean $$2) {
      super($$0, $$1, 10, $$2);
   }

   @Override
   public boolean b() {
      aub $$0 = (aub)this.b.ai();
      jb $$1 = this.b.dx();
      return $$0.c($$1) ? false : super.b();
   }

   @Nullable
   @Override
   protected fis h() {
      aub $$0 = (aub)this.b.ai();
      jb $$1 = this.b.dx();
      ke $$2 = ke.a($$1);
      ke $$3 = ccf.a($$0, $$2, 2);
      return $$3 != $$2 ? clg.a(this.b, 10, 7, fis.c($$3.k()), (float) (Math.PI / 2)) : null;
   }
}
