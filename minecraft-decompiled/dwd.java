import com.mojang.serialization.MapCodec;

public class dwd extends dpo {
   public static final MapCodec<dwd> b = b(dwd::new);
   public static final eez<eff> c = eer.ak;
   public static final ees d = eer.A;

   @Override
   public MapCodec<dwd> a() {
      return b;
   }

   protected dwd(eea.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, eff.a).b(d, false).b(a, false));
   }

   protected boolean a(dmu $$0, jb $$1, eeb $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         eff $$9 = $$2.c(c);
         switch ($$9) {
            case a:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
               }
               break;
            case b:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
               }
               break;
            case c:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
                  $$6++;
                  $$8 = false;
               }

               $$9 = eff.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = eff.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = eff.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = eff.a;
         }

         return this.a($$0, new jb($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jb($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dmu $$0, jb $$1, boolean $$2, int $$3, eff $$4) {
      eeb $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         eff $$6 = $$5.c(c);
         if ($$4 != eff.b || $$6 != eff.a && $$6 != eff.e && $$6 != eff.f) {
            if ($$4 != eff.a || $$6 != eff.b && $$6 != eff.c && $$6 != eff.d) {
               if (!$$5.c(d)) {
                  return false;
               } else {
                  return $$0.E($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3) {
      boolean $$4 = $$0.c(d);
      boolean $$5 = $$1.E($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.b(d, $$5), 3);
         $$1.a($$2.e(), this);
         if ($$0.c(c).b()) {
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public efe<eff> c() {
      return c;
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      eff $$2 = $$0.c(c);
      eff $$3 = this.a($$2, $$1);
      return $$0.b(c, $$3);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d, a);
   }
}
