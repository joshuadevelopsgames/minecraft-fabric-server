import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hua {
   public static final Comparator<hua> a = Comparator.<hua, ame>comparing(hua::a).thenComparing(hua::b);
   private final ame b;
   private final ame c;
   @Nullable
   private gxz d;

   public hua(ame $$0, ame $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ame a() {
      return this.b;
   }

   public ame b() {
      return this.c;
   }

   public hrs c() {
      return fue.R().a(this.a()).apply(this.b());
   }

   public gxz a(Function<ame, gxz> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this.b);
      }

      return this.d;
   }

   public fog a(gxn $$0, Function<ame, gxz> $$1) {
      return this.c().a($$0.getBuffer(this.a($$1)));
   }

   public fog a(gxn $$0, Function<ame, gxz> $$1, boolean $$2, boolean $$3) {
      return this.c().a(hfd.a($$0, this.a($$1), $$2, $$3));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hua $$1 = (hua)$$0;
         return this.b.equals($$1.b) && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.b, this.c);
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.b + ", texture=" + this.c + "}";
   }
}
