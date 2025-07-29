import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;

public record ala(alb b) implements zw<akz> {
   private static final amc<JsonElement> c = jz.b.a(JsonOps.INSTANCE);
   public static final zm<ByteBuf, ala> a = zm.a(zk.f(32767).a(zk.a(c, alb.a)), ala::b, ala::new);

   @Override
   public zy<ala> a() {
      return ale.a;
   }

   public void a(akz $$0) {
      $$0.a(this);
   }
}
