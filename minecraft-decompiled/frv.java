import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frv extends hyg {
   static final Logger a = LogUtils.getLogger();
   static final ame b = ame.b("widget/slot_frame");
   private static final xo c = xo.c("mco.template.button.select");
   private static final xo G = xo.c("mco.template.button.trailer");
   private static final xo H = xo.c("mco.template.button.publisher");
   private static final int I = 100;
   private static final int J = 10;
   private final gbk K = new gbk(this);
   final Consumer<fqs> L;
   frv.b M;
   private final fpx.d N;
   private fxo O;
   private fxo P;
   private fxo Q;
   @Nullable
   fqs R = null;
   @Nullable
   String S;
   @Nullable
   private xo[] T;
   @Nullable
   List<fsv.a> U;

   public frv(xo $$0, Consumer<fqs> $$1, fpx.d $$2) {
      this($$0, $$1, $$2, null);
   }

   public frv(xo $$0, Consumer<fqs> $$1, fpx.d $$2, @Nullable fqt $$3) {
      super($$0);
      this.L = $$1;
      this.N = $$2;
      if ($$3 == null) {
         this.M = new frv.b();
         this.a(new fqt(10));
      } else {
         this.M = new frv.b(Lists.newArrayList($$3.a));
         this.a($$3);
      }
   }

   public void a(xo... $$0) {
      this.T = $$0;
   }

   @Override
   public void aV_() {
      this.K.a(this.m, this.q);
      this.M = this.K.c(new frv.b(this.M.c()));
      gbo $$0 = this.K.b(gbo.e().a(10));
      $$0.c().b();
      this.P = $$0.a(fxo.a(G, $$0x -> this.n()).a(100).a());
      this.O = $$0.a(fxo.a(c, $$0x -> this.m()).a(100).a());
      $$0.a(fxo.a(xn.e, $$0x -> this.aP_()).a(100).a());
      this.Q = $$0.a(fxo.a(H, $$0x -> this.G()).a(100).a());
      this.l();
      this.K.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.M.b(this.o, this.p - this.K.b() - this.H());
      this.K.a();
   }

   @Override
   public xo i() {
      List<xo> $$0 = Lists.newArrayListWithCapacity(2);
      $$0.add(this.m);
      if (this.T != null) {
         $$0.addAll(Arrays.asList(this.T));
      }

      return xn.a($$0);
   }

   void l() {
      this.Q.k = this.R != null && !this.R.e.isEmpty();
      this.P.k = this.R != null && !this.R.g.isEmpty();
      this.O.j = this.R != null;
   }

   @Override
   public void aP_() {
      this.L.accept(null);
   }

   private void m() {
      if (this.R != null) {
         this.L.accept(this.R);
      }
   }

   private void n() {
      if (this.R != null && !this.R.g.isBlank()) {
         gdq.a(this, this.R.g);
      }
   }

   private void G() {
      if (this.R != null && !this.R.e.isBlank()) {
         gdq.a(this, this.R.e);
      }
   }

   private void a(final fqt $$0) {
      (new Thread("realms-template-fetcher") {
         @Override
         public void run() {
            fqt $$0x = $$0;
            foq $$1 = foq.a();

            while ($$0x != null) {
               Either<fqt, Exception> $$2 = frv.this.a($$0x, $$1);
               $$0x = frv.this.n.a(() -> {
                  if ($$2.right().isPresent()) {
                     frv.a.error("Couldn't fetch templates", (Throwable)$$2.right().get());
                     if (frv.this.M.b()) {
                        frv.this.U = fsv.a(htb.a("mco.template.select.failure"));
                     }

                     return null;
                  } else {
                     fqt $$1x = (fqt)$$2.left().get();

                     for (fqs $$2x : $$1x.a) {
                        frv.this.M.a($$2x);
                     }

                     if ($$1x.a.isEmpty()) {
                        if (frv.this.M.b()) {
                           String $$3 = htb.a("mco.template.select.none", "%link");
                           fsv.b $$4 = fsv.b.a(htb.a("mco.template.select.none.linkTitle"), bav.t.toString());
                           frv.this.U = fsv.a($$3, $$4);
                        }

                        return null;
                     } else {
                        return $$1x;
                     }
                  }
               }).join();
            }
         }
      }).start();
   }

   Either<fqt, Exception> a(fqt $$0, foq $$1) {
      try {
         return Either.left($$1.a($$0.b + 1, $$0.c, this.N));
      } catch (fqx var4) {
         return Either.right(var4);
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.S = null;
      if (this.U != null) {
         this.a($$0, $$1, $$2, this.U);
      }

      if (this.T != null) {
         for (int $$4 = 0; $$4 < this.T.length; $$4++) {
            xo $$5 = this.T[$$4];
            $$0.a(this.q, $$5, this.o / 2, g(-1 + $$4), -6250336);
         }
      }
   }

   private void a(fxb $$0, int $$1, int $$2, List<fsv.a> $$3) {
      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         fsv.a $$5 = $$3.get($$4);
         int $$6 = g(4 + $$4);
         int $$7 = $$5.a.stream().mapToInt($$0x -> this.q.b($$0x.a())).sum();
         int $$8 = this.o / 2 - $$7 / 2;

         for (fsv.b $$9 : $$5.a) {
            int $$10 = $$9.b() ? -13408581 : -1;
            String $$11 = $$9.a();
            $$0.b(this.q, $$11, $$8, $$6, $$10);
            int $$12 = $$8 + this.q.b($$11);
            if ($$9.b() && $$1 > $$8 && $$1 < $$12 && $$2 > $$6 - 3 && $$2 < $$6 + 8) {
               $$0.a(xo.b($$9.c()), $$1, $$2);
               this.S = $$9.c();
            }

            $$8 = $$12;
         }
      }
   }

   int H() {
      return this.T != null ? g(1) : 33;
   }

   class a extends fyl.a<frv.a> {
      private static final fzd c = new fzd(ame.b("icon/link"), ame.b("icon/link_highlighted"));
      private static final fzd d = new fzd(ame.b("icon/video_link"), ame.b("icon/video_link_highlighted"));
      private static final xo e = xo.c("mco.template.info.tooltip");
      private static final xo f = xo.c("mco.template.trailer.tooltip");
      public final fqs a;
      private long g;
      @Nullable
      private fya h;
      @Nullable
      private fya i;

      public a(final fqs $$0) {
         this.a = $$0;
         if (!$$0.e.isBlank()) {
            this.h = new fya(15, 15, c, gdq.b(frv.this, $$0.e), e);
            this.h.a(fzb.a(e));
         }

         if (!$$0.g.isBlank()) {
            this.i = new fya(15, 15, d, gdq.b(frv.this, $$0.g), f);
            this.i.a(fzb.a(f));
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         frv.this.R = this.a;
         frv.this.l();
         if (ag.c() - this.g < 250L && this.aM_()) {
            frv.this.L.accept(this.a);
         }

         this.g = ag.c();
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return super.a($$0, $$1, $$2);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(gxx.ar, fst.a(this.a.a, this.a.f), $$3 + 1, $$2 + 1 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
         $$0.a(gxx.ar, frv.b, $$3, $$2 + 1, 40, 40);
         int $$10 = 5;
         int $$11 = frv.this.q.b(this.a.c);
         if (this.h != null) {
            this.h.c($$3 + $$4 - $$11 - this.h.z() - 10, $$2);
            this.h.a($$0, $$6, $$7, $$9);
         }

         if (this.i != null) {
            this.i.c($$3 + $$4 - $$11 - this.i.z() * 2 - 15, $$2);
            this.i.a($$0, $$6, $$7, $$9);
         }

         int $$12 = $$3 + 45 + 20;
         int $$13 = $$2 + 5;
         $$0.b(frv.this.q, this.a.b, $$12, $$13, -1);
         $$0.b(frv.this.q, this.a.c, $$3 + $$4 - $$11 - 5, $$13, -9671572);
         $$0.b(frv.this.q, this.a.d, $$12, $$13 + 9 + 5, -6250336);
         if (!this.a.h.isBlank()) {
            $$0.b(frv.this.q, this.a.h, $$12, $$2 + $$5 - 9 / 2 - 5, -11776948);
         }
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(
            xo.b(this.a.b), xo.a("mco.template.select.narrate.authors", this.a.d), xo.b(this.a.h), xo.a("mco.template.select.narrate.version", this.a.c)
         );
         return xo.a("narrator.select", $$0);
      }
   }

   class b extends fyl<frv.a> {
      public b() {
         this(Collections.emptyList());
      }

      public b(final Iterable<fqs> $$0) {
         super(fue.R(), frv.this.o, frv.this.p - 33 - frv.this.H(), frv.this.H(), 46);
         $$0.forEach(this::a);
      }

      public void a(fqs $$0) {
         this.b(frv.this.new a($$0));
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (frv.this.S != null) {
            gdq.a(frv.this, frv.this.S);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      }

      public void a(@Nullable frv.a $$0) {
         super.a($$0);
         frv.this.R = $$0 == null ? null : $$0.a;
         frv.this.l();
      }

      @Override
      public int a() {
         return 300;
      }

      public boolean b() {
         return this.t() == 0;
      }

      public List<fqs> c() {
         return this.aH_().stream().map($$0 -> $$0.a).collect(Collectors.toList());
      }
   }
}
