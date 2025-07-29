import java.util.function.Function;

public class hhy<S extends hlq, M extends gnh<S> & gnt> extends hit<S, M> {
   private static final float a = 0.625F;
   private static final float b = 1.1875F;
   private final hhy.a c;
   private final Function<dxm.a, gph> d;

   public hhy(hgc<S, M> $$0, gqj $$1) {
      this($$0, $$1, hhy.a.a);
   }

   public hhy(hgc<S, M> $$0, gqj $$1, hhy.a $$2) {
      super($$0);
      this.c = $$2;
      this.d = ag.b($$1x -> has.a($$1, $$1x));
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.av.e() || $$3.ax != null) {
         $$0.a();
         $$0.b(this.c.c(), 1.0F, this.c.c());
         M $$6 = this.d();
         $$6.e().a($$0);
         $$6.b().a($$0);
         if ($$3.ax != null) {
            $$0.a(0.0F, this.c.b(), 0.0F);
            $$0.b(1.1875F, -1.1875F, -1.1875F);
            $$0.a(-0.5, 0.0, -0.5);
            dxm.a $$7 = $$3.ax;
            gph $$8 = this.d.apply($$7);
            gxz $$9 = has.a($$7, $$3.ay);
            has.a(null, 180.0F, $$3.aw, $$0, $$1, $$2, $$8, $$9);
         } else {
            a($$0, this.c);
            $$3.av.a($$0, $$1, $$2, hri.d);
         }

         $$0.b();
      }
   }

   public static void a(fod $$0, hhy.a $$1) {
      $$0.a(0.0F, -0.25F + $$1.a(), 0.0F);
      $$0.a(a.d.rotationDegrees(180.0F));
      $$0.b(0.625F, -0.625F, -0.625F);
   }

   public record a(float b, float c, float d) {
      public static final hhy.a a = new hhy.a(0.0F, 0.0F, 1.0F);

      public float a() {
         return this.b;
      }

      public float b() {
         return this.c;
      }

      public float c() {
         return this.d;
      }
   }
}
