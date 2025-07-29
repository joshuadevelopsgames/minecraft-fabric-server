import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public interface car {
   String j_ = "AngerTime";
   String k_ = "AngryAt";

   int a();

   void a(int var1);

   @Nullable
   UUID b();

   void a(@Nullable UUID var1);

   void c();

   default void a_(fdc $$0) {
      $$0.a("AngerTime", this.a());
      $$0.b("AngryAt", kf.a, this.b());
   }

   default void a(dmu $$0, fda $$1) {
      this.a($$1.a("AngerTime", 0));
      if ($$0 instanceof aub $$2) {
         UUID $$4 = $$1.<UUID>a("AngryAt", kf.a).orElse(null);
         this.a($$4);
         if (($$4 != null ? $$2.b($$4) : null) instanceof cam $$6) {
            this.g($$6);
         }
      }
   }

   default void a(aub $$0, boolean $$1) {
      cam $$2 = this.e();
      UUID $$3 = this.b();
      if (($$2 == null || $$2.eM()) && $$3 != null && $$0.b($$3) instanceof cao) {
         this.i();
      } else {
         if ($$2 != null && !Objects.equals($$3, $$2.cK())) {
            this.a($$2.cK());
            this.c();
         }

         if (this.a() > 0 && ($$2 == null || $$2.ap() != bzv.bU || !$$1)) {
            this.a(this.a() - 1);
            if (this.a() == 0) {
               this.i();
            }
         }
      }
   }

   default boolean a(cam $$0, aub $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         return $$0.ap() == bzv.bU && this.a_($$1) ? true : $$0.cK().equals(this.b());
      }
   }

   default boolean a_(aub $$0) {
      return $$0.P().c(dmq.Q) && this.ad_() && this.b() == null;
   }

   default boolean ad_() {
      return this.a() > 0;
   }

   default void a_(aub $$0, cut $$1) {
      if ($$0.P().c(dmq.P)) {
         if ($$1.cK().equals(this.b())) {
            this.i();
         }
      }
   }

   default void ab_() {
      this.i();
      this.c();
   }

   default void i() {
      this.a(null);
      this.a(null);
      this.g(null);
      this.a(0);
   }

   @Nullable
   cam ew();

   void a(@Nullable cam var1);

   void g(@Nullable cam var1);

   boolean c(cam var1);

   @Nullable
   cam e();
}
