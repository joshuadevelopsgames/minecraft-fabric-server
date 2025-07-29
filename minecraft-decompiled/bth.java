import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import javax.annotation.Nullable;

public class bth<T> implements bss<StringReader, Dynamic<?>> {
   private final vj<T> a;

   public bth(DynamicOps<T> $$0) {
      this.a = vj.a($$0);
   }

   @Nullable
   public Dynamic<T> b(bsr<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();

      try {
         return new Dynamic(this.a.a(), this.a.b($$0.f()));
      } catch (Exception var4) {
         $$0.b().a($$1, var4);
         return null;
      }
   }
}
