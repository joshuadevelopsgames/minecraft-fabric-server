import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dpa extends dzl {
   public static final MapCodec<dpa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            amd.a(mn.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
            amd.a(mn.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
            amd.a(mn.N).fieldOf("seed").forGetter($$0x -> $$0x.f),
            t()
         )
         .apply($$0, dpa::new)
   );
   public static final eez<jh> b = dub.f;
   private static final Map<jh, fjm> c = fjj.c(dpz.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final amd<dpz> d;
   private final amd<dpz> e;
   private final amd<dcr> f;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(amd<dpz> $$0, amd<dpz> $$1, amd<dcr> $$2, eea.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jh.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dpz> $$8 = $$1.K_().f(mn.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dyg.c, 7);
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.cN);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv((dmt)DataFixUtils.orElse($$0.K_().f(mn.N).f(this.f), this));
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
      $$0.a(b);
   }
}
