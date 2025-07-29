import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class dlt implements ej {
   private static final SimpleDateFormat b = new SimpleDateFormat("HH:mm:ss");
   private static final xo c = xo.b("@");
   private static final int d = -1;
   private long e = -1L;
   private boolean f = true;
   private int g;
   private boolean h = true;
   @Nullable
   private xo i;
   private String j = "";
   @Nullable
   private xo k;

   public int k() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public xo l() {
      return this.i == null ? xn.a : this.i;
   }

   public void a(fdc $$0) {
      $$0.a("Command", this.j);
      $$0.a("SuccessCount", this.g);
      $$0.b("CustomName", xq.a, this.k);
      $$0.a("TrackOutput", this.h);
      if (this.h) {
         $$0.b("LastOutput", xq.a, this.i);
      }

      $$0.a("UpdateLastExecution", this.f);
      if (this.f && this.e != -1L) {
         $$0.a("LastExecution", this.e);
      }
   }

   public void a(fda $$0) {
      this.j = $$0.a("Command", "");
      this.g = $$0.a("SuccessCount", 0);
      this.b(eaz.a($$0, "CustomName"));
      this.h = $$0.a("TrackOutput", true);
      if (this.h) {
         this.i = eaz.a($$0, "LastOutput");
      } else {
         this.i = null;
      }

      this.f = $$0.a("UpdateLastExecution", true);
      if (this.f) {
         this.e = $$0.a("LastExecution", -1L);
      } else {
         this.e = -1L;
      }
   }

   public void a(String $$0) {
      this.j = $$0;
      this.g = 0;
   }

   public String m() {
      return this.j;
   }

   public boolean a(dmu $$0) {
      if ($$0.C || $$0.ae() == this.e) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.j)) {
         this.i = xo.b("#itzlipofutzli");
         this.g = 1;
         return true;
      } else {
         this.g = 0;
         MinecraftServer $$1 = this.e().q();
         if ($$1.q() && !bdb.b(this.j)) {
            try {
               this.i = null;
               ek $$2 = this.i().a((eh)(($$0x, $$1x) -> {
                  if ($$0x) {
                     this.g++;
                  }
               }));
               $$1.aG().a($$2, this.j);
            } catch (Throwable var6) {
               p $$4 = p.a(var6, "Executing command block");
               q $$5 = $$4.a("Command to be executed");
               $$5.a("Command", this::m);
               $$5.a("Name", () -> this.n().getString());
               throw new aa($$4);
            }
         }

         if (this.f) {
            this.e = $$0.ae();
         } else {
            this.e = -1L;
         }

         return true;
      }
   }

   public xo n() {
      return this.k != null ? this.k : c;
   }

   @Nullable
   public xo o() {
      return this.k;
   }

   public void b(@Nullable xo $$0) {
      this.k = $$0;
   }

   @Override
   public void a(xo $$0) {
      if (this.h) {
         this.i = xo.b("[" + b.format(new Date()) + "] ").b($$0);
         this.f();
      }
   }

   public abstract aub e();

   public abstract void f();

   public void c(@Nullable xo $$0) {
      this.i = $$0;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public boolean p() {
      return this.h;
   }

   public bxj a(cut $$0) {
      if (!$$0.gQ()) {
         return bxj.e;
      } else {
         if ($$0.ai().C) {
            $$0.a(this);
         }

         return bxj.a;
      }
   }

   public abstract fis g();

   public abstract ek i();

   @Override
   public boolean x_() {
      return this.e().P().c(dmq.q) && this.h;
   }

   @Override
   public boolean y_() {
      return this.h;
   }

   @Override
   public boolean c() {
      return this.e().P().c(dmq.k);
   }

   public abstract boolean j();
}
