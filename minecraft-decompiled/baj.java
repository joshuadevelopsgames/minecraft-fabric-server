import org.joml.Vector3f;

public class baj {
   public static int a(int $$0) {
      return $$0 >>> 24;
   }

   public static int b(int $$0) {
      return $$0 >> 16 & 0xFF;
   }

   public static int c(int $$0) {
      return $$0 >> 8 & 0xFF;
   }

   public static int d(int $$0) {
      return $$0 & 0xFF;
   }

   public static int a(int $$0, int $$1, int $$2, int $$3) {
      return $$0 << 24 | $$1 << 16 | $$2 << 8 | $$3;
   }

   public static int a(int $$0, int $$1, int $$2) {
      return a(255, $$0, $$1, $$2);
   }

   public static int a(fis $$0) {
      return a(b((float)$$0.a()), b((float)$$0.b()), b((float)$$0.c()));
   }

   public static int a(int $$0, int $$1) {
      if ($$0 == -1) {
         return $$1;
      } else {
         return $$1 == -1 ? $$0 : a(a($$0) * a($$1) / 255, b($$0) * b($$1) / 255, c($$0) * c($$1) / 255, d($$0) * d($$1) / 255);
      }
   }

   public static int a(int $$0, float $$1) {
      return a($$0, $$1, $$1, $$1);
   }

   public static int a(int $$0, float $$1, float $$2, float $$3) {
      return a(
         a($$0),
         Math.clamp((long)((int)(b($$0) * $$1)), 0, 255),
         Math.clamp((long)((int)(c($$0) * $$2)), 0, 255),
         Math.clamp((long)((int)(d($$0) * $$3)), 0, 255)
      );
   }

   public static int b(int $$0, int $$1) {
      return a(
         a($$0), Math.clamp((long)b($$0) * $$1 / 255L, 0, 255), Math.clamp((long)c($$0) * $$1 / 255L, 0, 255), Math.clamp((long)d($$0) * $$1 / 255L, 0, 255)
      );
   }

   public static int e(int $$0) {
      int $$1 = (int)(b($$0) * 0.3F + c($$0) * 0.59F + d($$0) * 0.11F);
      return a($$1, $$1, $$1);
   }

   public static int a(float $$0, int $$1, int $$2) {
      int $$3 = bcb.a($$0, a($$1), a($$2));
      int $$4 = bcb.a($$0, b($$1), b($$2));
      int $$5 = bcb.a($$0, c($$1), c($$2));
      int $$6 = bcb.a($$0, d($$1), d($$2));
      return a($$3, $$4, $$5, $$6);
   }

   public static int f(int $$0) {
      return $$0 | 0xFF000000;
   }

   public static int g(int $$0) {
      return $$0 & 16777215;
   }

   public static int c(int $$0, int $$1) {
      return $$0 << 24 | $$1 & 16777215;
   }

   public static int a(float $$0, int $$1) {
      return b($$0) << 24 | $$1 & 16777215;
   }

   public static int a(float $$0) {
      return b($$0) << 24 | 16777215;
   }

   public static int a(float $$0, float $$1, float $$2, float $$3) {
      return a(b($$0), b($$1), b($$2), b($$3));
   }

   public static Vector3f h(int $$0) {
      float $$1 = b($$0) / 255.0F;
      float $$2 = c($$0) / 255.0F;
      float $$3 = d($$0) / 255.0F;
      return new Vector3f($$1, $$2, $$3);
   }

   public static int d(int $$0, int $$1) {
      return a((a($$0) + a($$1)) / 2, (b($$0) + b($$1)) / 2, (c($$0) + c($$1)) / 2, (d($$0) + d($$1)) / 2);
   }

   public static int b(float $$0) {
      return bcb.d($$0 * 255.0F);
   }

   public static float i(int $$0) {
      return o(a($$0));
   }

   public static float j(int $$0) {
      return o(b($$0));
   }

   public static float k(int $$0) {
      return o(c($$0));
   }

   public static float l(int $$0) {
      return o(d($$0));
   }

   private static float o(int $$0) {
      return $$0 / 255.0F;
   }

   public static int m(int $$0) {
      return $$0 & -16711936 | ($$0 & 0xFF0000) >> 16 | ($$0 & 0xFF) << 16;
   }

   public static int n(int $$0) {
      return m($$0);
   }

   public static int b(int $$0, float $$1) {
      int $$2 = b($$0);
      int $$3 = c($$0);
      int $$4 = d($$0);
      int $$5 = a($$0);
      int $$6 = Math.max(Math.max($$2, $$3), $$4);
      int $$7 = Math.min(Math.min($$2, $$3), $$4);
      float $$8 = $$6 - $$7;
      float $$9;
      if ($$6 != 0) {
         $$9 = $$8 / $$6;
      } else {
         $$9 = 0.0F;
      }

      float $$11;
      if ($$9 == 0.0F) {
         $$11 = 0.0F;
      } else {
         float $$12 = ($$6 - $$2) / $$8;
         float $$13 = ($$6 - $$3) / $$8;
         float $$14 = ($$6 - $$4) / $$8;
         if ($$2 == $$6) {
            $$11 = $$14 - $$13;
         } else if ($$3 == $$6) {
            $$11 = 2.0F + $$12 - $$14;
         } else {
            $$11 = 4.0F + $$13 - $$12;
         }

         $$11 /= 6.0F;
         if ($$11 < 0.0F) {
            $$11++;
         }
      }

      if ($$9 == 0.0F) {
         $$2 = $$3 = $$4 = Math.round($$1 * 255.0F);
         return a($$5, $$2, $$3, $$4);
      } else {
         float $$18 = ($$11 - (float)Math.floor($$11)) * 6.0F;
         float $$19 = $$18 - (float)Math.floor($$18);
         float $$20 = $$1 * (1.0F - $$9);
         float $$21 = $$1 * (1.0F - $$9 * $$19);
         float $$22 = $$1 * (1.0F - $$9 * (1.0F - $$19));
         switch ((int)$$18) {
            case 0:
               $$2 = Math.round($$1 * 255.0F);
               $$3 = Math.round($$22 * 255.0F);
               $$4 = Math.round($$20 * 255.0F);
               break;
            case 1:
               $$2 = Math.round($$21 * 255.0F);
               $$3 = Math.round($$1 * 255.0F);
               $$4 = Math.round($$20 * 255.0F);
               break;
            case 2:
               $$2 = Math.round($$20 * 255.0F);
               $$3 = Math.round($$1 * 255.0F);
               $$4 = Math.round($$22 * 255.0F);
               break;
            case 3:
               $$2 = Math.round($$20 * 255.0F);
               $$3 = Math.round($$21 * 255.0F);
               $$4 = Math.round($$1 * 255.0F);
               break;
            case 4:
               $$2 = Math.round($$22 * 255.0F);
               $$3 = Math.round($$20 * 255.0F);
               $$4 = Math.round($$1 * 255.0F);
               break;
            case 5:
               $$2 = Math.round($$1 * 255.0F);
               $$3 = Math.round($$20 * 255.0F);
               $$4 = Math.round($$21 * 255.0F);
         }

         return a($$5, $$2, $$3, $$4);
      }
   }
}
