import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class feh extends few {
   public static final MapCodec<feh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, feh::new));

   private feh(List<fgs> $$0) {
      super($$0);
   }

   @Override
   public fey<feh> b() {
      return fez.z;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      Float $$2 = $$1.c(fgd.j);
      if ($$2 != null) {
         bck $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static few.a<?> c() {
      return a(feh::new);
   }
}
