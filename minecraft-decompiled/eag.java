import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag extends dpn {
   public static final MapCodec<eag> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.intRange(1, 1024).fieldOf("max_weight").forGetter($$0x -> $$0x.e), eeq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.b), t())
         .apply($$0, eag::new)
   );
   public static final efb d = eer.aW;
   private final int e;

   @Override
   public MapCodec<eag> a() {
      return c;
   }

   protected eag(int $$0, eeq $$1, eea.d $$2) {
      super($$2, $$1);
      this.l(this.C.b().b(d, 0));
      this.e = $$0;
   }

   @Override
   protected int b(dmu $$0, jb $$1) {
      int $$2 = Math.min(a($$0, a.a($$1), bzm.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / this.e;
         return bcb.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int h(eeb $$0) {
      return $$0.c(d);
   }

   @Override
   protected eeb a(eeb $$0, int $$1) {
      return $$0.b(d, $$1);
   }

   @Override
   protected int b() {
      return 10;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d);
   }
}
