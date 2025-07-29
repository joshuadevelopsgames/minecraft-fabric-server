import java.util.BitSet;
import javax.annotation.Nullable;

public class aec implements zw<acq> {
   public static final zm<wx, aec> a = zw.a(aec::a, aec::new);
   private final int b;
   private final int c;
   private final aeb d;
   private final aeg e;

   public aec(egi $$0, faa $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dlz $$4 = $$0.f();
      this.b = $$4.h;
      this.c = $$4.i;
      this.d = new aeb($$0);
      this.e = new aeg($$4, $$1, $$2, $$3);
   }

   private aec(wx $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new aeb($$0, this.b, this.c);
      this.e = new aeg($$0, this.b, this.c);
   }

   private void a(wx $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zy<aec> a() {
      return ahk.K;
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

   public aeb f() {
      return this.d;
   }

   public aeg g() {
      return this.e;
   }
}
