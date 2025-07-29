import java.util.List;

public class agh implements zw<acq> {
   public static final zm<wg, agh> a = zw.a(agh::a, agh::new);
   private final int b;
   private final int[] c;

   public agh(bzm $$0) {
      this.b = $$0.ar();
      List<bzm> $$1 = $$0.da();
      this.c = new int[$$1.size()];

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c[$$2] = $$1.get($$2).ar();
      }
   }

   private agh(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.c();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zy<agh> a() {
      return ahk.aN;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int[] b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
