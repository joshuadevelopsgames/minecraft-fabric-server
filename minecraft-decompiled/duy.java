import com.mojang.serialization.MapCodec;

public class duy extends dub {
   public static final MapCodec<duy> a = b(duy::new);
   private static final xo b = xo.c("container.loom");

   @Override
   public MapCodec<duy> a() {
      return a;
   }

   protected duy(eea.d $$0) {
      super($$0);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.ay);
      }

      return bxj.a;
   }

   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new czt($$2x, $$3, cyz.a($$1, $$2)), b);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(f, $$0.g().g());
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f);
   }
}
