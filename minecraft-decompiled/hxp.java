import java.time.Duration;
import javax.annotation.Nullable;

public class hxp {
   private final boolean a;
   @Nullable
   private final Duration b;

   public hxp(boolean $$0, @Nullable Duration $$1) {
      this.b = $$1;
      this.a = $$0;
   }

   public void a(hxf $$0) {
      if (this.b != null) {
         $$0.send(hxg.d, $$0x -> {
            $$0x.a(hxi.x, (int)this.b.toMillis());
            $$0x.a(hxi.y, this.a);
         });
      }
   }
}
