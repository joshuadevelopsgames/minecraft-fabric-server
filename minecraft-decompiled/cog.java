import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cog extends ccd<coc> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ayy l;
   private final ayy m;
   private fis n;
   private cog.a o = cog.a.d;

   public cog(ayy $$0, ayy $$1) {
      super(ImmutableMap.of(cjo.n, cjp.b, cjo.o, cjp.c, cjo.p, cjp.a, cjo.aa, cjp.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aub $$0, coc $$1) {
      cam $$2 = $$1.eh().c(cjo.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eh().b(cjo.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != cay.i && coc.i($$2);
   }

   protected boolean a(aub $$0, coc $$1, long $$2) {
      return $$1.eh().a(cjo.p) && this.o != cog.a.d && !$$1.eh().a(cjo.aa);
   }

   protected void b(aub $$0, coc $$1, long $$2) {
      cam $$3 = $$1.eh().c(cjo.p).get();
      ccf.a($$1, $$3);
      $$1.G($$3);
      $$1.eh().a(cjo.n, new cjr($$3.dv(), 2.0F, 0));
      this.k = 10;
      this.o = cog.a.a;
   }

   protected void c(aub $$0, coc $$1, long $$2) {
      $$1.eh().b(cjo.p);
      $$1.m();
      $$1.b(cay.a);
   }

   private void b(aub $$0, coc $$1) {
      $$0.a(null, $$1, this.m, aza.g, 2.0F, 1.0F);
      Optional<bzm> $$2 = $$1.n();
      if ($$2.isPresent()) {
         bzm $$3 = $$2.get();
         if ($$3.bO()) {
            $$1.c($$0, $$3);
            if (!$$3.bO()) {
               $$3.a(bzm.e.a);
            }
         }
      }
   }

   protected void d(aub $$0, coc $$1, long $$2) {
      cam $$3 = $$1.eh().c(cjo.p).get();
      $$1.G($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aza.g, 2.0F, 1.0F);
               $$1.b(cay.j);
               $$3.i($$3.dv().a($$1.dv()).d().c(0.75));
               this.n = $$3.dv();
               this.j = 0;
               this.o = cog.a.b;
            } else if (this.k <= 0) {
               $$1.eh().a(cjo.n, new cjr($$3.dv(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cog.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cog.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(coc $$0, cam $$1) {
      faz $$2 = $$0.S().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(coc $$0, cam $$1) {
      List<UUID> $$2 = $$0.eh().c(cjo.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cK());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cK());
      }

      $$0.eh().a(cjo.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
