public class fio extends fiq {
   private final jh b;
   private final jb c;
   private final boolean d;
   private final boolean e;
   private final boolean f;

   public static fio a(fis $$0, jh $$1, jb $$2) {
      return new fio(true, $$0, $$1, $$2, false, false);
   }

   public fio(fis $$0, jh $$1, jb $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3, false);
   }

   public fio(fis $$0, jh $$1, jb $$2, boolean $$3, boolean $$4) {
      this(false, $$0, $$1, $$2, $$3, $$4);
   }

   private fio(boolean $$0, fis $$1, jh $$2, jb $$3, boolean $$4, boolean $$5) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public fio a(jh $$0) {
      return new fio(this.d, this.a, $$0, this.c, this.e, this.f);
   }

   public fio a(jb $$0) {
      return new fio(this.d, this.a, this.b, $$0, this.e, this.f);
   }

   public fio a() {
      return new fio(this.d, this.a, this.b, this.c, this.e, true);
   }

   public jb b() {
      return this.c;
   }

   public jh c() {
      return this.b;
   }

   @Override
   public fiq.a d() {
      return this.d ? fiq.a.a : fiq.a.b;
   }

   public boolean e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }
}
