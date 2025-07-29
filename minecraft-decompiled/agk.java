import java.util.Optional;

public record agk(String b, String c, int d, Optional<xo> e, Optional<ze> f) implements zw<acq> {
   public static final zm<wx, agk> a = zm.a(zk.p, agk::b, zk.p, agk::e, zk.h, agk::f, xq.e, agk::g, zg.d, agk::h, agk::new);

   @Override
   public zy<agk> a() {
      return ahk.aP;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<xo> g() {
      return this.e;
   }

   public Optional<ze> h() {
      return this.f;
   }
}
