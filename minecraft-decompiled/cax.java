import javax.annotation.Nullable;

public class cax {
   private final dvz a;
   private jb b;
   private int c;
   private boolean d;

   public cax(dvz $$0, jb $$1) {
      this.a = $$0;
      this.b = $$1;
      this.d = true;
   }

   public boolean a(aub $$0, bzm $$1, boolean $$2) {
      if (!this.d) {
         this.f();
         return false;
      } else {
         this.d = false;
         return $$2 && this.c++ >= this.a.a($$0, $$1);
      }
   }

   @Nullable
   public fbl a(aub $$0, bzm $$1) {
      return this.a.a($$0, $$1, this.b);
   }

   public dvz.a a() {
      return this.a.b();
   }

   private void f() {
      this.c = Math.max(this.c - 4, 0);
   }

   public boolean b() {
      return this.c <= 0;
   }

   public jb c() {
      return this.b;
   }

   public void a(jb $$0) {
      this.b = $$0;
   }

   public int d() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public boolean a(dvz $$0) {
      return this.a == $$0;
   }
}
