import com.mojang.serialization.MapCodec;

public abstract class md<T extends mc> {
   private final boolean a;

   protected md(boolean $$0) {
      this.a = $$0;
   }

   public boolean b() {
      return this.a;
   }

   public abstract MapCodec<T> c();

   public abstract zm<? super wx, T> d();
}
