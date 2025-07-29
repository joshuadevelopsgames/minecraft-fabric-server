import java.util.List;

public class hap implements hac<edw> {
   private final gys a;

   public hap(had.a $$0) {
      this.a = $$0.b();
   }

   public void a(edw $$0, float $$1, fod $$2, gxn $$3, int $$4, int $$5, fis $$6) {
      dmu $$7 = $$0.i();
      if ($$7 != null) {
         jb $$8 = $$0.aA_().a($$0.f().g());
         eeb $$9 = $$0.j();
         if (!$$9.l()) {
            gyu.a();
            $$2.a();
            $$2.a($$0.b($$1), $$0.c($$1), $$0.d($$1));
            if ($$9.a(dqb.bJ) && $$0.a($$1) <= 4.0F) {
               $$9 = $$9.b(edu.d, $$0.a($$1) <= 0.5F);
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            } else if ($$0.d() && !$$0.a()) {
               efd $$10 = $$9.a(dqb.by) ? efd.b : efd.a;
               eeb $$11 = dqb.bJ.m().b(edu.c, $$10).b(edu.a, $$9.c(edt.a));
               $$11 = $$11.b(edu.d, $$0.a($$1) >= 0.5F);
               this.a($$8, $$11, $$2, $$3, $$7, false, $$5);
               jb $$12 = $$8.a($$0.f());
               $$2.b();
               $$2.a();
               $$9 = $$9.b(edt.c, true);
               this.a($$12, $$9, $$2, $$3, $$7, true, $$5);
            } else {
               this.a($$8, $$9, $$2, $$3, $$7, false, $$5);
            }

            $$2.b();
            gyu.b();
         }
      }
   }

   private void a(jb $$0, eeb $$1, fod $$2, gxn $$3, dmu $$4, boolean $$5, int $$6) {
      gxz $$7 = gxe.b($$1);
      fog $$8 = $$3.getBuffer($$7);
      List<gzb> $$9 = this.a.a($$1).a(bck.a($$1.b($$0)));
      this.a.b().a($$4, $$9, $$1, $$0, $$2, $$8, $$5, $$6);
   }

   @Override
   public int aZ_() {
      return 68;
   }
}
