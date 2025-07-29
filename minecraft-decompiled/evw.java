import com.mojang.serialization.MapCodec;

public interface evw<SP extends evv> {
   evw<evt> a = a("random_spread", evt.a);
   evw<evs> b = a("concentric_rings", evs.a);

   MapCodec<SP> codec();

   private static <SP extends evv> evw<SP> a(String $$0, MapCodec<SP> $$1) {
      return jy.a(mm.P, $$0, () -> $$1);
   }
}
