import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hsk {
   private static final hst[] a = new hst[]{
      a("textures/entity/player/slim/alex.png", hst.a.a),
      a("textures/entity/player/slim/ari.png", hst.a.a),
      a("textures/entity/player/slim/efe.png", hst.a.a),
      a("textures/entity/player/slim/kai.png", hst.a.a),
      a("textures/entity/player/slim/makena.png", hst.a.a),
      a("textures/entity/player/slim/noor.png", hst.a.a),
      a("textures/entity/player/slim/steve.png", hst.a.a),
      a("textures/entity/player/slim/sunny.png", hst.a.a),
      a("textures/entity/player/slim/zuri.png", hst.a.a),
      a("textures/entity/player/wide/alex.png", hst.a.b),
      a("textures/entity/player/wide/ari.png", hst.a.b),
      a("textures/entity/player/wide/efe.png", hst.a.b),
      a("textures/entity/player/wide/kai.png", hst.a.b),
      a("textures/entity/player/wide/makena.png", hst.a.b),
      a("textures/entity/player/wide/noor.png", hst.a.b),
      a("textures/entity/player/wide/steve.png", hst.a.b),
      a("textures/entity/player/wide/sunny.png", hst.a.b),
      a("textures/entity/player/wide/zuri.png", hst.a.b)
   };

   public static ame a() {
      return b().a();
   }

   public static hst b() {
      return a[6];
   }

   public static hst a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hst a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hst a(String $$0, hst.a $$1) {
      return new hst(ame.b($$0), null, null, null, $$1, true);
   }
}
