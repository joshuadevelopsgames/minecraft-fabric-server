import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bwv extends bwo {
   public static final MapCodec<bwv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bvt.b(bwo.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bwv::new)
   );
   private final bvt<bwo> b;
   private final int f;
   private final int g;

   public bwv(bvt<bwo> $$0) {
      this.b = $$0;
      int $$1 = Integer.MAX_VALUE;
      int $$2 = Integer.MIN_VALUE;

      for (bvs<bwo> $$3 : $$0.d()) {
         int $$4 = $$3.a().a();
         int $$5 = $$3.a().b();
         $$1 = Math.min($$1, $$4);
         $$2 = Math.max($$2, $$5);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(bck $$0) {
      return this.b.b($$0).a($$0);
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   public bwp<?> c() {
      return bwp.e;
   }
}
