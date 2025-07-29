import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eoz extends eow {
   public eoz(Codec<eql> $$0) {
      super($$0);
   }

   @Override
   protected Set<jb> a(dnt $$0, eql $$1, bck $$2, jb $$3, Predicate<eeb> $$4, int $$5, int $$6) {
      Set<jb> $$7 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      Set<jb> $$8 = new HashSet<>();
      jb.a $$9 = new jb.a();

      for (jb $$10 : $$7) {
         if (!a($$0, $$7, $$10, $$9)) {
            $$8.add($$10);
         }
      }

      for (jb $$11 : $$8) {
         $$0.a($$11, dqb.J.m(), 2);
      }

      return $$8;
   }

   private static boolean a(dnt $$0, Set<jb> $$1, jb $$2, jb.a $$3) {
      return a($$0, $$2, $$3, jh.c) || a($$0, $$2, $$3, jh.f) || a($$0, $$2, $$3, jh.d) || a($$0, $$2, $$3, jh.e) || a($$0, $$2, $$3, jh.a);
   }

   private static boolean a(dnt $$0, jb $$1, jb.a $$2, jh $$3) {
      $$2.a($$1, $$3);
      return !$$0.a_($$2).c($$0, $$2, $$3.g());
   }

   @Override
   protected boolean a(dnt $$0, eql $$1, efz $$2, bck $$3, jb $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4.e())) {
         eeb $$5 = $$0.a_($$4);
         if ($$5.b(eer.I) && !$$5.c(eer.I)) {
            $$0.a($$4, $$5.b(eer.I, true), 2);
         }

         return true;
      } else {
         return false;
      }
   }
}
