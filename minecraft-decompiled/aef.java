import java.util.BitSet;
import javax.annotation.Nullable;

public class aef implements zw<acq> {
   public static final zm<wg, aef> a = zw.a(aef::a, aef::new);
   private final int b;
   private final int c;
   private final aeg d;

   public aef(dlz $$0, faa $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new aeg($$0, $$1, $$2, $$3);
   }

   private aef(wg $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new aeg($$0, this.b, this.c);
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zy<aef> a() {
      return ahk.N;
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

   public aeg f() {
      return this.d;
   }
}
