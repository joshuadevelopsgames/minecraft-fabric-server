import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eku {
   Codec<eku> a = Codec.xor(eku.b.d, Codec.xor(eku.a.d, eku.c.d)).xmap(eku::a, eku::a);
   eku b = b(0);
   eku c = c(0);

   static eku a(int $$0) {
      return new eku.b($$0);
   }

   static eku b(int $$0) {
      return new eku.a($$0);
   }

   static eku c(int $$0) {
      return new eku.c($$0);
   }

   static eku a() {
      return b;
   }

   static eku b() {
      return c;
   }

   private static eku a(Either<eku.b, Either<eku.a, eku.c>> $$0) {
      return (eku)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eku.b, Either<eku.a, eku.c>> a(eku $$0) {
      return $$0 instanceof eku.b ? Either.left((eku.b)$$0) : Either.right($$0 instanceof eku.a ? Either.left((eku.a)$$0) : Either.right((eku.c)$$0));
   }

   int a(ekx var1);

   public record a(int e) implements eku {
      public static final Codec<eku.a> d = Codec.intRange(ehy.e, ehy.d).fieldOf("above_bottom").xmap(eku.a::new, eku.a::c).codec();

      @Override
      public int a(ekx $$0) {
         return $$0.a() + this.e;
      }

      @Override
      public String toString() {
         return this.e + " above bottom";
      }

      public int c() {
         return this.e;
      }
   }

   public record b(int e) implements eku {
      public static final Codec<eku.b> d = Codec.intRange(ehy.e, ehy.d).fieldOf("absolute").xmap(eku.b::new, eku.b::c).codec();

      @Override
      public int a(ekx $$0) {
         return this.e;
      }

      @Override
      public String toString() {
         return this.e + " absolute";
      }

      public int c() {
         return this.e;
      }
   }

   public record c(int e) implements eku {
      public static final Codec<eku.c> d = Codec.intRange(ehy.e, ehy.d).fieldOf("below_top").xmap(eku.c::new, eku.c::c).codec();

      @Override
      public int a(ekx $$0) {
         return $$0.b() - 1 + $$0.a() - this.e;
      }

      @Override
      public String toString() {
         return this.e + " below top";
      }

      public int c() {
         return this.e;
      }
   }
}
