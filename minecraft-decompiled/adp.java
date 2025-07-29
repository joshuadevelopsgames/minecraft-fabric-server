import java.util.Optional;

public record adp(int b, jl<byd> c, int d, int e, Optional<fis> f) implements zw<acq> {
   public static final zm<wx, adp> a = zw.a(adp::a, adp::new);

   public adp(bzm $$0, byb $$1) {
      this($$0.ar(), $$1.l(), $$1.d() != null ? $$1.d().ar() : -1, $$1.c() != null ? $$1.c().ar() : -1, Optional.ofNullable($$1.j()));
   }

   private adp(wx $$0) {
      this($$0.l(), byd.c.decode($$0), a((wg)$$0), a((wg)$$0), $$0.b($$0x -> new fis($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(wg $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int a(wg $$0) {
      return $$0.l() - 1;
   }

   private void a(wx $$0) {
      $$0.c(this.b);
      byd.c.encode($$0, this.c);
      a($$0, this.d);
      a($$0, this.e);
      $$0.a(this.f, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   @Override
   public zy<adp> a() {
      return ahk.y;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public byb a(dmu $$0) {
      if (this.f.isPresent()) {
         return new byb(this.c, this.f.get());
      } else {
         bzm $$1 = $$0.a(this.d);
         bzm $$2 = $$0.a(this.e);
         return new byb(this.c, $$2, $$1);
      }
   }

   public jl<byd> e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public Optional<fis> h() {
      return this.f;
   }
}
