import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class ffp extends few {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ffp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(fhp.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
         .apply($$0, ffp::new)
   );
   private final fho c;
   private final boolean d;

   private ffp(List<fgs> $$0, fho $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fey<ffp> b() {
      return fez.n;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.c.a();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / $$2 : 0.0F;
         float $$4 = 1.0F - bcb.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(bcb.d($$4 * $$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static few.a<?> a(fho $$0) {
      return a($$1 -> new ffp($$1, $$0, false));
   }

   public static few.a<?> a(fho $$0, boolean $$1) {
      return a($$2 -> new ffp($$2, $$0, $$1));
   }
}
