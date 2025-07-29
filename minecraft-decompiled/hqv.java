import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public interface hqv<T> {
   void a(@Nullable T var1, dct var2, fod var3, gxn var4, int var5, int var6, boolean var7);

   void a(Set<Vector3f> var1);

   @Nullable
   T b(dcv var1);

   public interface a {
      @Nullable
      hqv<?> a(gqj var1);

      MapCodec<? extends hqv.a> a();
   }
}
