import com.google.common.collect.ImmutableList;
import java.util.List;

public enum eia {
   a {
      @Override
      public void a(aub $$0, eib $$1, List<cpr> $$2, int $$3, jb $$4) {
         jb $$5 = new jb(0, 128, 0);

         for (cpr $$6 : $$2) {
            $$6.a($$5);
         }

         $$1.a(b);
      }
   },
   b {
      @Override
      public void a(aub $$0, eib $$1, List<cpr> $$2, int $$3, jb $$4) {
         if ($$3 < 100) {
            if ($$3 == 0 || $$3 == 50 || $$3 == 51 || $$3 == 52 || $$3 >= 95) {
               $$0.c(3001, new jb(0, 128, 0), 0);
            }
         } else {
            $$1.a(c);
         }
      }
   },
   c {
      @Override
      public void a(aub $$0, eib $$1, List<cpr> $$2, int $$3, jb $$4) {
         int $$5 = 40;
         boolean $$6 = $$3 % 40 == 0;
         boolean $$7 = $$3 % 40 == 39;
         if ($$6 || $$7) {
            List<eor.a> $$8 = eor.a($$0);
            int $$9 = $$3 / 40;
            if ($$9 < $$8.size()) {
               eor.a $$10 = $$8.get($$9);
               if ($$6) {
                  for (cpr $$11 : $$2) {
                     $$11.a(new jb($$10.a(), $$10.d() + 1, $$10.b()));
                  }
               } else {
                  int $$12 = 10;

                  for (jb $$13 : jb.c(new jb($$10.a() - 10, $$10.d() - 10, $$10.b() - 10), new jb($$10.a() + 10, $$10.d() + 10, $$10.b() + 10))) {
                     $$0.a($$13, false);
                  }

                  $$0.a(null, $$10.a() + 0.5F, $$10.d(), $$10.b() + 0.5F, 5.0F, dmu.a.b);
                  eqg $$14 = new eqg(true, ImmutableList.of($$10), new jb(0, 128, 0));
                  enh.L.a($$14, $$0, $$0.n().g(), bck.a(), new jb($$10.a(), 45, $$10.b()));
               }
            } else if ($$6) {
               $$1.a(d);
            }
         }
      }
   },
   d {
      @Override
      public void a(aub $$0, eib $$1, List<cpr> $$2, int $$3, jb $$4) {
         if ($$3 >= 100) {
            $$1.a(e);
            $$1.h();

            for (cpr $$5 : $$2) {
               $$5.a(null);
               $$0.a($$5, $$5.dC(), $$5.dE(), $$5.dI(), 6.0F, dmu.a.a);
               $$5.at();
            }
         } else if ($$3 >= 80) {
            $$0.c(3001, new jb(0, 128, 0), 0);
         } else if ($$3 == 0) {
            for (cpr $$6 : $$2) {
               $$6.a(new jb(0, 128, 0));
            }
         } else if ($$3 < 5) {
            $$0.c(3001, new jb(0, 128, 0), 0);
         }
      }
   },
   e {
      @Override
      public void a(aub $$0, eib $$1, List<cpr> $$2, int $$3, jb $$4) {
      }
   };

   public abstract void a(aub var1, eib var2, List<cpr> var3, int var4, jb var5);
}
