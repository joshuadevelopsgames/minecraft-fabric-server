import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class exz extends eyx {
   public static final MapCodec<exz> a = MapCodec.unit(() -> exz.b);
   public static final exz b = new exz();
   private final Map<dpz, dpz> c = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dqb.m, dqb.qa);
      $$0.put(dqb.cx, dqb.qa);
      $$0.put(dqb.b, dqb.qe);
      $$0.put(dqb.eZ, dqb.qf);
      $$0.put(dqb.fa, dqb.qf);
      $$0.put(dqb.dc, dqb.qb);
      $$0.put(dqb.nP, dqb.qb);
      $$0.put(dqb.nR, dqb.qm);
      $$0.put(dqb.fC, dqb.qj);
      $$0.put(dqb.nN, dqb.qj);
      $$0.put(dqb.kl, dqb.qd);
      $$0.put(dqb.od, dqb.qd);
      $$0.put(dqb.kh, dqb.qn);
      $$0.put(dqb.kg, dqb.qn);
      $$0.put(dqb.kn, dqb.qi);
      $$0.put(dqb.ob, dqb.qi);
      $$0.put(dqb.or, dqb.qk);
      $$0.put(dqb.op, dqb.qk);
      $$0.put(dqb.go, dqb.qc);
      $$0.put(dqb.gp, dqb.qc);
      $$0.put(dqb.fc, dqb.qh);
      $$0.put(dqb.fb, dqb.qg);
      $$0.put(dqb.fo, dqb.fp);
   });

   private exz() {
   }

   @Override
   public eza.d a(dmx $$0, jb $$1, jb $$2, eza.d $$3, eza.d $$4, eyw $$5) {
      dpz $$6 = this.c.get($$4.b().b());
      if ($$6 == null) {
         return $$4;
      } else {
         eeb $$7 = $$4.b();
         eeb $$8 = $$6.m();
         if ($$7.b(dye.b)) {
            $$8 = $$8.b(dye.b, $$7.c(dye.b));
         }

         if ($$7.b(dye.c)) {
            $$8 = $$8.b(dye.c, $$7.c(dye.c));
         }

         if ($$7.b(dxn.b)) {
            $$8 = $$8.b(dxn.b, $$7.c(dxn.b));
         }

         return new eza.d($$4.a(), $$8, $$4.c());
      }
   }

   @Override
   protected eyz<?> a() {
      return eyz.l;
   }
}
