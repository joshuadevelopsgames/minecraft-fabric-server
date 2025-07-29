import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record eeq(String s, boolean t, boolean u, boolean v, eeq.a w, dxx x, ayy y, ayy z, ayy A, ayy B, ayy C, ayy D, ayy E, ayy F) {
   private static final Map<String, eeq> G = new Object2ObjectArrayMap();
   public static final Codec<eeq> a = Codec.stringResolver(eeq::b, G::get);
   public static final eeq b = a(new eeq("iron", false, false, false, eeq.a.a, dxx.bp, ayz.op, ayz.oq, ayz.ox, ayz.oy, ayz.pS, ayz.pT, ayz.AH, ayz.AI));
   public static final eeq c = a(new eeq("copper", true, true, false, eeq.a.a, dxx.aj, ayz.fR, ayz.fS, ayz.fY, ayz.fZ, ayz.pS, ayz.pT, ayz.AH, ayz.AI));
   public static final eeq d = a(new eeq("gold", false, true, false, eeq.a.a, dxx.g, ayz.op, ayz.oq, ayz.ox, ayz.oy, ayz.pS, ayz.pT, ayz.AH, ayz.AI));
   public static final eeq e = a(new eeq("stone", true, true, false, eeq.a.b, dxx.f, ayz.op, ayz.oq, ayz.ox, ayz.oy, ayz.AM, ayz.AN, ayz.AH, ayz.AI));
   public static final eeq f = a(
      new eeq("polished_blackstone", true, true, false, eeq.a.b, dxx.f, ayz.op, ayz.oq, ayz.ox, ayz.oy, ayz.AM, ayz.AN, ayz.AH, ayz.AI)
   );
   public static final eeq g = a(new eeq("oak"));
   public static final eeq h = a(new eeq("spruce"));
   public static final eeq i = a(new eeq("birch"));
   public static final eeq j = a(new eeq("acacia"));
   public static final eeq k = a(new eeq("cherry", true, true, true, eeq.a.a, dxx.aW, ayz.eI, ayz.eJ, ayz.eK, ayz.eL, ayz.eO, ayz.eP, ayz.eM, ayz.eN));
   public static final eeq l = a(new eeq("jungle"));
   public static final eeq m = a(new eeq("dark_oak"));
   public static final eeq n = a(new eeq("pale_oak"));
   public static final eeq o = a(new eeq("crimson", true, true, true, eeq.a.a, dxx.aV, ayz.sa, ayz.sb, ayz.sc, ayz.sd, ayz.sg, ayz.sh, ayz.se, ayz.sf));
   public static final eeq p = a(new eeq("warped", true, true, true, eeq.a.a, dxx.aV, ayz.sa, ayz.sb, ayz.sc, ayz.sd, ayz.sg, ayz.sh, ayz.se, ayz.sf));
   public static final eeq q = a(new eeq("mangrove"));
   public static final eeq r = a(new eeq("bamboo", true, true, true, eeq.a.a, dxx.aU, ayz.bo, ayz.bp, ayz.bq, ayz.br, ayz.bu, ayz.bv, ayz.bs, ayz.bt));

   public eeq(String $$0) {
      this($$0, true, true, true, eeq.a.a, dxx.b, ayz.Es, ayz.Et, ayz.Eu, ayz.Ev, ayz.Ey, ayz.Ez, ayz.Ew, ayz.Ex);
   }

   private static eeq a(eeq $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<eeq> a() {
      return G.values().stream();
   }

   public String b() {
      return this.s;
   }

   public boolean c() {
      return this.t;
   }

   public boolean d() {
      return this.u;
   }

   public boolean e() {
      return this.v;
   }

   public eeq.a f() {
      return this.w;
   }

   public dxx g() {
      return this.x;
   }

   public ayy h() {
      return this.y;
   }

   public ayy i() {
      return this.z;
   }

   public ayy j() {
      return this.A;
   }

   public ayy k() {
      return this.B;
   }

   public ayy l() {
      return this.C;
   }

   public ayy m() {
      return this.D;
   }

   public ayy n() {
      return this.E;
   }

   public ayy o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
