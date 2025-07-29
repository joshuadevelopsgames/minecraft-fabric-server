import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fhv(String b) implements fhx {
   public static final MapCodec<fhv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fhv::c)).apply($$0, fhv::new));

   public static fhx a(String $$0) {
      return new fhv($$0);
   }

   @Override
   public fhw a() {
      return fhy.b;
   }

   @Override
   public fjw a(fdj $$0) {
      return fjw.c(this.b);
   }

   @Override
   public Set<bdn<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
