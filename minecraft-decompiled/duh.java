import com.mojang.serialization.MapCodec;

public class duh extends dpz implements dsu, dtm {
   public static final MapCodec<duh> a = b(duh::new);
   public static final eez<jj> b = eer.W;

   @Override
   public MapCodec<duh> a() {
      return a;
   }

   protected duh(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jj.k));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.k();
      jh $$2;
      if ($$1.o() == jh.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jh.b;
      }

      return this.m().b(b, jj.a($$1, $$2));
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecd($$0, $$1);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      eaz $$5 = $$1.c_($$2);
      if ($$5 instanceof ecd && $$3.gQ()) {
         $$3.a((ecd)$$5);
         return bxj.a;
      } else {
         return bxj.e;
      }
   }

   public static boolean a(eza.a $$0, eza.a $$1) {
      jh $$2 = o($$0.a().b());
      jh $$3 = o($$1.a().b());
      jh $$4 = p($$0.a().b());
      jh $$5 = p($$1.a().b());
      ecd.a $$6 = $$0.b();
      boolean $$7 = $$6 == ecd.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jh o(eeb $$0) {
      return $$0.c(b).a();
   }

   public static jh p(eeb $$0) {
      return $$0.c(b).b();
   }
}
