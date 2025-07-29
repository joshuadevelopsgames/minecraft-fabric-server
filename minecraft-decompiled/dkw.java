public interface dkw {
   amd<dkq> a = a("mob_spawn_equipment");
   amd<dkq> b = a("pillager_spawn_crossbow");
   amd<dkq> c = a("raid/pillager_post_wave_3");
   amd<dkq> d = a("raid/pillager_post_wave_5");
   amd<dkq> e = a("raid/vindicator");
   amd<dkq> f = a("raid/vindicator_post_wave_5");
   amd<dkq> g = a("enderman_loot_drop");

   static void a(qq<dkq> $$0) {
      jm<dji> $$1 = $$0.a(mn.aW);
      $$0.a(a, new dkt($$1.b(azr.l), 5, 17));
      $$0.a(b, new dku($$1.b(djn.K), bwl.a(1)));
      $$0.a(c, new dku($$1.b(djn.J), bwl.a(1)));
      $$0.a(d, new dku($$1.b(djn.J), bwl.a(2)));
      $$0.a(e, new dku($$1.b(djn.n), bwl.a(1)));
      $$0.a(f, new dku($$1.b(djn.n), bwl.a(2)));
      $$0.a(g, new dku($$1.b(djn.v), bwl.a(1)));
   }

   static amd<dkq> a(String $$0) {
      return amd.a(mn.aV, ame.b($$0));
   }
}
