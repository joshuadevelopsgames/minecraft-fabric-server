import java.util.Locale;
import javax.annotation.Nullable;

public interface fbs {
   jh[] a = new jh[]{jh.e, jh.f, jh.a, jh.b, jh.c, jh.d};

   void a(jh var1, eeb var2, jb var3, jb var4, int var5, int var6);

   void a(jb var1, dpz var2, @Nullable fbt var3);

   void a(eeb var1, jb var2, dpz var3, @Nullable fbt var4, boolean var5);

   default void a(jb $$0, dpz $$1, @Nullable jh $$2, @Nullable fbt $$3) {
      for (jh $$4 : a) {
         if ($$4 != $$2) {
            this.a($$0.a($$4), $$1, null);
         }
      }
   }

   static void a(dmv $$0, jh $$1, jb $$2, jb $$3, eeb $$4, int $$5, int $$6) {
      eeb $$7 = $$0.a_($$2);
      if (($$5 & 128) == 0 || !$$7.a(dqb.cH)) {
         eeb $$8 = $$7.a($$0, $$0, $$2, $$1, $$3, $$4, $$0.H_());
         dpz.a($$7, $$8, $$0, $$2, $$5, $$6);
      }
   }

   static void a(dmu $$0, eeb $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         p $$7 = p.a(var9, "Exception while updating neighbours");
         q $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", () -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", mm.e.b($$3), $$3.v(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + mm.e.b($$3);
            }
         });
         q.a($$8, $$0, $$2, $$1);
         throw new aa($$7);
      }
   }
}
