import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface avl {
   avl e = new avl() {
      @Override
      public CompletableFuture<auu> a(String $$0) {
         return CompletableFuture.completedFuture(auu.a($$0));
      }

      @Override
      public CompletableFuture<List<auu>> a(List<String> $$0) {
         return CompletableFuture.completedFuture($$0.stream().map(auu::a).collect(ImmutableList.toImmutableList()));
      }
   };

   default void a() {
   }

   default void b() {
   }

   CompletableFuture<auu> a(String var1);

   CompletableFuture<List<auu>> a(List<String> var1);
}
