import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class gyg extends axt<gyg.c> implements AutoCloseable {
   static final Logger c = LogUtils.getLogger();
   public static final int a = 32768;
   public static final String b = "shaders";
   private static final String d = "shaders/include/";
   private static final alx e = alx.a("post_effect");
   final hru f;
   private final Consumer<Exception> g;
   private gyg.a h = new gyg.a(gyg.c.a);
   final gwt i = new gwt("post", 0.1F, 1000.0F, false);

   public gyg(hru $$0, Consumer<Exception> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   protected gyg.c a(axo $$0, btt $$1) {
      Builder<gyg.d, String> $$2 = ImmutableMap.builder();
      Map<ame, axm> $$3 = $$0.b("shaders", gyg::a);

      for (Entry<ame, axm> $$4 : $$3.entrySet()) {
         ame $$5 = $$4.getKey();
         ShaderType $$6 = ShaderType.byLocation($$5);
         if ($$6 != null) {
            a($$5, $$4.getValue(), $$6, $$3, $$2);
         }
      }

      Builder<ame, gxt> $$7 = ImmutableMap.builder();

      for (Entry<ame, axm> $$8 : e.a($$0).entrySet()) {
         a($$8.getKey(), $$8.getValue(), $$7);
      }

      return new gyg.c($$2.build(), $$7.build());
   }

   private static void a(ame $$0, axm $$1, ShaderType $$2, Map<ame, axm> $$3, Builder<gyg.d, String> $$4) {
      ame $$5 = $$2.idConverter().b($$0);
      fnl $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gyg.d($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         c.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fnl a(final Map<ame, axm> $$0, ame $$1) {
      final ame $$2 = $$1.a(w::c);
      return new fnl() {
         private final Set<ame> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1x) {
            ame $$2x;
            try {
               if ($$0) {
                  $$2x = $$2.a((UnaryOperator<String>)($$1xx -> w.d($$1xx + $$1)));
               } else {
                  $$2x = ame.a($$1x).f("shaders/include/");
               }
            } catch (ab var8) {
               gyg.c.error("Malformed GLSL import {}: {}", $$1x, var8.getMessage());
               return "#error " + var8.getMessage();
            }

            if (!this.c.add($$2x)) {
               return null;
            } else {
               try {
                  String var5;
                  try (Reader $$6 = $$0.get($$2x).e()) {
                     var5 = IOUtils.toString($$6);
                  }

                  return var5;
               } catch (IOException var10) {
                  gyg.c.error("Could not open GLSL import {}: {}", $$2x, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ame $$0, axm $$1, Builder<ame, gxt> $$2) {
      ame $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = bcy.a($$4);
         $$2.put($$3, (gxt)gxt.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         c.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ame $$0) {
      return ShaderType.byLocation($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gyg.c $$0, axo $$1, btt $$2) {
      gyg.a $$3 = new gyg.a($$0);
      Set<RenderPipeline> $$4 = new HashSet<>(gxx.a());
      List<ame> $$5 = new ArrayList<>();
      GpuDevice $$6 = RenderSystem.getDevice();
      $$6.clearPipelineCache();

      for (RenderPipeline $$7 : $$4) {
         CompiledRenderPipeline $$8 = $$6.precompilePipeline($$7, $$3::a);
         if (!$$8.isValid()) {
            $$5.add($$7.getLocation());
         }
      }

      if (!$$5.isEmpty()) {
         $$6.clearPipelineCache();
         throw new RuntimeException("Failed to load required shader programs:\n" + $$5.stream().map($$0x -> " - " + $$0x).collect(Collectors.joining("\n")));
      } else {
         this.h.close();
         this.h = $$3;
      }
   }

   @Override
   public String getName() {
      return "Shader Loader";
   }

   private void a(Exception $$0) {
      if (!this.h.d) {
         this.g.accept($$0);
         this.h.d = true;
      }
   }

   @Nullable
   public gxs a(ame $$0, Set<ame> $$1) {
      try {
         return this.h.a($$0, $$1);
      } catch (gyg.b var4) {
         c.error("Failed to load post chain: {}", $$0, var4);
         this.h.c.put($$0, Optional.empty());
         this.a(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.h.close();
      this.i.close();
   }

   public String a(ame $$0, ShaderType $$1) {
      return this.h.a($$0, $$1);
   }

   class a implements AutoCloseable {
      private final gyg.c b;
      final Map<ame, Optional<gxs>> c = new HashMap<>();
      boolean d;

      a(final gyg.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gxs a(ame $$0, Set<ame> $$1) throws gyg.b {
         Optional<gxs> $$2 = this.c.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gxs $$3 = this.b($$0, $$1);
            this.c.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gxs b(ame $$0, Set<ame> $$1) throws gyg.b {
         gxt $$2 = this.b.c.get($$0);
         if ($$2 == null) {
            throw new gyg.b("Could not find post chain with id: " + $$0);
         } else {
            return gxs.a($$2, gyg.this.f, $$1, $$0, gyg.this.i);
         }
      }

      @Override
      public void close() {
         this.c.values().forEach($$0 -> $$0.ifPresent(gxs::close));
         this.c.clear();
      }

      public String a(ame $$0, ShaderType $$1) {
         return this.b.b.get(new gyg.d($$0, $$1));
      }
   }

   public static class b extends Exception {
      public b(String $$0) {
         super($$0);
      }
   }

   public record c(Map<gyg.d, String> b, Map<ame, gxt> c) {
      public static final gyg.c a = new gyg.c(Map.of(), Map.of());

      public Map<gyg.d, String> a() {
         return this.b;
      }

      public Map<ame, gxt> b() {
         return this.c;
      }
   }

   record d(ame a, ShaderType b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
