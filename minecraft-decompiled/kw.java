import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kw(Optional<bg<dcv, cn>> e) implements dm<dfn> {
   public static final Codec<kw> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cn.a).optionalFieldOf("items").forGetter(kw::b)).apply($$0, kw::new));

   @Override
   public kp<dfn> a() {
      return kq.ap;
   }

   public boolean a(dfn $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.d());
   }

   public Optional<bg<dcv, cn>> b() {
      return this.e;
   }
}
