import javax.annotation.Nullable;

public class fbe {
   private final dmc a;
   @Nullable
   private final fbd b;
   private final jb c;
   private final jb.a d = new jb.a();

   public fbe(dmc $$0, cao $$1) {
      this.a = $$0;
      if ($$1.ai() instanceof aub $$2) {
         this.b = $$2.J();
      } else {
         this.b = null;
      }

      this.c = $$1.dx();
   }

   public fbc a(int $$0, int $$1, int $$2) {
      jb $$3 = this.d.d($$0, $$1, $$2);
      return this.b == null ? fbh.b(this.a, $$3) : this.b.a(this.a, $$3);
   }

   public eeb a(jb $$0) {
      return this.a.a_($$0);
   }

   public dmc a() {
      return this.a;
   }

   public jb b() {
      return this.c;
   }
}
