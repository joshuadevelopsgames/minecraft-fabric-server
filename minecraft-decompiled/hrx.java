import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import java.util.function.Predicate;

public interface hrx {
   alx a = new alx("textures", ".png");

   void a(axo var1, hrx.a var2);

   MapCodec<? extends hrx> a();

   public interface a {
      default void a(ame $$0, axm $$1) {
         this.a($$0, $$2 -> $$2.loadSprite($$0, $$1));
      }

      void a(ame var1, hrx.b var2);

      void a(Predicate<ame> var1);
   }

   public interface b extends Function<hrw, hrm> {
      default void a() {
      }
   }
}
