import javax.annotation.Nullable;

public class ecr extends eaz implements dnp {
   private final dlu a = new dlu() {
      @Override
      public void a(dmu $$0, jb $$1, int $$2) {
         $$0.a($$1, dqb.cD, $$2, 0);
      }

      @Override
      public void a(@Nullable dmu $$0, jb $$1, dno $$2) {
         super.a($$0, $$1, $$2);
         if ($$0 != null) {
            eeb $$3 = $$0.a_($$1);
            $$0.a($$1, $$3, $$3, 260);
         }
      }
   };

   public ecr(jb $$0, eeb $$1) {
      super(ebb.j, $$0, $$1);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a.a(this.n, this.o, $$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.a.a($$0);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecr $$3) {
      $$3.a.a($$0, $$1);
   }

   public static void b(dmu $$0, jb $$1, eeb $$2, ecr $$3) {
      $$3.a.a((aub)$$0, $$1);
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      ui $$1 = this.d($$0);
      $$1.r("SpawnPotentials");
      return $$1;
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      return this.a.a(this.n, $$0) ? true : super.a_($$0, $$1);
   }

   @Override
   public void a(bzv<?> $$0, bck $$1) {
      this.a.a($$0, this.n, $$1, this.o);
      this.e();
   }

   public dlu c() {
      return this.a;
   }
}
