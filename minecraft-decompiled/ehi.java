import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.MapCodec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ehi implements AutoCloseable {
   public static final int d = 1493;
   private final ehk a;
   protected final DataFixer e;
   @Nullable
   private volatile eut b;

   public ehi(ehr $$0, Path $$1, DataFixer $$2, boolean $$3) {
      this.e = $$2;
      this.a = new ehk($$0, $$1, $$3);
   }

   public boolean b(dlz $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public ui a(amd<dmu> $$0, Supplier<fcm> $$1, ui $$2, Optional<amd<MapCodec<? extends efz>>> $$3) {
      int $$4 = a($$2);
      if ($$4 == ac.b().a().b()) {
         return $$2;
      } else {
         try {
            if ($$4 < 1493) {
               $$2 = bdr.d.a(this.e, $$2, $$4, 1493);
               if ($$2.m("Level").flatMap($$0x -> $$0x.q("hasLegacyStructureData")).orElse(false)) {
                  eut $$5 = this.a($$0, $$1);
                  $$2 = $$5.a($$2);
               }
            }

            a($$2, $$0, $$3);
            $$2 = bdr.d.a(this.e, $$2, Math.max(1493, $$4));
            b($$2);
            ux.e($$2);
            return $$2;
         } catch (Exception var9) {
            p $$7 = p.a(var9, "Updated chunk");
            q $$8 = $$7.a("Updated chunk details");
            $$8.a("Data version", $$4);
            throw new aa($$7);
         }
      }
   }

   private eut a(amd<dmu> $$0, Supplier<fcm> $$1) {
      eut $$2 = this.b;
      if ($$2 == null) {
         synchronized (this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = eut.a($$0, $$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(ui $$0, amd<dmu> $$1, Optional<amd<MapCodec<? extends efz>>> $$2) {
      ui $$3 = new ui();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", $$3);
   }

   private static void b(ui $$0) {
      $$0.r("__context");
   }

   public static int a(ui $$0) {
      return ux.b($$0, -1);
   }

   public CompletableFuture<Optional<ui>> d(dlz $$0) {
      return this.a.a($$0);
   }

   public CompletableFuture<Void> a(dlz $$0, Supplier<ui> $$1) {
      this.e($$0);
      return this.a.a($$0, $$1);
   }

   protected void e(dlz $$0) {
      if (this.b != null) {
         this.b.a($$0.a());
      }
   }

   public void o() {
      this.a.a(true).join();
   }

   @Override
   public void close() throws IOException {
      this.a.close();
   }

   public ehh p() {
      return this.a;
   }

   protected ehr q() {
      return this.a.a();
   }
}
