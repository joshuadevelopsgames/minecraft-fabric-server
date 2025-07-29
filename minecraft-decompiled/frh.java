import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frh extends hyg {
   private static final ame a = ame.b("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final get G;
   @Nullable
   private fpx H;
   private final long I;
   private final xo[] J = new xo[]{xo.c("mco.brokenworld.message.line1"), xo.c("mco.brokenworld.message.line2")};
   private int K;
   private final List<Integer> L = Lists.newArrayList();
   private int M;

   public frh(get $$0, long $$1, boolean $$2) {
      super($$2 ? xo.c("mco.brokenworld.minigame.title") : xo.c("mco.brokenworld.title"));
      this.G = $$0;
      this.I = $$1;
   }

   @Override
   public void aV_() {
      this.K = this.o / 2 - 150;
      this.c(fxo.a(xn.k, $$0 -> this.aP_()).a((this.o - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.H == null) {
         this.a(this.I);
      } else {
         this.l();
      }
   }

   @Override
   public xo i() {
      return xr.a(Stream.concat(Stream.of(this.m), Stream.of(this.J)).collect(Collectors.toList()), xn.w);
   }

   private void l() {
      for (Entry<Integer, fqb> $$0 : this.H.j.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.H.q || this.H.j();
         fxo $$3;
         if ($$2) {
            $$3 = fxo.a(xo.c("mco.brokenworld.play"), $$1x -> this.n.a(new fro(this.G, new ftj(this.H.b, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.H.j.get($$1).b.l;
         } else {
            $$3 = fxo.a(
                  xo.c("mco.brokenworld.download"),
                  $$1x -> this.n.a(frs.a(this, xo.c("mco.configure.world.restore.download.question.line1"), $$1xx -> this.b($$1)))
               )
               .a(this.a($$1), g(8), 80, 20)
               .a();
         }

         if (this.L.contains($$1)) {
            $$3.j = false;
            $$3.b(xo.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.M++;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.J.length; $$4++) {
         $$0.a(this.q, this.J[$$4], this.o / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.H != null) {
         for (Entry<Integer, fqb> $$5 : this.H.j.entrySet()) {
            if ($$5.getValue().b.k != null && $$5.getValue().b.j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.H.q == $$5.getKey() && !this.m(),
                  $$5.getValue().b.a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().b.j,
                  $$5.getValue().b.k,
                  $$5.getValue().b.l
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.H.q == $$5.getKey() && !this.m(),
                  $$5.getValue().b.a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().b.l
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.K + ($$0 - 1) * 110;
   }

   public get a(fqx $$0) {
      return new frm($$0, this.G);
   }

   private void a(long $$0) {
      fsu.<fpx>a($$1 -> $$1.a($$0), fsu.a(this::a, "Couldn't get own world")).thenAcceptAsync($$0x -> {
         this.H = $$0x;
         this.l();
      }, this.n);
   }

   public void b() {
      new Thread(() -> {
         foq $$0 = foq.a();
         if (this.H.f == fpx.c.a) {
            this.n.execute(() -> this.n.a(new fro(this, new ftd(this.H, this, true, this.n))));
         } else {
            try {
               fpx $$1 = $$0.a(this.I);
               this.n.execute(() -> fol.a($$1, this));
            } catch (fqx var3) {
               b.error("Couldn't get own world", var3);
               this.n.execute(() -> this.n.a(this.a(var3)));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      foq $$1 = foq.a();

      try {
         fqr $$2 = $$1.b(this.H.b, $$0);
         frl $$3 = new frl(this, $$2, this.H.a($$0), $$1x -> {
            if ($$1x) {
               this.L.add($$0);
               this.q();
               this.l();
            } else {
               this.n.a(this);
            }
         });
         this.n.a($$3);
      } catch (fqx var5) {
         b.error("Couldn't download world data", var5);
         this.n.a(new frm(var5, this));
      }
   }

   @Override
   public void aP_() {
      this.n.a(this.G);
   }

   private boolean m() {
      return this.H != null && this.H.j();
   }

   private void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ame $$11;
      if ($$10) {
         $$11 = frd.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fst.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = frd.b;
      } else if ($$7 == 2) {
         $$11 = frd.c;
      } else if ($$7 == 3) {
         $$11 = frd.d;
      } else {
         $$11 = fst.a(String.valueOf(this.H.s), this.H.t);
      }

      if ($$5) {
         float $$17 = 0.9F + 0.1F * bcb.b(this.M * 0.2F);
         $$0.a(gxx.ar, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, baj.a(1.0F, $$17, $$17, $$17));
         $$0.a(gxx.ar, a, $$1, $$2, 80, 80);
      } else {
         int $$18 = baj.a(1.0F, 0.56F, 0.56F, 0.56F);
         $$0.a(gxx.ar, $$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74, 74, 74, $$18);
         $$0.a(gxx.ar, a, $$1, $$2, 80, 80, $$18);
      }

      $$0.a(this.q, $$6, $$1 + 40, $$2 + 66, -1);
   }
}
