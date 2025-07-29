import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ffy extends few {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ffy> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ffy::new));

   private ffy(List<fgs> $$0) {
      super($$0);
   }

   @Override
   public fey<ffy> b() {
      return fez.l;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         dif $$2 = new dif($$0);
         Optional<dhr<dig>> $$3 = $$1.d().u().a(dhx.b, $$2, $$1.d());
         if ($$3.isPresent()) {
            dcv $$4 = $$3.get().b().a($$2, $$1.d().K_());
            if (!$$4.f()) {
               return $$4.c($$0.M());
            }
         }

         b.warn("Couldn't smelt {} because there is no smelting recipe", $$0);
         return $$0;
      }
   }

   public static few.a<?> c() {
      return a(ffy::new);
   }
}
