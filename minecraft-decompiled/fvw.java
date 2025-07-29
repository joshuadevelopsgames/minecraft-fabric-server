import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fvw implements mt {
   private static final ame d = ame.b("trims/color_palettes/trim_palette");
   private static final Map<String, ame> e = c().collect(Collectors.toMap(dlh.a::a, $$0 -> ame.b("trims/color_palettes/" + $$0.a())));
   private static final List<amd<dlk>> f = List.of(
      dll.a, dll.b, dll.c, dll.d, dll.e, dll.f, dll.g, dll.h, dll.i, dll.j, dll.k, dll.l, dll.m, dll.n, dll.o, dll.p, dll.q, dll.r
   );
   private static final List<htz.d> g = List.of(htz.d.a, htz.d.b);
   private final mv.a h;

   public fvw(mv $$0) {
      this.h = $$0.a(mv.b.b, "atlases");
   }

   private static List<ame> b() {
      List<ame> $$0 = new ArrayList<>(f.size() * g.size());

      for (amd<dlk> $$1 : f) {
         ame $$2 = dll.a($$1);

         for (htz.d $$3 : g) {
            $$0.add($$2.a((UnaryOperator<String>)($$1x -> $$3.a() + "/" + $$1x)));
         }
      }

      return $$0;
   }

   private static hrx a(hua $$0) {
      return new hse($$0.b());
   }

   private static hrx a(gxm $$0) {
      return new hsb($$0.b(), $$0.b() + "/");
   }

   private static List<hrx> b(gxm $$0) {
      return List.of(a($$0));
   }

   private static List<hrx> a(String $$0) {
      return List.of(new hsb($$0, ""));
   }

   private static Stream<dlh.a> c() {
      return fvz.e.stream().map(fvz.a::a).flatMap($$0 -> Stream.concat(Stream.of($$0.a()), $$0.b().values().stream())).sorted(Comparator.comparing(dlh.a::a));
   }

   private static List<hrx> d() {
      return List.of(new hsd(b(), d, e));
   }

   private static List<hrx> e() {
      return List.of(a(gyi.j), a(gyi.i), a(hak.a), a(haa.a), a(gyi.A), a(ham.a), new hsd(List.of(fvz.a, fvz.b, fvz.c, fvz.d), d, e));
   }

   private static List<hrx> f() {
      return List.of(a(hud.f), a(gyi.k));
   }

   private static List<hrx> g() {
      return List.of(a(hud.g), a(hud.h), a(gyi.l));
   }

   private static List<hrx> h() {
      return List.of(new hsb("gui/sprites", ""), new hsb("mob_effect", "mob_effect/"));
   }

   @Override
   public CompletableFuture<?> a(mr $$0) {
      return CompletableFuture.allOf(
         this.a($$0, hts.a, d()),
         this.a($$0, hts.b, f()),
         this.a($$0, hts.c, b(gyi.o)),
         this.a($$0, hts.d, e()),
         this.a($$0, hts.e, b(gyi.m)),
         this.a($$0, hts.f, b(gyi.n)),
         this.a($$0, hts.g, h()),
         this.a($$0, hts.h, a("map/decorations")),
         this.a($$0, hts.i, a("painting")),
         this.a($$0, hts.j, a("particle")),
         this.a($$0, hts.k, g()),
         this.a($$0, hts.l, b(gyi.p)),
         this.a($$0, hts.m, b(gyi.q))
      );
   }

   private CompletableFuture<?> a(mr $$0, ame $$1, List<hrx> $$2) {
      return mt.a($$0, hrz.b, $$2, this.h.a($$1));
   }

   @Override
   public String a() {
      return "Atlas Definitions";
   }
}
