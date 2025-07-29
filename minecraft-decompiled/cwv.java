import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwv(cx.c c) implements cwx {
   public static final MapCodec<cwv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cx.c.d.fieldOf("range").forGetter(cwv::b)).apply($$0, cwv::new));

   public boolean a(cwz $$0) {
      return this.c.d($$0.b().a().as());
   }

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   public cx.c b() {
      return this.c;
   }
}
