public interface dek {
   dek.a a = new dek.a(false, false);
   dek.a b = new dek.a(true, false);

   boolean a();

   boolean b();

   public record a(boolean c, boolean d) implements dek {
      @Override
      public boolean a() {
         return this.c;
      }

      @Override
      public boolean b() {
         return this.d;
      }

      public dek.a c() {
         return new dek.a(this.c, true);
      }

      public boolean d() {
         return this.c;
      }

      public boolean e() {
         return this.d;
      }
   }
}
