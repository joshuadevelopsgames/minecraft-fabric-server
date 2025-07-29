import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ezf implements ezi {
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ui.a.fieldOf("data").forGetter($$0x -> $$0x.b)).apply($$0, ezf::new));
   private final ui b;

   public ezf(ui $$0) {
      this.b = $$0;
   }

   @Override
   public ui a(bck $$0, @Nullable ui $$1) {
      return $$1 == null ? this.b.l() : $$1.a(this.b);
   }

   @Override
   public ezj<?> a() {
      return ezj.c;
   }
}
