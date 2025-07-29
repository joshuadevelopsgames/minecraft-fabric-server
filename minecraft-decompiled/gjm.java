import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class gjm extends fxm {
   private static final ame a = ame.b("recipe_book/slot_many_craftable");
   private static final ame b = ame.b("recipe_book/slot_craftable");
   private static final ame c = ame.b("recipe_book/slot_many_uncraftable");
   private static final ame d = ame.b("recipe_book/slot_uncraftable");
   private static final float e = 15.0F;
   private static final int f = 25;
   private static final xo m = xo.c("gui.recipebook.moreRecipes");
   private gjn n = gjn.a;
   private List<gjm.a> o = List.of();
   private boolean p;
   private final gjq q;
   private float r;

   public gjm(gjq $$0) {
      super(0, 0, 25, 25, xn.a);
      this.q = $$0;
   }

   public void a(gjn $$0, boolean $$1, gjk $$2, bdp $$3) {
      this.n = $$0;
      List<dit> $$4 = $$0.a($$1 ? gjn.a.b : gjn.a.a);
      this.o = $$4.stream().map($$1x -> new gjm.a($$1x.a(), $$1x.a($$3))).toList();
      this.p = a(this.o);
      List<diu> $$5 = $$4.stream().map(dit::a).filter($$2.d()::b).toList();
      if (!$$5.isEmpty()) {
         $$5.forEach($$2::a);
         this.r = 15.0F;
      }
   }

   private static boolean a(List<gjm.a> $$0) {
      Iterator<dcv> $$1 = $$0.stream().flatMap($$0x -> $$0x.b().stream()).iterator();
      if (!$$1.hasNext()) {
         return true;
      } else {
         dcv $$2 = $$1.next();

         while ($$1.hasNext()) {
            dcv $$3 = $$1.next();
            if (!dcv.c($$2, $$3)) {
               return false;
            }
         }

         return true;
      }
   }

   public gjn a() {
      return this.n;
   }

   @Override
   public void b(fxb $$0, int $$1, int $$2, float $$3) {
      ame $$4;
      if (this.n.a()) {
         if (this.h()) {
            $$4 = a;
         } else {
            $$4 = b;
         }
      } else if (this.h()) {
         $$4 = c;
      } else {
         $$4 = d;
      }

      boolean $$8 = this.r > 0.0F;
      if ($$8) {
         float $$9 = 1.0F + 0.1F * (float)Math.sin(this.r / 15.0F * (float) Math.PI);
         $$0.e().pushMatrix();
         $$0.e().translate(this.E() + 8, this.F() + 12);
         $$0.e().scale($$9, $$9);
         $$0.e().translate(-(this.E() + 8), -(this.F() + 12));
         this.r -= $$3;
      }

      $$0.a(gxx.ar, $$4, this.E(), this.F(), this.g, this.h);
      dcv $$10 = this.g();
      int $$11 = 4;
      if (this.h() && this.p) {
         $$0.a($$10, this.E() + $$11 + 1, this.F() + $$11 + 1, 0);
         $$11--;
      }

      $$0.b($$10, this.E() + $$11, this.F() + $$11);
      if ($$8) {
         $$0.e().popMatrix();
      }
   }

   private boolean h() {
      return this.o.size() > 1;
   }

   public boolean c() {
      return this.o.size() == 1;
   }

   public diu e() {
      int $$0 = this.q.currentIndex() % this.o.size();
      return this.o.get($$0).a;
   }

   public dcv g() {
      int $$0 = this.q.currentIndex();
      int $$1 = this.o.size();
      int $$2 = $$0 / $$1;
      int $$3 = $$0 - $$1 * $$2;
      return this.o.get($$3).a($$2);
   }

   public List<xo> a(dcv $$0) {
      List<xo> $$1 = new ArrayList<>(get.a(fue.R(), $$0));
      if (this.h()) {
         $$1.add(m);
      }

      return $$1;
   }

   @Override
   public void a(gbt $$0) {
      $$0.a(gbs.a, xo.a("narration.recipe", this.g().y()));
      if (this.h()) {
         $$0.a(gbs.d, xo.c("narration.button.usage.hovered"), xo.c("narration.recipe.usage.more"));
      } else {
         $$0.a(gbs.d, xo.c("narration.button.usage.hovered"));
      }
   }

   @Override
   public int z() {
      return 25;
   }

   @Override
   protected boolean g(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   record a(diu a, List<dcv> b) {

      public dcv a(int $$0) {
         if (this.b.isEmpty()) {
            return dcv.l;
         } else {
            int $$1 = $$0 % this.b.size();
            return this.b.get($$1);
         }
      }
   }
}
