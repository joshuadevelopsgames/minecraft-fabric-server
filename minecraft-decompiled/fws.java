import javax.annotation.Nullable;

public final class fws {
   public static final fws a = a("all");
   public static final fws b = a("texture", a);
   public static final fws c = a("particle", b);
   public static final fws d = a("end", a);
   public static final fws e = a("bottom", d);
   public static final fws f = a("top", d);
   public static final fws g = a("front", a);
   public static final fws h = a("back", a);
   public static final fws i = a("side", a);
   public static final fws j = a("north", i);
   public static final fws k = a("south", i);
   public static final fws l = a("east", i);
   public static final fws m = a("west", i);
   public static final fws n = a("up");
   public static final fws o = a("down");
   public static final fws p = a("cross");
   public static final fws q = a("cross_emissive");
   public static final fws r = a("plant");
   public static final fws s = a("wall", a);
   public static final fws t = a("rail");
   public static final fws u = a("wool");
   public static final fws v = a("pattern");
   public static final fws w = a("pane");
   public static final fws x = a("edge");
   public static final fws y = a("fan");
   public static final fws z = a("stem");
   public static final fws A = a("upperstem");
   public static final fws B = a("crop");
   public static final fws C = a("dirt");
   public static final fws D = a("fire");
   public static final fws E = a("lantern");
   public static final fws F = a("platform");
   public static final fws G = a("unsticky");
   public static final fws H = a("torch");
   public static final fws I = a("layer0");
   public static final fws J = a("layer1");
   public static final fws K = a("layer2");
   public static final fws L = a("lit_log");
   public static final fws M = a("candle");
   public static final fws N = a("inside");
   public static final fws O = a("content");
   public static final fws P = a("inner_top");
   public static final fws Q = a("flowerbed");
   public static final fws R = a("tentacles");
   private final String S;
   @Nullable
   private final fws T;

   private static fws a(String $$0) {
      return new fws($$0, null);
   }

   private static fws a(String $$0, fws $$1) {
      return new fws($$0, $$1);
   }

   private fws(String $$0, @Nullable fws $$1) {
      this.S = $$0;
      this.T = $$1;
   }

   public String a() {
      return this.S;
   }

   @Nullable
   public fws b() {
      return this.T;
   }

   @Override
   public String toString() {
      return "#" + this.S;
   }
}
