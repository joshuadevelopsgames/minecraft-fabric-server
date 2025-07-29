import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dzp extends dxk {
   public static final MapCodec<dzp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(dxk::d), t()).apply($$0, dzp::new));
   public static final eez<jh> b = dub.f;
   private static final Map<jh.a, fjm> c = fjj.a(dpz.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jh.a, fjm> e = fjj.a(fjj.a(c.get(jh.a.c), dpz.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dzp> a() {
      return a;
   }

   public dzp(efp $$0, eea.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jh.c).b(d, false));
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      return (bxj)($$2.c_($$3) instanceof ecn $$7 && this.a($$1, $$4, $$6, $$7, $$0) ? bxj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   private boolean a(eeb $$0, cut $$1, fio $$2, ecn $$3, dcv $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof dck && !this.a($$2, $$0);
   }

   private boolean a(fio $$0, eeb $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fjm b_(eeb $$0, dly $$1, jb $$2) {
      return this.a($$0, $$1, $$2, fix.a());
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = $$0.c(b).h();
      jh $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dmx $$0, eeb $$1, jb $$2, jh $$3) {
      eeb $$4 = $$0.a_($$2);
      return $$4.a(azo.aF) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dyl.a);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = this.m();
      fal $$2 = $$0.q().b_($$0.a());
      dmx $$3 = $$0.q();
      jb $$4 = $$0.a();

      for (jh $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jh $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, $$2.a() == fam.c);
            }
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eeb $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, d);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eca($$0, $$1);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.i, ecn::a);
   }
}
