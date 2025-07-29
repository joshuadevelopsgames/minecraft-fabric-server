import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hsf(bcm c) implements hrx {
   public static final MapCodec<hsf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bcm.a.fieldOf("pattern").forGetter(hsf::b)).apply($$0, hsf::new));

   @Override
   public void a(axo $$0, hrx.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hsf> a() {
      return b;
   }

   public bcm b() {
      return this.c;
   }
}
