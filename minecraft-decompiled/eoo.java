import com.mojang.serialization.Codec;

public class eoo extends enh<eqe> {
   public eoo(Codec<eqe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eqe> $$0) {
      eqe $$1 = $$0.f();
      dnt $$2 = $$0.b();
      jb $$3 = $$0.e();
      eeb $$4 = $$1.a().a($$0.d(), $$3);
      if ($$4.a($$2, $$3)) {
         if ($$4.b() instanceof dsi) {
            if (!$$2.w($$3.d())) {
               return false;
            }

            dsi.a($$2, $$4, $$3, 2);
         } else if ($$4.b() instanceof dve) {
            dve.a($$2, $$3, $$2.H_(), 2);
         } else {
            $$2.a($$3, $$4, 2);
         }

         if ($$1.b()) {
            $$2.a($$3, $$2.a_($$3).b(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
