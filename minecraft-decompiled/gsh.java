import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public interface gsh {
   Codec<gsh> a = bda.a(gsh.a::values).dispatch(gsh::a, gsh.a::a);

   gsh.a a();

   public static enum a implements bda {
      a("player", () -> gsi.a.b),
      b("system", () -> gsi.b.b);

      private final String c;
      private final Supplier<MapCodec<? extends gsh>> d;

      private a(final String $$0, final Supplier<MapCodec<? extends gsh>> $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      private MapCodec<? extends gsh> a() {
         return this.d.get();
      }

      @Override
      public String c() {
         return this.c;
      }
   }
}
