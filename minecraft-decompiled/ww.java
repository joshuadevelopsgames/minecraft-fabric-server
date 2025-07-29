import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ww extends wd {
   private static final Logger h = LogUtils.getLogger();
   private static final xo i = xo.c("disconnect.exceeded_packet_rate");
   private final int j;

   public ww(int $$0) {
      super(zx.a);
      this.j = $$0;
   }

   @Override
   protected void c() {
      super.c();
      float $$0 = this.o();
      if ($$0 > this.j) {
         h.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new aai(i), wt.a(() -> this.a(i)));
         this.m();
      }
   }
}
