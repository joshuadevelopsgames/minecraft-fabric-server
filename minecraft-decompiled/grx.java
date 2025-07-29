import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public interface grx {
   grx a = new grx() {
      @Override
      public CompletableFuture<Optional<cuw>> a() {
         return CompletableFuture.completedFuture(Optional.empty());
      }

      @Override
      public boolean b() {
         return false;
      }
   };

   static grx a(UserApiService $$0, fuq $$1, Path $$2) {
      return (grx)($$1.g() == fuq.a.c ? new grc($$0, $$1.b(), $$2) : a);
   }

   CompletableFuture<Optional<cuw>> a();

   boolean b();
}
