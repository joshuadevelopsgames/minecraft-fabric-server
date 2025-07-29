import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public abstract class gxy {
   public static final double a = 8.0;
   protected final String b;
   private final Runnable x;
   private final Runnable y;
   protected static final gxy.j c = new gxy.j(hrr.c, true);
   protected static final gxy.j d = new gxy.j(hrr.c, false);
   protected static final gxy.b e = new gxy.b();
   protected static final gxy.k f = new gxy.k("default_texturing", () -> {}, () -> {});
   protected static final gxy.k g = new gxy.k("glint_texturing", () -> a(8.0F), RenderSystem::resetTextureMatrix);
   protected static final gxy.k h = new gxy.k("entity_glint_texturing", () -> a(0.5F), RenderSystem::resetTextureMatrix);
   protected static final gxy.k i = new gxy.k("armor_entity_glint_texturing", () -> a(0.16F), RenderSystem::resetTextureMatrix);
   protected static final gxy.d j = new gxy.d(true);
   protected static final gxy.d k = new gxy.d(false);
   protected static final gxy.i l = new gxy.i(true);
   protected static final gxy.i m = new gxy.i(false);
   protected static final gxy.c n = new gxy.c("no_layering", () -> {}, () -> {});
   protected static final gxy.c o = new gxy.c("view_offset_z_layering", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, 1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gxy.c p = new gxy.c("view_offset_z_layering_forward", () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      RenderSystem.getProjectionType().a($$0, -1.0F);
   }, () -> {
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.popMatrix();
   });
   protected static final gxy.h q = new gxy.h("main_target", () -> fue.R().h());
   protected static final gxy.h r = new gxy.h("outline_target", () -> {
      fmr $$0 = fue.R().f.q();
      return $$0 != null ? $$0 : fue.R().h();
   });
   protected static final gxy.h s = new gxy.h("translucent_target", () -> {
      fmr $$0 = fue.R().f.r();
      return $$0 != null ? $$0 : fue.R().h();
   });
   protected static final gxy.h t = new gxy.h("particles_target", () -> {
      fmr $$0 = fue.R().f.t();
      return $$0 != null ? $$0 : fue.R().h();
   });
   protected static final gxy.h u = new gxy.h("weather_target", () -> {
      fmr $$0 = fue.R().f.u();
      return $$0 != null ? $$0 : fue.R().h();
   });
   protected static final gxy.h v = new gxy.h("item_entity_target", () -> {
      fmr $$0 = fue.R().f.s();
      return $$0 != null ? $$0 : fue.R().h();
   });
   protected static final gxy.e w = new gxy.e(OptionalDouble.of(1.0));

   public gxy(String $$0, Runnable $$1, Runnable $$2) {
      this.b = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public void a() {
      this.x.run();
   }

   public void b() {
      this.y.run();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public String c() {
      return this.b;
   }

   private static void a(float $$0) {
      long $$1 = (long)(ag.c() * fue.R().n.aq().c() * 8.0);
      float $$2 = (float)($$1 % 110000L) / 110000.0F;
      float $$3 = (float)($$1 % 30000L) / 30000.0F;
      Matrix4f $$4 = new Matrix4f().translation(-$$2, $$3, 0.0F);
      $$4.rotateZ((float) (Math.PI / 18)).scale($$0);
      RenderSystem.setTextureMatrix($$4);
   }

   static class a extends gxy {
      private final boolean x;

      public a(String $$0, Runnable $$1, Runnable $$2, boolean $$3) {
         super($$0, $$1, $$2);
         this.x = $$3;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.x + "]";
      }
   }

   protected static class b extends gxy {
      public b(Runnable $$0, Runnable $$1) {
         super("texture", $$0, $$1);
      }

      b() {
         super("texture", () -> {}, () -> {});
      }

      protected Optional<ame> d() {
         return Optional.empty();
      }
   }

   protected static class c extends gxy {
      public c(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }

   protected static class d extends gxy.a {
      public d(boolean $$0) {
         super("lightmap", () -> {
            if ($$0) {
               fue.R().j.m().d();
            }
         }, () -> {
            if ($$0) {
               fue.R().j.m().c();
            }
         }, $$0);
      }
   }

   protected static class e extends gxy {
      private final OptionalDouble x;

      public e(OptionalDouble $$0) {
         super("line_width", () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               if ($$0.isPresent()) {
                  RenderSystem.lineWidth((float)$$0.getAsDouble());
               } else {
                  RenderSystem.lineWidth(Math.max(2.5F, fue.R().aP().k() / 1920.0F * 2.5F));
               }
            }
         }, () -> {
            if (!Objects.equals($$0, OptionalDouble.of(1.0))) {
               RenderSystem.lineWidth(1.0F);
            }
         });
         this.x = $$0;
      }

      @Override
      public String toString() {
         return this.b + "[" + (this.x.isPresent() ? this.x.getAsDouble() : "window_scale") + "]";
      }
   }

   protected static class f extends gxy.b {
      private final Optional<ame> x;

      f(List<gxy.f.b> $$0) {
         super(() -> {
            for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
               gxy.f.b $$2 = $$0.get($$1);
               hru $$3 = fue.R().ab();
               hrc $$4 = $$3.b($$2.a);
               $$4.b($$2.b);
               RenderSystem.setShaderTexture($$1, $$4.b());
            }
         }, () -> {});
         this.x = $$0.isEmpty() ? Optional.empty() : Optional.of($$0.getFirst().a);
      }

      @Override
      protected Optional<ame> d() {
         return this.x;
      }

      public static gxy.f.a e() {
         return new gxy.f.a();
      }

      public static final class a {
         private final Builder<gxy.f.b> a = new Builder();

         public gxy.f.a a(ame $$0, boolean $$1) {
            this.a.add(new gxy.f.b($$0, $$1));
            return this;
         }

         public gxy.f a() {
            return new gxy.f(this.a.build());
         }
      }

      record b(ame a, boolean b) {
      }
   }

   protected static final class g extends gxy.k {
      public g(float $$0, float $$1) {
         super("offset_texturing", () -> RenderSystem.setTextureMatrix(new Matrix4f().translation($$0, $$1, 0.0F)), () -> RenderSystem.resetTextureMatrix());
      }
   }

   protected static class h extends gxy {
      private final Supplier<fmr> x;

      public h(String $$0, Supplier<fmr> $$1) {
         super($$0, () -> {}, () -> {});
         this.x = $$1;
      }

      public fmr d() {
         return this.x.get();
      }
   }

   protected static class i extends gxy.a {
      public i(boolean $$0) {
         super("overlay", () -> {
            if ($$0) {
               fue.R().j.n().a();
            }
         }, () -> {
            if ($$0) {
               fue.R().j.n().b();
            }
         }, $$0);
      }
   }

   protected static class j extends gxy.b {
      private final Optional<ame> x;
      private final boolean y;

      public j(ame $$0, boolean $$1) {
         super(() -> {
            hru $$2 = fue.R().ab();
            hrc $$3 = $$2.b($$0);
            $$3.b($$1);
            RenderSystem.setShaderTexture(0, $$3.b());
         }, () -> {});
         this.x = Optional.of($$0);
         this.y = $$1;
      }

      @Override
      public String toString() {
         return this.b + "[" + this.x + "(mipmap=" + this.y + ")]";
      }

      @Override
      protected Optional<ame> d() {
         return this.x;
      }
   }

   protected static class k extends gxy {
      public k(String $$0, Runnable $$1, Runnable $$2) {
         super($$0, $$1, $$2);
      }
   }
}
