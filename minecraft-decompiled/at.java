import com.mojang.serialization.Codec;

public interface at<T extends au> {
   void a(amm var1, at.a<T> var2);

   void b(amm var1, at.a<T> var2);

   void a(amm var1);

   Codec<T> a();

   default ar<T> a(T $$0) {
      return new ar<>(this, $$0);
   }

   public record a<T extends au>(T a, aj b, String c) {
      public void a(amm $$0) {
         $$0.a(this.b, this.c);
      }
   }
}
