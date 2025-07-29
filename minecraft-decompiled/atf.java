import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class atf extends ehi implements atd.b, atq {
   private static final atg<List<efy>> f = atg.a("Unloaded chunks found in range");
   private static final CompletableFuture<atg<List<efy>>> g = CompletableFuture.completedFuture(f);
   private static final byte h = -1;
   private static final byte i = 0;
   private static final byte j = 1;
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 200;
   private static final int m = 20;
   private static final int n = 10000;
   private static final int o = 128;
   public static final int a = 2;
   public static final int b = 32;
   public static final int c = ate.a(atp.d);
   private final Long2ObjectLinkedOpenHashMap<atd> p = new Long2ObjectLinkedOpenHashMap();
   private volatile Long2ObjectLinkedOpenHashMap<atd> q = this.p.clone();
   private final Long2ObjectLinkedOpenHashMap<atd> r = new Long2ObjectLinkedOpenHashMap();
   private final List<atc> s = new ArrayList<>();
   final aub t;
   private final auf u;
   private final bvx<Runnable> v;
   private final eko w;
   private final ega x;
   private final Supplier<fcm> y;
   private final dnr z;
   private final clp A;
   final LongSet B = new LongOpenHashSet();
   private boolean C;
   private final ath D;
   private final ath E;
   private final aul F;
   private final eif G;
   private final atf.a H;
   private final AtomicInteger I = new AtomicInteger();
   private final String J;
   private final atu K = new atu();
   private final Int2ObjectMap<atf.b> L = new Int2ObjectOpenHashMap();
   private final Long2ByteMap M = new Long2ByteOpenHashMap();
   private final Long2LongMap N = new Long2LongOpenHashMap();
   private final LongSet O = new LongLinkedOpenHashSet();
   private final Queue<Runnable> P = Queues.newConcurrentLinkedQueue();
   private final AtomicInteger Q = new AtomicInteger();
   private int R;
   private final ehe S;

   public atf(
      aub $$0,
      fcs.c $$1,
      DataFixer $$2,
      ezb $$3,
      Executor $$4,
      bvx<Runnable> $$5,
      egl $$6,
      efz $$7,
      aul $$8,
      eif $$9,
      Supplier<fcm> $$10,
      dnr $$11,
      int $$12,
      boolean $$13
   ) {
      super(new ehr($$1.f(), $$0.aj(), "chunk"), $$1.a($$0.aj()).resolve("region"), $$2, $$13);
      Path $$14 = $$1.a($$0.aj());
      this.J = $$14.getFileName().toString();
      this.t = $$0;
      jz $$15 = $$0.K_();
      long $$16 = $$0.F();
      if ($$7 instanceof ekd $$17) {
         this.w = eko.a($$17.h().a(), $$15.f(mn.bd), $$16);
      } else {
         this.w = eko.a(ekf.e(), $$15.f(mn.bd), $$16);
      }

      this.x = $$7.a($$15.f(mn.bi), this.w, $$16);
      this.v = $$5;
      bvy $$18 = new bvy($$4, "worldgen");
      this.F = $$8;
      this.G = $$9;
      bvy $$19 = new bvy($$4, "light");
      this.D = new ath($$18, $$4);
      this.E = new ath($$19, $$4);
      this.u = new auf($$6, this, this.t.G_().g(), $$19, this.E);
      this.H = new atf.a($$11, $$4, $$5);
      this.y = $$10;
      this.z = $$11;
      this.A = new clp(new ehr($$1.f(), $$0.aj(), "poi"), $$14.resolve("poi"), $$2, $$13, $$15, $$0.q(), $$0);
      this.a($$12);
      this.S = new ehe($$0, $$7, $$3, this.u, $$5, this::f);
   }

   private void f(dlz $$0) {
      this.O.add($$0.a());
   }

   protected efz a() {
      return this.S.b();
   }

   protected ega b() {
      return this.x;
   }

   protected eko c() {
      return this.w;
   }

   boolean a(auc $$0, int $$1, int $$2) {
      return $$0.V().a($$1, $$2) && !$$0.g.g.a(dlz.c($$1, $$2));
   }

   private boolean b(auc $$0, int $$1, int $$2) {
      if (!this.a($$0, $$1, $$2)) {
         return false;
      } else {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               if (($$3 != 0 || $$4 != 0) && !this.a($$0, $$1 + $$3, $$2 + $$4)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected auf d() {
      return this.u;
   }

   @Nullable
   public atd a(long $$0) {
      return (atd)this.p.get($$0);
   }

   @Nullable
   protected atd b(long $$0) {
      return (atd)this.q.get($$0);
   }

   protected IntSupplier c(long $$0) {
      return () -> {
         atd $$1 = this.b($$0);
         return $$1 == null ? ati.a - 1 : Math.min($$1.k(), ati.a - 1);
      };
   }

   public String a(dlz $$0) {
      atd $$1 = this.b($$0.a());
      if ($$1 == null) {
         return "null";
      } else {
         String $$2 = $$1.j() + "\n";
         egz $$3 = $$1.u();
         efy $$4 = $$1.p();
         if ($$3 != null) {
            $$2 = $$2 + "St: §" + $$3.b() + $$3 + "§r\n";
         }

         if ($$4 != null) {
            $$2 = $$2 + "Ch: §" + $$4.n().b() + $$4.n() + "§r\n";
         }

         atp $$5 = $$1.s();
         $$2 = $$2 + '§' + $$5.ordinal() + $$5;
         return $$2 + "§r";
      }
   }

   private CompletableFuture<atg<List<efy>>> a(atd $$0, int $$1, IntFunction<egz> $$2) {
      if ($$1 == 0) {
         egz $$3 = $$2.apply(0);
         return $$0.a($$3, this).thenApply($$0x -> $$0x.a(List::of));
      } else {
         int $$4 = bcb.i($$1 * 2 + 1);
         List<CompletableFuture<atg<efy>>> $$5 = new ArrayList<>($$4);
         dlz $$6 = $$0.r();

         for (int $$7 = -$$1; $$7 <= $$1; $$7++) {
            for (int $$8 = -$$1; $$8 <= $$1; $$8++) {
               int $$9 = Math.max(Math.abs($$8), Math.abs($$7));
               long $$10 = dlz.c($$6.h + $$8, $$6.i + $$7);
               atd $$11 = this.a($$10);
               if ($$11 == null) {
                  return g;
               }

               egz $$12 = $$2.apply($$9);
               $$5.add($$11.a($$12, this));
            }
         }

         return ag.d($$5).thenApply($$0x -> {
            List<efy> $$1x = new ArrayList<>($$0x.size());

            for (atg<efy> $$2x : $$0x) {
               if ($$2x == null) {
                  throw this.a(new IllegalStateException("At least one of the chunk futures were null"), "n/a");
               }

               efy $$3 = $$2x.b(null);
               if ($$3 == null) {
                  return f;
               }

               $$1x.add($$3);
            }

            return atg.a($$1x);
         });
      }
   }

   public aa a(IllegalStateException $$0, String $$1) {
      StringBuilder $$2 = new StringBuilder();
      Consumer<atd> $$3 = $$1x -> $$1x.t().forEach($$2x -> {
         egz $$3x = (egz)$$2x.getFirst();
         CompletableFuture<atg<efy>> $$4x = (CompletableFuture<atg<efy>>)$$2x.getSecond();
         if ($$4x != null && $$4x.isDone() && $$4x.join() == null) {
            $$2.append($$1x.r()).append(" - status: ").append($$3x).append(" future: ").append($$4x).append(System.lineSeparator());
         }
      });
      $$2.append("Updating:").append(System.lineSeparator());
      this.p.values().forEach($$3);
      $$2.append("Visible:").append(System.lineSeparator());
      this.q.values().forEach($$3);
      p $$4 = p.a($$0, "Chunk loading");
      q $$5 = $$4.a("Chunk loading");
      $$5.a("Details", $$1);
      $$5.a("Futures", $$2);
      return new aa($$4);
   }

   public CompletableFuture<atg<egi>> a(atd $$0) {
      return this.a($$0, 2, $$0x -> egz.n).thenApply($$0x -> $$0x.a($$0xx -> (egi)$$0xx.get($$0xx.size() / 2)));
   }

   @Nullable
   atd a(long $$0, int $$1, @Nullable atd $$2, int $$3) {
      if (!ate.f($$3) && !ate.f($$1)) {
         return $$2;
      } else {
         if ($$2 != null) {
            $$2.a($$1);
         }

         if ($$2 != null) {
            if (!ate.f($$1)) {
               this.B.add($$0);
            } else {
               this.B.remove($$0);
            }
         }

         if (ate.f($$1) && $$2 == null) {
            $$2 = (atd)this.r.remove($$0);
            if ($$2 != null) {
               $$2.a($$1);
            } else {
               $$2 = new atd(new dlz($$0), $$1, this.t, this.u, this::a, this);
            }

            this.p.put($$0, $$2);
            this.C = true;
         }

         return $$2;
      }
   }

   private void a(dlz $$0, IntSupplier $$1, int $$2, IntConsumer $$3) {
      this.D.onLevelChange($$0, $$1, $$2, $$3);
      this.E.onLevelChange($$0, $$1, $$2, $$3);
   }

   @Override
   public void close() throws IOException {
      try {
         this.D.close();
         this.E.close();
         this.A.close();
      } finally {
         super.close();
      }
   }

   protected void a(boolean $$0) {
      if ($$0) {
         List<atd> $$1 = this.q.values().stream().filter(atd::l).peek(atd::m).toList();
         MutableBoolean $$2 = new MutableBoolean();

         do {
            $$2.setFalse();
            $$1.stream().map($$0x -> {
               this.v.b($$0x::h);
               return $$0x.p();
            }).filter($$0x -> $$0x instanceof egh || $$0x instanceof egi).filter(this::a).forEach($$1x -> $$2.setTrue());
         } while ($$2.isTrue());

         this.A.a();
         this.b(() -> true);
         this.o();
      } else {
         this.N.clear();
         long $$3 = ag.c();
         ObjectIterator var4 = this.q.values().iterator();

         while (var4.hasNext()) {
            atd $$4 = (atd)var4.next();
            this.a($$4, $$3);
         }
      }
   }

   protected void a(BooleanSupplier $$0) {
      btt $$1 = bts.a();
      $$1.a("poi");
      this.A.a($$0);
      $$1.b("chunk_unload");
      if (!this.t.w()) {
         this.b($$0);
      }

      $$1.c();
   }

   public boolean e() {
      return this.u.N_()
         || !this.r.isEmpty()
         || !this.p.isEmpty()
         || this.A.b()
         || !this.B.isEmpty()
         || !this.P.isEmpty()
         || this.D.a()
         || this.E.a()
         || this.H.d();
   }

   private void b(BooleanSupplier $$0) {
      for (LongIterator $$1 = this.B.iterator(); $$1.hasNext(); $$1.remove()) {
         long $$2 = $$1.nextLong();
         atd $$3 = (atd)this.p.get($$2);
         if ($$3 != null) {
            this.p.remove($$2);
            this.r.put($$2, $$3);
            this.C = true;
            this.a($$2, $$3);
         }
      }

      int $$4 = Math.max(0, this.P.size() - 2000);

      Runnable $$5;
      while (($$4 > 0 || $$0.getAsBoolean()) && ($$5 = this.P.poll()) != null) {
         $$4--;
         $$5.run();
      }

      this.c($$0);
   }

   private void c(BooleanSupplier $$0) {
      long $$1 = ag.c();
      int $$2 = 0;
      LongIterator $$3 = this.O.iterator();

      while ($$2 < 20 && this.Q.get() < 128 && $$0.getAsBoolean() && $$3.hasNext()) {
         long $$4 = $$3.nextLong();
         atd $$5 = (atd)this.q.get($$4);
         efy $$6 = $$5 != null ? $$5.p() : null;
         if ($$6 == null || !$$6.k()) {
            $$3.remove();
         } else if (this.a($$5, $$1)) {
            $$2++;
            $$3.remove();
         }
      }
   }

   private void a(long $$0, atd $$1) {
      CompletableFuture<?> $$2 = $$1.g();
      $$2.thenRunAsync(() -> {
         CompletableFuture<?> $$3 = $$1.g();
         if ($$3 != $$2) {
            this.a($$0, $$1);
         } else {
            efy $$4 = $$1.p();
            if (this.r.remove($$0, $$1) && $$4 != null) {
               if ($$4 instanceof egi $$5) {
                  $$5.b(false);
               }

               this.a($$4);
               if ($$4 instanceof egi $$6) {
                  this.t.b($$6);
               }

               this.u.a($$4.f());
               this.u.b();
               this.F.a($$4.f(), null);
               this.N.remove($$4.f().a());
            }
         }
      }, this.P::add).whenComplete(($$1x, $$2x) -> {
         if ($$2x != null) {
            k.error("Failed to save chunk {}", $$1.r(), $$2x);
         }
      });
   }

   protected boolean f() {
      if (!this.C) {
         return false;
      } else {
         this.q = this.p.clone();
         this.C = false;
         return true;
      }
   }

   private CompletableFuture<efy> g(dlz $$0) {
      CompletableFuture<Optional<eht>> $$1 = this.k($$0).thenApplyAsync($$1x -> $$1x.map($$1xx -> {
         eht $$2x = eht.a(this.t, this.t.K_(), $$1xx);
         if ($$2x == null) {
            k.error("Chunk file at {} is missing level data, skipping", $$0);
         }

         return $$2x;
      }), ag.h().a("parseChunk"));
      CompletableFuture<?> $$2 = this.A.a($$0);
      return $$1.<Object, Optional>thenCombine((CompletionStage<? extends Object>)$$2, ($$0x, $$1x) -> $$0x).thenApplyAsync($$1x -> {
         bts.a().f("chunkLoad");
         if ($$1x.isPresent()) {
            efy $$2x = ((eht)$$1x.get()).a(this.t, this.A, this.q(), $$0);
            this.a($$0, $$2x.n().d());
            return $$2x;
         } else {
            return this.h($$0);
         }
      }, this.v).exceptionallyAsync($$1x -> this.a($$1x, $$0), this.v);
   }

   private efy a(Throwable $$0, dlz $$1) {
      Throwable $$3 = $$0 instanceof CompletionException $$2 ? $$2.getCause() : $$0;
      Throwable $$5 = $$3 instanceof aa $$4 ? $$4.getCause() : $$3;
      boolean $$6 = $$5 instanceof Error;
      boolean $$7 = $$5 instanceof IOException || $$5 instanceof ut;
      if (!$$6) {
         if (!$$7) {
         }

         this.t.q().a($$5, this.q(), $$1);
         return this.h($$1);
      } else {
         p $$8 = p.a($$0, "Exception loading chunk");
         q $$9 = $$8.a("Chunk being loaded");
         $$9.a("pos", $$1);
         this.i($$1);
         throw new aa($$8);
      }
   }

   private efy h(dlz $$0) {
      this.i($$0);
      return new egs($$0, egv.a, this.t, this.t.K_().f(mn.aK), null);
   }

   private void i(dlz $$0) {
      this.M.put($$0.a(), (byte)-1);
   }

   private byte a(dlz $$0, ehd $$1) {
      return this.M.put($$0.a(), (byte)($$1 == ehd.a ? -1 : 1));
   }

   @Override
   public atr d(long $$0) {
      atd $$1 = (atd)this.p.get($$0);
      $$1.n();
      return $$1;
   }

   @Override
   public void a(atr $$0) {
      $$0.o();
   }

   @Override
   public CompletableFuture<efy> a(atr $$0, ehc $$1, bcx<atr> $$2) {
      dlz $$3 = $$0.r();
      if ($$1.a() == egz.c) {
         return this.g($$3);
      } else {
         try {
            atr $$4 = $$2.a($$3.h, $$3.i);
            efy $$5 = $$4.a($$1.a().c());
            if ($$5 == null) {
               throw new IllegalStateException("Parent chunk missing");
            } else {
               CompletableFuture<efy> $$6 = $$1.a(this.S, $$2, $$5);
               this.F.a($$3, $$1.a());
               return $$6;
            }
         } catch (Exception var8) {
            var8.getStackTrace();
            p $$8 = p.a(var8, "Exception generating new chunk");
            q $$9 = $$8.a("Chunk to be generated");
            $$9.a("Status being generated", () -> $$1.a().f());
            $$9.a("Location", String.format(Locale.ROOT, "%d,%d", $$3.h, $$3.i));
            $$9.a("Position hash", dlz.c($$3.h, $$3.i));
            $$9.a("Generator", this.a());
            this.v.execute(() -> {
               throw new aa($$8);
            });
            throw new aa($$8);
         }
      }
   }

   @Override
   public atc a(egz $$0, dlz $$1) {
      atc $$2 = atc.a(this, $$0, $$1);
      this.s.add($$2);
      return $$2;
   }

   private void a(atc $$0) {
      atr $$1 = $$0.c();
      this.D.a(() -> {
         CompletableFuture<?> $$1x = $$0.a();
         if ($$1x != null) {
            $$1x.thenRun(() -> this.a($$0));
         }
      }, $$1.r().a(), $$1::k);
   }

   @Override
   public void g() {
      this.s.forEach(this::a);
      this.s.clear();
   }

   public CompletableFuture<atg<egi>> b(atd $$0) {
      CompletableFuture<atg<List<efy>>> $$1 = this.a($$0, 1, $$0x -> egz.n);
      CompletableFuture<atg<egi>> $$2 = $$1.thenApplyAsync($$1x -> $$1x.a($$1xx -> {
         egi $$2x = (egi)$$1xx.get($$1xx.size() / 2);
         $$2x.a(this.t);
         this.t.c($$2x);
         CompletableFuture<?> $$3 = $$0.f();
         if ($$3.isDone()) {
            this.a($$0, $$2x);
         } else {
            $$3.thenAcceptAsync($$2xx -> this.a($$0, $$2x), this.v);
         }

         return $$2x;
      }), this.v);
      $$2.handle(($$0x, $$1x) -> {
         this.I.getAndIncrement();
         return null;
      });
      return $$2;
   }

   private void a(atd $$0, egi $$1) {
      dlz $$2 = $$1.f();

      for (auc $$3 : this.K.a()) {
         if ($$3.V().a($$2)) {
            a($$3, $$1);
         }
      }

      this.t.n().a($$0);
   }

   public CompletableFuture<atg<egi>> c(atd $$0) {
      return this.a($$0, 1, ate::b).thenApply($$0x -> $$0x.a($$0xx -> (egi)$$0xx.get($$0xx.size() / 2)));
   }

   public int h() {
      return this.I.get();
   }

   private boolean a(atd $$0, long $$1) {
      if ($$0.l() && $$0.h()) {
         efy $$2 = $$0.p();
         if (!($$2 instanceof egh) && !($$2 instanceof egi)) {
            return false;
         } else if (!$$2.k()) {
            return false;
         } else {
            long $$3 = $$2.f().a();
            long $$4 = this.N.getOrDefault($$3, -1L);
            if ($$1 < $$4) {
               return false;
            } else {
               boolean $$5 = this.a($$2);
               $$0.m();
               if ($$5) {
                  this.N.put($$3, $$1 + 10000L);
               }

               return $$5;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(efy $$0) {
      this.A.b($$0.f());
      if (!$$0.j()) {
         return false;
      } else {
         dlz $$1 = $$0.f();

         try {
            egz $$2 = $$0.n();
            if ($$2.d() != ehd.b) {
               if (this.j($$1)) {
                  return false;
               }

               if ($$2 == egz.c && $$0.g().values().stream().noneMatch(evg::b)) {
                  return false;
               }
            }

            bts.a().f("chunkSave");
            this.Q.incrementAndGet();
            eht $$3 = eht.a(this.t, $$0);
            CompletableFuture<ui> $$4 = CompletableFuture.supplyAsync($$3::a, ag.h());
            this.a($$1, $$4::join).handle(($$1x, $$2x) -> {
               if ($$2x != null) {
                  this.t.q().b($$2x, this.q(), $$1);
               }

               this.Q.decrementAndGet();
               return null;
            });
            this.a($$1, $$2.d());
            return true;
         } catch (Exception var6) {
            this.t.q().b(var6, this.q(), $$1);
            return false;
         }
      }
   }

   private boolean j(dlz $$0) {
      byte $$1 = this.M.get($$0.a());
      if ($$1 != 0) {
         return $$1 == 1;
      } else {
         ui $$2;
         try {
            $$2 = this.k($$0).join().orElse(null);
            if ($$2 == null) {
               this.i($$0);
               return false;
            }
         } catch (Exception var5) {
            k.error("Failed to read chunk {}", $$0, var5);
            this.i($$0);
            return false;
         }

         ehd $$5 = eht.a($$2).d();
         return this.a($$0, $$5) == 1;
      }
   }

   protected void a(int $$0) {
      int $$1 = bcb.a($$0, 2, 32);
      if ($$1 != this.R) {
         this.R = $$1;
         this.H.a(this.R);

         for (auc $$2 : this.K.a()) {
            this.e($$2);
         }
      }
   }

   int b(auc $$0) {
      return bcb.a($$0.F(), 2, this.R);
   }

   private void a(auc $$0, dlz $$1) {
      egi $$2 = this.e($$1.a());
      if ($$2 != null) {
         a($$0, $$2);
      }
   }

   private static void a(auc $$0, egi $$1) {
      $$0.g.g.a($$1);
   }

   private static void b(auc $$0, dlz $$1) {
      $$0.g.g.a($$0, $$1);
   }

   @Nullable
   public egi e(long $$0) {
      atd $$1 = this.b($$0);
      return $$1 == null ? null : $$1.e();
   }

   public int i() {
      return this.q.size();
   }

   public ato j() {
      return this.H;
   }

   protected Iterable<atd> k() {
      return Iterables.unmodifiableIterable(this.q.values());
   }

   void a(Writer $$0) throws IOException {
      baz $$1 = baz.a()
         .a("x")
         .a("z")
         .a("level")
         .a("in_memory")
         .a("status")
         .a("full_status")
         .a("accessible_ready")
         .a("ticking_ready")
         .a("entity_ticking_ready")
         .a("ticket")
         .a("spawning")
         .a("block_entity_count")
         .a("ticking_ticket")
         .a("ticking_level")
         .a("block_ticks")
         .a("fluid_ticks")
         .a($$0);
      ObjectBidirectionalIterator var3 = this.q.long2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<atd> $$2 = (Entry<atd>)var3.next();
         long $$3 = $$2.getLongKey();
         dlz $$4 = new dlz($$3);
         atd $$5 = (atd)$$2.getValue();
         Optional<efy> $$6 = Optional.ofNullable($$5.p());
         Optional<egi> $$7 = $$6.flatMap($$0x -> $$0x instanceof egi ? Optional.of((egi)$$0x) : Optional.empty());
         $$1.a(
            $$4.h,
            $$4.i,
            $$5.j(),
            $$6.isPresent(),
            $$6.map(efy::n).orElse(null),
            $$7.map(egi::G).orElse(null),
            a($$5.c()),
            a($$5.a()),
            a($$5.b()),
            this.z.b($$3, false),
            this.b($$4),
            $$7.<Integer>map($$0x -> $$0x.J().size()).orElse(0),
            this.z.b($$3, true),
            this.H.a($$3, true),
            $$7.<Integer>map($$0x -> $$0x.q().a()).orElse(0),
            $$7.<Integer>map($$0x -> $$0x.r().a()).orElse(0)
         );
      }
   }

   private static String a(CompletableFuture<atg<egi>> $$0) {
      try {
         atg<egi> $$1 = $$0.getNow(null);
         if ($$1 != null) {
            return $$1.a() ? "done" : "unloaded";
         } else {
            return "not completed";
         }
      } catch (CompletionException var2) {
         return "failed " + var2.getCause().getMessage();
      } catch (CancellationException var3) {
         return "cancelled";
      }
   }

   private CompletableFuture<Optional<ui>> k(dlz $$0) {
      return this.d($$0).thenApplyAsync($$0x -> $$0x.map(this::b), ag.h().a("upgradeChunk"));
   }

   private ui b(ui $$0) {
      return this.a(this.t.aj(), this.y, $$0, this.a().c());
   }

   void a(List<egi> $$0) {
      LongIterator $$1 = this.H.b();

      while ($$1.hasNext()) {
         atd $$2 = (atd)this.q.get($$1.nextLong());
         if ($$2 != null) {
            egi $$3 = $$2.d();
            if ($$3 != null && this.l($$2.r())) {
               $$0.add($$3);
            }
         }
      }
   }

   void a(Consumer<egi> $$0) {
      this.H.a($$1 -> {
         atd $$2 = (atd)this.q.get($$1);
         if ($$2 != null) {
            egi $$3 = $$2.d();
            if ($$3 != null) {
               $$0.accept($$3);
            }
         }
      });
   }

   boolean b(dlz $$0) {
      bdi $$1 = this.H.e($$0.a());
      return $$1 == bdi.c ? this.l($$0) : $$1.a(true);
   }

   private boolean l(dlz $$0) {
      for (auc $$1 : this.K.a()) {
         if (this.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public List<auc> c(dlz $$0) {
      long $$1 = $$0.a();
      if (!this.H.e($$1).a(true)) {
         return List.of();
      } else {
         Builder<auc> $$2 = ImmutableList.builder();

         for (auc $$3 : this.K.a()) {
            if (this.c($$3, $$0)) {
               $$2.add($$3);
            }
         }

         return $$2.build();
      }
   }

   private boolean c(auc $$0, dlz $$1) {
      if ($$0.am()) {
         return false;
      } else {
         double $$2 = a($$1, $$0.dv());
         return $$2 < 16384.0;
      }
   }

   private static double a(dlz $$0, fis $$1) {
      double $$2 = ke.a($$0.h, 8);
      double $$3 = ke.a($$0.i, 8);
      double $$4 = $$2 - $$1.d;
      double $$5 = $$3 - $$1.f;
      return $$4 * $$4 + $$5 * $$5;
   }

   private boolean c(auc $$0) {
      return $$0.am() && !this.t.P().c(dmq.s);
   }

   void a(auc $$0, boolean $$1) {
      boolean $$2 = this.c($$0);
      boolean $$3 = this.K.d($$0);
      if ($$1) {
         this.K.a($$0, $$2);
         this.d($$0);
         if (!$$2) {
            this.H.a(ke.a($$0), $$0);
         }

         $$0.a(atk.a);
         this.e($$0);
      } else {
         ke $$4 = $$0.U();
         this.K.a($$0);
         if (!$$3) {
            this.H.b($$4, $$0);
         }

         this.a($$0, atk.a);
      }
   }

   private void d(auc $$0) {
      ke $$1 = ke.a($$0);
      $$0.a($$1);
   }

   public void a(auc $$0) {
      ObjectIterator $$2 = this.L.values().iterator();

      while ($$2.hasNext()) {
         atf.b $$1 = (atf.b)$$2.next();
         if ($$1.c == $$0) {
            $$1.a(this.t.A());
         } else {
            $$1.b($$0);
         }
      }

      ke $$2x = $$0.U();
      ke $$3 = ke.a($$0);
      boolean $$4 = this.K.e($$0);
      boolean $$5 = this.c($$0);
      boolean $$6 = $$2x.s() != $$3.s();
      if ($$6 || $$4 != $$5) {
         this.d($$0);
         if (!$$4) {
            this.H.b($$2x, $$0);
         }

         if (!$$5) {
            this.H.a($$3, $$0);
         }

         if (!$$4 && $$5) {
            this.K.b($$0);
         }

         if ($$4 && !$$5) {
            this.K.c($$0);
         }

         this.e($$0);
      }
   }

   private void e(auc $$0) {
      dlz $$1 = $$0.dz();
      int $$2 = this.b($$0);
      if (!($$0.V() instanceof atk.a $$3 && $$3.a().equals($$1) && $$3.b() == $$2)) {
         this.a($$0, atk.a($$1, $$2));
      }
   }

   private void a(auc $$0, atk $$1) {
      if ($$0.y() == this.t) {
         atk $$2 = $$0.V();
         if ($$1 instanceof atk.a $$3 && !($$2 instanceof atk.a $$4 && $$4.a().equals($$3.a()))) {
            $$0.g.b(new afu($$3.a().h, $$3.a().i));
         }

         atk.a($$2, $$1, $$1x -> this.a($$0, $$1x), $$1x -> b($$0, $$1x));
         $$0.a($$1);
      }
   }

   @Override
   public List<auc> a(dlz $$0, boolean $$1) {
      Set<auc> $$2 = this.K.a();
      Builder<auc> $$3 = ImmutableList.builder();

      for (auc $$4 : $$2) {
         if ($$1 && this.b($$4, $$0.h, $$0.i) || !$$1 && this.a($$4, $$0.h, $$0.i)) {
            $$3.add($$4);
         }
      }

      return $$3.build();
   }

   protected void a(bzm $$0) {
      if (!($$0 instanceof cpp)) {
         bzv<?> $$1 = $$0.ap();
         int $$2 = $$1.o() * 16;
         if ($$2 != 0) {
            int $$3 = $$1.p();
            if (this.L.containsKey($$0.ar())) {
               throw (IllegalStateException)ag.b(new IllegalStateException("Entity is already tracked!"));
            } else {
               atf.b $$4 = new atf.b($$0, $$2, $$3, $$1.q());
               this.L.put($$0.ar(), $$4);
               $$4.a(this.t.A());
               if ($$0 instanceof auc $$5) {
                  this.a($$5, true);
                  ObjectIterator var7 = this.L.values().iterator();

                  while (var7.hasNext()) {
                     atf.b $$6 = (atf.b)var7.next();
                     if ($$6.c != $$5) {
                        $$6.b($$5);
                     }
                  }
               }
            }
         }
      }
   }

   protected void b(bzm $$0) {
      if ($$0 instanceof auc $$1) {
         this.a($$1, false);
         ObjectIterator var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            atf.b $$2 = (atf.b)var3.next();
            $$2.a($$1);
         }
      }

      atf.b $$3 = (atf.b)this.L.remove($$0.ar());
      if ($$3 != null) {
         $$3.a();
      }
   }

   protected void l() {
      for (auc $$0 : this.K.a()) {
         this.e($$0);
      }

      List<auc> $$1 = Lists.newArrayList();
      List<auc> $$2 = this.t.A();
      ObjectIterator var3 = this.L.values().iterator();

      while (var3.hasNext()) {
         atf.b $$3 = (atf.b)var3.next();
         ke $$4 = $$3.e;
         ke $$5 = ke.a($$3.c);
         boolean $$6 = !Objects.equals($$4, $$5);
         if ($$6) {
            $$3.a($$2);
            bzm $$7 = $$3.c;
            if ($$7 instanceof auc) {
               $$1.add((auc)$$7);
            }

            $$3.e = $$5;
         }

         if ($$6 || this.H.c($$5.r().a())) {
            $$3.b.a();
         }
      }

      if (!$$1.isEmpty()) {
         var3 = this.L.values().iterator();

         while (var3.hasNext()) {
            atf.b $$8 = (atf.b)var3.next();
            $$8.a($$1);
         }
      }
   }

   public void a(bzm $$0, zw<?> $$1) {
      atf.b $$2 = (atf.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   protected void b(bzm $$0, zw<?> $$1) {
      atf.b $$2 = (atf.b)this.L.get($$0.ar());
      if ($$2 != null) {
         $$2.b($$1);
      }
   }

   public void b(List<efy> $$0) {
      Map<auc, List<egi>> $$1 = new HashMap<>();

      for (efy $$2 : $$0) {
         dlz $$3 = $$2.f();
         egi $$5;
         if ($$2 instanceof egi $$4) {
            $$5 = $$4;
         } else {
            $$5 = this.t.d($$3.h, $$3.i);
         }

         for (auc $$7 : this.a($$3, false)) {
            $$1.computeIfAbsent($$7, $$0x -> new ArrayList<>()).add($$5);
         }
      }

      $$1.forEach(($$0x, $$1x) -> $$0x.g.b(adf.a($$1x)));
   }

   protected clp m() {
      return this.A;
   }

   public String n() {
      return this.J;
   }

   void a(dlz $$0, atp $$1) {
      this.G.onChunkStatusChange($$0, $$1);
   }

   public void a(dlz $$0, int $$1) {
      int $$2 = $$1 + 1;
      dlz.a($$0, $$2).forEach($$0x -> {
         atd $$1x = this.b($$0x.a());
         if ($$1x != null) {
            $$1x.a(this.u.a($$0x.h, $$0x.i));
         }
      });
   }

   class a extends ato {
      protected a(final dnr $$0, final Executor $$1, final Executor $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      protected boolean a(long $$0) {
         return atf.this.B.contains($$0);
      }

      @Nullable
      @Override
      protected atd b(long $$0) {
         return atf.this.a($$0);
      }

      @Nullable
      @Override
      protected atd a(long $$0, int $$1, @Nullable atd $$2, int $$3) {
         return atf.this.a($$0, $$1, $$2, $$3);
      }
   }

   class b {
      final atz b;
      final bzm c;
      private final int d;
      ke e;
      private final Set<avi> f = Sets.newIdentityHashSet();

      public b(final bzm $$0, final int $$1, final int $$2, final boolean $$3) {
         this.b = new atz(atf.this.t, $$0, $$2, $$3, this::a, this::a);
         this.c = $$0;
         this.d = $$1;
         this.e = ke.a($$0);
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof atf.b ? ((atf.b)$$0).c.ar() == this.c.ar() : false;
      }

      @Override
      public int hashCode() {
         return this.c.ar();
      }

      public void a(zw<?> $$0) {
         for (avi $$1 : this.f) {
            $$1.b($$0);
         }
      }

      public void a(zw<?> $$0, List<UUID> $$1) {
         for (avi $$2 : this.f) {
            if (!$$1.contains($$2.o().cK())) {
               $$2.b($$0);
            }
         }
      }

      public void b(zw<?> $$0) {
         this.a($$0);
         if (this.c instanceof auc) {
            ((auc)this.c).g.b($$0);
         }
      }

      public void a() {
         for (avi $$0 : this.f) {
            this.b.a($$0.o());
         }
      }

      public void a(auc $$0) {
         if (this.f.remove($$0.g)) {
            this.b.a($$0);
         }
      }

      public void b(auc $$0) {
         if ($$0 != this.c) {
            fis $$1 = $$0.dv().d(this.c.dv());
            int $$2 = atf.this.b($$0);
            double $$3 = Math.min(this.b(), $$2 * 16);
            double $$4 = $$1.d * $$1.d + $$1.f * $$1.f;
            double $$5 = $$3 * $$3;
            boolean $$6 = $$4 <= $$5 && this.c.a($$0) && atf.this.a($$0, this.c.dz().h, this.c.dz().i);
            if ($$6) {
               if (this.f.add($$0.g)) {
                  this.b.b($$0);
               }
            } else if (this.f.remove($$0.g)) {
               this.b.a($$0);
            }
         }
      }

      private int a(int $$0) {
         return atf.this.t.q().b($$0);
      }

      private int b() {
         int $$0 = this.d;

         for (bzm $$1 : this.c.de()) {
            int $$2 = $$1.ap().o() * 16;
            if ($$2 > $$0) {
               $$0 = $$2;
            }
         }

         return this.a($$0);
      }

      public void a(List<auc> $$0) {
         for (auc $$1 : $$0) {
            this.b($$1);
         }
      }
   }
}
