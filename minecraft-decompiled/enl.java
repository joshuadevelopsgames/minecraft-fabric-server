import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class enl extends enh<enm> {
   public enl(Codec<enm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<enm> $$0) {
      bck $$1 = $$0.d();
      dnt $$2 = $$0.b();
      jb $$3 = $$0.e();
      dwu $$4 = dwu.a($$1);
      enm $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ezb $$7 = $$2.a().q().aY();
      eza $$8 = $$7.a($$5.b.get($$6));
      eza $$9 = $$7.a($$5.c.get($$6));
      dlz $$10 = new dlz($$3);
      euq $$11 = new euq($$10.d() - 16, $$2.L_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      eyw $$12 = new eyw().a($$4).a($$11).a($$1);
      kg $$13 = $$8.a($$4);
      jb $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(eka.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.L_() + 10);
      jb $$19 = $$8.a($$14.h($$18), dvd.a, $$4);
      if (a($$2, $$8.b($$12, $$19)) > $$5.f) {
         return false;
      } else {
         $$12.b();
         $$5.d.a().a().forEach($$12::a);
         $$8.a($$2, $$19, $$19, $$12, $$1, 260);
         $$12.b();
         $$5.e.a().a().forEach($$12::a);
         $$9.a($$2, $$19, $$19, $$12, $$1, 260);
         return true;
      }
   }

   private static int a(dnt $$0, euq $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         eeb $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dqb.K) || $$3.a(dqb.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
