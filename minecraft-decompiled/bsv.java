import java.util.ArrayList;
import java.util.List;

public interface bsv<S> {
   boolean a(bsr<S> var1, bst var2, bsl var3);

   static <S, T> bsv<S> a(bsj<T> $$0, T $$1) {
      return new bsv.c<>($$0, $$1);
   }

   @SafeVarargs
   static <S> bsv<S> a(bsv<S>... $$0) {
      return new bsv.g<>($$0);
   }

   @SafeVarargs
   static <S> bsv<S> b(bsv<S>... $$0) {
      return new bsv.a<>($$0);
   }

   static <S> bsv<S> a(bsv<S> $$0) {
      return new bsv.d<>($$0);
   }

   static <S, T> bsv<S> a(bsq<S, T> $$0, bsj<List<T>> $$1) {
      return a($$0, $$1, 0);
   }

   static <S, T> bsv<S> a(bsq<S, T> $$0, bsj<List<T>> $$1, int $$2) {
      return new bsv.e<>($$0, $$1, $$2);
   }

   static <S, T> bsv<S> a(bsq<S, T> $$0, bsj<List<T>> $$1, bsv<S> $$2) {
      return a($$0, $$1, $$2, 0);
   }

   static <S, T> bsv<S> a(bsq<S, T> $$0, bsj<List<T>> $$1, bsv<S> $$2, int $$3) {
      return new bsv.f<>($$0, $$1, $$2, $$3, true);
   }

   static <S, T> bsv<S> b(bsq<S, T> $$0, bsj<List<T>> $$1, bsv<S> $$2) {
      return b($$0, $$1, $$2, 0);
   }

   static <S, T> bsv<S> b(bsq<S, T> $$0, bsj<List<T>> $$1, bsv<S> $$2, int $$3) {
      return new bsv.f<>($$0, $$1, $$2, $$3, false);
   }

   static <S> bsv<S> b(bsv<S> $$0) {
      return new bsv.b<>($$0, true);
   }

   static <S> bsv<S> c(bsv<S> $$0) {
      return new bsv.b<>($$0, false);
   }

   static <S> bsv<S> c() {
      return new bsv<S>() {
         @Override
         public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
            $$2.a();
            return true;
         }

         @Override
         public String toString() {
            return "↑";
         }
      };
   }

   static <S> bsv<S> d() {
      return new bsv<S>() {
         @Override
         public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
            return true;
         }

         @Override
         public String toString() {
            return "ε";
         }
      };
   }

   static <S> bsv<S> a(final Object $$0) {
      return new bsv<S>() {
         @Override
         public boolean a(bsr<S> $$0x, bst $$1, bsl $$2) {
            $$0.b().a($$0.g(), $$0);
            return false;
         }

         @Override
         public String toString() {
            return "fail";
         }
      };
   }

   public record a<S>(bsv<S>[] a) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         bsl $$3 = $$0.c();

         try {
            int $$4 = $$0.g();
            $$1.c();

            for (bsv<S> $$5 : this.a) {
               if ($$5.a($$0, $$1, $$3)) {
                  $$1.e();
                  return true;
               }

               $$1.d();
               $$0.a($$4);
               if ($$3.b()) {
                  break;
               }
            }

            $$1.b();
            return false;
         } finally {
            $$0.d();
         }
      }
   }

   public record b<S>(bsv<S> a, boolean b) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         int $$3 = $$0.g();
         boolean $$4 = this.a.a($$0.e(), $$1, $$2);
         $$0.a($$3);
         return this.b == $$4;
      }
   }

   public record c<S, T>(bsj<T> a, T b) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         $$1.a(this.a, this.b);
         return true;
      }
   }

   public record d<S>(bsv<S> a) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         int $$3 = $$0.g();
         if (!this.a.a($$0, $$1, $$2)) {
            $$0.a($$3);
         }

         return true;
      }
   }

   public record e<S, T>(bsq<S, T> a, bsj<List<T>> b, int c) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         int $$3 = $$0.g();
         List<T> $$4 = new ArrayList<>(this.c);

         while (true) {
            int $$5 = $$0.g();
            T $$6 = $$0.a(this.a);
            if ($$6 == null) {
               $$0.a($$5);
               if ($$4.size() < this.c) {
                  $$0.a($$3);
                  return false;
               } else {
                  $$1.a(this.b, $$4);
                  return true;
               }
            }

            $$4.add($$6);
         }
      }

      public int e() {
         return this.c;
      }
   }

   public record f<S, T>(bsq<S, T> a, bsj<List<T>> b, bsv<S> c, int d, boolean e) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         int $$3 = $$0.g();
         List<T> $$4 = new ArrayList<>(this.d);
         boolean $$5 = true;

         while (true) {
            int $$6 = $$0.g();
            if (!$$5 && !this.c.a($$0, $$1, $$2)) {
               $$0.a($$6);
               break;
            }

            int $$7 = $$0.g();
            T $$8 = $$0.a(this.a);
            if ($$8 == null) {
               if ($$5) {
                  $$0.a($$7);
               } else {
                  if (!this.e) {
                     $$0.a($$3);
                     return false;
                  }

                  $$0.a($$7);
               }
               break;
            }

            $$4.add($$8);
            $$5 = false;
         }

         if ($$4.size() < this.d) {
            $$0.a($$3);
            return false;
         } else {
            $$1.a(this.b, $$4);
            return true;
         }
      }

      public bsv<S> e() {
         return this.c;
      }

      public int f() {
         return this.d;
      }

      public boolean g() {
         return this.e;
      }
   }

   public record g<S>(bsv<S>[] a) implements bsv<S> {
      @Override
      public boolean a(bsr<S> $$0, bst $$1, bsl $$2) {
         int $$3 = $$0.g();

         for (bsv<S> $$4 : this.a) {
            if (!$$4.a($$0, $$1, $$2)) {
               $$0.a($$3);
               return false;
            }
         }

         return true;
      }
   }
}
