import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dyg extends dzl implements dqc {
   public static final MapCodec<dyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            amd.a(mn.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
            amd.a(mn.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
            amd.a(mn.N).fieldOf("seed").forGetter($$0x -> $$0x.g),
            t()
         )
         .apply($$0, dyg::new)
   );
   public static final int b = 7;
   public static final efb c = eer.ay;
   private static final fjm[] d = dpz.a(7, $$0 -> dpz.b(2.0, 0.0, 2 + $$0 * 2));
   private final amd<dpz> e;
   private final amd<dpz> f;
   private final amd<dcr> g;

   @Override
   public MapCodec<dyg> a() {
      return a;
   }

   protected dyg(amd<dpz> $$0, amd<dpz> $$1, amd<dcr> $$2, eea.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.cN);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = drw.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, $$5 + 1);
               $$1.a($$2, $$0, 2);
            } else {
               jh $$6 = jh.c.a.a($$3);
               jb $$7 = $$2.a($$6);
               eeb $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dqb.cN) || $$8.a(azo.ad))) {
                  jy<dpz> $$9 = $$1.K_().f(mn.i);
                  Optional<dpz> $$10 = $$9.f(this.e);
                  Optional<dpz> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.c($$7, $$10.get().m());
                     $$1.c($$2, $$11.get().m().b(dub.f, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv((dmt)DataFixUtils.orElse($$0.K_().f(mn.N).f(this.g), this));
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      int $$4 = Math.min(7, $$3.c(c) + bcb.a($$0.A, 2, 5));
      eeb $$5 = $$3.b(c, $$4);
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }
}
