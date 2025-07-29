import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.Double2DoubleFunction;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.slf4j.Logger;

public final class eju {
   private static final Codec<ejt> c = mm.ad.q().dispatch($$0 -> $$0.c().a(), Function.identity());
   protected static final double a = 1000000.0;
   static final Codec<Double> d = Codec.doubleRange(-1000000.0, 1000000.0);
   public static final Codec<ejt> b = Codec.either(d, c)
      .xmap($$0 -> (ejt)$$0.map(eju::a, Function.identity()), $$0 -> $$0 instanceof eju.h $$1 ? Either.left($$1.j()) : Either.right($$0));

   public static MapCodec<? extends ejt> a(jy<MapCodec<? extends ejt>> $$0) {
      a($$0, "blend_alpha", eju.d.e);
      a($$0, "blend_offset", eju.f.e);
      a($$0, "beardifier", eju.b.e);
      a($$0, "old_blended_noise", ezl.a);

      for (eju.l.a $$1 : eju.l.a.values()) {
         a($$0, $$1.c(), $$1.g);
      }

      a($$0, "noise", eju.o.e);
      a($$0, "end_islands", eju.i.a);
      a($$0, "weird_scaled_sampler", eju.z.a);
      a($$0, "shifted_noise", eju.v.a);
      a($$0, "range_choice", eju.q.e);
      a($$0, "shift_a", eju.s.e);
      a($$0, "shift_b", eju.t.e);
      a($$0, "shift", eju.r.e);
      a($$0, "blend_density", eju.e.e);
      a($$0, "clamp", eju.g.a);

      for (eju.k.a $$2 : eju.k.a.values()) {
         a($$0, $$2.c(), $$2.h);
      }

      for (eju.y.a $$3 : eju.y.a.values()) {
         a($$0, $$3.c(), $$3.e);
      }

      a($$0, "spline", eju.w.a);
      a($$0, "constant", eju.h.e);
      return a($$0, "y_clamped_gradient", eju.aa.a);
   }

   private static MapCodec<? extends ejt> a(jy<MapCodec<? extends ejt>> $$0, String $$1, bbu<? extends ejt> $$2) {
      return jy.a($$0, $$1, $$2.a());
   }

   static <A, O> bbu<O> a(Codec<A> $$0, Function<A, O> $$1, Function<O, A> $$2) {
      return bbu.a($$0.fieldOf("argument").xmap($$1, $$2));
   }

   static <O> bbu<O> a(Function<ejt, O> $$0, Function<O, ejt> $$1) {
      return a(ejt.d, $$0, $$1);
   }

   static <O> bbu<O> a(BiFunction<ejt, ejt, O> $$0, Function<O, ejt> $$1, Function<O, ejt> $$2) {
      return bbu.a(
         RecordCodecBuilder.mapCodec($$3 -> $$3.group(ejt.d.fieldOf("argument1").forGetter($$1), ejt.d.fieldOf("argument2").forGetter($$2)).apply($$3, $$0))
      );
   }

   static <O> bbu<O> a(MapCodec<O> $$0) {
      return bbu.a($$0);
   }

   private eju() {
   }

   public static ejt a(ejt $$0) {
      return new eju.l(eju.l.a.a, $$0);
   }

   public static ejt b(ejt $$0) {
      return new eju.l(eju.l.a.b, $$0);
   }

   public static ejt c(ejt $$0) {
      return new eju.l(eju.l.a.c, $$0);
   }

   public static ejt d(ejt $$0) {
      return new eju.l(eju.l.a.d, $$0);
   }

   public static ejt e(ejt $$0) {
      return new eju.l(eju.l.a.e, $$0);
   }

   public static ejt a(jl<ezo.a> $$0, @Deprecated double $$1, double $$2, double $$3, double $$4) {
      return a(new eju.o(new ejt.c($$0), $$1, $$2), $$3, $$4);
   }

   public static ejt a(jl<ezo.a> $$0, double $$1, double $$2, double $$3) {
      return a($$0, 1.0, $$1, $$2, $$3);
   }

   public static ejt a(jl<ezo.a> $$0, double $$1, double $$2) {
      return a($$0, 1.0, 1.0, $$1, $$2);
   }

   public static ejt a(ejt $$0, ejt $$1, double $$2, jl<ezo.a> $$3) {
      return new eju.v($$0, a(), $$1, $$2, 0.0, new ejt.c($$3));
   }

   public static ejt a(jl<ezo.a> $$0) {
      return b($$0, 1.0, 1.0);
   }

   public static ejt b(jl<ezo.a> $$0, double $$1, double $$2) {
      return new eju.o(new ejt.c($$0), $$1, $$2);
   }

   public static ejt a(jl<ezo.a> $$0, double $$1) {
      return b($$0, 1.0, $$1);
   }

   public static ejt a(ejt $$0, double $$1, double $$2, ejt $$3, ejt $$4) {
      return new eju.q($$0, $$1, $$2, $$3, $$4);
   }

   public static ejt b(jl<ezo.a> $$0) {
      return new eju.s(new ejt.c($$0));
   }

   public static ejt c(jl<ezo.a> $$0) {
      return new eju.t(new ejt.c($$0));
   }

   public static ejt d(jl<ezo.a> $$0) {
      return new eju.r(new ejt.c($$0));
   }

   public static ejt f(ejt $$0) {
      return new eju.e($$0);
   }

   public static ejt a(long $$0) {
      return new eju.i($$0);
   }

   public static ejt a(ejt $$0, jl<ezo.a> $$1, eju.z.a $$2) {
      return new eju.z($$0, new ejt.c($$1), $$2);
   }

   public static ejt a(ejt $$0, ejt $$1) {
      return eju.y.a(eju.y.a.a, $$0, $$1);
   }

   public static ejt b(ejt $$0, ejt $$1) {
      return eju.y.a(eju.y.a.b, $$0, $$1);
   }

   public static ejt c(ejt $$0, ejt $$1) {
      return eju.y.a(eju.y.a.c, $$0, $$1);
   }

   public static ejt d(ejt $$0, ejt $$1) {
      return eju.y.a(eju.y.a.d, $$0, $$1);
   }

   public static ejt a(bbb<eju.w.b, eju.w.a> $$0) {
      return new eju.w($$0);
   }

   public static ejt a() {
      return eju.h.f;
   }

   public static ejt a(double $$0) {
      return new eju.h($$0);
   }

   public static ejt a(int $$0, int $$1, double $$2, double $$3) {
      return new eju.aa($$0, $$1, $$2, $$3);
   }

   public static ejt a(ejt $$0, eju.k.a $$1) {
      return eju.k.a($$1, $$0);
   }

   private static ejt a(ejt $$0, double $$1, double $$2) {
      double $$3 = ($$1 + $$2) * 0.5;
      double $$4 = ($$2 - $$1) * 0.5;
      return a(a($$3), b(a($$4), $$0));
   }

   public static ejt b() {
      return eju.d.a;
   }

   public static ejt c() {
      return eju.f.a;
   }

   public static ejt a(ejt $$0, ejt $$1, ejt $$2) {
      if ($$1 instanceof eju.h $$3) {
         return a($$0, $$3.a, $$2);
      } else {
         ejt $$4 = d($$0);
         ejt $$5 = a(b($$4, a(-1.0)), a(1.0));
         return a(b($$1, $$5), b($$2, $$4));
      }
   }

   public static ejt a(ejt $$0, double $$1, ejt $$2) {
      return a(b($$0, a($$2, a(-$$1))), a($$1));
   }

   record a(eju.y.a e, ejt f, ejt g, double h, double i) implements eju.y {
      @Override
      public double a(ejt.b $$0) {
         double $$1 = this.f.a($$0);

         return switch (this.e) {
            case a -> $$1 + this.g.a($$0);
            case b -> $$1 == 0.0 ? 0.0 : $$1 * this.g.a($$0);
            case c -> $$1 < this.g.a() ? $$1 : Math.min($$1, this.g.a($$0));
            case d -> $$1 > this.g.b() ? $$1 : Math.max($$1, this.g.a($$0));
         };
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         this.f.a($$0, $$1);
         switch (this.e) {
            case a:
               double[] $$2 = new double[$$0.length];
               this.g.a($$2, $$1);

               for (int $$3 = 0; $$3 < $$0.length; $$3++) {
                  $$0[$$3] += $$2[$$3];
               }
               break;
            case b:
               for (int $$4 = 0; $$4 < $$0.length; $$4++) {
                  double $$5 = $$0[$$4];
                  $$0[$$4] = $$5 == 0.0 ? 0.0 : $$5 * this.g.a($$1.a($$4));
               }
               break;
            case c:
               double $$6 = this.g.a();

               for (int $$7 = 0; $$7 < $$0.length; $$7++) {
                  double $$8 = $$0[$$7];
                  $$0[$$7] = $$8 < $$6 ? $$8 : Math.min($$8, this.g.a($$1.a($$7)));
               }
               break;
            case d:
               double $$9 = this.g.b();

               for (int $$10 = 0; $$10 < $$0.length; $$10++) {
                  double $$11 = $$0[$$10];
                  $$0[$$10] = $$11 > $$9 ? $$11 : Math.max($$11, this.g.a($$1.a($$10)));
               }
         }
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(eju.y.a(this.e, this.f.a($$0), this.g.a($$0)));
      }

      @Override
      public double a() {
         return this.h;
      }

      @Override
      public double b() {
         return this.i;
      }

      @Override
      public eju.y.a j() {
         return this.e;
      }

      @Override
      public ejt k() {
         return this.f;
      }

      @Override
      public ejt l() {
         return this.g;
      }
   }

   record aa(int e, int f, double g, double h) implements ejt.d {
      private static final MapCodec<eju.aa> i = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.intRange(ehy.e * 2, ehy.d * 2).fieldOf("from_y").forGetter(eju.aa::j),
               Codec.intRange(ehy.e * 2, ehy.d * 2).fieldOf("to_y").forGetter(eju.aa::k),
               eju.d.fieldOf("from_value").forGetter(eju.aa::l),
               eju.d.fieldOf("to_value").forGetter(eju.aa::m)
            )
            .apply($$0, eju.aa::new)
      );
      public static final bbu<eju.aa> a = eju.a(i);

      @Override
      public double a(ejt.b $$0) {
         return bcb.a((double)$$0.b(), (double)this.e, (double)this.f, this.g, this.h);
      }

      @Override
      public double a() {
         return Math.min(this.g, this.h);
      }

      @Override
      public double b() {
         return Math.max(this.g, this.h);
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }

      public int j() {
         return this.e;
      }

      public int k() {
         return this.f;
      }

      public double l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }
   }

   protected static enum b implements eju.c {
      a;

      @Override
      public double a(ejt.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }
   }

   public interface c extends ejt.d {
      bbu<ejt> e = bbu.a(MapCodec.unit(eju.b.a));

      @Override
      default bbu<? extends ejt> c() {
         return e;
      }
   }

   protected static enum d implements ejt.d {
      a;

      public static final bbu<ejt> e = bbu.a(MapCodec.unit(a));

      @Override
      public double a(ejt.b $$0) {
         return 1.0;
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         Arrays.fill($$0, 1.0);
      }

      @Override
      public double a() {
         return 1.0;
      }

      @Override
      public double b() {
         return 1.0;
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }
   }

   record e(ejt a) implements eju.x {
      static final bbu<eju.e> e = eju.a(eju.e::new, eju.e::j);

      @Override
      public double a(ejt.b $$0, double $$1) {
         return $$0.d().a($$0, $$1);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.e(this.a.a($$0)));
      }

      @Override
      public double a() {
         return Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return Double.POSITIVE_INFINITY;
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      @Override
      public ejt j() {
         return this.a;
      }
   }

   protected static enum f implements ejt.d {
      a;

      public static final bbu<ejt> e = bbu.a(MapCodec.unit(a));

      @Override
      public double a(ejt.b $$0) {
         return 0.0;
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         Arrays.fill($$0, 0.0);
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return 0.0;
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }
   }

   protected record g(ejt e, double f, double g) implements eju.p {
      private static final MapCodec<eju.g> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ejt.b.fieldOf("input").forGetter(eju.g::aD_), eju.d.fieldOf("min").forGetter(eju.g::a), eju.d.fieldOf("max").forGetter(eju.g::b))
            .apply($$0, eju.g::new)
      );
      public static final bbu<eju.g> a = eju.a(h);

      @Override
      public double a(double $$0) {
         return bcb.a($$0, this.f, this.g);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return new eju.g(this.e.a($$0), this.f, this.g);
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }

      @Override
      public ejt aD_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }
   }

   record h(double a) implements ejt.d {
      static final bbu<eju.h> e = eju.a(eju.d, eju.h::new, eju.h::j);
      static final eju.h f = new eju.h(0.0);

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         Arrays.fill($$0, this.a);
      }

      @Override
      public double b() {
         return this.a;
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      public double j() {
         return this.a;
      }
   }

   protected static final class i implements ejt.d {
      public static final bbu<eju.i> a = bbu.a(MapCodec.unit(new eju.i(0L)));
      private static final float e = -0.9F;
      private final ezr f;

      public i(long $$0) {
         bck $$1 = new ekb($$0);
         $$1.b(17292);
         this.f = new ezr($$1);
      }

      private static float a(ezr $$0, int $$1, int $$2) {
         int $$3 = $$1 / 2;
         int $$4 = $$2 / 2;
         int $$5 = $$1 % 2;
         int $$6 = $$2 % 2;
         float $$7 = 100.0F - bcb.c((float)($$1 * $$1 + $$2 * $$2)) * 8.0F;
         $$7 = bcb.a($$7, -100.0F, 80.0F);

         for (int $$8 = -12; $$8 <= 12; $$8++) {
            for (int $$9 = -12; $$9 <= 12; $$9++) {
               long $$10 = $$3 + $$8;
               long $$11 = $$4 + $$9;
               if ($$10 * $$10 + $$11 * $$11 > 4096L && $$0.a($$10, $$11) < -0.9F) {
                  float $$12 = (bcb.e((float)$$10) * 3439.0F + bcb.e((float)$$11) * 147.0F) % 13.0F + 9.0F;
                  float $$13 = $$5 - $$8 * 2;
                  float $$14 = $$6 - $$9 * 2;
                  float $$15 = 100.0F - bcb.c($$13 * $$13 + $$14 * $$14) * $$12;
                  $$15 = bcb.a($$15, -100.0F, 80.0F);
                  $$7 = Math.max($$7, $$15);
               }
            }
         }

         return $$7;
      }

      @Override
      public double a(ejt.b $$0) {
         return (a(this.f, $$0.a() / 8, $$0.c() / 8) - 8.0) / 128.0;
      }

      @Override
      public double a() {
         return -0.84375;
      }

      @Override
      public double b() {
         return 0.5625;
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }
   }

   @bdl
   public record j(jl<ejt> a) implements ejt {
      @Override
      public double a(ejt.b $$0) {
         return this.a.a().a($$0);
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         this.a.a().a($$0, $$1);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.j(new jl.a<>(this.a.a().a($$0))));
      }

      @Override
      public double a() {
         return this.a.b() ? this.a.a().a() : Double.NEGATIVE_INFINITY;
      }

      @Override
      public double b() {
         return this.a.b() ? this.a.a().b() : Double.POSITIVE_INFINITY;
      }

      @Override
      public bbu<? extends ejt> c() {
         throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
      }

      public jl<ejt> j() {
         return this.a;
      }
   }

   protected record k(eju.k.a a, ejt e, double f, double g) implements eju.p {
      public static eju.k a(eju.k.a $$0, ejt $$1) {
         double $$2 = $$1.a();
         double $$3 = a($$0, $$2);
         double $$4 = a($$0, $$1.b());
         return $$0 != eju.k.a.a && $$0 != eju.k.a.b ? new eju.k($$0, $$1, $$3, $$4) : new eju.k($$0, $$1, Math.max(0.0, $$2), Math.max($$3, $$4));
      }

      private static double a(eju.k.a $$0, double $$1) {
         return switch ($$0) {
            case a -> Math.abs($$1);
            case b -> $$1 * $$1;
            case c -> $$1 * $$1 * $$1;
            case d -> $$1 > 0.0 ? $$1 : $$1 * 0.5;
            case e -> $$1 > 0.0 ? $$1 : $$1 * 0.25;
            case f -> {
               double $$2 = bcb.a($$1, -1.0, 1.0);
               yield $$2 / 2.0 - $$2 * $$2 * $$2 / 24.0;
            }
         };
      }

      @Override
      public double a(double $$0) {
         return a(this.a, $$0);
      }

      public eju.k b(ejt.f $$0) {
         return a(this.a, this.e.a($$0));
      }

      @Override
      public bbu<? extends ejt> c() {
         return this.a.h;
      }

      public eju.k.a k() {
         return this.a;
      }

      @Override
      public ejt aD_() {
         return this.e;
      }

      @Override
      public double a() {
         return this.f;
      }

      @Override
      public double b() {
         return this.g;
      }

      static enum a implements bda {
         a("abs"),
         b("square"),
         c("cube"),
         d("half_negative"),
         e("quarter_negative"),
         f("squeeze");

         private final String g;
         final bbu<eju.k> h = eju.a($$0x -> eju.k.a(this, $$0x), eju.k::aD_);

         private a(final String $$0) {
            this.g = $$0;
         }

         @Override
         public String c() {
            return this.g;
         }
      }
   }

   protected record l(eju.l.a a, ejt e) implements eju.m {
      @Override
      public double a(ejt.b $$0) {
         return this.e.a($$0);
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         this.e.a($$0, $$1);
      }

      @Override
      public double a() {
         return this.e.a();
      }

      @Override
      public double b() {
         return this.e.b();
      }

      @Override
      public eju.l.a j() {
         return this.a;
      }

      @Override
      public ejt k() {
         return this.e;
      }

      static enum a implements bda {
         a("interpolated"),
         b("flat_cache"),
         c("cache_2d"),
         d("cache_once"),
         e("cache_all_in_cell");

         private final String f;
         final bbu<eju.m> g = eju.a($$0x -> new eju.l(this, $$0x), eju.m::k);

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   public interface m extends ejt {
      eju.l.a j();

      ejt k();

      @Override
      default bbu<? extends ejt> c() {
         return this.j().g;
      }

      @Override
      default ejt a(ejt.f $$0) {
         return $$0.apply(new eju.l(this.j(), this.k().a($$0)));
      }
   }

   record n(eju.n.a e, ejt f, double g, double h, double i) implements eju.p, eju.y {
      @Override
      public eju.y.a j() {
         return this.e == eju.n.a.a ? eju.y.a.b : eju.y.a.a;
      }

      @Override
      public ejt k() {
         return eju.a(this.i);
      }

      @Override
      public ejt l() {
         return this.f;
      }

      @Override
      public double a(double $$0) {
         return switch (this.e) {
            case a -> $$0 * this.i;
            case b -> $$0 + this.i;
         };
      }

      @Override
      public ejt a(ejt.f $$0) {
         ejt $$1 = this.f.a($$0);
         double $$2 = $$1.a();
         double $$3 = $$1.b();
         double $$4;
         double $$5;
         if (this.e == eju.n.a.b) {
            $$4 = $$2 + this.i;
            $$5 = $$3 + this.i;
         } else if (this.i >= 0.0) {
            $$4 = $$2 * this.i;
            $$5 = $$3 * this.i;
         } else {
            $$4 = $$3 * this.i;
            $$5 = $$2 * this.i;
         }

         return new eju.n(this.e, $$1, $$4, $$5, this.i);
      }

      public eju.n.a m() {
         return this.e;
      }

      @Override
      public ejt aD_() {
         return this.f;
      }

      @Override
      public double a() {
         return this.g;
      }

      @Override
      public double b() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      static enum a {
         a,
         b;
      }
   }

   protected record o(ejt.c f, @Deprecated double g, double h) implements ejt {
      public static final MapCodec<eju.o> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ejt.c.a.fieldOf("noise").forGetter(eju.o::j),
               Codec.DOUBLE.fieldOf("xz_scale").forGetter(eju.o::k),
               Codec.DOUBLE.fieldOf("y_scale").forGetter(eju.o::l)
            )
            .apply($$0, eju.o::new)
      );
      public static final bbu<eju.o> e = eju.a(a);

      @Override
      public double a(ejt.b $$0) {
         return this.f.a($$0.a() * this.g, $$0.b() * this.h, $$0.c() * this.g);
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.o($$0.a(this.f), this.g, this.h));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.f.a();
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      public ejt.c j() {
         return this.f;
      }

      @Deprecated
      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }
   }

   interface p extends ejt {
      ejt aD_();

      @Override
      default double a(ejt.b $$0) {
         return this.a(this.aD_().a($$0));
      }

      @Override
      default void a(double[] $$0, ejt.a $$1) {
         this.aD_().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$0[$$2]);
         }
      }

      double a(double var1);
   }

   record q(ejt f, double g, double h, ejt i, ejt j) implements ejt {
      public static final MapCodec<eju.q> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ejt.d.fieldOf("input").forGetter(eju.q::j),
               eju.d.fieldOf("min_inclusive").forGetter(eju.q::k),
               eju.d.fieldOf("max_exclusive").forGetter(eju.q::l),
               ejt.d.fieldOf("when_in_range").forGetter(eju.q::m),
               ejt.d.fieldOf("when_out_of_range").forGetter(eju.q::n)
            )
            .apply($$0, eju.q::new)
      );
      public static final bbu<eju.q> e = eju.a(a);

      @Override
      public double a(ejt.b $$0) {
         double $$1 = this.f.a($$0);
         return $$1 >= this.g && $$1 < this.h ? this.i.a($$0) : this.j.a($$0);
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         this.f.a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            double $$3 = $$0[$$2];
            if ($$3 >= this.g && $$3 < this.h) {
               $$0[$$2] = this.i.a($$1.a($$2));
            } else {
               $$0[$$2] = this.j.a($$1.a($$2));
            }
         }
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.q(this.f.a($$0), this.g, this.h, this.i.a($$0), this.j.a($$0)));
      }

      @Override
      public double a() {
         return Math.min(this.i.a(), this.j.a());
      }

      @Override
      public double b() {
         return Math.max(this.i.b(), this.j.b());
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      public ejt j() {
         return this.f;
      }

      public double k() {
         return this.g;
      }

      public double l() {
         return this.h;
      }

      public ejt m() {
         return this.i;
      }

      public ejt n() {
         return this.j;
      }
   }

   protected record r(ejt.c a) implements eju.u {
      static final bbu<eju.r> e = eju.a(ejt.c.a, eju.r::new, eju.r::j);

      @Override
      public double a(ejt.b $$0) {
         return this.a($$0.a(), $$0.b(), $$0.c());
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.r($$0.a(this.a)));
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      @Override
      public ejt.c j() {
         return this.a;
      }
   }

   protected record s(ejt.c a) implements eju.u {
      static final bbu<eju.s> e = eju.a(ejt.c.a, eju.s::new, eju.s::j);

      @Override
      public double a(ejt.b $$0) {
         return this.a($$0.a(), 0.0, $$0.c());
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.s($$0.a(this.a)));
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      @Override
      public ejt.c j() {
         return this.a;
      }
   }

   protected record t(ejt.c a) implements eju.u {
      static final bbu<eju.t> e = eju.a(ejt.c.a, eju.t::new, eju.t::j);

      @Override
      public double a(ejt.b $$0) {
         return this.a($$0.c(), $$0.a(), 0.0);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.t($$0.a(this.a)));
      }

      @Override
      public bbu<? extends ejt> c() {
         return e;
      }

      @Override
      public ejt.c j() {
         return this.a;
      }
   }

   interface u extends ejt {
      ejt.c j();

      @Override
      default double a() {
         return -this.b();
      }

      @Override
      default double b() {
         return this.j().a() * 4.0;
      }

      default double a(double $$0, double $$1, double $$2) {
         return this.j().a($$0 * 0.25, $$1 * 0.25, $$2 * 0.25) * 4.0;
      }

      @Override
      default void a(double[] $$0, ejt.a $$1) {
         $$1.a($$0, this);
      }
   }

   protected record v(ejt e, ejt f, ejt g, double h, double i, ejt.c j) implements ejt {
      private static final MapCodec<eju.v> k = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ejt.d.fieldOf("shift_x").forGetter(eju.v::j),
               ejt.d.fieldOf("shift_y").forGetter(eju.v::k),
               ejt.d.fieldOf("shift_z").forGetter(eju.v::l),
               Codec.DOUBLE.fieldOf("xz_scale").forGetter(eju.v::m),
               Codec.DOUBLE.fieldOf("y_scale").forGetter(eju.v::n),
               ejt.c.a.fieldOf("noise").forGetter(eju.v::o)
            )
            .apply($$0, eju.v::new)
      );
      public static final bbu<eju.v> a = eju.a(k);

      @Override
      public double a(ejt.b $$0) {
         double $$1 = $$0.a() * this.h + this.e.a($$0);
         double $$2 = $$0.b() * this.i + this.f.a($$0);
         double $$3 = $$0.c() * this.h + this.g.a($$0);
         return this.j.a($$1, $$2, $$3);
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.v(this.e.a($$0), this.f.a($$0), this.g.a($$0), this.h, this.i, $$0.a(this.j)));
      }

      @Override
      public double a() {
         return -this.b();
      }

      @Override
      public double b() {
         return this.j.a();
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }

      public ejt j() {
         return this.e;
      }

      public ejt k() {
         return this.f;
      }

      public ejt l() {
         return this.g;
      }

      public double m() {
         return this.h;
      }

      public double n() {
         return this.i;
      }

      public ejt.c o() {
         return this.j;
      }
   }

   public record w(bbb<eju.w.b, eju.w.a> e) implements ejt {
      private static final Codec<bbb<eju.w.b, eju.w.a>> f = bbb.a(eju.w.a.b);
      private static final MapCodec<eju.w> g = f.fieldOf("spline").xmap(eju.w::new, eju.w::j);
      public static final bbu<eju.w> a = eju.a(g);

      @Override
      public double a(ejt.b $$0) {
         return this.e.a(new eju.w.b($$0));
      }

      @Override
      public double a() {
         return this.e.b();
      }

      @Override
      public double b() {
         return this.e.c();
      }

      @Override
      public void a(double[] $$0, ejt.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.w(this.e.a((bbb.d<eju.w.a>)($$1 -> $$1.a($$0)))));
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }

      public bbb<eju.w.b, eju.w.a> j() {
         return this.e;
      }

      public record a(jl<ejt> c) implements bdh<eju.w.b> {
         public static final Codec<eju.w.a> b = ejt.c.xmap(eju.w.a::new, eju.w.a::a);

         @Override
         public String toString() {
            Optional<amd<ejt>> $$0 = this.c.e();
            if ($$0.isPresent()) {
               amd<ejt> $$1 = $$0.get();
               if ($$1 == ekh.d) {
                  return "continents";
               }

               if ($$1 == ekh.e) {
                  return "erosion";
               }

               if ($$1 == ekh.f) {
                  return "weirdness";
               }

               if ($$1 == ekh.g) {
                  return "ridges";
               }
            }

            return "Coordinate[" + this.c + "]";
         }

         public float a(eju.w.b $$0) {
            return (float)this.c.a().a($$0.a());
         }

         @Override
         public float b() {
            return this.c.b() ? (float)this.c.a().a() : Float.NEGATIVE_INFINITY;
         }

         @Override
         public float c() {
            return this.c.b() ? (float)this.c.a().b() : Float.POSITIVE_INFINITY;
         }

         public eju.w.a a(ejt.f $$0) {
            return new eju.w.a(new jl.a<>(this.c.a().a($$0)));
         }

         public jl<ejt> a() {
            return this.c;
         }
      }

      public record b(ejt.b a) {
      }
   }

   interface x extends ejt {
      ejt j();

      @Override
      default double a(ejt.b $$0) {
         return this.a($$0, this.j().a($$0));
      }

      @Override
      default void a(double[] $$0, ejt.a $$1) {
         this.j().a($$0, $$1);

         for (int $$2 = 0; $$2 < $$0.length; $$2++) {
            $$0[$$2] = this.a($$1.a($$2), $$0[$$2]);
         }
      }

      double a(ejt.b var1, double var2);
   }

   interface y extends ejt {
      Logger a = LogUtils.getLogger();

      static eju.y a(eju.y.a $$0, ejt $$1, ejt $$2) {
         double $$3 = $$1.a();
         double $$4 = $$2.a();
         double $$5 = $$1.b();
         double $$6 = $$2.b();
         if ($$0 == eju.y.a.c || $$0 == eju.y.a.d) {
            boolean $$7 = $$3 >= $$6;
            boolean $$8 = $$4 >= $$5;
            if ($$7 || $$8) {
               a.warn("Creating a " + $$0 + " function between two non-overlapping inputs: " + $$1 + " and " + $$2);
            }
         }
         double $$9 = switch ($$0) {
            case a -> $$3 + $$4;
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$3 * $$4 : ($$5 < 0.0 && $$6 < 0.0 ? $$5 * $$6 : Math.min($$3 * $$6, $$5 * $$4));
            case c -> Math.min($$3, $$4);
            case d -> Math.max($$3, $$4);
         };

         double $$10 = switch ($$0) {
            case a -> $$5 + $$6;
            case b -> $$3 > 0.0 && $$4 > 0.0 ? $$5 * $$6 : ($$5 < 0.0 && $$6 < 0.0 ? $$3 * $$4 : Math.max($$3 * $$4, $$5 * $$6));
            case c -> Math.min($$5, $$6);
            case d -> Math.max($$5, $$6);
         };
         if ($$0 == eju.y.a.b || $$0 == eju.y.a.a) {
            if ($$1 instanceof eju.h $$11) {
               return new eju.n($$0 == eju.y.a.a ? eju.n.a.b : eju.n.a.a, $$2, $$9, $$10, $$11.a);
            }

            if ($$2 instanceof eju.h $$12) {
               return new eju.n($$0 == eju.y.a.a ? eju.n.a.b : eju.n.a.a, $$1, $$9, $$10, $$12.a);
            }
         }

         return new eju.a($$0, $$1, $$2, $$9, $$10);
      }

      eju.y.a j();

      ejt k();

      ejt l();

      @Override
      default bbu<? extends ejt> c() {
         return this.j().e;
      }

      public static enum a implements bda {
         a("add"),
         b("mul"),
         c("min"),
         d("max");

         final bbu<eju.y> e = eju.a((BiFunction<ejt, ejt, eju.y>)(($$0x, $$1) -> eju.y.a(this, $$0x, $$1)), eju.y::k, eju.y::l);
         private final String f;

         private a(final String $$0) {
            this.f = $$0;
         }

         @Override
         public String c() {
            return this.f;
         }
      }
   }

   protected record z(ejt e, ejt.c f, eju.z.a g) implements eju.x {
      private static final MapCodec<eju.z> h = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               ejt.d.fieldOf("input").forGetter(eju.z::j),
               ejt.c.a.fieldOf("noise").forGetter(eju.z::k),
               eju.z.a.c.fieldOf("rarity_value_mapper").forGetter(eju.z::l)
            )
            .apply($$0, eju.z::new)
      );
      public static final bbu<eju.z> a = eju.a(h);

      @Override
      public double a(ejt.b $$0, double $$1) {
         double $$2 = this.g.e.get($$1);
         return $$2 * Math.abs(this.f.a($$0.a() / $$2, $$0.b() / $$2, $$0.c() / $$2));
      }

      @Override
      public ejt a(ejt.f $$0) {
         return $$0.apply(new eju.z(this.e.a($$0), $$0.a(this.f), this.g));
      }

      @Override
      public double a() {
         return 0.0;
      }

      @Override
      public double b() {
         return this.g.f * this.f.a();
      }

      @Override
      public bbu<? extends ejt> c() {
         return a;
      }

      @Override
      public ejt j() {
         return this.e;
      }

      public ejt.c k() {
         return this.f;
      }

      public eju.z.a l() {
         return this.g;
      }

      public static enum a implements bda {
         a("type_1", ekh.a::b, 2.0),
         b("type_2", ekh.a::a, 3.0);

         public static final Codec<eju.z.a> c = bda.a(eju.z.a::values);
         private final String d;
         final Double2DoubleFunction e;
         final double f;

         private a(final String $$0, final Double2DoubleFunction $$1, final double $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
         }

         @Override
         public String c() {
            return this.d;
         }
      }
   }
}
