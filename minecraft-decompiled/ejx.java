import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejx {
   public final ern a;
   public final ern b;
   public final ern c;
   public final ern d;
   public final ern e;
   public final List<eeb> f;
   public final bae<dpz> g;
   public final bae<dpz> h;
   public static final Codec<ejx> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ern.a.fieldOf("filling_provider").forGetter($$0x -> $$0x.a),
            ern.a.fieldOf("inner_layer_provider").forGetter($$0x -> $$0x.b),
            ern.a.fieldOf("alternate_inner_layer_provider").forGetter($$0x -> $$0x.c),
            ern.a.fieldOf("middle_layer_provider").forGetter($$0x -> $$0x.d),
            ern.a.fieldOf("outer_layer_provider").forGetter($$0x -> $$0x.e),
            bbi.b(eeb.a.listOf()).fieldOf("inner_placements").forGetter($$0x -> $$0x.f),
            bae.b(mn.i).fieldOf("cannot_replace").forGetter($$0x -> $$0x.g),
            bae.b(mn.i).fieldOf("invalid_blocks").forGetter($$0x -> $$0x.h)
         )
         .apply($$0, ejx::new)
   );

   public ejx(ern $$0, ern $$1, ern $$2, ern $$3, ern $$4, List<eeb> $$5, bae<dpz> $$6, bae<dpz> $$7) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
   }
}
