import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsa extends hyg {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.backup");
   static final xo c = xo.c("mco.backup.button.restore");
   static final xo G = xo.c("mco.backup.changes.tooltip");
   private static final xo H = xo.c("mco.backup.nobackups");
   private static final xo I = xo.c("mco.backup.button.download");
   private static final String J = "uploaded";
   private static final int K = 8;
   final fsc L;
   List<fph> M = Collections.emptyList();
   @Nullable
   fsa.a N;
   final gbk O = new gbk(this);
   private final int P;
   @Nullable
   fxo Q;
   final fpx R;
   boolean S = false;

   public fsa(fsc $$0, fpx $$1, int $$2) {
      super(b);
      this.L = $$0;
      this.R = $$1;
      this.P = $$2;
   }

   @Override
   public void aV_() {
      this.O.a(b, this.q);
      this.N = this.O.c(new fsa.a());
      gbo $$0 = this.O.b(gbo.e().a(8));
      this.Q = $$0.a(fxo.a(I, $$0x -> this.m()).a());
      this.Q.j = false;
      $$0.a(fxo.a(xn.k, $$0x -> this.aP_()).a());
      this.O.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
      this.l();
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S && this.N != null) {
         $$0.b(this.q, H, this.o / 2 - this.q.a(H) / 2, this.N.F() + this.N.y() / 2 - 9 / 2, -1);
      }
   }

   @Override
   protected void c() {
      this.O.a();
      if (this.N != null) {
         this.N.a(this.o, this.O);
      }
   }

   private void l() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            foq $$0 = foq.a();

            try {
               List<fph> $$1 = $$0.e(fsa.this.R.b).a;
               fsa.this.n.execute(() -> {
                  fsa.this.M = $$1;
                  fsa.this.S = fsa.this.M.isEmpty();
                  if (!fsa.this.S && fsa.this.Q != null) {
                     fsa.this.Q.j = true;
                  }

                  if (fsa.this.N != null) {
                     fsa.this.N.a(fsa.this.M.stream().map($$0xx -> fsa.this.new b($$0xx)).toList());
                  }
               });
            } catch (fqx var3) {
               fsa.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aP_() {
      this.n.a(this.L);
   }

   private void m() {
      this.n
         .a(
            frs.a(
               this,
               xo.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.n
                  .a(
                     new fro(
                        this.L.n(),
                        new fta(this.R.b, this.P, Objects.requireNonNullElse(this.R.d, "") + " (" + this.R.j.get(this.R.q).b.a(this.R.q) + ")", this)
                     )
                  )
            )
         );
   }

   class a extends fxu<fsa.b> {
      private static final int a = 36;

      public a() {
         super(fue.R(), fsa.this.o, fsa.this.O.d(), fsa.this.O.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fxu.a<fsa.b> {
      private static final int b = 2;
      private final fph c;
      @Nullable
      private fxo d;
      @Nullable
      private fxo e;
      private final List<fxm> f = new ArrayList<>();

      public b(final fph $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fxo.a(fsa.G, $$0x -> fsa.this.n.a(new frz(fsa.this, this.c)))
               .a(8 + fsa.this.q.a(fsa.G))
               .a($$0x -> xn.a(xo.a("mco.backup.narration", this.c()), (xo)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fsa.this.R.k) {
            this.d = fxo.a(fsa.c, $$0x -> this.g()).a(8 + fsa.this.q.a(fsa.G)).a($$0x -> xn.a(xo.a("mco.backup.narration", this.c()), (xo)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fph $$0) {
         int $$1 = fsa.this.M.indexOf($$0);
         if ($$1 != fsa.this.M.size() - 1) {
            fph $$2 = fsa.this.M.get($$1 + 1);

            for (String $$3 : $$0.d.keySet()) {
               if (!$$3.contains("uploaded") && $$2.d.containsKey($$3)) {
                  if (!$$0.d.get($$3).equals($$2.d.get($$3))) {
                     this.a($$3);
                  }
               } else {
                  this.a($$3);
               }
            }
         }
      }

      private void a(String $$0) {
         if ($$0.contains("uploaded")) {
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
            this.c.e.put($$0, $$1);
            this.c.a(true);
         } else {
            this.c.e.put($$0, this.c.d.get($$0));
         }
      }

      private String c() {
         return DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
      }

      private void g() {
         xo $$0 = fsu.a(this.c.b);
         xo $$1 = xo.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fsa.this.n.a(frs.b(fsa.this, $$1, $$0x -> {
            fsc $$1x = fsa.this.L.n();
            fsa.this.n.a(new fro($$1x, new fth(this.c, fsa.this.R.b, $$1x)));
         }));
      }

      @Override
      public List<? extends fzn> aH_() {
         return this.f;
      }

      @Override
      public List<? extends gbr> b() {
         return this.f;
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fsa.this.q, xo.a("mco.backup.entry", fsu.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fsa.this.q, this.a(this.c.b), $$3, $$12, -11776948);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.z() + 8;
            this.d.j($$3 + $$4 - $$14);
            this.d.k($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.z() + 8;
            this.e.j($$3 + $$4 - $$14);
            this.e.k($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
