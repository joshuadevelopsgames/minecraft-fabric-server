import java.util.List;
import java.util.Optional;

public class arx {
   public static final amd<art> a = a("server_links");
   public static final amd<art> b = a("custom_options");
   public static final amd<art> c = a("quick_actions");
   public static final int d = 310;
   private static final aro e = new aro(new arq(xn.k, 200), Optional.empty());

   private static amd<art> a(String $$0) {
      return amd.a(mn.aT, ame.b($$0));
   }

   public static void a(qq<art> $$0) {
      jm<art> $$1 = $$0.a(mn.aT);
      $$0.a(
         a,
         new asb(
            new arr(xo.c("menu.server_links.title"), Optional.of(xo.c("menu.server_links")), true, true, aru.a, List.of(), List.of()), Optional.of(e), 1, 310
         )
      );
      $$0.a(
         b,
         new arv(
            new arr(xo.c("menu.custom_options.title"), Optional.of(xo.c("menu.custom_options")), true, true, aru.a, List.of(), List.of()),
            $$1.b(azq.a),
            Optional.of(e),
            1,
            310
         )
      );
      $$0.a(
         c,
         new arv(
            new arr(xo.c("menu.quick_actions.title"), Optional.of(xo.c("menu.quick_actions")), true, true, aru.a, List.of(), List.of()),
            $$1.b(azq.b),
            Optional.of(e),
            1,
            310
         )
      );
   }
}
