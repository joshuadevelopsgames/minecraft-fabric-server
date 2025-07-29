import com.google.common.collect.ImmutableMap;

public class ccl<E extends cao & cri, T extends cam> extends ccd<E> {
   private static final int c = 1200;
   private int d;
   private ccl.a e = ccl.a.a;

   public ccl() {
      super(ImmutableMap.of(cjo.o, cjp.c, cjo.p, cjp.a), 1200);
   }

   protected boolean a(aub $$0, E $$1) {
      cam $$2 = b($$1);
      return $$1.b(dcz.xA) && ccf.b($$1, $$2) && ccf.a($$1, $$2, 0);
   }

   protected boolean a(aub $$0, E $$1, long $$2) {
      return $$1.eh().a(cjo.p) && this.a($$0, $$1);
   }

   protected void b(aub $$0, E $$1, long $$2) {
      cam $$3 = b($$1);
      this.b($$1, $$3);
      this.a($$1, $$3);
   }

   protected void c(aub $$0, E $$1, long $$2) {
      if ($$1.fG()) {
         $$1.fM();
      }

      if ($$1.b(dcz.xA)) {
         $$1.b(false);
         $$1.fI().b(kq.P, dez.a);
      }
   }

   private void a(E $$0, cam $$1) {
      if (this.e == ccl.a.a) {
         $$0.c(cvq.a($$0, dcz.xA));
         this.e = ccl.a.b;
         $$0.b(true);
      } else if (this.e == ccl.a.b) {
         if (!$$0.fG()) {
            this.e = ccl.a.a;
         }

         int $$2 = $$0.fK();
         dcv $$3 = $$0.fI();
         if ($$2 >= dbo.b($$3, $$0)) {
            $$0.fL();
            this.e = ccl.a.c;
            this.d = 20 + $$0.ec().a(20);
            $$0.b(false);
         }
      } else if (this.e == ccl.a.c) {
         this.d--;
         if (this.d == 0) {
            this.e = ccl.a.d;
         }
      } else if (this.e == ccl.a.d) {
         $$0.a($$1, 1.0F);
         this.e = ccl.a.a;
      }
   }

   private void b(cao $$0, cam $$1) {
      $$0.eh().a(cjo.o, new cco($$1, true));
   }

   private static cam b(cam $$0) {
      return $$0.eh().c(cjo.p).get();
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
