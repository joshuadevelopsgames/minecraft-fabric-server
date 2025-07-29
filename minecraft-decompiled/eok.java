import com.mojang.serialization.Codec;

public class eok extends enh<epu> {
   private static final int a = 7;

   eok(Codec<epu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epu> $$0) {
      dnt $$1 = $$0.b();
      bck $$2 = $$0.d();
      epu $$3 = $$0.f();
      jb $$4 = $$0.e();
      int $$5 = $$2.a($$3.c + 1);
      jb.a $$6 = new jb.a();

      for (int $$7 = 0; $$7 < $$5; $$7++) {
         this.a($$6, $$2, $$4, Math.min($$7, 7));
         eeb $$8 = $$1.a_($$6);

         for (epu.a $$9 : $$3.b) {
            if (eoc.a($$8, $$1::a_, $$2, $$3, $$9, $$6)) {
               $$1.a($$6, $$9.c, 2);
               break;
            }
         }
      }

      return true;
   }

   private void a(jb.a $$0, bck $$1, jb $$2, int $$3) {
      int $$4 = this.a($$1, $$3);
      int $$5 = this.a($$1, $$3);
      int $$6 = this.a($$1, $$3);
      $$0.a($$2, $$4, $$5, $$6);
   }

   private int a(bck $$0, int $$1) {
      return Math.round(($$0.i() - $$0.i()) * $$1);
   }
}
