import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class gex extends get {
   private static final xo b = xo.c("gui.stats");
   static final ame c = ame.b("container/slot");
   static final ame d = ame.b("statistics/header");
   static final ame e = ame.b("statistics/sort_up");
   static final ame f = ame.b("statistics/sort_down");
   private static final xo u = xo.c("multiplayer.downloadingStats");
   static final xo v = xo.c("stats.none");
   private static final xo w = xo.c("stat.generalButton");
   private static final xo x = xo.c("stat.itemsButton");
   private static final xo y = xo.c("stat.mobsButton");
   protected final get a;
   private static final int z = 280;
   private static final int A = 5;
   private static final int B = 58;
   private gbk C = new gbk(this, 33, 58);
   @Nullable
   private gex.a D;
   @Nullable
   gex.b E;
   @Nullable
   private gex.c F;
   final azk G;
   @Nullable
   private fyl<?> H;
   private boolean I = true;

   public gex(get $$0, azk $$1) {
      super(b);
      this.a = $$0;
      this.G = $$1;
   }

   @Override
   protected void aV_() {
      this.C.c(new fye(this.q, u));
      this.n.M().b(new ahy(ahy.a.b));
   }

   public void l() {
      this.D = new gex.a(this.n);
      this.E = new gex.b(this.n);
      this.F = new gex.c(this.n);
   }

   public void m() {
      gbk $$0 = new gbk(this, 33, 58);
      $$0.a(b, this.q);
      gbo $$1 = $$0.b(gbo.d()).a(5);
      $$1.c().b();
      gbo $$2 = $$1.a(gbo.e()).a(5);
      $$2.a(fxo.a(w, $$0x -> this.a(this.D)).a(120).a());
      fxo $$3 = $$2.a(fxo.a(x, $$0x -> this.a(this.E)).a(120).a());
      fxo $$4 = $$2.a(fxo.a(y, $$0x -> this.a(this.F)).a(120).a());
      $$1.a(fxo.a(xn.d, $$0x -> this.aP_()).a(200).a());
      if (this.E != null && this.E.aH_().isEmpty()) {
         $$3.j = false;
      }

      if (this.F != null && this.F.aH_().isEmpty()) {
         $$4.j = false;
      }

      this.C = $$0;
      this.C.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
      if (this.H != null) {
         this.H.a(this.o, this.C);
      }
   }

   @Override
   public void aP_() {
      this.n.a(this.a);
   }

   public void n() {
      if (this.I) {
         this.l();
         this.a(this.D);
         this.m();
         this.aF_();
         this.I = false;
      }
   }

   public void a(@Nullable fyl<?> $$0) {
      if (this.H != null) {
         this.e(this.H);
      }

      if ($$0 != null) {
         this.c($$0);
         this.H = $$0;
         this.c();
      }
   }

   static String a(azg<ame> $$0) {
      return "stat." + $$0.b().toString().replace(':', '.');
   }

   class a extends fyl<gex.a.a> {
      public a(final fue $$0) {
         super($$0, gex.this.o, gex.this.p - 33 - 58, 33, 14);
         ObjectArrayList<azg<ame>> $$1 = new ObjectArrayList(azj.i.iterator());
         $$1.sort(Comparator.comparing($$0x -> htb.a(gex.a($$0x))));
         ObjectListIterator var4 = $$1.iterator();

         while (var4.hasNext()) {
            azg<ame> $$2 = (azg<ame>)var4.next();
            this.b(new gex.a.a($$2));
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fyl.a<gex.a.a> {
         private final azg<ame> b;
         private final xo c;

         a(final azg<ame> $$0) {
            this.b = $$0;
            this.c = xo.c(gex.a($$0));
         }

         private String b() {
            return this.b.a(gex.this.G.a(this.b));
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2 - 9 / 2;
            int $$11 = $$1 % 2 == 0 ? -1 : -4539718;
            $$0.b(gex.this.q, this.c, $$3 + 2, $$10, $$11);
            String $$12 = this.b();
            $$0.b(gex.this.q, $$12, $$3 + $$4 - gex.this.q.b($$12) - 4, $$10, $$11);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xo.i().b(this.c).b(xn.w).f(this.b()));
         }
      }
   }

   class b extends fyl<gex.b.a> {
      private static final int s = 18;
      private static final int u = 22;
      private static final int v = 1;
      private static final int w = 0;
      private static final int x = -1;
      private static final int y = 1;
      private final ame[] z = new ame[]{
         ame.b("statistics/block_mined"),
         ame.b("statistics/item_broken"),
         ame.b("statistics/item_crafted"),
         ame.b("statistics/item_used"),
         ame.b("statistics/item_picked_up"),
         ame.b("statistics/item_dropped")
      };
      protected final List<azi<dpz>> a;
      protected final List<azi<dcr>> m;
      protected final Comparator<gex.b.a> n = new gex.b.b();
      @Nullable
      protected azi<?> o;
      protected int p = -1;
      protected int q;

      public b(final fue $$0) {
         super($$0, gex.this.o, gex.this.p - 33 - 58, 33, 22, 22);
         this.a = Lists.newArrayList();
         this.a.add(azj.a);
         this.m = Lists.newArrayList(new azi[]{azj.d, azj.b, azj.c, azj.e, azj.f});
         Set<dcr> $$1 = Sets.newIdentityHashSet();

         for (dcr $$2 : mm.g) {
            boolean $$3 = false;

            for (azi<dcr> $$4 : this.m) {
               if ($$4.a($$2) && gex.this.G.a($$4.b($$2)) > 0) {
                  $$3 = true;
               }
            }

            if ($$3) {
               $$1.add($$2);
            }
         }

         for (dpz $$5 : mm.e) {
            boolean $$6 = false;

            for (azi<dpz> $$7 : this.a) {
               if ($$7.a($$5) && gex.this.G.a($$7.b($$5)) > 0) {
                  $$6 = true;
               }
            }

            if ($$6) {
               $$1.add($$5.h());
            }
         }

         $$1.remove(dcz.a);

         for (dcr $$8 : $$1) {
            this.b(new gex.b.a($$8));
         }
      }

      int m(int $$0) {
         return 75 + 40 * $$0;
      }

      @Override
      protected void a(fxb $$0, int $$1, int $$2) {
         if (!this.c.o.b()) {
            this.p = -1;
         }

         for (int $$3 = 0; $$3 < this.z.length; $$3++) {
            ame $$4 = this.p == $$3 ? gex.c : gex.d;
            $$0.a(gxx.ar, $$4, $$1 + this.m($$3) - 18, $$2 + 1, 18, 18);
         }

         if (this.o != null) {
            int $$5 = this.m(this.b(this.o)) - 36;
            ame $$6 = this.q == 1 ? gex.e : gex.f;
            $$0.a(gxx.ar, $$6, $$1 + $$5, $$2 + 1, 18, 18);
         }

         for (int $$7 = 0; $$7 < this.z.length; $$7++) {
            int $$8 = this.p == $$7 ? 1 : 0;
            $$0.a(gxx.ar, this.z[$$7], $$1 + this.m($$7) - 18 + $$8, $$2 + 1 + $$8, 18, 18);
         }
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         boolean $$3 = super.a($$0, $$1, $$2);
         return !$$3 && this.a((int)($$0 - (this.E() + this.g / 2.0 - this.a() / 2.0)), (int)($$1 - this.F()) + (int)this.g() - 4) ? true : $$3;
      }

      protected boolean a(int $$0, int $$1) {
         this.p = -1;

         for (int $$2 = 0; $$2 < this.z.length; $$2++) {
            int $$3 = $$0 - this.m($$2);
            if ($$3 >= -36 && $$3 <= 0) {
               this.p = $$2;
               break;
            }
         }

         if (this.p >= 0) {
            this.a(this.n(this.p));
            this.c.al().a(hvm.a(ayz.BU, 1.0F));
            return true;
         } else {
            return false;
         }
      }

      @Override
      public int a() {
         return 280;
      }

      private azi<?> n(int $$0) {
         return $$0 < this.a.size() ? this.a.get($$0) : this.m.get($$0 - this.a.size());
      }

      private int b(azi<?> $$0) {
         int $$1 = this.a.indexOf($$0);
         if ($$1 >= 0) {
            return $$1;
         } else {
            int $$2 = this.m.indexOf($$0);
            return $$2 >= 0 ? $$2 + this.a.size() : -1;
         }
      }

      @Override
      protected void b(fxb $$0, int $$1, int $$2) {
         if ($$2 >= this.F() && $$2 <= this.H()) {
            gex.b.a $$3 = this.x();
            int $$4 = this.u();
            if ($$3 != null) {
               if ($$1 < $$4 || $$1 > $$4 + 18) {
                  return;
               }

               dcr $$5 = $$3.b();
               $$0.a(gex.this.q, $$5.l(), $$1, $$2, $$5.f().a(kq.G));
            } else {
               xo $$6 = null;
               int $$7 = $$1 - $$4;

               for (int $$8 = 0; $$8 < this.z.length; $$8++) {
                  int $$9 = this.m($$8);
                  if ($$7 >= $$9 - 18 && $$7 <= $$9) {
                     $$6 = this.n($$8).c();
                     break;
                  }
               }

               if ($$6 != null) {
                  $$0.a(gex.this.q, $$6, $$1, $$2);
               }
            }
         }
      }

      protected void a(azi<?> $$0) {
         if ($$0 != this.o) {
            this.o = $$0;
            this.q = -1;
         } else if (this.q == -1) {
            this.q = 1;
         } else {
            this.o = null;
            this.q = 0;
         }

         this.aH_().sort(this.n);
      }

      class a extends fyl.a<gex.b.a> {
         private final dcr b;

         a(final dcr $$0) {
            this.b = $$0;
         }

         public dcr b() {
            return this.b;
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gxx.ar, gex.c, $$3, $$2, 18, 18);
            $$0.b(this.b.m(), $$3 + 1, $$2 + 1);
            if (gex.this.E != null) {
               for (int $$10 = 0; $$10 < gex.this.E.a.size(); $$10++) {
                  azg<dpz> $$12;
                  if (this.b instanceof dbd $$11) {
                     $$12 = gex.this.E.a.get($$10).b($$11.c());
                  } else {
                     $$12 = null;
                  }

                  this.a($$0, $$12, $$3 + b.this.m($$10), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }

               for (int $$14 = 0; $$14 < gex.this.E.m.size(); $$14++) {
                  this.a($$0, gex.this.E.m.get($$14).b(this.b), $$3 + b.this.m($$14 + gex.this.E.a.size()), $$2 + $$5 / 2 - 9 / 2, $$1 % 2 == 0);
               }
            }
         }

         protected void a(fxb $$0, @Nullable azg<?> $$1, int $$2, int $$3, boolean $$4) {
            xo $$5 = (xo)($$1 == null ? gex.v : xo.b($$1.a(gex.this.G.a($$1))));
            $$0.b(gex.this.q, $$5, $$2 - gex.this.q.a($$5), $$3, $$4 ? -1 : -4539718);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", this.b.l());
         }
      }

      class b implements Comparator<gex.b.a> {
         public int a(gex.b.a $$0, gex.b.a $$1) {
            dcr $$2 = $$0.b();
            dcr $$3 = $$1.b();
            int $$4;
            int $$5;
            if (b.this.o == null) {
               $$4 = 0;
               $$5 = 0;
            } else if (b.this.a.contains(b.this.o)) {
               azi<dpz> $$6 = (azi<dpz>)b.this.o;
               $$4 = $$2 instanceof dbd ? gex.this.G.a($$6, ((dbd)$$2).c()) : -1;
               $$5 = $$3 instanceof dbd ? gex.this.G.a($$6, ((dbd)$$3).c()) : -1;
            } else {
               azi<dcr> $$9 = (azi<dcr>)b.this.o;
               $$4 = gex.this.G.a($$9, $$2);
               $$5 = gex.this.G.a($$9, $$3);
            }

            return $$4 == $$5 ? b.this.q * Integer.compare(dcr.a($$2), dcr.a($$3)) : b.this.q * Integer.compare($$4, $$5);
         }
      }
   }

   class c extends fyl<gex.c.a> {
      public c(final fue $$0) {
         super($$0, gex.this.o, gex.this.p - 33 - 58, 33, 9 * 4);

         for (bzv<?> $$1 : mm.f) {
            if (gex.this.G.a(azj.g.b($$1)) > 0 || gex.this.G.a(azj.h.b($$1)) > 0) {
               this.b(new gex.c.a($$1));
            }
         }
      }

      @Override
      public int a() {
         return 280;
      }

      class a extends fyl.a<gex.c.a> {
         private final xo b;
         private final xo c;
         private final xo d;
         private final boolean e;
         private final boolean f;

         public a(final bzv<?> $$0) {
            this.b = $$0.h();
            int $$1 = gex.this.G.a(azj.g.b($$0));
            if ($$1 == 0) {
               this.c = xo.a("stat_type.minecraft.killed.none", this.b);
               this.e = false;
            } else {
               this.c = xo.a("stat_type.minecraft.killed", $$1, this.b);
               this.e = true;
            }

            int $$2 = gex.this.G.a(azj.h.b($$0));
            if ($$2 == 0) {
               this.d = xo.a("stat_type.minecraft.killed_by.none", this.b);
               this.f = false;
            } else {
               this.d = xo.a("stat_type.minecraft.killed_by", this.b, $$2);
               this.f = true;
            }
         }

         @Override
         public void a(fxb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.b(gex.this.q, this.b, $$3 + 2, $$2 + 1, -1);
            $$0.b(gex.this.q, this.c, $$3 + 2 + 10, $$2 + 1 + 9, this.e ? -4539718 : -8355712);
            $$0.b(gex.this.q, this.d, $$3 + 2 + 10, $$2 + 1 + 9 * 2, this.f ? -4539718 : -8355712);
         }

         @Override
         public xo a() {
            return xo.a("narrator.select", xn.a(this.c, this.d));
         }
      }
   }
}
