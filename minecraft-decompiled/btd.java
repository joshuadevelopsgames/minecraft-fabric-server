import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public abstract class btd<C, V> implements bss<StringReader, V>, bte {
   private final bsq<StringReader, ame> b;
   protected final C a;
   private final bsm<CommandSyntaxException> c;

   protected btd(bsq<StringReader, ame> $$0, C $$1) {
      this.b = $$0;
      this.a = $$1;
      this.c = bsm.a(ame.c);
   }

   @Nullable
   @Override
   public V a(bsr<StringReader> $$0) {
      $$0.f().skipWhitespace();
      int $$1 = $$0.g();
      ame $$2 = $$0.a(this.b);
      if ($$2 != null) {
         try {
            return this.a((ImmutableStringReader)$$0.f(), $$2);
         } catch (Exception var5) {
            $$0.b().a($$1, this, var5);
            return null;
         }
      } else {
         $$0.b().a($$1, this, this.c);
         return null;
      }
   }

   protected abstract V a(ImmutableStringReader var1, ame var2) throws Exception;
}
