import com.google.common.collect.Maps;
import java.util.Map;

public class hfr extends hcy<cmy, hlx, goh> {
   private static final Map<cmy.a, ame> a = Maps.newEnumMap(
      Map.of(
         cmy.a.a,
         ame.b("textures/entity/panda/panda.png"),
         cmy.a.b,
         ame.b("textures/entity/panda/lazy_panda.png"),
         cmy.a.c,
         ame.b("textures/entity/panda/worried_panda.png"),
         cmy.a.d,
         ame.b("textures/entity/panda/playful_panda.png"),
         cmy.a.e,
         ame.b("textures/entity/panda/brown_panda.png"),
         cmy.a.f,
         ame.b("textures/entity/panda/weak_panda.png"),
         cmy.a.g,
         ame.b("textures/entity/panda/aggressive_panda.png")
      )
   );

   public hfr(hee.a $$0) {
      super($$0, new goh($$0.a(gqm.cf)), new goh($$0.a(gqm.cg)), 0.9F);
      this.a(new hip(this));
   }

   public ame a(hlx $$0) {
      return a.getOrDefault($$0.a, a.get(cmy.a.a));
   }

   public hlx b() {
      return new hlx();
   }

   public void a(cmy $$0, hlx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hlf.a($$0, $$1, this.i);
      $$1.a = $$0.gV();
      $$1.b = $$0.m() > 0;
      $$1.c = $$0.n();
      $$1.d = $$0.gJ();
      $$1.e = $$0.gI();
      $$1.f = $$0.hb();
      $$1.g = $$0.t();
      $$1.h = $$0.J($$2);
      $$1.j = $$0.K($$2);
      $$1.k = $$0.g_() ? 0.0F : $$0.L($$2);
      $$1.l = $$0.cl > 0 ? $$0.cl + $$2 : 0.0F;
   }

   protected void a(hlx $$0, fod $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.l > 0.0F) {
         float $$4 = bcb.i($$0.l);
         int $$5 = bcb.d($$0.l);
         int $$6 = $$5 + 1;
         float $$7 = 7.0F;
         float $$8 = $$0.am ? 0.3F : 0.8F;
         if ($$5 < 8.0F) {
            float $$9 = 90.0F * $$5 / 7.0F;
            float $$10 = 90.0F * $$6 / 7.0F;
            float $$11 = this.a($$9, $$10, $$6, $$4, 8.0F);
            $$1.a(0.0F, ($$8 + 0.2F) * ($$11 / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$11));
         } else if ($$5 < 16.0F) {
            float $$12 = ($$5 - 8.0F) / 7.0F;
            float $$13 = 90.0F + 90.0F * $$12;
            float $$14 = 90.0F + 90.0F * ($$6 - 8.0F) / 7.0F;
            float $$15 = this.a($$13, $$14, $$6, $$4, 16.0F);
            $$1.a(0.0F, $$8 + 0.2F + ($$8 - 0.2F) * ($$15 - 90.0F) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$15));
         } else if ($$5 < 24.0F) {
            float $$16 = ($$5 - 16.0F) / 7.0F;
            float $$17 = 180.0F + 90.0F * $$16;
            float $$18 = 180.0F + 90.0F * ($$6 - 16.0F) / 7.0F;
            float $$19 = this.a($$17, $$18, $$6, $$4, 24.0F);
            $$1.a(0.0F, $$8 + $$8 * (270.0F - $$19) / 90.0F, 0.0F);
            $$1.a(a.b.rotationDegrees(-$$19));
         } else if ($$5 < 32) {
            float $$20 = ($$5 - 24.0F) / 7.0F;
            float $$21 = 270.0F + 90.0F * $$20;
            float $$22 = 270.0F + 90.0F * ($$6 - 24.0F) / 7.0F;
            float $$23 = this.a($$21, $$22, $$6, $$4, 32.0F);
            $$1.a(0.0F, $$8 * ((360.0F - $$23) / 90.0F), 0.0F);
            $$1.a(a.b.rotationDegrees(-$$23));
         }
      }

      float $$24 = $$0.h;
      if ($$24 > 0.0F) {
         $$1.a(0.0F, 0.8F * $$24, 0.0F);
         $$1.a(a.b.rotationDegrees(bcb.h($$24, $$0.ae, $$0.ae + 90.0F)));
         $$1.a(0.0F, -1.0F * $$24, 0.0F);
         if ($$0.f) {
            float $$25 = (float)(Math.cos($$0.v * 1.25F) * Math.PI * 0.05F);
            $$1.a(a.d.rotationDegrees($$25));
            if ($$0.am) {
               $$1.a(0.0F, 0.8F, 0.55F);
            }
         }
      }

      float $$26 = $$0.j;
      if ($$26 > 0.0F) {
         float $$27 = $$0.am ? 0.5F : 1.3F;
         $$1.a(0.0F, $$27 * $$26, 0.0F);
         $$1.a(a.b.rotationDegrees(bcb.h($$26, $$0.ae, $$0.ae + 180.0F)));
      }
   }

   private float a(float $$0, float $$1, int $$2, float $$3, float $$4) {
      return $$2 < $$4 ? bcb.h($$3, $$0, $$1) : $$0;
   }
}
