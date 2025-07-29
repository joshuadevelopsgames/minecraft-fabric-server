import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ni implements mt {
   private final mv d;
   private final CompletableFuture<jn.a> e;

   public ni(mv $$0, CompletableFuture<jn.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      Path $$1 = this.d.a(mv.b.c).resolve("commands.json");
      return this.e.thenCompose($$2 -> {
         CommandDispatcher<ek> $$3 = new el(el.a.a, el.a($$2)).a();
         return mt.a($$0, im.a($$3, $$3.getRoot()), $$1);
      });
   }

   @Override
   public final String a() {
      return "Command Syntax";
   }
}
