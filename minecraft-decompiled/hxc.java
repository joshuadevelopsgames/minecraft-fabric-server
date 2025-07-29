import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;

public record hxc(hxg b, hxj c) {
   public static final Codec<hxc> a = hxg.a.dispatchStable(hxc::a, hxg::c);

   public hxc(hxg b, hxj c) {
      c.b().forEach($$1x -> {
         if (!$$0.a($$1x)) {
            throw new IllegalArgumentException("Property '" + $$1x.b() + "' not expected for event: '" + $$0.a() + "'");
         }
      });
      this.b = b;
      this.c = c;
   }

   public TelemetryEvent a(TelemetrySession $$0) {
      return this.b.a($$0, this.c);
   }

   public hxg a() {
      return this.b;
   }

   public hxj b() {
      return this.c;
   }
}
