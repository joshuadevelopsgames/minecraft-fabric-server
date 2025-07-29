import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;

public class gld {
   static final ame b = ame.b("spectator/close");
   static final ame c = ame.b("spectator/scroll_left");
   static final ame d = ame.b("spectator/scroll_right");
   private static final glf e = new gld.a();
   private static final glf f = new gld.b(-1, true);
   private static final glf g = new gld.b(1, true);
   private static final glf h = new gld.b(1, false);
   private static final int i = 8;
   static final xo j = xo.c("spectatorMenu.close");
   static final xo k = xo.c("spectatorMenu.previous_page");
   static final xo l = xo.c("spectatorMenu.next_page");
   public static final glf a = new glf() {
      @Override
      public void a(gld $$0) {
      }

      @Override
      public xo aW_() {
         return xn.a;
      }

      @Override
      public void a(fxb $$0, float $$1, float $$2) {
      }

      @Override
      public boolean aX_() {
         return false;
      }
   };
   private final glg m;
   private gle n;
   private int o = -1;
   int p;

   public gld(glg $$0) {
      this.n = new glc();
      this.m = $$0;
   }

   public glf a(int $$0) {
      int $$1 = $$0 + this.p * 6;
      if (this.p > 0 && $$0 == 0) {
         return f;
      } else if ($$0 == 7) {
         return $$1 < this.n.a().size() ? g : h;
      } else if ($$0 == 8) {
         return e;
      } else {
         return $$1 >= 0 && $$1 < this.n.a().size() ? (glf)MoreObjects.firstNonNull(this.n.a().get($$1), a) : a;
      }
   }

   public List<glf> a() {
      List<glf> $$0 = Lists.newArrayList();

      for (int $$1 = 0; $$1 <= 8; $$1++) {
         $$0.add(this.a($$1));
      }

      return $$0;
   }

   public glf b() {
      return this.a(this.o);
   }

   public gle c() {
      return this.n;
   }

   public void b(int $$0) {
      glf $$1 = this.a($$0);
      if ($$1 != a) {
         if (this.o == $$0 && $$1.aX_()) {
            $$1.a(this);
         } else {
            this.o = $$0;
         }
      }
   }

   public void d() {
      this.m.a(this);
   }

   public int e() {
      return this.o;
   }

   public void a(gle $$0) {
      this.n = $$0;
      this.o = -1;
      this.p = 0;
   }

   public glh f() {
      return new glh(this.a(), this.o);
   }

   static class a implements glf {
      @Override
      public void a(gld $$0) {
         $$0.d();
      }

      @Override
      public xo aW_() {
         return gld.j;
      }

      @Override
      public void a(fxb $$0, float $$1, float $$2) {
         $$0.a(gxx.ar, gld.b, 0, 0, 16, 16, baj.a($$2, $$1, $$1, $$1));
      }

      @Override
      public boolean aX_() {
         return true;
      }
   }

   static class b implements glf {
      private final int a;
      private final boolean b;

      public b(int $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public void a(gld $$0) {
         $$0.p = $$0.p + this.a;
      }

      @Override
      public xo aW_() {
         return this.a < 0 ? gld.k : gld.l;
      }

      @Override
      public void a(fxb $$0, float $$1, float $$2) {
         int $$3 = baj.a($$2, $$1, $$1, $$1);
         if (this.a < 0) {
            $$0.a(gxx.ar, gld.c, 0, 0, 16, 16, $$3);
         } else {
            $$0.a(gxx.ar, gld.d, 0, 0, 16, 16, $$3);
         }
      }

      @Override
      public boolean aX_() {
         return this.b;
      }
   }
}
