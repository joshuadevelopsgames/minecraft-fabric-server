import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqe(ern b, boolean c) implements epm {
   public static final Codec<eqe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ern.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
         .apply($$0, eqe::new)
   );

   public eqe(ern $$0) {
      this($$0, false);
   }

   public ern a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
