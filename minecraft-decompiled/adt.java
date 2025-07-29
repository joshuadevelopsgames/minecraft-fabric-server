import javax.annotation.Nullable;

public class adt implements zw<acq> {
   public static final zm<wg, adt> a = zw.a(adt::a, adt::new);
   private final int b;
   private final byte c;

   public adt(bzm $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private adt(wg $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(wg $$0) {
      $$0.q(this.b);
      $$0.l(this.c);
   }

   @Override
   public zy<adt> a() {
      return ahk.C;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   @Nullable
   public bzm a(dmu $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
