import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duj extends dtt implements dux {
   public static final MapCodec<duj> c = b(duj::new);
   private static final double g = 0.14;
   private static final fjm h = dpz.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<duj> a() {
      return c;
   }

   protected duj(eea.d $$0) {
      super($$0, jh.b, h, true, 0.14);
   }

   @Override
   protected boolean h(eeb $$0) {
      return $$0.a(dqb.J);
   }

   @Override
   protected dpz b() {
      return dqb.mJ;
   }

   @Override
   protected boolean o(eeb $$0) {
      return !$$0.a(dqb.lp);
   }

   @Override
   public boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return false;
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      return false;
   }

   @Override
   protected int a(bck $$0) {
      return 1;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return $$1.a(azu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected fal b_(eeb $$0) {
      return fam.c.a(false);
   }
}
