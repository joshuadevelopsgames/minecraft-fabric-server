import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duk extends dts implements dux {
   public static final MapCodec<duk> c = b(duk::new);

   @Override
   public MapCodec<duk> a() {
      return c;
   }

   protected duk(eea.d $$0) {
      super($$0, jh.b, fjj.b(), true);
   }

   @Override
   protected dtt c() {
      return (dtt)dqb.mI;
   }

   @Override
   protected fal b_(eeb $$0) {
      return fam.c.a(false);
   }

   @Override
   protected boolean o(eeb $$0) {
      return this.c().o($$0);
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
