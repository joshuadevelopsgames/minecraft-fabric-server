import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Dynamic;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ehu implements AutoCloseable {
   private final ehk a;
   private final DataFixer b;
   private final bdr c;

   public ehu(ehr $$0, Path $$1, DataFixer $$2, boolean $$3, bdr $$4) {
      this.b = $$2;
      this.c = $$4;
      this.a = new ehk($$0, $$1, $$3);
   }

   public CompletableFuture<Optional<ui>> a(dlz $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dlz $$0, @Nullable ui $$1) {
      return this.a.a($$0, $$1);
   }

   public ui a(ui $$0, int $$1) {
      int $$2 = ux.b($$0, $$1);
      ui $$3 = this.c.a(this.b, $$0, $$2);
      return ux.e($$3);
   }

   public Dynamic<vi> a(Dynamic<vi> $$0, int $$1) {
      return this.c.a(this.b, $$0, $$1);
   }

   public CompletableFuture<Void> a(boolean $$0) {
      return this.a.a($$0);
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public ehr a() {
      return this.a.a();
   }
}
