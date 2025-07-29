import java.util.List;
import java.util.function.Consumer;

public class ddz extends dcr {
   private static final o a = o.h;
   private static final o b = o.j;
   private static final xo c = xo.c(ag.a("item", ame.b("smithing_template.ingredients"))).a(a);
   private static final xo d = xo.c(ag.a("item", ame.b("smithing_template.applies_to"))).a(a);
   private static final xo o = xo.c(ag.a("item", ame.b("smithing_template"))).a(a);
   private static final xo p = xo.c(ag.a("item", ame.b("smithing_template.armor_trim.applies_to"))).a(b);
   private static final xo q = xo.c(ag.a("item", ame.b("smithing_template.armor_trim.ingredients"))).a(b);
   private static final xo r = xo.c(ag.a("item", ame.b("smithing_template.armor_trim.base_slot_description")));
   private static final xo s = xo.c(ag.a("item", ame.b("smithing_template.armor_trim.additions_slot_description")));
   private static final xo t = xo.c(ag.a("item", ame.b("smithing_template.netherite_upgrade.applies_to"))).a(b);
   private static final xo u = xo.c(ag.a("item", ame.b("smithing_template.netherite_upgrade.ingredients"))).a(b);
   private static final xo v = xo.c(ag.a("item", ame.b("smithing_template.netherite_upgrade.base_slot_description")));
   private static final xo w = xo.c(ag.a("item", ame.b("smithing_template.netherite_upgrade.additions_slot_description")));
   private static final ame x = ame.b("container/slot/helmet");
   private static final ame y = ame.b("container/slot/chestplate");
   private static final ame z = ame.b("container/slot/leggings");
   private static final ame A = ame.b("container/slot/boots");
   private static final ame B = ame.b("container/slot/hoe");
   private static final ame C = ame.b("container/slot/axe");
   private static final ame D = ame.b("container/slot/sword");
   private static final ame E = ame.b("container/slot/shovel");
   private static final ame F = ame.b("container/slot/pickaxe");
   private static final ame G = ame.b("container/slot/ingot");
   private static final ame H = ame.b("container/slot/redstone_dust");
   private static final ame I = ame.b("container/slot/quartz");
   private static final ame J = ame.b("container/slot/emerald");
   private static final ame K = ame.b("container/slot/diamond");
   private static final ame L = ame.b("container/slot/lapis_lazuli");
   private static final ame M = ame.b("container/slot/amethyst_shard");
   private final xo N;
   private final xo O;
   private final xo P;
   private final xo Q;
   private final List<ame> R;
   private final List<ame> S;

   public ddz(xo $$0, xo $$1, xo $$2, xo $$3, List<ame> $$4, List<ame> $$5, dcr.a $$6) {
      super($$6);
      this.N = $$0;
      this.O = $$1;
      this.P = $$2;
      this.Q = $$3;
      this.R = $$4;
      this.S = $$5;
   }

   public static ddz a(dcr.a $$0) {
      return new ddz(p, q, r, s, o(), p(), $$0);
   }

   public static ddz b(dcr.a $$0) {
      return new ddz(t, u, v, w, q(), r(), $$0);
   }

   private static List<ame> o() {
      return List.of(x, y, z, A);
   }

   private static List<ame> p() {
      return List.of(G, H, L, I, K, J, M);
   }

   private static List<ame> q() {
      return List.of(x, D, y, F, z, C, A, B, E);
   }

   private static List<ame> r() {
      return List.of(G);
   }

   @Override
   public void a(dcv $$0, dcr.b $$1, dfz $$2, Consumer<xo> $$3, dek $$4) {
      $$3.accept(o);
      $$3.accept(xn.a);
      $$3.accept(d);
      $$3.accept(xn.a().b(this.N));
      $$3.accept(c);
      $$3.accept(xn.a().b(this.O));
   }

   public xo a() {
      return this.P;
   }

   public xo b() {
      return this.Q;
   }

   public List<ame> c() {
      return this.R;
   }

   public List<ame> n() {
      return this.S;
   }
}
