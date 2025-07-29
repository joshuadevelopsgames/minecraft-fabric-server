import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.joml.Matrix4f;

public class hbu {
   private static final int a = baj.a(255, 255, 100, 255);
   private static final int b = baj.a(255, 100, 255, 255);
   private static final int c = baj.a(255, 0, 255, 0);
   private static final int d = baj.a(255, 255, 165, 0);
   private static final int e = baj.a(255, 255, 0, 0);
   private static final int f = 20;
   private static final float g = (float) (Math.PI / 10);
   private final fue h;
   private final Map<Integer, abd.a> i = new HashMap<>();

   public hbu(fue $$0) {
      this.h = $$0;
   }

   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      gwi $$5 = this.h.t;
      $$5.ai().a(bzv.s, $$5.cV().g(100.0), $$0x -> true).forEach($$6 -> {
         Optional<abd.a> $$7 = Optional.ofNullable(this.i.get($$6.ar()));
         $$7.map(abd.a::d).map($$1xx -> $$5.ai().a($$1xx)).map($$0xx -> $$0xx.p(this.h.aw().a(true))).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dv(), $$6x, b);
            fis $$7x = $$6x.b(0.0, 0.01F, 0.0);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gxz.a(2.0)), $$7x, 4.0F, c);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gxz.a(2.0)), $$7x, 8.0F, d);
            a($$0.c().a(), $$2, $$3, $$4, $$1.getBuffer(gxz.a(2.0)), $$7x, 24.0F, e);
         });
         $$7.map(abd.a::e).ifPresent($$6x -> {
            a($$0, $$1, $$2, $$3, $$4, $$6.dv(), $$6x.b(), a);
            hbz.a($$0, $$1, fin.a(fis.a($$6x)).d(-$$2, -$$3, -$$4), 1.0F, 0.0F, 0.0F, 1.0F);
         });
      });
   }

   private static void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4, fis $$5, fis $$6, int $$7) {
      fog $$8 = $$1.getBuffer(gxz.a(2.0));
      $$8.a($$0.c(), (float)($$5.d - $$2), (float)($$5.e - $$3), (float)($$5.f - $$4)).a($$7);
      $$8.a($$0.c(), (float)($$6.d - $$2), (float)($$6.e - $$3), (float)($$6.f - $$4)).a($$7);
   }

   private static void a(Matrix4f $$0, double $$1, double $$2, double $$3, fog $$4, fis $$5, float $$6, int $$7) {
      for (int $$8 = 0; $$8 < 20; $$8++) {
         a($$8, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }

      a(0, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void a(int $$0, Matrix4f $$1, double $$2, double $$3, double $$4, fog $$5, fis $$6, float $$7, int $$8) {
      float $$9 = $$0 * (float) (Math.PI / 10);
      fis $$10 = $$6.b($$7 * Math.cos($$9), 0.0, $$7 * Math.sin($$9));
      $$5.a($$1, (float)($$10.d - $$2), (float)($$10.e - $$3), (float)($$10.f - $$4)).a($$8);
   }

   public void a() {
      this.i.clear();
   }

   public void a(abd.a $$0) {
      this.i.put($$0.c(), $$0);
   }
}
