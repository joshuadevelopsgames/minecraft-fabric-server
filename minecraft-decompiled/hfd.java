import java.util.List;
import javax.annotation.Nullable;

public class hfd {
   public static final ame a = ame.b("textures/misc/enchanted_glint_armor.png");
   public static final ame b = ame.b("textures/misc/enchanted_glint_item.png");
   public static final float c = 0.5F;
   public static final float d = 0.75F;
   public static final float e = 0.0078125F;
   public static final int f = -1;
   private final hof g;
   private final hoh h = new hoh();

   public hfd(hof $$0) {
      this.g = $$0;
   }

   public static void a(dct $$0, fod $$1, gxn $$2, int $$3, int $$4, int[] $$5, List<gyv> $$6, gxz $$7, hoh.a $$8) {
      fog $$10;
      if ($$8 == hoh.a.c) {
         fod.a $$9 = $$1.c().d();
         if ($$0 == dct.g) {
            f.a($$9.a(), 0.5F);
         } else if ($$0.b()) {
            f.a($$9.a(), 0.75F);
         }

         $$10 = a($$2, $$7, $$9);
      } else {
         $$10 = a($$2, $$7, true, $$8 != hoh.a.a);
      }

      a($$1, $$10, $$6, $$5, $$3, $$4);
   }

   public static fog a(gxn $$0, gxz $$1, boolean $$2) {
      return $$2 ? foh.a($$0.getBuffer(gxz.j()), $$0.getBuffer($$1)) : $$0.getBuffer($$1);
   }

   private static fog a(gxn $$0, gxz $$1, fod.a $$2) {
      return foh.a(new foe($$0.getBuffer(a($$1) ? gxz.k() : gxz.l()), $$2, 0.0078125F), $$0.getBuffer($$1));
   }

   public static fog a(gxn $$0, gxz $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         return a($$1) ? foh.a($$0.getBuffer(gxz.k()), $$0.getBuffer($$1)) : foh.a($$0.getBuffer($$2 ? gxz.l() : gxz.m()), $$0.getBuffer($$1));
      } else {
         return $$0.getBuffer($$1);
      }
   }

   private static boolean a(gxz $$0) {
      return fue.P() && $$0 == gyi.j();
   }

   private static int a(int[] $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.length ? $$0[$$1] : -1;
   }

   private static void a(fod $$0, fog $$1, List<gyv> $$2, int[] $$3, int $$4, int $$5) {
      fod.a $$6 = $$0.c();

      for (gyv $$7 : $$2) {
         float $$9;
         float $$10;
         float $$11;
         float $$12;
         if ($$7.a()) {
            int $$8 = a($$3, $$7.c());
            $$9 = baj.a($$8) / 255.0F;
            $$10 = baj.b($$8) / 255.0F;
            $$11 = baj.c($$8) / 255.0F;
            $$12 = baj.d($$8) / 255.0F;
         } else {
            $$9 = 1.0F;
            $$10 = 1.0F;
            $$11 = 1.0F;
            $$12 = 1.0F;
         }

         $$1.a($$6, $$7, $$10, $$11, $$12, $$9, $$4, $$5);
      }
   }

   public void a(dcv $$0, dct $$1, int $$2, int $$3, fod $$4, gxn $$5, @Nullable dmu $$6, int $$7) {
      this.a(null, $$0, $$1, $$4, $$5, $$6, $$2, $$3, $$7);
   }

   public void a(@Nullable cam $$0, dcv $$1, dct $$2, fod $$3, gxn $$4, @Nullable dmu $$5, int $$6, int $$7, int $$8) {
      this.g.a(this.h, $$1, $$2, $$5, $$0, $$8);
      this.h.a($$3, $$4, $$6, $$7);
   }
}
