import java.util.function.Function;
import javax.annotation.Nullable;

public class hof {
   private final Function<ame, hoe> a;
   private final Function<ame, hoa.a> b;

   public hof(huh $$0) {
      this.a = $$0::a;
      this.b = $$0::b;
   }

   public void a(hoh $$0, dcv $$1, dct $$2, cam $$3) {
      this.a($$0, $$1, $$2, $$3.ai(), $$3, $$3.ar() + $$2.ordinal());
   }

   public void a(hoh $$0, dcv $$1, dct $$2, bzm $$3) {
      this.a($$0, $$1, $$2, $$3.ai(), null, $$3.ar());
   }

   public void a(hoh $$0, dcv $$1, dct $$2, @Nullable dmu $$3, @Nullable cam $$4, int $$5) {
      $$0.b();
      if (!$$1.f()) {
         $$0.a = $$2;
         this.b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   public void b(hoh $$0, dcv $$1, dct $$2, @Nullable dmu $$3, @Nullable cam $$4, int $$5) {
      ame $$6 = $$1.a(kq.i);
      if ($$6 != null) {
         $$0.a(this.b.apply($$6).b());
         this.a.apply($$6).a($$0, $$1, this, $$2, $$3 instanceof grk $$7 ? $$7 : null, $$4, $$5);
      }
   }

   public boolean a(dcv $$0) {
      ame $$1 = $$0.a(kq.i);
      return $$1 == null ? true : this.b.apply($$1).a();
   }
}
