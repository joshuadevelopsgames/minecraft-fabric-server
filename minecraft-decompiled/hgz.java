public class hgz extends hcu<coq, hko, glq<hko>> {
   private final ame a;

   public hgz(hee.a $$0, hgz.a $$1) {
      super($$0, new gnv($$0.a($$1.d)), new gnv($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hix<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gni($$0.a($$1.g)), new gni($$0.a($$1.h))));
   }

   public ame a(hko $$0) {
      return this.a;
   }

   public hko b() {
      return new hko();
   }

   public static enum a {
      a(ame.b("textures/entity/horse/horse_skeleton.png"), gqm.df, gqm.dg, htz.d.n, gqm.dh, gqm.di),
      b(ame.b("textures/entity/horse/horse_zombie.png"), gqm.es, gqm.et, htz.d.m, gqm.eu, gqm.ev);

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
