import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class hqs implements hqv<kn> {
   private final gpb a;

   public hqs(gpb $$0) {
      this.a = $$0;
   }

   @Nullable
   public kn a(dcv $$0) {
      return $$0.e();
   }

   public void a(@Nullable kn $$0, dct $$1, fod $$2, gxn $$3, int $$4, int $$5, boolean $$6) {
      eap $$7 = $$0 != null ? $$0.a(kq.am, eap.a) : eap.a;
      dbt $$8 = $$0 != null ? $$0.a(kq.an) : null;
      boolean $$9 = !$$7.b().isEmpty() || $$8 != null;
      $$2.a();
      $$2.b(1.0F, -1.0F, -1.0F);
      hua $$10 = $$9 ? hud.g : hud.h;
      fog $$11 = $$10.c().a(hfd.a($$3, this.a.a($$10.a()), $$1 == dct.g, $$6));
      this.a.c().a($$2, $$11, $$4, $$5);
      if ($$9) {
         gzx.a($$2, $$3, $$4, $$5, this.a.b(), $$10, false, Objects.requireNonNullElse($$8, dbt.a), $$7, $$6, false);
      } else {
         this.a.b().a($$2, $$11, $$4, $$5);
      }

      $$2.b();
   }

   @Override
   public void a(Set<Vector3f> $$0) {
      fod $$1 = new fod();
      $$1.b(1.0F, -1.0F, -1.0F);
      this.a.e().a($$1, $$0);
   }

   public record a() implements hqv.a {
      public static final hqs.a a = new hqs.a();
      public static final MapCodec<hqs.a> b = MapCodec.unit(a);

      @Override
      public MapCodec<hqs.a> a() {
         return b;
      }

      @Override
      public hqv<?> a(gqj $$0) {
         return new hqs(new gpb($$0.a(gqm.cZ)));
      }
   }
}
