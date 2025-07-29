import com.mojang.serialization.Codec;

public class emr extends enh<ept> {
   public emr(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      bck $$3 = $$0.d();
      if ($$1.w($$2) && $$1.a_($$2.e()).a(dqb.fY)) {
         drf.a($$1, $$2, $$3, 8);
         return true;
      } else {
         return false;
      }
   }
}
