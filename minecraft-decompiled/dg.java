import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dg(boolean d, boolean e) implements ca {
   public static final MapCodec<dg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(dg::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(dg::c))
         .apply($$0, dg::new)
   );
   public static final dg c = new dg(false, true);

   @Override
   public MapCodec<dg> a() {
      return cb.e;
   }

   @Override
   public boolean a(bzm $$0, aub $$1, @Nullable fis $$2) {
      return !($$0 instanceof cwk $$3) ? false : $$3.gW() == this.d && $$3.gV() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
