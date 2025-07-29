import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqd extends dpz implements dqc {
   public static final MapCodec<dqd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.aP).fieldOf("feature").forGetter($$0x -> $$0x.b), t()).apply($$0, dqd::new)
   );
   private final amd<ems<?, ?>> b;

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   public dqd(amd<ems<?, ?>> $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      $$0.K_().a(mn.aP).flatMap($$0x -> $$0x.a(this.b)).ifPresent($$3x -> ((ems)$$3x.a()).a($$0, $$0.n().g(), $$1, $$2.d()));
   }

   @Override
   public dqc.a aq_() {
      return dqc.a.a;
   }
}
