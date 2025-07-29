import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import org.lwjgl.opengl.EXTDebugLabel;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public abstract class fmd {
   private static final Logger a = LogUtils.getLogger();

   public void a(fma $$0) {
   }

   public void a(fmk $$0) {
   }

   public void a(fmj $$0) {
   }

   public void a(fmg $$0) {
   }

   public void a(fmn.c $$0) {
   }

   public void a(Supplier<String> $$0) {
   }

   public void a() {
   }

   public static fmd a(GLCapabilities $$0, boolean $$1, Set<String> $$2) {
      if ($$1) {
         if ($$0.GL_KHR_debug && fme.b) {
            $$2.add("GL_KHR_debug");
            return new fmd.a();
         }

         if ($$0.GL_EXT_debug_label && fme.c) {
            $$2.add("GL_EXT_debug_label");
            return new fmd.c();
         }

         a.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
      }

      return new fmd.b();
   }

   public boolean b() {
      return false;
   }

   static class a extends fmd {
      private final int a = GL11.glGetInteger(33512);

      @Override
      public void a(fma $$0) {
         Supplier<String> $$1 = $$0.c;
         if ($$1 != null) {
            KHRDebug.glObjectLabel(33504, $$0.d, bdb.a($$1.get(), this.a, true));
         }
      }

      @Override
      public void a(fmk $$0) {
         KHRDebug.glObjectLabel(5890, $$0.a, bdb.a($$0.getLabel(), this.a, true));
      }

      @Override
      public void a(fmj $$0) {
         KHRDebug.glObjectLabel(33505, $$0.b(), bdb.a($$0.c(), this.a, true));
      }

      @Override
      public void a(fmg $$0) {
         KHRDebug.glObjectLabel(33506, $$0.a(), bdb.a($$0.b(), this.a, true));
      }

      @Override
      public void a(fmn.c $$0) {
         KHRDebug.glObjectLabel(32884, $$0.a, bdb.a($$0.b.toString(), this.a, true));
      }

      @Override
      public void a(Supplier<String> $$0) {
         KHRDebug.glPushDebugGroup(33354, 0, $$0.get());
      }

      @Override
      public void a() {
         KHRDebug.glPopDebugGroup();
      }

      @Override
      public boolean b() {
         return true;
      }
   }

   static class b extends fmd {
   }

   static class c extends fmd {
      @Override
      public void a(fma $$0) {
         Supplier<String> $$1 = $$0.c;
         if ($$1 != null) {
            EXTDebugLabel.glLabelObjectEXT(37201, $$0.d, bdb.a($$1.get(), 256, true));
         }
      }

      @Override
      public void a(fmk $$0) {
         EXTDebugLabel.glLabelObjectEXT(5890, $$0.a, bdb.a($$0.getLabel(), 256, true));
      }

      @Override
      public void a(fmj $$0) {
         EXTDebugLabel.glLabelObjectEXT(35656, $$0.b(), bdb.a($$0.c(), 256, true));
      }

      @Override
      public void a(fmg $$0) {
         EXTDebugLabel.glLabelObjectEXT(35648, $$0.a(), bdb.a($$0.b(), 256, true));
      }

      @Override
      public void a(fmn.c $$0) {
         EXTDebugLabel.glLabelObjectEXT(32884, $$0.a, bdb.a($$0.b.toString(), 256, true));
      }

      @Override
      public boolean b() {
         return true;
      }
   }
}
