public interface dcq {
   int a = 256;
   float b = 7.0F;
   amd<dco> c = a("ponder_goat_horn");
   amd<dco> d = a("sing_goat_horn");
   amd<dco> e = a("seek_goat_horn");
   amd<dco> f = a("feel_goat_horn");
   amd<dco> g = a("admire_goat_horn");
   amd<dco> h = a("call_goat_horn");
   amd<dco> i = a("yearn_goat_horn");
   amd<dco> j = a("dream_goat_horn");

   private static amd<dco> a(String $$0) {
      return amd.a(mn.aZ, ame.b($$0));
   }

   static void a(qq<dco> $$0) {
      a($$0, c, (jl<ayy>)ayz.nC.get(0), 7.0F, 256.0F);
      a($$0, d, (jl<ayy>)ayz.nC.get(1), 7.0F, 256.0F);
      a($$0, e, (jl<ayy>)ayz.nC.get(2), 7.0F, 256.0F);
      a($$0, f, (jl<ayy>)ayz.nC.get(3), 7.0F, 256.0F);
      a($$0, g, (jl<ayy>)ayz.nC.get(4), 7.0F, 256.0F);
      a($$0, h, (jl<ayy>)ayz.nC.get(5), 7.0F, 256.0F);
      a($$0, i, (jl<ayy>)ayz.nC.get(6), 7.0F, 256.0F);
      a($$0, j, (jl<ayy>)ayz.nC.get(7), 7.0F, 256.0F);
   }

   static void a(qq<dco> $$0, amd<dco> $$1, jl<ayy> $$2, float $$3, float $$4) {
      yc $$5 = xo.c(ag.a("instrument", $$1.a()));
      $$0.a($$1, new dco($$2, $$3, $$4, $$5));
   }
}
