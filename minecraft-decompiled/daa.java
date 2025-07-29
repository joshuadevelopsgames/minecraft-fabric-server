import javax.annotation.Nullable;

public class daa extends bxr {
   @Nullable
   private ebx b;

   public daa() {
      super(27);
   }

   public void a(ebx $$0) {
      this.b = $$0;
   }

   public boolean b(ebx $$0) {
      return this.b == $$0;
   }

   public void b(fda.a<bxk> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, dcv.l);
      }

      for (bxk $$2 : $$0) {
         if ($$2.a(this.b())) {
            this.a($$2.a(), $$2.b());
         }
      }
   }

   public void b(fdc.a<bxk> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         dcv $$2 = this.a($$1);
         if (!$$2.f()) {
            $$0.a(new bxk($$1, $$2));
         }
      }
   }

   @Override
   public boolean a(cut $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void e_(cut $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.e_($$0);
   }

   @Override
   public void c(cut $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c($$0);
      this.b = null;
   }
}
