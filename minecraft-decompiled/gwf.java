import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class gwf extends cut {
   @Nullable
   private grw h;
   protected fis a = fis.c;
   public float b;
   public float c;
   public float d;
   public final grk e;
   public float f;
   public float g;

   public gwf(grk $$0, GameProfile $$1) {
      super($$0, $$1);
      this.e = $$0;
   }

   @Nullable
   @Override
   public dmr a() {
      grw $$0 = this.b();
      return $$0 != null ? $$0.e() : null;
   }

   @Nullable
   protected grw b() {
      if (this.h == null) {
         this.h = fue.R().M().a(this.cK());
      }

      return this.h;
   }

   @Override
   public void g() {
      this.f = this.g;
      this.a = this.dA();
      super.g();
   }

   public fis H(float $$0) {
      return this.a.a(this.dA(), (double)$$0);
   }

   public hst c() {
      grw $$0 = this.b();
      return $$0 == null ? hsk.a(this.cK()) : $$0.g();
   }

   public float a(boolean $$0, float $$1) {
      float $$2 = 1.0F;
      if (this.gt().b) {
         $$2 *= 1.1F;
      }

      float $$3 = this.gt().b();
      if ($$3 != 0.0F) {
         float $$4 = (float)this.i(cbs.w) / $$3;
         $$2 *= ($$4 + 1.0F) / 2.0F;
      }

      if (this.fG()) {
         if (this.fI().a(dcz.pA)) {
            float $$5 = Math.min(this.fK() / 20.0F, 1.0F);
            $$2 *= 1.0F - bcb.l($$5) * 0.15F;
         } else if ($$0 && this.gR()) {
            return 0.1F;
         }
      }

      return bcb.h($$1, 1.0F, $$2);
   }
}
