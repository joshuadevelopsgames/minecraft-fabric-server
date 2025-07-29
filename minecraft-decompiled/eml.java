import com.mojang.serialization.Codec;

public class eml extends enh<ept> {
   public eml(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      jb $$1 = $$0.e();
      dnt $$2 = $$0.b();
      bck $$3 = $$0.d();
      if ($$2.w($$1) && !$$2.w($$1.d())) {
         jb.a $$4 = $$1.k();
         jb.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.w($$4)) {
            if ($$2.u($$4)) {
               return true;
            }

            $$2.a($$4, dqb.ep.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jh.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jh.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jh.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jh.f));
            $$4.c(jh.a);
         }

         $$4.c(jh.b);
         this.a($$2, $$3, $$5.a($$4, jh.c));
         this.a($$2, $$3, $$5.a($$4, jh.d));
         this.a($$2, $$3, $$5.a($$4, jh.e));
         this.a($$2, $$3, $$5.a($$4, jh.f));
         $$4.c(jh.a);
         jb.a $$10 = new jb.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = bcb.a($$11) * bcb.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.w($$5.a($$10, jh.a))) {
                     $$10.c(jh.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.w($$5.a($$10, jh.a))) {
                     $$2.a($$10, dqb.ep.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dmv $$0, bck $$1, jb $$2) {
      if ($$1.h()) {
         $$0.a($$2, dqb.ep.m(), 2);
      }
   }

   private boolean b(dmv $$0, bck $$1, jb $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dqb.ep.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
