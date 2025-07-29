import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ake(GameProfile b) implements zw<ajz> {
   public static final zm<ByteBuf, ake> a = zm.a(zk.z, ake::b, ake::new);

   @Override
   public zy<ake> a() {
      return akf.b;
   }

   public void a(ajz $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
