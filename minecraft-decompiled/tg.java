import com.google.common.base.Stopwatch;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class tg extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final amz o = new amz(null, ServicesKeySet.EMPTY, null, null);
   private static final cyd p = cyf.e.a().d(cyd.a(cyf.c, cyf.d));
   private final bru q = new bru(4);
   private final Optional<String> r;
   private final boolean s;
   private List<ss> t = new ArrayList<>();
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final eky v = new eky(0L, false, false);
   @Nullable
   private tn w;

   public static tg a(Thread $$0, fcs.c $$1, awz $$2, Optional<String> $$3, boolean $$4) {
      $$2.a();
      ArrayList<String> $$5 = new ArrayList<>($$2.c());
      $$5.remove("vanilla");
      $$5.addFirst("vanilla");
      dns $$6 = new dns(new dmh($$5, List.of()), p);
      dmy $$7 = new dmy("Test Level", dmr.b, false, bxg.c, true, new dmq(p), $$6);
      anc.d $$8 = new anc.d($$2, $$6, false, true);
      anc.c $$9 = new anc.c($$8, el.a.b, 4);

      try {
         l.debug("Starting resource loading");
         Stopwatch $$10 = Stopwatch.createStarted();
         and $$11 = ag.<and>c($$2x -> anc.a($$9, $$1xx -> {
            jy<ehz> $$2xx = new jt<>(mn.bv, Lifecycle.stable()).n();
            ekv.b $$3x = $$1xx.c().e(mn.bt).b(euo.b).a().a().a($$2xx);
            return new anc.b<>(new fcw($$7, v, $$3x.d(), $$3x.a()), $$3x.b());
         }, and::new, ag.h(), $$2x)).get();
         $$10.stop();
         l.debug("Finished resource loading after {} ms", $$10.elapsed(TimeUnit.MILLISECONDS));
         return new tg($$0, $$1, $$2, $$11, $$3, $$4);
      } catch (Exception var12) {
         l.warn("Failed to load vanilla datapack, bit oops", var12);
         System.exit(-1);
         throw new IllegalStateException();
      }
   }

   private tg(Thread $$0, fcs.c $$1, awz $$2, and $$3, Optional<String> $$4, boolean $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bds.a(), o, aun::b);
      this.r = $$4;
      this.s = $$5;
   }

   @Override
   public boolean e() {
      this.a(new ayb(this, this.bb(), this.g, 1) {});
      this.u_();
      aub $$0 = this.J();
      this.t = this.b($$0);
      l.info("Started game test server");
      return true;
   }

   private List<ss> b(aub $$0) {
      jy<ta> $$1 = $$0.K_().f(mn.bm);
      Collection<jl.c<ta>> $$2;
      st.a $$3;
      if (this.r.isPresent()) {
         $$2 = a($$0.K_(), this.r.get()).filter($$0x -> !((ta)$$0x.a()).i()).toList();
         if (this.s) {
            $$3 = tg::a;
            l.info("Verify requested. Will run each test that matches {} {} times", this.r.get(), 100 * dwu.values().length);
         } else {
            $$3 = st.a;
            l.info("Will run tests matching {} ({} tests)", this.r.get(), $$2.size());
         }
      } else {
         $$2 = $$1.c().filter($$0x -> !((ta)$$0x.a()).i()).toList();
         $$3 = st.a;
      }

      return st.a($$2, $$3, $$0);
   }

   private static Stream<sz> a(jl.c<ta> $$0, aub $$1) {
      Builder<sz> $$2 = Stream.builder();

      for (dwu $$3 : dwu.values()) {
         for (int $$4 = 0; $$4 < 100; $$4++) {
            $$2.add(new sz($$0, $$3, $$1, tp.a()));
         }
      }

      return $$2.build();
   }

   public static Stream<jl.c<ta>> a(jz $$0, String $$1) {
      return fr.a(new StringReader($$1), $$0.f(mn.bm)).stream();
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aub $$1 = this.J();
      if (!this.br()) {
         this.c($$1);
      }

      if ($$1.ae() % 20L == 0L) {
         l.info(this.w.j());
      }

      if (this.w.i()) {
         this.a(false);
         l.info(this.w.j());
         tk.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.w.h(), this.u.stop());
         if (this.w.d()) {
            l.info("{} required tests failed :(", this.w.a());
            this.w.f().forEach(tg::a);
         } else {
            l.info("All {} required tests passed :)", this.w.h());
         }

         if (this.w.e()) {
            l.info("{} optional tests failed", this.w.b());
            this.w.g().forEach(tg::a);
         }

         l.info("====================================================");
      }
   }

   private static void a(sz $$0) {
      if ($$0.u() != dwu.a) {
         l.info("   - {} with rotation {}: {}", new Object[]{$$0.b(), $$0.u().c(), $$0.n().a().getString()});
      } else {
         l.info("   - {}: {}", $$0.b(), $$0.n().a().getString());
      }
   }

   @Override
   public brx f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void w_() {
      this.bA();
   }

   @Override
   public ae a(ae $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void i() {
      super.i();
      l.info("Game test server shutting down");
      System.exit(this.w != null ? this.w.a() : -1);
   }

   @Override
   public void a(p $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.a(z.a));
      System.exit(1);
   }

   private void c(aub $$0) {
      jb $$1 = new jb($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      $$0.a($$1, 0.0F);
      te $$2 = te.a.a(this.t, $$0).a((te.c)(new tq($$1, 8, false))).a();
      Collection<sz> $$3 = $$2.a();
      this.w = new tn($$3);
      l.info("{} tests are now running at position {}!", this.w.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean br() {
      return this.w != null;
   }

   @Override
   public boolean v_() {
      return false;
   }

   @Override
   public int k() {
      return 0;
   }

   @Override
   public int l() {
      return 4;
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public int o() {
      return 0;
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
