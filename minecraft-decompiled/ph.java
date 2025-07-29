import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ph implements pg.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = awd.b.a() + "/minecraft/structure/";

   @Override
   public ui apply(String $$0, ui $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ui a(String $$0, ui $$1) {
      eza $$2 = new eza();
      int $$3 = ux.b($$1, 500);
      int $$4 = 4420;
      if ($$3 < 4420) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4420, $$0});
      }

      ui $$5 = bdr.g.a(bds.a(), $$1, $$3);
      $$2.a(mm.e, $$5);
      return $$2.a(new ui());
   }
}
