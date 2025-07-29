import javax.annotation.Nullable;

public class ebw extends eaz implements bxn {
   public int a;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h;
   public float i;
   public float j;
   private static final bck k = bck.a();
   @Nullable
   private xo l;

   public ebw(jb $$0, eeb $$1) {
      super(ebb.n, $$0, $$1);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.b("CustomName", xq.a, this.l);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.l = a($$0, "CustomName");
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, ebw $$3) {
      $$3.g = $$3.f;
      $$3.i = $$3.h;
      cut $$4 = $$0.a($$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, 3.0, false);
      if ($$4 != null) {
         double $$5 = $$4.dC() - ($$1.u() + 0.5);
         double $$6 = $$4.dI() - ($$1.w() + 0.5);
         $$3.j = (float)bcb.d($$6, $$5);
         $$3.f += 0.1F;
         if ($$3.f < 0.5F || k.a(40) == 0) {
            float $$7 = $$3.d;

            do {
               $$3.d = $$3.d + (k.a(4) - k.a(4));
            } while ($$7 == $$3.d);
         }
      } else {
         $$3.j += 0.02F;
         $$3.f -= 0.1F;
      }

      while ($$3.h >= (float) Math.PI) {
         $$3.h -= (float) (Math.PI * 2);
      }

      while ($$3.h < (float) -Math.PI) {
         $$3.h += (float) (Math.PI * 2);
      }

      while ($$3.j >= (float) Math.PI) {
         $$3.j -= (float) (Math.PI * 2);
      }

      while ($$3.j < (float) -Math.PI) {
         $$3.j += (float) (Math.PI * 2);
      }

      float $$8 = $$3.j - $$3.h;

      while ($$8 >= (float) Math.PI) {
         $$8 -= (float) (Math.PI * 2);
      }

      while ($$8 < (float) -Math.PI) {
         $$8 += (float) (Math.PI * 2);
      }

      $$3.h += $$8 * 0.4F;
      $$3.f = bcb.a($$3.f, 0.0F, 1.0F);
      $$3.a++;
      $$3.c = $$3.b;
      float $$9 = ($$3.d - $$3.b) * 0.4F;
      float $$10 = 0.2F;
      $$9 = bcb.a($$9, -0.2F, 0.2F);
      $$3.e = $$3.e + ($$9 - $$3.e) * 0.9F;
      $$3.b = $$3.b + $$3.e;
   }

   @Override
   public xo aj() {
      return (xo)(this.l != null ? this.l : xo.c("container.enchant"));
   }

   public void a(@Nullable xo $$0) {
      this.l = $$0;
   }

   @Nullable
   @Override
   public xo al() {
      return this.l;
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.l = $$0.a(kq.g);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.l);
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("CustomName");
   }
}
