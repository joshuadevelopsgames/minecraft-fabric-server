import javax.annotation.Nullable;

public interface gac {
   Object b = new Object();
   int c = 160;
   int d = 32;

   gac.a a();

   void a(gad var1, long var2);

   @Nullable
   default ayy b() {
      return null;
   }

   void a(fxb var1, fwz var2, long var3);

   default Object h() {
      return b;
   }

   default float a(int $$0, float $$1) {
      return $$0 - this.e() * $$1;
   }

   default float a(int $$0) {
      return $$0 * this.f();
   }

   default int e() {
      return 160;
   }

   default int f() {
      return 32;
   }

   default int i() {
      return bcb.e(this.f(), 32);
   }

   default void d() {
   }

   public static enum a {
      a(ayz.Cb),
      b(ayz.Cc);

      private final ayy c;

      private a(final ayy $$0) {
         this.c = $$0;
      }

      public void a(hwx $$0) {
         $$0.a(hvm.a(this.c, 1.0F, 1.0F));
      }
   }
}
