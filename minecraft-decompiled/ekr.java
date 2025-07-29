import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ekr {
   public static final ekr.f a = a(0, false, ets.b);
   public static final ekr.f b = a(0, true, ets.b);
   public static final ekr.f c = a(0, true, 6, ets.b);
   public static final ekr.f d = a(0, true, 30, ets.b);
   public static final ekr.f e = a(0, false, ets.a);
   public static final ekr.f f = a(0, true, ets.a);

   public static ekr.f a(int $$0, boolean $$1, ets $$2) {
      return new ekr.t($$0, $$1, 0, $$2);
   }

   public static ekr.f a(int $$0, boolean $$1, int $$2, ets $$3) {
      return new ekr.t($$0, $$1, $$2, $$3);
   }

   public static ekr.f a(ekr.f $$0) {
      return new ekr.n($$0);
   }

   public static ekr.f a(eku $$0, int $$1) {
      return new ekr.aa($$0, $$1, false);
   }

   public static ekr.f b(eku $$0, int $$1) {
      return new ekr.aa($$0, $$1, true);
   }

   public static ekr.f a(int $$0, int $$1) {
      return new ekr.z($$0, $$1, false);
   }

   public static ekr.f b(int $$0, int $$1) {
      return new ekr.z($$0, $$1, true);
   }

   @SafeVarargs
   public static ekr.f a(amd<dnx>... $$0) {
      return a(List.of($$0));
   }

   private static ekr.c a(List<amd<dnx>> $$0) {
      return new ekr.c($$0);
   }

   public static ekr.f a(amd<ezo.a> $$0, double $$1) {
      return a($$0, $$1, Double.MAX_VALUE);
   }

   public static ekr.f a(amd<ezo.a> $$0, double $$1, double $$2) {
      return new ekr.l($$0, $$1, $$2);
   }

   public static ekr.f a(String $$0, eku $$1, eku $$2) {
      return new ekr.y(ame.a($$0), $$1, $$2);
   }

   public static ekr.f a() {
      return ekr.s.a;
   }

   public static ekr.f b() {
      return ekr.h.a;
   }

   public static ekr.f c() {
      return ekr.a.a;
   }

   public static ekr.f d() {
      return ekr.v.a;
   }

   public static ekr.o a(ekr.f $$0, ekr.o $$1) {
      return new ekr.x($$0, $$1);
   }

   public static ekr.o a(ekr.o... $$0) {
      if ($$0.length == 0) {
         throw new IllegalArgumentException("Need at least 1 rule for a sequence");
      } else {
         return new ekr.q(Arrays.asList($$0));
      }
   }

   public static ekr.o a(eeb $$0) {
      return new ekr.d($$0);
   }

   public static ekr.o e() {
      return ekr.b.a;
   }

   static <A> MapCodec<? extends A> a(jy<MapCodec<? extends A>> $$0, String $$1, bbu<? extends A> $$2) {
      return jy.a($$0, $$1, $$2.a());
   }

   static enum a implements ekr.f {
      a;

      static final bbu<ekr.a> c = bbu.a(MapCodec.unit(a));

      @Override
      public bbu<? extends ekr.f> a() {
         return c;
      }

      public ekr.e a(ekr.g $$0) {
         return $$0.i;
      }
   }

   record aa(eku a, int c, boolean d) implements ekr.f {
      static final bbu<ekr.aa> e = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  eku.a.fieldOf("anchor").forGetter(ekr.aa::b),
                  Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ekr.aa::c),
                  Codec.BOOL.fieldOf("add_stone_depth").forGetter(ekr.aa::d)
               )
               .apply($$0, ekr.aa::new)
         )
      );

      @Override
      public bbu<? extends ekr.f> a() {
         return e;
      }

      public ekr.e a(final ekr.g $$0) {
         class a extends ekr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.B + (aa.this.d ? this.c.E : 0) >= aa.this.a.a(this.c.n) + this.c.t * aa.this.c;
            }
         }

         return new a();
      }

      public eku b() {
         return this.a;
      }
   }

   static enum b implements ekr.o {
      a;

      static final bbu<ekr.b> c = bbu.a(MapCodec.unit(a));

      @Override
      public bbu<? extends ekr.o> a() {
         return c;
      }

      public ekr.u a(ekr.g $$0) {
         return $$0.e::a;
      }
   }

   static final class c implements ekr.f {
      static final bbu<ekr.c> a = bbu.a(amd.a(mn.aK).listOf().fieldOf("biome_is").xmap(ekr::a, $$0 -> $$0.c));
      private final List<amd<dnx>> c;
      final Predicate<amd<dnx>> d;

      c(List<amd<dnx>> $$0) {
         this.c = $$0;
         this.d = Set.copyOf($$0)::contains;
      }

      @Override
      public bbu<? extends ekr.f> a() {
         return a;
      }

      public ekr.e a(final ekr.g $$0) {
         class a extends ekr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.A.get().a(c.this.d);
            }
         }

         return new a();
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof ekr.c $$1 ? this.c.equals($$1.c) : false;
         }
      }

      @Override
      public int hashCode() {
         return this.c.hashCode();
      }

      @Override
      public String toString() {
         return "BiomeConditionSource[biomes=" + this.c + "]";
      }
   }

   record d(eeb a, ekr.r c) implements ekr.o {
      static final bbu<ekr.d> d = bbu.a(eeb.a.xmap(ekr.d::new, ekr.d::b).fieldOf("result_state"));

      d(eeb $$0) {
         this($$0, new ekr.r($$0));
      }

      @Override
      public bbu<? extends ekr.o> a() {
         return d;
      }

      public ekr.u a(ekr.g $$0) {
         return this.c;
      }

      public eeb b() {
         return this.a;
      }
   }

   interface e {
      boolean b();
   }

   public interface f extends Function<ekr.g, ekr.e> {
      Codec<ekr.f> b = mm.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ekr.f> a(jy<MapCodec<? extends ekr.f>> $$0) {
         ekr.a($$0, "biome", ekr.c.a);
         ekr.a($$0, "noise_threshold", ekr.l.e);
         ekr.a($$0, "vertical_gradient", ekr.y.e);
         ekr.a($$0, "y_above", ekr.aa.e);
         ekr.a($$0, "water", ekr.z.e);
         ekr.a($$0, "temperature", ekr.v.c);
         ekr.a($$0, "steep", ekr.s.c);
         ekr.a($$0, "not", ekr.n.c);
         ekr.a($$0, "hole", ekr.h.c);
         ekr.a($$0, "above_preliminary_surface", ekr.a.c);
         return ekr.a($$0, "stone_depth", ekr.t.f);
      }

      bbu<? extends ekr.f> a();
   }

   protected static final class g {
      private static final int a = 8;
      private static final int b = 4;
      private static final int c = 16;
      private static final int d = 15;
      final eks e;
      final ekr.e f = new ekr.g.d(this);
      final ekr.e g = new ekr.g.c(this);
      final ekr.e h = new ekr.g.b(this);
      final ekr.e i = new ekr.g.a();
      final eko j;
      final efy k;
      private final eke l;
      private final Function<jb, jl<dnx>> m;
      final ekx n;
      private long o = Long.MAX_VALUE;
      private final int[] p = new int[4];
      long q = -9223372036854775807L;
      int r;
      int s;
      int t;
      private long u = this.q - 1L;
      private double v;
      private long w = this.q - 1L;
      private int x;
      long y = -9223372036854775807L;
      final jb.a z = new jb.a();
      Supplier<jl<dnx>> A;
      int B;
      int C;
      int D;
      int E;

      protected g(eks $$0, eko $$1, efy $$2, eke $$3, Function<jb, jl<dnx>> $$4, jy<dnx> $$5, ekx $$6) {
         this.e = $$0;
         this.j = $$1;
         this.k = $$2;
         this.l = $$3;
         this.m = $$4;
         this.n = $$6;
      }

      protected void a(int $$0, int $$1) {
         this.q++;
         this.y++;
         this.r = $$0;
         this.s = $$1;
         this.t = this.e.a($$0, $$1);
      }

      protected void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
         this.y++;
         this.A = Suppliers.memoize(() -> this.m.apply(this.z.d($$3, $$4, $$5)));
         this.B = $$4;
         this.C = $$2;
         this.D = $$1;
         this.E = $$0;
      }

      protected double a() {
         if (this.u != this.q) {
            this.u = this.q;
            this.v = this.e.b(this.r, this.s);
         }

         return this.v;
      }

      public int b() {
         return this.e.a();
      }

      private static int a(int $$0) {
         return $$0 >> 4;
      }

      private static int b(int $$0) {
         return $$0 << 4;
      }

      protected int c() {
         if (this.w != this.q) {
            this.w = this.q;
            int $$0 = a(this.r);
            int $$1 = a(this.s);
            long $$2 = dlz.c($$0, $$1);
            if (this.o != $$2) {
               this.o = $$2;
               this.p[0] = this.l.a(b($$0), b($$1));
               this.p[1] = this.l.a(b($$0 + 1), b($$1));
               this.p[2] = this.l.a(b($$0), b($$1 + 1));
               this.p[3] = this.l.a(b($$0 + 1), b($$1 + 1));
            }

            int $$3 = bcb.a(bcb.a((this.r & 15) / 16.0F, (this.s & 15) / 16.0F, this.p[0], this.p[1], this.p[2], this.p[3]));
            this.x = $$3 + this.t - 8;
         }

         return this.x;
      }

      final class a implements ekr.e {
         @Override
         public boolean b() {
            return g.this.B >= g.this.c();
         }
      }

      static final class b extends ekr.j {
         b(ekr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.t <= 0;
         }
      }

      static class c extends ekr.j {
         c(ekr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            int $$0 = this.c.r & 15;
            int $$1 = this.c.s & 15;
            int $$2 = Math.max($$1 - 1, 0);
            int $$3 = Math.min($$1 + 1, 15);
            efy $$4 = this.c.k;
            int $$5 = $$4.a(eka.a.a, $$0, $$2);
            int $$6 = $$4.a(eka.a.a, $$0, $$3);
            if ($$6 >= $$5 + 4) {
               return true;
            } else {
               int $$7 = Math.max($$0 - 1, 0);
               int $$8 = Math.min($$0 + 1, 15);
               int $$9 = $$4.a(eka.a.a, $$7, $$1);
               int $$10 = $$4.a(eka.a.a, $$8, $$1);
               return $$9 >= $$10 + 4;
            }
         }
      }

      static class d extends ekr.k {
         d(ekr.g $$0) {
            super($$0);
         }

         @Override
         protected boolean a() {
            return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
         }
      }
   }

   static enum h implements ekr.f {
      a;

      static final bbu<ekr.h> c = bbu.a(MapCodec.unit(a));

      @Override
      public bbu<? extends ekr.f> a() {
         return c;
      }

      public ekr.e a(ekr.g $$0) {
         return $$0.h;
      }
   }

   abstract static class i implements ekr.e {
      protected final ekr.g c;
      private long a;
      @Nullable
      Boolean d;

      protected i(ekr.g $$0) {
         this.c = $$0;
         this.a = this.c() - 1L;
      }

      @Override
      public boolean b() {
         long $$0 = this.c();
         if ($$0 == this.a) {
            if (this.d == null) {
               throw new IllegalStateException("Update triggered but the result is null");
            } else {
               return this.d;
            }
         } else {
            this.a = $$0;
            this.d = this.a();
            return this.d;
         }
      }

      protected abstract long c();

      protected abstract boolean a();
   }

   abstract static class j extends ekr.i {
      protected j(ekr.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.q;
      }
   }

   abstract static class k extends ekr.i {
      protected k(ekr.g $$0) {
         super($$0);
      }

      @Override
      protected long c() {
         return this.c.y;
      }
   }

   record l(amd<ezo.a> a, double c, double d) implements ekr.f {
      static final bbu<ekr.l> e = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  amd.a(mn.bd).fieldOf("noise").forGetter(ekr.l::b),
                  Codec.DOUBLE.fieldOf("min_threshold").forGetter(ekr.l::c),
                  Codec.DOUBLE.fieldOf("max_threshold").forGetter(ekr.l::d)
               )
               .apply($$0, ekr.l::new)
         )
      );

      @Override
      public bbu<? extends ekr.f> a() {
         return e;
      }

      public ekr.e a(final ekr.g $$0) {
         final ezo $$1 = $$0.j.a(this.a);

         class a extends ekr.j {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               double $$0 = $$1.a(this.c.r, 0.0, this.c.s);
               return $$0 >= l.this.c && $$0 <= l.this.d;
            }
         }

         return new a();
      }

      public amd<ezo.a> b() {
         return this.a;
      }
   }

   record m(ekr.e a) implements ekr.e {
      @Override
      public boolean b() {
         return !this.a.b();
      }
   }

   record n(ekr.f a) implements ekr.f {
      static final bbu<ekr.n> c = bbu.a(ekr.f.b.xmap(ekr.n::new, ekr.n::b).fieldOf("invert"));

      @Override
      public bbu<? extends ekr.f> a() {
         return c;
      }

      public ekr.e a(ekr.g $$0) {
         return new ekr.m(this.a.apply($$0));
      }

      public ekr.f b() {
         return this.a;
      }
   }

   public interface o extends Function<ekr.g, ekr.u> {
      Codec<ekr.o> b = mm.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

      static MapCodec<? extends ekr.o> a(jy<MapCodec<? extends ekr.o>> $$0) {
         ekr.a($$0, "bandlands", ekr.b.c);
         ekr.a($$0, "block", ekr.d.d);
         ekr.a($$0, "sequence", ekr.q.c);
         return ekr.a($$0, "condition", ekr.x.d);
      }

      bbu<? extends ekr.o> a();
   }

   record p(List<ekr.u> a) implements ekr.u {
      @Nullable
      @Override
      public eeb tryApply(int $$0, int $$1, int $$2) {
         for (ekr.u $$3 : this.a) {
            eeb $$4 = $$3.tryApply($$0, $$1, $$2);
            if ($$4 != null) {
               return $$4;
            }
         }

         return null;
      }
   }

   record q(List<ekr.o> a) implements ekr.o {
      static final bbu<ekr.q> c = bbu.a(ekr.o.b.listOf().xmap(ekr.q::new, ekr.q::b).fieldOf("sequence"));

      @Override
      public bbu<? extends ekr.o> a() {
         return c;
      }

      public ekr.u a(ekr.g $$0) {
         if (this.a.size() == 1) {
            return this.a.get(0).apply($$0);
         } else {
            Builder<ekr.u> $$1 = ImmutableList.builder();

            for (ekr.o $$2 : this.a) {
               $$1.add($$2.apply($$0));
            }

            return new ekr.p($$1.build());
         }
      }

      public List<ekr.o> b() {
         return this.a;
      }
   }

   record r(eeb a) implements ekr.u {
      @Override
      public eeb tryApply(int $$0, int $$1, int $$2) {
         return this.a;
      }
   }

   static enum s implements ekr.f {
      a;

      static final bbu<ekr.s> c = bbu.a(MapCodec.unit(a));

      @Override
      public bbu<? extends ekr.f> a() {
         return c;
      }

      public ekr.e a(ekr.g $$0) {
         return $$0.g;
      }
   }

   record t(int a, boolean c, int d, ets e) implements ekr.f {
      static final bbu<ekr.t> f = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  Codec.INT.fieldOf("offset").forGetter(ekr.t::b),
                  Codec.BOOL.fieldOf("add_surface_depth").forGetter(ekr.t::c),
                  Codec.INT.fieldOf("secondary_depth_range").forGetter(ekr.t::d),
                  ets.c.fieldOf("surface_type").forGetter(ekr.t::e)
               )
               .apply($$0, ekr.t::new)
         )
      );

      @Override
      public bbu<? extends ekr.f> a() {
         return f;
      }

      public ekr.e a(final ekr.g $$0) {
         final boolean $$1 = this.e == ets.a;

         class a extends ekr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = $$1 ? this.c.D : this.c.E;
               int $$1 = t.this.c ? this.c.t : 0;
               int $$2 = t.this.d == 0 ? 0 : (int)bcb.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
               return $$0 <= 1 + t.this.a + $$1 + $$2;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }

   protected interface u {
      @Nullable
      eeb tryApply(int var1, int var2, int var3);
   }

   static enum v implements ekr.f {
      a;

      static final bbu<ekr.v> c = bbu.a(MapCodec.unit(a));

      @Override
      public bbu<? extends ekr.f> a() {
         return c;
      }

      public ekr.e a(ekr.g $$0) {
         return $$0.f;
      }
   }

   record w(ekr.e a, ekr.u b) implements ekr.u {
      @Nullable
      @Override
      public eeb tryApply(int $$0, int $$1, int $$2) {
         return !this.a.b() ? null : this.b.tryApply($$0, $$1, $$2);
      }
   }

   record x(ekr.f a, ekr.o c) implements ekr.o {
      static final bbu<ekr.x> d = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(ekr.f.b.fieldOf("if_true").forGetter(ekr.x::b), ekr.o.b.fieldOf("then_run").forGetter(ekr.x::c)).apply($$0, ekr.x::new)
         )
      );

      @Override
      public bbu<? extends ekr.o> a() {
         return d;
      }

      public ekr.u a(ekr.g $$0) {
         return new ekr.w(this.a.apply($$0), this.c.apply($$0));
      }

      public ekr.f b() {
         return this.a;
      }
   }

   record y(ame a, eku c, eku d) implements ekr.f {
      static final bbu<ekr.y> e = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  ame.a.fieldOf("random_name").forGetter(ekr.y::b),
                  eku.a.fieldOf("true_at_and_below").forGetter(ekr.y::c),
                  eku.a.fieldOf("false_at_and_above").forGetter(ekr.y::d)
               )
               .apply($$0, ekr.y::new)
         )
      );

      @Override
      public bbu<? extends ekr.f> a() {
         return e;
      }

      public ekr.e a(final ekr.g $$0) {
         final int $$1 = this.c().a($$0.n);
         final int $$2 = this.d().a($$0.n);
         final ekn $$3 = $$0.j.a(this.b());

         class a extends ekr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               int $$0 = this.c.B;
               if ($$0 <= $$1) {
                  return true;
               } else if ($$0 >= $$2) {
                  return false;
               } else {
                  double $$1 = bcb.b((double)$$0, (double)$$1, (double)$$2, 1.0, 0.0);
                  bck $$2 = $$3.a(this.c.r, $$0, this.c.s);
                  return $$2.i() < $$1;
               }
            }
         }

         return new a();
      }

      public ame b() {
         return this.a;
      }
   }

   record z(int a, int c, boolean d) implements ekr.f {
      static final bbu<ekr.z> e = bbu.a(
         RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  Codec.INT.fieldOf("offset").forGetter(ekr.z::b),
                  Codec.intRange(-20, 20).fieldOf("surface_depth_multiplier").forGetter(ekr.z::c),
                  Codec.BOOL.fieldOf("add_stone_depth").forGetter(ekr.z::d)
               )
               .apply($$0, ekr.z::new)
         )
      );

      @Override
      public bbu<? extends ekr.f> a() {
         return e;
      }

      public ekr.e a(final ekr.g $$0) {
         class a extends ekr.k {
            a() {
               super($$0);
            }

            @Override
            protected boolean a() {
               return this.c.C == Integer.MIN_VALUE || this.c.B + (z.this.d ? this.c.E : 0) >= this.c.C + z.this.a + this.c.t * z.this.c;
            }
         }

         return new a();
      }

      public int b() {
         return this.a;
      }
   }
}
