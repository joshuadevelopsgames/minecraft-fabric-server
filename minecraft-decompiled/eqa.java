import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqa implements epm {
   public static final Codec<eqa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(epu.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, eqa::new)
   );
   public final List<epu.a> b;

   public eqa(eeb $$0, eeb $$1) {
      this(ImmutableList.of(epu.a(new eye($$0), $$1)));
   }

   public eqa(List<epu.a> $$0) {
      this.b = $$0;
   }
}
