import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class eea implements cya {
   protected static final jh[] E = new jh[]{jh.e, jh.f, jh.c, jh.d, jh.a, jh.b};
   protected final boolean F;
   protected final float G;
   protected final boolean H;
   protected final dxx I;
   protected final float J;
   protected final float K;
   protected final float L;
   protected final boolean M;
   protected final cyd N;
   protected final eea.d O;
   protected final Optional<amd<fdo>> P;
   protected final String Q;

   public eea(eea.d $$0) {
      this.F = $$0.c;
      this.P = $$0.h();
      this.Q = $$0.q();
      this.G = $$0.f;
      this.H = $$0.i;
      this.I = $$0.d;
      this.J = $$0.j;
      this.K = $$0.k;
      this.L = $$0.l;
      this.M = $$0.F;
      this.N = $$0.G;
      this.O = $$0;
   }

   public eea.d s() {
      return this.O;
   }

   protected abstract MapCodec<? extends dpz> a();

   protected static <B extends dpz> RecordCodecBuilder<B, eea.d> t() {
      return eea.d.a.fieldOf("properties").forGetter(eea::s);
   }

   public static <B extends dpz> MapCodec<B> b(Function<eea.d, B> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(t()).apply($$1, $$0));
   }

   protected void a(eeb $$0, dmv $$1, jb $$2, int $$3, int $$4) {
   }

   protected boolean a(eeb $$0, fba $$1) {
      switch ($$1) {
         case a:
            return !$$0.m(dmk.a, jb.c);
         case b:
            return $$0.y().a(azu.a);
         case c:
            return !$$0.m(dmk.a, jb.c);
         default:
            return false;
      }
   }

   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$0;
   }

   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      return false;
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
   }

   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
   }

   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if (!$$0.l() && $$3.b() != dmn.a.d) {
         dpz $$5 = $$0.b();
         boolean $$6 = $$3.c() instanceof cut;
         if ($$5.a($$3)) {
            eaz $$7 = $$0.x() ? $$1.c_($$2) : null;
            fdm.a $$8 = new fdm.a($$1).a(fgd.f, fis.b($$2)).a(fgd.i, dcv.l).b(fgd.h, $$7).b(fgd.a, $$3.d());
            if ($$3.b() == dmn.a.c) {
               $$8.a(fgd.j, $$3.e());
            }

            $$0.a($$1, $$2, dcv.l, $$6);
            $$0.a($$8).forEach($$2x -> $$4.accept($$2x, $$2));
         }

         $$1.a($$2, dqb.a.m(), 3);
         $$5.a($$1, $$2, $$3);
      }
   }

   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      return bxj.e;
   }

   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      return bxj.f;
   }

   protected boolean a(eeb $$0, dmu $$1, jb $$2, int $$3, int $$4) {
      return false;
   }

   protected dwn a_(eeb $$0) {
      return dwn.b;
   }

   protected boolean g_(eeb $$0) {
      return false;
   }

   protected boolean f_(eeb $$0) {
      return false;
   }

   protected fal b_(eeb $$0) {
      return fam.a.g();
   }

   protected boolean c_(eeb $$0) {
      return false;
   }

   protected float ar_() {
      return 0.25F;
   }

   protected float at_() {
      return 0.2F;
   }

   @Override
   public cyd k() {
      return this.N;
   }

   protected eeb a(eeb $$0, dwu $$1) {
      return $$0;
   }

   protected eeb a(eeb $$0, dvd $$1) {
      return $$0;
   }

   protected boolean a(eeb $$0, dgo $$1) {
      return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
   }

   protected boolean a(eeb $$0, fak $$1) {
      return $$0.v() || !$$0.e();
   }

   protected List<dcv> a(eeb $$0, fdm.a $$1) {
      if (this.P.isEmpty()) {
         return Collections.emptyList();
      } else {
         fdm $$2 = $$1.a(fgd.g, $$0).a(fgc.r);
         aub $$3 = $$2.a();
         fdo $$4 = $$3.q().bc().a(this.P.get());
         return $$4.a($$2);
      }
   }

   protected long a(eeb $$0, jb $$1) {
      return bcb.a($$1);
   }

   protected fjm d_(eeb $$0) {
      return $$0.f(dmk.a, jb.c);
   }

   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return this.b($$0, $$1, $$2, fix.a());
   }

   protected fjm a(eeb $$0, dly $$1, jb $$2) {
      return fjj.a();
   }

   protected int i_(eeb $$0) {
      if ($$0.s()) {
         return 15;
      } else {
         return $$0.f() ? 0 : 1;
      }
   }

   @Nullable
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return null;
   }

   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return true;
   }

   protected float c(eeb $$0, dly $$1, jb $$2) {
      return $$0.m($$1, $$2) ? 0.2F : 1.0F;
   }

   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return 0;
   }

   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.b();
   }

   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.F ? $$0.f($$1, $$2) : fjj.a();
   }

   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      return fjj.b();
   }

   protected boolean a_(eeb $$0, dly $$1, jb $$2) {
      return dpz.a($$0.g($$1, $$2));
   }

   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.b($$0, $$1, $$2, $$3);
   }

   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
   }

   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
   }

   protected float a(eeb $$0, cut $$1, dly $$2, jb $$3) {
      float $$4 = $$0.e($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / $$5;
      }
   }

   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
   }

   protected void a_(eeb $$0, dmu $$1, jb $$2, cut $$3) {
   }

   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return 0;
   }

   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
   }

   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return 0;
   }

   public final Optional<amd<fdo>> u() {
      return this.P;
   }

   public final String v() {
      return this.Q;
   }

   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
   }

   protected boolean e_(eeb $$0) {
      return !dpz.a($$0.f(dmk.a, jb.c)) && $$0.y().c();
   }

   protected boolean f(eeb $$0) {
      return this.H;
   }

   protected dxx h_(eeb $$0) {
      return this.I;
   }

   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(this.h());
   }

   public abstract dcr h();

   protected abstract dpz o();

   public fap w() {
      return this.O.b.apply(this.o().m());
   }

   public float x() {
      return this.O.g;
   }

   public abstract static class a extends eed<dpz, eeb> {
      private static final jh[] a = jh.values();
      private static final fjm[] f = ag.a(new fjm[a.length], $$0 -> Arrays.fill($$0, fjj.a()));
      private static final fjm[] g = ag.a(new fjm[a.length], $$0 -> Arrays.fill($$0, fjj.b()));
      private final int h;
      private final boolean i;
      private final boolean j;
      private final boolean k;
      @Deprecated
      private final boolean l;
      @Deprecated
      private boolean m;
      private final faq n;
      private final fap o;
      private final float p;
      private final boolean q;
      private final boolean r;
      private final eea.f s;
      private final eea.f t;
      private final eea.f u;
      private final eea.f v;
      private final eea.f w;
      @Nullable
      private final eea.b x;
      private final boolean y;
      private final efc z;
      private final boolean A;
      @Nullable
      private eea.a.a B;
      private fal C = fam.a.g();
      private boolean D;
      private boolean E;
      private fjm F;
      private fjm[] G;
      private boolean H;
      private int I;

      protected a(dpz $$0, Reference2ObjectArrayMap<efe<?>, Comparable<?>> $$1, MapCodec<eeb> $$2) {
         super($$0, $$1, $$2);
         eea.d $$3 = $$0.O;
         this.h = $$3.e.applyAsInt(this.B());
         this.i = $$0.g_(this.B());
         this.j = $$3.q;
         this.k = $$3.r;
         this.l = $$3.s;
         this.n = $$3.v;
         this.o = $$3.b.apply(this.B());
         this.p = $$3.g;
         this.q = $$3.h;
         this.r = $$3.p;
         this.s = $$3.A;
         this.t = $$3.B;
         this.u = $$3.C;
         this.v = $$3.D;
         this.w = $$3.E;
         this.x = $$3.H;
         this.y = $$3.w;
         this.z = $$3.x;
         this.A = $$3.y;
      }

      private boolean H() {
         if (this.d.O.u) {
            return true;
         } else if (this.d.O.t) {
            return false;
         } else if (this.B == null) {
            return false;
         } else {
            fjm $$0 = this.B.a;
            if ($$0.c()) {
               return false;
            } else {
               fin $$1 = $$0.a();
               return $$1.a() >= 0.7291666666666666 ? true : $$1.c() >= 1.0;
            }
         }
      }

      public void a() {
         this.C = this.d.b_(this.B());
         this.D = this.d.f(this.B());
         if (!this.b().n()) {
            this.B = new eea.a.a(this.B());
         }

         this.m = this.H();
         this.F = this.r ? this.d.d_(this.B()) : fjj.a();
         this.E = dpz.a(this.F);
         if (this.F.c()) {
            this.G = f;
         } else if (this.E) {
            this.G = g;
         } else {
            this.G = new fjm[a.length];

            for (jh $$0 : a) {
               this.G[$$0.ordinal()] = this.F.a($$0);
            }
         }

         this.H = this.d.e_(this.B());
         this.I = this.d.i_(this.B());
      }

      public dpz b() {
         return this.d;
      }

      public jl<dpz> c() {
         return this.d.p();
      }

      @Deprecated
      public boolean d() {
         dpz $$0 = this.b();
         return $$0 != dqb.bz && $$0 != dqb.nF && this.e();
      }

      @Deprecated
      public boolean e() {
         return this.m;
      }

      public boolean a(dly $$0, jb $$1, bzv<?> $$2) {
         return this.b().O.z.test(this.B(), $$0, $$1, $$2);
      }

      public boolean f() {
         return this.H;
      }

      public int g() {
         return this.I;
      }

      public fjm a(jh $$0) {
         return this.G[$$0.ordinal()];
      }

      public fjm h() {
         return this.F;
      }

      public boolean i() {
         return this.B == null || this.B.b;
      }

      public boolean j() {
         return this.i;
      }

      public int k() {
         return this.h;
      }

      public boolean l() {
         return this.j;
      }

      public boolean m() {
         return this.k;
      }

      @Deprecated
      public boolean n() {
         return this.l;
      }

      public fap a(dly $$0, jb $$1) {
         return this.o;
      }

      public eeb a(dwu $$0) {
         return this.b().a(this.B(), $$0);
      }

      public eeb a(dvd $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dwn o() {
         return this.b().a_(this.B());
      }

      public boolean b(dly $$0, jb $$1) {
         return this.w.test(this.B(), $$0, $$1);
      }

      public float c(dly $$0, jb $$1) {
         return this.b().c(this.B(), $$0, $$1);
      }

      public boolean d(dly $$0, jb $$1) {
         return this.s.test(this.B(), $$0, $$1);
      }

      public boolean p() {
         return this.b().f_(this.B());
      }

      public int a(dly $$0, jb $$1, jh $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public boolean q() {
         return this.b().c_(this.B());
      }

      public int a(dmu $$0, jb $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public float e(dly $$0, jb $$1) {
         return this.p;
      }

      public float a(cut $$0, dly $$1, jb $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public int b(dly $$0, jb $$1, jh $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public faq r() {
         return this.n;
      }

      public boolean s() {
         return this.E;
      }

      public boolean t() {
         return this.r;
      }

      public boolean a(eeb $$0, jh $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public fjm f(dly $$0, jb $$1) {
         return this.a($$0, $$1, fix.a());
      }

      public fjm a(dly $$0, jb $$1, fix $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fjm g(dly $$0, jb $$1) {
         return this.B != null ? this.B.a : this.b($$0, $$1, fix.a());
      }

      public fjm b(dly $$0, jb $$1, fix $$2) {
         return this.b().b(this.B(), $$0, $$1, $$2);
      }

      public fjm a(dly $$0, jb $$1, bzm $$2) {
         return this.b().a(this.B(), $$0, $$1, $$2);
      }

      public fjm h(dly $$0, jb $$1) {
         return this.b().b_(this.B(), $$0, $$1);
      }

      public fjm c(dly $$0, jb $$1, fix $$2) {
         return this.b().c(this.B(), $$0, $$1, $$2);
      }

      public fjm i(dly $$0, jb $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public final boolean b(dly $$0, jb $$1, bzm $$2) {
         return this.a($$0, $$1, $$2, jh.b);
      }

      public final boolean a(dly $$0, jb $$1, bzm $$2, jh $$3) {
         return dpz.a(this.b($$0, $$1, fix.a($$2)), $$3);
      }

      public fis a(jb $$0) {
         eea.b $$1 = this.x;
         return $$1 != null ? $$1.evaluate(this.B(), $$0) : fis.c;
      }

      public boolean u() {
         return this.x != null;
      }

      public boolean a(dmu $$0, jb $$1, int $$2, int $$3) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dmu $$0, jb $$1, dpz $$2, @Nullable fbt $$3, boolean $$4) {
         ahj.a($$0, $$1);
         this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(dmv $$0, jb $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(dmv $$0, jb $$1, int $$2, int $$3) {
         jb.a $$4 = new jb.a();

         for (jh $$5 : eea.E) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), $$4, $$1, this.B(), $$2, $$3);
         }
      }

      public final void b(dmv $$0, jb $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(dmv $$0, jb $$1, int $$2, int $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(dmu $$0, jb $$1, eeb $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aub $$0, jb $$1, boolean $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void a(aub $$0, jb $$1, dmn $$2, BiConsumer<dcv, jb> $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aub $$0, jb $$1, bck $$2) {
         this.b().a(this.B(), $$0, $$1, $$2);
      }

      public void b(aub $$0, jb $$1, bck $$2) {
         this.b().b(this.B(), $$0, $$1, $$2);
      }

      public void a(dmu $$0, jb $$1, bzm $$2, cae $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public void a(aub $$0, jb $$1, dcv $$2, boolean $$3) {
         this.b().a(this.B(), $$0, $$1, $$2, $$3);
      }

      public List<dcv> a(fdm.a $$0) {
         return this.b().a(this.B(), $$0);
      }

      public bxj a(dcv $$0, dmu $$1, cut $$2, bxi $$3, fio $$4) {
         return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
      }

      public bxj a(dmu $$0, cut $$1, fio $$2) {
         return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
      }

      public void a(dmu $$0, jb $$1, cut $$2) {
         this.b().a_(this.B(), $$0, $$1, $$2);
      }

      public boolean j(dly $$0, jb $$1) {
         return this.t.test(this.B(), $$0, $$1);
      }

      public boolean k(dly $$0, jb $$1) {
         return this.u.test(this.B(), $$0, $$1);
      }

      public eeb a(dmx $$0, dnj $$1, jb $$2, jh $$3, jb $$4, eeb $$5, bck $$6) {
         return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      public boolean a(fba $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(dgo $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean a(fak $$0) {
         return this.b().a(this.B(), $$0);
      }

      public boolean v() {
         return this.A;
      }

      public boolean a(dmx $$0, jb $$1) {
         return this.b().a(this.B(), $$0, $$1);
      }

      public boolean l(dly $$0, jb $$1) {
         return this.v.test(this.B(), $$0, $$1);
      }

      @Nullable
      public bxm b(dmu $$0, jb $$1) {
         return this.b().b(this.B(), $$0, $$1);
      }

      public boolean a(bae<dpz> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(bae<dpz> $$0, Predicate<eea.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(jp<dpz> $$0) {
         return $$0.a(this.b().p());
      }

      public boolean a(jl<dpz> $$0) {
         return this.a($$0.a());
      }

      public Stream<bae<dpz>> w() {
         return this.b().p().c();
      }

      public boolean x() {
         return this.b() instanceof dsu;
      }

      @Nullable
      public <T extends eaz> eba<T> a(dmu $$0, ebb<T> $$1) {
         return this.b() instanceof dsu ? ((dsu)this.b()).a($$0, this.B(), $$1) : null;
      }

      public boolean a(dpz $$0) {
         return this.b() == $$0;
      }

      public boolean a(amd<dpz> $$0) {
         return this.b().p().a($$0);
      }

      public fal y() {
         return this.C;
      }

      public boolean z() {
         return this.D;
      }

      public long b(jb $$0) {
         return this.b().a(this.B(), $$0);
      }

      public dxx A() {
         return this.b().h_(this.B());
      }

      public void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean c(dly $$0, jb $$1, jh $$2) {
         return this.a($$0, $$1, $$2, dyl.a);
      }

      public boolean a(dly $$0, jb $$1, jh $$2, dyl $$3) {
         return this.B != null ? this.B.a($$2, $$3) : $$3.a(this.B(), $$0, $$1, $$2);
      }

      public boolean m(dly $$0, jb $$1) {
         return this.B != null ? this.B.c : this.b().a_(this.B(), $$0, $$1);
      }

      public dcv a(dmx $$0, jb $$1, boolean $$2) {
         return this.b().a($$0, $$1, this.B(), $$2);
      }

      protected abstract eeb B();

      public boolean C() {
         return this.q;
      }

      public boolean D() {
         return this.y;
      }

      public efc E() {
         return this.z;
      }

      static final class a {
         private static final jh[] d = jh.values();
         private static final int e = dyl.values().length;
         protected final fjm a;
         protected final boolean b;
         private final boolean[] f;
         protected final boolean c;

         a(eeb $$0) {
            dpz $$1 = $$0.b();
            this.a = $$1.b($$0, dmk.a, jb.c, fix.a());
            if (!this.a.c() && $$0.u()) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mm.e.b($$1))
               );
            } else {
               this.b = Arrays.stream(jh.a.values()).anyMatch($$0x -> this.a.b($$0x) < 0.0 || this.a.c($$0x) > 1.0);
               this.f = new boolean[d.length * e];

               for (jh $$2 : d) {
                  for (dyl $$3 : dyl.values()) {
                     this.f[b($$2, $$3)] = $$3.a($$0, dmk.a, jb.c, $$2);
                  }
               }

               this.c = dpz.a($$0.g(dmk.a, jb.c));
            }
         }

         public boolean a(jh $$0, dyl $$1) {
            return this.f[b($$0, $$1)];
         }

         private static int b(jh $$0, dyl $$1) {
            return $$0.ordinal() * e + $$1.ordinal();
         }
      }
   }

   @FunctionalInterface
   public interface b {
      fis evaluate(eeb var1, jb var2);
   }

   public static enum c {
      a,
      b,
      c;
   }

   public static class d {
      public static final Codec<eea.d> a = Codec.unit(() -> a());
      Function<eeb, fap> b = $$0 -> fap.a;
      boolean c = true;
      dxx d = dxx.f;
      ToIntFunction<eeb> e = $$0 -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      @Nullable
      private amd<dpz> m;
      private alw<dpz, Optional<amd<fdo>>> n = $$0 -> Optional.of(amd.a(mn.bw, $$0.a().f("blocks/")));
      private alw<dpz, String> o = $$0 -> ag.a("block", $$0.a());
      boolean p = true;
      boolean q;
      boolean r;
      @Deprecated
      boolean s;
      @Deprecated
      boolean t;
      boolean u;
      faq v = faq.a;
      boolean w = true;
      efc x = efc.a;
      boolean y;
      eea.e<bzv<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, jh.b) && $$0.k() < 14;
      eea.f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
      eea.f B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
      eea.f C = this.B;
      eea.f D = ($$0, $$1, $$2) -> false;
      eea.f E = ($$0, $$1, $$2) -> false;
      boolean F;
      cyd G = cyf.g;
      @Nullable
      eea.b H;

      private d() {
      }

      public static eea.d a() {
         return new eea.d();
      }

      public static eea.d a(eea $$0) {
         eea.d $$1 = b($$0);
         eea.d $$2 = $$0.O;
         $$1.l = $$2.l;
         $$1.A = $$2.A;
         $$1.z = $$2.z;
         $$1.D = $$2.D;
         $$1.B = $$2.B;
         $$1.C = $$2.C;
         $$1.n = $$2.n;
         $$1.o = $$2.o;
         return $$1;
      }

      @Deprecated
      public static eea.d b(eea $$0) {
         eea.d $$1 = new eea.d();
         eea.d $$2 = $$0.O;
         $$1.g = $$2.g;
         $$1.f = $$2.f;
         $$1.c = $$2.c;
         $$1.i = $$2.i;
         $$1.e = $$2.e;
         $$1.b = $$2.b;
         $$1.d = $$2.d;
         $$1.j = $$2.j;
         $$1.k = $$2.k;
         $$1.F = $$2.F;
         $$1.p = $$2.p;
         $$1.q = $$2.q;
         $$1.r = $$2.r;
         $$1.s = $$2.s;
         $$1.t = $$2.t;
         $$1.u = $$2.u;
         $$1.v = $$2.v;
         $$1.h = $$2.h;
         $$1.H = $$2.H;
         $$1.w = $$2.w;
         $$1.G = $$2.G;
         $$1.E = $$2.E;
         $$1.x = $$2.x;
         $$1.y = $$2.y;
         return $$1;
      }

      public eea.d a(dbt $$0) {
         this.b = $$1 -> $$0.e();
         return this;
      }

      public eea.d a(fap $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public eea.d a(Function<eeb, fap> $$0) {
         this.b = $$0;
         return this;
      }

      public eea.d b() {
         this.c = false;
         this.p = false;
         return this;
      }

      public eea.d c() {
         this.p = false;
         return this;
      }

      public eea.d a(float $$0) {
         this.j = $$0;
         return this;
      }

      public eea.d b(float $$0) {
         this.k = $$0;
         return this;
      }

      public eea.d c(float $$0) {
         this.l = $$0;
         return this;
      }

      public eea.d a(dxx $$0) {
         this.d = $$0;
         return this;
      }

      public eea.d a(ToIntFunction<eeb> $$0) {
         this.e = $$0;
         return this;
      }

      public eea.d a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public eea.d d() {
         return this.d(0.0F);
      }

      public eea.d d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public eea.d e() {
         this.i = true;
         return this;
      }

      public eea.d f() {
         this.F = true;
         return this;
      }

      public eea.d g() {
         this.n = alw.fixed(Optional.empty());
         return this;
      }

      public eea.d a(Optional<amd<fdo>> $$0) {
         this.n = alw.fixed($$0);
         return this;
      }

      protected Optional<amd<fdo>> h() {
         return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
      }

      public eea.d i() {
         this.r = true;
         return this;
      }

      public eea.d j() {
         this.s = true;
         return this;
      }

      public eea.d k() {
         this.u = true;
         return this;
      }

      @Deprecated
      public eea.d l() {
         this.t = true;
         return this;
      }

      public eea.d a(faq $$0) {
         this.v = $$0;
         return this;
      }

      public eea.d m() {
         this.q = true;
         return this;
      }

      public eea.d a(eea.e<bzv<?>> $$0) {
         this.z = $$0;
         return this;
      }

      public eea.d a(eea.f $$0) {
         this.A = $$0;
         return this;
      }

      public eea.d b(eea.f $$0) {
         this.B = $$0;
         return this;
      }

      public eea.d c(eea.f $$0) {
         this.C = $$0;
         return this;
      }

      public eea.d d(eea.f $$0) {
         this.D = $$0;
         return this;
      }

      public eea.d e(eea.f $$0) {
         this.E = $$0;
         return this;
      }

      public eea.d n() {
         this.h = true;
         return this;
      }

      public eea.d e(float $$0) {
         this.g = $$0;
         return this;
      }

      public eea.d f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public eea.d a(eea.c $$0) {
         this.H = switch ($$0) {
            case a -> null;
            case b -> ($$0x, $$1) -> {
               dpz $$2 = $$0x.b();
               long $$3 = bcb.b($$1.u(), 0, $$1.w());
               float $$4 = $$2.ar_();
               double $$5 = bcb.a(((float)($$3 & 15L) / 15.0F - 0.5) * 0.5, (double)(-$$4), (double)$$4);
               double $$6 = bcb.a(((float)($$3 >> 8 & 15L) / 15.0F - 0.5) * 0.5, (double)(-$$4), (double)$$4);
               return new fis($$5, 0.0, $$6);
            };
            case c -> ($$0x, $$1) -> {
               dpz $$2 = $$0x.b();
               long $$3 = bcb.b($$1.u(), 0, $$1.w());
               double $$4 = ((float)($$3 >> 4 & 15L) / 15.0F - 1.0) * $$2.at_();
               float $$5 = $$2.ar_();
               double $$6 = bcb.a(((float)($$3 & 15L) / 15.0F - 0.5) * 0.5, (double)(-$$5), (double)$$5);
               double $$7 = bcb.a(((float)($$3 >> 8 & 15L) / 15.0F - 0.5) * 0.5, (double)(-$$5), (double)$$5);
               return new fis($$6, $$4, $$7);
            };
         };
         return this;
      }

      public eea.d o() {
         this.w = false;
         return this;
      }

      public eea.d a(cyb... $$0) {
         this.G = cyf.e.a($$0);
         return this;
      }

      public eea.d a(efc $$0) {
         this.x = $$0;
         return this;
      }

      public eea.d p() {
         this.y = true;
         return this;
      }

      public eea.d a(amd<dpz> $$0) {
         this.m = $$0;
         return this;
      }

      public eea.d a(String $$0) {
         this.o = alw.fixed($$0);
         return this;
      }

      protected String q() {
         return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
      }
   }

   @FunctionalInterface
   public interface e<A> {
      boolean test(eeb var1, dly var2, jb var3, A var4);
   }

   @FunctionalInterface
   public interface f {
      boolean test(eeb var1, dly var2, jb var3);
   }
}
