import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtk extends dzl implements dqc {
   public static final MapCodec<dtk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(amd.a(mn.aP).fieldOf("feature").forGetter($$0x -> $$0x.e), mm.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
         .apply($$0, dtk::new)
   );
   private static final double b = 0.4;
   private static final fjm c = dpz.b(8.0, 0.0, 9.0);
   private final dpz d;
   private final amd<ems<?, ?>> e;

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   protected dtk(amd<ems<?, ?>> $$0, dpz $$1, eea.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(azo.aR) || $$0.a(dqb.fE) || $$0.a(dqb.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jl<ems<?, ?>>> a(dmx $$0) {
      return $$0.K_().f(mn.aP).a(this.e);
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      eeb $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return $$1.i() < 0.4;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      this.a($$0).ifPresent($$3x -> ((ems)$$3x.a()).a($$0, $$0.n().g(), $$1, $$2));
   }
}
