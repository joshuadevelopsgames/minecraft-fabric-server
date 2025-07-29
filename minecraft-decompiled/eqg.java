import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eqg implements epm {
   public static final Codec<eqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
            eor.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
            jb.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
         )
         .apply($$0, eqg::new)
   );
   private final boolean b;
   private final List<eor.a> c;
   @Nullable
   private final jb d;

   public eqg(boolean $$0, List<eor.a> $$1, @Nullable jb $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eqg(boolean $$0, List<eor.a> $$1, Optional<jb> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eor.a> b() {
      return this.c;
   }

   @Nullable
   public jb c() {
      return this.d;
   }
}
