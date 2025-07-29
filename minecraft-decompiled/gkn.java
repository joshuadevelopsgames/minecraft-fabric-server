import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gkn extends get {
   private static final xo a = xo.c("editGamerule.title");
   private static final int b = 8;
   final gbk c = new gbk(this);
   private final Consumer<Optional<dmq>> d;
   private final Set<gkn.f> e = Sets.newHashSet();
   private final dmq f;
   @Nullable
   private gkn.g u;
   @Nullable
   private fxo v;

   public gkn(dmq $$0, Consumer<Optional<dmq>> $$1) {
      super(a);
      this.f = $$0;
      this.d = $$1;
   }

   @Override
   protected void aV_() {
      this.c.a(a, this.q);
      this.u = this.c.c(new gkn.g(this.f));
      gbo $$0 = this.c.b(gbo.e().a(8));
      this.v = $$0.a(fxo.a(xn.d, $$0x -> this.d.accept(Optional.of(this.f))).a());
      $$0.a(fxo.a(xn.e, $$0x -> this.aP_()).a());
      this.c.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.u != null) {
         this.u.a(this.o, this.c);
      }
   }

   @Override
   public void aP_() {
      this.d.accept(Optional.empty());
   }

   private void l() {
      if (this.v != null) {
         this.v.j = this.e.isEmpty();
      }
   }

   void a(gkn.f $$0) {
      this.e.add($$0);
      this.l();
   }

   void b(gkn.f $$0) {
      this.e.remove($$0);
      this.l();
   }

   public class a extends gkn.d {
      private final fxv<Boolean> c;

      public a(final xo $$1, final List<bbm> $$2, final String $$3, final dmq.a $$4) {
         super($$2, $$1);
         this.c = fxv.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.j($$3 + $$4 - 45);
         this.c.k($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends gkn.f {
      final xo b;

      public b(final xo $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gkn.this.n.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fzn> aH_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends gbr> b() {
         return ImmutableList.of(new gbr() {
            @Override
            public gbr.a w() {
               return gbr.a.b;
            }

            @Override
            public void b(gbt $$0) {
               $$0.a(gbs.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dmq.g<T>> {
      gkn.f create(xo var1, List<bbm> var2, String var3, T var4);
   }

   public abstract class d extends gkn.f {
      private final List<bbm> c;
      protected final List<fxm> a = Lists.newArrayList();

      public d(@Nullable final List<bbm> $$1, final xo $$2) {
         super($$1);
         this.c = gkn.this.n.h.c($$2, 175);
      }

      @Override
      public List<? extends fzn> aH_() {
         return this.a;
      }

      @Override
      public List<? extends gbr> b() {
         return this.a;
      }

      protected void a(fxb $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.b(gkn.this.n.h, this.c.get(0), $$2, $$1 + 5, -1);
         } else if (this.c.size() >= 2) {
            $$0.b(gkn.this.n.h, this.c.get(0), $$2, $$1, -1);
            $$0.b(gkn.this.n.h, this.c.get(1), $$2, $$1 + 10, -1);
         }
      }
   }

   public class e extends gkn.d {
      private final fxx d;

      public e(final xo $$1, final List<bbm> $$2, final String $$3, final dmq.d $$4) {
         super($$2, $$1);
         this.d = new fxx(gkn.this.n.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(-2039584);
               gkn.this.b(this);
            } else {
               this.d.m(-65536);
               gkn.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.j($$3 + $$4 - 45);
         this.d.k($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fxu.a<gkn.f> {
      @Nullable
      final List<bbm> a;

      public f(@Nullable List<bbm> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fxu<gkn.f> {
      private static final int m = 24;

      public g(final dmq $$1) {
         super(fue.R(), gkn.this.o, gkn.this.c.d(), gkn.this.c.c(), 24);
         final Map<dmq.b, Map<dmq.e<?>, gkn.f>> $$2 = Maps.newHashMap();
         $$1.a(new dmq.c() {
            @Override
            public void b(dmq.e<dmq.a> $$0, dmq.f<dmq.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gkn.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dmq.e<dmq.d> $$0, dmq.f<dmq.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> gkn.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dmq.g<T>> void a(dmq.e<T> $$0, gkn.c<T> $$1x) {
               xo $$2x = xo.c($$0.b());
               xo $$3 = xo.b($$0.a()).a(o.o);
               T $$4 = $$1.b($$0);
               String $$5 = $$4.b();
               xo $$6 = xo.a("editGamerule.default", xo.b($$5)).a(o.h);
               String $$7 = $$0.b() + ".description";
               List<bbm> $$10;
               String $$11;
               if (htb.a($$7)) {
                  Builder<bbm> $$8 = ImmutableList.builder().add($$3.g());
                  xo $$9 = xo.c($$7);
                  gkn.this.q.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2x, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(gkn.this.new b(xo.c(((dmq.b)$$0x.getKey()).a()).a(o.r, o.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dmq.e::a)))
                     .forEach($$0xx -> this.b((gkn.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         gkn.f $$4 = this.x();
         if ($$4 != null && $$4.a != null) {
            $$0.a($$4.a, $$1, $$2);
         }
      }
   }
}
