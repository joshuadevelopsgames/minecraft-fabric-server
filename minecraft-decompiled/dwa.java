import com.mojang.serialization.MapCodec;

public class dwa extends drw {
   public static final MapCodec<dwa> a = b(dwa::new);
   private static final fjm[] b = dpz.a(7, $$0 -> dpz.b(16.0, 0.0, 2 + $$0));

   @Override
   public MapCodec<dwa> a() {
      return a;
   }

   public dwa(eea.d $$0) {
      super($$0);
   }

   @Override
   protected dmt d() {
      return dcz.vI;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b[this.h($$0)];
   }
}
