import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class har extends gzw {
   public static final float a = 0.6666667F;
   private static final fis b = new fis(0.0, 0.33333334F, 0.046666667F);
   private final Map<efp, har.a> c;

   public har(had.a $$0) {
      super($$0);
      this.c = efp.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new har.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gof a(eeb $$0, efp $$1) {
      har.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dyf ? $$2.a() : $$2.b();
   }

   @Override
   protected hua a(efp $$0) {
      return gyi.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fod $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fod $$0, float $$1, eeb $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dyf)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fis c() {
      return b;
   }

   public static void a(fod $$0, gxn $$1, int $$2, int $$3, gof $$4, hua $$5) {
      $$0.a();
      a($$0);
      fog $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static void a(fod $$0) {
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
   }

   public static gof a(gqj $$0, efp $$1, boolean $$2) {
      gql $$3 = $$2 ? gqm.a($$1) : gqm.b($$1);
      return new gof.a($$0.a($$3), gxz::g);
   }

   public static gqt a(boolean $$0) {
      gqv $$1 = new gqv();
      gqx $$2 = $$1.a();
      $$2.a("sign", gqs.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gqp.a);
      if ($$0) {
         $$2.a("stick", gqs.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gqp.a);
      }

      return gqt.a($$1, 64, 32);
   }

   record a(gof a, gof b) {
   }
}
