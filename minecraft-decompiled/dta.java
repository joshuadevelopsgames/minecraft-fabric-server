import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dta extends drx {
   public static final MapCodec<dta> g = b(dta::new);
   private final Function<eeb, fjm> h;

   @Override
   public MapCodec<dta> a() {
      return g;
   }

   public dta(eea.d $$0) {
      super(4.0F, 16.0F, 4.0F, 16.0F, 24.0F, $$0);
      this.l(this.C.b().b(a, false).b(b, false).b(c, false).b(d, false).b(e, false));
      this.h = this.a(4.0F, 16.0F, 2.0F, 6.0F, 15.0F);
   }

   @Override
   protected fjm d_(eeb $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   public boolean a(eeb $$0, boolean $$1, jh $$2) {
      dpz $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dtb && dtb.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(eeb $$0) {
      return $$0.a(azo.R) && $$0.a(azo.k) == this.m().a(azo.k);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      return (bxj)(!$$1.B_() ? ddf.a($$3, $$1, $$2) : bxj.e);
   }

   @Override
   public eeb a(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      fal $$3 = $$0.q().b_($$0.a());
      jb $$4 = $$2.f();
      jb $$5 = $$2.i();
      jb $$6 = $$2.g();
      jb $$7 = $$2.h();
      eeb $$8 = $$1.a_($$4);
      eeb $$9 = $$1.a_($$5);
      eeb $$10 = $$1.a_($$6);
      eeb $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, this.a($$8, $$8.c($$1, $$4, jh.d), jh.d))
         .b(b, this.a($$9, $$9.c($$1, $$5, jh.e), jh.e))
         .b(c, this.a($$10, $$10.c($$1, $$6, jh.c), jh.c))
         .b(d, this.a($$11, $$11.c($$1, $$7, jh.f), jh.f))
         .b(e, $$3.a() == fam.c);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g())) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
