import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Vector3d;
import org.slf4j.Logger;

public class gye {
   private static final Logger a = LogUtils.getLogger();
   private static final jh[] b = jh.values();
   private static final int c = 60;
   private static final int d = ke.a(60);
   private static final double e = Math.ceil(Math.sqrt(3.0) * 16.0);
   private boolean f = true;
   @Nullable
   private Future<?> g;
   @Nullable
   private gyn h;
   private final AtomicReference<gye.b> i = new AtomicReference<>();
   private final AtomicReference<gye.a> j = new AtomicReference<>();
   private final AtomicBoolean k = new AtomicBoolean(false);

   public void a(@Nullable gyn $$0) {
      if (this.g != null) {
         try {
            this.g.get();
            this.g = null;
         } catch (Exception var3) {
            a.warn("Full update failed", var3);
         }
      }

      this.h = $$0;
      if ($$0 != null) {
         this.i.set(new gye.b($$0));
         this.a();
      } else {
         this.i.set(null);
      }
   }

   public void a() {
      this.f = true;
   }

   public void a(hbq $$0, List<hbl.a> $$1, List<hbl.a> $$2) {
      this.i.get().a().b.a(($$2x, $$3, $$4, $$5) -> {
         hbl.a $$6 = $$2x.a();
         if ($$6 != null) {
            $$1.add($$6);
            if ($$5) {
               $$2.add($$6);
            }
         }
      }, $$0, 32);
   }

   public boolean b() {
      return this.k.compareAndSet(true, false);
   }

   public void a(dlz $$0) {
      gye.a $$1 = this.j.get();
      if ($$1 != null) {
         this.a($$1, $$0);
      }

      gye.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         this.a($$2, $$0);
      }
   }

   public void a(hbl.a $$0) {
      gye.a $$1 = this.j.get();
      if ($$1 != null) {
         $$1.b.add($$0);
      }

      gye.a $$2 = this.i.get().b;
      if ($$2 != $$1) {
         $$2.b.add($$0);
      }
   }

   public void a(boolean $$0, ftm $$1, hbq $$2, List<hbl.a> $$3, LongOpenHashSet $$4) {
      fis $$5 = $$1.d();
      if (this.f && (this.g == null || this.g.isDone())) {
         this.a($$0, $$1, $$5, $$4);
      }

      this.a($$0, $$2, $$3, $$5, $$4);
   }

   private void a(boolean $$0, ftm $$1, fis $$2, LongOpenHashSet $$3) {
      this.f = false;
      LongOpenHashSet $$4 = $$3.clone();
      this.g = CompletableFuture.runAsync(() -> {
         gye.b $$4x = new gye.b(this.h);
         this.j.set($$4x.b);
         Queue<gye.d> $$5 = Queues.newArrayDeque();
         this.a($$1, $$5);
         $$5.forEach($$1xx -> $$4x.a.a.a($$1xx.a, $$1xx));
         this.a($$4x.a, $$2, $$5, $$0, $$0xx -> {}, $$4);
         this.i.set($$4x);
         this.j.set(null);
         this.k.set(true);
      }, ag.h());
   }

   private void a(boolean $$0, hbq $$1, List<hbl.a> $$2, fis $$3, LongOpenHashSet $$4) {
      gye.b $$5 = this.i.get();
      this.a($$5);
      if (!$$5.b.b.isEmpty()) {
         Queue<gye.d> $$6 = Queues.newArrayDeque();

         while (!$$5.b.b.isEmpty()) {
            hbl.a $$7 = $$5.b.b.poll();
            gye.d $$8 = $$5.a.a.a($$7);
            if ($$8 != null && $$8.a == $$7) {
               $$6.add($$8);
            }
         }

         hbq $$9 = gxh.a($$1);
         Consumer<hbl.a> $$10 = $$1x -> {
            if ($$9.a($$1x.b())) {
               this.k.set(true);
            }
         };
         this.a($$5.a, $$3, $$6, $$0, $$10, $$4);
      }
   }

   private void a(gye.b $$0) {
      LongIterator $$1 = $$0.b.a.iterator();

      while ($$1.hasNext()) {
         long $$2 = $$1.nextLong();
         List<hbl.a> $$3 = (List<hbl.a>)$$0.a.c.get($$2);
         if ($$3 != null && $$3.get(0).a()) {
            $$0.b.b.addAll($$3);
            $$0.a.c.remove($$2);
         }
      }

      $$0.b.a.clear();
   }

   private void a(gye.a $$0, dlz $$1) {
      $$0.a.add(dlz.c($$1.h - 1, $$1.i));
      $$0.a.add(dlz.c($$1.h, $$1.i - 1));
      $$0.a.add(dlz.c($$1.h + 1, $$1.i));
      $$0.a.add(dlz.c($$1.h, $$1.i + 1));
      $$0.a.add(dlz.c($$1.h - 1, $$1.i - 1));
      $$0.a.add(dlz.c($$1.h - 1, $$1.i + 1));
      $$0.a.add(dlz.c($$1.h + 1, $$1.i - 1));
      $$0.a.add(dlz.c($$1.h + 1, $$1.i + 1));
   }

   private void a(ftm $$0, Queue<gye.d> $$1) {
      jb $$2 = $$0.e();
      long $$3 = ke.c($$2);
      int $$4 = ke.c($$3);
      hbl.a $$5 = this.h.a($$3);
      if ($$5 == null) {
         dmw $$6 = this.h.c();
         boolean $$7 = $$4 < $$6.aq();
         int $$8 = $$7 ? $$6.aq() : $$6.ar();
         int $$9 = this.h.b();
         List<gye.d> $$10 = Lists.newArrayList();
         int $$11 = ke.b($$3);
         int $$12 = ke.d($$3);

         for (int $$13 = -$$9; $$13 <= $$9; $$13++) {
            for (int $$14 = -$$9; $$14 <= $$9; $$14++) {
               hbl.a $$15 = this.h.a(ke.b($$13 + $$11, $$8, $$14 + $$12));
               if ($$15 != null && this.a($$3, $$15.f())) {
                  jh $$16 = $$7 ? jh.b : jh.a;
                  gye.d $$17 = new gye.d($$15, $$16, 0);
                  $$17.a($$17.d, $$16);
                  if ($$13 > 0) {
                     $$17.a($$17.d, jh.f);
                  } else if ($$13 < 0) {
                     $$17.a($$17.d, jh.e);
                  }

                  if ($$14 > 0) {
                     $$17.a($$17.d, jh.d);
                  } else if ($$14 < 0) {
                     $$17.a($$17.d, jh.c);
                  }

                  $$10.add($$17);
               }
            }
         }

         $$10.sort(Comparator.comparingDouble($$1x -> $$2.j(ke.a($$1x.a.f()).k())));
         $$1.addAll($$10);
      } else {
         $$1.add(new gye.d($$5, null, 0));
      }
   }

   private void a(gye.c $$0, fis $$1, Queue<gye.d> $$2, boolean $$3, Consumer<hbl.a> $$4, LongOpenHashSet $$5) {
      ke $$6 = ke.a($$1);
      long $$7 = $$6.s();
      jb $$8 = $$6.k();

      while (!$$2.isEmpty()) {
         gye.d $$9 = $$2.poll();
         hbl.a $$10 = $$9.a;
         if (!$$5.contains($$9.a.f())) {
            if ($$0.b.a($$9.a)) {
               $$4.accept($$9.a);
            }
         } else {
            $$9.a.c.compareAndSet(hbe.a, hbe.b);
         }

         long $$11 = $$10.f();
         boolean $$12 = Math.abs(ke.b($$11) - $$6.a()) > d || Math.abs(ke.c($$11) - $$6.b()) > d || Math.abs(ke.d($$11) - $$6.c()) > d;

         for (jh $$13 : b) {
            hbl.a $$14 = this.a($$7, $$10, $$13);
            if ($$14 != null && (!$$3 || !$$9.a($$13.g()))) {
               if ($$3 && $$9.a()) {
                  hbk $$15 = $$10.c();
                  boolean $$16 = false;

                  for (int $$17 = 0; $$17 < b.length; $$17++) {
                     if ($$9.a($$17) && $$15.a(b[$$17].g(), $$13)) {
                        $$16 = true;
                        break;
                     }
                  }

                  if (!$$16) {
                     continue;
                  }
               }

               if ($$3 && $$12) {
                  int $$18 = ke.c(ke.b($$11));
                  int $$19 = ke.c(ke.c($$11));
                  int $$20 = ke.c(ke.d($$11));
                  boolean $$21 = $$13.o() == jh.a.a ? $$8.u() > $$18 : $$8.u() < $$18;
                  boolean $$22 = $$13.o() == jh.a.b ? $$8.v() > $$19 : $$8.v() < $$19;
                  boolean $$23 = $$13.o() == jh.a.c ? $$8.w() > $$20 : $$8.w() < $$20;
                  Vector3d $$24 = new Vector3d($$18 + ($$21 ? 16 : 0), $$19 + ($$22 ? 16 : 0), $$20 + ($$23 ? 16 : 0));
                  Vector3d $$25 = new Vector3d($$1.d, $$1.e, $$1.f).sub($$24).normalize().mul(e);
                  boolean $$26 = true;

                  while ($$24.distanceSquared($$1.d, $$1.e, $$1.f) > 3600.0) {
                     $$24.add($$25);
                     dmw $$27 = this.h.c();
                     if ($$24.y > $$27.ao() || $$24.y < $$27.L_()) {
                        break;
                     }

                     hbl.a $$28 = this.h.a(jb.a($$24.x, $$24.y, $$24.z));
                     if ($$28 == null || $$0.a.a($$28) == null) {
                        $$26 = false;
                        break;
                     }
                  }

                  if (!$$26) {
                     continue;
                  }
               }

               gye.d $$29 = $$0.a.a($$14);
               if ($$29 != null) {
                  $$29.b($$13);
               } else {
                  gye.d $$30 = new gye.d($$14, $$13, $$9.b + 1);
                  $$30.a($$9.d, $$13);
                  if ($$14.a()) {
                     $$2.add($$30);
                     $$0.a.a($$14, $$30);
                  } else if (this.a($$7, $$14.f())) {
                     $$0.a.a($$14, $$30);
                     long $$31 = ke.g($$14.f());
                     ((List)$$0.c.computeIfAbsent($$31, $$0x -> new ArrayList())).add($$14);
                  }
               }
            }
         }
      }
   }

   private boolean a(long $$0, long $$1) {
      return atk.a(ke.b($$0), ke.d($$0), this.h.b(), ke.b($$1), ke.d($$1));
   }

   @Nullable
   private hbl.a a(long $$0, hbl.a $$1, jh $$2) {
      long $$3 = $$1.a($$2);
      if (!this.a($$0, $$3)) {
         return null;
      } else {
         return bcb.a(ke.c($$0) - ke.c($$3)) > this.h.b() ? null : this.h.a($$3);
      }
   }

   @Nullable
   @bdl
   public gye.d b(hbl.a $$0) {
      return this.i.get().a.a.a($$0);
   }

   public gxo c() {
      return this.i.get().a.b;
   }

   record a(LongSet a, BlockingQueue<hbl.a> b) {

      a() {
         this(new LongOpenHashSet(), new LinkedBlockingQueue<>());
      }
   }

   record b(gye.c a, gye.a b) {

      b(gyn $$0) {
         this(new gye.c($$0), new gye.a());
      }
   }

   static class c {
      public final gye.e a;
      public final gxo b;
      public final Long2ObjectMap<List<hbl.a>> c;

      public c(gyn $$0) {
         this.a = new gye.e($$0.f.length);
         this.b = new gxo($$0.d(), $$0.b(), $$0.c, $$0.b.L_());
         this.c = new Long2ObjectOpenHashMap();
      }
   }

   @bdl
   public static class d {
      @bdl
      protected final hbl.a a;
      private byte c;
      byte d;
      @bdl
      public final int b;

      d(hbl.a $$0, @Nullable jh $$1, int $$2) {
         this.a = $$0;
         if ($$1 != null) {
            this.b($$1);
         }

         this.b = $$2;
      }

      void a(byte $$0, jh $$1) {
         this.d = (byte)(this.d | $$0 | 1 << $$1.ordinal());
      }

      boolean a(jh $$0) {
         return (this.d & 1 << $$0.ordinal()) > 0;
      }

      void b(jh $$0) {
         this.c = (byte)(this.c | this.c | 1 << $$0.ordinal());
      }

      @bdl
      public boolean a(int $$0) {
         return (this.c & 1 << $$0) > 0;
      }

      boolean a() {
         return this.c != 0;
      }

      @Override
      public int hashCode() {
         return Long.hashCode(this.a.f());
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof gye.d $$1) ? false : this.a.f() == $$1.a.f();
      }
   }

   static class e {
      private final gye.d[] a;

      e(int $$0) {
         this.a = new gye.d[$$0];
      }

      public void a(hbl.a $$0, gye.d $$1) {
         this.a[$$0.b] = $$1;
      }

      @Nullable
      public gye.d a(hbl.a $$0) {
         int $$1 = $$0.b;
         return $$1 >= 0 && $$1 < this.a.length ? this.a[$$1] : null;
      }
   }
}
