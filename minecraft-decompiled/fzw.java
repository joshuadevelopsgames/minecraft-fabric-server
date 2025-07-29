import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fzw extends fzl implements fys, gbr {
   private static final int a = -1;
   private static final int b = 400;
   private static final int c = 24;
   private static final int d = 14;
   private static final xo e = xo.c("narration.tab_navigation.usage");
   private final gbo f = gbo.e();
   private int g;
   private final fzv h;
   private final ImmutableList<fzu> i;
   private final ImmutableList<fyz> j;

   fzw(int $$0, fzv $$1, Iterable<fzu> $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = ImmutableList.copyOf($$2);
      this.f.c().b();
      Builder<fyz> $$3 = ImmutableList.builder();

      for (fzu $$4 : $$2) {
         $$3.add(this.f.a(new fyz($$1, $$4, 0, 24)));
      }

      this.j = $$3.build();
   }

   public static fzw.a a(fzv $$0, int $$1) {
      return new fzw.a($$0, $$1);
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return $$0 >= this.f.E() && $$1 >= this.f.F() && $$0 < this.f.E() + this.f.z() && $$1 < this.f.F() + this.f.y();
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (this.aL_() != null) {
         this.aL_().a($$0);
      }
   }

   @Override
   public void a(@Nullable fzn $$0) {
      if ($$0 instanceof fyz $$1 && $$1.D()) {
         super.a($$0);
         this.h.a($$1.a(), true);
      }
   }

   @Nullable
   @Override
   public fwy a(gbz $$0) {
      if (!this.aM_()) {
         fyz $$1 = this.i();
         if ($$1 != null) {
            return fwy.a(this, fwy.a($$1));
         }
      }

      return $$0 instanceof gbz.c ? null : super.a($$0);
   }

   @Override
   public List<? extends fzn> aH_() {
      return this.j;
   }

   public List<fzu> c() {
      return this.i;
   }

   @Override
   public gbr.a w() {
      return this.j.stream().map(fxm::w).max(Comparator.naturalOrder()).orElse(gbr.a.a);
   }

   @Override
   public void b(gbt $$0) {
      Optional<fyz> $$1 = this.j.stream().filter(fxm::B).findFirst().or(() -> Optional.ofNullable(this.i()));
      $$1.ifPresent($$1x -> {
         this.a($$0.a(), $$1x);
         $$1x.b($$0);
      });
      if (this.aM_()) {
         $$0.a(gbs.d, e);
      }
   }

   protected void a(gbt $$0, fyz $$1) {
      if (this.i.size() > 1) {
         int $$2 = this.j.indexOf($$1);
         if ($$2 != -1) {
            $$0.a(gbs.b, xo.a("narrator.position.tab", $$2 + 1, this.i.size()));
         }
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      $$0.a(gxx.ar, get.h, 0, this.f.F() + this.f.y() - 2, 0.0F, 0.0F, ((fyz)this.j.get(0)).E(), 2, 32, 2);
      int $$4 = ((fyz)this.j.get(this.j.size() - 1)).G();
      $$0.a(gxx.ar, get.h, $$4, this.f.F() + this.f.y() - 2, 0.0F, 0.0F, this.g, 2, 32, 2);
      UnmodifiableIterator var6 = this.j.iterator();

      while (var6.hasNext()) {
         fyz $$5 = (fyz)var6.next();
         $$5.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public gcd I() {
      return this.f.I();
   }

   public void g() {
      int $$0 = Math.min(400, this.g) - 28;
      int $$1 = bcb.d($$0 / this.i.size(), 2);
      UnmodifiableIterator var3 = this.j.iterator();

      while (var3.hasNext()) {
         fyz $$2 = (fyz)var3.next();
         $$2.h($$1);
      }

      this.f.a();
      this.f.j(bcb.d((this.g - $$0) / 2, 2));
      this.f.k(0);
   }

   public void a(int $$0, boolean $$1) {
      if (this.aM_()) {
         this.a((fzn)this.j.get($$0));
      } else if (((fyz)this.j.get($$0)).D()) {
         this.h.a((fzu)this.i.get($$0), $$1);
      }
   }

   public void b(int $$0, boolean $$1) {
      if ($$0 >= 0 && $$0 < this.j.size()) {
         ((fyz)this.j.get($$0)).j = $$1;
      }
   }

   public void a(int $$0, @Nullable fzb $$1) {
      if ($$0 >= 0 && $$0 < this.j.size()) {
         ((fyz)this.j.get($$0)).a($$1);
      }
   }

   public boolean b(int $$0) {
      if (get.s()) {
         int $$1 = this.c($$0);
         if ($$1 != -1) {
            this.a(bcb.a($$1, 0, this.i.size() - 1), true);
            return true;
         }
      }

      return false;
   }

   private int c(int $$0) {
      return this.a(this.h(), $$0);
   }

   private int a(int $$0, int $$1) {
      if ($$1 >= 49 && $$1 <= 57) {
         return $$1 - 49;
      } else if ($$1 == 258 && $$0 != -1) {
         int $$2 = get.t() ? $$0 - 1 : $$0 + 1;
         int $$3 = Math.floorMod($$2, this.i.size());
         return ((fyz)this.j.get($$3)).j ? $$3 : this.a($$3, $$1);
      } else {
         return -1;
      }
   }

   private int h() {
      fzu $$0 = this.h.a();
      int $$1 = this.i.indexOf($$0);
      return $$1 != -1 ? $$1 : -1;
   }

   @Nullable
   private fyz i() {
      int $$0 = this.h();
      return $$0 != -1 ? (fyz)this.j.get($$0) : null;
   }

   public static class a {
      private final int a;
      private final fzv b;
      private final List<fzu> c = new ArrayList<>();

      a(fzv $$0, int $$1) {
         this.b = $$0;
         this.a = $$1;
      }

      public fzw.a a(fzu... $$0) {
         Collections.addAll(this.c, $$0);
         return this;
      }

      public fzw a() {
         return new fzw(this.a, this.b, this.c);
      }
   }
}
