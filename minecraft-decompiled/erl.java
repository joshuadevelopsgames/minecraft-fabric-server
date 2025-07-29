import com.mojang.serialization.MapCodec;

public class erl<P extends erk> {
   public static final erl<erj> a = a("mangrove_root_placer", erj.c);
   private final MapCodec<P> b;

   private static <P extends erk> erl<P> a(String $$0, MapCodec<P> $$1) {
      return jy.a(mm.W, $$0, new erl<>($$1));
   }

   private erl(MapCodec<P> $$0) {
      this.b = $$0;
   }

   public MapCodec<P> a() {
      return this.b;
   }
}
