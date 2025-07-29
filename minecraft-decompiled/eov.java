import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class eov extends enh<eqk> {
   public eov(Codec<eqk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eqk> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      eqk $$3 = $$0.f();
      bck $$4 = $$0.d();
      OptionalInt $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jb $$6 = $$2.h($$5.getAsInt());
         kg $$7 = new kg($$3.c, $$3.c, $$3.c);
         euq $$8 = euq.a($$6.b($$7), $$6.a($$7));
         return jb.a($$8).filter($$2x -> $$4.i() < $$3.d).filter($$1x -> this.b($$1, $$1x)).mapToInt($$1x -> {
            $$1.a($$1x, dqb.lp.m(), 2);
            return 1;
         }).sum() > 0;
      }
   }

   private static OptionalInt a(dnt $$0, jb $$1, eqk $$2) {
      Predicate<eeb> $$3 = $$0x -> $$0x.a(dqb.J);
      Predicate<eeb> $$4 = $$0x -> !$$0x.a(dqb.J);
      Optional<ejq> $$5 = ejq.a($$0, $$1, $$2.b, $$3, $$4);
      return $$5.<OptionalInt>map(ejq::c).orElseGet(OptionalInt::empty);
   }

   private boolean b(dnt $$0, jb $$1) {
      if (!this.a($$0, $$1) && !this.a($$0, $$1.e())) {
         for (jh $$2 : jh.c.a) {
            if (this.a($$0, $$1.a($$2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dmv $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return $$2.a(dqb.J) || $$2.l();
   }
}
