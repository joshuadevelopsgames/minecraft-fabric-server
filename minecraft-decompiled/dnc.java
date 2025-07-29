import javax.annotation.Nullable;

public interface dnc {
   boolean a(jb var1, eeb var2, int var3, int var4);

   default boolean a(jb $$0, eeb $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jb var1, boolean var2);

   default boolean b(jb $$0, boolean $$1) {
      return this.a($$0, $$1, null);
   }

   default boolean a(jb $$0, boolean $$1, @Nullable bzm $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   boolean a(jb var1, boolean var2, @Nullable bzm var3, int var4);

   default boolean b(bzm $$0) {
      return false;
   }
}
