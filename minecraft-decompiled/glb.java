import com.mojang.authlib.GameProfile;
import java.util.function.Supplier;

public class glb implements glf {
   private final GameProfile a;
   private final Supplier<hst> b;
   private final xo c;

   public glb(GameProfile $$0) {
      this.a = $$0;
      this.b = fue.R().ao().a($$0);
      this.c = xo.b($$0.getName());
   }

   @Override
   public void a(gld $$0) {
      fue.R().M().b(new ajn(this.a.getId()));
   }

   @Override
   public xo aW_() {
      return this.c;
   }

   @Override
   public void a(fxb $$0, float $$1, float $$2) {
      fyo.a($$0, this.b.get(), 2, 2, 12, baj.a($$2));
   }

   @Override
   public boolean aX_() {
      return true;
   }
}
