import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public interface fdc {
   <T> void a(String var1, Codec<T> var2, T var3);

   <T> void b(String var1, Codec<T> var2, @Nullable T var3);

   @Deprecated
   <T> void a(MapCodec<T> var1, T var2);

   void a(String var1, boolean var2);

   void a(String var1, byte var2);

   void a(String var1, short var2);

   void a(String var1, int var2);

   void a(String var1, long var2);

   void a(String var1, float var2);

   void a(String var1, double var2);

   void a(String var1, String var2);

   void a(String var1, int[] var2);

   fdc a(String var1);

   fdc.b b(String var1);

   <T> fdc.a<T> a(String var1, Codec<T> var2);

   void c(String var1);

   boolean a();

   public interface a<T> {
      void a(T var1);

      boolean a();
   }

   public interface b {
      fdc a();

      void b();

      boolean c();
   }
}
