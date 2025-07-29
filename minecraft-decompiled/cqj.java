import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqj {
   private static final Logger a = LogUtils.getLogger();
   private final cps b;
   private final cqc[] c = new cqc[cqi.c()];
   @Nullable
   private cqc d;

   public cqj(cps $$0) {
      this.b = $$0;
      this.a(cqi.k);
   }

   public void a(cqi<?> $$0) {
      if (this.d == null || $$0 != this.d.h()) {
         if (this.d != null) {
            this.d.d();
         }

         this.d = this.b((cqi<cqc>)$$0);
         if (!this.b.ai().C) {
            this.b.au().a(cps.a, $$0.b());
         }

         a.debug("Dragon is now in phase {} on the {}", $$0, this.b.ai().C ? "client" : "server");
         this.d.c();
      }
   }

   public cqc a() {
      return this.d;
   }

   public <T extends cqc> T b(cqi<T> $$0) {
      int $$1 = $$0.b();
      if (this.c[$$1] == null) {
         this.c[$$1] = $$0.a(this.b);
      }

      return (T)this.c[$$1];
   }
}
