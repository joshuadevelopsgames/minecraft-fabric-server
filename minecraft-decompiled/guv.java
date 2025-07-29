import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class guv implements axi {
   private static final Logger b = LogUtils.getLogger();
   private static final alx c = alx.a("particles");
   private static final int d = 16384;
   private static final List<gux> e = List.of(gux.a, gux.b, gux.c);
   protected grk a;
   private final Map<gux, Queue<gut>> f = Maps.newIdentityHashMap();
   private final Queue<gvv> g = Queues.newArrayDeque();
   private final bck h = bck.a();
   private final Int2ObjectMap<guw<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gut> j = Queues.newArrayDeque();
   private final Map<ame, guv.b> k = Maps.newHashMap();
   private final hrr l;
   private final Object2IntOpenHashMap<mb> m = new Object2IntOpenHashMap();

   public guv(grk $$0, hru $$1) {
      this.l = new hrr(hrr.d);
      $$1.a(this.l.f(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(me.a, guk.a::new);
      this.a(me.c, new gtl.a());
      this.a(me.b, new gvs.c());
      this.a(me.d, gto.a::new);
      this.a(me.at, gtn.a::new);
      this.a(me.ar, gtp.a::new);
      this.a(me.aw, gtq.a::new);
      this.a(me.ax, gtq.b::new);
      this.a(me.e, guy.a::new);
      this.a(me.R, gvr.a::new);
      this.a(me.f, gtr.c::new);
      this.a(me.as, gwa.a::new);
      this.a(me.g, gtr.a::new);
      this.a(me.h, gts.a::new);
      this.a(me.av, gvr.b::new);
      this.a(me.i, gtt::c);
      this.a(me.j, gtt::d);
      this.a(me.k, gtt::e);
      this.a(me.l, gtt::a);
      this.a(me.m, gtt::b);
      this.a(me.n, gtv.a::new);
      this.a(me.o, gtu.a::new);
      this.a(me.p, gvl.c::new);
      this.a(me.q, new guq.a());
      this.a(me.r, gtr.b::new);
      this.a(me.s, gug.a::new);
      this.a(me.t, gty.a::new);
      this.a(me.u, gvl.b::new);
      this.a(me.v, new gum.a());
      this.a(me.w, gul.a::new);
      this.a(me.B, gvj.a::new);
      this.a(me.C, gua.a::new);
      this.a(me.x, gui.a::new);
      this.a(me.y, gui.b::new);
      this.a(me.z, new guj.a(3.0, 7, 0));
      this.a(me.A, new guj.a(1.0, 3, 2));
      this.a(me.D, gud.d::new);
      this.a(me.E, gvz.a::new);
      this.a(me.F, gue.a::new);
      this.a(me.G, gvl.c::new);
      this.a(me.K, gvk.a::new);
      this.a(me.L, gvc.a::new);
      this.a(me.M, gvd.a::new);
      this.a(me.O, gvk.b::new);
      this.a(me.N, gue.a::new);
      this.a(me.P, gud.a::new);
      this.a(me.Q, gvr.d::new);
      this.a(me.S, guk.b::new);
      this.a(me.T, gvl.a::new);
      this.a(me.U, new gtm.c());
      this.a(me.X, new gtm.d());
      this.a(me.Y, new gtm.a());
      this.a(me.Z, new gtm.e());
      this.a(me.aa, guo.a::new);
      this.a(me.ab, gup.a::new);
      this.a(me.ac, gvr.e::new);
      this.a(me.au, gug.b::new);
      this.a(me.ad, gus.a::new);
      this.a(me.ae, gtz.a::new);
      this.a(me.af, guz.a::new);
      this.a(me.ag, gwb.a::new);
      this.a(me.ah, gvh.a::new);
      this.a(me.ai, gwd.a::new);
      this.a(me.aj, guy.b::new);
      this.a(me.aN, gvi.a::new);
      this.a(me.ak, gvm.a::new);
      this.a(me.am, gtj.a::new);
      this.a(me.an, gvu.a::new);
      this.a(me.al, gvp.b::new);
      this.a(me.ao, gvq.c::new);
      this.a(me.ap, gvn.a::new);
      this.a(me.aq, gvl.d::new);
      this.a(me.ay, gtt::f);
      this.a(me.az, gtt::g);
      this.a(me.aA, gtt::h);
      this.a(me.aB, gtt::m);
      this.a(me.aC, gtt::n);
      this.a(me.aG, gvq.b::new);
      this.a(me.aD, gti.a::new);
      this.a(me.aE, gvq.a::new);
      this.a(me.aF, gvq.d::new);
      this.a(me.aH, gtt::o);
      this.a(me.aI, gtt::p);
      this.a(me.aJ, gtt::q);
      this.a(me.aK, gva.a::new);
      this.a(me.aL, gwc.a::new);
      this.a(me.aM, gue.b::new);
      this.a(me.aQ, gtt::i);
      this.a(me.aR, gtt::j);
      this.a(me.H, gub.a::new);
      this.a(me.I, gub.b::new);
      this.a(me.J, gub.c::new);
      this.a(me.aO, gtt::k);
      this.a(me.aP, gtt::l);
      this.a(me.V, gvy.a::new);
      this.a(me.W, gvw.a::new);
      this.a(me.aS, gvp.a::new);
      this.a(me.aT, guh.b::new);
      this.a(me.aU, guh.e::new);
      this.a(me.aV, guh.d::new);
      this.a(me.aW, guh.a::new);
      this.a(me.aX, guh.c::new);
      this.a(me.aY, gve.a::new);
      this.a(me.aZ, gvr.c::new);
      this.a(me.ba, gtx.a::new);
      this.a(me.bb, gvx.a::new);
      this.a(me.bc, gvx.a::new);
      this.a(me.bd, gug.c::new);
      this.a(me.be, new gvs.b());
      this.a(me.bg, gvl.c::new);
      this.a(me.bh, gvl.c::new);
      this.a(me.bf, guf.a::new);
      this.a(me.bi, new gvs.a());
      this.a(me.bj, guc.a::new);
   }

   private <T extends mc> void a(md<T> $$0, guw<T> $$1) {
      this.i.put(mm.i.a($$0), $$1);
   }

   private <T extends mc> void a(md<T> $$0, guw.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
         gvt $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
         if ($$10 != null) {
            $$10.a($$1x);
         }

         return $$10;
      });
   }

   private <T extends mc> void a(md<T> $$0, guv.c<T> $$1) {
      guv.b $$2 = new guv.b();
      this.k.put(mm.i.b($$0), $$2);
      this.i.put(mm.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> reload(axi.a $$0, axo $$1, Executor $$2, Executor $$3) {
      record a(ame a, Optional<List<ame>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<ame, axm>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ame $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ag.d($$2x);
      });
      CompletableFuture<hrn.a> $$5 = hrn.a(this.l).a($$1, hts.j, 0, $$2).thenCompose(hrn.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         btt $$3x = bts.a();
         $$3x.a("upload");
         hrn.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<ame> $$5x = new HashSet<>();
         hrs $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<ame>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hrs> $$5xx = new ArrayList<>();

               for (ame $$6x : $$4xx.get()) {
                  hrs $$7 = $$4x.f().get($$6x);
                  if ($$7 == null) {
                     $$5x.add($$6x);
                     $$5xx.add($$6);
                  } else {
                     $$5xx.add($$7);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6);
               }

               this.k.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ame::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.e();
   }

   private Optional<List<ame>> a(ame $$0, axm $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               guu $$3 = guu.a(bbq.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bzm $$0, mc $$1) {
      this.g.add(new gvv(this.a, $$0, $$1));
   }

   public void a(bzm $$0, mc $$1, int $$2) {
      this.g.add(new gvv(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gut a(mc $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gut $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends mc> gut b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      guw<T> $$7 = (guw<T>)this.i.get(mm.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gut $$0) {
      Optional<mb> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.j.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.j.add($$0);
      }
   }

   public void b() {
      this.f.forEach(($$0, $$1x) -> {
         bts.a().a($$0.toString());
         this.a($$1x);
         bts.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gvv> $$0 = Lists.newArrayList();

         for (gvv $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gut $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gut> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gut> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gut $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(mb $$0, int $$1) {
      this.m.addTo($$0, $$1);
   }

   private void b(gut $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         p $$2 = p.a(var5, "Ticking Particle");
         q $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new aa($$2);
      }
   }

   public void a(ftm $$0, float $$1, gxn.a $$2) {
      for (gux $$3 : e) {
         Queue<gut> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gut> $$5 = this.f.get(gux.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(ftm $$0, float $$1, gxn.a $$2, gux $$3, Queue<gut> $$4) {
      fog $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gut $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            p $$8 = p.a(var11, "Rendering Particle");
            q $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new aa($$8);
         }
      }
   }

   private static void a(ftm $$0, float $$1, gxn.a $$2, Queue<gut> $$3) {
      fod $$4 = new fod();

      for (gut $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            p $$7 = p.a(var10, "Rendering Particle");
            q $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new aa($$7);
         }
      }
   }

   public void a(@Nullable grk $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(jb $$0, eeb $$1) {
      if (!$$1.l() && $$1.D()) {
         fjm $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
            double $$8 = Math.min(1.0, $$5 - $$2x);
            double $$9 = Math.min(1.0, $$6 - $$3x);
            double $$10 = Math.min(1.0, $$7 - $$4);
            int $$11 = Math.max(2, bcb.c($$8 / 0.25));
            int $$12 = Math.max(2, bcb.c($$9 / 0.25));
            int $$13 = Math.max(2, bcb.c($$10 / 0.25));

            for (int $$14 = 0; $$14 < $$11; $$14++) {
               for (int $$15 = 0; $$15 < $$12; $$15++) {
                  for (int $$16 = 0; $$16 < $$13; $$16++) {
                     double $$17 = ($$14 + 0.5) / $$11;
                     double $$18 = ($$15 + 0.5) / $$12;
                     double $$19 = ($$16 + 0.5) / $$13;
                     double $$20 = $$17 * $$8 + $$2x;
                     double $$21 = $$18 * $$9 + $$3x;
                     double $$22 = $$19 * $$10 + $$4;
                     this.a(new gvs(this.a, $$0.u() + $$20, $$0.v() + $$21, $$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0));
                  }
               }
            }
         });
      }
   }

   public void a(jb $$0, jh $$1) {
      eeb $$2 = this.a.a_($$0);
      if ($$2.o() != dwn.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fin $$7 = $$2.f(this.a, $$0).a();
         double $$8 = $$3 + this.h.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = $$4 + this.h.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = $$5 + this.h.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jh.a) {
            $$9 = $$4 + $$7.b - 0.1F;
         }

         if ($$1 == jh.b) {
            $$9 = $$4 + $$7.e + 0.1F;
         }

         if ($$1 == jh.c) {
            $$10 = $$5 + $$7.c - 0.1F;
         }

         if ($$1 == jh.d) {
            $$10 = $$5 + $$7.f + 0.1F;
         }

         if ($$1 == jh.e) {
            $$8 = $$3 + $$7.a - 0.1F;
         }

         if ($$1 == jh.f) {
            $$8 = $$3 + $$7.d + 0.1F;
         }

         this.a(new gvs(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String c() {
      return String.valueOf(this.f.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(mb $$0) {
      return this.m.getInt($$0) < $$0.a();
   }

   private void e() {
      this.f.clear();
      this.j.clear();
      this.g.clear();
      this.m.clear();
   }

   static class b implements gvo {
      private List<hrs> a;

      @Override
      public hrs a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hrs a(bck $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hrs> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends mc> {
      guw<T> create(gvo var1);
   }
}
