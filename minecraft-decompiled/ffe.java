import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ffe extends few {
   public static final MapCodec<ffe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               aut.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
               Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
               bbi.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
            )
         )
         .apply($$0, ffe::new)
   );
   private final Optional<String> b;
   private final Optional<aut<String>> c;
   private final Optional<Integer> d;

   public ffe(List<fgs> $$0, Optional<aut<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.V, dgf.a, this::a);
      return $$0;
   }

   private dgf a(dgf $$0) {
      return new dgf(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public fey<ffe> b() {
      return fez.M;
   }
}
