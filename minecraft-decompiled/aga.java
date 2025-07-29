import javax.annotation.Nullable;

public class aga implements zw<acq> {
   public static final zm<wg, aga> a = zw.a(aga::a, aga::new);
   private final int b;
   private final int c;

   public aga(bzm $$0, @Nullable bzm $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private aga(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zy<aga> a() {
      return ahk.aG;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
