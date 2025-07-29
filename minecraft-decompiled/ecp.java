import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class ecp extends eaz {
   private static final String b = "profile";
   private static final String c = "note_block_sound";
   private static final String d = "custom_name";
   @Nullable
   private static Executor e;
   @Nullable
   private static LoadingCache<String, CompletableFuture<Optional<GameProfile>>> f;
   @Nullable
   private static LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> g;
   public static final Executor a = $$0 -> {
      Executor $$1 = e;
      if ($$1 != null) {
         $$1.execute($$0);
      }
   };
   @Nullable
   private dfv h;
   @Nullable
   private ame i;
   private int j;
   private boolean k;
   @Nullable
   private xo l;

   public ecp(jb $$0, eeb $$1) {
      super(ebb.q, $$0, $$1);
   }

   public static void a(final amz $$0, Executor $$1) {
      e = $$1;
      final BooleanSupplier $$2 = () -> g == null;
      f = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<String, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(String $$0x) {
               return ecp.a($$0, $$0);
            }
         });
      g = CacheBuilder.newBuilder()
         .expireAfterAccess(Duration.ofMinutes(10L))
         .maximumSize(256L)
         .build(new CacheLoader<UUID, CompletableFuture<Optional<GameProfile>>>() {
            public CompletableFuture<Optional<GameProfile>> a(UUID $$0x) {
               return ecp.a($$0, $$0, $$2);
            }
         });
   }

   static CompletableFuture<Optional<GameProfile>> a(String $$0, amz $$1) {
      return $$1.f()
         .b($$0)
         .thenCompose(
            $$0x -> {
               LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1x = g;
               return $$1x != null && !$$0x.isEmpty()
                  ? ((CompletableFuture)$$1x.getUnchecked(((GameProfile)$$0x.get()).getId())).thenApply($$1xx -> $$1xx.or(() -> $$0x))
                  : CompletableFuture.completedFuture(Optional.empty());
            }
         );
   }

   static CompletableFuture<Optional<GameProfile>> a(UUID $$0, amz $$1, BooleanSupplier $$2) {
      return CompletableFuture.supplyAsync(() -> {
         if ($$2.getAsBoolean()) {
            return Optional.empty();
         } else {
            ProfileResult $$3 = $$1.c().fetchProfile($$0, true);
            return Optional.ofNullable($$3).map(ProfileResult::profile);
         }
      }, ag.h().a("fetchProfile"));
   }

   public static void a() {
      e = null;
      f = null;
      g = null;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("profile", dfv.a, this.h);
      $$0.b("note_block_sound", ame.a, this.i);
      $$0.b("custom_name", xq.a, this.l);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.<dfv>a("profile", dfv.a).orElse(null));
      this.i = $$0.<ame>a("note_block_sound", ame.a).orElse(null);
      this.l = a($$0, "custom_name");
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ecp $$3) {
      if ($$2.b(dxm.a) && $$2.c(dxm.a)) {
         $$3.k = true;
         $$3.j++;
      } else {
         $$3.k = false;
      }
   }

   public float a(float $$0) {
      return this.k ? this.j + $$0 : this.j;
   }

   @Nullable
   public dfv c() {
      return this.h;
   }

   @Nullable
   public ame d() {
      return this.i;
   }

   public acw f() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public void a(@Nullable dfv $$0) {
      synchronized (this) {
         this.h = $$0;
      }

      this.j();
   }

   private void j() {
      if (this.h != null && !this.h.c()) {
         this.h.b().thenAcceptAsync($$0 -> {
            this.h = $$0;
            this.e();
         }, a);
      } else {
         this.e();
      }
   }

   public static CompletableFuture<Optional<GameProfile>> a(String $$0) {
      LoadingCache<String, CompletableFuture<Optional<GameProfile>>> $$1 = f;
      return $$1 != null && bdb.f($$0) ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   public static CompletableFuture<Optional<GameProfile>> a(UUID $$0) {
      LoadingCache<UUID, CompletableFuture<Optional<GameProfile>>> $$1 = g;
      return $$1 != null ? (CompletableFuture)$$1.getUnchecked($$0) : CompletableFuture.completedFuture(Optional.empty());
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.a($$0.a(kq.ak));
      this.i = $$0.a(kq.al);
      this.l = $$0.a(kq.g);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.ak, this.h);
      $$0.a(kq.al, this.i);
      $$0.a(kq.g, this.l);
   }

   @Override
   public void b(fdc $$0) {
      super.b($$0);
      $$0.c("profile");
      $$0.c("note_block_sound");
      $$0.c("custom_name");
   }
}
