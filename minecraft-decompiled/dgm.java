import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgm(float c) implements dgj {
   private static final float f = 16.0F;
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bbi.r.optionalFieldOf("diameter", 16.0F).forGetter(dgm::b)).apply($$0, dgm::new)
   );
   public static final zm<wx, dgm> b = zm.a(zk.l, dgm::b, dgm::new);

   public dgm() {
      this(16.0F);
   }

   @Override
   public dgj.a<dgm> a() {
      return dgj.a.d;
   }

   @Override
   public boolean a(dmu $$0, dcv $$1, cam $$2) {
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < 16; $$4++) {
         double $$5 = $$2.dC() + ($$2.ec().j() - 0.5) * this.c;
         double $$6 = bcb.a($$2.dE() + ($$2.ec().j() - 0.5) * this.c, (double)$$0.L_(), (double)($$0.L_() + ((aub)$$0).m() - 1));
         double $$7 = $$2.dI() + ($$2.ec().j() - 0.5) * this.c;
         if ($$2.cc()) {
            $$2.bS();
         }

         fis $$8 = $$2.dv();
         if ($$2.b($$5, $$6, $$7, true)) {
            $$0.a(ejb.R, $$8, ejb.a.a($$2));
            aza $$10;
            ayy $$9;
            if ($$2 instanceof cms) {
               $$9 = ayz.kc;
               $$10 = aza.g;
            } else {
               $$9 = ayz.fl;
               $$10 = aza.h;
            }

            $$0.a(null, $$2.dC(), $$2.dE(), $$2.dI(), $$9, $$10);
            $$2.j();
            $$3 = true;
            break;
         }
      }

      if ($$3 && $$2 instanceof cut $$13) {
         $$13.gZ();
      }

      return $$3;
   }

   public float b() {
      return this.c;
   }
}
