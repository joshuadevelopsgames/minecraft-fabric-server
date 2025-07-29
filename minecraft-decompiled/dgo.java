import javax.annotation.Nullable;

public class dgo extends dgq {
   private final jb b;
   protected boolean a = true;

   public dgo(cut $$0, bxi $$1, dcv $$2, fio $$3) {
      this($$0.ai(), $$0, $$1, $$2, $$3);
   }

   public dgo(dgq $$0) {
      this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
   }

   protected dgo(dmu $$0, @Nullable cut $$1, bxi $$2, dcv $$3, fio $$4) {
      super($$0, $$1, $$2, $$3, $$4);
      this.b = $$4.b().a($$4.c());
      this.a = $$0.a_($$4.b()).a(this);
   }

   public static dgo a(dgo $$0, jb $$1, jh $$2) {
      return new dgo(
         $$0.q(),
         $$0.o(),
         $$0.p(),
         $$0.n(),
         new fio(new fis($$1.u() + 0.5 + $$2.j() * 0.5, $$1.v() + 0.5 + $$2.k() * 0.5, $$1.w() + 0.5 + $$2.l() * 0.5), $$2, $$1, false)
      );
   }

   @Override
   public jb a() {
      return this.a ? super.a() : this.b;
   }

   public boolean b() {
      return this.a || this.q().a_(this.a()).a(this);
   }

   public boolean c() {
      return this.a;
   }

   public jh d() {
      return jh.a(this.o())[0];
   }

   public jh e() {
      return jh.a(this.o(), jh.a.b);
   }

   public jh[] f() {
      jh[] $$0 = jh.a(this.o());
      if (this.a) {
         return $$0;
      } else {
         jh $$1 = this.k();
         int $$2 = 0;

         while ($$2 < $$0.length && $$0[$$2] != $$1.g()) {
            $$2++;
         }

         if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
         }

         return $$0;
      }
   }
}
