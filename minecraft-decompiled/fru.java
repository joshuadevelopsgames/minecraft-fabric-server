import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fru extends hyg {
   private static final Logger b = LogUtils.getLogger();
   public static final xo a = xo.c("mco.upload.select.world.title");
   private static final xo c = xo.c("selectWorld.unable_to_load");
   static final xo G = xo.c("selectWorld.world");
   private static final DateFormat H = new SimpleDateFormat();
   @Nullable
   private final fte I;
   private final frt J;
   private final long K;
   private final int L;
   fxo M;
   List<fct> N = Lists.newArrayList();
   int O = -1;
   fru.b P;

   public fru(@Nullable fte $$0, long $$1, int $$2, frt $$3) {
      super(a);
      this.I = $$0;
      this.J = $$3;
      this.K = $$1;
      this.L = $$2;
   }

   private void l() {
      fcs.a $$0 = this.n.m().b();
      this.N = this.n.m().a($$0).join().stream().filter(fct::v).collect(Collectors.toList());

      for (fct $$1 : this.N) {
         this.P.a($$1);
      }
   }

   @Override
   public void aV_() {
      this.P = this.c(new fru.b());

      try {
         this.l();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.n.a(new frm(c, xo.a(var2.getMessage()), this.J));
         return;
      }

      this.M = this.c(fxo.a(xo.c("mco.upload.button.name"), $$0 -> this.m()).a(this.o / 2 - 154, this.p - 32, 153, 20).a());
      this.M.j = this.O >= 0 && this.O < this.N.size();
      this.c(fxo.a(xn.k, $$0 -> this.n.a(this.J)).a(this.o / 2 + 6, this.p - 32, 153, 20).a());
      this.a(new hyf(xo.c("mco.upload.select.world.subtitle"), this.o / 2, g(-1), -6250336));
      if (this.N.isEmpty()) {
         this.a(new hyf(xo.c("mco.upload.select.world.none"), this.o / 2, this.p / 2 - 20, -1));
      }
   }

   @Override
   public xo i() {
      return xn.a(this.o(), this.E());
   }

   private void m() {
      if (this.O != -1) {
         fct $$0 = this.N.get(this.O);
         this.n.a(new frx(this.I, this.K, this.L, this.J, $$0));
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.n.a(this.J);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xo a(fct $$0) {
      return $$0.h().d();
   }

   static String b(fct $$0) {
      return H.format(new Date($$0.f()));
   }

   class a extends fyl.a<fru.a> {
      private final fct b;
      private final String c;
      private final xo d;
      private final xo e;

      public a(final fct $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xo.a("mco.upload.entry.id", $$0.a(), fru.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fru.this.P.a(fru.this.N.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fxb $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fru.G + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fru.this.q, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fru.this.q, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fru.this.q, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(xo.b(this.b.b()), xo.b(fru.b(this.b)), fru.a(this.b));
         return xo.a("narrator.select", $$0);
      }
   }

   class b extends fyl<fru.a> {
      public b() {
         super(fue.R(), fru.this.o, fru.this.p - 40 - fru.g(0), fru.g(0), 36);
      }

      public void a(fct $$0) {
         this.b(fru.this.new a($$0));
      }

      public void a(@Nullable fru.a $$0) {
         super.a($$0);
         fru.this.O = this.aH_().indexOf($$0);
         fru.this.M.j = fru.this.O >= 0 && fru.this.O < this.t();
      }

      @Override
      public int a() {
         return (int)(this.g * 0.6);
      }
   }
}
