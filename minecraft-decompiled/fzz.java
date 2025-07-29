import javax.annotation.Nullable;

public class fzz implements gac {
   private static final ame a = ame.b("toast/now_playing");
   private static final ame e = ame.a("icon/music_notes");
   private static final int f = 7;
   private static final int g = 16;
   private static final int h = 30;
   private static final int i = 30;
   private static final int j = 5000;
   private static final int k = dbt.i.g();
   private static final long l = 25L;
   private static int m;
   private static long n;
   private static int o = -1;
   private boolean p;
   private double q;
   @Nullable
   private static String r;
   private final fue s;
   private gac.a t = gac.a.b;

   public fzz() {
      this.s = fue.R();
   }

   public static void a(fxb $$0, fwz $$1) {
      if (r != null) {
         $$0.a(gxx.ar, a, 0, 0, a(r, $$1), 30);
         int $$2 = 7;
         $$0.a(gxx.ar, e, 7, 7, 16, 16, o);
         $$0.b($$1, a(r), 30, 15 - 9 / 2, k);
      }
   }

   public static void c() {
      r = fue.R().s().d();
      if (r != null) {
         long $$0 = System.currentTimeMillis();
         if ($$0 > n + 25L) {
            m++;
            n = $$0;
            o = fvg.a(fvg.a.b, (float)m);
         }
      }
   }

   private static xo a(@Nullable String $$0) {
      return $$0 == null ? xo.i() : xo.c($$0.replace("/", "."));
   }

   public void a(fui $$0) {
      this.p = true;
      this.q = $$0.E().c();
      this.a(gac.a.a);
   }

   @Override
   public void a(gad $$0, long $$1) {
      if (this.p) {
         this.t = $$1 < 5000.0 * this.q ? gac.a.a : gac.a.b;
         c();
      }
   }

   @Override
   public void a(fxb $$0, fwz $$1, long $$2) {
      a($$0, $$1);
   }

   @Override
   public void d() {
      this.p = false;
   }

   @Override
   public int e() {
      return a(r, this.s.h);
   }

   private static int a(@Nullable String $$0, fwz $$1) {
      return 30 + $$1.a(a($$0)) + 7;
   }

   @Override
   public int f() {
      return 30;
   }

   @Override
   public float a(int $$0, float $$1) {
      return this.e() * $$1 - this.e();
   }

   @Override
   public float a(int $$0) {
      return 0.0F;
   }

   @Override
   public gac.a a() {
      return this.t;
   }

   public void a(gac.a $$0) {
      this.t = $$0;
   }
}
