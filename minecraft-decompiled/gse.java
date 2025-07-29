import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class gse {
   private static final xo a = xo.c("chat.validation_error").a(o.m, o.u);
   private final fue b;
   private final Deque<gse.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public gse(fue $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ag.c() >= this.e + this.d) {
            gse.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(gse.a::a);
         this.c.clear();
      }

      this.d = $$1;
   }

   public void b() {
      this.c.remove().a();
   }

   public long c() {
      return this.c.size();
   }

   public void d() {
      this.c.forEach(gse.a::a);
      this.c.clear();
   }

   public boolean a(ya $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ag.c() < this.e + this.d;
   }

   private void a(@Nullable ya $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new gse.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(ye $$0, GameProfile $$1, xk.a $$2) {
      boolean $$3 = this.b.n.ak().c();
      ye $$4 = $$3 ? $$0.a() : $$0;
      xo $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         grl $$7 = this.b.M();
         if ($$7 != null && $$0.l() != null) {
            $$7.a($$0.l(), $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, @Nullable ya $$1, xk.a $$2) {
      this.a(null, () -> {
         grl $$3 = this.b.M();
         if ($$3 != null && $$1 != null) {
            $$3.a($$1, false);
         }

         if (this.b.a($$0)) {
            return false;
         } else {
            xo $$4 = $$2.a(a);
            this.b.m.e().a($$4, null, fty.d());
            this.b.aZ().b($$2.b(a));
            this.e = ag.c();
            return true;
         }
      });
   }

   public void a(xo $$0, xk.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         xo $$3 = $$1.a($$0);
         this.b.m.e().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ag.c();
         return true;
      });
   }

   private boolean a(xk.a $$0, ye $$1, xo $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      gsg $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         fty $$7 = $$6.a($$1);
         ya $$8 = $$1.l();
         xs $$9 = $$1.o();
         if ($$9.a()) {
            this.b.m.e().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            xo $$10 = $$9.b($$1.c());
            if ($$10 != null) {
               this.b.m.e().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ag.c();
         return true;
      } else {
         return false;
      }
   }

   private void a(xk.a $$0, xo $$1) {
      this.b.aZ().a($$0.b($$1));
   }

   private gsg a(ye $$0, xo $$1, Instant $$2) {
      return this.a($$0.g()) ? gsg.a : gsg.a($$0, $$1, $$2);
   }

   private void a(ye $$0, xk.a $$1, GameProfile $$2, gsg $$3) {
      gsf $$4 = this.b.bb().b();
      $$4.a(gsi.a($$2, $$0, $$3));
   }

   private void a(xo $$0, Instant $$1) {
      gsf $$2 = this.b.bb().b();
      $$2.a(gsi.a($$0, $$1));
   }

   public void a(xo $$0, boolean $$1) {
      if (!this.b.n.ai().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.m.a($$0, false);
            this.b.aZ().c($$0);
         } else {
            this.b.m.e().a($$0);
            this.a($$0, Instant.now());
            this.b.aZ().b($$0);
         }
      }
   }

   private UUID a(xo $$0) {
      String $$1 = bcz.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ag.e : this.b.aO().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.U() && this.b.t != null) {
         UUID $$1 = this.b.t.gr().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   record a(@Nullable ya a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public ya b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
