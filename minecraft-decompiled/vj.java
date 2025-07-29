import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;

public class vj<T> {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("argument.nbt.trailing"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("argument.nbt.expected.compound"));
   public static final char c = ',';
   public static final char d = ':';
   private static final vj<vi> g = a(uw.a);
   public static final Codec<ui> e = Codec.STRING.comapFlatMap($$0 -> {
      try {
         vi $$1 = g.b($$0);
         return $$1 instanceof ui $$2 ? DataResult.success($$2, Lifecycle.stable()) : DataResult.error(() -> "Expected compound tag, got " + $$1);
      } catch (CommandSyntaxException var3) {
         return DataResult.error(var3::getMessage);
      }
   }, ui::toString);
   public static final Codec<ui> f = Codec.withAlternative(e, ui.a);
   private final DynamicOps<T> h;
   private final bsx<T> i;

   private vj(DynamicOps<T> $$0, bsx<T> $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public DynamicOps<T> a() {
      return this.h;
   }

   public static <T> vj<T> a(DynamicOps<T> $$0) {
      return new vj<>($$0, vc.a($$0));
   }

   private static ui a(StringReader $$0, vi $$1) throws CommandSyntaxException {
      if ($$1 instanceof ui $$2) {
         return $$2;
      } else {
         throw b.createWithContext($$0);
      }
   }

   public static ui a(String $$0) throws CommandSyntaxException {
      StringReader $$1 = new StringReader($$0);
      return a($$1, g.a($$1));
   }

   public T b(String $$0) throws CommandSyntaxException {
      return this.a(new StringReader($$0));
   }

   public T a(StringReader $$0) throws CommandSyntaxException {
      T $$1 = this.i.a($$0);
      $$0.skipWhitespace();
      if ($$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         return $$1;
      }
   }

   public T b(StringReader $$0) throws CommandSyntaxException {
      return this.i.a($$0);
   }

   public static ui c(StringReader $$0) throws CommandSyntaxException {
      vi $$1 = g.b($$0);
      return a($$0, $$1);
   }
}
