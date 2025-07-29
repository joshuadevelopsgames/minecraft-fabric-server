import com.mojang.serialization.MapCodec;

public class etq extends eue {
   private static final etq c = new etq();
   public static MapCodec<etq> a = MapCodec.unit(() -> c);

   private etq() {
   }

   public static etq a() {
      return c;
   }

   @Override
   protected boolean a(eud $$0, bck $$1, jb $$2) {
      euc $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jl<dnx> $$4 = $$0.d().v($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public eug<?> b() {
      return eug.e;
   }
}
