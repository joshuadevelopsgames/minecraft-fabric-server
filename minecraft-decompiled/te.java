import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongArraySet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class te {
   public static final int a = 8;
   private static final Logger b = LogUtils.getLogger();
   final aub c;
   private final th d;
   private final List<sz> e;
   private ImmutableList<ss> f;
   final List<su> g = Lists.newArrayList();
   private final List<sz> h = Lists.newArrayList();
   private final te.b i;
   private boolean j = true;
   @Nullable
   private jl<tu> k;
   private final te.c l;
   private final te.c m;
   final boolean n;

   protected te(te.b $$0, Collection<ss> $$1, aub $$2, th $$3, te.c $$4, te.c $$5, boolean $$6) {
      this.c = $$2;
      this.d = $$3;
      this.i = $$0;
      this.l = $$4;
      this.m = $$5;
      this.f = ImmutableList.copyOf($$1);
      this.n = $$6;
      this.e = this.f.stream().flatMap($$0x -> $$0x.b().stream()).collect(ag.b());
      $$3.a(this);
      this.e.forEach($$0x -> $$0x.a(new to()));
   }

   public List<sz> a() {
      return this.e;
   }

   public void b() {
      this.j = false;
      this.a(0);
   }

   public void c() {
      this.j = true;
      if (this.k != null) {
         this.d();
      }
   }

   public void a(sz $$0) {
      sz $$1 = $$0.D();
      $$0.C().forEach($$2 -> $$2.a($$0, $$1, this));
      this.e.add($$1);
      this.h.add($$1);
      if (this.j) {
         this.e();
      }
   }

   void a(final int $$0) {
      if ($$0 >= this.f.size()) {
         this.d();
         this.e();
      } else {
         final ss $$1 = (ss)this.f.get($$0);
         this.l.a(this.c);
         this.m.a(this.c);
         Collection<sz> $$2 = this.a($$1.b());
         b.info("Running test environment '{}' batch {} ({} tests)...", new Object[]{$$1.c().g(), $$1.a(), $$2.size()});
         if (this.k != $$1.c()) {
            this.d();
            this.k = $$1.c();
            this.k.a().a(this.c);
         }

         this.g.forEach($$1x -> $$1x.a($$1));
         final tn $$3 = new tn();
         $$2.forEach($$3::a);
         $$3.a(new tc() {
            private void a() {
               if ($$3.i()) {
                  te.this.g.forEach($$1xx -> $$1xx.b($$1));
                  LongSet $$0x = new LongArraySet(te.this.c.z());
                  $$0x.forEach($$0xxx -> te.this.c.a(dlz.a($$0xxx), dlz.b($$0xxx), false));
                  te.this.a($$0 + 1);
               }
            }

            @Override
            public void a(sz $$0x) {
            }

            @Override
            public void a(sz $$0x, te $$1x) {
               this.a();
            }

            @Override
            public void b(sz $$0x, te $$1x) {
               if (te.this.n) {
                  te.this.d();
                  LongSet $$2x = new LongArraySet(te.this.c.z());
                  $$2x.forEach($$0xxx -> te.this.c.a(dlz.a($$0xxx), dlz.b($$0xxx), false));
                  th.a.a();
               } else {
                  this.a();
               }
            }

            @Override
            public void a(sz $$0x, sz $$1x, te $$2x) {
            }
         });
         $$2.forEach(this.d::a);
      }
   }

   void d() {
      if (this.k != null) {
         this.k.a().b(this.c);
         this.k = null;
      }
   }

   private void e() {
      if (!this.h.isEmpty()) {
         b.info("Starting re-run of tests: {}", this.h.stream().map($$0 -> $$0.b().toString()).collect(Collectors.joining(", ")));
         this.f = ImmutableList.copyOf(this.i.batch(this.h));
         this.h.clear();
         this.j = false;
         this.a(0);
      } else {
         this.f = ImmutableList.of();
         this.j = true;
      }
   }

   public void a(su $$0) {
      this.g.add($$0);
   }

   private Collection<sz> a(Collection<sz> $$0) {
      return $$0.stream().map(this::b).flatMap(Optional::stream).toList();
   }

   private Optional<sz> b(sz $$0) {
      return $$0.c() == null ? this.m.spawnStructure($$0) : this.l.spawnStructure($$0);
   }

   public static void a(aub $$0) {
      ahj.a($$0);
   }

   public static class a {
      private final aub a;
      private final th b = th.a;
      private te.b c = st.a();
      private te.c d = te.c.a;
      private te.c e = te.c.b;
      private final Collection<ss> f;
      private boolean g = false;

      private a(Collection<ss> $$0, aub $$1) {
         this.f = $$0;
         this.a = $$1;
      }

      public static te.a a(Collection<ss> $$0, aub $$1) {
         return new te.a($$0, $$1);
      }

      public static te.a b(Collection<sz> $$0, aub $$1) {
         return a(st.a().batch($$0), $$1);
      }

      public te.a a(boolean $$0) {
         this.g = $$0;
         return this;
      }

      public te.a a(te.c $$0) {
         this.e = $$0;
         return this;
      }

      public te.a a(tq $$0) {
         this.d = $$0;
         return this;
      }

      public te.a a(te.b $$0) {
         this.c = $$0;
         return this;
      }

      public te a() {
         return new te(this.c, this.f, this.a, this.b, this.d, this.e, this.g);
      }
   }

   public interface b {
      Collection<ss> batch(Collection<sz> var1);
   }

   public interface c {
      te.c a = $$0 -> Optional.ofNullable($$0.o()).map($$0x -> $$0x.a(1));
      te.c b = $$0 -> Optional.empty();

      Optional<sz> spawnStructure(sz var1);

      default void a(aub $$0) {
      }
   }
}
