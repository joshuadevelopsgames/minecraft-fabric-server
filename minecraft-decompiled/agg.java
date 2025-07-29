import java.util.Optional;

public class agg implements zw<acq> {
   public static final zm<wx, agg> a = zw.a(agg::a, agg::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xo f;
   private final fka.a g;
   private final Optional<ze> h;
   private final int i;

   public agg(fjp $$0, int $$1) {
      this.e = $$0.c();
      this.f = $$0.e();
      this.g = $$0.i();
      this.h = Optional.ofNullable($$0.g());
      this.i = $$1;
   }

   private agg(wx $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xn.a;
         this.g = fka.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xq.d.decode($$0);
         this.g = $$0.b(fka.a.class);
         this.h = zg.d.decode($$0);
      }
   }

   private void a(wx $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xq.d.encode($$0, this.f);
         $$0.a(this.g);
         zg.d.encode($$0, this.h);
      }
   }

   @Override
   public zy<agg> a() {
      return ahk.aM;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xo e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fka.a g() {
      return this.g;
   }

   public Optional<ze> h() {
      return this.h;
   }
}
