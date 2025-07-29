import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class giw extends fxu<giw.b> {
   private static final int a = 20;
   final gix m;
   private int n;

   public giw(gix $$0, fue $$1) {
      super($$1, $$0.o, $$0.e.d(), $$0.e.c(), 20);
      this.m = $$0;
      fuc[] $$2 = (fuc[])ArrayUtils.clone($$1.n.W);
      Arrays.sort((Object[])$$2);
      String $$3 = null;

      for (fuc $$4 : $$2) {
         String $$5 = $$4.f();
         if (!$$5.equals($$3)) {
            $$3 = $$5;
            this.b(new giw.a(xo.c($$5)));
         }

         xo $$6 = xo.c($$4.h());
         int $$7 = $$1.h.a($$6);
         if ($$7 > this.n) {
            this.n = $$7;
         }

         this.b(new giw.c($$4, $$6));
      }
   }

   public void c() {
      fuc.d();
      this.K();
   }

   public void K() {
      this.aH_().forEach(giw.b::c);
   }

   @Override
   public int a() {
      return 340;
   }

   public class a extends giw.b {
      final xo b;
      private final int c;

      public a(final xo $$1) {
         this.b = $$1;
         this.c = giw.this.c.h.a(this.b);
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(giw.this.c.h, this.b, giw.this.g / 2 - this.c / 2, $$2 + $$5 - 9 - 1, -1);
      }

      @Nullable
      @Override
      public fwy a(gbz $$0) {
         return null;
      }

      @Override
      public List<? extends fzn> aH_() {
         return Collections.emptyList();
      }

      @Override
      public List<? extends gbr> b() {
         return ImmutableList.of(new gbr() {
            @Override
            public gbr.a w() {
               return gbr.a.b;
            }

            @Override
            public void b(gbt $$0) {
               $$0.a(gbs.a, a.this.b);
            }
         });
      }

      @Override
      protected void c() {
      }
   }

   public abstract static class b extends fxu.a<giw.b> {
      abstract void c();
   }

   public class c extends giw.b {
      private static final xo b = xo.c("controls.reset");
      private static final int c = 10;
      private final fuc d;
      private final xo e;
      private final fxo f;
      private final fxo g;
      private boolean h = false;

      c(final fuc $$1, final xo $$2) {
         this.d = $$1;
         this.e = $$2;
         this.f = fxo.a($$2, $$1x -> {
            giw.this.m.a = $$1;
            giw.this.c();
         }).a(0, 0, 75, 20).a($$2x -> $$1.j() ? xo.a("narrator.controls.unbound", $$2) : xo.a("narrator.controls.bound", $$2, $$2x.get())).a();
         this.g = fxo.a(b, $$1x -> {
            $$1.b($$1.i());
            giw.this.c();
         }).a(0, 0, 50, 20).a($$1x -> xo.a("narrator.controls.reset", $$2)).a();
         this.c();
      }

      @Override
      public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = giw.this.l() - this.g.z() - 10;
         int $$11 = $$2 - 2;
         this.g.c($$10, $$11);
         this.g.a($$0, $$6, $$7, $$9);
         int $$12 = $$10 - 5 - this.f.z();
         this.f.c($$12, $$11);
         this.f.a($$0, $$6, $$7, $$9);
         $$0.b(giw.this.c.h, this.e, $$3, $$2 + $$5 / 2 - 9 / 2, -1);
         if (this.h) {
            int $$13 = 3;
            int $$14 = this.f.E() - 6;
            $$0.a($$14, $$2 - 1, $$14 + 3, $$2 + $$5, -65536);
         }
      }

      @Override
      public List<? extends fzn> aH_() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      public List<? extends gbr> b() {
         return ImmutableList.of(this.f, this.g);
      }

      @Override
      protected void c() {
         this.f.b(this.d.k());
         this.g.j = !this.d.l();
         this.h = false;
         yc $$0 = xo.i();
         if (!this.d.j()) {
            for (fuc $$1 : giw.this.c.n.W) {
               if ($$1 != this.d && this.d.b($$1)) {
                  if (this.h) {
                     $$0.f(", ");
                  }

                  this.h = true;
                  $$0.b(xo.c($$1.h()));
               }
            }
         }

         if (this.h) {
            this.f.b(xo.b("[ ").b(this.f.A().f().a(o.p)).f(" ]").a(o.m));
            this.f.a(fzb.a(xo.a("controls.keybinds.duplicateKeybinds", $$0)));
         } else {
            this.f.a(null);
         }

         if (giw.this.m.a == this.d) {
            this.f.b(xo.b("> ").b(this.f.A().f().a(o.p, o.t)).f(" <").a(o.o));
         }
      }
   }
}
