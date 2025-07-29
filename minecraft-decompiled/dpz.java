import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpz extends eea implements dmt {
   public static final MapCodec<dpz> j = b(dpz::new);
   private static final Logger a = LogUtils.getLogger();
   private final jl.c<dpz> b = mm.e.f(this);
   public static final jr<eeb> k = new jr<>();
   private static final LoadingCache<fjm, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<fjm, Boolean>() {
      public Boolean a(fjm $$0) {
         return !fjj.c(fjj.b(), $$0, fiw.g);
      }
   });
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 4;
   public static final int o = 8;
   public static final int p = 16;
   public static final int q = 32;
   public static final int r = 64;
   public static final int s = 128;
   public static final int t = 256;
   public static final int u = 512;
   public static final int v = 260;
   public static final int w = 3;
   public static final int x = 11;
   public static final int y = 816;
   public static final float z = -1.0F;
   public static final float A = 0.0F;
   public static final int B = 512;
   protected final eec<dpz, eeb> C;
   private eeb d;
   @Nullable
   private dcr e;
   private static final int f = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<dpz.a>> g = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<dpz.a> $$0 = new Object2ByteLinkedOpenHashMap<dpz.a>(256, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends dpz> a() {
      return j;
   }

   public static int j(@Nullable eeb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = k.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static eeb a(int $$0) {
      eeb $$1 = k.a($$0);
      return $$1 == null ? dqb.a.m() : $$1;
   }

   public static dpz a(@Nullable dcr $$0) {
      return $$0 instanceof dbd ? ((dbd)$$0).c() : dqb.a;
   }

   public static eeb a(eeb $$0, eeb $$1, dmv $$2, jb $$3) {
      fjm $$4 = fjj.b($$0.g($$2, $$3), $$1.g($$2, $$3), fiw.c).a($$3);
      if ($$4.c()) {
         return $$1;
      } else {
         for (bzm $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = fjj.a(jh.a.b, $$6.cV().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static fjm a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return fjj.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static fjm[] a(int $$0, IntFunction<fjm> $$1) {
      return IntStream.rangeClosed(0, $$0).mapToObj($$1).toArray(fjm[]::new);
   }

   public static fjm a(double $$0) {
      return a($$0, $$0, $$0);
   }

   public static fjm a(double $$0, double $$1, double $$2) {
      double $$3 = $$1 / 2.0;
      return a($$0, $$2, 8.0 - $$3, 8.0 + $$3);
   }

   public static fjm b(double $$0, double $$1, double $$2) {
      return a($$0, $$0, $$1, $$2);
   }

   public static fjm a(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$0 / 2.0;
      double $$5 = $$1 / 2.0;
      return a(8.0 - $$4, $$2, 8.0 - $$5, 8.0 + $$4, $$3, 8.0 + $$5);
   }

   public static fjm c(double $$0, double $$1, double $$2) {
      return b($$0, $$0, $$1, $$2);
   }

   public static fjm b(double $$0, double $$1, double $$2, double $$3) {
      double $$4 = $$1 / 2.0;
      return a($$0, 8.0 - $$4, 8.0 + $$4, $$2, $$3);
   }

   public static fjm a(double $$0, double $$1, double $$2, double $$3, double $$4) {
      double $$5 = $$0 / 2.0;
      return a(8.0 - $$5, $$1, $$3, 8.0 + $$5, $$2, $$4);
   }

   public static eeb b(eeb $$0, dmv $$1, jb $$2) {
      eeb $$3 = $$0;
      jb.a $$4 = new jb.a();

      for (jh $$5 : E) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$1, $$1, $$2, $$5, $$4, $$1.a_($$4), $$1.H_());
      }

      return $$3;
   }

   public static void a(eeb $$0, eeb $$1, dmv $$2, jb $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(eeb $$0, eeb $$1, dmv $$2, jb $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.l()) {
            if (!$$2.B_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public dpz(eea.d $$0) {
      super($$0);
      eec.a<dpz, eeb> $$1 = new eec.a<>(this);
      this.a($$1);
      this.C = $$1.a(dpz::m, eeb::new);
      this.l(this.C.b());
      if (ac.aZ) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean k(eeb $$0) {
      return $$0.b() instanceof duq || $$0.a(dqb.iy) || $$0.a(dqb.ev) || $$0.a(dqb.ew) || $$0.a(dqb.fs) || $$0.a(dqb.fr) || $$0.a(azo.ag);
   }

   public static boolean a(eeb $$0, eeb $$1, jh $$2) {
      fjm $$3 = $$1.a($$2.g());
      if ($$3 == fjj.b()) {
         return false;
      } else if ($$0.a($$1, $$2)) {
         return false;
      } else if ($$3 == fjj.a()) {
         return true;
      } else {
         fjm $$4 = $$0.a($$2);
         if ($$4 == fjj.a()) {
            return true;
         } else {
            dpz.a $$5 = new dpz.a($$4, $$3);
            Object2ByteLinkedOpenHashMap<dpz.a> $$6 = g.get();
            byte $$7 = $$6.getAndMoveToFirst($$5);
            if ($$7 != 127) {
               return $$7 != 0;
            } else {
               boolean $$8 = fjj.c($$4, $$3, fiw.e);
               if ($$6.size() == 256) {
                  $$6.removeLastByte();
               }

               $$6.putAndMoveToFirst($$5, (byte)($$8 ? 1 : 0));
               return $$8;
            }
         }
      }
   }

   public static boolean c(dly $$0, jb $$1) {
      return $$0.a_($$1).a($$0, $$1, jh.b, dyl.c);
   }

   public static boolean a(dmx $$0, jb $$1, jh $$2) {
      eeb $$3 = $$0.a_($$1);
      return $$2 == jh.a && $$3.a(azo.bc) ? false : $$3.a($$0, $$1, $$2, dyl.b);
   }

   public static boolean a(fjm $$0, jh $$1) {
      fjm $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(fjm $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
   }

   public void a(dmv $$0, jb $$1, eeb $$2) {
   }

   public static List<dcv> a(eeb $$0, aub $$1, jb $$2, @Nullable eaz $$3) {
      fdm.a $$4 = new fdm.a($$1).a(fgd.f, fis.b($$2)).a(fgd.i, dcv.l).b(fgd.h, $$3);
      return $$0.a($$4);
   }

   public static List<dcv> a(eeb $$0, aub $$1, jb $$2, @Nullable eaz $$3, @Nullable bzm $$4, dcv $$5) {
      fdm.a $$6 = new fdm.a($$1).a(fgd.f, fis.b($$2)).a(fgd.i, $$5).b(fgd.a, $$4).b(fgd.h, $$3);
      return $$0.a($$6);
   }

   public static void c(eeb $$0, dmu $$1, jb $$2) {
      if ($$1 instanceof aub) {
         a($$0, (aub)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aub)$$1, $$2, dcv.l, true);
      }
   }

   public static void a(eeb $$0, dmv $$1, jb $$2, @Nullable eaz $$3) {
      if ($$1 instanceof aub) {
         a($$0, (aub)$$1, $$2, $$3).forEach($$2x -> a((dmu)((aub)$$1), $$2, $$2x));
         $$0.a((aub)$$1, $$2, dcv.l, true);
      }
   }

   public static void a(eeb $$0, dmu $$1, jb $$2, @Nullable eaz $$3, @Nullable bzm $$4, dcv $$5) {
      if ($$1 instanceof aub) {
         a($$0, (aub)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((aub)$$1, $$2, $$5, true);
      }
   }

   public static void a(dmu $$0, jb $$1, dcv $$2) {
      double $$3 = bzv.as.m() / 2.0;
      double $$4 = $$1.u() + 0.5 + bcb.a($$0.A, -0.25, 0.25);
      double $$5 = $$1.v() + 0.5 + bcb.a($$0.A, -0.25, 0.25) - $$3;
      double $$6 = $$1.w() + 0.5 + bcb.a($$0.A, -0.25, 0.25);
      a($$0, () -> new cqz($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dmu $$0, jb $$1, jh $$2, dcv $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = bzv.as.l() / 2.0;
      double $$8 = bzv.as.m() / 2.0;
      double $$9 = $$1.u() + 0.5 + ($$4 == 0 ? bcb.a($$0.A, -0.25, 0.25) : $$4 * (0.5 + $$7));
      double $$10 = $$1.v() + 0.5 + ($$5 == 0 ? bcb.a($$0.A, -0.25, 0.25) : $$5 * (0.5 + $$8)) - $$8;
      double $$11 = $$1.w() + 0.5 + ($$6 == 0 ? bcb.a($$0.A, -0.25, 0.25) : $$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? bcb.a($$0.A, -0.1, 0.1) : $$4 * 0.1;
      double $$13 = $$5 == 0 ? bcb.a($$0.A, 0.0, 0.1) : $$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? bcb.a($$0.A, -0.1, 0.1) : $$6 * 0.1;
      a($$0, () -> new cqz($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dmu $$0, Supplier<cqz> $$1, dcv $$2) {
      if ($$0 instanceof aub $$3 && !$$2.f() && $$3.P().c(dmq.i)) {
         cqz $$5 = $$1.get();
         $$5.i();
         $$0.b($$5);
      }
   }

   protected void a(aub $$0, jb $$1, int $$2) {
      if ($$0.P().c(dmq.i)) {
         caa.a($$0, fis.b($$1), $$2);
      }
   }

   public float e() {
      return this.G;
   }

   public void a(aub $$0, jb $$1, dmn $$2) {
   }

   public void a(dmu $$0, jb $$1, eeb $$2, bzm $$3) {
   }

   @Nullable
   public eeb a(dgo $$0) {
      return this.m();
   }

   public void a(dmu $$0, cut $$1, jb $$2, eeb $$3, @Nullable eaz $$4, dcv $$5) {
      $$1.b(azj.a.b(this));
      $$1.a(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
   }

   public boolean a(eeb $$0) {
      return !$$0.e() && !$$0.n();
   }

   public yc f() {
      return xo.c(this.v());
   }

   public void a(dmu $$0, eeb $$1, jb $$2, bzm $$3, double $$4) {
      $$3.a($$4, 1.0F, $$3.ea().l());
   }

   public void a(dly $$0, bzm $$1) {
      $$1.i($$1.dA().d(1.0, 0.0, 1.0));
   }

   public float g() {
      return this.J;
   }

   public float i() {
      return this.K;
   }

   public float j() {
      return this.L;
   }

   protected void a(dmu $$0, cut $$1, jb $$2, eeb $$3) {
      $$0.a($$1, 2001, $$2, j($$3));
   }

   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(azo.ba) && $$0 instanceof aub $$4) {
         ctj.a($$4, $$3, false);
      }

      $$0.a(ejb.f, $$1, ejb.a.a($$3, $$2));
      return $$2;
   }

   public void a(eeb $$0, dmu $$1, jb $$2, dnx.c $$3) {
   }

   public boolean a(dmn $$0) {
      return true;
   }

   protected void a(eec.a<dpz, eeb> $$0) {
   }

   public eec<dpz, eeb> l() {
      return this.C;
   }

   protected final void l(eeb $$0) {
      this.d = $$0;
   }

   public final eeb m() {
      return this.d;
   }

   public final eeb m(eeb $$0) {
      eeb $$1 = this.m();

      for (efe<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> eeb a(eeb $$0, eeb $$1, efe<T> $$2) {
      return $$1.b($$2, $$0.c($$2));
   }

   @Override
   public dcr h() {
      if (this.e == null) {
         this.e = dcr.a(this);
      }

      return this.e;
   }

   public boolean n() {
      return this.M;
   }

   @Override
   public String toString() {
      return "Block{" + mm.e.e(this).g() + "}";
   }

   @Override
   protected dpz o() {
      return this;
   }

   protected Function<eeb, fjm> a(Function<eeb, fjm> $$0) {
      return this.C.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0))::get;
   }

   protected Function<eeb, fjm> a(Function<eeb, fjm> $$0, efe<?>... $$1) {
      Map<? extends efe<?>, Object> $$2 = Arrays.stream($$1).collect(Collectors.toMap($$0x -> $$0x, $$0x -> $$0x.a().getFirst()));
      ImmutableMap<eeb, fjm> $$3 = this.C
         .a()
         .stream()
         .filter($$1x -> $$2.entrySet().stream().allMatch($$1xx -> $$1x.c((efe)$$1xx.getKey()) == $$1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
      return $$2x -> {
         for (Entry<? extends efe<?>, Object> $$3x : $$2.entrySet()) {
            $$2x = a($$2x, (efe<?>)$$3x.getKey(), $$3x.getValue());
         }

         return (fjm)$$3.get($$2x);
      };
   }

   private static <S extends eed<?, S>, T extends Comparable<T>> S a(S $$0, efe<T> $$1, Object $$2) {
      return $$0.b($$1, (Comparable)$$2);
   }

   @Deprecated
   public jl.c<dpz> p() {
      return this.b;
   }

   protected void a(aub $$0, jb $$1, dcv $$2, bwo $$3) {
      int $$4 = djk.b($$0, $$2, $$3.a($$0.H_()));
      if ($$4 > 0) {
         this.a($$0, $$1, $$4);
      }
   }

   record a(fjm a, fjm b) {
      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof dpz.a $$1 && this.a == $$1.a && this.b == $$1.b;
      }

      @Override
      public int hashCode() {
         return System.identityHashCode(this.a) * 31 + System.identityHashCode(this.b);
      }
   }
}
