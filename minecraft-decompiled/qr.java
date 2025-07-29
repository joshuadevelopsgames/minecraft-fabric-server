public class qr {
   public static final amd<eme<?>> a = a("cave");
   public static final amd<eme<?>> b = a("cave_extra_underground");
   public static final amd<eme<?>> c = a("canyon");
   public static final amd<eme<?>> d = a("nether_cave");

   private static amd<eme<?>> a(String $$0) {
      return amd.a(mn.aO, ame.b($$0));
   }

   public static void a(qq<eme<?>> $$0) {
      jm<dpz> $$1 = $$0.a(mn.i);
      $$0.a(
         a,
         emg.a
            .a(
               new emc(
                  0.15F,
                  eti.a(eku.b(8), eku.a(180)),
                  bwt.b(0.1F, 0.9F),
                  eku.b(8),
                  ema.a(false, dqb.pz.m()),
                  $$1.b(azo.bm),
                  bwt.b(0.7F, 1.4F),
                  bwt.b(0.8F, 1.3F),
                  bwt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         b,
         emg.a
            .a(
               new emc(
                  0.07F,
                  eti.a(eku.b(8), eku.a(47)),
                  bwt.b(0.1F, 0.9F),
                  eku.b(8),
                  ema.a(false, dqb.gV.m()),
                  $$1.b(azo.bm),
                  bwt.b(0.7F, 1.4F),
                  bwt.b(0.8F, 1.3F),
                  bwt.b(-1.0F, -0.4F)
               )
            )
      );
      $$0.a(
         c,
         emg.c
            .a(
               new elx(
                  0.01F,
                  eti.a(eku.a(10), eku.a(67)),
                  bwk.a(3.0F),
                  eku.b(8),
                  ema.a(false, dqb.pA.m()),
                  $$1.b(azo.bm),
                  bwt.b(-0.125F, 0.125F),
                  new elx.a(bwt.b(0.75F, 1.0F), bws.a(0.0F, 6.0F, 2.0F), 3, bwt.b(0.75F, 1.0F), 1.0F, 0.0F)
               )
            )
      );
      $$0.a(d, emg.b.a(new emc(0.2F, eti.a(eku.a(0), eku.c(1)), bwk.a(0.5F), eku.b(10), $$1.b(azo.bn), bwk.a(1.0F), bwk.a(1.0F), bwk.a(-0.7F))));
   }
}
