import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fwz {
   private static final float e = 0.01F;
   private static final float f = 0.01F;
   private static final float g = -0.01F;
   public static final float a = 0.03F;
   public static final int b = 0;
   public final int c = 9;
   public final bck d = bck.a();
   private final Function<ame, gao> h;
   final boolean i;
   private final fuo j;

   public fwz(Function<ame, gao> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = new fuo(($$0x, $$1x) -> this.a($$1x.l()).a($$0x, this.i).a($$1x.c()));
   }

   gao a(ame $$0) {
      return this.h.apply($$0);
   }

   public String a(String $$0) {
      try {
         Bidi $$1 = new Bidi(new ArabicShaping(8).shape($$0), 127);
         $$1.setReorderingMode(0);
         return $$1.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return $$0;
      }
   }

   public void a(String $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gxn $$6, fwz.a $$7, int $$8, int $$9) {
      fwz.c $$10 = this.a($$0, $$1, $$2, $$3, $$4, $$8);
      $$10.a(fwz.b.a($$6, $$5, $$7, $$9));
   }

   public void a(xo $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gxn $$6, fwz.a $$7, int $$8, int $$9) {
      fwz.c $$10 = this.a($$0.g(), $$1, $$2, $$3, $$4, $$8);
      $$10.a(fwz.b.a($$6, $$5, $$7, $$9));
   }

   public void a(bbm $$0, float $$1, float $$2, int $$3, boolean $$4, Matrix4f $$5, gxn $$6, fwz.a $$7, int $$8, int $$9) {
      fwz.c $$10 = this.a($$0, $$1, $$2, $$3, $$4, $$8);
      $$10.a(fwz.b.a($$6, $$5, $$7, $$9));
   }

   public void a(bbm $$0, float $$1, float $$2, int $$3, int $$4, Matrix4f $$5, gxn $$6, int $$7) {
      fwz.d $$8 = new fwz.d(0.0F, 0.0F, $$4, false);

      for (int $$9 = -1; $$9 <= 1; $$9++) {
         for (int $$10 = -1; $$10 <= 1; $$10++) {
            if ($$9 != 0 || $$10 != 0) {
               float[] $$11 = new float[]{$$1};
               int $$12 = $$9;
               int $$13 = $$10;
               $$0.accept(($$6x, $$7x, $$8x) -> {
                  boolean $$9x = $$7x.c();
                  gao $$10x = this.a($$7x.l());
                  flp $$11x = $$10x.a($$8x, this.i);
                  $$8.e = $$11[0] + $$12 * $$11x.b();
                  $$8.f = $$2 + $$13 * $$11x.b();
                  $$11[0] += $$11x.a($$9x);
                  return $$8.accept($$6x, $$7x.a($$4), $$8x);
               });
            }
         }
      }

      fwz.b $$14 = fwz.b.a($$6, $$5, fwz.a.a, $$7);

      for (gas.b $$15 : $$8.o) {
         $$14.a($$15);
      }

      fwz.d $$16 = new fwz.d($$1, $$2, $$3, false);
      $$0.accept($$16);
      $$16.a(fwz.b.a($$6, $$5, fwz.a.c, $$7));
   }

   public fwz.c a(String $$0, float $$1, float $$2, int $$3, boolean $$4, int $$5) {
      if (this.a()) {
         $$0 = this.a($$0);
      }

      fwz.d $$6 = new fwz.d($$1, $$2, $$3, $$5, $$4);
      bcz.c($$0, yl.a, $$6);
      return $$6;
   }

   public fwz.c a(bbm $$0, float $$1, float $$2, int $$3, boolean $$4, int $$5) {
      fwz.d $$6 = new fwz.d($$1, $$2, $$3, $$5, $$4);
      $$0.accept($$6);
      return $$6;
   }

   public int b(String $$0) {
      return bcb.f(this.j.a($$0));
   }

   public int a(xt $$0) {
      return bcb.f(this.j.a($$0));
   }

   public int a(bbm $$0) {
      return bcb.f(this.j.a($$0));
   }

   public String a(String $$0, int $$1, boolean $$2) {
      return $$2 ? this.j.c($$0, $$1, yl.a) : this.j.b($$0, $$1, yl.a);
   }

   public String a(String $$0, int $$1) {
      return this.j.b($$0, $$1, yl.a);
   }

   public xt a(xt $$0, int $$1) {
      return this.j.a($$0, $$1, yl.a);
   }

   public int b(String $$0, int $$1) {
      return 9 * this.j.g($$0, $$1, yl.a).size();
   }

   public int b(xt $$0, int $$1) {
      return 9 * this.j.b($$0, $$1, yl.a).size();
   }

   public List<bbm> c(xt $$0, int $$1) {
      return ud.a().a(this.j.b($$0, $$1, yl.a));
   }

   public List<xt> d(xt $$0, int $$1) {
      return this.j.b($$0, $$1, yl.a);
   }

   public boolean a() {
      return ud.a().b();
   }

   public fuo b() {
      return this.j;
   }

   public static enum a {
      a,
      b,
      c;
   }

   public interface b {
      static fwz.b a(final gxn $$0, final Matrix4f $$1, final fwz.a $$2, final int $$3) {
         return new fwz.b() {
            @Override
            public void a(gas.b $$0x) {
               gas $$1x = $$0.i();
               fog $$2x = $$0.getBuffer($$1x.a($$2));
               $$1x.a($$0, $$1, $$2x, $$3, false);
            }

            @Override
            public void a(gas $$0x, gas.a $$1x) {
               fog $$2x = $$0.getBuffer($$0.a($$2));
               $$0.a($$1, $$1, $$2x, $$3, false);
            }
         };
      }

      void a(gas.b var1);

      void a(gas var1, gas.a var2);
   }

   public interface c {
      void a(fwz.b var1);

      @Nullable
      gcd a();
   }

   class d implements bbn, fwz.c {
      private final boolean b;
      private final int c;
      private final int d;
      float e;
      float f;
      private float g = Float.MAX_VALUE;
      private float h = Float.MAX_VALUE;
      private float i = -Float.MAX_VALUE;
      private float j = -Float.MAX_VALUE;
      private float k = Float.MAX_VALUE;
      private float l = Float.MAX_VALUE;
      private float m = -Float.MAX_VALUE;
      private float n = -Float.MAX_VALUE;
      final List<gas.b> o = new ArrayList<>();
      @Nullable
      private List<gas.a> p;

      public d(final float $$0, final float $$1, final int $$2, final boolean $$3) {
         this($$0, $$1, $$2, 0, $$3);
      }

      public d(final float $$0, final float $$1, final int $$2, final int $$3, final boolean $$4) {
         this.e = $$0;
         this.f = $$1;
         this.b = $$4;
         this.c = $$2;
         this.d = $$3;
         this.a($$0, $$1, 0.0F);
      }

      private void a(float $$0, float $$1, float $$2, float $$3) {
         this.g = Math.min(this.g, $$0);
         this.h = Math.min(this.h, $$1);
         this.i = Math.max(this.i, $$2);
         this.j = Math.max(this.j, $$3);
      }

      private void a(float $$0, float $$1, float $$2) {
         if (baj.a(this.d) != 0) {
            this.k = Math.min(this.k, $$0 - 1.0F);
            this.l = Math.min(this.l, $$1 - 1.0F);
            this.m = Math.max(this.m, $$0 + $$2);
            this.n = Math.max(this.n, $$1 + 9.0F);
            this.a(this.k, this.l, this.m, this.n);
         }
      }

      private void a(gas.b $$0) {
         this.o.add($$0);
         this.a($$0.a(), $$0.b(), $$0.c(), $$0.d());
      }

      private void a(gas.a $$0) {
         if (this.p == null) {
            this.p = new ArrayList<>();
         }

         this.p.add($$0);
         this.a($$0.a(), $$0.b(), $$0.c(), $$0.d());
      }

      @Override
      public boolean accept(int $$0, yl $$1, int $$2) {
         gao $$3 = fwz.this.a($$1.l());
         flp $$4 = $$3.a($$2, fwz.this.i);
         gas $$5 = $$1.g() && $$2 != 32 ? $$3.a($$4) : $$3.a($$2);
         boolean $$6 = $$1.c();
         yn $$7 = $$1.a();
         int $$8 = this.a($$7);
         int $$9 = this.a($$1, $$8);
         float $$10 = $$4.a($$6);
         float $$11 = $$0 == 0 ? this.e - 1.0F : this.e;
         float $$12 = $$4.b();
         if (!($$5 instanceof gat)) {
            float $$13 = $$6 ? $$4.a() : 0.0F;
            this.a(new gas.b(this.e, this.f, $$8, $$9, $$5, $$1, $$13, $$12));
         }

         this.a(this.e, this.f, $$10);
         if ($$1.e()) {
            this.a(new gas.a($$11, this.f + 4.5F - 1.0F, this.e + $$10, this.f + 4.5F, 0.01F, $$8, $$9, $$12));
         }

         if ($$1.f()) {
            this.a(new gas.a($$11, this.f + 9.0F - 1.0F, this.e + $$10, this.f + 9.0F, 0.01F, $$8, $$9, $$12));
         }

         this.e += $$10;
         return true;
      }

      @Override
      public void a(fwz.b $$0) {
         gas $$1 = null;
         if (baj.a(this.d) != 0) {
            gas.a $$2 = new gas.a(this.k, this.l, this.m, this.n, -0.01F, this.d);
            $$1 = fwz.this.a(yl.b).b();
            $$0.a($$1, $$2);
         }

         for (gas.b $$3 : this.o) {
            $$0.a($$3);
         }

         if (this.p != null) {
            if ($$1 == null) {
               $$1 = fwz.this.a(yl.b).b();
            }

            for (gas.a $$4 : this.p) {
               $$0.a($$1, $$4);
            }
         }
      }

      private int a(@Nullable yn $$0) {
         if ($$0 != null) {
            int $$1 = baj.a(this.c);
            int $$2 = $$0.a();
            return baj.c($$1, $$2);
         } else {
            return this.c;
         }
      }

      private int a(yl $$0, int $$1) {
         Integer $$2 = $$0.b();
         if ($$2 != null) {
            float $$3 = baj.i($$1);
            float $$4 = baj.i($$2);
            return $$3 != 1.0F ? baj.c(baj.b($$3 * $$4), $$2) : $$2;
         } else {
            return this.b ? baj.a($$1, 0.25F) : 0;
         }
      }

      @Nullable
      @Override
      public gcd a() {
         if (!(this.g >= this.i) && !(this.h >= this.j)) {
            int $$0 = bcb.d(this.g);
            int $$1 = bcb.d(this.h);
            int $$2 = bcb.f(this.i);
            int $$3 = bcb.f(this.j);
            return new gcd($$0, $$1, $$2 - $$0, $$3 - $$1);
         } else {
            return null;
         }
      }
   }
}
