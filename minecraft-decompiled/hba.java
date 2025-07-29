import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.Locale;

public enum hba {
   a(gxx.b, 4194304, true, false),
   b(gxx.d, 4194304, true, false),
   c(gxx.e, 786432, false, false),
   d(gxx.f, 786432, true, true),
   e(gxx.g, 1536, true, true);

   private final RenderPipeline f;
   private final int g;
   private final boolean h;
   private final boolean i;
   private final String j;

   private hba(final RenderPipeline $$0, final int $$1, final boolean $$2, final boolean $$3) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = this.toString().toLowerCase(Locale.ROOT);
   }

   public RenderPipeline a() {
      return this.f;
   }

   public int b() {
      return this.g;
   }

   public String c() {
      return this.j;
   }

   public boolean d() {
      return this.i;
   }

   public GpuTextureView e() {
      hru $$0 = fue.R().ab();
      hrc $$1 = $$0.b(hrr.c);
      $$1.b(this.h);
      return $$1.b();
   }

   public fmr f() {
      fue $$0 = fue.R();
      switch (this) {
         case d:
            fmr $$2 = $$0.f.r();
            return $$2 != null ? $$2 : $$0.h();
         case e:
            fmr $$1 = $$0.f.u();
            return $$1 != null ? $$1 : $$0.h();
         default:
            return $$0.h();
      }
   }
}
