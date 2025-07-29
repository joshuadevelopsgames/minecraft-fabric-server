import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record arr(xo b, Optional<xo> c, boolean d, boolean e, aru f, List<ask> g, List<ary> h) {
   public static final MapCodec<arr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               xq.a.fieldOf("title").forGetter(arr::b),
               xq.a.optionalFieldOf("external_title").forGetter(arr::c),
               Codec.BOOL.optionalFieldOf("can_close_with_escape", true).forGetter(arr::d),
               Codec.BOOL.optionalFieldOf("pause", true).forGetter(arr::e),
               aru.e.optionalFieldOf("after_action", aru.a).forGetter(arr::f),
               ask.b.optionalFieldOf("body", List.of()).forGetter(arr::g),
               ary.a.listOf().optionalFieldOf("inputs", List.of()).forGetter(arr::h)
            )
            .apply($$0, arr::new)
      )
      .validate(
         $$0 -> $$0.e && !$$0.f.a()
            ? DataResult.error(() -> "Dialogs that pause the game must use after_action values that unpause it after user action!")
            : DataResult.success($$0)
      );

   public xo a() {
      return this.c.orElse(this.b);
   }
}
