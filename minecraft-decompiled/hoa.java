import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hoa(hoe.b b, hoa.a c, @Nullable bcl d) {
   public static final Codec<hoa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(hog.a.fieldOf("model").forGetter(hoa::a), hoa.a.b.forGetter(hoa::b)).apply($$0, hoa::new)
   );

   public hoa(hoe.b $$0, hoa.a $$1) {
      this($$0, $$1, null);
   }

   public hoa a(bcl $$0) {
      return new hoa(this.b, this.c, $$0);
   }

   public hoe.b a() {
      return this.b;
   }

   public hoa.a b() {
      return this.c;
   }

   @Nullable
   public bcl c() {
      return this.d;
   }

   public record a(boolean c, boolean d) {
      public static final hoa.a a = new hoa.a(true, false);
      public static final MapCodec<hoa.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               Codec.BOOL.optionalFieldOf("hand_animation_on_swap", true).forGetter(hoa.a::a),
               Codec.BOOL.optionalFieldOf("oversized_in_gui", false).forGetter(hoa.a::b)
            )
            .apply($$0, hoa.a::new)
      );

      public boolean a() {
         return this.c;
      }

      public boolean b() {
         return this.d;
      }
   }
}
