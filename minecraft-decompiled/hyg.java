import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public abstract class hyg extends get {
   protected static final int d = 17;
   protected static final int e = 7;
   protected static final long f = 5368709120L;
   protected static final int u = -11776948;
   protected static final int v = -9671572;
   protected static final int w = -8388737;
   protected static final int x = -13408581;
   protected static final int y = -9670204;
   protected static final int z = 32;
   protected static final int A = 8;
   protected static final ame B = ame.b("textures/gui/title/realms.png");
   protected static final int C = 128;
   protected static final int D = 34;
   protected static final int E = 128;
   protected static final int F = 64;
   private final List<hyf> a = Lists.newArrayList();

   public hyg(xo $$0) {
      super($$0);
   }

   protected static int g(int $$0) {
      return 40 + $$0 * 13;
   }

   protected hyf a(hyf $$0) {
      this.a.add($$0);
      return this.a($$0);
   }

   public xo E() {
      return xn.a(this.a.stream().map(hyf::a).collect(Collectors.toList()));
   }

   protected static fyb F() {
      return fyb.a(128, 34, B, 128, 64);
   }
}
