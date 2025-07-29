import com.google.common.base.Suppliers;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class grw {
   private final GameProfile a;
   private final Supplier<hst> b;
   private dmr c = dmr.e;
   private int d;
   @Nullable
   private xo e;
   private boolean f = true;
   @Nullable
   private yf g;
   private yk h;
   private int i;

   public grw(GameProfile $$0, boolean $$1) {
      this.a = $$0;
      this.h = c($$1);
      Supplier<Supplier<hst>> $$2 = Suppliers.memoize(() -> a($$0));
      this.b = () -> $$2.get().get();
   }

   private static Supplier<hst> a(GameProfile $$0) {
      fue $$1 = fue.R();
      hsu $$2 = $$1.ao();
      CompletableFuture<Optional<hst>> $$3 = $$2.c($$0);
      boolean $$4 = !$$1.b($$0.getId());
      hst $$5 = hsk.a($$0);
      return () -> {
         hst $$3x = $$3.getNow(Optional.empty()).orElse($$5);
         return $$4 && !$$3x.f() ? $$5 : $$3x;
      };
   }

   public GameProfile a() {
      return this.a;
   }

   @Nullable
   public yf b() {
      return this.g;
   }

   public yk c() {
      return this.h;
   }

   public boolean d() {
      return this.g != null;
   }

   protected void a(yf $$0) {
      this.g = $$0;
      this.h = $$0.a(cux.b);
   }

   protected void a(boolean $$0) {
      this.g = null;
      this.h = c($$0);
   }

   private static yk c(boolean $$0) {
      return $$0 ? yk.c : yk.b;
   }

   public dmr e() {
      return this.c;
   }

   protected void a(dmr $$0) {
      this.c = $$0;
   }

   public int f() {
      return this.d;
   }

   protected void a(int $$0) {
      this.d = $$0;
   }

   public hst g() {
      return this.b.get();
   }

   @Nullable
   public fjs h() {
      return fue.R().s.S().e(this.a().getName());
   }

   public void a(@Nullable xo $$0) {
      this.e = $$0;
   }

   @Nullable
   public xo i() {
      return this.e;
   }

   public void b(boolean $$0) {
      this.f = $$0;
   }

   public boolean j() {
      return this.f;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public int k() {
      return this.i;
   }
}
