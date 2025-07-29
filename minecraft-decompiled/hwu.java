import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class hwu {
   private static final Marker d = MarkerFactory.getMarker("SOUNDS");
   private static final Logger e = LogUtils.getLogger();
   private static final float f = 0.5F;
   private static final float g = 2.0F;
   private static final float h = 0.0F;
   private static final float i = 1.0F;
   private static final int j = 20;
   private static final Set<ame> k = Sets.newHashSet();
   private static final long l = 1000L;
   public static final String a = "FOR THE DEBUG!";
   public static final String b = "OpenAL Soft on ";
   public static final int c = "OpenAL Soft on ".length();
   private final hws m;
   private final hwx n;
   private final fui o;
   private boolean p;
   private final fli q = new fli();
   private final flj r = this.q.e();
   private final hwt s;
   private final hwv t = new hwv();
   private final hwl u = new hwl(this.q, this.t);
   private int v;
   private long w;
   private final AtomicReference<hwu.a> x = new AtomicReference<>(hwu.a.c);
   private final Map<hvr, hwl.a> y = Maps.newHashMap();
   private final Multimap<aza, hvr> z = HashMultimap.create();
   private final List<hvs> A = Lists.newArrayList();
   private final Map<hvr, Integer> B = Maps.newHashMap();
   private final Map<hvr, Integer> C = Maps.newHashMap();
   private final List<hww> D = Lists.newArrayList();
   private final List<hvs> E = Lists.newArrayList();
   private final List<hvo> F = Lists.newArrayList();

   public hwu(hws $$0, hwx $$1, fui $$2, axr $$3) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.s = new hwt($$3);
   }

   public void a() {
      k.clear();

      for (ayy $$0 : mm.b) {
         if ($$0 != ayz.sk) {
            ame $$1 = $$0.a();
            if (this.n.a($$1) == null) {
               e.warn("Missing sound for event: {}", mm.b.b($$0));
               k.add($$1);
            }
         }
      }

      this.b();
      this.i();
   }

   private synchronized void i() {
      if (!this.p) {
         try {
            String $$0 = this.o.ax().c();
            this.q.a("".equals($$0) ? null : $$0, this.o.ab().c());
            this.r.b();
            this.r.a(this.o.b(aza.a));
            this.s.a(this.F).thenRun(this.F::clear);
            this.p = true;
            e.info(d, "Sound engine started");
         } catch (RuntimeException var2) {
            e.error(d, "Error starting SoundSystem. Turning off sounds & music", var2);
         }
      }
   }

   private float a(@Nullable aza $$0) {
      return $$0 != null && $$0 != aza.a ? this.o.b($$0) : 1.0F;
   }

   public void a(aza $$0, float $$1) {
      if (this.p) {
         if ($$0 == aza.a) {
            this.r.a($$1);
         } else {
            if ($$0 == aza.b && this.o.b(aza.b) > 0.0F) {
               this.m.b();
            }

            this.y.forEach(($$0x, $$1x) -> {
               float $$2 = this.h($$0x);
               $$1x.a($$1xx -> $$1xx.b($$2));
            });
         }
      }
   }

   public void b() {
      if (this.p) {
         this.d();
         this.s.a();
         this.q.d();
         this.p = false;
      }
   }

   public void c() {
      if (this.p) {
         this.q.d();
      }
   }

   public void a(hvr $$0) {
      if (this.p) {
         hwl.a $$1 = this.y.get($$0);
         if ($$1 != null) {
            $$1.a(flh::f);
         }
      }
   }

   public void a(hvr $$0, float $$1) {
      if (this.p) {
         hwl.a $$2 = this.y.get($$0);
         if ($$2 != null) {
            $$2.a($$2x -> $$2x.b($$1 * this.h($$0)));
         }
      }
   }

   public void d() {
      if (this.p) {
         this.t.a();
         this.y.values().forEach($$0 -> $$0.a(flh::f));
         this.y.clear();
         this.u.b();
         this.B.clear();
         this.A.clear();
         this.z.clear();
         this.C.clear();
         this.E.clear();
      }
   }

   public void a(hww $$0) {
      this.D.add($$0);
   }

   public void b(hww $$0) {
      this.D.remove($$0);
   }

   private boolean j() {
      if (this.q.h()) {
         e.info("Audio device was lost!");
         return true;
      } else {
         long $$0 = ag.c();
         boolean $$1 = $$0 - this.w >= 1000L;
         if ($$1) {
            this.w = $$0;
            if (this.x.compareAndSet(hwu.a.c, hwu.a.a)) {
               String $$2 = this.o.ax().c();
               ag.i().execute(() -> {
                  if ("".equals($$2)) {
                     if (this.q.c()) {
                        e.info("System default audio device has changed!");
                        this.x.compareAndSet(hwu.a.a, hwu.a.b);
                     }
                  } else if (!this.q.b().equals($$2) && this.q.g().contains($$2)) {
                     e.info("Preferred audio device has become available!");
                     this.x.compareAndSet(hwu.a.a, hwu.a.b);
                  }

                  this.x.compareAndSet(hwu.a.a, hwu.a.c);
               });
            }
         }

         return this.x.compareAndSet(hwu.a.b, hwu.a.c);
      }
   }

   public void a(boolean $$0) {
      if (this.j()) {
         this.a();
      }

      if (!$$0) {
         this.k();
      } else {
         this.l();
      }

      this.u.a();
   }

   private void k() {
      this.v++;
      this.E.stream().filter(hvr::s).forEach(this::c);
      this.E.clear();

      for (hvs $$0 : this.A) {
         if (!$$0.s()) {
            this.a((hvr)$$0);
         }

         $$0.q();
         if ($$0.m()) {
            this.a((hvr)$$0);
         } else {
            float $$1 = this.h($$0);
            float $$2 = this.g($$0);
            fis $$3 = new fis($$0.h(), $$0.i(), $$0.j());
            hwl.a $$4 = this.y.get($$0);
            if ($$4 != null) {
               $$4.a($$3x -> {
                  $$3x.b($$1);
                  $$3x.a($$2);
                  $$3x.a($$3);
               });
            }
         }
      }

      Iterator<Entry<hvr, hwl.a>> $$5 = this.y.entrySet().iterator();

      while ($$5.hasNext()) {
         Entry<hvr, hwl.a> $$6 = $$5.next();
         hwl.a $$7 = $$6.getValue();
         hvr $$8 = $$6.getKey();
         if ($$7.a()) {
            int $$9 = this.C.get($$8);
            if ($$9 <= this.v) {
               if (e($$8)) {
                  this.B.put($$8, this.v + $$8.e());
               }

               $$5.remove();
               e.debug(d, "Removed channel {} because it's not playing anymore", $$7);
               this.C.remove($$8);

               try {
                  this.z.remove($$8.c(), $$8);
               } catch (RuntimeException var7) {
               }

               if ($$8 instanceof hvs) {
                  this.A.remove($$8);
               }
            }
         }
      }

      Iterator<Entry<hvr, Integer>> $$10 = this.B.entrySet().iterator();

      while ($$10.hasNext()) {
         Entry<hvr, Integer> $$11 = $$10.next();
         if (this.v >= $$11.getValue()) {
            hvr $$12 = $$11.getKey();
            if ($$12 instanceof hvs) {
               ((hvs)$$12).q();
            }

            this.c($$12);
            $$10.remove();
         }
      }
   }

   private void l() {
      Iterator<Entry<hvr, hwl.a>> $$0 = this.y.entrySet().iterator();

      while ($$0.hasNext()) {
         Entry<hvr, hwl.a> $$1 = $$0.next();
         hwl.a $$2 = $$1.getValue();
         hvr $$3 = $$1.getKey();
         if ($$3.c() == aza.b && $$2.a()) {
            $$0.remove();
            e.debug(d, "Removed channel {} because it's not playing anymore", $$2);
            this.C.remove($$3);
            this.z.remove($$3.c(), $$3);
         }
      }
   }

   private static boolean d(hvr $$0) {
      return $$0.e() > 0;
   }

   private static boolean e(hvr $$0) {
      return $$0.d() && d($$0);
   }

   private static boolean f(hvr $$0) {
      return $$0.d() && !d($$0);
   }

   public boolean b(hvr $$0) {
      if (!this.p) {
         return false;
      } else {
         return this.C.containsKey($$0) && this.C.get($$0) <= this.v ? true : this.y.containsKey($$0);
      }
   }

   public hwu.b c(hvr $$0) {
      if (!this.p) {
         return hwu.b.c;
      } else if (!$$0.s()) {
         return hwu.b.c;
      } else {
         hwy $$1 = $$0.a(this.n);
         ame $$2 = $$0.a();
         if ($$1 == null) {
            if (k.add($$2)) {
               e.warn(d, "Unable to play unknown soundEvent: {}", $$2);
            }

            return hwu.b.c;
         } else {
            hvo $$3 = $$0.b();
            if ($$3 == hwx.e) {
               return hwu.b.c;
            } else if ($$3 == hwx.b) {
               if (k.add($$2)) {
                  e.warn(d, "Unable to play empty soundEvent: {}", $$2);
               }

               return hwu.b.c;
            } else {
               float $$4 = $$0.f();
               float $$5 = Math.max($$4, 1.0F) * $$3.i();
               aza $$6 = $$0.c();
               float $$7 = this.a($$4, $$6);
               float $$8 = this.g($$0);
               hvr.a $$9 = $$0.k();
               boolean $$10 = $$0.l();
               if (!this.D.isEmpty()) {
                  float $$11 = !$$10 && $$9 != hvr.a.a ? $$5 : Float.POSITIVE_INFINITY;

                  for (hww $$12 : this.D) {
                     $$12.a($$0, $$1, $$11);
                  }
               }

               boolean $$13 = false;
               if ($$7 == 0.0F) {
                  if (!$$0.r() && $$6 != aza.b) {
                     e.debug(d, "Skipped playing sound {}, volume was zero.", $$3.a());
                     return hwu.b.c;
                  }

                  $$13 = true;
               }

               fis $$14 = new fis($$0.h(), $$0.i(), $$0.j());
               if (this.r.a() <= 0.0F && $$6 != aza.b) {
                  e.debug(d, "Skipped playing soundEvent: {}, master volume was zero", $$2);
                  return hwu.b.c;
               } else {
                  boolean $$15 = f($$0);
                  boolean $$16 = $$3.g();
                  CompletableFuture<hwl.a> $$17 = this.u.a($$3.g() ? fli.c.b : fli.c.a);
                  hwl.a $$18 = $$17.join();
                  if ($$18 == null) {
                     if (ac.aZ) {
                        e.warn("Failed to create new sound handle");
                     }

                     return hwu.b.c;
                  } else {
                     e.debug(d, "Playing sound {} for event {}", $$3.a(), $$2);
                     this.C.put($$0, this.v + 20);
                     this.y.put($$0, $$18);
                     this.z.put($$6, $$0);
                     $$18.a($$8x -> {
                        $$8x.a($$8);
                        $$8x.b($$7);
                        if ($$9 == hvr.a.b) {
                           $$8x.c($$5);
                        } else {
                           $$8x.i();
                        }

                        $$8x.a($$15 && !$$16);
                        $$8x.a($$14);
                        $$8x.b($$10);
                     });
                     if (!$$16) {
                        this.s.a($$3.b()).thenAccept($$1x -> $$18.a($$1xx -> {
                           $$1xx.a($$1x);
                           $$1xx.c();
                        }));
                     } else {
                        this.s.a($$3.b(), $$15).thenAccept($$1x -> $$18.a($$1xx -> {
                           $$1xx.a($$1x);
                           $$1xx.c();
                        }));
                     }

                     if ($$0 instanceof hvs) {
                        this.A.add((hvs)$$0);
                     }

                     return $$13 ? hwu.b.b : hwu.b.a;
                  }
               }
            }
         }
      }
   }

   public void a(hvs $$0) {
      this.E.add($$0);
   }

   public void a(hvo $$0) {
      this.F.add($$0);
   }

   private float g(hvr $$0) {
      return bcb.a($$0.g(), 0.5F, 2.0F);
   }

   private float h(hvr $$0) {
      return this.a($$0.f(), $$0.c());
   }

   private float a(float $$0, aza $$1) {
      return bcb.a($$0 * this.a($$1), 0.0F, 1.0F);
   }

   public void a(aza... $$0) {
      if (this.p) {
         for (Entry<hvr, hwl.a> $$1 : this.y.entrySet()) {
            if (!List.of($$0).contains($$1.getKey().c())) {
               $$1.getValue().a(flh::d);
            }
         }
      }
   }

   public void e() {
      if (this.p) {
         this.u.a($$0 -> $$0.forEach(flh::e));
      }
   }

   public void a(hvr $$0, int $$1) {
      this.B.put($$0, this.v + $$1);
   }

   public void a(ftm $$0) {
      if (this.p && $$0.j()) {
         flk $$1 = new flk($$0.d(), new fis($$0.n()), new fis($$0.o()));
         this.t.execute(() -> this.r.a($$1));
      }
   }

   public void a(@Nullable ame $$0, @Nullable aza $$1) {
      if ($$1 != null) {
         for (hvr $$2 : this.z.get($$1)) {
            if ($$0 == null || $$2.a().equals($$0)) {
               this.a($$2);
            }
         }
      } else if ($$0 == null) {
         this.d();
      } else {
         for (hvr $$3 : this.y.keySet()) {
            if ($$3.a().equals($$0)) {
               this.a($$3);
            }
         }
      }
   }

   public String f() {
      return this.q.f();
   }

   public List<String> g() {
      return this.q.g();
   }

   public flk h() {
      return this.r.c();
   }

   static enum a {
      a,
      b,
      c;
   }

   public static enum b {
      a,
      b,
      c;
   }
}
