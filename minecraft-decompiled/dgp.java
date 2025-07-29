public class dgp extends dgo {
   private final jh b;

   public dgp(dmu $$0, jb $$1, jh $$2, dcv $$3, jh $$4) {
      super($$0, null, bxi.a, $$3, new fio(fis.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public jb a() {
      return this.j().b();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().b()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public jh d() {
      return jh.a;
   }

   @Override
   public jh[] f() {
      switch (this.b) {
         case a:
         default:
            return new jh[]{jh.a, jh.c, jh.f, jh.d, jh.e, jh.b};
         case b:
            return new jh[]{jh.a, jh.b, jh.c, jh.f, jh.d, jh.e};
         case c:
            return new jh[]{jh.a, jh.c, jh.f, jh.e, jh.b, jh.d};
         case d:
            return new jh[]{jh.a, jh.d, jh.f, jh.e, jh.b, jh.c};
         case e:
            return new jh[]{jh.a, jh.e, jh.d, jh.b, jh.c, jh.f};
         case f:
            return new jh[]{jh.a, jh.f, jh.d, jh.b, jh.c, jh.e};
      }
   }

   @Override
   public jh g() {
      return this.b.o() == jh.a.b ? jh.c : this.b;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public float i() {
      return this.b.e() * 90;
   }
}
