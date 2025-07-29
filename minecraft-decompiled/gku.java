import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import javax.annotation.Nullable;

class gku {
   private static final int a = 44;
   private final List<gku.c> b;
   private final gbl c;

   gku(List<gku.c> $$0, gbl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public gbl a() {
      return this.c;
   }

   public void b() {
      this.b.forEach(gku.c::a);
   }

   public static gku.a a(int $$0) {
      return new gku.a($$0);
   }

   public static class a {
      final int a;
      private final List<gku.d> b = new ArrayList<>();
      int c;
      int d = 4;
      int e;
      Optional<gku.b> f = Optional.empty();

      public a(int $$0) {
         this.a = $$0;
      }

      void b() {
         this.e++;
      }

      public gku.d a(xo $$0, BooleanSupplier $$1, Consumer<Boolean> $$2) {
         gku.d $$3 = new gku.d($$0, $$1, $$2, 44);
         this.b.add($$3);
         return $$3;
      }

      public gku.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public gku.a b(int $$0) {
         this.d = $$0;
         return this;
      }

      public gku a() {
         gbj $$0 = new gbj().b(this.d);
         $$0.a(gbp.a(this.a - 44), 0, 0);
         $$0.a(gbp.a(44), 0, 1);
         List<gku.c> $$1 = new ArrayList<>();
         this.e = 0;

         for (gku.d $$2 : this.b) {
            $$1.add($$2.a(this, $$0, 0));
         }

         $$0.a();
         gku $$3 = new gku($$1, $$0);
         $$3.b();
         return $$3;
      }

      public gku.a a(int $$0, boolean $$1) {
         this.f = Optional.of(new gku.b($$0, $$1));
         return this;
      }
   }

   record b(int a, boolean b) {
   }

   record c(fxv<Boolean> a, BooleanSupplier b, @Nullable BooleanSupplier c) {
      public void a() {
         this.a.a(this.b.getAsBoolean());
         if (this.c != null) {
            this.a.j = this.c.getAsBoolean();
         }
      }

      public fxv<Boolean> b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }

      @Nullable
      public BooleanSupplier d() {
         return this.c;
      }
   }

   public static class d {
      private final xo a;
      private final BooleanSupplier b;
      private final Consumer<Boolean> c;
      @Nullable
      private xo d;
      @Nullable
      private BooleanSupplier e;
      private final int f;

      d(xo $$0, BooleanSupplier $$1, Consumer<Boolean> $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = $$3;
      }

      public gku.d a(BooleanSupplier $$0) {
         this.e = $$0;
         return this;
      }

      public gku.d a(xo $$0) {
         this.d = $$0;
         return this;
      }

      gku.c a(gku.a $$0, gbj $$1, int $$2) {
         $$0.b();
         fyx $$3 = new fyx(this.a, fue.R().h).c();
         $$1.a($$3, $$0.e, $$2, $$1.b().a(0.0F, 0.5F).b($$0.c));
         Optional<gku.b> $$4 = $$0.f;
         fxv.a<Boolean> $$5 = fxv.b(this.b.getAsBoolean());
         $$5.a();
         boolean $$6 = this.d != null && $$4.isEmpty();
         if ($$6) {
            fzb $$7 = fzb.a(this.d);
            $$5.a($$1x -> $$7);
         }

         if (this.d != null && !$$6) {
            $$5.a($$0x -> xn.a(this.a, $$0x.c(), this.d));
         } else {
            $$5.a($$0x -> xn.a(this.a, $$0x.c()));
         }

         fxv<Boolean> $$8 = $$5.a(0, 0, this.f, 20, xo.i(), ($$0x, $$1x) -> this.c.accept($$1x));
         if (this.e != null) {
            $$8.j = this.e.getAsBoolean();
         }

         $$1.a($$8, $$0.e, $$2 + 1, $$1.b().c());
         if (this.d != null) {
            $$4.ifPresent($$3x -> {
               xo $$4x = this.d.f().a(o.h);
               fwz $$5x = fue.R().h;
               fyj $$6x = new fyj($$4x, $$5x);
               $$6x.d($$0.a - $$0.c - this.f);
               $$6x.e($$3x.a());
               $$0.b();
               int $$7 = $$3x.b ? 9 * $$3x.a - $$6x.y() : 0;
               $$1.a($$6x, $$0.e, $$2, $$1.b().c(-$$0.d).e($$7));
            });
         }

         return new gku.c($$8, this.b, this.e);
      }
   }
}
