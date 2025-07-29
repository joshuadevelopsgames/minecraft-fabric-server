import java.util.Objects;
import javax.annotation.Nullable;

public class gcp extends gcq<gdi> {
   private boolean b;
   @Nullable
   private Object c;

   public gcp(gxn.a $$0) {
      super($$0);
   }

   public boolean c() {
      return this.b;
   }

   public void d() {
      this.b = false;
   }

   public void e() {
      this.c = null;
   }

   @Override
   public Class<gdi> a() {
      return gdi.class;
   }

   protected void a(gdi $$0, fod $$1) {
      $$1.b(1.0F, -1.0F, -1.0F);
      gcx $$2 = $$0.c();
      gcd $$3 = $$2.g();
      Objects.requireNonNull($$3);
      float $$4 = ($$3.d() + $$3.e()) / 2.0F;
      float $$5 = ($$3.b() + $$3.c()) / 2.0F;
      float $$6 = $$2.d() + 8.0F;
      float $$7 = $$2.e() + 8.0F;
      $$1.a(($$6 - $$4) / 16.0F, ($$5 - $$7) / 16.0F, 0.0F);
      hon $$8 = $$2.c();
      boolean $$9 = !$$8.f();
      if ($$9) {
         fue.R().j.p().a(fnb.a.b);
      } else {
         fue.R().j.p().a(fnb.a.c);
      }

      $$8.a($$1, this.a, 15728880, hri.d);
      this.c = $$8.i();
   }

   public void a(gdi $$0, gcy $$1) {
      super.a($$0, $$1);
      this.b = true;
   }

   public boolean a(gdi $$0) {
      hon $$1 = $$0.c().c();
      return !$$1.d() && $$1.i().equals(this.c);
   }

   @Override
   protected float a(int $$0, int $$1) {
      return $$0 / 2.0F;
   }

   @Override
   protected String b() {
      return "oversized_item";
   }
}
