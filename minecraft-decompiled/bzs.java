import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public final class bzs<StoredEntityType extends eiu> {
   private static final Codec<? extends bzs<?>> a = kf.a.xmap(bzs::new, bzs::c);
   private static final zm<ByteBuf, ? extends bzs<?>> b = kf.g.a(bzs::new, bzs::c);
   private Either<UUID, StoredEntityType> c;

   public static <Type extends eiu> Codec<bzs<Type>> a() {
      return (Codec<bzs<Type>>)a;
   }

   public static <Type extends eiu> zm<ByteBuf, bzs<Type>> b() {
      return (zm<ByteBuf, bzs<Type>>)b;
   }

   public bzs(StoredEntityType $$0) {
      this.c = Either.right($$0);
   }

   public bzs(UUID $$0) {
      this.c = Either.left($$0);
   }

   public UUID c() {
      return (UUID)this.c.map($$0 -> $$0, eiu::cK);
   }

   @Nullable
   public StoredEntityType a(eit<? super StoredEntityType> $$0, Class<StoredEntityType> $$1) {
      Optional<StoredEntityType> $$2 = this.c.right();
      if ($$2.isPresent()) {
         StoredEntityType $$3 = $$2.get();
         if (!$$3.dU()) {
            return $$3;
         }

         this.c = Either.left($$3.cK());
      }

      Optional<UUID> $$4 = this.c.left();
      if ($$4.isPresent()) {
         StoredEntityType $$5 = this.a($$0.getEntity($$4.get()), $$1);
         if ($$5 != null && !$$5.dU()) {
            this.c = Either.right($$5);
            return $$5;
         }
      }

      return null;
   }

   @Nullable
   private StoredEntityType a(@Nullable eiu $$0, Class<StoredEntityType> $$1) {
      return $$0 != null && $$1.isAssignableFrom($$0.getClass()) ? $$1.cast($$0) : null;
   }

   public boolean a(StoredEntityType $$0) {
      return this.c().equals($$0.cK());
   }

   public void a(fdc $$0, String $$1) {
      $$0.a($$1, kf.a, this.c());
   }

   public static void a(@Nullable bzs<?> $$0, fdc $$1, String $$2) {
      if ($$0 != null) {
         $$0.a($$1, $$2);
      }
   }

   @Nullable
   public static <StoredEntityType extends eiu> StoredEntityType a(
      @Nullable bzs<StoredEntityType> $$0, eit<? super StoredEntityType> $$1, Class<StoredEntityType> $$2
   ) {
      return $$0 != null ? $$0.a($$1, $$2) : null;
   }

   @Nullable
   public static <StoredEntityType extends eiu> bzs<StoredEntityType> a(fda $$0, String $$1) {
      return $$0.<bzs<StoredEntityType>>a($$1, a()).orElse(null);
   }

   @Nullable
   public static <StoredEntityType extends eiu> bzs<StoredEntityType> a(fda $$0, String $$1, dmu $$2) {
      Optional<UUID> $$3 = $$0.a($$1, kf.a);
      return $$3.isPresent() ? new bzs<>($$3.get()) : $$0.g($$1).map($$1x -> aya.a($$2.q(), $$1x)).map(bzs::new).orElse(null);
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 == this ? true : $$0 instanceof bzs<?> $$1 && this.c().equals($$1.c());
   }

   @Override
   public int hashCode() {
      return this.c().hashCode();
   }
}
