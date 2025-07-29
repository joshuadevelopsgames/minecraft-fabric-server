import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxz extends dpz {
   public static final MapCodec<dxz> a = b(dxz::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jh[] d = jh.values();

   @Override
   public MapCodec<dxz> a() {
      return a;
   }

   protected dxz(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dmu $$0, jb $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dqb.aW.m(), 2);
         $$0.a(null, $$1, ayz.Az, aza.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dmu $$0, jb $$1) {
      return jb.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jh $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return jb.b.a;
         } else {
            eeb $$3 = $$0.a_($$2);
            fal $$4 = $$0.b_($$2);
            if (!$$4.a(azu.a)) {
               return jb.b.b;
            } else if ($$3.b() instanceof dqh $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
               return jb.b.a;
            } else {
               if ($$3.b() instanceof duw) {
                  $$0.a($$2, dqb.a.m(), 3);
               } else {
                  if (!$$3.a(dqb.mI) && !$$3.a(dqb.mJ) && !$$3.a(dqb.bG) && !$$3.a(dqb.bH)) {
                     return jb.b.b;
                  }

                  eaz $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dqb.a.m(), 3);
               }

               return jb.b.a;
            }
         }
      }) > 1;
   }
}
