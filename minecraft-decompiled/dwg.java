import com.mojang.serialization.MapCodec;

public class dwg extends dpo {
   public static final MapCodec<dwg> b = b(dwg::new);
   public static final eez<eff> c = eer.aj;

   @Override
   public MapCodec<dwg> a() {
      return b;
   }

   protected dwg(eea.d $$0) {
      super(false, $$0);
      this.l(this.C.b().b(c, eff.a).b(a, false));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3) {
      if ($$3.m().p() && new dwh($$1, $$2, $$0).b() == 3) {
         this.a($$1, $$2, $$0, false);
      }
   }

   @Override
   public efe<eff> c() {
      return c;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, a);
   }
}
