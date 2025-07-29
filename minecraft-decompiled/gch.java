import com.mojang.blaze3d.textures.GpuTextureView;
import javax.annotation.Nullable;

public record gch(@Nullable GpuTextureView a, @Nullable GpuTextureView b, @Nullable GpuTextureView c) {
   private static final gch d = new gch(null, null, null);
   private static int e;

   public static gch a(GpuTextureView $$0) {
      return new gch($$0, null, null);
   }

   public static gch b(GpuTextureView $$0) {
      return new gch($$0, null, fue.R().j.m().a());
   }

   public static gch a(GpuTextureView $$0, GpuTextureView $$1) {
      return new gch($$0, $$1, null);
   }

   public static gch a() {
      return d;
   }

   public int b() {
      return this.hashCode();
   }

   public static void c() {
      e = Math.round(100000.0F * (float)Math.random());
   }

   @Nullable
   public GpuTextureView d() {
      return this.a;
   }

   @Nullable
   public GpuTextureView e() {
      return this.b;
   }

   @Nullable
   public GpuTextureView f() {
      return this.c;
   }
}
