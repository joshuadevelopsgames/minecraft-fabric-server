import java.util.Optional;
import java.util.function.Consumer;

public class dcj extends dcr {
   private static final xo a = xo.c("painting.random").a(o.h);
   private final bzv<? extends cqr> b;

   public dcj(bzv<? extends cqr> $$0, dcr.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bxj a(dgq $$0) {
      jb $$1 = $$0.a();
      jh $$2 = $$0.k();
      jb $$3 = $$1.a($$2);
      cut $$4 = $$0.o();
      dcv $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bxj.d;
      } else {
         dmu $$6 = $$0.q();
         cqr $$8;
         if (this.b == bzv.aM) {
            Optional<cqu> $$7 = cqu.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bxj.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bzv.au) {
            $$8 = new cqs($$6, $$3, $$2);
         } else {
            if (this.b != bzv.ah) {
               return bxj.a;
            }

            $$8 = new cqq($$6, $$3, $$2);
         }

         bzv.<cqr>a($$6, $$5, $$4).accept($$8);
         if ($$8.f()) {
            if (!$$6.C) {
               $$8.u();
               $$6.a($$4, ejb.t, $$8.dv());
               $$6.b($$8);
            }

            $$5.h(1);
            return bxj.a;
         } else {
            return bxj.c;
         }
      }
   }

   protected boolean a(cut $$0, jh $$1, dcv $$2, jb $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(dcv $$0, dcr.b $$1, dfz $$2, Consumer<xo> $$3, dek $$4) {
      if (this.b == bzv.aM && $$2.a(kq.aM)) {
         jl<cqv> $$5 = $$0.a(kq.aM);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(xo.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
