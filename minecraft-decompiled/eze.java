import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eze implements ezi {
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdo.a.fieldOf("loot_table").forGetter($$0x -> $$0x.b)).apply($$0, eze::new)
   );
   private final amd<fdo> b;

   public eze(amd<fdo> $$0) {
      this.b = $$0;
   }

   @Override
   public ui a(bck $$0, @Nullable ui $$1) {
      ui $$2 = $$1 == null ? new ui() : $$1.l();
      $$2.a("LootTable", fdo.a, this.b);
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ezj<?> a() {
      return ezj.d;
   }
}
