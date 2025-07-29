import com.mojang.serialization.MapCodec;

public class dzc extends drd {
   public static final MapCodec<dzc> g = b(dzc::new);

   @Override
   public MapCodec<dzc> a() {
      return g;
   }

   public dzc(eea.d $$0) {
      super(() -> ebb.c, $$0);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecy($$0, $$1);
   }

   @Override
   protected azg<ame> c() {
      return azj.i.b(azj.aj);
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return bcb.a(ebh.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 == jh.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
