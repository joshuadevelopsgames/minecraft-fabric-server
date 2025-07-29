public class hdu<T extends cop> extends hcu<T, hkj, gnb> {
   private final ame a;

   public hdu(hee.a $$0, hdu.a $$1) {
      super($$0, new gnb($$0.a($$1.d)), new gnb($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hix<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gni($$0.a($$1.g)), new gni($$0.a($$1.h))));
   }

   public ame a(hkj $$0) {
      return this.a;
   }

   public hkj a() {
      return new hkj();
   }

   public void a(T $$0, hkj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.n();
   }

   public static enum a {
      a(ame.b("textures/entity/horse/donkey.png"), gqm.az, gqm.aA, htz.d.k, gqm.aB, gqm.aC),
      b(ame.b("textures/entity/horse/mule.png"), gqm.bV, gqm.bW, htz.d.l, gqm.bX, gqm.bY);

      final ame c;
      final gql d;
      final gql e;
      final htz.d f;
      final gql g;
      final gql h;

      private a(final ame $$0, final gql $$1, final gql $$2, final htz.d $$3, final gql $$4, final gql $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
