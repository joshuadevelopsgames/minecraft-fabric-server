import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public interface yq {
   MapCodec<yq> c = xq.a(new yq.a[]{yr.b, yp.b, yy.b}, yq.a::a, yq::a, "source");

   Stream<ui> a(ek var1) throws CommandSyntaxException;

   yq.a<?> a();

   public record a<T extends yq>(MapCodec<T> a, String b) implements bda {
      @Override
      public String c() {
         return this.b;
      }
   }
}
