import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dqf extends dpl implements dsx {
   public static final MapCodec<dqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            mm.e.q().fieldOf("turns_into").forGetter(dqf::b),
            mm.b.q().fieldOf("brush_sound").forGetter(dqf::c),
            mm.b.q().fieldOf("brush_completed_sound").forGetter(dqf::d),
            t()
         )
         .apply($$0, dqf::new)
   );
   private static final efb c = eer.bz;
   public static final int b = 2;
   private final dpz d;
   private final ayy e;
   private final ayy f;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(dpz $$0, ayy $$1, ayy $$2, eea.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.c_($$2) instanceof ebe $$4) {
         $$4.a($$1);
      }

      if (dsy.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cqy $$5 = cqy.a($$1, $$2, $$0);
         $$5.f();
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, cqy $$2) {
      fis $$3 = $$2.cV().f();
      $$0.c(2001, jb.a((jv)$$3), dpz.j($$2.i()));
      $$0.a($$2, ejb.f, $$3);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bck $$3) {
      if ($$3.a(16) == 0) {
         jb $$4 = $$2.e();
         if (dsy.n($$1.a_($$4))) {
            double $$5 = $$2.u() + $$3.j();
            double $$6 = $$2.v() - 0.05;
            double $$7 = $$2.w() + $$3.j();
            $$1.a(new lw(me.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebe($$0, $$1);
   }

   public dpz b() {
      return this.d;
   }

   public ayy c() {
      return this.e;
   }

   public ayy d() {
      return this.f;
   }
}
