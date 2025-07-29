import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;

public final class edc {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 40;
   private static final int c = 36000;
   private static final int d = 14;
   private static final int e = 47;
   private static final int f = bcb.i(47);
   private static final float g = 0.02F;
   private final edg h = new edg();
   private edc.b i;
   private final edc.c j;
   private edb k;
   private final edb.a l;
   private boolean m;
   private boolean n;

   public edc(edc.b $$0, edc.c $$1, edb $$2, edb.a $$3) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
   }

   public edd a() {
      return this.n ? this.i.b().a() : this.i.c.a();
   }

   public edd b() {
      return this.i.c.a();
   }

   public edd c() {
      return this.i.d.a();
   }

   public void a(fda $$0) {
      $$0.<edg.a>a(edg.a.a).ifPresent(this.h::a);
      this.i = $$0.<edc.b>a(edc.b.a).orElse(edc.b.b);
   }

   public void a(fdc $$0) {
      $$0.a(edg.a.a, this.h.a());
      $$0.a(edc.b.a, this.i);
   }

   public void a(aub $$0, jb $$1) {
      $$0.a($$1, $$0.a_($$1).b(dzd.c, true), 3);
      $$0.c(3020, $$1, 1);
      this.n = true;
      this.h.a(this, $$0);
   }

   public void b(aub $$0, jb $$1) {
      $$0.a($$1, $$0.a_($$1).b(dzd.c, false), 3);
      this.n = false;
   }

   public boolean d() {
      return this.n;
   }

   public int e() {
      return this.i.e;
   }

   public int f() {
      return this.i.f;
   }

   public edf g() {
      return this.j.d();
   }

   public edg h() {
      return this.h;
   }

   public void a(dmu $$0, edf $$1) {
      this.j.a($$0, $$1);
   }

   public void i() {
      this.j.f();
   }

   public edb j() {
      return this.k;
   }

   public edb.a k() {
      return this.l;
   }

   public boolean a(aub $$0) {
      if (this.m) {
         return true;
      } else {
         return $$0.an() == bxg.a ? false : $$0.P().c(dmq.f);
      }
   }

   public Optional<UUID> c(aub $$0, jb $$1) {
      bck $$2 = $$0.H_();
      dno $$3 = this.h.b(this, $$0.H_());

      Optional var24;
      try (bci.j $$4 = new bci.j(() -> "spawner@" + $$1, b)) {
         fda $$5 = fcy.a($$4, $$0.K_(), $$3.d());
         Optional<bzv<?>> $$6 = bzv.a($$5);
         if ($$6.isEmpty()) {
            return Optional.empty();
         }

         fis $$7 = $$5.<fis>a("Pos", fis.a).orElseGet(() -> {
            edd $$2x = this.a();
            return new fis($$1.u() + ($$2.j() - $$2.j()) * $$2x.c() + 0.5, $$1.v() + $$2.a(3) - 1, $$1.w() + ($$2.j() - $$2.j()) * $$2x.c() + 0.5);
         });
         if (!$$0.b($$6.get().a($$7.d, $$7.e, $$7.f))) {
            return Optional.empty();
         }

         if (!a($$0, $$1.b(), $$7)) {
            return Optional.empty();
         }

         jb $$8 = jb.a((jv)$$7);
         if (!cbh.a($$6.get(), $$0, bzu.q, $$8, $$0.H_())) {
            return Optional.empty();
         }

         if ($$3.b().isPresent()) {
            dno.a $$9 = $$3.b().get();
            if (!$$9.a($$8, $$0)) {
               return Optional.empty();
            }
         }

         bzm $$10 = bzv.a($$5, $$0, bzu.q, $$2x -> {
            $$2x.b($$7.d, $$7.e, $$7.f, $$2.i() * 360.0F, 0.0F);
            return $$2x;
         });
         if ($$10 == null) {
            return Optional.empty();
         }

         if ($$10 instanceof cao $$11) {
            if (!$$11.a((dmx)$$0)) {
               return Optional.empty();
            }

            boolean $$12 = $$3.a().i() == 1 && $$3.a().i("id").isPresent();
            if ($$12) {
               $$11.a($$0, $$0.d_($$11.dx()), bzu.q, null);
            }

            $$11.gp();
            $$3.c().ifPresent($$11::a);
         }

         if (!$$0.e($$10)) {
            return Optional.empty();
         }

         edc.a $$13 = this.n ? edc.a.b : edc.a.a;
         $$0.c(3011, $$1, $$13.a());
         $$0.c(3012, $$8, $$13.a());
         $$0.a($$10, ejb.t, $$8);
         var24 = Optional.of($$10.cK());
      }

      return var24;
   }

   public void a(aub $$0, jb $$1, amd<fdo> $$2) {
      fdo $$3 = $$0.q().bc().a($$2);
      fdm $$4 = new fdm.a($$0).a(fgc.b);
      ObjectArrayList<dcv> $$5 = $$3.a($$4);
      if (!$$5.isEmpty()) {
         ObjectListIterator var7 = $$5.iterator();

         while (var7.hasNext()) {
            dcv $$6 = (dcv)var7.next();
            lm.a($$0, $$6, 2, jh.b, fis.c($$1).a(jh.b, 1.2));
         }

         $$0.c(3014, $$1, 0);
      }
   }

   public void a(dmu $$0, jb $$1, boolean $$2) {
      edf $$3 = this.g();
      $$3.a($$0, $$1, $$2);
      if ($$3.d()) {
         double $$4 = Math.max(0L, this.h.d - $$0.ae());
         this.h.i = this.h.h;
         this.h.h = (this.h.h + $$3.b() / ($$4 + 200.0)) % 360.0;
      }

      if ($$3.e()) {
         bck $$5 = $$0.H_();
         if ($$5.i() <= 0.02F) {
            ayy $$6 = $$2 ? ayz.nc : ayz.nb;
            $$0.a($$1, $$6, aza.e, $$5.i() * 0.25F + 0.75F, $$5.i() + 0.5F, false);
         }
      }
   }

   public void a(aub $$0, jb $$1, boolean $$2) {
      this.n = $$2;
      edf $$3 = this.g();
      if (this.h.b.removeIf($$2x -> a($$0, $$1, $$2x))) {
         this.h.d = $$0.ae() + this.a().h();
      }

      edf $$4 = $$3.a($$1, this, $$0);
      if ($$4 != $$3) {
         this.a($$0, $$4);
      }
   }

   private static boolean a(aub $$0, jb $$1, UUID $$2) {
      bzm $$3 = $$0.b($$2);
      return $$3 == null || !$$3.bO() || !$$3.ai().aj().equals($$0.aj()) || $$3.dx().j($$1) > f;
   }

   private static boolean a(dmu $$0, fis $$1, fis $$2) {
      fio $$3 = $$0.a(new dmb($$2, $$1, dmb.a.c, dmb.b.a, fix.a()));
      return $$3.b().equals(jb.a((jv)$$1)) || $$3.d() == fiq.a.a;
   }

   public static void a(dmu $$0, jb $$1, bck $$2, mi $$3) {
      for (int $$4 = 0; $$4 < 20; $$4++) {
         double $$5 = $$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = $$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         $$0.a(me.ah, $$5, $$6, $$7, 0.0, 0.0, 0.0);
         $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
      }
   }

   public static void a(dmu $$0, jb $$1, bck $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = $$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$5 = $$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$6 = $$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(me.bh, $$4, $$5, $$6, $$7, $$8, $$9);
         $$0.a(me.N, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public static void a(dmu $$0, jb $$1, bck $$2, int $$3, mc $$4) {
      for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; $$5++) {
         double $$6 = (2.0F * $$2.i() - 1.0F) * 0.65;
         double $$7 = (2.0F * $$2.i() - 1.0F) * 0.65;
         double $$8 = $$1.u() + 0.5 + $$6;
         double $$9 = $$1.v() + 0.1 + $$2.i() * 0.8;
         double $$10 = $$1.w() + 0.5 + $$7;
         $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
      }
   }

   public static void b(dmu $$0, jb $$1, bck $$2) {
      for (int $$3 = 0; $$3 < 20; $$3++) {
         double $$4 = $$1.u() + 0.4 + $$2.j() * 0.2;
         double $$5 = $$1.v() + 0.4 + $$2.j() * 0.2;
         double $$6 = $$1.w() + 0.4 + $$2.j() * 0.2;
         double $$7 = $$2.k() * 0.02;
         double $$8 = $$2.k() * 0.02;
         double $$9 = $$2.k() * 0.02;
         $$0.a(me.aM, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
         $$0.a(me.ah, $$4, $$5, $$6, $$7, $$8, $$9);
      }
   }

   public void a(bzv<?> $$0, dmu $$1) {
      this.h.b();
      this.i = this.i.a($$0);
      this.a($$1, edf.a);
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void a(edb $$0) {
      this.k = $$0;
   }

   @Deprecated(
      forRemoval = true
   )
   @VisibleForTesting
   public void l() {
      this.m = true;
   }

   public static enum a {
      a(me.F),
      b(me.N);

      public final mi c;

      private a(final mi $$0) {
         this.c = $$0;
      }

      public static edc.a a(int $$0) {
         edc.a[] $$1 = values();
         return $$0 <= $$1.length && $$0 >= 0 ? $$1[$$0] : a;
      }

      public int a() {
         return this.ordinal();
      }
   }

   public record b(jl<edd> c, jl<edd> d, int e, int f) {
      public static final MapCodec<edc.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               edd.c.optionalFieldOf("normal_config", jl.a(edd.a)).forGetter(edc.b::a),
               edd.c.optionalFieldOf("ominous_config", jl.a(edd.a)).forGetter(edc.b::b),
               bbi.o.optionalFieldOf("target_cooldown_length", 36000).forGetter(edc.b::c),
               Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(edc.b::d)
            )
            .apply($$0, edc.b::new)
      );
      public static final edc.b b = new edc.b(jl.a(edd.a), jl.a(edd.a), 36000, 14);

      public edc.b a(bzv<?> $$0) {
         return new edc.b(jl.a(this.c.a().a($$0)), jl.a(this.d.a().a($$0)), this.e, this.f);
      }

      public jl<edd> a() {
         return this.c;
      }

      public jl<edd> b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public int d() {
         return this.f;
      }
   }

   public interface c {
      void a(dmu var1, edf var2);

      edf d();

      void f();
   }
}
