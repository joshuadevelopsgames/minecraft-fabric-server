import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public abstract class bzj extends bzm {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final alh<Integer> p = all.a(bzj.class, alj.b);
   private static final alh<Integer> q = all.a(bzj.class, alj.b);
   private static final alh<Integer> r = all.a(bzj.class, alj.b);
   private static final alh<Vector3f> s = all.a(bzj.class, alj.H);
   private static final alh<Vector3f> t = all.a(bzj.class, alj.H);
   private static final alh<Quaternionf> u = all.a(bzj.class, alj.I);
   private static final alh<Quaternionf> aM = all.a(bzj.class, alj.I);
   private static final alh<Byte> aN = all.a(bzj.class, alj.a);
   private static final alh<Integer> aO = all.a(bzj.class, alj.b);
   private static final alh<Float> aP = all.a(bzj.class, alj.d);
   private static final alh<Float> aQ = all.a(bzj.class, alj.d);
   private static final alh<Float> aR = all.a(bzj.class, alj.d);
   private static final alh<Float> aS = all.a(bzj.class, alj.d);
   private static final alh<Float> aT = all.a(bzj.class, alj.d);
   private static final alh<Integer> aU = all.a(bzj.class, alj.b);
   private static final IntSet aV = IntSet.of(new int[]{s.a(), t.a(), u.a(), aM.a(), aN.a(), aO.a(), aQ.a(), aR.a()});
   private static final int aW = 0;
   private static final int aX = 0;
   private static final int aY = 0;
   private static final float aZ = 0.0F;
   private static final float ba = 1.0F;
   private static final float bb = 1.0F;
   private static final float bc = 0.0F;
   private static final float bd = 0.0F;
   private static final int be = -1;
   public static final String b = "teleport_duration";
   public static final String c = "interpolation_duration";
   public static final String d = "start_interpolation";
   public static final String e = "transformation";
   public static final String f = "billboard";
   public static final String g = "brightness";
   public static final String h = "view_range";
   public static final String i = "shadow_radius";
   public static final String j = "shadow_strength";
   public static final String k = "width";
   public static final String l = "height";
   public static final String m = "glow_color_override";
   private long bf = -2147483648L;
   private int bg;
   private float bh;
   private fin bi;
   private boolean bj = true;
   protected boolean n;
   private boolean bk;
   private boolean bl;
   @Nullable
   private bzj.j bm;
   private final cah bn = new cah(this, 0);

   public bzj(bzv<?> $$0, dmu $$1) {
      super($$0, $$1);
      this.aq = true;
      this.bi = this.cV();
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if (aT.equals($$0) || aS.equals($$0)) {
         this.z();
      }

      if (p.equals($$0)) {
         this.bk = true;
      }

      if (r.equals($$0)) {
         this.bn.a(this.n());
      }

      if (q.equals($$0)) {
         this.bl = true;
      }

      if (aV.contains($$0.a())) {
         this.n = true;
      }
   }

   @Override
   public final boolean a(aub $$0, byb $$1, float $$2) {
      return false;
   }

   private static k a(all $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(aM);
      return new k($$1, $$2, $$3, $$4);
   }

   @Override
   public void g() {
      bzm $$0 = this.dm();
      if ($$0 != null && $$0.dU()) {
         this.bS();
      }

      if (this.ai().C) {
         if (this.bk) {
            this.bk = false;
            int $$1 = this.m();
            this.bf = this.as + $$1;
         }

         if (this.bl) {
            this.bl = false;
            this.bg = this.l();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.bg != 0;
            if ($$2 && this.bm != null) {
               this.bm = this.a(this.bm, this.bh);
            } else {
               this.bm = this.A();
            }

            this.a($$2, this.bh);
         }

         this.bn.e();
      }
   }

   @Override
   public cah l_() {
      return this.bn;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(all.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aM, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(aN, bzj.a.a.a());
      $$0.a(aO, -1);
      $$0.a(aP, 1.0F);
      $$0.a(aQ, 0.0F);
      $$0.a(aR, 1.0F);
      $$0.a(aS, 0.0F);
      $$0.a(aT, 0.0F);
      $$0.a(aU, -1);
   }

   @Override
   protected void a(fda $$0) {
      this.a($$0.<k>a("transformation", k.b).orElse(k.a()));
      this.b($$0.a("interpolation_duration", 0));
      this.c($$0.a("start_interpolation", 0));
      int $$1 = $$0.a("teleport_duration", 0);
      this.d(bcb.a($$1, 0, 59));
      this.a($$0.<bzj.a>a("billboard", bzj.a.e).orElse(bzj.a.a));
      this.b($$0.a("view_range", 1.0F));
      this.c($$0.a("shadow_radius", 0.0F));
      this.d($$0.a("shadow_strength", 1.0F));
      this.x($$0.a("width", 0.0F));
      this.y($$0.a("height", 0.0F));
      this.l($$0.a("glow_color_override", -1));
      this.a($$0.<bap>a("brightness", bap.b).orElse(null));
   }

   private void a(k $$0) {
      this.ay.a(s, $$0.e());
      this.ay.a(u, $$0.f());
      this.ay.a(t, $$0.g());
      this.ay.a(aM, $$0.h());
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("transformation", k.b, a(this.ay));
      $$0.a("billboard", bzj.a.e, this.p());
      $$0.a("interpolation_duration", this.l());
      $$0.a("teleport_duration", this.n());
      $$0.a("view_range", this.t());
      $$0.a("shadow_radius", this.u());
      $$0.a("shadow_strength", this.v());
      $$0.a("width", this.w());
      $$0.a("height", this.y());
      $$0.a("glow_color_override", this.x());
      $$0.b("brightness", bap.b, this.q());
   }

   public fin e() {
      return this.bi;
   }

   public boolean f() {
      return !this.bj;
   }

   @Override
   public faq k_() {
      return faq.d;
   }

   @Override
   public boolean n_() {
      return true;
   }

   @Nullable
   public bzj.j i() {
      return this.bm;
   }

   private void b(int $$0) {
      this.ay.a(q, $$0);
   }

   private int l() {
      return this.ay.a(q);
   }

   private void c(int $$0) {
      this.ay.a(p, $$0, true);
   }

   private int m() {
      return this.ay.a(p);
   }

   private void d(int $$0) {
      this.ay.a(r, $$0);
   }

   private int n() {
      return this.ay.a(r);
   }

   private void a(bzj.a $$0) {
      this.ay.a(aN, $$0.a());
   }

   private bzj.a p() {
      return bzj.a.f.apply(this.ay.a(aN));
   }

   private void a(@Nullable bap $$0) {
      this.ay.a(aO, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private bap q() {
      int $$0 = this.ay.a(aO);
      return $$0 != -1 ? bap.c($$0) : null;
   }

   private int s() {
      return this.ay.a(aO);
   }

   private void b(float $$0) {
      this.ay.a(aP, $$0);
   }

   private float t() {
      return this.ay.a(aP);
   }

   private void c(float $$0) {
      this.ay.a(aQ, $$0);
   }

   private float u() {
      return this.ay.a(aQ);
   }

   private void d(float $$0) {
      this.ay.a(aR, $$0);
   }

   private float v() {
      return this.ay.a(aR);
   }

   private void x(float $$0) {
      this.ay.a(aS, $$0);
   }

   private float w() {
      return this.ay.a(aS);
   }

   private void y(float $$0) {
      this.ay.a(aT, $$0);
   }

   private int x() {
      return this.ay.a(aU);
   }

   private void l(int $$0) {
      this.ay.a(aU, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.bg;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)(this.as - this.bf);
         float $$3 = $$2 + $$0;
         float $$4 = bcb.a(bcb.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.bh = $$4;
         return $$4;
      }
   }

   private float y() {
      return this.ay.a(aT);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.z();
   }

   private void z() {
      float $$0 = this.w();
      float $$1 = this.y();
      this.bj = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dC();
      double $$4 = this.dE();
      double $$5 = this.dI();
      this.bi = new fin($$3 - $$2, $$4, $$5 - $$2, $$3 + $$2, $$4 + $$1, $$5 + $$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < bcb.k(this.t() * 64.0 * cO());
   }

   @Override
   public int m_() {
      int $$0 = this.x();
      return $$0 != -1 ? $$0 : super.m_();
   }

   private bzj.j A() {
      return new bzj.j(bzj.e.constant(a(this.ay)), this.p(), this.s(), bzj.d.constant(this.u()), bzj.d.constant(this.v()), this.x());
   }

   private bzj.j a(bzj.j $$0, float $$1) {
      k $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bzj.j(new bzj.l($$2, a(this.ay)), this.p(), this.s(), new bzj.h($$3, this.u()), new bzj.h($$4, this.v()), this.x());
   }

   public static enum a implements bda {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bzj.a> e = bda.a(bzj.a::values);
      public static final IntFunction<bzj.a> f = baq.a(bzj.a::a, values(), baq.a.a);
      private final byte g;
      private final String h;

      private a(final byte $$0, final String $$1) {
         this.h = $$1;
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.h;
      }

      byte a() {
         return this.g;
      }
   }

   public static class b extends bzj {
      public static final String o = "block_state";
      private static final alh<eeb> p = all.a(bzj.b.class, alj.i);
      @Nullable
      private bzj.b.a q;

      public b(bzv<?> $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(all.a $$0) {
         super.a($$0);
         $$0.a(p, dqb.a.m());
      }

      @Override
      public void a(alh<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private eeb m() {
         return this.ay.a(p);
      }

      private void c(eeb $$0) {
         this.ay.a(p, $$0);
      }

      @Override
      protected void a(fda $$0) {
         super.a($$0);
         this.c($$0.<eeb>a("block_state", eeb.a).orElse(dqb.a.m()));
      }

      @Override
      protected void a(fdc $$0) {
         super.a($$0);
         $$0.a("block_state", eeb.a, this.m());
      }

      @Nullable
      public bzj.b.a l() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bzj.b.a(this.m());
      }

      public record a(eeb a) {
      }
   }

   record c(int a, int b) implements bzj.f {
      @Override
      public int get(float $$0) {
         return baj.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bzj.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bzj.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bzj.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bzj {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final alh<dcv> q = all.a(bzj.g.class, alj.h);
      private static final alh<Byte> r = all.a(bzj.g.class, alj.a);
      private final cbd s = cbd.a(this::m, this::a);
      @Nullable
      private bzj.g.a t;

      public g(bzv<?> $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(all.a $$0) {
         super.a($$0);
         $$0.a(q, dcv.l);
         $$0.a(r, dct.a.a());
      }

      @Override
      public void a(alh<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private dcv m() {
         return this.ay.a(q);
      }

      private void a(dcv $$0) {
         this.ay.a(q, $$0);
      }

      private void a(dct $$0) {
         this.ay.a(r, $$0.a());
      }

      private dct n() {
         return dct.k.apply(this.ay.a(r));
      }

      @Override
      protected void a(fda $$0) {
         super.a($$0);
         this.a($$0.<dcv>a("item", dcv.b).orElse(dcv.l));
         this.a($$0.<dct>a("item_display", dct.j).orElse(dct.a));
      }

      @Override
      protected void a(fdc $$0) {
         super.a($$0);
         dcv $$1 = this.m();
         if (!$$1.f()) {
            $$0.a("item", dcv.b, $$1);
         }

         $$0.a("item_display", dct.j, this.n());
      }

      @Override
      public cbd a_(int $$0) {
         return $$0 == 0 ? this.s : cbd.a;
      }

      @Nullable
      public bzj.g.a l() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         dcv $$2 = this.m();
         $$2.a(this);
         this.t = new bzj.g.a($$2, this.n());
      }

      public record a(dcv a, dct b) {
      }
   }

   record h(float a, float b) implements bzj.d {
      @Override
      public float get(float $$0) {
         return bcb.h($$0, this.a, this.b);
      }
   }

   record i(int a, int b) implements bzj.f {
      @Override
      public int get(float $$0) {
         return bcb.a($$0, this.a, this.b);
      }
   }

   public record j(bzj.e<k> a, bzj.a b, int c, bzj.d d, bzj.d e, int f) {
   }

   public static class k extends bzj {
      public static final String o = "text";
      private static final String aM = "line_width";
      private static final String aN = "text_opacity";
      private static final String aO = "background";
      private static final String aP = "shadow";
      private static final String aQ = "see_through";
      private static final String aR = "default_background";
      private static final String aS = "alignment";
      public static final byte p = 1;
      public static final byte q = 2;
      public static final byte r = 4;
      public static final byte s = 8;
      public static final byte t = 16;
      private static final byte aT = -1;
      public static final int u = 1073741824;
      private static final int aU = 200;
      private static final alh<xo> aV = all.a(bzj.k.class, alj.f);
      private static final alh<Integer> aW = all.a(bzj.k.class, alj.b);
      private static final alh<Integer> aX = all.a(bzj.k.class, alj.b);
      private static final alh<Byte> aY = all.a(bzj.k.class, alj.a);
      private static final alh<Byte> aZ = all.a(bzj.k.class, alj.a);
      private static final IntSet ba = IntSet.of(new int[]{aV.a(), aW.a(), aX.a(), aY.a(), aZ.a()});
      @Nullable
      private bzj.k.b bb;
      @Nullable
      private bzj.k.e bc;

      public k(bzv<?> $$0, dmu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(all.a $$0) {
         super.a($$0);
         $$0.a(aV, xo.i());
         $$0.a(aW, 200);
         $$0.a(aX, 1073741824);
         $$0.a(aY, (byte)-1);
         $$0.a(aZ, (byte)0);
      }

      @Override
      public void a(alh<?> $$0) {
         super.a($$0);
         if (ba.contains($$0.a())) {
            this.n = true;
         }
      }

      private xo m() {
         return this.ay.a(aV);
      }

      private void a(xo $$0) {
         this.ay.a(aV, $$0);
      }

      private int n() {
         return this.ay.a(aW);
      }

      private void b(int $$0) {
         this.ay.a(aW, $$0);
      }

      private byte p() {
         return this.ay.a(aY);
      }

      private void c(byte $$0) {
         this.ay.a(aY, $$0);
      }

      private int q() {
         return this.ay.a(aX);
      }

      private void c(int $$0) {
         this.ay.a(aX, $$0);
      }

      private byte s() {
         return this.ay.a(aZ);
      }

      private void d(byte $$0) {
         this.ay.a(aZ, $$0);
      }

      private static byte a(byte $$0, fda $$1, String $$2, byte $$3) {
         return $$1.a($$2, false) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(fda $$0) {
         super.a($$0);
         this.b($$0.a("line_width", 200));
         this.c($$0.a("text_opacity", (byte)-1));
         this.c($$0.a("background", 1073741824));
         byte $$1 = a((byte)0, $$0, "shadow", (byte)1);
         $$1 = a($$1, $$0, "see_through", (byte)2);
         $$1 = a($$1, $$0, "default_background", (byte)4);
         Optional<bzj.k.a> $$2 = $$0.a("alignment", bzj.k.a.d);
         if ($$2.isPresent()) {
            $$1 = switch ((bzj.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         Optional<xo> $$3 = $$0.a("text", xq.a);
         if ($$3.isPresent()) {
            try {
               if (this.ai() instanceof aub $$4) {
                  ek $$5 = this.d($$4).a(2);
                  xo $$6 = xr.a($$5, $$3.get(), this, 0);
                  this.a($$6);
               } else {
                  this.a(xo.i());
               }
            } catch (Exception var8) {
               bzj.o.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void a(byte $$0, fdc $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void a(fdc $$0) {
         super.a($$0);
         $$0.a("text", xq.a, this.m());
         $$0.a("line_width", this.n());
         $$0.a("background", this.q());
         $$0.a("text_opacity", this.p());
         byte $$1 = this.s();
         a($$1, $$0, "shadow", (byte)1);
         a($$1, $$0, "see_through", (byte)2);
         a($$1, $$0, "default_background", (byte)4);
         $$0.a("alignment", bzj.k.a.d, a($$1));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.bc != null) {
            this.bc = this.a(this.bc, $$1);
         } else {
            this.bc = this.t();
         }

         this.bb = null;
      }

      @Nullable
      public bzj.k.e l() {
         return this.bc;
      }

      private bzj.k.e t() {
         return new bzj.k.e(this.m(), this.n(), bzj.f.constant(this.p()), bzj.f.constant(this.q()), this.s());
      }

      private bzj.k.e a(bzj.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bzj.k.e(this.m(), this.n(), new bzj.i($$3, this.p()), new bzj.c($$2, this.q()), this.s());
      }

      public bzj.k.b a(bzj.k.d $$0) {
         if (this.bb == null) {
            if (this.bc != null) {
               this.bb = $$0.split(this.bc.a(), this.bc.b());
            } else {
               this.bb = new bzj.k.b(List.of(), 0);
            }
         }

         return this.bb;
      }

      public static bzj.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bzj.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bzj.k.a.c : bzj.k.a.a;
         }
      }

      public static enum a implements bda {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bzj.k.a> d = bda.a(bzj.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public record b(List<bzj.k.c> a, int b) {
      }

      public record c(bbm a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bzj.k.b split(xo var1, int var2);
      }

      public record e(xo a, int b, bzj.f c, bzj.f d, byte e) {
      }
   }

   record l(k a, k b) implements bzj.e<k> {
      public k a(float $$0) {
         return $$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
