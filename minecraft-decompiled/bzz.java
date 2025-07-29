import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public interface bzz {
   void a(bzw var1, dcv var2);

   dcv a(bzw var1);

   void a(bzw var1, float var2);

   default void a(bzy $$0, fdm $$1) {
      this.a($$0.a(), $$1, $$0.b());
   }

   default void a(amd<fdo> $$0, fdm $$1, Map<bzw, Float> $$2) {
      this.a($$0, $$1, 0L, $$2);
   }

   default void a(amd<fdo> $$0, fdm $$1, long $$2, Map<bzw, Float> $$3) {
      fdo $$4 = $$1.a().q().bc().a($$0);
      if ($$4 != fdo.f) {
         List<dcv> $$5 = $$4.a($$1, $$2);
         List<bzw> $$6 = new ArrayList<>();

         for (dcv $$7 : $$5) {
            bzw $$8 = this.a($$7, $$6);
            if ($$8 != null) {
               dcv $$9 = $$8.a($$7);
               this.a($$8, $$9);
               Float $$10 = $$3.get($$8);
               if ($$10 != null) {
                  this.a($$8, $$10);
               }

               $$6.add($$8);
            }
         }
      }
   }

   @Nullable
   default bzw a(dcv $$0, List<bzw> $$1) {
      if ($$0.f()) {
         return null;
      } else {
         dle $$2 = $$0.a(kq.D);
         if ($$2 != null) {
            bzw $$3 = $$2.b();
            if (!$$1.contains($$3)) {
               return $$3;
            }
         } else if (!$$1.contains(bzw.a)) {
            return bzw.a;
         }

         return null;
      }
   }
}
