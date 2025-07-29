import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class hwy implements hwz<hvo> {
   private final List<hwz<hvo>> a = Lists.newArrayList();
   @Nullable
   private final xo b;

   public hwy(ame $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : xo.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (hwz<hvo> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public hvo a(bck $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (hwz<hvo> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return hwx.b;
      } else {
         return hwx.b;
      }
   }

   public void a(hwz<hvo> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public xo a() {
      return this.b;
   }

   @Override
   public void a(hwu $$0) {
      for (hwz<hvo> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}
