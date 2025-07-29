import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fvr {
   private static final bbi.b<ame, MapCodec<? extends fvq>> b = new bbi.b<>();
   public static final Codec<fvq> a = b.a(ame.a).dispatch(fvq::a, $$0 -> $$0);

   public static void a() {
      b.a(ame.b("custom_model_data"), fvm.a);
      b.a(ame.b("constant"), fvl.a);
      b.a(ame.b("dye"), fvn.a);
      b.a(ame.b("grass"), fvp.a);
      b.a(ame.b("firework"), fvo.a);
      b.a(ame.b("potion"), fvt.a);
      b.a(ame.b("map_color"), fvs.a);
      b.a(ame.b("team"), fvu.a);
   }
}
