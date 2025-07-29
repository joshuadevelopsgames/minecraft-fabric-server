import com.mojang.serialization.Codec;

public class eox extends enh<ept> {
   public eox(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      $$0.f();
      if (!$$1.w($$2)) {
         return false;
      } else {
         for (jh $$3 : jh.values()) {
            if ($$3 != jh.a && dzm.a($$1, $$2.a($$3), $$3)) {
               $$1.a($$2, dqb.fx.m().b(dzm.a($$3), true), 2);
               return true;
            }
         }

         return false;
      }
   }
}
