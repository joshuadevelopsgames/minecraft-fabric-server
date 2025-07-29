import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kv(Optional<bg<dcv, cn>> e) implements dm<dey> {
   public static final Codec<kv> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cn.a).optionalFieldOf("items").forGetter(kv::b)).apply($$0, kv::new));

   @Override
   public kp<dey> a() {
      return kq.Q;
   }

   public boolean a(dey $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.c());
   }

   public Optional<bg<dcv, cn>> b() {
      return this.e;
   }
}
