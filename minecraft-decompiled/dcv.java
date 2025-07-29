import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public final class dcv implements km {
   private static final List<xo> m = List.of(
      xo.c("item.op_warning.line1").a(o.m, o.r), xo.c("item.op_warning.line2").a(o.m), xo.c("item.op_warning.line3").a(o.m)
   );
   private static final xo n = xo.c("item.unbreakable").a(o.j);
   public static final MapCodec<dcv> a = MapCodec.recursive(
      "ItemStack",
      $$0 -> RecordCodecBuilder.mapCodec(
         $$0x -> $$0x.group(
               dcr.e.fieldOf("id").forGetter(dcv::i),
               bbi.a(1, 99).fieldOf("count").orElse(1).forGetter(dcv::M),
               ko.b.optionalFieldOf("components", ko.a).forGetter($$0xx -> $$0xx.t.g())
            )
            .apply($$0x, dcv::new)
      )
   );
   public static final Codec<dcv> b = Codec.lazyInitialized(a::codec);
   public static final Codec<dcv> c = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
         $$0 -> $$0.group(dcr.e.fieldOf("id").forGetter(dcv::i), ko.b.optionalFieldOf("components", ko.a).forGetter($$0x -> $$0x.t.g()))
            .apply($$0, ($$0x, $$1) -> new dcv($$0x, 1, $$1))
      )
   );
   public static final Codec<dcv> d = b.validate(dcv::a);
   public static final Codec<dcv> e = c.validate(dcv::a);
   public static final Codec<dcv> f = bbi.g(b).xmap($$0 -> $$0.orElse(dcv.l), $$0 -> $$0.f() ? Optional.empty() : Optional.of($$0));
   public static final Codec<dcv> g = dcr.e.xmap(dcv::new, dcv::i);
   public static final zm<wx, dcv> h = b(ko.c);
   public static final zm<wx, dcv> i = b(ko.d);
   public static final zm<wx, dcv> j = new zm<wx, dcv>() {
      public dcv a(wx $$0) {
         dcv $$1 = dcv.h.decode($$0);
         if ($$1.f()) {
            throw new DecoderException("Empty ItemStack not allowed");
         } else {
            return $$1;
         }
      }

      public void a(wx $$0, dcv $$1) {
         if ($$1.f()) {
            throw new EncoderException("Empty ItemStack not allowed");
         } else {
            dcv.h.encode($$0, $$1);
         }
      }
   };
   public static final zm<wx, List<dcv>> k = h.a(zk.a(ju::a));
   private static final Logger o = LogUtils.getLogger();
   public static final dcv l = new dcv((Void)null);
   private static final xo p = xo.c("item.disabled").a(o.m);
   private int q;
   private int r;
   @Deprecated
   @Nullable
   private final dcr s;
   final kr t;
   @Nullable
   private bzm u;

   public static DataResult<dcv> a(dcv $$0) {
      DataResult<bdk> $$1 = a($$0.a());
      if ($$1.isError()) {
         return $$1.map($$1x -> $$0);
      } else {
         return $$0.M() > $$0.k()
            ? DataResult.error(() -> "Item stack with stack size of " + $$0.M() + " was larger than maximum: " + $$0.k())
            : DataResult.success($$0);
      }
   }

   private static zm<wx, dcv> b(final zm<wx, ko> $$0) {
      return new zm<wx, dcv>() {
         public dcv a(wx $$0x) {
            int $$1 = $$0.l();
            if ($$1 <= 0) {
               return dcv.l;
            } else {
               jl<dcr> $$2 = dcr.f.decode($$0);
               ko $$3 = $$0.decode($$0);
               return new dcv($$2, $$1, $$3);
            }
         }

         public void a(wx $$0x, dcv $$1) {
            if ($$1.f()) {
               $$0.c(0);
            } else {
               $$0.c($$1.M());
               dcr.f.encode($$0, $$1.i());
               $$0.encode($$0, $$1.t.g());
            }
         }
      };
   }

   public static zm<wx, dcv> a(final zm<wx, dcv> $$0) {
      return new zm<wx, dcv>() {
         public dcv a(wx $$0x) {
            dcv $$1 = $$0.decode($$0);
            if (!$$1.f()) {
               amc<bdk> $$2 = $$0.H().a(bcd.a);
               dcv.b.encodeStart($$2, $$1).getOrThrow(DecoderException::new);
            }

            return $$1;
         }

         public void a(wx $$0x, dcv $$1) {
            $$0.encode($$0, $$1);
         }
      };
   }

   public Optional<dau> b() {
      return this.h().k(this);
   }

   @Override
   public kn a() {
      return (kn)(!this.f() ? this.t : kn.a);
   }

   public kn c() {
      return !this.f() ? this.h().f() : kn.a;
   }

   public ko d() {
      return !this.f() ? this.t.g() : ko.a;
   }

   public kn e() {
      return !this.f() ? this.t.i() : kn.a;
   }

   public boolean d(kp<?> $$0) {
      return !this.f() && this.t.d($$0);
   }

   public dcv(dmt $$0) {
      this($$0, 1);
   }

   public dcv(jl<dcr> $$0) {
      this($$0.a(), 1);
   }

   public dcv(jl<dcr> $$0, int $$1, ko $$2) {
      this($$0.a(), $$1, kr.a($$0.a().f(), $$2));
   }

   public dcv(jl<dcr> $$0, int $$1) {
      this($$0.a(), $$1);
   }

   public dcv(dmt $$0, int $$1) {
      this($$0, $$1, new kr($$0.h().f()));
   }

   private dcv(dmt $$0, int $$1, kr $$2) {
      this.s = $$0.h();
      this.q = $$1;
      this.t = $$2;
      this.h().l(this);
   }

   private dcv(@Nullable Void $$0) {
      this.s = null;
      this.t = new kr(kn.a);
   }

   public static DataResult<bdk> a(kn $$0) {
      if ($$0.c(kq.d) && $$0.a(kq.c, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         dfn $$1 = $$0.a(kq.ap, dfn.a);

         for (dcv $$2 : $$1.d()) {
            int $$3 = $$2.M();
            int $$4 = $$2.k();
            if ($$3 > $$4) {
               return DataResult.error(() -> "Item stack with count of " + $$3 + " was larger than maximum: " + $$4);
            }
         }

         return DataResult.success(bdk.a);
      }
   }

   public boolean f() {
      return this == l || this.s == dcz.a || this.q <= 0;
   }

   public boolean a(cyd $$0) {
      return this.f() || this.h().a($$0);
   }

   public dcv a(int $$0) {
      int $$1 = Math.min($$0, this.M());
      dcv $$2 = this.c($$1);
      this.h($$1);
      return $$2;
   }

   public dcv g() {
      if (this.f()) {
         return l;
      } else {
         dcv $$0 = this.v();
         this.e(0);
         return $$0;
      }
   }

   public dcr h() {
      return this.f() ? dcz.a : this.s;
   }

   public jl<dcr> i() {
      return this.h().e();
   }

   public boolean a(bae<dcr> $$0) {
      return this.h().e().a($$0);
   }

   public boolean a(dcr $$0) {
      return this.h() == $$0;
   }

   public boolean a(Predicate<jl<dcr>> $$0) {
      return $$0.test(this.h().e());
   }

   public boolean a(jl<dcr> $$0) {
      return this.h().e() == $$0;
   }

   public boolean a(jp<dcr> $$0) {
      return $$0.a(this.i());
   }

   public Stream<bae<dcr>> j() {
      return this.h().e().c();
   }

   public bxj a(dgq $$0) {
      cut $$1 = $$0.o();
      jb $$2 = $$0.a();
      if ($$1 != null && !$$1.gt().e && !this.a(new eef($$0.q(), $$2, false))) {
         return bxj.e;
      } else {
         dcr $$3 = this.h();
         bxj $$4 = $$3.a($$0);
         if ($$1 != null && $$4 instanceof bxj.d $$5 && $$5.c()) {
            $$1.b(azj.c.b($$3));
         }

         return $$4;
      }
   }

   public float a(eeb $$0) {
      return this.h().a(this, $$0);
   }

   public bxj a(dmu $$0, cut $$1, bxi $$2) {
      dcv $$3 = this.v();
      boolean $$4 = this.a((cam)$$1) <= 0;
      bxj $$5 = this.h().a($$0, $$1, $$2);
      return (bxj)($$4 && $$5 instanceof bxj.d $$6 ? $$6.a($$6.d() == null ? this.a($$1, $$3) : $$6.d().a($$1, $$3)) : $$5);
   }

   public dcv a(dmu $$0, cam $$1) {
      dcv $$2 = this.v();
      dcv $$3 = this.h().a(this, $$0, $$1);
      return $$3.a($$1, $$2);
   }

   private dcv a(cam $$0, dcv $$1) {
      dgc $$2 = $$1.a(kq.x);
      dgb $$3 = $$1.a(kq.y);
      int $$4 = $$1.M();
      dcv $$5 = this;
      if ($$2 != null) {
         $$5 = $$2.a(this, $$4, $$0.gc(), $$0::b);
      }

      if ($$3 != null) {
         $$3.a($$1, $$0);
      }

      return $$5;
   }

   public int k() {
      return this.a(kq.c, Integer.valueOf(1));
   }

   public boolean l() {
      return this.k() > 1 && (!this.m() || !this.n());
   }

   public boolean m() {
      return this.c(kq.d) && !this.c(kq.f) && this.c(kq.e);
   }

   public boolean n() {
      return this.m() && this.o() > 0;
   }

   public int o() {
      return bcb.a(this.a(kq.e, Integer.valueOf(0)), 0, this.p());
   }

   public void b(int $$0) {
      this.b(kq.e, Integer.valueOf(bcb.a($$0, 0, this.p())));
   }

   public int p() {
      return this.a(kq.d, Integer.valueOf(0));
   }

   public boolean q() {
      return this.m() && this.o() >= this.p();
   }

   public boolean r() {
      return this.m() && this.o() >= this.p() - 1;
   }

   public void a(int $$0, aub $$1, @Nullable auc $$2, Consumer<dcr> $$3) {
      int $$4 = this.a($$0, $$1, $$2);
      if ($$4 != 0) {
         this.a(this.o() + $$4, $$2, $$3);
      }
   }

   private int a(int $$0, aub $$1, @Nullable auc $$2) {
      if (!this.m()) {
         return 0;
      } else if ($$2 != null && $$2.gc()) {
         return 0;
      } else {
         return $$0 > 0 ? djk.a($$1, this, $$0) : $$0;
      }
   }

   private void a(int $$0, @Nullable auc $$1, Consumer<dcr> $$2) {
      if ($$1 != null) {
         aq.u.a($$1, this, $$0);
      }

      this.b($$0);
      if (this.q()) {
         dcr $$3 = this.h();
         this.h(1);
         $$2.accept($$3);
      }
   }

   public void a(int $$0, cut $$1) {
      if ($$1 instanceof auc $$2) {
         int $$3 = this.a($$0, $$2.y(), $$2);
         if ($$3 == 0) {
            return;
         }

         int $$4 = Math.min(this.o() + $$3, this.p() - 1);
         this.a($$4, $$2, $$0x -> {});
      }
   }

   public void a(int $$0, cam $$1, bxi $$2) {
      this.a($$0, $$1, cam.d($$2));
   }

   public void a(int $$0, cam $$1, bzw $$2) {
      if ($$1.ai() instanceof aub $$3) {
         this.a($$0, $$3, $$1 instanceof auc $$4 ? $$4 : null, $$2x -> $$1.a($$2x, $$2));
      }
   }

   public dcv a(int $$0, dmt $$1, cam $$2, bzw $$3) {
      this.a($$0, $$2, $$3);
      if (this.f()) {
         dcv $$4 = this.b($$1, 1);
         if ($$4.m()) {
            $$4.b(0);
         }

         return $$4;
      } else {
         return this;
      }
   }

   public boolean s() {
      return this.h().d(this);
   }

   public int t() {
      return this.h().e(this);
   }

   public int u() {
      return this.h().f(this);
   }

   public boolean a(dak $$0, cyw $$1, cut $$2) {
      return this.h().a(this, $$0, $$1, $$2);
   }

   public boolean a(dcv $$0, dak $$1, cyw $$2, cut $$3, cbd $$4) {
      return this.h().a(this, $$0, $$1, $$2, $$3, $$4);
   }

   public boolean a(cam $$0, cam $$1) {
      dcr $$2 = this.h();
      $$2.a(this, $$0, $$1);
      if (this.c(kq.B)) {
         if ($$1 instanceof cut $$3) {
            $$3.b(azj.c.b($$2));
         }

         return true;
      } else {
         return false;
      }
   }

   public void b(cam $$0, cam $$1) {
      this.h().b(this, $$0, $$1);
      dgd $$2 = this.a(kq.B);
      if ($$2 != null) {
         this.a($$2.a(), $$1, bzw.a);
      }
   }

   public void a(dmu $$0, eeb $$1, jb $$2, cut $$3) {
      dcr $$4 = this.h();
      if ($$4.a(this, $$0, $$1, $$2, $$3)) {
         $$3.b(azj.c.b($$4));
      }
   }

   public boolean b(eeb $$0) {
      return this.h().b(this, $$0);
   }

   public bxj a(cut $$0, cam $$1, bxi $$2) {
      dle $$3 = this.a(kq.D);
      if ($$3 != null && $$3.j()) {
         bxj $$4 = $$3.a($$0, $$1, this);
         if ($$4 != bxj.e) {
            return $$4;
         }
      }

      return this.h().a(this, $$0, $$1, $$2);
   }

   public dcv v() {
      if (this.f()) {
         return l;
      } else {
         dcv $$0 = new dcv(this.h(), this.q, this.t.h());
         $$0.d(this.L());
         return $$0;
      }
   }

   public dcv c(int $$0) {
      if (this.f()) {
         return l;
      } else {
         dcv $$1 = this.v();
         $$1.e($$0);
         return $$1;
      }
   }

   public dcv a(dmt $$0) {
      return this.a($$0, this.M());
   }

   public dcv a(dmt $$0, int $$1) {
      return this.f() ? l : this.b($$0, $$1);
   }

   private dcv b(dmt $$0, int $$1) {
      return new dcv($$0.h().e(), $$1, this.t.g());
   }

   public static boolean a(dcv $$0, dcv $$1) {
      if ($$0 == $$1) {
         return true;
      } else {
         return $$0.M() != $$1.M() ? false : c($$0, $$1);
      }
   }

   @Deprecated
   public static boolean a(List<dcv> $$0, List<dcv> $$1) {
      if ($$0.size() != $$1.size()) {
         return false;
      } else {
         for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
            if (!a($$0.get($$2), $$1.get($$2))) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean b(dcv $$0, dcv $$1) {
      return $$0.a($$1.h());
   }

   public static boolean c(dcv $$0, dcv $$1) {
      if (!$$0.a($$1.h())) {
         return false;
      } else {
         return $$0.f() && $$1.f() ? true : Objects.equals($$0.t, $$1.t);
      }
   }

   public static MapCodec<dcv> a(String $$0) {
      return b.lenientOptionalFieldOf($$0).xmap($$0x -> $$0x.orElse(l), $$0x -> $$0x.f() ? Optional.empty() : Optional.of($$0x));
   }

   public static int b(@Nullable dcv $$0) {
      if ($$0 != null) {
         int $$1 = 31 + $$0.h().hashCode();
         return 31 * $$1 + $$0.a().hashCode();
      } else {
         return 0;
      }
   }

   @Deprecated
   public static int a(List<dcv> $$0) {
      int $$1 = 0;

      for (dcv $$2 : $$0) {
         $$1 = $$1 * 31 + b($$2);
      }

      return $$1;
   }

   @Override
   public String toString() {
      return this.M() + " " + this.h();
   }

   public void a(dmu $$0, bzm $$1, @Nullable bzw $$2) {
      if (this.r > 0) {
         this.r--;
      }

      if ($$0 instanceof aub $$3) {
         this.h().a(this, $$3, $$1, $$2);
      }
   }

   public void a(cut $$0, int $$1) {
      $$0.a(azj.b.b(this.h()), $$1);
      this.h().c(this, $$0);
   }

   public void a(dmu $$0) {
      this.h().a(this, $$0);
   }

   public int a(cam $$0) {
      return this.h().a(this, $$0);
   }

   public dcx w() {
      return this.h().b(this);
   }

   public void a(dmu $$0, cam $$1, int $$2) {
      dcv $$3 = this.v();
      if (this.h().a(this, $$0, $$1, $$2)) {
         dcv $$4 = this.a($$1, $$3);
         if ($$4 != this) {
            $$1.a($$1.fH(), $$4);
         }
      }
   }

   public boolean x() {
      return this.h().e_(this);
   }

   @Nullable
   public <T> T b(kp<T> $$0, @Nullable T $$1) {
      return this.t.b($$0, $$1);
   }

   public <T> void a(kp<T> $$0, kl $$1) {
      this.b($$0, $$1.a($$0));
   }

   @Nullable
   public <T, U> T a(kp<T> $$0, T $$1, U $$2, BiFunction<T, U, T> $$3) {
      return this.b($$0, $$3.apply(this.a($$0, $$1), $$2));
   }

   @Nullable
   public <T> T a(kp<T> $$0, T $$1, UnaryOperator<T> $$2) {
      T $$3 = this.a($$0, $$1);
      return this.b($$0, $$2.apply($$3));
   }

   @Nullable
   public <T> T e(kp<? extends T> $$0) {
      return this.t.e($$0);
   }

   public void a(ko $$0) {
      ko $$1 = this.t.g();
      this.t.a($$0);
      Optional<Error<dcv>> $$2 = a(this).error();
      if ($$2.isPresent()) {
         o.error("Failed to apply component patch '{}' to item: '{}'", $$0, $$2.get().message());
         this.t.b($$1);
      } else {
         this.h().l(this);
      }
   }

   public void b(ko $$0) {
      this.t.a($$0);
      this.h().l(this);
   }

   public void b(kn $$0) {
      this.t.a($$0);
      this.h().l(this);
   }

   public xo y() {
      xo $$0 = this.z();
      return $$0 != null ? $$0 : this.A();
   }

   @Nullable
   public xo z() {
      xo $$0 = this.a(kq.g);
      if ($$0 != null) {
         return $$0;
      } else {
         dgf $$1 = this.a(kq.V);
         if ($$1 != null) {
            String $$2 = $$1.d().a();
            if (!bdb.h($$2)) {
               return xo.b($$2);
            }
         }

         return null;
      }
   }

   public xo A() {
      return this.h().a(this);
   }

   public xo B() {
      yc $$0 = xo.i().b(this.y()).a(this.D().a());
      if (this.c(kq.g)) {
         $$0.a(o.u);
      }

      return $$0;
   }

   public <T extends dga> void a(kp<T> $$0, dcr.b $$1, dfz $$2, Consumer<xo> $$3, dek $$4) {
      T $$5 = (T)this.a($$0);
      if ($$5 != null && $$2.a($$0)) {
         $$5.a($$1, $$3, $$4, this.t);
      }
   }

   public List<xo> a(dcr.b $$0, @Nullable cut $$1, dek $$2) {
      dfz $$3 = this.a(kq.q, dfz.c);
      if (!$$2.b() && $$3.a()) {
         boolean $$4 = this.h().a(this, $$1);
         return $$4 ? m : List.of();
      } else {
         List<xo> $$5 = Lists.newArrayList();
         $$5.add(this.B());
         this.a($$0, $$3, $$1, $$2, $$5::add);
         return $$5;
      }
   }

   public void a(dcr.b $$0, dfz $$1, @Nullable cut $$2, dek $$3, Consumer<xo> $$4) {
      this.h().a(this, $$0, $$1, $$4, $$3);
      this.a(kq.aC, $$0, $$1, $$4, $$3);
      this.a(kq.ab, $$0, $$1, $$4, $$3);
      this.a(kq.M, $$0, $$1, $$4, $$3);
      this.a(kq.ar, $$0, $$1, $$4, $$3);
      this.a(kq.at, $$0, $$1, $$4, $$3);
      this.a(kq.ap, $$0, $$1, $$4, $$3);
      this.a(kq.am, $$0, $$1, $$4, $$3);
      this.a(kq.ao, $$0, $$1, $$4, $$3);
      this.a(kq.V, $$0, $$1, $$4, $$3);
      this.a(kq.P, $$0, $$1, $$4, $$3);
      this.a(kq.aj, $$0, $$1, $$4, $$3);
      this.a(kq.ai, $$0, $$1, $$4, $$3);
      this.a(kq.R, $$0, $$1, $$4, $$3);
      this.a(kq.ae, $$0, $$1, $$4, $$3);
      this.a(kq.W, $$0, $$1, $$4, $$3);
      this.a(kq.J, $$0, $$1, $$4, $$3);
      this.a(kq.l, $$0, $$1, $$4, $$3);
      this.a(kq.K, $$0, $$1, $$4, $$3);
      this.a(kq.j, $$0, $$1, $$4, $$3);
      this.a($$4, $$1, $$2);
      if (this.c(kq.f) && $$1.a(kq.f)) {
         $$4.accept(n);
      }

      this.a(kq.ad, $$0, $$1, $$4, $$3);
      this.a(kq.T, $$0, $$1, $$4, $$3);
      this.a(kq.aq, $$0, $$1, $$4, $$3);
      if ((this.a(dcz.ff) || this.a(dcz.Ah)) && $$1.a(kq.aa)) {
         dfd $$5 = this.a(kq.aa, dfd.a);
         dnp.a($$5, $$4, "SpawnData");
      }

      daw $$6 = this.a(kq.n);
      if ($$6 != null && $$1.a(kq.n)) {
         $$4.accept(xn.a);
         $$4.accept(daw.c);
         $$6.a($$4);
      }

      daw $$7 = this.a(kq.m);
      if ($$7 != null && $$1.a(kq.m)) {
         $$4.accept(xn.a);
         $$4.accept(daw.d);
         $$7.a($$4);
      }

      if ($$3.a()) {
         if (this.n() && $$1.a(kq.e)) {
            $$4.accept(xo.a("item.durability", this.p() - this.o(), this.p()));
         }

         $$4.accept(xo.b(mm.g.b(this.h()).toString()).a(o.i));
         int $$8 = this.t.d();
         if ($$8 > 0) {
            $$4.accept(xo.a("item.components", $$8).a(o.i));
         }
      }

      if ($$2 != null && !this.h().a($$2.ai().L())) {
         $$4.accept(p);
      }

      boolean $$9 = this.h().a(this, $$2);
      if ($$9) {
         m.forEach($$4);
      }
   }

   private void a(Consumer<xo> $$0, dfz $$1, @Nullable cut $$2) {
      if ($$1.a(kq.o)) {
         for (bzx $$3 : bzx.values()) {
            MutableBoolean $$4 = new MutableBoolean(true);
            this.a($$3, ($$4x, $$5, $$6) -> {
               if ($$6 != dfm.b.b()) {
                  if ($$4.isTrue()) {
                     $$0.accept(xn.a);
                     $$0.accept(xo.c("item.modifiers." + $$3.c()).a(o.h));
                     $$4.setFalse();
                  }

                  $$6.a($$0, $$2, $$4x, $$5);
               }
            });
         }
      }
   }

   public boolean C() {
      Boolean $$0 = this.a(kq.t);
      return $$0 != null ? $$0 : this.h().d_(this);
   }

   public ddr D() {
      ddr $$0 = this.a(kq.k, ddr.a);
      if (!this.F()) {
         return $$0;
      } else {
         return switch ($$0) {
            case a, b -> ddr.c;
            case c -> ddr.d;
            default -> $$0;
         };
      }
   }

   public boolean E() {
      if (!this.c(kq.C)) {
         return false;
      } else {
         djo $$0 = this.a(kq.l);
         return $$0 != null && $$0.d();
      }
   }

   public void a(jl<dji> $$0, int $$1) {
      djk.a(this, $$2 -> $$2.b($$0, $$1));
   }

   public boolean F() {
      return !this.a(kq.l, djo.a).d();
   }

   public djo G() {
      return this.a(kq.l, djo.a);
   }

   public boolean H() {
      return this.u instanceof cqs;
   }

   public void a(@Nullable bzm $$0) {
      if (!this.f()) {
         this.u = $$0;
      }
   }

   @Nullable
   public cqs I() {
      return this.u instanceof cqs ? (cqs)this.J() : null;
   }

   @Nullable
   public bzm J() {
      return !this.f() ? this.u : null;
   }

   public void a(bzx $$0, TriConsumer<jl<cbn>, cbq, dfm.b> $$1) {
      dfm $$2 = this.a(kq.o, dfm.a);
      $$2.a($$0, $$1);
      djk.a(this, $$0, ($$1x, $$2x) -> $$1.accept($$1x, $$2x, dfm.b.a()));
   }

   public void a(bzw $$0, BiConsumer<jl<cbn>, cbq> $$1) {
      dfm $$2 = this.a(kq.o, dfm.a);
      $$2.a($$0, $$1);
      djk.a(this, $$0, $$1);
   }

   public xo K() {
      yc $$0 = xo.i().b(this.y());
      if (this.c(kq.g)) {
         $$0.a(o.u);
      }

      yc $$1 = xr.a((xo)$$0);
      if (!this.f()) {
         $$1.a(this.D().a()).a($$0x -> $$0x.a(new xu.d(this)));
      }

      return $$1;
   }

   public boolean a(eef $$0) {
      daw $$1 = this.a(kq.m);
      return $$1 != null && $$1.a($$0);
   }

   public boolean b(eef $$0) {
      daw $$1 = this.a(kq.n);
      return $$1 != null && $$1.a($$0);
   }

   public int L() {
      return this.r;
   }

   public void d(int $$0) {
      this.r = $$0;
   }

   public int M() {
      return this.f() ? 0 : this.q;
   }

   public void e(int $$0) {
      this.q = $$0;
   }

   public void f(int $$0) {
      if (!this.f() && this.M() > $$0) {
         this.e($$0);
      }
   }

   public void g(int $$0) {
      this.e(this.M() + $$0);
   }

   public void h(int $$0) {
      this.g(-$$0);
   }

   public void a(int $$0, @Nullable cam $$1) {
      if ($$1 == null || !$$1.gc()) {
         this.h($$0);
      }
   }

   public dcv b(int $$0, @Nullable cam $$1) {
      dcv $$2 = this.c($$0);
      this.a($$0, $$1);
      return $$2;
   }

   public void b(dmu $$0, cam $$1, int $$2) {
      dfa $$3 = this.a(kq.w);
      if ($$3 != null && $$3.a($$2)) {
         $$3.a($$1.ec(), $$1, this, 5);
      }

      this.h().a($$0, $$1, this, $$2);
   }

   public void a(cqz $$0) {
      this.h().a($$0);
   }

   public boolean a(byb $$0) {
      dff $$1 = this.a(kq.z);
      return $$1 == null || !$$1.a($$0);
   }

   public boolean c(dcv $$0) {
      djq $$1 = this.a(kq.E);
      return $$1 != null && $$1.a($$0);
   }

   public boolean a(eeb $$0, dmu $$1, jb $$2, cut $$3) {
      return this.h().a(this, $$0, $$1, $$2, $$3);
   }
}
