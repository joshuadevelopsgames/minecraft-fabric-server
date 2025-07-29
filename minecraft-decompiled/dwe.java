import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwe extends dpn {
   public static final MapCodec<dwe> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eeq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t()).apply($$0, dwe::new)
   );
   public static final ees d = eer.A;

   @Override
   public MapCodec<dwe> a() {
      return c;
   }

   protected dwe(eeq $$0, eea.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(d, false));
   }

   @Override
   protected int h(eeb $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected eeb a(eeb $$0, int $$1) {
      return $$0.b(d, $$1 > 0);
   }

   @Override
   protected int b(dmu $$0, jb $$1) {
      Class<? extends bzm> $$2 = switch (this.b.f()) {
         case a -> bzm.class;
         case b -> cam.class;
      };
      return a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d);
   }
}
