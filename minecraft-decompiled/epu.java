import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epu implements epm {
   public static final Codec<epu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.list(epu.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b),
            Codec.intRange(0, 64).fieldOf("size").forGetter($$0x -> $$0x.c),
            Codec.floatRange(0.0F, 1.0F).fieldOf("discard_chance_on_air_exposure").forGetter($$0x -> $$0x.d)
         )
         .apply($$0, epu::new)
   );
   public final List<epu.a> b;
   public final int c;
   public final float d;

   public epu(List<epu.a> $$0, int $$1, float $$2) {
      this.c = $$1;
      this.b = $$0;
      this.d = $$2;
   }

   public epu(List<epu.a> $$0, int $$1) {
      this($$0, $$1, 0.0F);
   }

   public epu(eyu $$0, eeb $$1, int $$2, float $$3) {
      this(ImmutableList.of(new epu.a($$0, $$1)), $$2, $$3);
   }

   public epu(eyu $$0, eeb $$1, int $$2) {
      this(ImmutableList.of(new epu.a($$0, $$1)), $$2, 0.0F);
   }

   public static epu.a a(eyu $$0, eeb $$1) {
      return new epu.a($$0, $$1);
   }

   public static class a {
      public static final Codec<epu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eyu.c.fieldOf("target").forGetter($$0x -> $$0x.b), eeb.a.fieldOf("state").forGetter($$0x -> $$0x.c)).apply($$0, epu.a::new)
      );
      public final eyu b;
      public final eeb c;

      a(eyu $$0, eeb $$1) {
         this.b = $$0;
         this.c = $$1;
      }
   }
}
