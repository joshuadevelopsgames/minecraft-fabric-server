import java.util.UUID;
import javax.annotation.Nullable;

public record aes(int b, UUID c, int d, @Nullable ya e, yh.a f, @Nullable xo g, xs h, xk.a i) implements zw<acq> {
   public static final zm<wx, aes> a = zw.a(aes::a, aes::new);

   private aes(wx $$0) {
      this($$0.l(), $$0.n(), $$0.l(), $$0.c(ya::a), new yh.a($$0), wg.a($$0, xq.d), xs.a($$0), xk.a.a.decode($$0));
   }

   private void a(wx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e, ya::a);
      this.f.a($$0);
      wg.a($$0, this.g, xq.d);
      xs.a($$0, this.h);
      xk.a.a.encode($$0, this.i);
   }

   @Override
   public zy<aes> a() {
      return ahk.ab;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public UUID e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   @Nullable
   public ya g() {
      return this.e;
   }

   public yh.a h() {
      return this.f;
   }

   @Nullable
   public xo i() {
      return this.g;
   }

   public xs j() {
      return this.h;
   }

   public xk.a k() {
      return this.i;
   }
}
