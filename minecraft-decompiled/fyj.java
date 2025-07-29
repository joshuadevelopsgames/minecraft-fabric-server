import java.util.OptionalInt;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyj extends fxk {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bct<fyj.a, fyi> c;
   private boolean d = false;
   private boolean e = false;
   @Nullable
   private Consumer<yl> f = null;

   public fyj(xo $$0, fwz $$1) {
      this(0, 0, $$0, $$1);
   }

   public fyj(int $$0, int $$1, xo $$2, fwz $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ag.a($$1x -> $$1x.c.isPresent() ? fyi.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fyi.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fyj c(int $$0) {
      super.a($$0);
      return this;
   }

   public fyj d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fyj e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fyj b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public fyj a(boolean $$0, @Nullable Consumer<yl> $$1) {
      this.e = $$0;
      this.f = $$1;
      return this;
   }

   @Override
   public int z() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int y() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      fyi $$4 = this.c.a(this.c());
      int $$5 = this.E();
      int $$6 = this.F();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.z() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }

      if (this.e) {
         yl $$9 = this.c($$1, $$2);
         if (this.B()) {
            $$0.a(this.a(), $$9, $$1, $$2);
         }
      }
   }

   @Nullable
   private yl c(double $$0, double $$1) {
      fyi $$2 = this.c.a(this.c());
      int $$3 = this.E();
      int $$4 = this.F();
      int $$5 = 9;
      return this.d ? $$2.a($$3 + this.z() / 2, $$4, $$5, $$0, $$1) : $$2.b($$3, $$4, $$5, $$0, $$1);
   }

   @Override
   public void a(double $$0, double $$1) {
      if (this.f != null) {
         yl $$2 = this.c($$0, $$1);
         if ($$2 != null) {
            this.f.accept($$2);
            return;
         }
      }

      super.a($$0, $$1);
   }

   private fyj.a c() {
      return new fyj.a(this.A(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   record a(xo a, int b, OptionalInt c) {
   }
}
