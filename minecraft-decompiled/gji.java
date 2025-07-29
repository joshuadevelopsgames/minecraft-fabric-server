import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class gji implements fys, fzn {
   private static final ame b = ame.b("recipe_book/overlay_recipe");
   private static final int c = 4;
   private static final int d = 5;
   private static final float e = 0.375F;
   public static final int a = 25;
   private final List<gji.b> f = Lists.newArrayList();
   private boolean g;
   private int h;
   private int i;
   private gjn j = gjn.a;
   @Nullable
   private diu k;
   final gjq l;
   private final boolean m;

   public gji(gjq $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public void a(gjn $$0, bdp $$1, boolean $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
      this.j = $$0;
      List<dit> $$8 = $$0.a(gjn.a.b);
      List<dit> $$9 = $$2 ? Collections.emptyList() : $$0.a(gjn.a.c);
      int $$10 = $$8.size();
      int $$11 = $$10 + $$9.size();
      int $$12 = $$11 <= 16 ? 4 : 5;
      int $$13 = (int)Math.ceil((float)$$11 / $$12);
      this.h = $$3;
      this.i = $$4;
      float $$14 = this.h + Math.min($$11, $$12) * 25;
      float $$15 = $$5 + 50;
      if ($$14 > $$15) {
         this.h = (int)(this.h - $$7 * (int)(($$14 - $$15) / $$7));
      }

      float $$16 = this.i + $$13 * 25;
      float $$17 = $$6 + 50;
      if ($$16 > $$17) {
         this.i = (int)(this.i - $$7 * bcb.f(($$16 - $$17) / $$7));
      }

      float $$18 = this.i;
      float $$19 = $$6 - 100;
      if ($$18 < $$19) {
         this.i = (int)(this.i - $$7 * bcb.f(($$18 - $$19) / $$7));
      }

      this.g = true;
      this.f.clear();

      for (int $$20 = 0; $$20 < $$11; $$20++) {
         boolean $$21 = $$20 < $$10;
         dit $$22 = $$21 ? $$8.get($$20) : $$9.get($$20 - $$10);
         int $$23 = this.h + 4 + 25 * ($$20 % $$12);
         int $$24 = this.i + 5 + 25 * ($$20 / $$12);
         if (this.m) {
            this.f.add(new gji.c($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         } else {
            this.f.add(new gji.a($$23, $$24, $$22.a(), $$22.b(), $$1, $$21));
         }
      }

      this.k = null;
   }

   public gjn a() {
      return this.j;
   }

   @Nullable
   public diu b() {
      return this.k;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 != 0) {
         return false;
      } else {
         for (gji.b $$3 : this.f) {
            if ($$3.a($$0, $$1, $$2)) {
               this.k = $$3.b;
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.g) {
         int $$4 = this.f.size() <= 16 ? 4 : 5;
         int $$5 = Math.min(this.f.size(), $$4);
         int $$6 = bcb.f((float)this.f.size() / $$4);
         int $$7 = 4;
         $$0.a(gxx.ar, b, this.h, this.i, $$5 * 25 + 8, $$6 * 25 + 8);

         for (gji.b $$8 : this.f) {
            $$8.a($$0, $$1, $$2, $$3);
         }
      }
   }

   public void b(boolean $$0) {
      this.g = $$0;
   }

   public boolean c() {
      return this.g;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aM_() {
      return false;
   }

   class a extends gji.b {
      private static final ame b = ame.b("recipe_book/crafting_overlay");
      private static final ame c = ame.b("recipe_book/crafting_overlay_highlighted");
      private static final ame d = ame.b("recipe_book/crafting_overlay_disabled");
      private static final ame e = ame.b("recipe_book/crafting_overlay_disabled_highlighted");
      private static final int f = 3;
      private static final int m = 3;

      public a(final int $$0, final int $$1, final diu $$2, final dis $$3, final bdp $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<gji.b.a> a(dis $$0, bdp $$1) {
         List<gji.b.a> $$2 = new ArrayList<>();
         switch ($$0) {
            case diw $$3:
               alp.a(3, 3, $$3.b(), $$3.c(), $$3.f(), ($$2x, $$3x, $$4x, $$5x) -> {
                  List<dcv> $$6x = $$2x.a($$1);
                  if (!$$6x.isEmpty()) {
                     $$2.add(a($$4x, $$5x, $$6x));
                  }
               });
               break;
            case dix $$4:
               label19: {
                  List<diy> $$5 = $$4.b();

                  for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
                     List<dcv> $$7 = $$5.get($$6).a($$1);
                     if (!$$7.isEmpty()) {
                        $$2.add(a($$6 % 3, $$6 / 3, $$7));
                     }
                  }
                  break label19;
               }
            default:
         }

         return $$2;
      }

      @Override
      protected ame b(boolean $$0) {
         if ($$0) {
            return this.C() ? c : b;
         } else {
            return this.C() ? e : d;
         }
      }
   }

   abstract class b extends fxm {
      final diu b;
      private final boolean c;
      private final List<gji.b.a> d;

      public b(final int $$0, final int $$1, final diu $$2, final boolean $$3, final List<gji.b.a> $$4) {
         super($$0, $$1, 24, 24, xn.a);
         this.d = $$4;
         this.b = $$2;
         this.c = $$3;
      }

      protected static gji.b.a a(int $$0, int $$1, List<dcv> $$2) {
         return new gji.b.a(3 + $$0 * 7, 3 + $$1 * 7, $$2);
      }

      protected abstract ame b(boolean var1);

      @Override
      public void a(gbt $$0) {
         this.c($$0);
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, float $$3) {
         $$0.a(gxx.ar, this.b(this.c), this.E(), this.F(), this.g, this.h);
         float $$4 = this.E() + 2;
         float $$5 = this.F() + 2;

         for (gji.b.a $$6 : this.d) {
            $$0.e().pushMatrix();
            $$0.e().translate($$4 + $$6.a, $$5 + $$6.b);
            $$0.e().scale(0.375F, 0.375F);
            $$0.e().translate(-8.0F, -8.0F);
            $$0.a($$6.a(gji.this.l.currentIndex()), 0, 0);
            $$0.e().popMatrix();
         }
      }

      protected record a(int a, int b, List<dcv> c) {

         public a(int a, int b, List<dcv> c) {
            if (c.isEmpty()) {
               throw new IllegalArgumentException("Ingredient list must be non-empty");
            } else {
               this.a = a;
               this.b = b;
               this.c = c;
            }
         }

         public dcv a(int $$0) {
            return this.c.get($$0 % this.c.size());
         }
      }
   }

   class c extends gji.b {
      private static final ame b = ame.b("recipe_book/furnace_overlay");
      private static final ame c = ame.b("recipe_book/furnace_overlay_highlighted");
      private static final ame d = ame.b("recipe_book/furnace_overlay_disabled");
      private static final ame e = ame.b("recipe_book/furnace_overlay_disabled_highlighted");

      public c(final int $$0, final int $$1, final diu $$2, final dis $$3, final bdp $$4, final boolean $$5) {
         super($$0, $$1, $$2, $$5, a($$3, $$4));
      }

      private static List<gji.b.a> a(dis $$0, bdp $$1) {
         if ($$0 instanceof dir $$2) {
            List<dcv> $$3 = $$2.b().a($$1);
            if (!$$3.isEmpty()) {
               return List.of(a(1, 1, $$3));
            }
         }

         return List.of();
      }

      @Override
      protected ame b(boolean $$0) {
         if ($$0) {
            return this.C() ? c : b;
         } else {
            return this.C() ? e : d;
         }
      }
   }
}
