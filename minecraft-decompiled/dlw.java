import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dlw<T> extends AbstractIterator<T> {
   private final fin a;
   private final fix b;
   private final je c;
   private final jb.a d;
   private final fjm e;
   private final dmc f;
   private final boolean g;
   @Nullable
   private dly h;
   private long i;
   private final BiFunction<jb.a, fjm, T> j;

   public dlw(dmc $$0, @Nullable bzm $$1, fin $$2, boolean $$3, BiFunction<jb.a, fjm, T> $$4) {
      this($$0, $$1 == null ? fix.a() : fix.a($$1), $$2, $$3, $$4);
   }

   public dlw(dmc $$0, fix $$1, fin $$2, boolean $$3, BiFunction<jb.a, fjm, T> $$4) {
      this.b = $$1;
      this.d = new jb.a();
      this.e = fjj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = bcb.a($$2.a - 1.0E-7) - 1;
      int $$6 = bcb.a($$2.d + 1.0E-7) + 1;
      int $$7 = bcb.a($$2.b - 1.0E-7) - 1;
      int $$8 = bcb.a($$2.e + 1.0E-7) + 1;
      int $$9 = bcb.a($$2.c - 1.0E-7) - 1;
      int $$10 = bcb.a($$2.f + 1.0E-7) + 1;
      this.c = new je($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dly a(int $$0, int $$1) {
      int $$2 = ke.a($$0);
      int $$3 = ke.a($$1);
      long $$4 = dlz.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dly $$5 = this.f.c($$2, $$3);
         this.h = $$5;
         this.i = $$4;
         return $$5;
      }
   }

   protected T computeNext() {
      while (this.c.a()) {
         int $$0 = this.c.b();
         int $$1 = this.c.c();
         int $$2 = this.c.d();
         int $$3 = this.c.e();
         if ($$3 != 3) {
            dly $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               eeb $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dqb.ca))) {
                  fjm $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fjj.b()) {
                     if (this.a.a($$0, $$1, $$2, $$0 + 1.0, $$1 + 1.0, $$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     fjm $$7 = $$6.a(this.d);
                     if (!$$7.c() && fjj.c($$7, this.e, fiw.i)) {
                        return this.j.apply(this.d, $$7);
                     }
                  }
               }
            }
         }
      }

      return (T)this.endOfData();
   }
}
