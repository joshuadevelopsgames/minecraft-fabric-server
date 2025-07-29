import com.mojang.serialization.MapCodec;

public class dvo extends dzl {
   public static final MapCodec<dvo> a = b(dvo::new);
   public static final int b = 3;
   public static final efb c = eer.av;
   private static final fjm[] d = dpz.a(3, $$0 -> dpz.b(16.0, 0.0, 5 + $$0 * 3));

   @Override
   public MapCodec<dvo> a() {
      return a;
   }

   protected dvo(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0));
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.en);
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, $$4 + 1);
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return new dcv(dcz.tI);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }
}
