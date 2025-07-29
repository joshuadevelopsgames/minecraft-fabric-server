import com.mojang.serialization.MapCodec;

public class dxq extends dru {
   public static final MapCodec<dxq> b = b(dxq::new);
   private static final xo c = xo.c("container.upgrade");

   @Override
   public MapCodec<dxq> a() {
      return b;
   }

   protected dxq(eea.d $$0) {
      super($$0);
   }

   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new dan($$2x, $$3, cyz.a($$1, $$2)), c);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.aG);
      }

      return bxj.a;
   }
}
