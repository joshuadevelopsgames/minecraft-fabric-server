import javax.annotation.Nullable;

public class hjg<S extends hlh, M extends gnh<S>> extends hit<S, M> {
   private final gnd a;
   private final gnd b;
   private final hie c;

   public hjg(hgc<S, M> $$0, gqj $$1, hie $$2) {
      super($$0);
      this.a = new gnd($$1.a(gqm.aP));
      this.b = new gnd($$1.a(gqm.aQ));
      this.c = $$2;
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      dcv $$6 = $$3.Z;
      dle $$7 = $$6.a(kq.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         ame $$8 = a($$3);
         gnd $$9 = $$3.am ? this.b : this.a;
         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         $$9.a($$3);
         this.c.a(htz.d.c, $$7.d().get(), $$9, $$6, $$0, $$1, $$2, $$8);
         $$0.b();
      }
   }

   @Nullable
   private static ame a(hlh $$0) {
      if ($$0 instanceof hmc $$1) {
         hst $$2 = $$1.a;
         if ($$2.d() != null) {
            return $$2.d();
         }

         if ($$2.c() != null && $$1.aB) {
            return $$2.c();
         }
      }

      return null;
   }
}
