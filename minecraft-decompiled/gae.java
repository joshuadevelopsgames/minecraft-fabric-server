import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class gae implements gac {
   private static final ame h = ame.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 4;
   private static final int i = 7;
   private static final int j = 3;
   private static final int k = 11;
   private static final int l = 30;
   private static final int m = 126;
   private final gae.a n;
   private final List<bbm> o;
   private gac.a p = gac.a.a;
   private long q;
   private float r;
   private float s;
   private final boolean t;
   private final int u;

   public gae(fwz $$0, gae.a $$1, xo $$2, @Nullable xo $$3, boolean $$4, int $$5) {
      this.n = $$1;
      this.o = new ArrayList<>(2);
      this.o.addAll($$0.c($$2.f().b(-11534256), 126));
      if ($$3 != null) {
         this.o.addAll($$0.c($$3, 126));
      }

      this.t = $$4;
      this.u = $$5;
   }

   public gae(fwz $$0, gae.a $$1, xo $$2, @Nullable xo $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, 0);
   }

   @Override
   public gac.a a() {
      return this.p;
   }

   @Override
   public void a(gad $$0, long $$1) {
      if (this.u > 0) {
         this.s = Math.min((float)$$1 / this.u, 1.0F);
         this.r = this.s;
         this.q = $$1;
         if ($$1 > this.u) {
            this.c();
         }
      } else if (this.t) {
         this.r = bcb.b(this.r, this.s, (float)($$1 - this.q) / 100.0F);
         this.q = $$1;
      }
   }

   @Override
   public int f() {
      return 7 + this.g() + 3;
   }

   private int g() {
      return Math.max(this.o.size(), 2) * 11;
   }

   @Override
   public void a(fxb $$0, fwz $$1, long $$2) {
      int $$3 = this.f();
      $$0.a(gxx.ar, h, 0, 0, this.e(), $$3);
      this.n.a($$0, 6, 6);
      int $$4 = this.o.size() * 11;
      int $$5 = 7 + (this.g() - $$4) / 2;

      for (int $$6 = 0; $$6 < this.o.size(); $$6++) {
         $$0.a($$1, this.o.get($$6), 30, $$5 + $$6 * 11, -16777216, false);
      }

      if (this.t) {
         int $$7 = $$3 - 4;
         $$0.a(3, $$7, 157, $$7 + 1, -1);
         int $$8;
         if (this.s >= this.r) {
            $$8 = -16755456;
         } else {
            $$8 = -11206656;
         }

         $$0.a(3, $$7, (int)(3.0F + 154.0F * this.r), $$7 + 1, $$8);
      }
   }

   public void c() {
      this.p = gac.a.b;
   }

   public void a(float $$0) {
      this.s = $$0;
   }

   public static enum a {
      a(ame.b("toast/movement_keys")),
      b(ame.b("toast/mouse")),
      c(ame.b("toast/tree")),
      d(ame.b("toast/recipe_book")),
      e(ame.b("toast/wooden_planks")),
      f(ame.b("toast/social_interactions")),
      g(ame.b("toast/right_click"));

      private final ame h;

      private a(final ame $$0) {
         this.h = $$0;
      }

      public void a(fxb $$0, int $$1, int $$2) {
         $$0.a(gxx.ar, this.h, $$1, $$2, 20, 20);
      }
   }
}
