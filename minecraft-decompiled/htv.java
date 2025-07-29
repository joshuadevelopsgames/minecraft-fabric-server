import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class htv {
   private static final eec<dpz, eeb> a = b();
   private static final eec<dpz, eeb> b = b();
   private static final ame c = ame.b("glow_item_frame");
   private static final ame d = ame.b("item_frame");
   private static final Map<ame, eec<dpz, eeb>> e = Map.of(d, a, c, b);

   private static eec<dpz, eeb> b() {
      return new eec.a<dpz, eeb>(dqb.a).a(eer.bH).a(dpz::m, eeb::new);
   }

   public static eeb a(boolean $$0, boolean $$1) {
      return ($$0 ? b : a).b().b(eer.bH, $$1);
   }

   static Function<ame, eec<dpz, eeb>> a() {
      Map<ame, eec<dpz, eeb>> $$0 = new HashMap<>(e);

      for (dpz $$1 : mm.e) {
         $$0.put($$1.p().h().a(), $$1.l());
      }

      return $$0::get;
   }
}
