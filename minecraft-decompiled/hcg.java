import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hcg implements hbz.a {
   private final fue a;
   private final Map<Long, Map<jb, Integer>> b = Maps.newTreeMap(Ordering.natural().reverse());

   hcg(fue $$0) {
      this.a = $$0;
   }

   public void a(long $$0, jb $$1) {
      Map<jb, Integer> $$2 = this.b.computeIfAbsent($$0, $$0x -> Maps.newHashMap());
      int $$3 = $$2.getOrDefault($$1, 0);
      $$2.put($$1, $$3 + 1);
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      long $$5 = this.a.s.ae();
      int $$6 = 200;
      double $$7 = 0.0025;
      Set<jb> $$8 = Sets.newHashSet();
      Map<jb, Integer> $$9 = Maps.newHashMap();
      fog $$10 = $$1.getBuffer(gxz.v());
      Iterator<Entry<Long, Map<jb, Integer>>> $$11 = this.b.entrySet().iterator();

      while ($$11.hasNext()) {
         Entry<Long, Map<jb, Integer>> $$12 = $$11.next();
         Long $$13 = $$12.getKey();
         Map<jb, Integer> $$14 = $$12.getValue();
         long $$15 = $$5 - $$13;
         if ($$15 > 200L) {
            $$11.remove();
         } else {
            for (Entry<jb, Integer> $$16 : $$14.entrySet()) {
               jb $$17 = $$16.getKey();
               Integer $$18 = $$16.getValue();
               if ($$8.add($$17)) {
                  fin $$19 = new fin(jb.c).g(0.002).h(0.0025 * $$15).d($$17.u(), $$17.v(), $$17.w()).d(-$$2, -$$3, -$$4);
                  gyh.a($$0, $$10, $$19.a, $$19.b, $$19.c, $$19.d, $$19.e, $$19.f, 1.0F, 1.0F, 1.0F, 1.0F);
                  $$9.put($$17, $$18);
               }
            }
         }
      }

      for (Entry<jb, Integer> $$20 : $$9.entrySet()) {
         jb $$21 = $$20.getKey();
         Integer $$22 = $$20.getValue();
         hbz.a($$0, $$1, String.valueOf($$22), $$21.u(), $$21.v(), $$21.w(), -1);
      }
   }
}
