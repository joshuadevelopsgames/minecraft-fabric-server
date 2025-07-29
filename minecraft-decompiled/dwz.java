import com.mojang.serialization.MapCodec;

public class dwz extends dsl implements dwy {
   public static final MapCodec<dwz> b = b(dwz::new);

   @Override
   public MapCodec<dwz> a() {
      return b;
   }

   public dwz(eea.d $$0) {
      super(bwl.a(1), $$0);
   }

   @Override
   public int a(dxd.a $$0, dmv $$1, jb $$2, bck $$3, dxd $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jb $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, $$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jb $$10 = $$7.d();
               eeb $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), aza.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dxd $$0, jb $$1, jb $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = bcb.l((float)Math.sqrt($$1.j($$2)) - $$4);
      int $$6 = bcb.i(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / $$6);
      return Math.max(1, (int)($$3 * $$7 * 0.5F));
   }

   private eeb a(dmv $$0, jb $$1, bck $$2, boolean $$3) {
      eeb $$4;
      if ($$2.a(11) == 0) {
         $$4 = dqb.rE.m().b(dxc.d, $$3);
      } else {
         $$4 = dqb.rz.m();
      }

      return $$4.b(eer.I) && !$$0.b_($$1).c() ? $$4.b(eer.I, true) : $$4;
   }

   private static boolean a(dmv $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dqb.J) && $$2.y().b(fam.c)) {
         int $$3 = 0;

         for (jb $$4 : jb.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            eeb $$5 = $$0.a_($$4);
            if ($$5.a(dqb.rz) || $$5.a(dqb.rE)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
