import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class cdt extends ccd<cok> {
   public static final int c = 200;
   public static final float d = 1.65F;
   private final Function<cok, bwu> e;
   private final clc f;
   private final float g;
   private final ToDoubleFunction<cok> h;
   private fis i;
   private final Function<cok, ayy> j;
   private final Function<cok, ayy> k;

   public cdt(Function<cok, bwu> $$0, clc $$1, float $$2, ToDoubleFunction<cok> $$3, Function<cok, ayy> $$4, Function<cok, ayy> $$5) {
      super(ImmutableMap.of(cjo.W, cjp.b, cjo.X, cjp.a), 200);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.j = $$4;
      this.k = $$5;
      this.i = fis.c;
   }

   protected boolean a(aub $$0, cok $$1) {
      return $$1.eh().a(cjo.X);
   }

   protected boolean a(aub $$0, cok $$1, long $$2) {
      return $$1.eh().a(cjo.X);
   }

   protected void b(aub $$0, cok $$1, long $$2) {
      jb $$3 = $$1.dx();
      cbm<?> $$4 = $$1.eh();
      fis $$5 = $$4.c(cjo.X).get();
      this.i = new fis($$3.u() - $$5.a(), 0.0, $$3.w() - $$5.c()).d();
      $$4.a(cjo.n, new cjr($$5, this.g, 0));
   }

   protected void c(aub $$0, cok $$1, long $$2) {
      List<cam> $$3 = $$0.a(cam.class, this.f, $$1, $$1.cV());
      cbm<?> $$4 = $$1.eh();
      if (!$$3.isEmpty()) {
         cam $$5 = $$3.get(0);
         byb $$6 = $$0.al().c((cam)$$1);
         float $$7 = (float)$$1.i(cbs.c);
         if ($$5.a($$0, $$6, $$7)) {
            djk.a($$0, (bzm)$$5, $$6);
         }

         int $$8 = $$1.d(bys.a) ? $$1.e(bys.a).e() + 1 : 0;
         int $$9 = $$1.d(bys.b) ? $$1.e(bys.b).e() + 1 : 0;
         float $$10 = 0.25F * ($$8 - $$9);
         float $$11 = bcb.a($$1.fu() * 1.65F, 0.2F, 3.0F) + $$10;
         byb $$12 = $$0.al().b((cam)$$1);
         float $$13 = $$5.b($$0, $$12, $$7);
         float $$14 = $$13 > 0.0F ? 0.5F : 1.0F;
         $$5.p($$14 * $$11 * this.h.applyAsDouble($$1), this.i.a(), this.i.c());
         this.b($$0, $$1);
         $$0.a(null, $$1, this.j.apply($$1), aza.g, 1.0F, 1.0F);
      } else if (this.c($$0, $$1)) {
         $$0.a(null, $$1, this.j.apply($$1), aza.g, 1.0F, 1.0F);
         boolean $$15 = $$1.gJ();
         if ($$15) {
            $$0.a(null, $$1, this.k.apply($$1), aza.g, 1.0F, 1.0F);
         }

         this.b($$0, $$1);
      } else {
         Optional<cjr> $$16 = $$4.c(cjo.n);
         Optional<fis> $$17 = $$4.c(cjo.X);
         boolean $$18 = $$16.isEmpty() || $$17.isEmpty() || $$16.get().a().a().a($$17.get(), 0.25);
         if ($$18) {
            this.b($$0, $$1);
         }
      }
   }

   private boolean c(aub $$0, cok $$1) {
      fis $$2 = $$1.dA().d(1.0, 0.0, 1.0).d();
      jb $$3 = jb.a((jv)$$1.dv().e($$2));
      return $$0.a_($$3).a(azo.ct) || $$0.a_($$3.d()).a(azo.ct);
   }

   protected void b(aub $$0, cok $$1) {
      $$0.a($$1, (byte)59);
      $$1.eh().a(cjo.W, this.e.apply($$1).a($$0.A));
      $$1.eh().b(cjo.X);
   }
}
