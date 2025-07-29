import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzv {
   private final Consumer<fxm> a;
   private final Consumer<fxm> b;
   private final Consumer<fzu> c;
   private final Consumer<fzu> d;
   @Nullable
   private fzu e;
   @Nullable
   private gcd f;

   public fzv(Consumer<fxm> $$0, Consumer<fxm> $$1) {
      this($$0, $$1, $$0x -> {}, $$0x -> {});
   }

   public fzv(Consumer<fxm> $$0, Consumer<fxm> $$1, Consumer<fzu> $$2, Consumer<fzu> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public void a(gcd $$0) {
      this.f = $$0;
      fzu $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fzu $$0, boolean $$1) {
      if (!Objects.equals(this.e, $$0)) {
         if (this.e != null) {
            this.e.a(this.b);
         }

         fzu $$2 = this.e;
         this.e = $$0;
         $$0.a(this.a);
         if (this.f != null) {
            $$0.a(this.f);
         }

         if ($$1) {
            fue.R().al().a(hvm.a(ayz.BU, 1.0F));
         }

         this.d.accept($$2);
         this.c.accept(this.e);
      }
   }

   @Nullable
   public fzu a() {
      return this.e;
   }
}
