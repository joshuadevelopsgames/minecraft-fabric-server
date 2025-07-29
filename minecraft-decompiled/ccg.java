public class ccg implements cdr {
   private final jb a;
   private final fis b;

   public ccg(jb $$0) {
      this.a = $$0.j();
      this.b = fis.b($$0);
   }

   public ccg(fis $$0) {
      this.a = jb.a((jv)$$0);
      this.b = $$0;
   }

   @Override
   public fis a() {
      return this.b;
   }

   @Override
   public jb b() {
      return this.a;
   }

   @Override
   public boolean a(cam $$0) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
