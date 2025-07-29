import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hod implements hoe {
   public static final hoe a = new hod();

   @Override
   public void a(hoh $$0, dcv $$1, hof $$2, dct $$3, @Nullable grk $$4, @Nullable cam $$5, int $$6) {
      $$0.a(this);
   }

   public record a() implements hoe.b {
      public static final MapCodec<hod.a> a = MapCodec.unit(hod.a::new);

      @Override
      public void a(huk.a $$0) {
      }

      @Override
      public hoe a(hoe.a $$0) {
         return hod.a;
      }

      @Override
      public MapCodec<hod.a> a() {
         return a;
      }
   }
}
