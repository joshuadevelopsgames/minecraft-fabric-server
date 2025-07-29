import javax.annotation.Nullable;

public interface fix {
   static fix a() {
      return fjc.a;
   }

   static fix a(bzm $$0) {
      return (fix)(switch ($$0) {
         case cxg $$1 -> cxg.b($$1.ai()) ? new fjg($$1, false) : new fjc($$0, false, false);
         default -> new fjc($$0, false, false);
      });
   }

   static fix a(bzm $$0, boolean $$1) {
      return new fjc($$0, $$1, false);
   }

   static fix a(@Nullable cut $$0) {
      return new fjc(
         $$0 != null ? $$0.ck() : false,
         true,
         $$0 != null ? $$0.dE() : -Double.MAX_VALUE,
         $$0 instanceof cam ? $$0.fh() : dcv.l,
         $$0 instanceof cam ? $$1 -> $$0.a($$1) : $$0x -> false,
         $$0
      );
   }

   static fix a(@Nullable bzm $$0, double $$1) {
      return new fjc(
         $$0 != null ? $$0.ck() : false,
         true,
         $$0 != null ? $$1 : -Double.MAX_VALUE,
         $$0 instanceof cam $$2 ? $$2.fh() : dcv.l,
         $$0 instanceof cam $$3 ? $$1x -> $$3.a($$1x) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(fjm var1, jb var2, boolean var3);

   boolean a(dcr var1);

   boolean a(fal var1, fal var2);

   fjm a(eeb var1, dmc var2, jb var3);

   default boolean c() {
      return false;
   }
}
