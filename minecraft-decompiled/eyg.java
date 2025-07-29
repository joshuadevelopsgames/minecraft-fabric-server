import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eyg extends eyx {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eka.a.g.fieldOf("heightmap").orElse(eka.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
         .apply($$0, eyg::new)
   );
   private final eka.a b;
   private final int c;

   public eyg(eka.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      eka.a $$6;
      if ($$0 instanceof aub) {
         if (this.b == eka.a.a) {
            $$6 = eka.a.b;
         } else if (this.b == eka.a.c) {
            $$6 = eka.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      jb $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new eza.d(new jb($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected eyz<?> a() {
      return eyz.g;
   }
}
