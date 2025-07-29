import com.mojang.serialization.MapCodec;

public abstract class dtt extends dtr implements dqc {
   public static final efb e = eer.aA;
   public static final int f = 25;
   private final double c;

   protected dtt(eea.d $$0, jh $$1, fjm $$2, boolean $$3, double $$4) {
      super($$0, $$1, $$2, $$3);
      this.c = $$4;
      this.l(this.C.b().b(e, 0));
   }

   @Override
   protected abstract MapCodec<? extends dtt> a();

   @Override
   public eeb b(bck $$0) {
      return this.m().b(e, $$0.a(25));
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(e) < 25;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(e) < 25 && $$3.j() < this.c) {
         jb $$4 = $$2.a(this.a);
         if (this.h($$1.a_($$4))) {
            $$1.c($$4, this.a($$0, $$1.A));
         }
      }
   }

   protected eeb a(eeb $$0, bck $$1) {
      return $$0.a(e);
   }

   public eeb p(eeb $$0) {
      return $$0.b(e, 25);
   }

   public boolean q(eeb $$0) {
      return $$0.c(e) == 25;
   }

   protected eeb a(eeb $$0, eeb $$1) {
      return $$1;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == this.a.g()) {
         if (!$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
         } else {
            eeb $$8 = $$1.a_($$3.a(this.a));
            if ($$8.a(this) || $$8.a(this.b())) {
               return this.a($$0, this.b().m());
            }
         }
      }

      if ($$4 != this.a || !$$6.a(this) && !$$6.a(this.b())) {
         if (this.b) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return this.a($$0, this.b().m());
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(e);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return this.h($$0.a_($$1.a(this.a)));
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      jb $$4 = $$2.a(this.a);
      int $$5 = Math.min($$3.c(e) + 1, 25);
      int $$6 = this.a($$1);

      for (int $$7 = 0; $$7 < $$6 && this.h($$0.a_($$4)); $$7++) {
         $$0.c($$4, $$3.b(e, $$5));
         $$4 = $$4.a(this.a);
         $$5 = Math.min($$5 + 1, 25);
      }
   }

   protected abstract int a(bck var1);

   protected abstract boolean h(eeb var1);

   @Override
   protected dtt c() {
      return this;
   }
}
