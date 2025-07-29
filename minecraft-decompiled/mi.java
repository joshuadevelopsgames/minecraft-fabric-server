import com.mojang.serialization.MapCodec;

public class mi extends md<mi> implements mc {
   private final MapCodec<mi> a = MapCodec.unit(this::e);
   private final zm<wx, mi> b = zm.a(this);

   protected mi(boolean $$0) {
      super($$0);
   }

   public mi e() {
      return this;
   }

   @Override
   public MapCodec<mi> c() {
      return this.a;
   }

   @Override
   public zm<wx, mi> d() {
      return this.b;
   }
}
