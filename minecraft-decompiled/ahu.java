import java.time.Instant;

public record ahu(String b, Instant c, long d, es e, xv.b f) implements zw<ahm> {
   public static final zm<wg, ahu> a = zw.a(ahu::a, ahu::new);

   private ahu(wg $$0) {
      this($$0.p(), $$0.t(), $$0.readLong(), new es($$0), new xv.b($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.b(this.d);
      this.e.a($$0);
      this.f.a($$0);
   }

   @Override
   public zy<ahu> a() {
      return ahk.bs;
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

   public es g() {
      return this.e;
   }

   public xv.b h() {
      return this.f;
   }
}
