import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyr extends dsi implements dux {
   public static final MapCodec<dyr> c = b(dyr::new);
   public static final eez<eex> d = dsi.b;
   private static final fjm e = dpz.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dyr> a() {
      return c;
   }

   public dyr(eea.d $$0) {
      super($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.c($$1, $$2, jh.b) && !$$0.a(dqb.lp);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dqb.bG);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      if ($$1 != null) {
         fal $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(azu.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      if ($$0.c(d) == eex.a) {
         eeb $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == eex.b;
      } else {
         fal $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(azu.a) && $$4.e() == 8;
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return fam.c.a(false);
   }

   @Override
   public boolean a(@Nullable cam $$0, dly $$1, jb $$2, eeb $$3, fak $$4) {
      return false;
   }

   @Override
   public boolean a(dmv $$0, jb $$1, eeb $$2, fal $$3) {
      return false;
   }
}
