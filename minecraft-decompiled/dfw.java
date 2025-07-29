import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record dfw(amd<fdo> b, long c) implements dga {
   private static final xo d = xo.c("item.container.loot_table.unknown");
   public static final Codec<dfw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(fdo.a.fieldOf("loot_table").forGetter(dfw::a), Codec.LONG.optionalFieldOf("seed", 0L).forGetter(dfw::b)).apply($$0, dfw::new)
   );

   @Override
   public void a(dcr.b $$0, Consumer<xo> $$1, dek $$2, kl $$3) {
      $$1.accept(d);
   }

   public amd<fdo> a() {
      return this.b;
   }

   public long b() {
      return this.c;
   }
}
