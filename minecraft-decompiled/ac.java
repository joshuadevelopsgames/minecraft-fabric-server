import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import java.time.Duration;
import javax.annotation.Nullable;

public class ac {
   @Deprecated
   public static final boolean a = false;
   @Deprecated
   public static final int b = 4440;
   @Deprecated
   public static final String c = "main";
   @Deprecated
   public static final String d = "1.21.8";
   @Deprecated
   public static final int e = 772;
   @Deprecated
   public static final int f = 259;
   public static final int g = 4420;
   private static final int bq = 30;
   public static final boolean h = false;
   @Deprecated
   public static final int i = 64;
   @Deprecated
   public static final int j = 81;
   @Deprecated
   public static final int k = 1;
   public static final int l = 1;
   public static final String m = "DataVersion";
   public static final boolean n = false;
   public static final boolean o = false;
   public static final boolean p = false;
   public static final boolean q = false;
   public static final boolean r = false;
   public static final boolean s = false;
   public static final boolean t = false;
   public static final boolean u = false;
   public static final boolean v = false;
   public static final boolean w = false;
   public static final boolean x = false;
   public static final boolean y = false;
   public static final boolean z = false;
   public static final boolean A = false;
   public static final boolean B = false;
   public static final boolean C = false;
   public static final boolean D = false;
   public static final boolean E = false;
   public static final boolean F = false;
   public static final boolean G = false;
   public static final boolean H = false;
   public static final boolean I = false;
   public static final boolean J = false;
   public static final boolean K = false;
   public static final boolean L = false;
   public static final boolean M = false;
   public static final boolean N = false;
   public static final boolean O = false;
   public static final boolean P = false;
   public static final boolean Q = false;
   public static final boolean R = false;
   public static final boolean S = false;
   public static final boolean T = false;
   public static final boolean U = false;
   public static final boolean V = false;
   public static final boolean W = false;
   public static final boolean X = false;
   public static final boolean Y = false;
   public static final boolean Z = false;
   public static final boolean aa = false;
   public static final boolean ab = false;
   public static final boolean ac = false;
   public static final boolean ad = false;
   public static final boolean ae = false;
   public static final boolean af = false;
   public static final boolean ag = false;
   public static final boolean ah = false;
   public static final boolean ai = false;
   public static final boolean aj = false;
   public static final boolean ak = false;
   public static final boolean al = false;
   public static final boolean am = false;
   public static final boolean an = false;
   public static final boolean ao = false;
   public static final boolean ap = false;
   public static final boolean aq = false;
   public static final boolean ar = false;
   public static final boolean as = false;
   public static final boolean at = false;
   public static final boolean au = false;
   public static final boolean av = false;
   public static boolean aw = false;
   public static boolean ax = false;
   public static final boolean ay = false;
   public static final boolean az = false;
   public static final boolean aA = false;
   public static final boolean aB = false;
   public static final boolean aC = false;
   public static final boolean aD = false;
   public static final boolean aE = false;
   public static final boolean aF = false;
   public static final boolean aG = false;
   public static final boolean aH = false;
   public static final int aI = 25565;
   public static final boolean aJ = false;
   public static final int aK = 0;
   public static final int aL = 0;
   public static final Level aM = Level.DISABLED;
   public static final boolean aN = false;
   public static final boolean aO = false;
   public static final boolean aP = false;
   public static final boolean aQ = false;
   public static final boolean aR = false;
   public static final boolean aS = false;
   public static final boolean aT = false;
   public static final long aU = Duration.ofMillis(300L).toNanos();
   public static final float aV = 3600000.0F;
   public static final boolean aW = false;
   public static final boolean aX = false;
   public static boolean aY = true;
   public static boolean aZ;
   public static final int ba = 16;
   public static final int bb = 256;
   public static final int bc = 32500;
   public static final int bd = 2000000;
   public static final int be = 16;
   public static final int bf = 1000000;
   public static final int bg = 32;
   public static final char[] bh = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':'};
   public static final int bi = 20;
   public static final int bj = 50;
   public static final int bk = 1200;
   public static final int bl = 24000;
   public static final float bm = 1365.3334F;
   public static final float bn = 0.87890625F;
   public static final float bo = 17.578125F;
   public static final int bp = 64;
   @Nullable
   private static ah br;

   public static void a(ah $$0) {
      if (br == null) {
         br = $$0;
      } else if ($$0 != br) {
         throw new IllegalStateException("Cannot override the current game version!");
      }
   }

   public static void a() {
      if (br == null) {
         br = u.a();
      }
   }

   public static ah b() {
      if (br == null) {
         throw new IllegalStateException("Game version not set");
      } else {
         return br;
      }
   }

   public static int c() {
      return 772;
   }

   public static boolean a(dlz $$0) {
      int $$1 = $$0.d();
      int $$2 = $$0.e();
      return !aw ? false : $$1 > 8192 || $$1 < 0 || $$2 > 1024 || $$2 < 0;
   }

   static {
      ResourceLeakDetector.setLevel(aM);
      CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = false;
      CommandSyntaxException.BUILT_IN_EXCEPTIONS = new ee();
   }
}
