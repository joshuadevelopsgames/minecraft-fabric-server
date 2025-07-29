import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public interface fyi {
   fyi a = new fyi() {
      @Override
      public void a(fxb $$0, int $$1, int $$2) {
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public void b(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
      }

      @Override
      public int c(fxb $$0, int $$1, int $$2, int $$3, int $$4) {
         return $$2;
      }

      @Nullable
      @Override
      public yl a(int $$0, int $$1, int $$2, double $$3, double $$4) {
         return null;
      }

      @Nullable
      @Override
      public yl b(int $$0, int $$1, int $$2, double $$3, double $$4) {
         return null;
      }

      @Override
      public int a() {
         return 0;
      }

      @Override
      public int b() {
         return 0;
      }
   };

   static fyi a(fwz $$0, xo... $$1) {
      return a($$0, Integer.MAX_VALUE, Integer.MAX_VALUE, $$1);
   }

   static fyi a(fwz $$0, int $$1, xo... $$2) {
      return a($$0, $$1, Integer.MAX_VALUE, $$2);
   }

   static fyi a(fwz $$0, xo $$1, int $$2) {
      return a($$0, $$2, Integer.MAX_VALUE, $$1);
   }

   static fyi a(final fwz $$0, final int $$1, final int $$2, final xo... $$3) {
      return $$3.length == 0 ? a : new fyi() {
         @Nullable
         private List<fyi.a> f;
         @Nullable
         private ud g;

         @Override
         public void a(fxb $$0x, int $$1x, int $$2x) {
            this.a($$0, $$1, $$2, 9, -1);
         }

         @Override
         public void a(fxb $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fyi.a $$6 : this.c()) {
               $$0.b($$0, $$6.a, $$1 - $$6.b / 2, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public void b(fxb $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fyi.a $$6 : this.c()) {
               $$0.b($$0, $$6.a, $$1, $$5, $$4);
               $$5 += $$3;
            }
         }

         @Override
         public int c(fxb $$0x, int $$1x, int $$2x, int $$3x, int $$4) {
            int $$5 = $$2;

            for (fyi.a $$6 : this.c()) {
               $$0.a($$0, $$6.a, $$1, $$5, $$4, false);
               $$5 += $$3;
            }

            return $$5;
         }

         @Nullable
         @Override
         public yl a(int $$0x, int $$1x, int $$2x, double $$3x, double $$4) {
            List<fyi.a> $$5 = this.c();
            int $$6 = bcb.a(($$4 - $$1) / $$2);
            if ($$6 >= 0 && $$6 < $$5.size()) {
               fyi.a $$7 = $$5.get($$6);
               int $$8 = $$0 - $$7.b / 2;
               if ($$3 < $$8) {
                  return null;
               } else {
                  int $$9 = bcb.a($$3 - $$8);
                  return $$0.b().a($$7.a, $$9);
               }
            } else {
               return null;
            }
         }

         @Nullable
         @Override
         public yl b(int $$0x, int $$1x, int $$2x, double $$3x, double $$4) {
            if ($$3 < $$0) {
               return null;
            } else {
               List<fyi.a> $$5 = this.c();
               int $$6 = bcb.a(($$4 - $$1) / $$2);
               if ($$6 >= 0 && $$6 < $$5.size()) {
                  fyi.a $$7 = $$5.get($$6);
                  int $$8 = bcb.a($$3 - $$0);
                  return $$0.b().a($$7.a, $$8);
               } else {
                  return null;
               }
            }
         }

         private List<fyi.a> c() {
            ud $$0x = ud.a();
            if (this.f != null && $$0x == this.g) {
               return this.f;
            } else {
               this.g = $$0x;
               List<xt> $$1x = new ArrayList<>();

               for (xo $$2x : $$3) {
                  $$1x.addAll($$0.d($$2x, $$1));
               }

               this.f = new ArrayList<>();
               int $$3x = Math.min($$1x.size(), $$2);
               List<xt> $$4 = $$1x.subList(0, $$3x);

               for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
                  xt $$6 = $$4.get($$5);
                  bbm $$7 = ud.a().a($$6);
                  if ($$5 == $$4.size() - 1 && $$3x == $$2 && $$3x != $$1x.size()) {
                     xt $$8 = $$0.a($$6, $$0.a($$6) - $$0.a(xn.v));
                     xt $$9 = xt.a($$8, xn.v);
                     this.f.add(new fyi.a(ud.a().a($$9), $$0.a($$9)));
                  } else {
                     this.f.add(new fyi.a($$7, $$0.a($$7)));
                  }
               }

               return this.f;
            }
         }

         @Override
         public int a() {
            return this.c().size();
         }

         @Override
         public int b() {
            return Math.min($$1, this.c().stream().mapToInt(fyi.a::b).max().orElse(0));
         }
      };
   }

   void a(fxb var1, int var2, int var3);

   void a(fxb var1, int var2, int var3, int var4, int var5);

   void b(fxb var1, int var2, int var3, int var4, int var5);

   int c(fxb var1, int var2, int var3, int var4, int var5);

   @Nullable
   yl a(int var1, int var2, int var3, double var4, double var6);

   @Nullable
   yl b(int var1, int var2, int var3, double var4, double var6);

   int a();

   int b();

   public record a(bbm a, int b) {
   }
}
