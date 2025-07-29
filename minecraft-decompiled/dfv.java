import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public record dfv(Optional<String> c, Optional<UUID> d, PropertyMap e, GameProfile f) {
   private static final Codec<dfv> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bbi.B.optionalFieldOf("name").forGetter(dfv::d),
            kf.a.optionalFieldOf("id").forGetter(dfv::e),
            bbi.A.optionalFieldOf("properties", new PropertyMap()).forGetter(dfv::f)
         )
         .apply($$0, dfv::new)
   );
   public static final Codec<dfv> a = Codec.withAlternative(g, bbi.B, $$0 -> new dfv(Optional.of($$0), Optional.empty(), new PropertyMap()));
   public static final zm<ByteBuf, dfv> b = zm.a(zk.b(16).a(zk::a), dfv::d, kf.g.a(zk::a), dfv::e, zk.y, dfv::f, dfv::new);

   public dfv(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
      this($$0, $$1, $$2, a($$1, $$0, $$2));
   }

   public dfv(GameProfile $$0) {
      this(Optional.of($$0.getName()), Optional.of($$0.getId()), $$0.getProperties(), $$0);
   }

   @Nullable
   public dfv a() {
      if (this.c()) {
         return this;
      } else {
         Optional<GameProfile> $$0;
         if (this.d.isPresent()) {
            $$0 = ecp.a(this.d.get()).getNow(null);
         } else {
            $$0 = ecp.a(this.c.orElseThrow()).getNow(null);
         }

         return $$0 != null ? this.a($$0) : null;
      }
   }

   public CompletableFuture<dfv> b() {
      if (this.c()) {
         return CompletableFuture.completedFuture(this);
      } else {
         return this.d.isPresent() ? ecp.a(this.d.get()).thenApply(this::a) : ecp.a(this.c.orElseThrow()).thenApply(this::a);
      }
   }

   private dfv a(Optional<GameProfile> $$0) {
      return new dfv($$0.orElseGet(() -> a(this.d, this.c)));
   }

   private static GameProfile a(Optional<UUID> $$0, Optional<String> $$1) {
      return new GameProfile($$0.orElse(ag.e), $$1.orElse(""));
   }

   private static GameProfile a(Optional<UUID> $$0, Optional<String> $$1, PropertyMap $$2) {
      GameProfile $$3 = a($$0, $$1);
      $$3.getProperties().putAll($$2);
      return $$3;
   }

   public boolean c() {
      return !this.e.isEmpty() ? true : this.d.isPresent() == this.c.isPresent();
   }

   public Optional<String> d() {
      return this.c;
   }

   public Optional<UUID> e() {
      return this.d;
   }

   public PropertyMap f() {
      return this.e;
   }

   public GameProfile g() {
      return this.f;
   }
}
