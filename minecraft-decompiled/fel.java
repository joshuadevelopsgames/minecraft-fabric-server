import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fel extends few {
   public static final MapCodec<fel> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fel.a.e.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, fel::new)
   );
   private final fel.a b;

   private fel(List<fgs> $$0, fel.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<fel> b() {
      return fez.s;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(this.b.g);
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$1.c(this.b.g) instanceof bxn $$3) {
         $$0.b(kq.g, $$3.al());
      }

      return $$0;
   }

   public static few.a<?> a(fel.a $$0) {
      return a($$1 -> new fel($$1, $$0));
   }

   public static enum a implements bda {
      a("this", fgd.a),
      b("attacking_entity", fgd.d),
      c("last_damage_player", fgd.b),
      d("block_entity", fgd.h);

      public static final Codec<fel.a> e = bda.a(fel.a::values);
      private final String f;
      final bdn<?> g;

      private a(final String $$0, final bdn<?> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
