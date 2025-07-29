import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asm(dcv d, Optional<asn> e, boolean f, boolean g, int h, int i) implements ask {
   public static final MapCodec<asm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            dcv.d.fieldOf("item").forGetter(asm::b),
            asn.e.optionalFieldOf("description").forGetter(asm::c),
            Codec.BOOL.optionalFieldOf("show_decorations", true).forGetter(asm::d),
            Codec.BOOL.optionalFieldOf("show_tooltip", true).forGetter(asm::e),
            bbi.a(1, 256).optionalFieldOf("width", 16).forGetter(asm::f),
            bbi.a(1, 256).optionalFieldOf("height", 16).forGetter(asm::g)
         )
         .apply($$0, asm::new)
   );

   @Override
   public MapCodec<asm> a() {
      return c;
   }

   public dcv b() {
      return this.d;
   }

   public Optional<asn> c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public int f() {
      return this.h;
   }

   public int g() {
      return this.i;
   }
}
