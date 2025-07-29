import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ld(Optional<bg<dfj, lc.a>> e, cx.d f) implements dm<dfk> {
   public static final Codec<ld> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bg.a(lc.a.a).optionalFieldOf("explosions").forGetter(ld::b), cx.d.d.optionalFieldOf("flight_duration", cx.d.c).forGetter(ld::c))
         .apply($$0, ld::new)
   );

   @Override
   public kp<dfk> a() {
      return kq.aj;
   }

   public boolean a(dfk $$0) {
      return this.e.isPresent() && !this.e.get().a($$0.b()) ? false : this.f.d($$0.a());
   }

   public Optional<bg<dfj, lc.a>> b() {
      return this.e;
   }

   public cx.d c() {
      return this.f;
   }
}
