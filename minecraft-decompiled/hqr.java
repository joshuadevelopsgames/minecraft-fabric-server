import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hqr implements hqv<hqr.a> {
   private final Map<dfv, hqr.a> a = new HashMap<>();
   private final hsu b;
   private final gph c;
   private final hqr.a d;

   hqr(hsu $$0, gph $$1, hqr.a $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public void a(@Nullable hqr.a $$0, dct $$1, fod $$2, gxn $$3, int $$4, int $$5, boolean $$6) {
      hqr.a $$7 = Objects.requireNonNullElse($$0, this.d);
      gxz $$8 = $$7.a();
      has.a(null, 180.0F, 0.0F, $$2, $$3, $$4, this.c, $$8);
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.a(0.5F, 0.0F, 0.5F);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.c.e().a($$1, $$0);
   }

   @Nullable
   public hqr.a a(dcv $$0) {
      dfv $$1 = $$0.a(kq.ak);
      if ($$1 == null) {
         return null;
      } else {
         hqr.a $$2 = this.a.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            dfv $$3 = $$1.a();
            return $$3 != null ? this.a($$3) : null;
         }
      }
   }

   @Nullable
   private hqr.a a(dfv $$0) {
      hst $$1 = this.b.a($$0.g(), null);
      if ($$1 != null) {
         hqr.a $$2 = hqr.a.a($$1);
         this.a.put($$0, $$2);
         return $$2;
      } else {
         return null;
      }
   }

   public record a(gxz a) {
      static hqr.a a(hst $$0) {
         return new hqr.a(has.a($$0.a()));
      }
   }

   public record b() implements hqv.a {
      public static final MapCodec<hqr.b> a = MapCodec.unit(hqr.b::new);

      @Override
      public MapCodec<hqr.b> a() {
         return a;
      }

      @Nullable
      @Override
      public hqv<?> a(gqj $$0) {
         gph $$1 = has.a($$0, dxm.b.e);
         return $$1 == null ? null : new hqr(fue.R().ao(), $$1, hqr.a.a(hsk.b()));
      }
   }
}
