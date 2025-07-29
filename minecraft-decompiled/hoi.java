import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hoi implements hoe {
   private final List<gyv> a;
   private final Supplier<Vector3f[]> b;
   private final hoj c;

   public hoi(List<gyv> $$0, hoj $$1) {
      this.a = $$0;
      this.c = $$1;
      this.b = Suppliers.memoize(() -> hny.a(this.a));
   }

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
      hoh.b $$7 = $$0.a();
      $$7.a(gyi.i());
      this.c.a($$7, $$3);
      $$7.a(this.b);
      $$7.b().addAll(this.a);
   }
}
