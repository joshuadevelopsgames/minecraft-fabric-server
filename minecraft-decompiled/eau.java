import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class eau extends eaz implements bxm, bxn, eat {
   private static final int f = 4;
   public static final List<List<jl<byo>>> a = List.of(List.of(bys.a, bys.c), List.of(bys.k, bys.h), List.of(bys.e), List.of(bys.j));
   private static final Set<jl<byo>> g = a.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   private static final xo i = xo.c("container.beacon");
   private static final String j = "primary_effect";
   private static final String k = "secondary_effect";
   List<eat.a> l = new ArrayList<>();
   private List<eat.a> m = new ArrayList<>();
   int q;
   private int r;
   @Nullable
   jl<byo> s;
   @Nullable
   jl<byo> t;
   @Nullable
   private xo u;
   private bxl v = bxl.a;
   private final cyy w = new cyy() {
      @Override
      public int a(int $$0) {
         return switch ($$0) {
            case 0 -> eau.this.q;
            case 1 -> cyr.a(eau.this.s);
            case 2 -> cyr.a(eau.this.t);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch ($$0) {
            case 0:
               eau.this.q = $$1;
               break;
            case 1:
               if (!eau.this.n.C && !eau.this.l.isEmpty()) {
                  eau.a(eau.this.n, eau.this.o, ayz.bN);
               }

               eau.this.s = eau.a(cyr.e($$1));
               break;
            case 2:
               eau.this.t = eau.a(cyr.e($$1));
         }
      }

      @Override
      public int a() {
         return 3;
      }
   };

   @Nullable
   static jl<byo> a(@Nullable jl<byo> $$0) {
      return g.contains($$0) ? $$0 : null;
   }

   public eau(jb $$0, eeb $$1) {
      super(ebb.p, $$0, $$1);
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, eau $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      jb $$7;
      if ($$3.r < $$5) {
         $$7 = $$1;
         $$3.m = Lists.newArrayList();
         $$3.r = $$1.v() - 1;
      } else {
         $$7 = new jb($$4, $$3.r + 1, $$6);
      }

      eat.a $$9 = $$3.m.isEmpty() ? null : $$3.m.get($$3.m.size() - 1);
      int $$10 = $$0.a(eka.a.b, $$4, $$6);

      for (int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; $$11++) {
         eeb $$12 = $$0.a_($$7);
         if ($$12.b() instanceof dpq $$14) {
            int $$15 = $$14.b().d();
            if ($$3.m.size() <= 1) {
               $$9 = new eat.a($$15);
               $$3.m.add($$9);
            } else if ($$9 != null) {
               if ($$15 == $$9.b()) {
                  $$9.a();
               } else {
                  $$9 = new eat.a(baj.d($$9.b(), $$15));
                  $$3.m.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.g() >= 15 && !$$12.a(dqb.I)) {
               $$3.m.clear();
               $$3.r = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.d();
         $$3.r++;
      }

      int $$16 = $$3.q;
      if ($$0.ae() % 80L == 0L) {
         if (!$$3.l.isEmpty()) {
            $$3.q = a($$0, $$4, $$5, $$6);
         }

         if ($$3.q > 0 && !$$3.l.isEmpty()) {
            a($$0, $$1, $$3.q, $$3.s, $$3.t);
            a($$0, $$1, ayz.bL);
         }
      }

      if ($$3.r >= $$10) {
         $$3.r = $$0.L_() - 1;
         boolean $$17 = $$16 > 0;
         $$3.l = $$3.m;
         if (!$$0.C) {
            boolean $$18 = $$3.q > 0;
            if (!$$17 && $$18) {
               a($$0, $$1, ayz.bK);

               for (auc $$19 : $$0.a(auc.class, new fin($$4, $$5, $$6, $$4, $$5 - 4, $$6).c(10.0, 5.0, 10.0))) {
                  aq.m.a($$19, $$3.q);
               }
            } else if ($$17 && !$$18) {
               a($$0, $$1, ayz.bM);
            }
         }
      }
   }

   private static int a(dmu $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for (int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.L_()) {
            break;
         }

         boolean $$7 = true;

         for (int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; $$8++) {
            for (int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; $$9++) {
               if (!$$0.a_(new jb($$8, $$6, $$9)).a(azo.aS)) {
                  $$7 = false;
                  break;
               }
            }
         }

         if (!$$7) {
            break;
         }
      }

      return $$4;
   }

   @Override
   public void av_() {
      a(this.n, this.o, ayz.bM);
      super.av_();
   }

   private static void a(dmu $$0, jb $$1, int $$2, @Nullable jl<byo> $$3, @Nullable jl<byo> $$4) {
      if (!$$0.C && $$3 != null) {
         double $$5 = $$2 * 10 + 10;
         int $$6 = 0;
         if ($$2 >= 4 && Objects.equals($$3, $$4)) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         fin $$8 = new fin($$1).g($$5).b(0.0, $$0.M_(), 0.0);
         List<cut> $$9 = $$0.a(cut.class, $$8);

         for (cut $$10 : $$9) {
            $$10.a(new byq($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && !Objects.equals($$3, $$4) && $$4 != null) {
            for (cut $$11 : $$9) {
               $$11.a(new byq($$4, $$7, 0, true, true));
            }
         }
      }
   }

   public static void a(dmu $$0, jb $$1, ayy $$2) {
      $$0.a(null, $$1, $$2, aza.e, 1.0F, 1.0F);
   }

   @Override
   public List<eat.a> a() {
      return (List<eat.a>)(this.q == 0 ? ImmutableList.of() : this.l);
   }

   public acw c() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   private static void a(fdc $$0, String $$1, @Nullable jl<byo> $$2) {
      if ($$2 != null) {
         $$2.e().ifPresent($$2x -> $$0.a($$1, $$2x.a().toString()));
      }
   }

   @Nullable
   private static jl<byo> b(fda $$0, String $$1) {
      return $$0.<jl<byo>>a($$1, mm.d.r()).filter(g::contains).orElse(null);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.s = b($$0, "primary_effect");
      this.t = b($$0, "secondary_effect");
      this.u = a($$0, "CustomName");
      this.v = bxl.a($$0);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      a($$0, "primary_effect", this.s);
      a($$0, "secondary_effect", this.t);
      $$0.a("Levels", this.q);
      $$0.b("CustomName", xq.a, this.u);
      this.v.a($$0);
   }

   public void a(@Nullable xo $$0) {
      this.u = $$0;
   }

   @Nullable
   @Override
   public xo al() {
      return this.u;
   }

   @Nullable
   @Override
   public cym createMenu(int $$0, cus $$1, cut $$2) {
      return eas.a($$2, this.v, this.Q_()) ? new cyr($$0, $$1, this.w, cyz.a(this.n, this.aA_())) : null;
   }

   @Override
   public xo Q_() {
      return this.aj();
   }

   @Override
   public xo aj() {
      return this.u != null ? this.u : i;
   }

   @Override
   protected void a(kl $$0) {
      super.a($$0);
      this.u = $$0.a(kq.g);
      this.v = $$0.a(kq.as, bxl.a);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kq.g, this.u);
      if (!this.v.equals(bxl.a)) {
         $$0.a(kq.as, this.v);
      }
   }

   @Override
   public void b(fdc $$0) {
      $$0.c("CustomName");
      $$0.c("lock");
   }

   @Override
   public void a(dmu $$0) {
      super.a($$0);
      this.r = $$0.L_() - 1;
   }
}
