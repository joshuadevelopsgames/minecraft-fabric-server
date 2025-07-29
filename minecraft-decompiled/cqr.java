import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class cqr extends cqp {
   protected static final Predicate<bzm> b = $$0 -> $$0 instanceof cqr;
   private static final alh<jh> c = all.a(cqr.class, alj.q);
   private static final jh d = jh.d;

   protected cqr(bzv<? extends cqr> $$0, dmu $$1) {
      super($$0, $$1);
   }

   protected cqr(bzv<? extends cqr> $$0, dmu $$1, jb $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   @Override
   protected void a(all.a $$0) {
      $$0.a(c, d);
   }

   @Override
   public void a(alh<?> $$0) {
      super.a($$0);
      if ($$0.equals(c)) {
         this.b(this.cS());
      }
   }

   @Override
   public jh cS() {
      return this.ay.a(c);
   }

   protected void a(jh $$0) {
      this.ay.a(c, $$0);
   }

   protected void b(jh $$0) {
      Objects.requireNonNull($$0);
      Validate.isTrue($$0.o().d());
      this.a($$0);
      this.v($$0.e() * 90);
      this.aa = this.dP();
      this.e();
   }

   @Override
   protected void e() {
      if (this.cS() != null) {
         fin $$0 = this.a(this.a, this.cS());
         fis $$1 = $$0.f();
         this.o($$1.d, $$1.e, $$1.f);
         this.a($$0);
      }
   }

   protected abstract fin a(jb var1, jh var2);

   @Override
   public boolean f() {
      if (!this.ai().g(this)) {
         return false;
      } else {
         boolean $$0 = jb.b(this.t()).allMatch($$0x -> {
            eeb $$1 = this.ai().a_($$0x);
            return $$1.e() || dsc.n($$1);
         });
         return !$$0 ? false : this.ai().a(this, this.cV(), b).isEmpty();
      }
   }

   protected fin t() {
      return this.cV().a(this.cS().m().mul(-0.5F)).h(1.0E-7);
   }

   public abstract void u();

   @Override
   public cqz a(aub $$0, dcv $$1, float $$2) {
      cqz $$3 = new cqz(this.ai(), this.dC() + this.cS().j() * 0.15F, this.dE() + $$2, this.dI() + this.cS().l() * 0.15F, $$1);
      $$3.i();
      this.ai().b($$3);
      return $$3;
   }

   @Override
   public float a(dwu $$0) {
      jh $$1 = this.cS();
      if ($$1.o() != jh.a.b) {
         switch ($$0) {
            case c:
               $$1 = $$1.g();
               break;
            case d:
               $$1 = $$1.i();
               break;
            case b:
               $$1 = $$1.h();
         }

         this.b($$1);
      }

      float $$2 = bcb.h(this.dP());

      return switch ($$0) {
         case c -> $$2 + 180.0F;
         case d -> $$2 + 90.0F;
         case b -> $$2 + 270.0F;
         default -> $$2;
      };
   }

   @Override
   public float a(dvd $$0) {
      return this.a($$0.a(this.cS()));
   }
}
