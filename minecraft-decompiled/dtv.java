import com.mojang.serialization.MapCodec;

public class dtv extends dpz implements dqc {
   public static final MapCodec<dtv> a = b(dtv::new);
   private static final fjm c = dpz.b(14.0, 0.0, 16.0);
   private static final fjm d = dpz.b(14.0, 2.0, 16.0);
   public static final ees b = eer.F;

   @Override
   public MapCodec<dtv> a() {
      return a;
   }

   public dtv(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(500) == 0) {
         eeb $$4 = $$1.a_($$2.d());
         if ($$4.a(azo.s) || $$4.a(dqb.aR)) {
            $$1.a($$2.u(), $$2.v(), $$2.w(), ayz.tG, aza.i, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dly $$0, jb $$1) {
      jb $$2 = $$1.a(jh.b);
      eeb $$3 = $$0.a_($$2);
      return dvg.a($$0, jh.b, $$2, $$3) || $$3.a(dqb.uh);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, !$$1.a_($$3.e()).a(this));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(eeb $$0) {
      return $$0.l();
   }

   public jb a(dly $$0, jb $$1) {
      jb.a $$2 = $$1.k();

      eeb $$3;
      do {
         $$2.c(jh.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jh.b).j();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      jb $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.c($$4, $$3.b(b, true));
      }
   }
}
