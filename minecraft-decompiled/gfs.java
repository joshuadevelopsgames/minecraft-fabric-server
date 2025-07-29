import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfs {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<MapCodec<? extends ask>, gfr<?>> b = new HashMap<>();

   private static <B extends ask> void a(MapCodec<B> $$0, gfr<? super B> $$1) {
      b.put($$0, $$1);
   }

   @Nullable
   private static <B extends ask> gfr<B> a(B $$0) {
      return (gfr<B>)b.get($$0.a());
   }

   @Nullable
   public static <B extends ask> gbm a(gfl<?> $$0, B $$1) {
      gfr<B> $$2 = a($$1);
      if ($$2 == null) {
         a.warn("Unrecognized dialog body {}", $$1);
         return null;
      } else {
         return $$2.a($$0, $$1);
      }
   }

   public static void a() {
      a(asn.d, new gfs.b());
      a(asm.c, new gfs.a());
   }

   static void a(gfl<?> $$0, @Nullable yl $$1) {
      if ($$1 != null) {
         xm $$2 = $$1.i();
         if ($$2 != null) {
            $$0.a(Optional.of($$2));
         }
      }
   }

   static class a implements gfr<asm> {
      public gbm a(gfl<?> $$0, asm $$1) {
         if ($$1.c().isPresent()) {
            asn $$2 = $$1.c().get();
            gbo $$3 = gbo.e().a(2);
            $$3.c().e();
            fyc $$4 = new fyc(fue.R(), 0, 0, $$1.f(), $$1.g(), xn.a, $$1.b(), $$1.d(), $$1.e());
            $$3.a($$4);
            $$3.a(new fxz($$2.c(), $$2.b(), $$0.B(), false, false, 4).a(true, $$1x -> gfs.a($$0, $$1x)));
            return $$3;
         } else {
            return new fyc(fue.R(), 0, 0, $$1.f(), $$1.g(), $$1.b().y(), $$1.b(), $$1.d(), $$1.e());
         }
      }
   }

   static class b implements gfr<asn> {
      public gbm a(gfl<?> $$0, asn $$1) {
         return new fxz($$1.c(), $$1.b(), $$0.B(), false, false, 4).a(true, $$1x -> gfs.a($$0, $$1x)).b(true);
      }
   }
}
