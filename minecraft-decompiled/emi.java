import com.mojang.serialization.Codec;

public abstract class emi extends enh<epo> {
   public emi(Codec<epo> $$0) {
      super($$0);
   }

   protected void a(dmv $$0, bck $$1, jb $$2, epo $$3, int $$4, jb.a $$5) {
      for (int $$6 = 0; $$6 < $$4; $$6++) {
         $$5.g($$2).c(jh.b, $$6);
         this.a($$0, $$5, $$3.c.a($$1, $$2));
      }
   }

   protected void a(dmv $$0, jb.a $$1, eeb $$2) {
      eeb $$3 = $$0.a_($$1);
      if ($$3.l() || $$3.a(azo.cv)) {
         this.a($$0, $$1, $$2);
      }
   }

   protected int a(bck $$0) {
      int $$1 = $$0.a(3) + 4;
      if ($$0.a(12) == 0) {
         $$1 *= 2;
      }

      return $$1;
   }

   protected boolean a(dmv $$0, jb $$1, int $$2, jb.a $$3, epo $$4) {
      int $$5 = $$1.v();
      if ($$5 >= $$0.L_() + 1 && $$5 + $$2 + 1 <= $$0.ao()) {
         eeb $$6 = $$0.a_($$1.e());
         if (!b($$6) && !$$6.a(azo.bd)) {
            return false;
         } else {
            for (int $$7 = 0; $$7 <= $$2; $$7++) {
               int $$8 = this.a(-1, -1, $$4.d, $$7);

               for (int $$9 = -$$8; $$9 <= $$8; $$9++) {
                  for (int $$10 = -$$8; $$10 <= $$8; $$10++) {
                     eeb $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                     if (!$$11.l() && !$$11.a(azo.L)) {
                        return false;
                     }
                  }
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean a(enj<epo> $$0) {
      dnt $$1 = $$0.b();
      jb $$2 = $$0.e();
      bck $$3 = $$0.d();
      epo $$4 = $$0.f();
      int $$5 = this.a($$3);
      jb.a $$6 = new jb.a();
      if (!this.a($$1, $$2, $$5, $$6, $$4)) {
         return false;
      } else {
         this.a($$1, $$3, $$2, $$5, $$6, $$4);
         this.a($$1, $$3, $$2, $$4, $$5, $$6);
         return true;
      }
   }

   protected abstract int a(int var1, int var2, int var3, int var4);

   protected abstract void a(dmv var1, bck var2, jb var3, int var4, jb.a var5, epo var6);
}
