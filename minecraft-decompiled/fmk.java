import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import javax.annotation.Nullable;

public class fmk extends GpuTexture {
   protected final int a;
   private final Int2IntMap d = new Int2IntOpenHashMap();
   protected boolean b;
   protected boolean c = true;
   private int e;

   protected fmk(int $$0, String $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.a = $$7;
   }

   @Override
   public void close() {
      if (!this.b) {
         this.b = true;
         if (this.e == 0) {
            this.d();
         }
      }
   }

   private void d() {
      GlStateManager._deleteTexture(this.a);
      IntIterator var1 = this.d.values().iterator();

      while (var1.hasNext()) {
         int $$0 = (Integer)var1.next();
         GlStateManager._glDeleteFramebuffers($$0);
      }
   }

   @Override
   public boolean isClosed() {
      return this.b;
   }

   public int a(flz $$0, @Nullable GpuTexture $$1) {
      int $$2 = $$1 == null ? 0 : ((fmk)$$1).a;
      return this.d.computeIfAbsent($$2, $$2x -> {
         int $$3 = $$0.b();
         $$0.a($$3, this.a, $$2, 0, 0);
         return $$3;
      });
   }

   public void a(int $$0) {
      if (this.c) {
         GlStateManager._texParameter($$0, 10242, GlConst.toGl(this.addressModeU));
         GlStateManager._texParameter($$0, 10243, GlConst.toGl(this.addressModeV));
         switch (this.minFilter) {
            case NEAREST:
               GlStateManager._texParameter($$0, 10241, this.useMipmaps ? 9986 : 9728);
               break;
            case LINEAR:
               GlStateManager._texParameter($$0, 10241, this.useMipmaps ? 9987 : 9729);
         }

         switch (this.magFilter) {
            case NEAREST:
               GlStateManager._texParameter($$0, 10240, 9728);
               break;
            case LINEAR:
               GlStateManager._texParameter($$0, 10240, 9729);
         }

         this.c = false;
      }
   }

   public int a() {
      return this.a;
   }

   @Override
   public void setAddressMode(AddressMode $$0, AddressMode $$1) {
      super.setAddressMode($$0, $$1);
      this.c = true;
   }

   @Override
   public void setTextureFilter(FilterMode $$0, FilterMode $$1, boolean $$2) {
      super.setTextureFilter($$0, $$1, $$2);
      this.c = true;
   }

   @Override
   public void setUseMipmaps(boolean $$0) {
      super.setUseMipmaps($$0);
      this.c = true;
   }

   public void b() {
      this.e++;
   }

   public void c() {
      this.e--;
      if (this.b && this.e == 0) {
         this.d();
      }
   }
}
