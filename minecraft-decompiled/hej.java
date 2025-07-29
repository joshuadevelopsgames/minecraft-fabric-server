import java.util.List;

public class hej extends hed<cqy, hks> {
   private final gys a;

   public hej(hee.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cqy $$0, hbq $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.i() != $$0.ai().a_($$0.dx());
   }

   public void a(hks $$0, fod $$1, gxn $$2, int $$3) {
      eeb $$4 = $$0.c;
      if ($$4.o() == dwn.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         List<gzb> $$5 = this.a.a($$4).a(bck.a($$4.b($$0.a)));
         this.a.b().a($$0, $$5, $$4, $$0.b, $$1, $$2.getBuffer(gxe.b($$4)), false, hri.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hks a() {
      return new hks();
   }

   public void a(cqy $$0, hks $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jb $$3 = jb.a($$0.dC(), $$0.cV().e, $$0.dI());
      $$1.a = $$0.e();
      $$1.b = $$3;
      $$1.c = $$0.i();
      $$1.d = $$0.ai().v($$3);
      $$1.e = $$0.ai();
   }
}
