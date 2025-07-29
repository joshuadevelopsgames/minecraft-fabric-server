import com.google.common.collect.Lists;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class ggg extends get {
   public static final int a = 114;
   public static final int b = 126;
   public static final int c = 192;
   public static final int d = 192;
   public static final int e = 256;
   public static final int f = 256;
   private static final xo u = xo.c("book.edit.title");
   private final cut v;
   private final dcv w;
   private final ggh x;
   private int y;
   private final List<String> z = Lists.newArrayList();
   private ghj A;
   private ghj B;
   private final bxi C;
   private xo D = xn.a;
   private fyh E;

   public ggg(cut $$0, dcv $$1, bxi $$2, dge $$3) {
      super(u);
      this.v = $$0;
      this.w = $$1;
      this.C = $$2;
      $$3.a(fue.R().aU()).forEach(this.z::add);
      if (this.z.isEmpty()) {
         this.z.add("");
      }

      this.x = new ggh(this, $$0, $$2, this.z);
   }

   private int l() {
      return this.z.size();
   }

   @Override
   protected void aV_() {
      int $$0 = (this.o - 192) / 2;
      int $$1 = 2;
      int $$2 = 8;
      this.E = fyh.r().c(false).c(-16777216).d(-16777216).b(false).a(false).a((this.o - 114) / 2 - 8).b(28).a(this.q, 122, 134, xn.a);
      this.E.a(1024);
      this.E.b(126 / 9);
      this.E.b($$0x -> this.z.set(this.y, $$0x));
      this.c(this.E);
      this.F();
      this.D = this.m();
      this.B = this.c(new ghj($$0 + 43, 159, false, $$0x -> this.n(), true));
      this.A = this.c(new ghj($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.c(fxo.a(xo.c("book.signButton"), $$0x -> this.n.a(this.x)).a(this.o / 2 - 100, 196, 98, 20).a());
      this.c(fxo.a(xn.d, $$0x -> {
         this.n.a(null);
         this.K();
      }).a(this.o / 2 + 2, 196, 98, 20).a());
      this.G();
   }

   @Override
   protected void aF_() {
      this.b(this.E);
   }

   @Override
   public xo i() {
      return xn.a(super.i(), this.m());
   }

   private xo m() {
      return xo.a("book.pageIndicator", this.y + 1, this.l());
   }

   private void n() {
      if (this.y > 0) {
         this.y--;
         this.F();
      }

      this.G();
   }

   private void E() {
      if (this.y < this.l() - 1) {
         this.y++;
      } else {
         this.M();
         if (this.y < this.l() - 1) {
            this.y++;
         }
      }

      this.F();
      this.G();
   }

   private void F() {
      this.E.a(this.z.get(this.y), true);
      this.D = this.m();
   }

   private void G() {
      this.B.k = this.y > 0;
   }

   private void H() {
      ListIterator<String> $$0 = this.z.listIterator(this.z.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void K() {
      this.H();
      this.L();
      int $$0 = this.C == bxi.a ? this.v.gs().f() : 40;
      this.n.M().b(new aih($$0, this.z, Optional.empty()));
   }

   private void L() {
      this.w.b(kq.U, new dge(this.z.stream().map(aut::a).toList()));
   }

   private void M() {
      if (this.l() < 100) {
         this.z.add("");
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 266:
            this.B.b();
            return true;
         case 267:
            this.A.b();
            return true;
         default:
            return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.o - 192) / 2;
      int $$5 = 2;
      int $$6 = this.q.a(this.D);
      $$0.a(this.q, this.D, $$4 - $$6 + 192 - 44, 18, -16777216, false);
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      this.c($$0);
      $$0.a(gxx.ar, ggi.e, (this.o - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }
}
