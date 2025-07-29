import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ecs extends eaz implements ebc {
   private static final int d = 5;
   public static final int a = 48;
   public static final int b = 48;
   public static final String c = "author";
   private static final String e = "";
   private static final String f = "";
   private static final jb g = new jb(0, 1, 0);
   private static final kg h = kg.i;
   private static final dwu i = dwu.a;
   private static final dvd j = dvd.a;
   private static final boolean k = true;
   private static final boolean l = false;
   private static final boolean m = false;
   private static final boolean q = false;
   private static final boolean r = true;
   private static final float s = 1.0F;
   private static final long t = 0L;
   @Nullable
   private ame u;
   private String v = "";
   private String w = "";
   private jb x = g;
   private kg y = h;
   private dvd z = dvd.a;
   private dwu A = dwu.a;
   private efl B;
   private boolean C = true;
   private boolean D = false;
   private boolean E = false;
   private boolean F = false;
   private boolean G = true;
   private float H = 1.0F;
   private long I = 0L;

   public ecs(jb $$0, eeb $$1) {
      super(ebb.v, $$0, $$1);
      this.B = $$1.c(dyi.b);
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      $$0.a("name", this.d());
      $$0.a("author", this.v);
      $$0.a("metadata", this.w);
      $$0.a("posX", this.x.u());
      $$0.a("posY", this.x.v());
      $$0.a("posZ", this.x.w());
      $$0.a("sizeX", this.y.u());
      $$0.a("sizeY", this.y.v());
      $$0.a("sizeZ", this.y.w());
      $$0.a("rotation", dwu.h, this.A);
      $$0.a("mirror", dvd.e, this.z);
      $$0.a("mode", efl.e, this.B);
      $$0.a("ignoreEntities", this.C);
      $$0.a("strict", this.D);
      $$0.a("powered", this.E);
      $$0.a("showair", this.F);
      $$0.a("showboundingbox", this.G);
      $$0.a("integrity", this.H);
      $$0.a("seed", this.I);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a($$0.a("name", ""));
      this.v = $$0.a("author", "");
      this.w = $$0.a("metadata", "");
      int $$1 = bcb.a($$0.a("posX", g.u()), -48, 48);
      int $$2 = bcb.a($$0.a("posY", g.v()), -48, 48);
      int $$3 = bcb.a($$0.a("posZ", g.w()), -48, 48);
      this.x = new jb($$1, $$2, $$3);
      int $$4 = bcb.a($$0.a("sizeX", h.u()), 0, 48);
      int $$5 = bcb.a($$0.a("sizeY", h.v()), 0, 48);
      int $$6 = bcb.a($$0.a("sizeZ", h.w()), 0, 48);
      this.y = new kg($$4, $$5, $$6);
      this.A = $$0.<dwu>a("rotation", dwu.h).orElse(i);
      this.z = $$0.<dvd>a("mirror", dvd.e).orElse(j);
      this.B = $$0.<efl>a("mode", efl.e).orElse(efl.d);
      this.C = $$0.a("ignoreEntities", true);
      this.D = $$0.a("strict", false);
      this.E = $$0.a("powered", false);
      this.F = $$0.a("showair", false);
      this.G = $$0.a("showboundingbox", true);
      this.H = $$0.a("integrity", 1.0F);
      this.I = $$0.a("seed", 0L);
      this.J();
   }

   private void J() {
      if (this.n != null) {
         jb $$0 = this.aA_();
         eeb $$1 = this.n.a_($$0);
         if ($$1.a(dqb.pH)) {
            this.n.a($$0, $$1.b(dyi.b, this.B), 2);
         }
      }
   }

   public acw a() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   public boolean a(cut $$0) {
      if (!$$0.gQ()) {
         return false;
      } else {
         if ($$0.ai().C) {
            $$0.a(this);
         }

         return true;
      }
   }

   public String d() {
      return this.u == null ? "" : this.u.toString();
   }

   public boolean f() {
      return this.u != null;
   }

   public void a(@Nullable String $$0) {
      this.a(bdb.b($$0) ? null : ame.c($$0));
   }

   public void a(@Nullable ame $$0) {
      this.u = $$0;
   }

   public void a(cam $$0) {
      this.v = $$0.aj().getString();
   }

   public jb j() {
      return this.x;
   }

   public void a(jb $$0) {
      this.x = $$0;
   }

   public kg k() {
      return this.y;
   }

   public void a(kg $$0) {
      this.y = $$0;
   }

   public dvd u() {
      return this.z;
   }

   public void a(dvd $$0) {
      this.z = $$0;
   }

   public dwu v() {
      return this.A;
   }

   public void a(dwu $$0) {
      this.A = $$0;
   }

   public String w() {
      return this.w;
   }

   public void b(String $$0) {
      this.w = $$0;
   }

   public efl x() {
      return this.B;
   }

   public void a(efl $$0) {
      this.B = $$0;
      eeb $$1 = this.n.a_(this.aA_());
      if ($$1.a(dqb.pH)) {
         this.n.a(this.aA_(), $$1.b(dyi.b, $$0), 2);
      }
   }

   public boolean y() {
      return this.C;
   }

   public boolean z() {
      return this.D;
   }

   public void a(boolean $$0) {
      this.C = $$0;
   }

   public void b(boolean $$0) {
      this.D = $$0;
   }

   public float A() {
      return this.H;
   }

   public void a(float $$0) {
      this.H = $$0;
   }

   public long B() {
      return this.I;
   }

   public void a(long $$0) {
      this.I = $$0;
   }

   public boolean C() {
      if (this.B != efl.a) {
         return false;
      } else {
         jb $$0 = this.aA_();
         int $$1 = 80;
         jb $$2 = new jb($$0.u() - 80, this.n.L_(), $$0.w() - 80);
         jb $$3 = new jb($$0.u() + 80, this.n.ao(), $$0.w() + 80);
         Stream<jb> $$4 = this.a($$2, $$3);
         return a($$0, $$4).filter($$1x -> {
            int $$2x = $$1x.k() - $$1x.h();
            int $$3x = $$1x.l() - $$1x.i();
            int $$4x = $$1x.m() - $$1x.j();
            if ($$2x > 1 && $$3x > 1 && $$4x > 1) {
               this.x = new jb($$1x.h() - $$0.u() + 1, $$1x.i() - $$0.v() + 1, $$1x.j() - $$0.w() + 1);
               this.y = new kg($$2x - 1, $$3x - 1, $$4x - 1);
               this.e();
               eeb $$5 = this.n.a_($$0);
               this.n.a($$0, $$5, $$5, 3);
               return true;
            } else {
               return false;
            }
         }).isPresent();
      }
   }

   private Stream<jb> a(jb $$0, jb $$1) {
      return jb.d($$0, $$1)
         .filter($$0x -> this.n.a_($$0x).a(dqb.pH))
         .map(this.n::c_)
         .filter($$0x -> $$0x instanceof ecs)
         .map($$0x -> (ecs)$$0x)
         .filter($$0x -> $$0x.B == efl.c && Objects.equals(this.u, $$0x.u))
         .map(eaz::aA_);
   }

   private static Optional<euq> a(jb $$0, Stream<jb> $$1) {
      Iterator<jb> $$2 = $$1.iterator();
      if (!$$2.hasNext()) {
         return Optional.empty();
      } else {
         jb $$3 = $$2.next();
         euq $$4 = new euq($$3);
         if ($$2.hasNext()) {
            $$2.forEachRemaining($$4::a);
         } else {
            $$4.a($$0);
         }

         return Optional.of($$4);
      }
   }

   public boolean D() {
      return this.B != efl.a ? false : this.c(true);
   }

   public boolean c(boolean $$0) {
      if (this.u != null && this.n instanceof aub $$1) {
         jb var4 = this.aA_().a((kg)this.x);
         return a($$1, this.u, var4, this.y, this.C, this.v, $$0, List.of());
      } else {
         return false;
      }
   }

   public static boolean a(aub $$0, ame $$1, jb $$2, kg $$3, boolean $$4, String $$5, boolean $$6, List<dpz> $$7) {
      ezb $$8 = $$0.s();

      eza $$9;
      try {
         $$9 = $$8.a($$1);
      } catch (ab var12) {
         return false;
      }

      $$9.a($$0, $$2, $$3, !$$4, Stream.concat($$7.stream(), Stream.of(dqb.lt)).toList());
      $$9.a($$5);
      if ($$6) {
         try {
            return $$8.c($$1);
         } catch (ab var11) {
            return false;
         }
      } else {
         return true;
      }
   }

   public static bck b(long $$0) {
      return $$0 == 0L ? bck.a(ag.c()) : bck.a($$0);
   }

   public boolean a(aub $$0) {
      if (this.B == efl.b && this.u != null) {
         eza $$1 = $$0.s().b(this.u).orElse(null);
         if ($$1 == null) {
            return false;
         } else if ($$1.a().equals(this.y)) {
            this.a($$0, $$1);
            return true;
         } else {
            this.a($$1);
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean b(aub $$0) {
      eza $$1 = this.d($$0);
      if ($$1 == null) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }

   private void a(eza $$0) {
      this.v = !bdb.b($$0.b()) ? $$0.b() : "";
      this.y = $$0.a();
      this.e();
   }

   public void c(aub $$0) {
      eza $$1 = this.d($$0);
      if ($$1 != null) {
         this.a($$0, $$1);
      }
   }

   @Nullable
   private eza d(aub $$0) {
      return this.u == null ? null : $$0.s().b(this.u).orElse(null);
   }

   private void a(aub $$0, eza $$1) {
      this.a($$1);
      eyw $$2 = new eyw().a(this.z).a(this.A).a(this.C).b(this.D);
      if (this.H < 1.0F) {
         $$2.b().a(new eyd(bcb.a(this.H, 0.0F, 1.0F))).a(b(this.I));
      }

      jb $$3 = this.aA_().a((kg)this.x);
      $$1.a($$0, $$3, $$3, $$2, b(this.I), 2 | (this.D ? 816 : 0));
   }

   public void E() {
      if (this.u != null) {
         aub $$0 = (aub)this.n;
         ezb $$1 = $$0.s();
         $$1.d(this.u);
      }
   }

   public boolean F() {
      if (this.B == efl.b && !this.n.C && this.u != null) {
         aub $$0 = (aub)this.n;
         ezb $$1 = $$0.s();

         try {
            return $$1.b(this.u).isPresent();
         } catch (ab var4) {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean G() {
      return this.E;
   }

   public void d(boolean $$0) {
      this.E = $$0;
   }

   public boolean H() {
      return this.F;
   }

   public void e(boolean $$0) {
      this.F = $$0;
   }

   public boolean I() {
      return this.G;
   }

   public void f(boolean $$0) {
      this.G = $$0;
   }

   @Override
   public ebc.a b() {
      if (this.B != efl.a && this.B != efl.b) {
         return ebc.a.a;
      } else if (this.B == efl.a && this.F) {
         return ebc.a.c;
      } else {
         return this.B != efl.a && !this.G ? ebc.a.a : ebc.a.b;
      }
   }

   @Override
   public ebc.b c() {
      jb $$0 = this.j();
      kg $$1 = this.k();
      int $$2 = $$0.u();
      int $$3 = $$0.w();
      int $$4 = $$0.v();
      int $$5 = $$4 + $$1.v();
      int $$6;
      int $$7;
      switch (this.z) {
         case b:
            $$6 = $$1.u();
            $$7 = -$$1.w();
            break;
         case c:
            $$6 = -$$1.u();
            $$7 = $$1.w();
            break;
         default:
            $$6 = $$1.u();
            $$7 = $$1.w();
      }

      int $$24;
      int $$25;
      int $$26;
      int $$27;
      switch (this.A) {
         case b:
            $$24 = $$7 < 0 ? $$2 : $$2 + 1;
            $$25 = $$6 < 0 ? $$3 + 1 : $$3;
            $$26 = $$24 - $$7;
            $$27 = $$25 + $$6;
            break;
         case c:
            $$24 = $$6 < 0 ? $$2 : $$2 + 1;
            $$25 = $$7 < 0 ? $$3 : $$3 + 1;
            $$26 = $$24 - $$6;
            $$27 = $$25 - $$7;
            break;
         case d:
            $$24 = $$7 < 0 ? $$2 + 1 : $$2;
            $$25 = $$6 < 0 ? $$3 : $$3 + 1;
            $$26 = $$24 + $$7;
            $$27 = $$25 - $$6;
            break;
         default:
            $$24 = $$6 < 0 ? $$2 + 1 : $$2;
            $$25 = $$7 < 0 ? $$3 + 1 : $$3;
            $$26 = $$24 + $$6;
            $$27 = $$25 + $$7;
      }

      return ebc.b.a($$24, $$4, $$25, $$26, $$5, $$27);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
