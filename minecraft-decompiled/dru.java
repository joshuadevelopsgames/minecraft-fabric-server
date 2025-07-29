import com.mojang.serialization.MapCodec;

public class dru extends dpz {
   public static final MapCodec<dru> a = b(dru::new);
   private static final xo b = xo.c("container.crafting");

   @Override
   public MapCodec<? extends dru> a() {
      return a;
   }

   protected dru(eea.d $$0) {
      super($$0);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.ao);
      }

      return bxj.a;
   }

   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new czf($$2x, $$3, cyz.a($$1, $$2)), b);
   }
}
