import com.google.common.annotations.VisibleForTesting;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class gzd {
   public static final int a = 8;
   public static final int b = 4;
   private static final int d = 3;
   public static final int c = 4;
   private static final Vector3fc e = new Vector3f(1.0F, 1.0F, 1.0F);
   private static final Vector3fc f = new Vector3f(0.5F, 0.5F, 0.5F);

   @VisibleForTesting
   static gyx.b a(Vector3fc $$0, Vector3fc $$1, jh $$2) {
      return switch ($$2) {
         case a -> new gyx.b($$0.x(), 16.0F - $$1.z(), $$1.x(), 16.0F - $$0.z());
         case b -> new gyx.b($$0.x(), $$0.z(), $$1.x(), $$1.z());
         case c -> new gyx.b(16.0F - $$1.x(), 16.0F - $$1.y(), 16.0F - $$0.x(), 16.0F - $$0.y());
         case d -> new gyx.b($$0.x(), 16.0F - $$1.y(), $$1.x(), 16.0F - $$0.y());
         case e -> new gyx.b($$0.z(), 16.0F - $$1.y(), $$1.z(), 16.0F - $$0.y());
         case f -> new gyx.b(16.0F - $$1.z(), 16.0F - $$1.y(), 16.0F - $$0.z(), 16.0F - $$0.y());
      };
   }

   public static gyv a(Vector3fc $$0, Vector3fc $$1, gyx $$2, hrs $$3, jh $$4, hui $$5, @Nullable gyy $$6, boolean $$7, int $$8) {
      gyx.b $$9 = $$2.d();
      if ($$9 == null) {
         $$9 = a($$0, $$1, $$4);
      }

      $$9 = a($$3, $$9);
      Matrix4fc $$10 = $$5.b($$4);
      int[] $$11 = a($$9, $$2.e(), $$10, $$3, $$4, a($$0, $$1), $$5.a(), $$6);
      jh $$12 = a($$11);
      if ($$6 == null) {
         a($$11, $$12);
      }

      return new gyv($$11, $$2.b(), $$12, $$3, $$7, $$8);
   }

   private static gyx.b a(hrs $$0, gyx.b $$1) {
      float $$2 = $$1.a();
      float $$3 = $$1.b();
      float $$4 = $$1.c();
      float $$5 = $$1.d();
      float $$6 = $$0.k();
      float $$7 = ($$2 + $$2 + $$4 + $$4) / 4.0F;
      float $$8 = ($$3 + $$3 + $$5 + $$5) / 4.0F;
      return new gyx.b(bcb.h($$6, $$2, $$7), bcb.h($$6, $$3, $$8), bcb.h($$6, $$4, $$7), bcb.h($$6, $$5, $$8));
   }

   private static int[] a(gyx.b $$0, i $$1, Matrix4fc $$2, hrs $$3, jh $$4, float[] $$5, k $$6, @Nullable gyy $$7) {
      gxa $$8 = gxa.a($$4);
      int[] $$9 = new int[32];

      for (int $$10 = 0; $$10 < 4; $$10++) {
         a($$9, $$10, $$8, $$0, $$1, $$2, $$5, $$3, $$6, $$7);
      }

      return $$9;
   }

   private static float[] a(Vector3fc $$0, Vector3fc $$1) {
      float[] $$2 = new float[jh.values().length];
      $$2[gxa.a.f] = $$0.x() / 16.0F;
      $$2[gxa.a.e] = $$0.y() / 16.0F;
      $$2[gxa.a.d] = $$0.z() / 16.0F;
      $$2[gxa.a.c] = $$1.x() / 16.0F;
      $$2[gxa.a.b] = $$1.y() / 16.0F;
      $$2[gxa.a.a] = $$1.z() / 16.0F;
      return $$2;
   }

   private static void a(int[] $$0, int $$1, gxa $$2, gyx.b $$3, i $$4, Matrix4fc $$5, float[] $$6, hrs $$7, k $$8, @Nullable gyy $$9) {
      gxa.b $$10 = $$2.a($$1);
      Vector3f $$11 = new Vector3f($$6[$$10.a], $$6[$$10.b], $$6[$$10.c]);
      a($$11, $$9);
      a($$11, $$8);
      float $$12 = gyx.a($$3, $$4, $$1);
      float $$13 = gyx.b($$3, $$4, $$1);
      float $$15;
      float $$14;
      if (f.a($$5)) {
         $$14 = $$12;
         $$15 = $$13;
      } else {
         Vector3f $$16 = $$5.transformPosition(new Vector3f(a($$12), a($$13), 0.0F));
         $$14 = b($$16.x);
         $$15 = b($$16.y);
      }

      a($$0, $$1, $$11, $$7, $$14, $$15);
   }

   private static float a(float $$0) {
      return $$0 - 0.5F;
   }

   private static float b(float $$0) {
      return $$0 + 0.5F;
   }

   private static void a(int[] $$0, int $$1, Vector3f $$2, hrs $$3, float $$4, float $$5) {
      int $$6 = $$1 * 8;
      $$0[$$6] = Float.floatToRawIntBits($$2.x());
      $$0[$$6 + 1] = Float.floatToRawIntBits($$2.y());
      $$0[$$6 + 2] = Float.floatToRawIntBits($$2.z());
      $$0[$$6 + 3] = -1;
      $$0[$$6 + 4] = Float.floatToRawIntBits($$3.a($$4));
      $$0[$$6 + 4 + 1] = Float.floatToRawIntBits($$3.c($$5));
   }

   private static void a(Vector3f $$0, @Nullable gyy $$1) {
      if ($$1 != null) {
         Vector3fc $$2 = $$1.b().e().s();
         Matrix4fc $$3 = new Matrix4f().rotation($$1.c() * (float) (Math.PI / 180.0), $$2);
         Vector3fc $$4 = $$1.d() ? a($$1) : e;
         a($$0, $$1.a(), $$3, $$4);
      }
   }

   private static Vector3fc a(gyy $$0) {
      if ($$0.c() == 0.0F) {
         return e;
      } else {
         float $$1 = Math.abs($$0.c());
         float $$2 = 1.0F / bcb.b($$1 * (float) (Math.PI / 180.0));

         return switch ($$0.b()) {
            case a -> new Vector3f(1.0F, $$2, $$2);
            case b -> new Vector3f($$2, 1.0F, $$2);
            case c -> new Vector3f($$2, $$2, 1.0F);
         };
      }
   }

   private static void a(Vector3f $$0, k $$1) {
      if ($$1 != k.a()) {
         a($$0, f, $$1.c(), e);
      }
   }

   private static void a(Vector3f $$0, Vector3fc $$1, Matrix4fc $$2, Vector3fc $$3) {
      $$0.sub($$1);
      $$2.transformPosition($$0);
      $$0.mul($$3);
      $$0.add($$1);
   }

   private static jh a(int[] $$0) {
      Vector3f $$1 = d($$0, 0);
      Vector3f $$2 = d($$0, 8);
      Vector3f $$3 = d($$0, 16);
      Vector3f $$4 = new Vector3f($$1).sub($$2);
      Vector3f $$5 = new Vector3f($$3).sub($$2);
      Vector3f $$6 = new Vector3f($$5).cross($$4).normalize();
      if (!$$6.isFinite()) {
         return jh.b;
      } else {
         jh $$7 = null;
         float $$8 = 0.0F;

         for (jh $$9 : jh.values()) {
            float $$10 = $$6.dot($$9.s());
            if ($$10 >= 0.0F && $$10 > $$8) {
               $$8 = $$10;
               $$7 = $$9;
            }
         }

         return $$7 == null ? jh.b : $$7;
      }
   }

   private static float a(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1]);
   }

   private static float b(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1 + 1]);
   }

   private static float c(int[] $$0, int $$1) {
      return Float.intBitsToFloat($$0[$$1 + 2]);
   }

   private static Vector3f d(int[] $$0, int $$1) {
      return new Vector3f(a($$0, $$1), b($$0, $$1), c($$0, $$1));
   }

   private static void a(int[] $$0, jh $$1) {
      int[] $$2 = new int[$$0.length];
      System.arraycopy($$0, 0, $$2, 0, $$0.length);
      float[] $$3 = new float[jh.values().length];
      $$3[gxa.a.f] = 999.0F;
      $$3[gxa.a.e] = 999.0F;
      $$3[gxa.a.d] = 999.0F;
      $$3[gxa.a.c] = -999.0F;
      $$3[gxa.a.b] = -999.0F;
      $$3[gxa.a.a] = -999.0F;

      for (int $$4 = 0; $$4 < 4; $$4++) {
         int $$5 = 8 * $$4;
         float $$6 = a($$2, $$5);
         float $$7 = b($$2, $$5);
         float $$8 = c($$2, $$5);
         if ($$6 < $$3[gxa.a.f]) {
            $$3[gxa.a.f] = $$6;
         }

         if ($$7 < $$3[gxa.a.e]) {
            $$3[gxa.a.e] = $$7;
         }

         if ($$8 < $$3[gxa.a.d]) {
            $$3[gxa.a.d] = $$8;
         }

         if ($$6 > $$3[gxa.a.c]) {
            $$3[gxa.a.c] = $$6;
         }

         if ($$7 > $$3[gxa.a.b]) {
            $$3[gxa.a.b] = $$7;
         }

         if ($$8 > $$3[gxa.a.a]) {
            $$3[gxa.a.a] = $$8;
         }
      }

      gxa $$9 = gxa.a($$1);

      for (int $$10 = 0; $$10 < 4; $$10++) {
         int $$11 = 8 * $$10;
         gxa.b $$12 = $$9.a($$10);
         float $$13 = $$3[$$12.a];
         float $$14 = $$3[$$12.b];
         float $$15 = $$3[$$12.c];
         $$0[$$11] = Float.floatToRawIntBits($$13);
         $$0[$$11 + 1] = Float.floatToRawIntBits($$14);
         $$0[$$11 + 2] = Float.floatToRawIntBits($$15);

         for (int $$16 = 0; $$16 < 4; $$16++) {
            int $$17 = 8 * $$16;
            float $$18 = a($$2, $$17);
            float $$19 = b($$2, $$17);
            float $$20 = c($$2, $$17);
            if (bcb.a($$13, $$18) && bcb.a($$14, $$19) && bcb.a($$15, $$20)) {
               $$0[$$11 + 4] = $$2[$$17 + 4];
               $$0[$$11 + 4 + 1] = $$2[$$17 + 4 + 1];
            }
         }
      }
   }

   public static void a(int[] $$0, Consumer<Vector3f> $$1) {
      for (int $$2 = 0; $$2 < 4; $$2++) {
         $$1.accept(d($$0, 8 * $$2));
      }
   }
}
