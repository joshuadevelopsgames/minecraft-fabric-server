import java.util.Optional;
import javax.annotation.Nullable;

public interface dxl extends dqh, dux {
   @Override
   default boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return $$4 == fam.c;
   }

   @Override
   default boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      if (!$$2.c(eer.I) && $$3.a() == fam.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(eer.I, true), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default dcv a(@Nullable cam $$0, dmv $$1, jb $$2, eeb $$3) {
      if ($$3.c(eer.I)) {
         $$1.a($$2, $$3.b(eer.I, false), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new dcv(dcz.rG);
      } else {
         return dcv.l;
      }
   }

   @Override
   default Optional<ayy> as_() {
      return fam.c.j();
   }
}
