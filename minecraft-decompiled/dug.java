import com.mojang.serialization.MapCodec;

public class dug extends drx {
   public static final MapCodec<dug> g = b(dug::new);

   @Override
   public MapCodec<? extends dug> a() {
      return g;
   }

   protected dug(eea.d $$0) {
      super(2.0F, 16.0F, 2.0F, 16.0F, 16.0F, $$0);
      this.l(this.C.b().b(a, false).b(b, false).b(c, false).b(d, false).b(e, false));
   }

   @Override
   public eeb a(dgo $$0) {
      dly $$1 = $$0.q();
      jb $$2 = $$0.a();
      fal $$3 = $$0.q().b_($$0.a());
      jb $$4 = $$2.f();
      jb $$5 = $$2.g();
      jb $$6 = $$2.h();
      jb $$7 = $$2.i();
      eeb $$8 = $$1.a_($$4);
      eeb $$9 = $$1.a_($$5);
      eeb $$10 = $$1.a_($$6);
      eeb $$11 = $$1.a_($$7);
      return this.m()
         .b(a, this.a($$8, $$8.c($$1, $$4, jh.d)))
         .b(c, this.a($$9, $$9.c($$1, $$5, jh.c)))
         .b(d, this.a($$10, $$10.c($$1, $$6, jh.f)))
         .b(b, this.a($$11, $$11.c($$1, $$7, jh.e)))
         .b(e, $$3.a() == fam.c);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), this.a($$6, $$6.c($$1, $$5, $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fjm c(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return fjj.a();
   }

   @Override
   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.b($$0, $$1, $$2);
   }

   public final boolean a(eeb $$0, boolean $$1) {
      return !k($$0) && $$1 || $$0.b() instanceof dug || $$0.a(azo.H);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
