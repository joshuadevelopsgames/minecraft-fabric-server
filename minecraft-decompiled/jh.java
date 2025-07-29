import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public enum jh implements bda {
   a(0, 1, -1, "down", jh.b.b, jh.a.b, new kg(0, -1, 0)),
   b(1, 0, -1, "up", jh.b.a, jh.a.b, new kg(0, 1, 0)),
   c(2, 3, 2, "north", jh.b.b, jh.a.c, new kg(0, 0, -1)),
   d(3, 2, 0, "south", jh.b.a, jh.a.c, new kg(0, 0, 1)),
   e(4, 5, 1, "west", jh.b.b, jh.a.a, new kg(-1, 0, 0)),
   f(5, 4, 3, "east", jh.b.a, jh.a.a, new kg(1, 0, 0));

   public static final bda.a<jh> g = bda.a(jh::values);
   public static final Codec<jh> h = g.validate(jh::b);
   public static final IntFunction<jh> i = baq.a(jh::d, values(), baq.a.b);
   public static final zm<ByteBuf, jh> j = zk.a(i, jh::d);
   @Deprecated
   public static final Codec<jh> k = Codec.BYTE.xmap(jh::a, $$0 -> (byte)$$0.d());
   @Deprecated
   public static final Codec<jh> l = Codec.BYTE.xmap(jh::b, $$0 -> (byte)$$0.e());
   private final int m;
   private final int n;
   private final int o;
   private final String p;
   private final jh.a q;
   private final jh.b r;
   private final kg s;
   private final fis t;
   private final Vector3fc u;
   private static final jh[] v = values();
   private static final jh[] w = Arrays.stream(v).sorted(Comparator.comparingInt($$0 -> $$0.m)).toArray(jh[]::new);
   private static final jh[] x = Arrays.stream(v).filter($$0 -> $$0.o().d()).sorted(Comparator.comparingInt($$0 -> $$0.o)).toArray(jh[]::new);

   private jh(final int $$0, final int $$1, final int $$2, final String $$3, final jh.b $$4, final jh.a $$5, final kg $$6) {
      this.m = $$0;
      this.o = $$2;
      this.n = $$1;
      this.p = $$3;
      this.q = $$5;
      this.r = $$4;
      this.s = $$6;
      this.t = fis.a($$6);
      this.u = new Vector3f($$6.u(), $$6.v(), $$6.w());
   }

   public static jh[] a(bzm $$0) {
      float $$1 = $$0.i(1.0F) * (float) (Math.PI / 180.0);
      float $$2 = -$$0.j(1.0F) * (float) (Math.PI / 180.0);
      float $$3 = bcb.a($$1);
      float $$4 = bcb.b($$1);
      float $$5 = bcb.a($$2);
      float $$6 = bcb.b($$2);
      boolean $$7 = $$5 > 0.0F;
      boolean $$8 = $$3 < 0.0F;
      boolean $$9 = $$6 > 0.0F;
      float $$10 = $$7 ? $$5 : -$$5;
      float $$11 = $$8 ? -$$3 : $$3;
      float $$12 = $$9 ? $$6 : -$$6;
      float $$13 = $$10 * $$4;
      float $$14 = $$12 * $$4;
      jh $$15 = $$7 ? f : e;
      jh $$16 = $$8 ? b : a;
      jh $$17 = $$9 ? d : c;
      if ($$10 > $$12) {
         if ($$11 > $$13) {
            return a($$16, $$15, $$17);
         } else {
            return $$14 > $$11 ? a($$15, $$17, $$16) : a($$15, $$16, $$17);
         }
      } else if ($$11 > $$14) {
         return a($$16, $$17, $$15);
      } else {
         return $$13 > $$11 ? a($$17, $$15, $$16) : a($$17, $$16, $$15);
      }
   }

   private static jh[] a(jh $$0, jh $$1, jh $$2) {
      return new jh[]{$$0, $$1, $$2, $$2.g(), $$1.g(), $$0.g()};
   }

   public static jh a(Matrix4fc $$0, jh $$1) {
      Vector3f $$2 = $$0.transformDirection($$1.u, new Vector3f());
      return a($$2.x(), $$2.y(), $$2.z());
   }

   public static Collection<jh> a(bck $$0) {
      return ag.b(values(), $$0);
   }

   public static Stream<jh> a() {
      return Stream.of(v);
   }

   public static float a(jh $$0) {
      return switch ($$0) {
         case c -> 180.0F;
         case d -> 0.0F;
         case e -> 90.0F;
         case f -> -90.0F;
         default -> throw new IllegalStateException("No y-Rot for vertical axis: " + $$0);
      };
   }

   public Quaternionf b() {
      return switch (this) {
         case a -> new Quaternionf().rotationX((float) Math.PI);
         case b -> new Quaternionf();
         case c -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) Math.PI);
         case d -> new Quaternionf().rotationX((float) (Math.PI / 2));
         case e -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2));
         case f -> new Quaternionf().rotationXYZ((float) (Math.PI / 2), 0.0F, (float) (-Math.PI / 2));
      };
   }

   public int d() {
      return this.m;
   }

   public int e() {
      return this.o;
   }

   public jh.b f() {
      return this.r;
   }

   public static jh a(bzm $$0, jh.a $$1) {
      return switch ($$1) {
         case a -> f.a($$0.j(1.0F)) ? f : e;
         case b -> $$0.i(1.0F) < 0.0F ? b : a;
         case c -> d.a($$0.j(1.0F)) ? d : c;
      };
   }

   public jh g() {
      return a(this.n);
   }

   public jh a(jh.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.t() : this;
         case b -> this != b && this != a ? this.h() : this;
         case c -> this != c && this != d ? this.v() : this;
      };
   }

   public jh b(jh.a $$0) {
      return switch ($$0) {
         case a -> this != e && this != f ? this.u() : this;
         case b -> this != b && this != a ? this.i() : this;
         case c -> this != c && this != d ? this.w() : this;
      };
   }

   public jh h() {
      return switch (this) {
         case c -> f;
         case d -> e;
         case e -> c;
         case f -> d;
         default -> throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      };
   }

   private jh t() {
      return switch (this) {
         case a -> d;
         case b -> c;
         case c -> a;
         case d -> b;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jh u() {
      return switch (this) {
         case a -> c;
         case b -> d;
         case c -> b;
         case d -> a;
         default -> throw new IllegalStateException("Unable to get X-rotated facing of " + this);
      };
   }

   private jh v() {
      return switch (this) {
         case a -> e;
         case b -> f;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> b;
         case f -> a;
      };
   }

   private jh w() {
      return switch (this) {
         case a -> f;
         case b -> e;
         default -> throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
         case e -> a;
         case f -> b;
      };
   }

   public jh i() {
      return switch (this) {
         case c -> e;
         case d -> f;
         case e -> d;
         case f -> c;
         default -> throw new IllegalStateException("Unable to get CCW facing of " + this);
      };
   }

   public int j() {
      return this.s.u();
   }

   public int k() {
      return this.s.v();
   }

   public int l() {
      return this.s.w();
   }

   public Vector3f m() {
      return new Vector3f(this.u);
   }

   public String n() {
      return this.p;
   }

   public jh.a o() {
      return this.q;
   }

   @Nullable
   public static jh a(@Nullable String $$0) {
      return g.a($$0);
   }

   public static jh a(int $$0) {
      return w[bcb.a($$0 % w.length)];
   }

   public static jh b(int $$0) {
      return x[bcb.a($$0 % x.length)];
   }

   public static jh a(double $$0) {
      return b(bcb.a($$0 / 90.0 + 0.5) & 3);
   }

   public static jh a(jh.a $$0, jh.b $$1) {
      return switch ($$0) {
         case a -> $$1 == jh.b.a ? f : e;
         case b -> $$1 == jh.b.a ? b : a;
         case c -> $$1 == jh.b.a ? d : c;
      };
   }

   public float p() {
      return (this.o & 3) * 90;
   }

   public static jh b(bck $$0) {
      return ag.a(v, $$0);
   }

   public static jh a(double $$0, double $$1, double $$2) {
      return a((float)$$0, (float)$$1, (float)$$2);
   }

   public static jh a(float $$0, float $$1, float $$2) {
      jh $$3 = c;
      float $$4 = Float.MIN_VALUE;

      for (jh $$5 : v) {
         float $$6 = $$0 * $$5.s.u() + $$1 * $$5.s.v() + $$2 * $$5.s.w();
         if ($$6 > $$4) {
            $$4 = $$6;
            $$3 = $$5;
         }
      }

      return $$3;
   }

   public static jh a(fis $$0) {
      return a($$0.d, $$0.e, $$0.f);
   }

   @Nullable
   @Contract("_,_,_,!null->!null;_,_,_,_->_")
   public static jh a(int $$0, int $$1, int $$2, @Nullable jh $$3) {
      int $$4 = Math.abs($$0);
      int $$5 = Math.abs($$1);
      int $$6 = Math.abs($$2);
      if ($$4 > $$6 && $$4 > $$5) {
         return $$0 < 0 ? e : f;
      } else if ($$6 > $$4 && $$6 > $$5) {
         return $$2 < 0 ? c : d;
      } else if ($$5 > $$4 && $$5 > $$6) {
         return $$1 < 0 ? a : b;
      } else {
         return $$3;
      }
   }

   @Nullable
   @Contract("_,!null->!null;_,_->_")
   public static jh a(kg $$0, @Nullable jh $$1) {
      return a($$0.u(), $$0.v(), $$0.w(), $$1);
   }

   @Override
   public String toString() {
      return this.p;
   }

   @Override
   public String c() {
      return this.p;
   }

   private static DataResult<jh> b(jh $$0) {
      return $$0.o().b() ? DataResult.success($$0) : DataResult.error(() -> "Expected a vertical direction");
   }

   public static jh a(jh.b $$0, jh.a $$1) {
      for (jh $$2 : v) {
         if ($$2.f() == $$0 && $$2.o() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("No such direction: " + $$0 + " " + $$1);
   }

   public kg q() {
      return this.s;
   }

   public fis r() {
      return this.t;
   }

   public Vector3fc s() {
      return this.u;
   }

   public boolean a(float $$0) {
      float $$1 = $$0 * (float) (Math.PI / 180.0);
      float $$2 = -bcb.a($$1);
      float $$3 = bcb.b($$1);
      return this.s.u() * $$2 + this.s.w() * $$3 > 0.0F;
   }

   public static enum a implements bda, Predicate<jh> {
      a("x") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$0;
         }

         @Override
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$0;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$0;
         }

         @Override
         public jh e() {
            return jh.f;
         }

         @Override
         public jh f() {
            return jh.e;
         }
      },
      b("y") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$1;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$1;
         }

         @Override
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$1;
         }

         @Override
         public jh e() {
            return jh.b;
         }

         @Override
         public jh f() {
            return jh.a;
         }
      },
      c("z") {
         @Override
         public int a(int $$0, int $$1, int $$2) {
            return $$2;
         }

         @Override
         public double a(double $$0, double $$1, double $$2) {
            return $$2;
         }

         @Override
         public boolean a(boolean $$0, boolean $$1, boolean $$2) {
            return $$2;
         }

         @Override
         public jh e() {
            return jh.d;
         }

         @Override
         public jh f() {
            return jh.c;
         }
      };

      public static final jh.a[] d = values();
      public static final bda.a<jh.a> e = bda.a(jh.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Nullable
      public static jh.a a(String $$0) {
         return e.a($$0);
      }

      public String a() {
         return this.f;
      }

      public boolean b() {
         return this == b;
      }

      public boolean d() {
         return this == a || this == c;
      }

      public abstract jh e();

      public abstract jh f();

      public jh[] g() {
         return new jh[]{this.e(), this.f()};
      }

      @Override
      public String toString() {
         return this.f;
      }

      public static jh.a a(bck $$0) {
         return ag.a(d, $$0);
      }

      public boolean a(@Nullable jh $$0) {
         return $$0 != null && $$0.o() == this;
      }

      public jh.c h() {
         return switch (this) {
            case a, c -> jh.c.a;
            case b -> jh.c.b;
         };
      }

      @Override
      public String c() {
         return this.f;
      }

      public abstract int a(int var1, int var2, int var3);

      public abstract double a(double var1, double var3, double var5);

      public abstract boolean a(boolean var1, boolean var2, boolean var3);
   }

   public static enum b {
      a(1, "Towards positive"),
      b(-1, "Towards negative");

      private final int c;
      private final String d;

      private b(final int $$0, final String $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public int a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }

      @Override
      public String toString() {
         return this.d;
      }

      public jh.b c() {
         return this == a ? b : a;
      }
   }

   public static enum c implements Iterable<jh>, Predicate<jh> {
      a(new jh[]{jh.c, jh.f, jh.d, jh.e}, new jh.a[]{jh.a.a, jh.a.c}),
      b(new jh[]{jh.b, jh.a}, new jh.a[]{jh.a.b});

      private final jh[] c;
      private final jh.a[] d;

      private c(final jh[] $$0, final jh.a[] $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public jh a(bck $$0) {
         return ag.a(this.c, $$0);
      }

      public jh.a b(bck $$0) {
         return ag.a(this.d, $$0);
      }

      public boolean a(@Nullable jh $$0) {
         return $$0 != null && $$0.o().h() == this;
      }

      @Override
      public Iterator<jh> iterator() {
         return Iterators.forArray(this.c);
      }

      public Stream<jh> a() {
         return Arrays.stream(this.c);
      }

      public List<jh> c(bck $$0) {
         return ag.b(this.c, $$0);
      }

      public int b() {
         return this.c.length;
      }
   }
}
