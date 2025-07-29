import com.google.common.base.Preconditions;

public class fap {
   private static final fap[] am = new fap[64];
   public static final fap a = new fap(0, 0);
   public static final fap b = new fap(1, 8368696);
   public static final fap c = new fap(2, 16247203);
   public static final fap d = new fap(3, 13092807);
   public static final fap e = new fap(4, 16711680);
   public static final fap f = new fap(5, 10526975);
   public static final fap g = new fap(6, 10987431);
   public static final fap h = new fap(7, 31744);
   public static final fap i = new fap(8, 16777215);
   public static final fap j = new fap(9, 10791096);
   public static final fap k = new fap(10, 9923917);
   public static final fap l = new fap(11, 7368816);
   public static final fap m = new fap(12, 4210943);
   public static final fap n = new fap(13, 9402184);
   public static final fap o = new fap(14, 16776437);
   public static final fap p = new fap(15, 14188339);
   public static final fap q = new fap(16, 11685080);
   public static final fap r = new fap(17, 6724056);
   public static final fap s = new fap(18, 15066419);
   public static final fap t = new fap(19, 8375321);
   public static final fap u = new fap(20, 15892389);
   public static final fap v = new fap(21, 5000268);
   public static final fap w = new fap(22, 10066329);
   public static final fap x = new fap(23, 5013401);
   public static final fap y = new fap(24, 8339378);
   public static final fap z = new fap(25, 3361970);
   public static final fap A = new fap(26, 6704179);
   public static final fap B = new fap(27, 6717235);
   public static final fap C = new fap(28, 10040115);
   public static final fap D = new fap(29, 1644825);
   public static final fap E = new fap(30, 16445005);
   public static final fap F = new fap(31, 6085589);
   public static final fap G = new fap(32, 4882687);
   public static final fap H = new fap(33, 55610);
   public static final fap I = new fap(34, 8476209);
   public static final fap J = new fap(35, 7340544);
   public static final fap K = new fap(36, 13742497);
   public static final fap L = new fap(37, 10441252);
   public static final fap M = new fap(38, 9787244);
   public static final fap N = new fap(39, 7367818);
   public static final fap O = new fap(40, 12223780);
   public static final fap P = new fap(41, 6780213);
   public static final fap Q = new fap(42, 10505550);
   public static final fap R = new fap(43, 3746083);
   public static final fap S = new fap(44, 8874850);
   public static final fap T = new fap(45, 5725276);
   public static final fap U = new fap(46, 8014168);
   public static final fap V = new fap(47, 4996700);
   public static final fap W = new fap(48, 4993571);
   public static final fap X = new fap(49, 5001770);
   public static final fap Y = new fap(50, 9321518);
   public static final fap Z = new fap(51, 2430480);
   public static final fap aa = new fap(52, 12398641);
   public static final fap ab = new fap(53, 9715553);
   public static final fap ac = new fap(54, 6035741);
   public static final fap ad = new fap(55, 1474182);
   public static final fap ae = new fap(56, 3837580);
   public static final fap af = new fap(57, 5647422);
   public static final fap ag = new fap(58, 1356933);
   public static final fap ah = new fap(59, 6579300);
   public static final fap ai = new fap(60, 14200723);
   public static final fap aj = new fap(61, 8365974);
   public final int ak;
   public final int al;

   private fap(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 <= 63) {
         this.al = $$0;
         this.ak = $$1;
         am[$$0] = this;
      } else {
         throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
      }
   }

   public int a(fap.a $$0) {
      return this == a ? 0 : baj.b(baj.f(this.ak), $$0.f);
   }

   public static fap a(int $$0) {
      Preconditions.checkPositionIndex($$0, am.length, "material id");
      return c($$0);
   }

   private static fap c(int $$0) {
      fap $$1 = am[$$0];
      return $$1 != null ? $$1 : a;
   }

   public static int b(int $$0) {
      int $$1 = $$0 & 0xFF;
      return c($$1 >> 2).a(fap.a.b($$1 & 3));
   }

   public byte b(fap.a $$0) {
      return (byte)(this.al << 2 | $$0.e & 3);
   }

   public static enum a {
      a(0, 180),
      b(1, 220),
      c(2, 255),
      d(3, 135);

      private static final fap.a[] g = new fap.a[]{a, b, c, d};
      public final int e;
      public final int f;

      private a(final int $$0, final int $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public static fap.a a(int $$0) {
         Preconditions.checkPositionIndex($$0, g.length, "brightness id");
         return b($$0);
      }

      static fap.a b(int $$0) {
         return g[$$0];
      }
   }
}
