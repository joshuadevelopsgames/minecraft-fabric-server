import com.mojang.serialization.MapCodec;

public class dvs extends dsd {
   public static final MapCodec<dvs> b = b(dvs::new);
   public static final ees c = eer.A;

   @Override
   public MapCodec<dvs> a() {
      return b;
   }

   public dvs(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jh.d).b(c, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, false), 2);
      } else {
         $$1.a($$2, $$0.b(c, true), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dmx $$0, dnj $$1, jb $$2) {
      if (!$$0.B_() && !$$1.V().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dmu $$0, jb $$1, eeb $$2) {
      jh $$3 = $$2.c(a);
      jb $$4 = $$1.a($$3.g());
      fbt $$5 = fbp.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B_() && $$0.c(c) && !$$1.V().a($$2, this)) {
            eeb $$5 = $$0.b(c, false);
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if ($$0.c(c) && $$1.o().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, false));
      }
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
