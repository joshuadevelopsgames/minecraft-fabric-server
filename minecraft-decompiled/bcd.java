import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class bcd implements DynamicOps<bdk> {
   public static final bcd a = new bcd();

   private bcd() {
   }

   public <U> U a(DynamicOps<U> $$0, bdk $$1) {
      return (U)$$0.empty();
   }

   public bdk a() {
      return bdk.a;
   }

   public bdk b() {
      return bdk.a;
   }

   public bdk c() {
      return bdk.a;
   }

   public bdk a(Number $$0) {
      return bdk.a;
   }

   public bdk a(byte $$0) {
      return bdk.a;
   }

   public bdk a(short $$0) {
      return bdk.a;
   }

   public bdk a(int $$0) {
      return bdk.a;
   }

   public bdk a(long $$0) {
      return bdk.a;
   }

   public bdk a(float $$0) {
      return bdk.a;
   }

   public bdk a(double $$0) {
      return bdk.a;
   }

   public bdk a(boolean $$0) {
      return bdk.a;
   }

   public bdk a(String $$0) {
      return bdk.a;
   }

   public DataResult<Number> a(bdk $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bdk $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bdk $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bdk> a(bdk $$0, bdk $$1) {
      return DataResult.success(bdk.a);
   }

   public DataResult<bdk> a(bdk $$0, List<bdk> $$1) {
      return DataResult.success(bdk.a);
   }

   public DataResult<bdk> a(bdk $$0, bdk $$1, bdk $$2) {
      return DataResult.success(bdk.a);
   }

   public DataResult<bdk> a(bdk $$0, Map<bdk, bdk> $$1) {
      return DataResult.success(bdk.a);
   }

   public DataResult<bdk> a(bdk $$0, MapLike<bdk> $$1) {
      return DataResult.success(bdk.a);
   }

   public DataResult<Stream<Pair<bdk, bdk>>> d(bdk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bdk, bdk>>> e(bdk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bdk>> f(bdk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bdk>> g(bdk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bdk>>> h(bdk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bdk $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bdk $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bdk $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bdk a(Stream<Pair<bdk, bdk>> $$0) {
      return bdk.a;
   }

   public bdk a(Map<bdk, bdk> $$0) {
      return bdk.a;
   }

   public bdk b(Stream<bdk> $$0) {
      return bdk.a;
   }

   public bdk a(ByteBuffer $$0) {
      return bdk.a;
   }

   public bdk a(IntStream $$0) {
      return bdk.a;
   }

   public bdk a(LongStream $$0) {
      return bdk.a;
   }

   public bdk a(bdk $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bdk> mapBuilder() {
      return new bcd.b(this);
   }

   public ListBuilder<bdk> listBuilder() {
      return new bcd.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends bal<bdk, bdk> {
      public a(DynamicOps<bdk> $$0) {
         super($$0);
      }

      protected bdk b() {
         return bdk.a;
      }

      protected bdk a(bdk $$0, bdk $$1) {
         return $$0;
      }

      protected DataResult<bdk> b(bdk $$0, bdk $$1) {
         return DataResult.success($$0);
      }
   }

   static final class b extends AbstractUniversalBuilder<bdk, bdk> {
      public b(DynamicOps<bdk> $$0) {
         super($$0);
      }

      protected bdk a() {
         return bdk.a;
      }

      protected bdk a(bdk $$0, bdk $$1, bdk $$2) {
         return $$2;
      }

      protected DataResult<bdk> a(bdk $$0, bdk $$1) {
         return DataResult.success($$1);
      }
   }
}
