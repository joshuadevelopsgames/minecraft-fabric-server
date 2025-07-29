import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fdx {
   public static final Codec<fdz> a = mm.D.q().dispatch(fdz::a, fea::a);
   public static final fea b = a("empty", fdu.a);
   public static final fea c = a("item", fdw.a);
   public static final fea d = a("loot_table", fec.a);
   public static final fea e = a("dynamic", fdt.a);
   public static final fea f = a("tag", fee.a);
   public static final fea g = a("alternatives", fdq.a);
   public static final fea h = a("sequence", fed.a);
   public static final fea i = a("group", fdv.a);

   private static fea a(String $$0, MapCodec<? extends fdz> $$1) {
      return jy.a(mm.D, ame.b($$0), new fea($$1));
   }
}
