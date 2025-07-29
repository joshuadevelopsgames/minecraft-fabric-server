import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class hjf<S extends hlq & hna, M extends gnh<S> & gpv> extends hit<S, M> {
   private static final Int2ObjectMap<ame> a = ag.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, ame.b("stone"));
      $$0.put(2, ame.b("iron"));
      $$0.put(3, ame.b("gold"));
      $$0.put(4, ame.b("emerald"));
      $$0.put(5, ame.b("diamond"));
   });
   private final Object2ObjectMap<amd<cuk>, hti.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<amd<cui>, hti.a> c = new Object2ObjectOpenHashMap();
   private final axo d;
   private final String e;

   public hjf(hgc<S, M> $$0, axo $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.A) {
         cug $$6 = $$3.a();
         if ($$6 != null) {
            jl<cuk> $$7 = $$6.a();
            jl<cui> $$8 = $$6.b();
            hti.a $$9 = this.a(this.b, "type", $$7);
            hti.a $$10 = this.a(this.c, "profession", $$8);
            M $$11 = this.d();
            $$11.a($$10 == hti.a.a || $$10 == hti.a.b && $$9 != hti.a.c);
            ame $$12 = this.a("type", $$7);
            b($$11, $$12, $$0, $$1, $$2, $$3, -1);
            $$11.a(true);
            if (!$$8.a(cui.b) && !$$3.am) {
               ame $$13 = this.a("profession", $$8);
               b($$11, $$13, $$0, $$1, $$2, $$3, -1);
               if (!$$8.a(cui.m)) {
                  ame $$14 = this.a("profession_level", (ame)a.get(bcb.a($$6.c(), 1, a.size())));
                  b($$11, $$14, $$0, $$1, $$2, $$3, -1);
               }
            }
         }
      }
   }

   private ame a(String $$0, ame $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   private ame a(String $$0, jl<?> $$1) {
      return $$1.e().map($$1x -> this.a($$0, $$1x.a())).orElse(hrh.c());
   }

   public <K> hti.a a(Object2ObjectMap<amd<K>, hti.a> $$0, String $$1, jl<K> $$2) {
      amd<K> $$3 = $$2.e().orElse(null);
      return $$3 == null ? hti.a.a : (hti.a)$$0.computeIfAbsent($$3, $$2x -> this.d.getResource(this.a($$1, $$3.a())).flatMap($$0xx -> {
         try {
            return $$0xx.f().a(hti.b).map(hti::a);
         } catch (IOException var2x) {
            return Optional.empty();
         }
      }).orElse(hti.a.a));
   }
}
