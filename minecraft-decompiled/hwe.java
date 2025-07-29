import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class hwe extends ayb {
   private static final Logger h = LogUtils.getLogger();
   @Nullable
   private ui i;

   public hwe(hwf $$0, js<amn> $$1, fcv $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void a(auc $$0) {
      if (this.b().a($$0.gr())) {
         try (bci.j $$1 = new bci.j($$0.ef(), h)) {
            fcz $$2 = fcz.a($$1, $$0.eb());
            $$0.d($$2);
            this.i = $$2.b();
         }
      }

      super.a($$0);
   }

   @Override
   public xo a(SocketAddress $$0, GameProfile $$1) {
      return (xo)(this.b().a($$1) && this.a($$1.getName()) != null ? xo.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hwf b() {
      return (hwf)super.c();
   }

   @Nullable
   @Override
   public ui r() {
      return this.i;
   }
}
