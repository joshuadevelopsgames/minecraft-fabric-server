import com.mojang.serialization.Codec;

public class eoi extends enh<eqa> {
   public eoi(Codec<eqa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eqa> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      eqa $$3 = $$0.f();

      for (epu.a $$4 : $$3.b) {
         if ($$4.b.a($$1.a_($$2), $$0.d())) {
            $$1.a($$2, $$4.c, 2);
            break;
         }
      }

      return true;
   }
}
