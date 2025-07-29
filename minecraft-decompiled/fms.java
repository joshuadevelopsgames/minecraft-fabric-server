import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fms extends fmr {
   public fms(@Nullable String $$0, int $$1, int $$2, boolean $$3) {
      super($$0, $$3);
      RenderSystem.assertOnRenderThread();
      this.a($$1, $$2);
   }
}
