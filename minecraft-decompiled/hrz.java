import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class hrz {
   private static final bbi.b<ame, MapCodec<? extends hrx>> c = new bbi.b<>();
   public static final Codec<hrx> a = c.a(ame.a).dispatch(hrx::a, $$0 -> $$0);
   public static final Codec<List<hrx>> b = a.listOf().fieldOf("sources").codec();

   public static void a() {
      c.a(ame.b("single"), hse.b);
      c.a(ame.b("directory"), hsb.b);
      c.a(ame.b("filter"), hsf.b);
      c.a(ame.b("unstitch"), hsg.b);
      c.a(ame.b("paletted_permutations"), hsd.c);
   }
}
