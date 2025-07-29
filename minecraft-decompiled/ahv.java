import java.time.Instant;
import javax.annotation.Nullable;

public record ahv(String b, Instant c, long d, @Nullable ya e, xv.b f) implements zw<ahm> {
   public static final zm<wg, ahv> a = zw.a(ahv::a, ahv::new);

   private ahv(wg $$0) {
      this($$0.d(256), $$0.t(), $$0.readLong(), $$0.c(ya::a), new xv.b($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.b, 256);
      $$0.a(this.c);
      $$0.b(this.d);
      $$0.a(this.e, ya::a);
      this.f.a($$0);
   }

   @Override
   public zy<ahv> a() {
      return ahk.bt;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public Instant e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }

   @Nullable
   public ya g() {
      return this.e;
   }

   public xv.b h() {
      return this.f;
   }
}
