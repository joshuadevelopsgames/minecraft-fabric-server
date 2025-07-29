import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record efp(String n, eeq o, dxx p, dxx q, ayy r, ayy s) {
   private static final Map<String, efp> t = new Object2ObjectArrayMap();
   public static final Codec<efp> a = Codec.stringResolver(efp::b, t::get);
   public static final efp b = a(new efp("oak", eeq.g));
   public static final efp c = a(new efp("spruce", eeq.h));
   public static final efp d = a(new efp("birch", eeq.i));
   public static final efp e = a(new efp("acacia", eeq.j));
   public static final efp f = a(new efp("cherry", eeq.k, dxx.aW, dxx.aZ, ayz.eQ, ayz.eR));
   public static final efp g = a(new efp("jungle", eeq.l));
   public static final efp h = a(new efp("dark_oak", eeq.m));
   public static final efp i = a(new efp("pale_oak", eeq.n));
   public static final efp j = a(new efp("crimson", eeq.o, dxx.aV, dxx.aS, ayz.si, ayz.sj));
   public static final efp k = a(new efp("warped", eeq.p, dxx.aV, dxx.aS, ayz.si, ayz.sj));
   public static final efp l = a(new efp("mangrove", eeq.q));
   public static final efp m = a(new efp("bamboo", eeq.r, dxx.aU, dxx.aT, ayz.bw, ayz.bx));

   public efp(String $$0, eeq $$1) {
      this($$0, $$1, dxx.b, dxx.aR, ayz.ju, ayz.jv);
   }

   private static efp a(efp $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<efp> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public eeq c() {
      return this.o;
   }

   public dxx d() {
      return this.p;
   }

   public dxx e() {
      return this.q;
   }

   public ayy f() {
      return this.r;
   }

   public ayy g() {
      return this.s;
   }
}
