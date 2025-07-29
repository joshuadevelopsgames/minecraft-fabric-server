import java.util.Collection;
import javax.annotation.Nullable;

public interface dwy {
   dwy B_ = new dwy() {
      @Override
      public boolean a(dmv $$0, jb $$1, eeb $$2, @Nullable Collection<jh> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((dxe)dqb.rC).q().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.l() && !$$2.y().b(fam.c) ? false : dxe.a($$0, $$1, $$2, $$3);
         } else {
            return dwy.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(dxd.a $$0, dmv $$1, jb $$2, bck $$3, dxd $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int j_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte b() {
      return 1;
   }

   default void a(dmv $$0, eeb $$1, jb $$2, bck $$3) {
   }

   default boolean a(dmv $$0, jb $$1, bck $$2) {
      return false;
   }

   default boolean a(dmv $$0, jb $$1, eeb $$2, @Nullable Collection<jh> $$3, boolean $$4) {
      return ((dvh)dqb.rC).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean d() {
      return true;
   }

   default int j_(int $$0) {
      return 1;
   }

   int a(dxd.a var1, dmv var2, jb var3, bck var4, dxd var5, boolean var6);
}
