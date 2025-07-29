import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ffj extends few {
   private static final Codec<fho> b = Codec.withAlternative(fhp.a, bbi.l, fhl::new);
   public static final MapCodec<ffj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               fev.e.a(fhp.a, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter($$0x -> $$0x.c),
               fev.e.a(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter($$0x -> $$0x.d),
               fev.e.a(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter($$0x -> $$0x.e),
               fev.e.a(b, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter($$0x -> $$0x.f)
            )
         )
         .apply($$0, ffj::new)
   );
   private final Optional<fev.e<fho>> c;
   private final Optional<fev.e<Boolean>> d;
   private final Optional<fev.e<String>> e;
   private final Optional<fev.e<fho>> f;

   public ffj(List<fgs> $$0, Optional<fev.e<fho>> $$1, Optional<fev.e<Boolean>> $$2, Optional<fev.e<String>> $$3, Optional<fev.e<fho>> $$4) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Override
   public Set<bdn<?>> a() {
      return Stream.concat(this.c.stream(), this.f.stream()).flatMap($$0 -> $$0.a().stream()).flatMap($$0 -> $$0.a().stream()).collect(Collectors.toSet());
   }

   @Override
   public fey<ffj> b() {
      return fez.R;
   }

   private static <T> List<T> a(Optional<fev.e<T>> $$0, List<T> $$1) {
      return $$0.<List<T>>map($$1x -> $$1x.a($$1)).orElse($$1);
   }

   private static <T, E> List<E> a(Optional<fev.e<T>> $$0, List<E> $$1, Function<T, E> $$2) {
      return $$0.<List<E>>map($$2x -> {
         List<E> $$3 = $$2x.a().stream().map($$2).toList();
         return $$2x.b().a($$1, $$3);
      }).orElse($$1);
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      dfe $$2 = $$0.a(kq.p, dfe.a);
      $$0.b(kq.p, new dfe(a(this.c, $$2.a(), $$1x -> $$1x.b($$1)), a(this.d, $$2.b()), a(this.e, $$2.c()), a(this.f, $$2.d(), $$1x -> $$1x.a($$1))));
      return $$0;
   }
}
