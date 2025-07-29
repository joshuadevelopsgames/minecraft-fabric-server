import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class doz extends dsy {
   public static final MapCodec<doz> a = b(doz::new);
   public static final eez<jh> b = dub.f;
   private static final Map<jh.a, fjm> c = fjj.a(
      fjj.a(dpz.b(12.0, 0.0, 4.0), dpz.a(8.0, 10.0, 4.0, 5.0), dpz.a(4.0, 8.0, 5.0, 10.0), dpz.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final xo d = xo.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c));
   }

   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(azj.aD);
      }

      return bxj.a;
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return new bxs(($$2x, $$3, $$4) -> new cyp($$2x, $$3, cyz.a($$1, $$2)), d);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cqy $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, eeb $$3, cqy $$4) {
      if (!$$4.be()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, cqy $$2) {
      if (!$$2.be()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public byb a(bzm $$0) {
      return $$0.ea().b($$0);
   }

   @Nullable
   public static eeb e(eeb $$0) {
      if ($$0.a(dqb.ht)) {
         return dqb.hu.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dqb.hu) ? dqb.hv.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   public int b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
