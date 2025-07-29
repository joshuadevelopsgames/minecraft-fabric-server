import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dzr extends dov {
   public static final MapCodec<dzr> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxm.a.b.fieldOf("kind").forGetter(dov::b), t()).apply($$0, dzr::new));
   public static final eez<jh> d = dub.f;
   private static final Map<jh, fjm> b = fjj.c(dpz.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dzr> a() {
      return c;
   }

   protected dzr(dxm.a $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jh.c));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = super.a($$0);
      dly $$2 = $$0.q();
      jb $$3 = $$0.a();
      jh[] $$4 = $$0.f();

      for (jh $$5 : $$4) {
         if ($$5.o().d()) {
            jh $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
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
   protected void a(eec.a<dpz, eeb> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
