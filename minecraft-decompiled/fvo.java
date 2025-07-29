import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import javax.annotation.Nullable;

public record fvo(int b) implements fvq {
   public static final MapCodec<fvo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bbi.l.fieldOf("default").forGetter(fvo::b)).apply($$0, fvo::new));

   public fvo() {
      this(-7697782);
   }

   @Override
   public int a(dcv $$0, @Nullable grk $$1, @Nullable cam $$2) {
      dfj $$3 = $$0.a(kq.ai);
      IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
      int $$5 = $$4.size();
      if ($$5 == 0) {
         return this.b;
      } else if ($$5 == 1) {
         return baj.f($$4.getInt(0));
      } else {
         int $$6 = 0;
         int $$7 = 0;
         int $$8 = 0;

         for (int $$9 = 0; $$9 < $$5; $$9++) {
            int $$10 = $$4.getInt($$9);
            $$6 += baj.b($$10);
            $$7 += baj.c($$10);
            $$8 += baj.d($$10);
         }

         return baj.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
      }
   }

   @Override
   public MapCodec<fvo> a() {
      return a;
   }
}
