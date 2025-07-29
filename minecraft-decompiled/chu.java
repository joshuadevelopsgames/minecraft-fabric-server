import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class chu extends chi {
   protected final cau a;
   private final double b;
   @Nullable
   private faz c;
   private jb d;
   private final boolean e;
   private final List<jb> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public chu(cau $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(chi.a.a));
      if (!clh.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean b() {
      if (!clh.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.ai().W()) {
            return false;
         } else {
            aub $$0 = (aub)this.a.ai();
            jb $$1 = this.a.dx();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               fis $$2 = clj.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.c($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<jb> $$3x = $$0.B().d($$0xx -> $$0xx.a(azz.b), this::a, $$2x, 10, clp.b.b);
                     return $$3x.<Double>map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<jb> $$3 = $$0.B().d($$0x -> $$0x.a(azz.b), this::a, jb.a((jv)$$2), 10, clp.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = $$3.get().j();
                     cjw $$4 = this.a.S();
                     $$4.d(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.d(true);
                     if (this.c == null) {
                        fis $$5 = clg.a(this.a, 10, 7, fis.c(this.d), (float) (Math.PI / 2));
                        if ($$5 == null) {
                           return false;
                        }

                        $$4.d(this.h.getAsBoolean());
                        this.c = this.a.S().a($$5.d, $$5.e, $$5.f, 0);
                        $$4.d(true);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for (int $$6 = 0; $$6 < this.c.e(); $$6++) {
                        fax $$7 = this.c.a($$6);
                        jb $$8 = new jb($$7.a, $$7.b + 1, $$7.c);
                        if (dsg.a(this.a.ai(), $$8)) {
                           this.c = this.a.S().a((double)$$7.a, (double)$$7.b, (double)$$7.c, 0);
                           break;
                        }
                     }

                     return this.c != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean c() {
      return this.a.S().l() ? false : !this.d.a(this.a.dv(), this.a.ds() + this.g);
   }

   @Override
   public void d() {
      this.a.S().a(this.c, this.b);
   }

   @Override
   public void e() {
      if (this.a.S().l() || this.d.a(this.a.dv(), this.g)) {
         this.f.add(this.d);
      }
   }

   private boolean a(jb $$0) {
      for (jb $$1 : this.f) {
         if (Objects.equals($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   private void h() {
      if (this.f.size() > 15) {
         this.f.remove(0);
      }
   }
}
