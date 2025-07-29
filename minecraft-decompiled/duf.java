import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duf extends due {
   public static final MapCodec<duf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mm.e.q().fieldOf("host").forGetter(due::b), t()).apply($$0, duf::new));

   @Override
   public MapCodec<duf> a() {
      return b;
   }

   public duf(dpz $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dwt.d, jh.a.b));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return dwt.b($$0, $$1);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(dwt.d);
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(dwt.d, $$0.k().o());
   }
}
