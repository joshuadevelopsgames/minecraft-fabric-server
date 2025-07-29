import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class eam extends eas implements bxu, dad, dap {
   protected static final int b = 0;
   protected static final int c = 1;
   protected static final int d = 2;
   public static final int e = 0;
   private static final int[] q = new int[]{0};
   private static final int[] r = new int[]{2, 1};
   private static final int[] s = new int[]{1};
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = 3;
   public static final int i = 4;
   public static final int j = 200;
   public static final int k = 2;
   private static final Codec<Map<amd<dhm<?>>, Integer>> t = Codec.unboundedMap(dhm.b, Codec.INT);
   private static final short u = 0;
   private static final short v = 0;
   private static final short w = 0;
   private static final short x = 0;
   protected ju<dcv> l = ju.a(3, dcv.l);
   int y;
   int z;
   int A;
   int B;
   protected final cyy m = new cyy() {
      @Override
      public int a(int $$0) {
         switch ($$0) {
            case 0:
               return eam.this.y;
            case 1:
               return eam.this.z;
            case 2:
               return eam.this.A;
            case 3:
               return eam.this.B;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               eam.this.y = $$1;
               break;
            case 1:
               eam.this.z = $$1;
               break;
            case 2:
               eam.this.A = $$1;
               break;
            case 3:
               eam.this.B = $$1;
         }
      }

      @Override
      public int a() {
         return 4;
      }
   };
   private final Reference2IntOpenHashMap<amd<dhm<?>>> C = new Reference2IntOpenHashMap();
   private final dht.a<dif, ? extends dgs> D;

   protected eam(ebb<?> $$0, jb $$1, eeb $$2, dhx<? extends dgs> $$3) {
      super($$0, $$1, $$2);
      this.D = dht.a($$3);
   }

   private boolean k() {
      return this.y > 0;
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.l = ju.a(this.b(), dcv.l);
      bxd.a($$0, this.l);
      this.A = $$0.a("cooking_time_spent", (short)0);
      this.B = $$0.a("cooking_total_time", (short)0);
      this.y = $$0.a("lit_time_remaining", (short)0);
      this.z = $$0.a("lit_total_time", (short)0);
      this.C.clear();
      this.C.putAll($$0.<Map>a("RecipesUsed", t).orElse(Map.of()));
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("cooking_time_spent", (short)this.A);
      $$0.a("cooking_total_time", (short)this.B);
      $$0.a("lit_time_remaining", (short)this.y);
      $$0.a("lit_total_time", (short)this.z);
      bxd.a($$0, this.l);
      $$0.a("RecipesUsed", t, this.C);
   }

   public static void a(aub $$0, jb $$1, eeb $$2, eam $$3) {
      boolean $$4 = $$3.k();
      boolean $$5 = false;
      if ($$3.k()) {
         $$3.y--;
      }

      dcv $$6 = $$3.l.get(1);
      dcv $$7 = $$3.l.get(0);
      boolean $$8 = !$$7.f();
      boolean $$9 = !$$6.f();
      if ($$3.k() || $$9 && $$8) {
         dif $$10 = new dif($$7);
         dhr<? extends dgs> $$11;
         if ($$8) {
            $$11 = $$3.D.a($$10, $$0).orElse(null);
         } else {
            $$11 = null;
         }

         int $$13 = $$3.an_();
         if (!$$3.k() && a($$0.K_(), $$11, $$10, $$3.l, $$13)) {
            $$3.y = $$3.a($$0.N(), $$6);
            $$3.z = $$3.y;
            if ($$3.k()) {
               $$5 = true;
               if ($$9) {
                  dcr $$14 = $$6.h();
                  $$6.h(1);
                  if ($$6.f()) {
                     $$3.l.set(1, $$14.i());
                  }
               }
            }
         }

         if ($$3.k() && a($$0.K_(), $$11, $$10, $$3.l, $$13)) {
            $$3.A++;
            if ($$3.A == $$3.B) {
               $$3.A = 0;
               $$3.B = a($$0, $$3);
               if (b($$0.K_(), $$11, $$10, $$3.l, $$13)) {
                  $$3.a($$11);
               }

               $$5 = true;
            }
         } else {
            $$3.A = 0;
         }
      } else if (!$$3.k() && $$3.A > 0) {
         $$3.A = bcb.a($$3.A - 2, 0, $$3.B);
      }

      if ($$4 != $$3.k()) {
         $$5 = true;
         $$2 = $$2.b(dou.b, $$3.k());
         $$0.a($$1, $$2, 3);
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   private static boolean a(jz $$0, @Nullable dhr<? extends dgs> $$1, dif $$2, ju<dcv> $$3, int $$4) {
      if (!$$3.get(0).f() && $$1 != null) {
         dcv $$5 = $$1.b().a($$2, $$0);
         if ($$5.f()) {
            return false;
         } else {
            dcv $$6 = $$3.get(2);
            if ($$6.f()) {
               return true;
            } else if (!dcv.c($$6, $$5)) {
               return false;
            } else {
               return $$6.M() < $$4 && $$6.M() < $$6.k() ? true : $$6.M() < $$5.k();
            }
         }
      } else {
         return false;
      }
   }

   private static boolean b(jz $$0, @Nullable dhr<? extends dgs> $$1, dif $$2, ju<dcv> $$3, int $$4) {
      if ($$1 != null && a($$0, $$1, $$2, $$3, $$4)) {
         dcv $$5 = $$3.get(0);
         dcv $$6 = $$1.b().a($$2, $$0);
         dcv $$7 = $$3.get(2);
         if ($$7.f()) {
            $$3.set(2, $$6.v());
         } else if (dcv.c($$7, $$6)) {
            $$7.g(1);
         }

         if ($$5.a(dqb.aW.h()) && !$$3.get(1).f() && $$3.get(1).a(dcz.rF)) {
            $$3.set(1, new dcv(dcz.rG));
         }

         $$5.h(1);
         return true;
      } else {
         return false;
      }
   }

   protected int a(eby $$0, dcv $$1) {
      return $$0.b($$1);
   }

   private static int a(aub $$0, eam $$1) {
      dif $$2 = new dif($$1.a(0));
      return $$1.D.a($$2, $$0).map($$0x -> ((dgs)$$0x.b()).d()).orElse(200);
   }

   @Override
   public int[] a(jh $$0) {
      if ($$0 == jh.a) {
         return r;
      } else {
         return $$0 == jh.b ? q : s;
      }
   }

   @Override
   public boolean a(int $$0, dcv $$1, @Nullable jh $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, dcv $$1, jh $$2) {
      return $$2 == jh.a && $$0 == 1 ? $$1.a(dcz.rG) || $$1.a(dcz.rF) : true;
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   protected ju<dcv> f() {
      return this.l;
   }

   @Override
   protected void a(ju<dcv> $$0) {
      this.l = $$0;
   }

   @Override
   public void a(int $$0, dcv $$1) {
      dcv $$2 = this.l.get($$0);
      boolean $$3 = !$$1.f() && dcv.c($$2, $$1);
      this.l.set($$0, $$1);
      $$1.f(this.f_($$1));
      if ($$0 == 0 && !$$3 && this.n instanceof aub $$4) {
         this.B = a($$4, this);
         this.A = 0;
         this.e();
      }
   }

   @Override
   public boolean b(int $$0, dcv $$1) {
      if ($$0 == 2) {
         return false;
      } else if ($$0 != 1) {
         return true;
      } else {
         dcv $$2 = this.l.get(1);
         return this.n.N().a($$1) || $$1.a(dcz.rF) && !$$2.a(dcz.rF);
      }
   }

   @Override
   public void a(@Nullable dhr<?> $$0) {
      if ($$0 != null) {
         amd<dhm<?>> $$1 = $$0.a();
         this.C.addTo($$1, 1);
      }
   }

   @Nullable
   @Override
   public dhr<?> d() {
      return null;
   }

   @Override
   public void a(cut $$0, List<dcv> $$1) {
   }

   public void a(auc $$0) {
      List<dhr<?>> $$1 = this.a($$0.y(), $$0.dv());
      $$0.a($$1);

      for (dhr<?> $$2 : $$1) {
         if ($$2 != null) {
            $$0.a($$2, this.l);
         }
      }

      this.C.clear();
   }

   public List<dhr<?>> a(aub $$0, fis $$1) {
      List<dhr<?>> $$2 = Lists.newArrayList();
      ObjectIterator var4 = this.C.reference2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<amd<dhm<?>>> $$3 = (Entry<amd<dhm<?>>>)var4.next();
         $$0.u().b((amd<dhm<?>>)$$3.getKey()).ifPresent($$4 -> {
            $$2.add((dhr<?>)$$4);
            a($$0, $$1, $$3.getIntValue(), ((dgs)$$4.b()).c());
         });
      }

      return $$2;
   }

   private static void a(aub $$0, fis $$1, int $$2, float $$3) {
      int $$4 = bcb.d($$2 * $$3);
      float $$5 = bcb.i($$2 * $$3);
      if ($$5 != 0.0F && Math.random() < $$5) {
         $$4++;
      }

      caa.a($$0, $$1, $$4);
   }

   @Override
   public void fillStackedContents(cuz $$0) {
      for (dcv $$1 : this.l) {
         $$0.b($$1);
      }
   }

   @Override
   public void a(jb $$0, eeb $$1) {
      super.a($$0, $$1);
      if (this.n instanceof aub $$2) {
         this.a($$2, fis.b($$0));
      }
   }
}
