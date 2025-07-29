import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doy extends dox implements dxl {
   public static final MapCodec<doy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
         .apply($$0, doy::new)
   );
   public static final ees c = eer.I;
   public static final eez<jh> d = eer.R;
   private final float e;
   private final float f;
   private final Map<jh, fjm> g;

   @Override
   public MapCodec<doy> a() {
      return b;
   }

   public doy(float $$0, float $$1, eea.d $$2) {
      super($$2);
      this.l(this.m().b(c, false).b(d, jh.b));
      this.g = fjj.d(dpz.c($$1, 16.0F - $$0, 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = $$0.c(d);
      jb $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      dmv $$1 = $$0.q();
      jb $$2 = $$0.a();
      return this.m().b(c, $$1.b_($$2).a() == fam.c).b(d, $$0.k());
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d);
   }
}
