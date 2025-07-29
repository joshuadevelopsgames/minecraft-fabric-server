import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class fdb {
   final jn.a a;
   private final DynamicOps<vi> b;
   final fda.b c = new fda.b() {
      @Override
      public boolean a() {
         return true;
      }

      @Override
      public Stream<fda> b() {
         return Stream.empty();
      }

      @Override
      public Iterator<fda> iterator() {
         return Collections.emptyIterator();
      }
   };
   private final fda.a<Object> d = new fda.a<Object>() {
      @Override
      public boolean a() {
         return true;
      }

      @Override
      public Stream<Object> b() {
         return Stream.empty();
      }

      @Override
      public Iterator<Object> iterator() {
         return Collections.emptyIterator();
      }
   };
   private final fda e = new fda() {
      @Override
      public <T> Optional<T> a(String $$0, Codec<T> $$1) {
         return Optional.empty();
      }

      @Override
      public <T> Optional<T> a(MapCodec<T> $$0) {
         return Optional.empty();
      }

      @Override
      public Optional<fda> a(String $$0) {
         return Optional.empty();
      }

      @Override
      public fda b(String $$0) {
         return this;
      }

      @Override
      public Optional<fda.b> c(String $$0) {
         return Optional.empty();
      }

      @Override
      public fda.b d(String $$0) {
         return fdb.this.c;
      }

      @Override
      public <T> Optional<fda.a<T>> b(String $$0, Codec<T> $$1) {
         return Optional.empty();
      }

      @Override
      public <T> fda.a<T> c(String $$0, Codec<T> $$1) {
         return fdb.this.e();
      }

      @Override
      public boolean a(String $$0, boolean $$1) {
         return $$1;
      }

      @Override
      public byte a(String $$0, byte $$1) {
         return $$1;
      }

      @Override
      public int a(String $$0, short $$1) {
         return $$1;
      }

      @Override
      public Optional<Integer> e(String $$0) {
         return Optional.empty();
      }

      @Override
      public int a(String $$0, int $$1) {
         return $$1;
      }

      @Override
      public long a(String $$0, long $$1) {
         return $$1;
      }

      @Override
      public Optional<Long> f(String $$0) {
         return Optional.empty();
      }

      @Override
      public float a(String $$0, float $$1) {
         return $$1;
      }

      @Override
      public double a(String $$0, double $$1) {
         return $$1;
      }

      @Override
      public Optional<String> g(String $$0) {
         return Optional.empty();
      }

      @Override
      public String a(String $$0, String $$1) {
         return $$1;
      }

      @Override
      public jn.a a() {
         return fdb.this.a;
      }

      @Override
      public Optional<int[]> h(String $$0) {
         return Optional.empty();
      }
   };

   public fdb(jn.a $$0, DynamicOps<vi> $$1) {
      this.a = $$0;
      this.b = $$0.a($$1);
   }

   public DynamicOps<vi> a() {
      return this.b;
   }

   public jn.a b() {
      return this.a;
   }

   public fda c() {
      return this.e;
   }

   public fda.b d() {
      return this.c;
   }

   public <T> fda.a<T> e() {
      return (fda.a<T>)this.d;
   }
}
