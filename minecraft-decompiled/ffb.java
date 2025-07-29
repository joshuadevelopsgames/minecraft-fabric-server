import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ffb implements fex {
   public static final MapCodec<ffb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fez.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ffb::new)
   );
   public static final Codec<ffb> b = fez.b.listOf().xmap(ffb::new, $$0 -> $$0.c);
   private final List<fex> c;
   private final BiFunction<dcv, fdj, dcv> d;

   private ffb(List<fex> $$0) {
      this.c = $$0;
      this.d = fez.a($$0);
   }

   public static ffb a(List<fex> $$0) {
      return new ffb(List.copyOf($$0));
   }

   public dcv a(dcv $$0, fdj $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(fdp $$0) {
      fex.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(new bci.d("functions", $$1)));
      }
   }

   @Override
   public fey<ffb> b() {
      return fez.I;
   }
}
