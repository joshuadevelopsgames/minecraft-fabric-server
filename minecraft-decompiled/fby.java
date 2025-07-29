import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public record fby<T extends fbx>(String a, Function<fbx.a, T> b, Function<fbx.a, Codec<T>> c, bdr d) {
   public fby(String $$0, Supplier<T> $$1, Codec<T> $$2, bdr $$3) {
      this($$0, $$1x -> $$1.get(), $$1x -> $$2, $$3);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof fby<?> $$1 && this.a.equals($$1.a);
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public String toString() {
      return "SavedDataType[" + this.a + "]";
   }
}
