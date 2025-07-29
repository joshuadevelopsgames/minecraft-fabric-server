import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhi(ame b) implements fhg {
   public static final MapCodec<fhi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ame.a.fieldOf("source").forGetter(fhi::c)).apply($$0, fhi::new));

   @Override
   public fhf a() {
      return fhh.b;
   }

   @Override
   public vi a(fdj $$0) {
      return $$0.d().q().aK().a(this.b);
   }

   @Override
   public Set<bdn<?>> b() {
      return Set.of();
   }

   public ame c() {
      return this.b;
   }
}
