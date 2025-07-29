import com.google.common.collect.Queues;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public class hbl {
   private final hbd a = new hbd();
   private final Queue<Runnable> b = Queues.newConcurrentLinkedQueue();
   final Executor c = this.b::add;
   final Queue<hbk> d = Queues.newConcurrentLinkedQueue();
   final gyc e;
   private final gyd f;
   volatile boolean g;
   private final bvy h;
   private final af i;
   grk j;
   final gxh k;
   fis l = fis.c;
   final hbi m;

   public hbl(grk $$0, gxh $$1, af $$2, gxw $$3, gys $$4, hab $$5) {
      this.j = $$0;
      this.k = $$1;
      this.e = $$3.a();
      this.f = $$3.b();
      this.i = $$2;
      this.h = new bvy($$2, "Section Renderer");
      this.h.a_(this::i);
      this.m = new hbi($$4, $$5);
   }

   public void a(grk $$0) {
      this.j = $$0;
   }

   private void i() {
      if (!this.g && !this.f.b()) {
         hbl.a.a $$0 = this.a.a(this.l);
         if ($$0 != null) {
            gyc $$1 = Objects.requireNonNull(this.f.a());
            CompletableFuture.<CompletableFuture<hbl.b>>supplyAsync(() -> $$0.a($$1), this.i.a($$0.b())).thenCompose($$0x -> $$0x).whenComplete(($$2, $$3) -> {
               if ($$3 != null) {
                  fue.R().a(p.a($$3, "Batching sections"));
               } else {
                  $$0.b.set(true);
                  this.h.a_(() -> {
                     if ($$2 == hbl.b.a) {
                        $$1.a();
                     } else {
                        $$1.b();
                     }

                     this.f.a($$1);
                     this.i();
                  });
               }
            });
         }
      }
   }

   public void a(fis $$0) {
      this.l = $$0;
   }

   public void a() {
      Runnable $$0;
      while (($$0 = this.b.poll()) != null) {
         $$0.run();
      }

      hbk $$1;
      while (($$1 = this.d.poll()) != null) {
         $$1.close();
      }
   }

   public void a(hbl.a $$0, hbf $$1) {
      $$0.c($$1);
   }

   public void a(hbl.a.a $$0) {
      if (!this.g) {
         this.h.a_(() -> {
            if (!this.g) {
               this.a.a($$0);
               this.i();
            }
         });
      }
   }

   public void b() {
      this.a.b();
   }

   public boolean c() {
      return this.a.a() == 0 && this.b.isEmpty();
   }

   public void d() {
      this.g = true;
      this.b();
      this.a();
   }

   @bdl
   public String e() {
      return String.format(Locale.ROOT, "pC: %03d, pU: %02d, aB: %02d", this.a.a(), this.b.size(), this.f.c());
   }

   @bdl
   public int f() {
      return this.a.a();
   }

   @bdl
   public int g() {
      return this.b.size();
   }

   @bdl
   public int h() {
      return this.f.c();
   }

   public class a {
      public static final int a = 16;
      public final int b;
      public final AtomicReference<hbk> c = new AtomicReference<>(hbe.a);
      @Nullable
      private hbl.a.b e;
      @Nullable
      private hbl.a.c f;
      private fin g;
      private boolean h = true;
      volatile long i = ke.b(-1, -1, -1);
      final jb.a j = new jb.a(-1, -1, -1);
      private boolean k;

      public a(final int $$1, final long $$2) {
         this.b = $$1;
         this.a($$2);
      }

      private boolean b(long $$0) {
         efy $$1 = hbl.this.j.a(ke.b($$0), ke.d($$0), egz.n, false);
         return $$1 != null && hbl.this.j.C_().a(ke.f($$0));
      }

      public boolean a() {
         return this.b(ke.a(this.i, jh.e))
            && this.b(ke.a(this.i, jh.c))
            && this.b(ke.a(this.i, jh.f))
            && this.b(ke.a(this.i, jh.d))
            && this.b(ke.a(this.i, -1, 0, -1))
            && this.b(ke.a(this.i, -1, 0, 1))
            && this.b(ke.a(this.i, 1, 0, -1))
            && this.b(ke.a(this.i, 1, 0, 1));
      }

      public fin b() {
         return this.g;
      }

      public CompletableFuture<Void> a(Map<hba, foc> $$0, hbe $$1) {
         if (hbl.this.g) {
            $$0.values().forEach(foc::close);
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(() -> $$0.forEach(($$1xx, $$2) -> {
               try (bty $$3 = bts.a().d("Upload Section Layer")) {
                  $$1.a($$1xx, $$2, this.i);
                  $$2.close();
               }
            }), hbl.this.c);
         }
      }

      public CompletableFuture<Void> a(hbe $$0, foa.a $$1, hba $$2) {
         if (hbl.this.g) {
            $$1.close();
            return CompletableFuture.completedFuture(null);
         } else {
            return CompletableFuture.runAsync(() -> {
               try (bty $$3 = bts.a().d("Upload Section Indices")) {
                  $$0.a($$2, $$1, this.i);
                  $$1.close();
               }
            }, hbl.this.c);
         }
      }

      public void a(long $$0) {
         this.d();
         this.i = $$0;
         int $$1 = ke.c(ke.b($$0));
         int $$2 = ke.c(ke.c($$0));
         int $$3 = ke.c(ke.d($$0));
         this.j.d($$1, $$2, $$3);
         this.g = new fin($$1, $$2, $$3, $$1 + 16, $$2 + 16, $$3 + 16);
      }

      public hbk c() {
         return this.c.get();
      }

      public void d() {
         this.l();
         this.c.getAndSet(hbe.a).close();
         this.h = true;
      }

      public jb e() {
         return this.j;
      }

      public long f() {
         return this.i;
      }

      public void a(boolean $$0) {
         boolean $$1 = this.h;
         this.h = true;
         this.k = $$0 | ($$1 && this.k);
      }

      public void g() {
         this.h = false;
         this.k = false;
      }

      public boolean h() {
         return this.h;
      }

      public boolean i() {
         return this.h && this.k;
      }

      public long a(jh $$0) {
         return ke.a(this.i, $$0);
      }

      public void a(hbl $$0) {
         if (this.c() instanceof hbe $$1) {
            this.f = new hbl.a.c($$1);
            $$0.a(this.f);
         }
      }

      public boolean j() {
         return this.c().c();
      }

      public boolean k() {
         return this.f != null && !this.f.b.get();
      }

      protected void l() {
         if (this.e != null) {
            this.e.a();
            this.e = null;
         }

         if (this.f != null) {
            this.f.a();
            this.f = null;
         }
      }

      public hbl.a.a a(hbf $$0) {
         this.l();
         hbg $$1 = $$0.a(hbl.this.j, this.i);
         boolean $$2 = this.c.get() != hbe.a;
         this.e = new hbl.a.b($$1, $$2);
         return this.e;
      }

      public void b(hbf $$0) {
         hbl.a.a $$1 = this.a($$0);
         hbl.this.a($$1);
      }

      public void c(hbf $$0) {
         hbl.a.a $$1 = this.a($$0);
         $$1.a(hbl.this.e);
      }

      void a(hbk $$0) {
         hbk $$1 = this.c.getAndSet($$0);
         hbl.this.d.add($$1);
         hbl.this.k.a(this);
      }

      foi a(ke $$0) {
         fis $$1 = hbl.this.l;
         return foi.a((float)($$1.d - $$0.d()), (float)($$1.e - $$0.e()), (float)($$1.f - $$0.f()));
      }

      public abstract class a {
         protected final AtomicBoolean a = new AtomicBoolean(false);
         protected final AtomicBoolean b = new AtomicBoolean(false);
         protected final boolean c;

         public a(final boolean $$1) {
            this.c = $$1;
         }

         public abstract CompletableFuture<hbl.b> a(gyc var1);

         public abstract void a();

         protected abstract String b();

         public boolean c() {
            return this.c;
         }

         public jb d() {
            return a.this.j;
         }
      }

      class b extends hbl.a.a {
         protected final hbg e;

         public b(final hbg $$0, final boolean $$1) {
            super($$1);
            this.e = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_rebuild";
         }

         @Override
         public CompletableFuture<hbl.b> a(gyc $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(hbl.b.b);
            } else {
               long $$1 = a.this.i;
               ke $$2 = ke.a($$1);
               if (this.a.get()) {
                  return CompletableFuture.completedFuture(hbl.b.b);
               } else {
                  hbi.a $$4;
                  try (bty $$3 = bts.a().d("Compile Section")) {
                     $$4 = hbl.this.m.a($$2, this.e, a.this.a($$2), $$0);
                  }

                  hbm $$6 = hbm.a(hbl.this.l, $$1);
                  if (this.a.get()) {
                     $$4.a();
                     return CompletableFuture.completedFuture(hbl.b.b);
                  } else {
                     hbe $$7 = new hbe($$6, $$4);
                     CompletableFuture<Void> $$8 = a.this.a($$4.b, $$7);
                     return $$8.handle(($$1x, $$2x) -> {
                        if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                           fue.R().a(p.a($$2x, "Rendering section"));
                        }

                        if (!this.a.get() && !hbl.this.g) {
                           a.this.a($$7);
                           return hbl.b.a;
                        } else {
                           hbl.this.d.add($$7);
                           return hbl.b.b;
                        }
                     });
                  }
               }
            }
         }

         @Override
         public void a() {
            if (this.a.compareAndSet(false, true)) {
               a.this.a(false);
            }
         }
      }

      class c extends hbl.a.a {
         private final hbe f;

         public c(final hbe $$0) {
            super(true);
            this.f = $$0;
         }

         @Override
         protected String b() {
            return "rend_chk_sort";
         }

         @Override
         public CompletableFuture<hbl.b> a(gyc $$0) {
            if (this.a.get()) {
               return CompletableFuture.completedFuture(hbl.b.b);
            } else {
               foc.b $$1 = this.f.d();
               if ($$1 != null && !this.f.a(hba.d)) {
                  long $$2 = a.this.i;
                  foi $$3 = a.this.a(ke.a($$2));
                  hbm $$4 = hbm.a(hbl.this.l, $$2);
                  if (!this.f.b($$4) && !$$4.a()) {
                     return CompletableFuture.completedFuture(hbl.b.b);
                  } else {
                     foa.a $$5 = $$1.a($$0.a(hba.d), $$3);
                     if ($$5 == null) {
                        return CompletableFuture.completedFuture(hbl.b.b);
                     } else if (this.a.get()) {
                        $$5.close();
                        return CompletableFuture.completedFuture(hbl.b.b);
                     } else {
                        CompletableFuture<Void> $$6 = a.this.a(this.f, $$5, hba.d);
                        return $$6.handle(($$1x, $$2x) -> {
                           if ($$2x != null && !($$2x instanceof CancellationException) && !($$2x instanceof InterruptedException)) {
                              fue.R().a(p.a($$2x, "Rendering section"));
                           }

                           if (this.a.get()) {
                              return hbl.b.b;
                           } else {
                              this.f.a($$4);
                              return hbl.b.a;
                           }
                        });
                     }
                  }
               } else {
                  return CompletableFuture.completedFuture(hbl.b.b);
               }
            }
         }

         @Override
         public void a() {
            this.a.set(true);
         }
      }
   }

   static enum b {
      a,
      b;
   }
}
