import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cfk extends ccd<cuf> {
   private long c;

   public cfk() {
      super(ImmutableMap.of(cjo.s, cjp.a, cjo.h, cjp.a), 350, 350);
   }

   protected boolean a(aub $$0, cuf $$1) {
      return this.a($$1);
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      bzc $$3 = $$1.eh().c(cjo.s).get();
      ccf.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ec().a(50);
      this.c = $$2 + $$4;
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      cuf $$3 = (cuf)$$1.eh().c(cjo.s).get();
      if (!($$1.g($$3) > 5.0)) {
         ccf.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gY();
            $$3.gY();
            this.a($$0, $$1, $$3);
         } else if ($$1.ec().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aub $$0, cuf $$1, cuf $$2) {
      Optional<jb> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cuf> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.B().b($$3.get());
            ahj.c($$0, $$3.get());
         }
      }
   }

   protected void d(aub $$0, cuf $$1, long $$2) {
      $$1.eh().b(cjo.s);
   }

   private boolean a(cuf $$0) {
      cbm<cuf> $$1 = $$0.eh();
      Optional<bzc> $$2 = $$1.c(cjo.s).filter($$0x -> $$0x.ap() == bzv.bF);
      return $$2.isEmpty() ? false : ccf.a($$1, cjo.s, bzv.bF) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<jb> b(aub $$0, cuf $$1) {
      return $$0.B().a($$0x -> $$0x.a(clt.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dx(), 48);
   }

   private boolean a(cuf $$0, jb $$1, jl<cls> $$2) {
      faz $$3 = $$0.S().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cuf> b(aub $$0, cuf $$1, cuf $$2) {
      cuf $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dC(), $$1.dE(), $$1.dI(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aub $$0, cuf $$1, jb $$2) {
      jk $$3 = jk.a($$0.aj(), $$2);
      $$1.eh().a(cjo.b, $$3);
   }
}
