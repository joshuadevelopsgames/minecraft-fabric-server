import com.mojang.serialization.Codec;
import java.util.Optional;

public class eod extends enh<epv> {
   public eod(Codec<epv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epv> $$0) {
      dmv $$1 = $$0.b();
      jb $$2 = $$0.e();
      bck $$3 = $$0.d();
      epv $$4 = $$0.f();
      Optional<jh> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jb $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && enb.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         enb.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jh> a(dmv $$0, jb $$1, bck $$2) {
      boolean $$3 = enb.b($$0.a_($$1.d()));
      boolean $$4 = enb.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jh.a : jh.b);
      } else if ($$3) {
         return Optional.of(jh.a);
      } else {
         return $$4 ? Optional.of(jh.b) : Optional.empty();
      }
   }

   private static void a(dmv $$0, bck $$1, jb $$2, epv $$3) {
      enb.c($$0, $$2);

      for (jh $$4 : jh.c.a) {
         if (!($$1.i() > $$3.c)) {
            jb $$5 = $$2.a($$4);
            enb.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               jb $$6 = $$5.a(jh.b($$1));
               enb.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  jb $$7 = $$6.a(jh.b($$1));
                  enb.c($$0, $$7);
               }
            }
         }
      }
   }
}
