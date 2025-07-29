import java.util.List;
import java.util.Optional;

public class dan extends czq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int u = 8;
   public static final int v = 26;
   public static final int w = 44;
   private static final int y = 98;
   public static final int x = 48;
   private final dmu z;
   private final dhv A;
   private final dhv B;
   private final dhv C;
   private final czg D = czg.a();

   public dan(int $$0, cus $$1) {
      this($$0, $$1, cyz.a);
   }

   public dan(int $$0, cus $$1, cyz $$2) {
      this($$0, $$1, $$2, $$1.j.ai());
   }

   private dan(int $$0, cus $$1, cyz $$2, dmu $$3) {
      super(czv.v, $$0, $$1, $$2, a($$3.R()));
      this.z = $$3;
      this.A = $$3.R().a(dhv.b);
      this.B = $$3.R().a(dhv.c);
      this.C = $$3.R().a(dhv.d);
      this.a(this.D).a(0);
   }

   private static czr a(dhn $$0) {
      dhv $$1 = $$0.a(dhv.b);
      dhv $$2 = $$0.a(dhv.c);
      dhv $$3 = $$0.a(dhv.d);
      return czr.a().a(0, 8, 48, $$2::a).a(1, 26, 48, $$1::a).a(2, 44, 48, $$3::a).a(3, 98, 48).a();
   }

   @Override
   protected boolean a(eeb $$0) {
      return $$0.a(dqb.oI);
   }

   @Override
   protected void a(cut $$0, dcv $$1) {
      $$1.a($$0, $$1.M());
      this.t.a($$0, this.o());
      this.e(0);
      this.e(1);
      this.e(2);
      this.q.a(($$0x, $$1x) -> $$0x.c(1044, $$1x, 0));
   }

   private List<dcv> o() {
      return List.of(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private dii p() {
      return new dii(this.s.a(0), this.s.a(1), this.s.a(2));
   }

   private void e(int $$0) {
      dcv $$1 = this.s.a($$0);
      if (!$$1.f()) {
         $$1.h(1);
         this.s.a($$0, $$1);
      }
   }

   @Override
   public void a(bxc $$0) {
      super.a($$0);
      if (this.z instanceof aub) {
         boolean $$1 = this.b(0).h() && this.b(1).h() && this.b(2).h() && !this.b(this.n()).h();
         this.D.a($$1 ? 1 : 0);
      }
   }

   @Override
   public void l() {
      dii $$0 = this.p();
      Optional<dhr<dih>> $$2;
      if (this.z instanceof aub $$1) {
         $$2 = $$1.u().a(dhx.g, $$0, $$1);
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$1x -> {
         dcv $$2x = ((dih)$$1x.b()).a($$0, this.z.K_());
         this.t.a($$1x);
         this.t.a(0, $$2x);
      }, () -> {
         this.t.a(null);
         this.t.a(0, dcv.l);
      });
   }

   @Override
   public boolean a(dcv $$0, dak $$1) {
      return $$1.c != this.t && super.a($$0, $$1);
   }

   @Override
   public boolean b(dcv $$0) {
      if (this.B.a($$0) && !this.b(0).h()) {
         return true;
      } else {
         return this.A.a($$0) && !this.b(1).h() ? true : this.C.a($$0) && !this.b(2).h();
      }
   }

   public boolean m() {
      return this.D.b() > 0;
   }
}
