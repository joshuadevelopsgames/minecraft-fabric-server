import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class gfm {
   private static final Map<MapCodec<? extends art>, gfm.a<?>> a = new HashMap<>();

   private static <T extends art> void a(MapCodec<T> $$0, gfm.a<? super T> $$1) {
      a.put($$0, $$1);
   }

   @Nullable
   public static <T extends art> gfl<T> a(T $$0, @Nullable get $$1, gfi $$2) {
      gfm.a<T> $$3 = (gfm.a<T>)a.get($$0.a());
      return $$3 != null ? $$3.create($$1, $$0, $$2) : null;
   }

   public static void a() {
      a(ars.a, gfp::new);
      a(asa.h, gfp::new);
      a(arv.a, gfk::new);
      a(arz.a, gfn::new);
      a(asb.a, gfo::new);
   }

   @FunctionalInterface
   public interface a<T extends art> {
      gfl<T> create(@Nullable get var1, T var2, gfi var3);
   }
}
