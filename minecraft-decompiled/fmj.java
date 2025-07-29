import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.RenderSystem;
import org.apache.commons.lang3.StringUtils;

public class fmj implements AutoCloseable {
   private static final int b = -1;
   public static final fmj a = new fmj(-1, ame.b("invalid"), ShaderType.VERTEX);
   private final ame c;
   private int d;
   private final ShaderType e;

   public fmj(int $$0, ame $$1, ShaderType $$2) {
      this.c = $$1;
      this.d = $$0;
      this.e = $$2;
   }

   public static fmj a(ame $$0, ShaderType $$1, String $$2) throws gyg.b {
      RenderSystem.assertOnRenderThread();
      int $$3 = GlStateManager.glCreateShader(GlConst.toGl($$1));
      GlStateManager.glShaderSource($$3, $$2);
      GlStateManager.glCompileShader($$3);
      if (GlStateManager.glGetShaderi($$3, 35713) == 0) {
         String $$4 = StringUtils.trim(GlStateManager.glGetShaderInfoLog($$3, 32768));
         throw new gyg.b("Couldn't compile " + $$1.getName() + " shader (" + $$0 + ") : " + $$4);
      } else {
         return new fmj($$3, $$0, $$1);
      }
   }

   @Override
   public void close() {
      if (this.d == -1) {
         throw new IllegalStateException("Already closed");
      } else {
         RenderSystem.assertOnRenderThread();
         GlStateManager.glDeleteShader(this.d);
         this.d = -1;
      }
   }

   public ame a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public String c() {
      return this.e.idConverter().a(this.c).toString();
   }
}
