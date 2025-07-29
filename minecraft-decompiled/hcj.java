import com.google.common.collect.Lists;
import java.util.Collection;

public class hcj implements hbz.a {
   private static final int a = 160;
   private static final float b = 0.04F;
   private final fue c;
   private Collection<jb> d = Lists.newArrayList();

   public hcj(fue $$0) {
      this.c = $$0;
   }

   public void a(Collection<jb> $$0) {
      this.d = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      jb $$5 = this.b().e();

      for (jb $$6 : this.d) {
         if ($$5.a($$6, 160.0)) {
            a($$0, $$1, $$6);
         }
      }
   }

   private static void a(fod $$0, gxn $$1, jb $$2) {
      hbz.a($$0, $$1, $$2, 1.0F, 0.0F, 0.0F, 0.15F);
      a($$0, $$1, "Raid center", $$2, -65536);
   }

   private static void a(fod $$0, gxn $$1, String $$2, jb $$3, int $$4) {
      double $$5 = $$3.u() + 0.5;
      double $$6 = $$3.v() + 1.3;
      double $$7 = $$3.w() + 0.5;
      hbz.a($$0, $$1, $$2, $$5, $$6, $$7, $$4, 0.04F, true, 0.0F, true);
   }

   private ftm b() {
      return this.c.j.l();
   }
}
