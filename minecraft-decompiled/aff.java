import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;

public class aff implements zw<acq> {
   public static final zm<wg, aff> a = zw.a(aff::a, aff::new);
   private final IntList b;

   public aff(IntList $$0) {
      this.b = new IntArrayList($$0);
   }

   public aff(int... $$0) {
      this.b = new IntArrayList($$0);
   }

   private aff(wg $$0) {
      this.b = $$0.a();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
   }

   @Override
   public zy<aff> a() {
      return ahk.an;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public IntList b() {
      return this.b;
   }
}
