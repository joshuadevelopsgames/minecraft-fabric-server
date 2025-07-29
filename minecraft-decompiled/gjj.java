import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class gjj<T extends dab> implements fys, fzn, gbr {
   public static final fzd a = new fzd(ame.b("recipe_book/button"), ame.b("recipe_book/button_highlighted"));
   protected static final ame b = ame.b("textures/gui/recipe_book.png");
   private static final int h = 256;
   private static final int i = 256;
   private static final xo j = xo.c("gui.recipebook.search_hint").a(o.u).a(o.h);
   public static final int c = 147;
   public static final int d = 166;
   private static final int k = 86;
   private static final int l = 8;
   private static final xo m = xo.c("gui.recipebook.toggleRecipes.all");
   private static final int n = 30;
   private int o;
   private int p;
   private int q;
   private float r;
   @Nullable
   private diu s;
   private final gjh u;
   private final List<gjl> v = Lists.newArrayList();
   @Nullable
   private gjl w;
   protected fyw e;
   protected final T f;
   protected fue g;
   @Nullable
   private fxx x;
   private String y = "";
   private final List<gjj.a> z;
   private ftp A;
   private final gjk B;
   @Nullable
   private diu C;
   @Nullable
   private gjn D;
   private final cuz E = new cuz();
   private int F;
   private boolean G;
   private boolean H;
   private boolean I;
   @Nullable
   private gcd J;

   public gjj(T $$0, List<gjj.a> $$1) {
      this.f = $$0;
      this.z = $$1;
      gjq $$2 = () -> bcb.d(this.r / 30.0F);
      this.u = new gjh($$2);
      this.B = new gjk(this, $$2, $$0 instanceof cyo);
   }

   public void a(int $$0, int $$1, fue $$2, boolean $$3) {
      this.g = $$2;
      this.p = $$0;
      this.q = $$1;
      this.I = $$3;
      this.A = $$2.t.m();
      this.F = $$2.t.gs().n();
      this.H = this.n();
      if (this.H) {
         this.j();
      }
   }

   private void j() {
      boolean $$0 = this.q();
      this.o = this.I ? 0 : 86;
      int $$1 = this.l();
      int $$2 = this.k();
      this.E.a();
      this.g.t.gs().a(this.E);
      this.f.a(this.E);
      String $$3 = this.x != null ? this.x.a() : "";
      this.x = new fxx(this.g.h, $$1 + 25, $$2 + 13, 81, 9 + 5, xo.c("itemGroup.search"));
      this.x.f(50);
      this.x.i(true);
      this.x.m(-1);
      this.x.a($$3);
      this.x.c(j);
      this.J = gcd.a(gca.a, $$1 + 8, this.x.F(), this.x.E() - this.l(), this.x.y());
      this.B.a(this.g, $$1, $$2);
      this.e = new fyw($$1 + 110, $$2 + 12, 26, 16, $$0);
      this.m();
      this.a();
      this.v.clear();

      for (gjj.a $$4 : this.z) {
         this.v.add(new gjl($$4));
      }

      if (this.w != null) {
         this.w = this.v.stream().filter($$0x -> $$0x.c().equals(this.w.c())).findFirst().orElse(null);
      }

      if (this.w == null) {
         this.w = this.v.get(0);
      }

      this.w.b(true);
      this.o();
      this.c($$0);
      this.a(false, $$0);
   }

   private int k() {
      return (this.q - 166) / 2;
   }

   private int l() {
      return (this.p - 147) / 2 - this.o;
   }

   private void m() {
      this.e.a(this.e.a() ? fzb.a(this.c()) : fzb.a(m));
   }

   protected abstract void a();

   public int a(int $$0, int $$1) {
      int $$2;
      if (this.e() && !this.I) {
         $$2 = 177 + ($$0 - $$1 - 200) / 2;
      } else {
         $$2 = ($$0 - $$1) / 2;
      }

      return $$2;
   }

   public void d() {
      this.b(!this.e());
   }

   public boolean e() {
      return this.H;
   }

   private boolean n() {
      return this.A.a(this.f.am_());
   }

   protected void b(boolean $$0) {
      if ($$0) {
         this.j();
      }

      this.H = $$0;
      this.A.a(this.f.am_(), $$0);
      if (!$$0) {
         this.B.c();
      }

      this.i();
   }

   protected abstract boolean a(dak var1);

   public void b(@Nullable dak $$0) {
      if ($$0 != null && this.a($$0)) {
         this.s = null;
         this.u.a();
         if (this.e()) {
            this.p();
         }
      }
   }

   private void o() {
      for (gjj.a $$0 : this.z) {
         for (gjn $$1 : this.A.a($$0.c())) {
            this.a($$1, this.E);
         }
      }
   }

   protected abstract void a(gjn var1, cuz var2);

   private void a(boolean $$0, boolean $$1) {
      List<gjn> $$2 = this.A.a(this.w.c());
      List<gjn> $$3 = Lists.newArrayList($$2);
      $$3.removeIf($$0x -> !$$0x.b());
      String $$4 = this.x.a();
      if (!$$4.isEmpty()) {
         grl $$5 = this.g.M();
         if ($$5 != null) {
            ObjectSet<gjn> $$6 = new ObjectLinkedOpenHashSet($$5.F().b().search($$4.toLowerCase(Locale.ROOT)));
            $$3.removeIf($$1x -> !$$6.contains($$1x));
         }
      }

      if ($$1) {
         $$3.removeIf($$0x -> !$$0x.a());
      }

      this.B.a($$3, $$0, $$1);
   }

   private void c(boolean $$0) {
      int $$1 = (this.p - 147) / 2 - this.o - 30;
      int $$2 = (this.q - 166) / 2 + 3;
      int $$3 = 27;
      int $$4 = 0;

      for (gjl $$5 : this.v) {
         dhe $$6 = $$5.c();
         if ($$6 instanceof gjp) {
            $$5.k = true;
            $$5.c($$1, $$2 + 27 * $$4++);
         } else if ($$5.a(this.A)) {
            $$5.c($$1, $$2 + 27 * $$4++);
            $$5.a(this.A, $$0);
         }
      }
   }

   public void g() {
      boolean $$0 = this.n();
      if (this.e() != $$0) {
         this.b($$0);
      }

      if (this.e()) {
         if (this.F != this.g.t.gs().n()) {
            this.p();
            this.F = this.g.t.gs().n();
         }
      }
   }

   private void p() {
      this.E.a();
      this.g.t.gs().a(this.E);
      this.f.a(this.E);
      this.o();
      this.a(false, this.q());
   }

   private boolean q() {
      return this.A.b(this.f.am_());
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      if (this.e()) {
         if (!get.s()) {
            this.r += $$3;
         }

         int $$4 = this.l();
         int $$5 = this.k();
         $$0.a(gxx.ar, b, $$4, $$5, 1.0F, 1.0F, 147, 166, 256, 256);
         this.x.a($$0, $$1, $$2, $$3);

         for (gjl $$6 : this.v) {
            $$6.a($$0, $$1, $$2, $$3);
         }

         this.e.a($$0, $$1, $$2, $$3);
         this.B.a($$0, $$4, $$5, $$1, $$2, $$3);
      }
   }

   public void a(fxb $$0, int $$1, int $$2, @Nullable dak $$3) {
      if (this.e()) {
         this.B.a($$0, $$1, $$2);
         this.u.a($$0, this.g, $$1, $$2, $$3);
      }
   }

   protected abstract xo c();

   public void a(fxb $$0, boolean $$1) {
      this.u.a($$0, this.g, $$1);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.e() && !this.g.t.am()) {
         if (this.B.a($$0, $$1, $$2, this.l(), this.k(), 147, 166)) {
            diu $$3 = this.B.a();
            gjn $$4 = this.B.b();
            if ($$3 != null && $$4 != null) {
               if (!this.a($$4, $$3)) {
                  return false;
               }

               this.D = $$4;
               this.C = $$3;
               if (!this.t()) {
                  this.b(false);
               }
            }

            return true;
         } else {
            if (this.x != null) {
               boolean $$5 = this.J != null && this.J.a(bcb.a($$0), bcb.a($$1));
               if ($$5 || this.x.a($$0, $$1, $$2)) {
                  this.x.a(true);
                  return true;
               }

               this.x.a(false);
            }

            if (this.e.a($$0, $$1, $$2)) {
               boolean $$6 = this.r();
               this.e.b($$6);
               this.m();
               this.i();
               this.a(false, $$6);
               return true;
            } else {
               for (gjl $$7 : this.v) {
                  if ($$7.a($$0, $$1, $$2)) {
                     if (this.w != $$7) {
                        if (this.w != null) {
                           this.w.b(false);
                        }

                        this.w = $$7;
                        this.w.b(true);
                        this.a(true, this.q());
                     }

                     return true;
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean a(gjn $$0, diu $$1) {
      if (!$$0.a($$1) && $$1.equals(this.s)) {
         return false;
      } else {
         this.s = $$1;
         this.u.a();
         this.g.r.a(this.g.t.cn.l, $$1, get.t());
         return true;
      }
   }

   private boolean r() {
      dac $$0 = this.f.am_();
      boolean $$1 = !this.A.b($$0);
      this.A.b($$0, $$1);
      return $$1;
   }

   public boolean a(double $$0, double $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      if (!this.e()) {
         return true;
      } else {
         boolean $$7 = $$0 < $$2 || $$1 < $$3 || $$0 >= $$2 + $$4 || $$1 >= $$3 + $$5;
         boolean $$8 = $$2 - 147 < $$0 && $$0 < $$2 && $$3 < $$1 && $$1 < $$3 + $$5;
         return $$7 && !$$8 && !this.w.C();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      this.G = false;
      if (!this.e() || this.g.t.am()) {
         return false;
      } else if ($$0 == 256 && !this.t()) {
         this.b(false);
         return true;
      } else if (this.x.a($$0, $$1, $$2)) {
         this.s();
         return true;
      } else if (this.x.aM_() && this.x.i() && $$0 != 256) {
         return true;
      } else if (this.g.n.I.a($$0, $$1) && !this.x.aM_()) {
         this.G = true;
         this.x.a(true);
         return true;
      } else if (gby.a($$0) && this.D != null && this.C != null) {
         fxm.b(fue.R().al());
         return this.a(this.D, this.C);
      } else {
         return false;
      }
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      this.G = false;
      return fzn.super.c($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (this.G) {
         return false;
      } else if (!this.e() || this.g.t.am()) {
         return false;
      } else if (this.x.a($$0, $$1)) {
         this.s();
         return true;
      } else {
         return fzn.super.a($$0, $$1);
      }
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public boolean aM_() {
      return false;
   }

   private void s() {
      String $$0 = this.x.a().toLowerCase(Locale.ROOT);
      this.a($$0);
      if (!$$0.equals(this.y)) {
         this.a(false, this.q());
         this.y = $$0;
      }
   }

   private void a(String $$0) {
      if ("excitedze".equals($$0)) {
         htd $$1 = this.g.ai();
         String $$2 = "en_pt";
         htc $$3 = $$1.b("en_pt");
         if ($$3 == null || $$1.a().equals("en_pt")) {
            return;
         }

         $$1.a("en_pt");
         this.g.n.ac = "en_pt";
         this.g.l();
         this.g.n.aC();
      }
   }

   private boolean t() {
      return this.o == 86;
   }

   public void h() {
      this.o();
      this.c(this.q());
      if (this.e()) {
         this.a(false, this.q());
      }
   }

   public void a(diu $$0) {
      this.g.t.a($$0);
   }

   public void a(dis $$0) {
      this.u.a();
      bdp $$1 = diz.a(Objects.requireNonNull(this.g.s));
      this.a(this.u, $$0, $$1);
   }

   protected abstract void a(gjh var1, dis var2, bdp var3);

   protected void i() {
      if (this.g.M() != null) {
         dac $$0 = this.f.am_();
         boolean $$1 = this.A.a().b($$0);
         boolean $$2 = this.A.a().c($$0);
         this.g.M().b(new aix($$0, $$1, $$2));
      }
   }

   @Override
   public gbr.a w() {
      return this.H ? gbr.a.b : gbr.a.a;
   }

   @Override
   public void b(gbt $$0) {
      List<gbr> $$1 = Lists.newArrayList();
      this.B.a($$1x -> {
         if ($$1x.D()) {
            $$1.add($$1x);
         }
      });
      $$1.add(this.x);
      $$1.add(this.e);
      $$1.addAll(this.v);
      get.a $$2 = get.a($$1, null);
      if ($$2 != null) {
         $$2.a.b($$0.a());
      }
   }

   public record a(dcv a, Optional<dcv> b, dhe c) {
      public a(gjp $$0) {
         this(new dcv(dcz.sb), Optional.empty(), $$0);
      }

      public a(dcr $$0, dhp $$1) {
         this(new dcv($$0), Optional.empty(), $$1);
      }

      public a(dcr $$0, dcr $$1, dhp $$2) {
         this(new dcv($$0), Optional.of(new dcv($$1)), $$2);
      }
   }
}
