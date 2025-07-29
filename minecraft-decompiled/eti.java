import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eti extends etf {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eku.a.fieldOf("min_inclusive").forGetter($$0x -> $$0x.d), eku.a.fieldOf("max_inclusive").forGetter($$0x -> $$0x.e)).apply($$0, eti::new)
   );
   private static final Logger b = LogUtils.getLogger();
   private final eku d;
   private final eku e;
   private final LongSet f = new LongOpenHashSet();

   private eti(eku $$0, eku $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static eti a(eku $$0, eku $$1) {
      return new eti($$0, $$1);
   }

   @Override
   public int a(bck $$0, ekx $$1) {
      int $$2 = this.d.a($$1);
      int $$3 = this.e.a($$1);
      if ($$2 > $$3) {
         if (this.f.add((long)$$2 << 32 | $$3)) {
            b.warn("Empty height range: {}", this);
         }

         return $$2;
      } else {
         return bcb.b($$0, $$2, $$3);
      }
   }

   @Override
   public etg<?> a() {
      return etg.b;
   }

   @Override
   public String toString() {
      return "[" + this.d + "-" + this.e + "]";
   }
}
