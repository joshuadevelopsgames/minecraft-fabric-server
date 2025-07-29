import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public abstract class bzc extends cau {
   private static final alh<Boolean> ck = all.a(bzc.class, alj.k);
   public static final int a = -24000;
   private static final int cl = 40;
   protected static final int b = 0;
   protected static final int c = 0;
   protected int d = 0;
   protected int e = 0;
   protected int f;

   protected bzc(bzv<? extends bzc> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      if ($$3 == null) {
         $$3 = new bzc.a(true);
      }

      bzc.a $$4 = (bzc.a)$$3;
      if ($$4.c() && $$4.a() > 0 && $$0.H_().i() <= $$4.d()) {
         this.c_(-24000);
      }

      $$4.b();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public abstract bzc a(aub var1, bzc var2);

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(ck, false);
   }

   public boolean Y_() {
      return false;
   }

   public int Z_() {
      if (this.ai().C) {
         return this.ay.a(ck) ? -1 : 1;
      } else {
         return this.d;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.Z_();
      $$2 += $$0 * 20;
      if ($$2 > 0) {
         $$2 = 0;
      }

      int $$4 = $$2 - $$2;
      this.c_($$2);
      if ($$1) {
         this.e += $$4;
         if (this.f == 0) {
            this.f = 40;
         }
      }

      if (this.Z_() == 0) {
         this.c_(this.e);
      }
   }

   public void b_(int $$0) {
      this.a($$0, false);
   }

   public void c_(int $$0) {
      int $$1 = this.Z_();
      this.d = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.ay.a(ck, $$0 < 0);
         this.h();
      }
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("Age", this.Z_());
      $$0.a("ForcedAge", this.e);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.c_($$0.a("Age", 0));
      this.e = $$0.a("ForcedAge", 0);
   }

   @Override
   public void a(alh<?> $$0) {
      if (ck.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (this.ai().C) {
         if (this.f > 0) {
            if (this.f % 4 == 0) {
               this.ai().a(me.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            this.f--;
         }
      } else if (this.bO()) {
         int $$0 = this.Z_();
         if ($$0 < 0) {
            this.c_(++$$0);
         } else if ($$0 > 0) {
            this.c_(--$$0);
         }
      }
   }

   protected void h() {
      if (!this.g_() && this.cc() && this.dm() instanceof cxe $$0 && !$$0.C(this)) {
         this.bS();
      }
   }

   @Override
   public boolean g_() {
      return this.Z_() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -24000 : 0);
   }

   public static int d_(int $$0) {
      return (int)($$0 / 20 * 0.1F);
   }

   @VisibleForTesting
   public int k() {
      return this.e;
   }

   @VisibleForTesting
   public int l() {
      return this.f;
   }

   public static class a implements cbe {
      private int a;
      private final boolean b;
      private final float c;

      public a(boolean $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public a(boolean $$0) {
         this($$0, 0.05F);
      }

      public a(float $$0) {
         this(true, $$0);
      }

      public int a() {
         return this.a;
      }

      public void b() {
         this.a++;
      }

      public boolean c() {
         return this.b;
      }

      public float d() {
         return this.c;
      }
   }
}
