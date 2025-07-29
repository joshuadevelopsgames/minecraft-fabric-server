import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fro extends hyg {
   private static final Logger b = LogUtils.getLogger();
   private static final hyh c = new hyh(Duration.ofSeconds(5L));
   private final List<ftc> G;
   private final get H;
   protected final gbo a = gbo.d();
   private volatile xo I;
   @Nullable
   private fye J;

   public fro(get $$0, ftc... $$1) {
      super(ftv.a);
      this.H = $$0;
      this.G = List.of($$1);
      if (this.G.isEmpty()) {
         throw new IllegalArgumentException("No tasks added");
      } else {
         this.I = this.G.get(0).a();
         Runnable $$2 = () -> {
            for (ftc $$1x : $$1) {
               this.a($$1x.a());
               if ($$1x.d()) {
                  break;
               }

               $$1x.run();
               if ($$1x.d()) {
                  return;
               }
            }
         };
         Thread $$3 = new Thread($$2, "Realms-long-running-task");
         $$3.setUncaughtExceptionHandler(new fqv(b));
         $$3.start();
      }
   }

   @Override
   public void e() {
      super.e();
      if (this.J != null) {
         c.a(this.n.aZ(), this.J.A());
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void aV_() {
      this.a.c().b();
      this.a.a(F());
      this.J = new fye(this.q, this.I);
      this.a.a(this.J, $$0 -> $$0.c(10).e(30));
      this.a.a(fxo.a(xn.e, $$0 -> this.f()).a());
      this.a.a($$1 -> {
         fxm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.a.a();
      gbi.a(this.a, this.I());
   }

   protected void f() {
      for (ftc $$0 : this.G) {
         $$0.b();
      }

      this.n.a(this.H);
   }

   public void a(xo $$0) {
      if (this.J != null) {
         this.J.b($$0);
      }

      this.I = $$0;
   }
}
