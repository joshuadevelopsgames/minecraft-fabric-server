import com.google.common.collect.Sets;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.jetbrains.annotations.VisibleForTesting;
import org.lwjgl.opengl.GL31;
import org.slf4j.Logger;

public class fmg implements AutoCloseable {
   private static final Logger c = LogUtils.getLogger();
   public static Set<String> a = Sets.newHashSet(new String[]{"Projection", "Lighting", "Fog", "Globals"});
   public static fmg b = new fmg(-1, "invalid");
   private final Map<String, fmm> d = new HashMap<>();
   private final int e;
   private final String f;

   private fmg(int $$0, String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public static fmg a(fmj $$0, fmj $$1, VertexFormat $$2, String $$3) throws gyg.b {
      int $$4 = GlStateManager.glCreateProgram();
      if ($$4 <= 0) {
         throw new gyg.b("Could not create shader program (returned program ID " + $$4 + ")");
      } else {
         int $$5 = 0;

         for (String $$6 : $$2.getElementAttributeNames()) {
            GlStateManager._glBindAttribLocation($$4, $$5, $$6);
            $$5++;
         }

         GlStateManager.glAttachShader($$4, $$0.b());
         GlStateManager.glAttachShader($$4, $$1.b());
         GlStateManager.glLinkProgram($$4);
         int $$7 = GlStateManager.glGetProgrami($$4, 35714);
         String $$8 = GlStateManager.glGetProgramInfoLog($$4, 32768);
         if ($$7 != 0 && !$$8.contains("Failed for unknown reason")) {
            if (!$$8.isEmpty()) {
               c.info("Info log when linking program containing VS {} and FS {}. Log output: {}", new Object[]{$$0.a(), $$1.a(), $$8});
            }

            return new fmg($$4, $$3);
         } else {
            throw new gyg.b("Error encountered when linking program containing VS " + $$0.a() + " and FS " + $$1.a() + ". Log output: " + $$8);
         }
      }
   }

   public void a(List<RenderPipeline.UniformDescription> $$0, List<String> $$1) {
      int $$2 = 0;
      int $$3 = 0;

      for (RenderPipeline.UniformDescription $$4 : $$0) {
         String $$5 = $$4.name();

         Object var10000_1 = switch ($$4.type()) {
            case a -> {
               int $$6 = GL31.glGetUniformBlockIndex(this.e, $$5);
               if ($$6 == -1) {
                  yield null;
               } else {
                  int $$7 = $$2++;
                  GL31.glUniformBlockBinding(this.e, $$6, $$7);
                  yield new fmm.b($$7);
               }
            }
            case b -> {
               int $$8 = GlStateManager._glGetUniformLocation(this.e, $$5);
               if ($$8 == -1) {
                  c.warn("{} shader program does not use utb {} defined in the pipeline. This might be a bug.", this.f, $$5);
                  yield null;
               } else {
                  int $$9 = $$3++;
                  yield new fmm.c($$8, $$9, Objects.requireNonNull($$4.textureFormat()));
               }
            }
         };

         fmm $$10 = (fmm)var10000;
         if ($$10 != null) {
            this.d.put($$5, $$10);
         }
      }

      for (String $$11 : $$1) {
         int $$12 = GlStateManager._glGetUniformLocation(this.e, $$11);
         if ($$12 == -1) {
            c.warn("{} shader program does not use sampler {} defined in the pipeline. This might be a bug.", this.f, $$11);
         } else {
            int $$13 = $$3++;
            this.d.put($$11, new fmm.a($$12, $$13));
         }
      }

      int $$14 = GlStateManager.glGetProgrami(this.e, 35382);

      for (int $$15 = 0; $$15 < $$14; $$15++) {
         String $$16 = GL31.glGetActiveUniformBlockName(this.e, $$15);
         if (!this.d.containsKey($$16)) {
            if (!$$1.contains($$16) && a.contains($$16)) {
               int $$17 = $$2++;
               GL31.glUniformBlockBinding(this.e, $$15, $$17);
               this.d.put($$16, new fmm.b($$17));
            } else {
               c.warn("Found unknown and unsupported uniform {} in {}", $$16, this.f);
            }
         }
      }
   }

   @Override
   public void close() {
      this.d.values().forEach(fmm::close);
      GlStateManager.glDeleteProgram(this.e);
   }

   @Nullable
   public fmm a(String $$0) {
      RenderSystem.assertOnRenderThread();
      return this.d.get($$0);
   }

   @VisibleForTesting
   public int a() {
      return this.e;
   }

   @Override
   public String toString() {
      return this.f;
   }

   public String b() {
      return this.f;
   }

   public Map<String, fmm> c() {
      return this.d;
   }
}
