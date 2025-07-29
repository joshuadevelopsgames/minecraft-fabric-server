public interface dnm extends dly {
   jh[] D = jh.values();

   default int a(jb $$0, jh $$1) {
      return this.a_($$0).b(this, $$0, $$1);
   }

   default int e_(jb $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.a($$0.e(), jh.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.a($$0.d(), jh.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.a($$0.f(), jh.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.a($$0.g(), jh.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.a($$0.h(), jh.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.a($$0.i(), jh.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   default int a(jb $$0, jh $$1, boolean $$2) {
      eeb $$3 = this.a_($$0);
      if ($$2) {
         return dsc.n($$3) ? this.a($$0, $$1) : 0;
      } else if ($$3.a(dqb.hB)) {
         return 15;
      } else if ($$3.a(dqb.cH)) {
         return $$3.c(dwj.f);
      } else {
         return $$3.p() ? this.a($$0, $$1) : 0;
      }
   }

   default boolean b(jb $$0, jh $$1) {
      return this.c($$0, $$1) > 0;
   }

   default int c(jb $$0, jh $$1) {
      eeb $$2 = this.a_($$0);
      int $$3 = $$2.a(this, $$0, $$1);
      return $$2.d(this, $$0) ? Math.max($$3, this.e_($$0)) : $$3;
   }

   default boolean E(jb $$0) {
      if (this.c($$0.e(), jh.a) > 0) {
         return true;
      } else if (this.c($$0.d(), jh.b) > 0) {
         return true;
      } else if (this.c($$0.f(), jh.c) > 0) {
         return true;
      } else if (this.c($$0.g(), jh.d) > 0) {
         return true;
      } else {
         return this.c($$0.h(), jh.e) > 0 ? true : this.c($$0.i(), jh.f) > 0;
      }
   }

   default int F(jb $$0) {
      int $$1 = 0;

      for (jh $$2 : D) {
         int $$3 = this.c($$0.a($$2), $$2);
         if ($$3 >= 15) {
            return 15;
         }

         if ($$3 > $$1) {
            $$1 = $$3;
         }
      }

      return $$1;
   }
}
