import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class ccs extends ccd<cuf> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<amd<cui>, amd<fdo>> g = ImmutableMap.builder()
      .put(cui.c, fdf.ar)
      .put(cui.d, fdf.as)
      .put(cui.e, fdf.at)
      .put(cui.f, fdf.au)
      .put(cui.g, fdf.av)
      .put(cui.h, fdf.aw)
      .put(cui.i, fdf.ax)
      .put(cui.j, fdf.ay)
      .put(cui.k, fdf.az)
      .put(cui.l, fdf.aA)
      .put(cui.n, fdf.aB)
      .put(cui.o, fdf.aC)
      .put(cui.p, fdf.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public ccs(int $$0) {
      super(ImmutableMap.of(cjo.n, cjp.c, cjo.o, cjp.c, cjo.r, cjp.c, cjo.k, cjp.a), $$0);
   }

   protected boolean a(aub $$0, cuf $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aub $$0, cuf $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cut $$3 = this.c($$1).get();
      $$1.eh().a(cjo.r, $$3);
      ccf.a($$1, $$3);
   }

   protected boolean b(aub $$0, cuf $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      cut $$3 = this.c($$1).get();
      ccf.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$0, $$1, $$3);
            this.j = true;
         }
      } else {
         ccf.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aub $$0, cuf $$1, long $$2) {
      this.i = a($$0);
      $$1.eh().b(cjo.r);
      $$1.eh().b(cjo.n);
      $$1.eh().b(cjo.o);
   }

   private void a(aub $$0, cuf $$1, cam $$2) {
      $$1.a($$0, a($$1), ($$2x, $$3) -> ccf.a($$1, $$3, $$2.dv()));
   }

   private static amd<fdo> a(cuf $$0) {
      if ($$0.g_()) {
         return fdf.aF;
      } else {
         Optional<amd<cui>> $$1 = $$0.gR().b().e();
         return $$1.isEmpty() ? fdf.aE : g.getOrDefault($$1.get(), fdf.aE);
      }
   }

   private boolean b(cuf $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cut> c(cuf $$0) {
      return $$0.eh().c(cjo.k).filter(this::a);
   }

   private boolean a(cut $$0) {
      return $$0.d(bys.F);
   }

   private boolean a(cuf $$0, cut $$1) {
      jb $$2 = $$1.dx();
      jb $$3 = $$0.dx();
      return $$3.a($$2, 5.0);
   }

   private static int a(aub $$0) {
      return 600 + $$0.A.a(6001);
   }
}
