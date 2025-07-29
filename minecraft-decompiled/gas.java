import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class gas {
   public static final float a = 0.001F;
   private final gaq b;
   @Nullable
   private final GpuTextureView c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;
   private final float j;
   private final float k;

   public gas(gaq $$0, @Nullable GpuTextureView $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public float a(gas.b $$0) {
      return $$0.a + this.h + ($$0.f.d() ? Math.min(this.d(), this.c()) : 0.0F) - a($$0.f.c());
   }

   public float b(gas.b $$0) {
      return $$0.b + this.j - a($$0.f.c());
   }

   public float c(gas.b $$0) {
      return $$0.a + this.i + ($$0.m() ? $$0.h : 0.0F) + ($$0.f.d() ? Math.max(this.d(), this.c()) : 0.0F) + a($$0.f.c());
   }

   public float d(gas.b $$0) {
      return $$0.b + this.k + ($$0.m() ? $$0.h : 0.0F) + a($$0.f.c());
   }

   public void a(gas.b $$0, Matrix4f $$1, fog $$2, int $$3, boolean $$4) {
      yl $$5 = $$0.j();
      boolean $$6 = $$5.d();
      float $$7 = $$0.e();
      float $$8 = $$0.f();
      int $$9 = $$0.g();
      boolean $$10 = $$5.c();
      float $$11 = $$4 ? 0.0F : 0.001F;
      float $$13;
      if ($$0.m()) {
         int $$12 = $$0.h();
         this.a($$6, $$7 + $$0.l(), $$8 + $$0.l(), 0.0F, $$1, $$2, $$12, $$10, $$3);
         if ($$10) {
            this.a($$6, $$7 + $$0.k() + $$0.l(), $$8 + $$0.l(), $$11, $$1, $$2, $$12, true, $$3);
         }

         $$13 = $$4 ? 0.0F : 0.03F;
      } else {
         $$13 = 0.0F;
      }

      this.a($$6, $$7, $$8, $$13, $$1, $$2, $$9, $$10, $$3);
      if ($$10) {
         this.a($$6, $$7 + $$0.k(), $$8, $$13 + $$11, $$1, $$2, $$9, true, $$3);
      }
   }

   private void a(boolean $$0, float $$1, float $$2, float $$3, Matrix4f $$4, fog $$5, int $$6, boolean $$7, int $$8) {
      float $$9 = $$1 + this.h;
      float $$10 = $$1 + this.i;
      float $$11 = $$2 + this.j;
      float $$12 = $$2 + this.k;
      float $$13 = $$0 ? this.d() : 0.0F;
      float $$14 = $$0 ? this.c() : 0.0F;
      float $$15 = a($$7);
      $$5.a($$4, $$9 + $$13 - $$15, $$11 - $$15, $$3).a($$6).a(this.d, this.f).c($$8);
      $$5.a($$4, $$9 + $$14 - $$15, $$12 + $$15, $$3).a($$6).a(this.d, this.g).c($$8);
      $$5.a($$4, $$10 + $$14 + $$15, $$12 + $$15, $$3).a($$6).a(this.e, this.g).c($$8);
      $$5.a($$4, $$10 + $$13 + $$15, $$11 - $$15, $$3).a($$6).a(this.e, this.f).c($$8);
   }

   private static float a(boolean $$0) {
      return $$0 ? 0.1F : 0.0F;
   }

   private float c() {
      return 1.0F - 0.25F * this.k;
   }

   private float d() {
      return 1.0F - 0.25F * this.j;
   }

   public void a(gas.a $$0, Matrix4f $$1, fog $$2, int $$3, boolean $$4) {
      float $$5 = $$4 ? 0.0F : $$0.e;
      if ($$0.m()) {
         this.a($$0, $$0.l(), $$5, $$0.k(), $$2, $$3, $$1);
         $$5 += $$4 ? 0.0F : 0.03F;
      }

      this.a($$0, 0.0F, $$5, $$0.f, $$2, $$3, $$1);
   }

   private void a(gas.a $$0, float $$1, float $$2, int $$3, fog $$4, int $$5, Matrix4f $$6) {
      $$4.a($$6, $$0.a + $$1, $$0.d + $$1, $$2).a($$3).a(this.d, this.f).c($$5);
      $$4.a($$6, $$0.c + $$1, $$0.d + $$1, $$2).a($$3).a(this.d, this.g).c($$5);
      $$4.a($$6, $$0.c + $$1, $$0.b + $$1, $$2).a($$3).a(this.e, this.g).c($$5);
      $$4.a($$6, $$0.a + $$1, $$0.b + $$1, $$2).a($$3).a(this.e, this.f).c($$5);
   }

   @Nullable
   public GpuTextureView a() {
      return this.c;
   }

   public RenderPipeline b() {
      return this.b.d();
   }

   public gxz a(fwz.a $$0) {
      return this.b.a($$0);
   }

   public record a(float a, float b, float c, float d, float e, int f, int g, float h) {

      public a(float $$0, float $$1, float $$2, float $$3, float $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, 0, 0.0F);
      }

      public float c() {
         return this.c + (this.m() ? this.h : 0.0F);
      }

      public float d() {
         return this.d + (this.m() ? this.h : 0.0F);
      }

      boolean m() {
         return this.k() != 0;
      }

      public float e() {
         return this.a;
      }

      public float f() {
         return this.b;
      }

      public float g() {
         return this.c;
      }

      public float h() {
         return this.d;
      }

      public float i() {
         return this.e;
      }

      public int j() {
         return this.f;
      }

      public int k() {
         return this.g;
      }

      public float l() {
         return this.h;
      }
   }

   public record b(float a, float b, int c, int d, gas e, yl f, float g, float h) {

      public float a() {
         return this.e.a(this);
      }

      public float b() {
         return this.e.b(this);
      }

      public float c() {
         return this.e.c(this);
      }

      public float d() {
         return this.e.d(this);
      }

      boolean m() {
         return this.h() != 0;
      }

      public float e() {
         return this.a;
      }

      public float f() {
         return this.b;
      }

      public int g() {
         return this.c;
      }

      public int h() {
         return this.d;
      }

      public gas i() {
         return this.e;
      }

      public yl j() {
         return this.f;
      }

      public float k() {
         return this.g;
      }

      public float l() {
         return this.h;
      }
   }
}
