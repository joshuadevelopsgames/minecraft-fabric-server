import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class enm implements epm {
   public static final Codec<enm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ame.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
            ame.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
            eyz.d.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
            eyz.d.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
            Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
         )
         .apply($$0, enm::new)
   );
   public final List<ame> b;
   public final List<ame> c;
   public final jl<eyy> d;
   public final jl<eyy> e;
   public final int f;

   public enm(List<ame> $$0, List<ame> $$1, jl<eyy> $$2, jl<eyy> $$3, int $$4) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Fossil structure lists need at least one entry");
      } else if ($$0.size() != $$1.size()) {
         throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
      }
   }
}
