public class ecz extends eaz implements dnp, edc.c {
   private final edc a = this.j();

   public ecz(jb $$0, eeb $$1) {
      super(ebb.R, $$0, $$1);
   }

   private edc j() {
      edb $$0 = edb.a;
      edb.a $$1 = edb.a.a;
      return new edc(edc.b.b, this, $$0, $$1);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a.a($$0);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.a.a($$0);
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.a.h().a(this.m().c(dzd.b));
   }

   @Override
   public void a(bzv<?> $$0, bck $$1) {
      if (this.n == null) {
         ag.b("Expected non-null level");
      } else {
         this.a.a($$0, this.n);
         this.e();
      }
   }

   public edc c() {
      return this.a;
   }

   @Override
   public edf d() {
      return !this.m().b(eer.bC) ? edf.a : this.m().c(eer.bC);
   }

   @Override
   public void a(dmu $$0, edf $$1) {
      this.e();
      $$0.c(this.o, this.m().b(eer.bC, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
