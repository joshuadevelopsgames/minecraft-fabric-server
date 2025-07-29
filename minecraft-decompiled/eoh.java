import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eoh extends enh<eqb> {
   public eoh(Codec<eqb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<eqb> $$0) {
      eqb $$1 = $$0.f();
      dnt $$2 = $$0.b();
      bck $$3 = $$0.d();
      dpz $$4 = $$1.b.b();
      jb $$5 = a($$2, $$0.e().k().a(jh.a.b, $$2.L_() + 1, $$2.ao()), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (jb $$11 : jb.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            eeb $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static jb a(dmv $$0, jb.a $$1, dpz $$2) {
      while ($$1.v() > $$0.L_() + 1) {
         eeb $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(jh.a);
      }

      return null;
   }
}
