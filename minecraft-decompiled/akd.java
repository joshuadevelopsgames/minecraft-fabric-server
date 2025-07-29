import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;

public record akd(xo b) implements zw<ajz> {
   private static final amc<JsonElement> c = jz.b.a(JsonOps.INSTANCE);
   public static final zm<ByteBuf, akd> a = zm.a(zk.f(262144).a(zk.a(c, xq.a)), akd::b, akd::new);

   @Override
   public zy<akd> a() {
      return akf.e;
   }

   public void a(ajz $$0) {
      $$0.a(this);
   }
}
