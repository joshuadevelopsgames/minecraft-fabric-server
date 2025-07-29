import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ect extends eaz {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "";
   private static final boolean c = false;
   private efm d;
   private String e = "";
   private boolean f = false;
   private boolean g;

   public ect(jb $$0, eeb $$1) {
      super(ebb.T, $$0, $$1);
      this.d = $$1.c(dyt.b);
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("mode", efm.e, this.d);
      $$0.a("message", this.e);
      $$0.a("powered", this.f);
   }

   @Override
   protected void a(fda $$0) {
      this.d = $$0.<efm>a("mode", efm.e).orElse(efm.c);
      this.e = $$0.a("message", "");
      this.f = $$0.a("powered", false);
   }

   private void w() {
      if (this.n != null) {
         jb $$0 = this.aA_();
         eeb $$1 = this.n.a_($$0);
         if ($$1.a(dqb.pJ)) {
            this.n.a($$0, $$1.b(dyt.b, this.d), 2);
         }
      }
   }

   @Nullable
   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public boolean c() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.f = $$0;
   }

   public efm d() {
      return this.d;
   }

   public void a(efm $$0) {
      this.d = $$0;
      this.w();
   }

   private dpz x() {
      return this.m().b();
   }

   public void f() {
      this.g = false;
      if (this.d == efm.a && this.n != null) {
         this.a(false);
         this.n.a(this.aA_(), this.x());
      }
   }

   public void j() {
      if (this.d == efm.a && this.n != null) {
         this.a(true);
         jb $$0 = this.aA_();
         this.n.a($$0, this.x());
         this.n.V().b($$0, this.x());
         this.k();
      } else {
         if (this.d == efm.b) {
            this.k();
         }

         this.g = true;
      }
   }

   public void k() {
      if (!this.e.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.d.c(), this.aA_(), this.e});
      }
   }

   public boolean u() {
      return this.g;
   }

   public String v() {
      return this.e;
   }

   public void a(String $$0) {
      this.e = $$0;
   }
}
