import com.mojang.blaze3d.textures.GpuTexture;

public interface hro extends AutoCloseable {
   void a(int var1, int var2, GpuTexture var3);

   @Override
   void close();
}
