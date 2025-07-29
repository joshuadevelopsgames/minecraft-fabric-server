import javax.annotation.Nullable;

public class ajg implements zw<ahm> {
   public static final zm<wg, ajg> a = zw.a(ajg::a, ajg::new);
   private final int b;
   private final String c;
   private final boolean d;

   public ajg(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ajg(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zy<ajg> a() {
      return ahk.cg;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   @Nullable
   public dlt a(dmu $$0) {
      bzm $$1 = $$0.a(this.b);
      return $$1 instanceof cxq ? ((cxq)$$1).e() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
