import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyf extends dxk {
   public static final MapCodec<dyf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(efp.a.fieldOf("wood_type").forGetter(dxk::d), t()).apply($$0, dyf::new));
   public static final efb b = eer.be;

   @Override
   public MapCodec<dyf> a() {
      return a;
   }

   public dyf(efp $$0, eea.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, 0).b(d, false));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, efh.a($$0.i() + 180.0F)).b(d, $$1.a() == fam.c);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !this.a($$0, $$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eeb $$0) {
      return efh.b($$0.c(b));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b), 16));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(b, $$1.a($$0.c(b), 16));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, d);
   }
}
