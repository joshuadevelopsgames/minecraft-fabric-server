import java.util.Map;

public class hjj extends hit<hng, gqc> {
   private final gqc a;
   private final gqc b;
   private final hie c;
   private static final Map<bzi.a, ame> d = Map.of(
      bzi.a.b,
      ame.b("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bzi.a.c,
      ame.b("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bzi.a.d,
      ame.b("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public hjj(hgc<hng, gqc> $$0, gqj $$1, hie $$2) {
      super($$0);
      this.a = new gqc($$1.a(gqm.ei));
      this.b = new gqc($$1.a(gqm.ek));
      this.c = $$2;
   }

   public void a(fod $$0, gxn $$1, int $$2, hng $$3, float $$4, float $$5) {
      dcv $$6 = $$3.i;
      dle $$7 = $$6.a(kq.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         gqc $$8 = $$3.am ? this.b : this.a;
         $$8.a($$3);
         this.c.a(htz.d.d, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
         this.a($$0, $$1, $$2, $$6, $$8);
      }
   }

   private void a(fod $$0, gxn $$1, int $$2, dcv $$3, gof $$4) {
      bzi.a $$5 = bzi.b.a($$3);
      if ($$5 != bzi.a.a) {
         ame $$6 = d.get($$5);
         fog $$7 = $$1.getBuffer(gxz.c($$6));
         $$4.a($$0, $$7, $$2, hri.d);
      }
   }
}
