import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class exl extends euy {
   public static final MapCodec<exl> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            a($$0),
            exl.a.c.fieldOf("biome_temp").forGetter($$0x -> $$0x.e),
            Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter($$0x -> $$0x.f),
            Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter($$0x -> $$0x.g)
         )
         .apply($$0, exl::new)
   );
   public final exl.a e;
   public final float f;
   public final float g;

   public exl(euy.c $$0, exl.a $$1, float $$2, float $$3) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      return a($$0, eka.a.c, $$1 -> this.a($$1, $$0));
   }

   private void a(evq $$0, euy.a $$1) {
      jb $$2 = new jb($$1.h().d(), 90, $$1.h().e());
      dwu $$3 = dwu.a($$1.f());
      exk.a($$1.e(), $$2, $$3, $$0, $$1.f(), this);
   }

   @Override
   public evh<?> e() {
      return evh.k;
   }

   public static enum a implements bda {
      a("warm"),
      b("cold");

      public static final Codec<exl.a> c = bda.a(exl.a::values);
      @Deprecated
      public static final Codec<exl.a> d = bbi.c(exl.a::valueOf);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      public String a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
