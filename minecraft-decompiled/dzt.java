import com.mojang.serialization.MapCodec;

public class dzt extends dzl {
   public static final MapCodec<dzt> a = b(dzt::new);
   private static final fjm b = dpz.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dzt> a() {
      return a;
   }

   protected dzt(eea.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof aub && $$3 instanceof cxe) {
         $$1.a(new jb($$2), true, $$3);
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      fal $$3 = $$1.b_($$2);
      fal $$4 = $$1.b_($$2.d());
      return ($$3.a() == fam.c || $$0.b() instanceof dud) && $$4.a() == fam.a;
   }
}
