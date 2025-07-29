import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface ahn extends wy {
   Logger a = LogUtils.getLogger();

   @Override
   default void a(zw $$0, Exception $$1) throws aa {
      a.error("Failed to handle packet {}, suppressing error", $$0, $$1);
   }
}
