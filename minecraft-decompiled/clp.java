import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class clp extends ehs<clr, clr.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final clp.a d;
   private final LongSet e = new LongOpenHashSet();

   public clp(ehr $$0, Path $$1, DataFixer $$2, boolean $$3, jz $$4, ehg $$5, dmw $$6) {
      super(new ehu($$0, $$1, $$2, $$3, bdr.r), clr.a.a, clr::a, clr.a::a, clr::new, $$4, $$5, $$6);
      this.d = new clp.a();
   }

   public void a(jb $$0, jl<cls> $$1) {
      this.f(ke.c($$0)).a($$0, $$1);
   }

   public void a(jb $$0) {
      this.d(ke.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jl<cls>> $$0, jb $$1, int $$2, clp.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(amd<cls> $$0, jb $$1) {
      return this.a($$1, (Predicate<jl<cls>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<clq> b(Predicate<jl<cls>> $$0, jb $$1, int $$2, clp.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dlz.a(new dlz($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jb $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<clq> c(Predicate<jl<cls>> $$0, jb $$1, int $$2, clp.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= $$4);
   }

   @bdl
   public Stream<clq> a(Predicate<jl<cls>> $$0, dlz $$1, clp.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(ke.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((clr)$$2x.get()).a($$0, $$2));
   }

   public Stream<jb> a(Predicate<jl<cls>> $$0, Predicate<jb> $$1, jb $$2, int $$3, clp.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(clq::g).filter($$1);
   }

   public Stream<Pair<jl<cls>, jb>> b(Predicate<jl<cls>> $$0, Predicate<jb> $$1, jb $$2, int $$3, clp.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jl<cls>, jb>> c(Predicate<jl<cls>> $$0, Predicate<jb> $$1, jb $$2, int $$3, clp.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jb)$$1x.getSecond()).j($$2)));
   }

   public Optional<jb> d(Predicate<jl<cls>> $$0, Predicate<jb> $$1, jb $$2, int $$3, clp.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jb> d(Predicate<jl<cls>> $$0, jb $$1, int $$2, clp.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(clq::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jl<cls>, jb>> e(Predicate<jl<cls>> $$0, jb $$1, int $$2, clp.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jb> e(Predicate<jl<cls>> $$0, Predicate<jb> $$1, jb $$2, int $$3, clp.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(clq::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jb> a(Predicate<jl<cls>> $$0, BiPredicate<jl<cls>, jb> $$1, jb $$2, int $$3) {
      return this.c($$0, $$2, $$3, clp.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jb> a(Predicate<jl<cls>> $$0, Predicate<jb> $$1, clp.b $$2, jb $$3, int $$4, bck $$5) {
      List<clq> $$6 = ag.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(clq::g);
   }

   public boolean b(jb $$0) {
      return this.d(ke.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ag.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jb $$0, Predicate<jl<cls>> $$1) {
      return this.d(ke.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jl<cls>> c(jb $$0) {
      return this.d(ke.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bdl
   public int d(jb $$0) {
      return this.d(ke.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(ke $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<clr> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(azz.b), clp.b.b).findAny().isPresent()).orElse(false);
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      this.d.a();
   }

   @Override
   protected void a(long $$0) {
      super.a($$0);
      this.d.b($$0, this.d.b($$0), false);
   }

   @Override
   protected void b(long $$0) {
      this.d.b($$0, this.d.b($$0), false);
   }

   public void a(ke $$0, egj $$1) {
      ag.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
         if (a($$1)) {
            this.a($$1, $$0, $$2x);
         }
      }), () -> {
         if (a($$1)) {
            clr $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(egj $$0) {
      return $$0.a(clt::b);
   }

   private void a(egj $$0, ke $$1, BiConsumer<jb, jl<cls>> $$2) {
      $$1.t().forEach($$2x -> {
         eeb $$3 = $$0.a(ke.b($$2x.u()), ke.b($$2x.v()), ke.b($$2x.w()));
         clt.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dmx $$0, jb $$1, int $$2) {
      ke.a(new dlz($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(clr::b).orElse(false))
         .map($$0x -> ((ke)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, egz.c));
   }

   final class a extends atw {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return clp.this.g($$0) ? 0 : 7;
      }

      @Override
      protected int c(long $$0) {
         return this.b.get($$0);
      }

      @Override
      protected void a(long $$0, int $$1) {
         if ($$1 > 6) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, (byte)$$1);
         }
      }

      public void a() {
         super.b(Integer.MAX_VALUE);
      }
   }

   public static enum b {
      a(clq::e),
      b(clq::f),
      c($$0 -> true);

      private final Predicate<? super clq> d;

      private b(final Predicate<? super clq> $$0) {
         this.d = $$0;
      }

      public Predicate<? super clq> a() {
         return this.d;
      }
   }
}
