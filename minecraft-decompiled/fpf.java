public interface fpf {
   fov b();

   void d();

   static fpf f() {
      return new fpf() {
         private final fov a = new fov();

         @Override
         public fov b() {
            return this.a;
         }

         @Override
         public void d() {
         }
      };
   }
}
