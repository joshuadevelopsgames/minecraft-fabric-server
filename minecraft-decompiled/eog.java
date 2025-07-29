import com.mojang.serialization.Codec;

public class eog extends enh<epy> {
   public eog(Codec<epy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epy> $$0) {
      epy $$1 = $$0.f();
      bck $$2 = $$0.d();
      dnt $$3 = $$0.b();
      efz $$4 = $$0.c();
      jb $$5 = $$0.e();

      for (epb $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
