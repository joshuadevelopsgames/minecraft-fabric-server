import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class han extends gzw {
   private static final String b = "plank";
   private static final String c = "vChains";
   private static final String d = "normalChains";
   private static final String e = "chainL1";
   private static final String f = "chainL2";
   private static final String g = "chainR1";
   private static final String h = "chainR2";
   private static final String i = "board";
   public static final float a = 1.0F;
   private static final float j = 0.9F;
   private static final fis k = new fis(0.0, -0.32F, 0.073F);
   private final Map<han.b, gof> l;

   public han(had.a $$0) {
      super($$0);
      Stream<han.b> $$1 = efp.a().flatMap($$0x -> Arrays.stream(han.a.values()).map($$1x -> new han.b($$0x, $$1x)));
      this.l = $$1.collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1x -> a($$0.f(), $$1x.a, $$1x.b)));
   }

   public static gof a(gqj $$0, efp $$1, han.a $$2) {
      return new gof.a($$0.a(gqm.a($$1, $$2)), gxz::g);
   }

   @Override
   protected float a() {
      return 1.0F;
   }

   @Override
   protected float b() {
      return 0.9F;
   }

   public static void a(fod $$0, float $$1) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   protected void a(fod $$0, float $$1, eeb $$2) {
      a($$0, $$1);
   }

   @Override
   protected gof a(eeb $$0, efp $$1) {
      han.a $$2 = han.a.a($$0);
      return this.l.get(new han.b($$1, $$2));
   }

   @Override
   protected hua a(efp $$0) {
      return gyi.b($$0);
   }

   @Override
   protected fis c() {
      return k;
   }

   public static void a(fod $$0, gxn $$1, int $$2, int $$3, gof $$4, hua $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(1.0F, -1.0F, -1.0F);
      fog $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gqt a(han.a $$0) {
      gqv $$1 = new gqv();
      gqx $$2 = $$1.a();
      $$2.a("board", gqs.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), gqp.a);
      if ($$0 == han.a.a) {
         $$2.a("plank", gqs.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), gqp.a);
      }

      if ($$0 == han.a.a || $$0 == han.a.b) {
         gqx $$3 = $$2.a("normalChains", gqs.c(), gqp.a);
         $$3.a("chainL1", gqs.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gqp.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainL2", gqs.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gqp.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
         $$3.a("chainR1", gqs.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gqp.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
         $$3.a("chainR2", gqs.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), gqp.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      }

      if ($$0 == han.a.c) {
         $$2.a("vChains", gqs.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), gqp.a);
      }

      return gqt.a($$1, 64, 32);
   }

   public static enum a implements bda {
      a("wall"),
      b("ceiling"),
      c("ceiling_middle");

      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      public static han.a a(eeb $$0) {
         if ($$0.b() instanceof dra) {
            return $$0.c(eer.a) ? c : b;
         } else {
            return a;
         }
      }

      @Override
      public String c() {
         return this.d;
      }
   }

   public record b(efp a, han.a b) {
   }
}
