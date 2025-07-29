import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class sz {
   private final jl.c<ta> a;
   @Nullable
   private jb b;
   private final aub c;
   private final Collection<tc> d = Lists.newArrayList();
   private final int e;
   private final Collection<tf> f = Lists.newCopyOnWriteArrayList();
   private final Object2LongMap<Runnable> g = new Object2LongOpenHashMap();
   private boolean h;
   private boolean i;
   private int j;
   private boolean k;
   private final tp l;
   private final Stopwatch m = Stopwatch.createUnstarted();
   private boolean n;
   private final dwu o;
   @Nullable
   private sx p;
   @Nullable
   private ecu q;

   public sz(jl.c<ta> $$0, dwu $$1, aub $$2, tp $$3) {
      this.a = $$0;
      this.c = $$2;
      this.l = $$3;
      this.e = $$0.a().f();
      this.o = $$1;
   }

   public void a(@Nullable jb $$0) {
      this.b = $$0;
   }

   public sz a(int $$0) {
      this.j = -(this.a.a().g() + $$0 + 1);
      return this;
   }

   public void a() {
      if (!this.h) {
         ecu $$0 = this.f();
         if (!$$0.C()) {
            this.a(xo.a("test.error.structure.failure", $$0.k().getString()));
         }

         this.h = true;
         $$0.E();
         euq $$1 = $$0.d();
         this.c.o().a($$1);
         this.c.a($$1);
         this.d.forEach($$0x -> $$0x.a(this));
      }
   }

   public void a(te $$0) {
      if (!this.k()) {
         if (!this.h) {
            this.a(xo.c("test.error.ticking_without_structure"));
         }

         if (this.q == null) {
            this.a(xo.c("test.error.missing_block_entity"));
         }

         if (this.p != null) {
            this.G();
         }

         if (this.i || this.q.d().b().allMatch(this.c::a)) {
            this.i = true;
            this.E();
            if (this.k()) {
               if (this.p != null) {
                  this.d.forEach($$1 -> $$1.b(this, $$0));
               } else {
                  this.d.forEach($$1 -> $$1.a(this, $$0));
               }
            }
         }
      }
   }

   private void E() {
      this.j++;
      if (this.j >= 0) {
         if (!this.k) {
            this.F();
         }

         ObjectIterator<Entry<Runnable>> $$0 = this.g.object2LongEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<Runnable> $$1 = (Entry<Runnable>)$$0.next();
            if ($$1.getLongValue() <= this.j) {
               try {
                  ((Runnable)$$1.getKey()).run();
               } catch (sx var4) {
                  this.a(var4);
               } catch (Exception var5) {
                  this.a(new ua(var5));
               }

               $$0.remove();
            }
         }

         if (this.j > this.e) {
            if (this.f.isEmpty()) {
               this.a(new ti(xo.a("test.error.timeout.no_result", this.a.a().f())));
            } else {
               this.f.forEach($$0x -> $$0x.c(this.j));
               if (this.p == null) {
                  this.a(new ti(xo.a("test.error.timeout.no_sequences_finished", this.a.a().f())));
               }
            }
         } else {
            this.f.forEach($$0x -> $$0x.b(this.j));
         }
      }
   }

   private void F() {
      if (!this.k) {
         this.k = true;
         this.f().z();

         try {
            this.a.a().a(new sy(this));
         } catch (sx var2) {
            this.a(var2);
         } catch (Exception var3) {
            this.a(new ua(var3));
         }
      }
   }

   public void a(long $$0, Runnable $$1) {
      this.g.put($$1, $$0);
   }

   public ame b() {
      return this.a.h().a();
   }

   @Nullable
   public jb c() {
      return this.b;
   }

   public jb d() {
      return this.q.D();
   }

   public fin e() {
      ecu $$0 = this.f();
      return $$0.f();
   }

   public ecu f() {
      if (this.q == null) {
         if (this.b == null) {
            throw new IllegalStateException("This GameTestInfo has no position");
         }

         if (this.c.c_(this.b) instanceof ecu $$0) {
            this.q = $$0;
         }

         if (this.q == null) {
            throw new IllegalStateException("Could not find a test instance block entity at the given coordinate " + this.b);
         }
      }

      return this.q;
   }

   public aub g() {
      return this.c;
   }

   public boolean h() {
      return this.n && this.p == null;
   }

   public boolean i() {
      return this.p != null;
   }

   public boolean j() {
      return this.k;
   }

   public boolean k() {
      return this.n;
   }

   public long l() {
      return this.m.elapsed(TimeUnit.MILLISECONDS);
   }

   private void G() {
      if (!this.n) {
         this.n = true;
         if (this.m.isRunning()) {
            this.m.stop();
         }
      }
   }

   public void m() {
      if (this.p == null) {
         this.G();
         fin $$0 = this.e();
         List<bzm> $$1 = this.g().a(bzm.class, $$0.g(1.0), $$0x -> !($$0x instanceof cut));
         $$1.forEach($$0x -> $$0x.a(bzm.e.b));
      }
   }

   public void a(xo $$0) {
      this.a(new sq($$0, this.j));
   }

   public void a(sx $$0) {
      this.p = $$0;
   }

   @Nullable
   public sx n() {
      return this.p;
   }

   @Override
   public String toString() {
      return this.b().toString();
   }

   public void a(tc $$0) {
      this.d.add($$0);
   }

   @Nullable
   public sz o() {
      ecu $$0 = this.a(Objects.requireNonNull(this.b), this.o, this.c);
      if ($$0 != null) {
         this.q = $$0;
         this.a();
         return this;
      } else {
         return null;
      }
   }

   @Nullable
   private ecu a(jb $$0, dwu $$1, aub $$2) {
      $$2.c($$0, dqb.pK.m());
      if ($$2.c_($$0) instanceof ecu $$3) {
         amd<ta> $$4 = this.w().h();
         kg $$5 = ecu.a($$2, $$4).orElse(new kg(1, 1, 1));
         $$3.a(new ecu.a(Optional.of($$4), $$5, $$1, false, ecu.b.a, Optional.empty()));
         return $$3;
      } else {
         return null;
      }
   }

   int p() {
      return this.j;
   }

   tf q() {
      tf $$0 = new tf(this);
      this.f.add($$0);
      return $$0;
   }

   public boolean r() {
      return this.a.a().h();
   }

   public boolean s() {
      return !this.a.a().h();
   }

   public ame t() {
      return this.a.a().e();
   }

   public dwu u() {
      return this.a.a().n().f().a(this.o);
   }

   public ta v() {
      return this.a.a();
   }

   public jl.c<ta> w() {
      return this.a;
   }

   public int x() {
      return this.e;
   }

   public boolean y() {
      return this.a.a().j() > 1;
   }

   public int z() {
      return this.a.a().j();
   }

   public int A() {
      return this.a.a().k();
   }

   public tp B() {
      return this.l;
   }

   public Stream<tc> C() {
      return this.d.stream();
   }

   public sz D() {
      sz $$0 = new sz(this.a, this.o, this.c, this.B());
      if (this.b != null) {
         $$0.a(this.b);
      }

      return $$0;
   }
}
