import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fhu(fdj.b c) implements fhx {
   public static final MapCodec<fhu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fdj.b.e.fieldOf("target").forGetter(fhu::c)).apply($$0, fhu::new));
   public static final Codec<fhu> b = fdj.b.e.xmap(fhu::new, fhu::c);

   public static fhx a(fdj.b $$0) {
      return new fhu($$0);
   }

   @Override
   public fhw a() {
      return fhy.c;
   }

   @Nullable
   @Override
   public fjw a(fdj $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bdn<?>> b() {
      return Set.of(this.c.a());
   }
}
