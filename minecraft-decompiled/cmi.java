import java.util.List;

public interface cmi {
   amd<cmh> a = a("tabby");
   amd<cmh> b = a("black");
   amd<cmh> c = a("red");
   amd<cmh> d = a("siamese");
   amd<cmh> e = a("british_shorthair");
   amd<cmh> f = a("calico");
   amd<cmh> g = a("persian");
   amd<cmh> h = a("ragdoll");
   amd<cmh> i = a("white");
   amd<cmh> j = a("jellie");
   amd<cmh> k = a("all_black");

   private static amd<cmh> a(String $$0) {
      return amd.a(mn.aL, ame.b($$0));
   }

   static void a(qq<cmh> $$0) {
      jm<euy> $$1 = $$0.a(mn.bj);
      a($$0, a, "entity/cat/tabby");
      a($$0, b, "entity/cat/black");
      a($$0, c, "entity/cat/red");
      a($$0, d, "entity/cat/siamese");
      a($$0, e, "entity/cat/british_shorthair");
      a($$0, f, "entity/cat/calico");
      a($$0, g, "entity/cat/persian");
      a($$0, h, "entity/cat/ragdoll");
      a($$0, i, "entity/cat/white");
      a($$0, j, "entity/cat/jellie");
      a($$0, k, "entity/cat/all_black", new cxa(List.of(new cww.a<>(new cxb($$1.b(baa.o)), 1), new cww.a<>(new cwv(cx.c.b(0.9)), 0))));
   }

   private static void a(qq<cmh> $$0, amd<cmh> $$1, String $$2) {
      a($$0, $$1, $$2, cxa.a(0));
   }

   private static void a(qq<cmh> $$0, amd<cmh> $$1, String $$2, cxa $$3) {
      $$0.a($$1, new cmh(new jc(ame.b($$2)), $$3));
   }
}
