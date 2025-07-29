import com.google.common.collect.AbstractIterator;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;

@Immutable
public class jb extends kg {
   public static final Codec<jb> a = Codec.INT_STREAM
      .comapFlatMap($$0 -> ag.a($$0, 3).map($$0x -> new jb($$0x[0], $$0x[1], $$0x[2])), $$0 -> IntStream.of($$0.u(), $$0.v(), $$0.w()))
      .stable();
   public static final zm<ByteBuf, jb> b = new zm<ByteBuf, jb>() {
      public jb a(ByteBuf $$0) {
         return wg.c($$0);
      }

      public void a(ByteBuf $$0, jb $$1) {
         wg.a($$0, $$1);
      }
   };
   private static final Logger j = LogUtils.getLogger();
   public static final jb c = new jb(0, 0, 0);
   public static final int d = 1 + bcb.g(bcb.c(30000000));
   public static final int e = 64 - 2 * d;
   private static final long k = (1L << d) - 1L;
   private static final long l = (1L << e) - 1L;
   private static final long m = (1L << d) - 1L;
   private static final int n = 0;
   private static final int o = e;
   private static final int p = e + d;
   public static final int f = (1 << d) / 2 - 1;

   public jb(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public jb(kg $$0) {
      this($$0.u(), $$0.v(), $$0.w());
   }

   public static long a(long $$0, jh $$1) {
      return a($$0, $$1.j(), $$1.k(), $$1.l());
   }

   public static long a(long $$0, int $$1, int $$2, int $$3) {
      return a(a($$0) + $$1, b($$0) + $$2, c($$0) + $$3);
   }

   public static int a(long $$0) {
      return (int)($$0 << 64 - p - d >> 64 - d);
   }

   public static int b(long $$0) {
      return (int)($$0 << 64 - e >> 64 - e);
   }

   public static int c(long $$0) {
      return (int)($$0 << 64 - o - d >> 64 - d);
   }

   public static jb d(long $$0) {
      return new jb(a($$0), b($$0), c($$0));
   }

   public static jb a(double $$0, double $$1, double $$2) {
      return new jb(bcb.a($$0), bcb.a($$1), bcb.a($$2));
   }

   public static jb a(jv $$0) {
      return a($$0.a(), $$0.b(), $$0.c());
   }

   public static jb a(jb $$0, jb $$1) {
      return new jb(Math.min($$0.u(), $$1.u()), Math.min($$0.v(), $$1.v()), Math.min($$0.w(), $$1.w()));
   }

   public static jb b(jb $$0, jb $$1) {
      return new jb(Math.max($$0.u(), $$1.u()), Math.max($$0.v(), $$1.v()), Math.max($$0.w(), $$1.w()));
   }

   public long a() {
      return a(this.u(), this.v(), this.w());
   }

   public static long a(int $$0, int $$1, int $$2) {
      long $$3 = 0L;
      $$3 |= ($$0 & k) << p;
      $$3 |= ($$1 & l) << 0;
      return $$3 | ($$2 & m) << o;
   }

   public static long e(long $$0) {
      return $$0 & -16L;
   }

   public jb b(int $$0, int $$1, int $$2) {
      return $$0 == 0 && $$1 == 0 && $$2 == 0 ? this : new jb(this.u() + $$0, this.v() + $$1, this.w() + $$2);
   }

   public fis b() {
      return fis.b(this);
   }

   public fis c() {
      return fis.c(this);
   }

   public jb a(kg $$0) {
      return this.b($$0.u(), $$0.v(), $$0.w());
   }

   public jb b(kg $$0) {
      return this.b(-$$0.u(), -$$0.v(), -$$0.w());
   }

   public jb a(int $$0) {
      if ($$0 == 1) {
         return this;
      } else {
         return $$0 == 0 ? c : new jb(this.u() * $$0, this.v() * $$0, this.w() * $$0);
      }
   }

   public jb d() {
      return this.a(jh.b);
   }

   public jb b(int $$0) {
      return this.a(jh.b, $$0);
   }

   public jb e() {
      return this.a(jh.a);
   }

   public jb c(int $$0) {
      return this.a(jh.a, $$0);
   }

   public jb f() {
      return this.a(jh.c);
   }

   public jb d(int $$0) {
      return this.a(jh.c, $$0);
   }

   public jb g() {
      return this.a(jh.d);
   }

   public jb e(int $$0) {
      return this.a(jh.d, $$0);
   }

   public jb h() {
      return this.a(jh.e);
   }

   public jb f(int $$0) {
      return this.a(jh.e, $$0);
   }

   public jb i() {
      return this.a(jh.f);
   }

   public jb g(int $$0) {
      return this.a(jh.f, $$0);
   }

   public jb a(jh $$0) {
      return new jb(this.u() + $$0.j(), this.v() + $$0.k(), this.w() + $$0.l());
   }

   public jb a(jh $$0, int $$1) {
      return $$1 == 0 ? this : new jb(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
   }

   public jb a(jh.a $$0, int $$1) {
      if ($$1 == 0) {
         return this;
      } else {
         int $$2 = $$0 == jh.a.a ? $$1 : 0;
         int $$3 = $$0 == jh.a.b ? $$1 : 0;
         int $$4 = $$0 == jh.a.c ? $$1 : 0;
         return new jb(this.u() + $$2, this.v() + $$3, this.w() + $$4);
      }
   }

   public jb a(dwu $$0) {
      switch ($$0) {
         case a:
         default:
            return this;
         case b:
            return new jb(-this.w(), this.v(), this.u());
         case c:
            return new jb(-this.u(), this.v(), -this.w());
         case d:
            return new jb(this.w(), this.v(), -this.u());
      }
   }

   public jb c(kg $$0) {
      return new jb(this.v() * $$0.w() - this.w() * $$0.v(), this.w() * $$0.u() - this.u() * $$0.w(), this.u() * $$0.v() - this.v() * $$0.u());
   }

   public jb h(int $$0) {
      return new jb(this.u(), $$0, this.w());
   }

   public jb j() {
      return this;
   }

   public jb.a k() {
      return new jb.a(this.u(), this.v(), this.w());
   }

   public fis a(fis $$0) {
      return new fis(
         bcb.a($$0.d, (double)(this.u() + 1.0E-5F), this.u() + 1.0 - 1.0E-5F),
         bcb.a($$0.e, (double)(this.v() + 1.0E-5F), this.v() + 1.0 - 1.0E-5F),
         bcb.a($$0.f, (double)(this.w() + 1.0E-5F), this.w() + 1.0 - 1.0E-5F)
      );
   }

   public static Iterable<jb> a(bck $$0, int $$1, jb $$2, int $$3) {
      return a($$0, $$1, $$2.u() - $$3, $$2.v() - $$3, $$2.w() - $$3, $$2.u() + $$3, $$2.v() + $$3, $$2.w() + $$3);
   }

   @Deprecated
   public static Stream<jb> a(jb $$0) {
      return Stream.of($$0, $$0.g(), $$0.i(), $$0.g().i());
   }

   public static Iterable<jb> a(bck $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 - $$3 + 1;
      int $$10 = $$7 - $$4 + 1;
      return () -> new AbstractIterator<jb>() {
         final jb.a a = new jb.a();
         int b = $$1;

         protected jb a() {
            if (this.b <= 0) {
               return (jb)this.endOfData();
            } else {
               jb $$0x = this.a.d($$2 + $$0.a($$8), $$3 + $$0.a($$9), $$4 + $$0.a($$10));
               this.b--;
               return $$0x;
            }
         }
      };
   }

   public static Iterable<jb> a(jb $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 + $$2 + $$3;
      int $$5 = $$0.u();
      int $$6 = $$0.v();
      int $$7 = $$0.w();
      return () -> new AbstractIterator<jb>() {
         private final jb.a h = new jb.a();
         private int i;
         private int j;
         private int k;
         private int l;
         private int m;
         private boolean n;

         protected jb a() {
            if (this.n) {
               this.n = false;
               this.h.r($$7 - (this.h.w() - $$7));
               return this.h;
            } else {
               jb $$0x;
               for ($$0x = null; $$0x == null; this.m++) {
                  if (this.m > this.k) {
                     this.l++;
                     if (this.l > this.j) {
                        this.i++;
                        if (this.i > $$4) {
                           return (jb)this.endOfData();
                        }

                        this.j = Math.min($$1, this.i);
                        this.l = -this.j;
                     }

                     this.k = Math.min($$2, this.i - Math.abs(this.l));
                     this.m = -this.k;
                  }

                  int $$1x = this.l;
                  int $$2x = this.m;
                  int $$3x = this.i - Math.abs($$1x) - Math.abs($$2x);
                  if ($$3x <= $$3) {
                     this.n = $$3x != 0;
                     $$0x = this.h.d($$5 + $$1x, $$6 + $$2x, $$7 + $$3x);
                  }
               }

               return $$0x;
            }
         }
      };
   }

   public static Optional<jb> a(jb $$0, int $$1, int $$2, Predicate<jb> $$3) {
      for (jb $$4 : a($$0, $$1, $$2, $$1)) {
         if ($$3.test($$4)) {
            return Optional.of($$4);
         }
      }

      return Optional.empty();
   }

   public static Stream<jb> b(jb $$0, int $$1, int $$2, int $$3) {
      return StreamSupport.stream(a($$0, $$1, $$2, $$3).spliterator(), false);
   }

   public static Iterable<jb> a(fin $$0) {
      jb $$1 = a($$0.a, $$0.b, $$0.c);
      jb $$2 = a($$0.d, $$0.e, $$0.f);
      return c($$1, $$2);
   }

   public static Iterable<jb> c(jb $$0, jb $$1) {
      return b(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static Stream<jb> d(jb $$0, jb $$1) {
      return StreamSupport.stream(c($$0, $$1).spliterator(), false);
   }

   public static Stream<jb> a(euq $$0) {
      return a(
         Math.min($$0.h(), $$0.k()),
         Math.min($$0.i(), $$0.l()),
         Math.min($$0.j(), $$0.m()),
         Math.max($$0.h(), $$0.k()),
         Math.max($$0.i(), $$0.l()),
         Math.max($$0.j(), $$0.m())
      );
   }

   public static Stream<jb> b(fin $$0) {
      return a(bcb.a($$0.a), bcb.a($$0.b), bcb.a($$0.c), bcb.a($$0.d), bcb.a($$0.e), bcb.a($$0.f));
   }

   public static Stream<jb> a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return StreamSupport.stream(b($$0, $$1, $$2, $$3, $$4, $$5).spliterator(), false);
   }

   public static Iterable<jb> b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$3 - $$0 + 1;
      int $$7 = $$4 - $$1 + 1;
      int $$8 = $$5 - $$2 + 1;
      int $$9 = $$6 * $$7 * $$8;
      return () -> new AbstractIterator<jb>() {
         private final jb.a g = new jb.a();
         private int h;

         protected jb a() {
            if (this.h == $$9) {
               return (jb)this.endOfData();
            } else {
               int $$0x = this.h % $$6;
               int $$1x = this.h / $$6;
               int $$2x = $$1x % $$7;
               int $$3x = $$1x / $$7;
               this.h++;
               return this.g.d($$0 + $$0x, $$1 + $$2x, $$2 + $$3x);
            }
         }
      };
   }

   public static Iterable<jb.a> a(jb $$0, int $$1, jh $$2, jh $$3) {
      Validate.validState($$2.o() != $$3.o(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new AbstractIterator<jb.a>() {
         private final jh[] e = new jh[]{$$2, $$3, $$2.g(), $$3.g()};
         private final jb.a f = $$0.k().c($$3);
         private final int g = 4 * $$1;
         private int h = -1;
         private int i;
         private int j;
         private int k = this.f.u();
         private int l = this.f.v();
         private int m = this.f.w();

         protected jb.a a() {
            this.f.d(this.k, this.l, this.m).c(this.e[(this.h + 4) % 4]);
            this.k = this.f.u();
            this.l = this.f.v();
            this.m = this.f.w();
            if (this.j >= this.i) {
               if (this.h >= this.g) {
                  return (jb.a)this.endOfData();
               }

               this.h++;
               this.j = 0;
               this.i = this.h / 2 + 1;
            }

            this.j++;
            return this.f;
         }
      };
   }

   public static int a(jb $$0, int $$1, int $$2, BiConsumer<jb, Consumer<jb>> $$3, Function<jb, jb.b> $$4) {
      Queue<Pair<jb, Integer>> $$5 = new ArrayDeque<>();
      LongSet $$6 = new LongOpenHashSet();
      $$5.add(Pair.of($$0, 0));
      int $$7 = 0;

      while (!$$5.isEmpty()) {
         Pair<jb, Integer> $$8 = $$5.poll();
         jb $$9 = (jb)$$8.getLeft();
         int $$10 = (Integer)$$8.getRight();
         long $$11 = $$9.a();
         if ($$6.add($$11)) {
            jb.b $$12 = $$4.apply($$9);
            if ($$12 != jb.b.b) {
               if ($$12 == jb.b.c) {
                  break;
               }

               if (++$$7 >= $$2) {
                  return $$7;
               }

               if ($$10 < $$1) {
                  $$3.accept($$9, $$2x -> $$5.add(Pair.of($$2x, $$10 + 1)));
               }
            }
         }
      }

      return $$7;
   }

   public static class a extends jb {
      public a() {
         this(0, 0, 0);
      }

      public a(int $$0, int $$1, int $$2) {
         super($$0, $$1, $$2);
      }

      public a(double $$0, double $$1, double $$2) {
         this(bcb.a($$0), bcb.a($$1), bcb.a($$2));
      }

      @Override
      public jb b(int $$0, int $$1, int $$2) {
         return super.b($$0, $$1, $$2).j();
      }

      @Override
      public jb a(int $$0) {
         return super.a($$0).j();
      }

      @Override
      public jb a(jh $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jb a(jh.a $$0, int $$1) {
         return super.a($$0, $$1).j();
      }

      @Override
      public jb a(dwu $$0) {
         return super.a($$0).j();
      }

      public jb.a d(int $$0, int $$1, int $$2) {
         this.p($$0);
         this.q($$1);
         this.r($$2);
         return this;
      }

      public jb.a b(double $$0, double $$1, double $$2) {
         return this.d(bcb.a($$0), bcb.a($$1), bcb.a($$2));
      }

      public jb.a g(kg $$0) {
         return this.d($$0.u(), $$0.v(), $$0.w());
      }

      public jb.a f(long $$0) {
         return this.d(a($$0), b($$0), c($$0));
      }

      public jb.a a(iy $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.a($$1, $$2, $$3, jh.a.a), $$0.a($$1, $$2, $$3, jh.a.b), $$0.a($$1, $$2, $$3, jh.a.c));
      }

      public jb.a a(kg $$0, jh $$1) {
         return this.d($$0.u() + $$1.j(), $$0.v() + $$1.k(), $$0.w() + $$1.l());
      }

      public jb.a a(kg $$0, int $$1, int $$2, int $$3) {
         return this.d($$0.u() + $$1, $$0.v() + $$2, $$0.w() + $$3);
      }

      public jb.a a(kg $$0, kg $$1) {
         return this.d($$0.u() + $$1.u(), $$0.v() + $$1.v(), $$0.w() + $$1.w());
      }

      public jb.a c(jh $$0) {
         return this.c($$0, 1);
      }

      public jb.a c(jh $$0, int $$1) {
         return this.d(this.u() + $$0.j() * $$1, this.v() + $$0.k() * $$1, this.w() + $$0.l() * $$1);
      }

      public jb.a e(int $$0, int $$1, int $$2) {
         return this.d(this.u() + $$0, this.v() + $$1, this.w() + $$2);
      }

      public jb.a h(kg $$0) {
         return this.d(this.u() + $$0.u(), this.v() + $$0.v(), this.w() + $$0.w());
      }

      public jb.a a(jh.a $$0, int $$1, int $$2) {
         switch ($$0) {
            case a:
               return this.d(bcb.a(this.u(), $$1, $$2), this.v(), this.w());
            case b:
               return this.d(this.u(), bcb.a(this.v(), $$1, $$2), this.w());
            case c:
               return this.d(this.u(), this.v(), bcb.a(this.w(), $$1, $$2));
            default:
               throw new IllegalStateException("Unable to clamp axis " + $$0);
         }
      }

      public jb.a p(int $$0) {
         super.u($$0);
         return this;
      }

      public jb.a q(int $$0) {
         super.t($$0);
         return this;
      }

      public jb.a r(int $$0) {
         super.s($$0);
         return this;
      }

      @Override
      public jb j() {
         return new jb(this);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
