import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hcm implements hbz.a {
   private final fue a;
   private final Map<amd<dmu>, Map<String, euq>> b = Maps.newIdentityHashMap();
   private final Map<amd<dmu>, Map<String, abt.a>> c = Maps.newIdentityHashMap();
   private static final int d = 500;

   public hcm(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      ftm $$5 = this.a.j.l();
      amd<dmu> $$6 = this.a.s.aj();
      jb $$7 = jb.a($$5.d().d, 0.0, $$5.d().f);
      fog $$8 = $$1.getBuffer(gxz.v());
      if (this.b.containsKey($$6)) {
         for (euq $$9 : this.b.get($$6).values()) {
            if ($$7.a($$9.g(), 500.0)) {
               gyh.a(
                  $$0,
                  $$8,
                  $$9.h() - $$2,
                  $$9.i() - $$3,
                  $$9.j() - $$4,
                  $$9.k() + 1 - $$2,
                  $$9.l() + 1 - $$3,
                  $$9.m() + 1 - $$4,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F,
                  1.0F
               );
            }
         }
      }

      Map<String, abt.a> $$10 = this.c.get($$6);
      if ($$10 != null) {
         for (abt.a $$11 : $$10.values()) {
            euq $$12 = $$11.a();
            if ($$7.a($$12.g(), 500.0)) {
               if ($$11.b()) {
                  gyh.a(
                     $$0,
                     $$8,
                     $$12.h() - $$2,
                     $$12.i() - $$3,
                     $$12.j() - $$4,
                     $$12.k() + 1 - $$2,
                     $$12.l() + 1 - $$3,
                     $$12.m() + 1 - $$4,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F,
                     1.0F,
                     0.0F
                  );
               } else {
                  gyh.a(
                     $$0,
                     $$8,
                     $$12.h() - $$2,
                     $$12.i() - $$3,
                     $$12.j() - $$4,
                     $$12.k() + 1 - $$2,
                     $$12.l() + 1 - $$3,
                     $$12.m() + 1 - $$4,
                     0.0F,
                     0.0F,
                     1.0F,
                     1.0F,
                     0.0F,
                     0.0F,
                     1.0F
                  );
               }
            }
         }
      }
   }

   public void a(euq $$0, List<abt.a> $$1, amd<dmu> $$2) {
      this.b.computeIfAbsent($$2, $$0x -> new HashMap<>()).put($$0.toString(), $$0);
      Map<String, abt.a> $$3 = this.c.computeIfAbsent($$2, $$0x -> new HashMap<>());

      for (abt.a $$4 : $$1) {
         $$3.put($$4.a().toString(), $$4);
      }
   }

   @Override
   public void a() {
      this.b.clear();
      this.c.clear();
   }
}
