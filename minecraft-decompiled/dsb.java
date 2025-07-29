import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dsb extends dpo {
   public static final MapCodec<dsb> b = b(dsb::new);
   public static final eez<eff> c = eer.ak;
   public static final ees d = eer.A;
   private static final int e = 20;

   @Override
   public MapCodec<dsb> a() {
      return b;
   }

   public dsb(eea.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, false).b(c, eff.a).b(a, false));
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jh.b ? 15 : 0;
      }
   }

   private void a(dmu $$0, jb $$1, eeb $$2) {
      if (this.a($$2, (dmx)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<cxg> $$5 = this.a($$0, $$1, cxg.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            eeb $$6 = $$2.b(d, true);
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            eeb $$7 = $$2.b(d, false);
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.b($$1, this);
      }
   }

   protected void b(dmu $$0, jb $$1, eeb $$2, boolean $$3) {
      dwh $$4 = new dwh($$0, $$1, $$2);

      for (jb $$6 : $$4.a()) {
         eeb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         eeb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public efe<eff> c() {
      return c;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      if ($$0.c(d)) {
         List<cxq> $$3 = this.a($$1, $$2, cxq.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).e().k();
         }

         List<cxg> $$4 = this.a($$1, $$2, cxg.class, bzt.d);
         if (!$$4.isEmpty()) {
            return cym.b((bxc)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cxg> List<T> a(dmu $$0, jb $$1, Class<T> $$2, Predicate<bzm> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fin a(jb $$0) {
      double $$1 = 0.2;
      return new fin($$0.u() + 0.2, $$0.v(), $$0.w() + 0.2, $$0.u() + 1 - 0.2, $$0.v() + 1 - 0.2, $$0.w() + 1 - 0.2);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d, a);
   }
}
