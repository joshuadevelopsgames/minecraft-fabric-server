import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dpz {
   public static final MapCodec<dqu> a = b(dqu::new);
   private static final xo b = xo.c("container.cartography_table");

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   protected dqu(eea.d $$0) {
      super($$0);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.ax);
      }

      return bxj.a;
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new cyu($$2x, $$3, cyz.a($$1, $$2)), b);
   }
}
