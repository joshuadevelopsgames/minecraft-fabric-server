import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class cno extends cau implements cud, ejk {
   private static final kg e = new kg(1, 1, 1);
   private static final int ck = 5;
   private static final float cl = 55.0F;
   private static final float cm = 15.0F;
   private static final int cn = 0;
   private static final int co = 6000;
   private static final int cp = 3;
   public static final int a = 1024;
   private static final alh<Boolean> cq = all.a(cno.class, alj.k);
   private static final alh<Boolean> cr = all.a(cno.class, alj.k);
   protected static final ImmutableList<ckw<? extends ckv<? super cno>>> b = ImmutableList.of(ckw.c, ckw.d, ckw.f, ckw.b);
   protected static final ImmutableList<cjo<?>> c = ImmutableList.of(
      cjo.u, cjo.o, cjo.h, cjo.n, cjo.F, cjo.y, cjo.M, cjo.aN, cjo.aO, cjo.aP, cjo.aQ, cjo.aa, new cjo[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final eiy<ejk.b> cs;
   private ejk.a ct;
   private final ejk.d cu;
   private final eiy<cno.a> cv;
   private final bxr cw = new bxr(1);
   @Nullable
   private jb cx;
   private long cy = 0L;
   private float cz;
   private float cA;
   private float cB;
   private float cC;
   private float cD;

   public cno(bzv<? extends cno> $$0, dmu $$1) {
      super($$0, $$1);
      this.ce = new cgi(this, 20, true);
      this.a_(this.fU());
      this.cu = new cno.b();
      this.ct = new ejk.a();
      this.cs = new eiy<>(new ejk.b(this));
      this.cv = new eiy<>(new cno.a(this.cu.b(), ejb.E.a().a()));
   }

   @Override
   protected cbm.b<cno> ei() {
      return cbm.a(c, b);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cnp.a(this.ei().a($$0));
   }

   @Override
   public cbm<cno> eh() {
      return (cbm<cno>)super.eh();
   }

   public static cbr.a l() {
      return cao.I().a(cbs.t, 20.0).a(cbs.m, 0.1F).a(cbs.w, 0.1F).a(cbs.c, 2.0);
   }

   @Override
   protected cjw b(dmu $$0) {
      cju $$1 = new cju(this, $$0);
      $$1.d(false);
      $$1.a(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cq, false);
      $$0.a(cr, true);
   }

   @Override
   public void k(fis $$0) {
      this.a($$0, this.fu());
   }

   @Override
   public boolean a(aub $$0, byb $$1, float $$2) {
      return this.G($$1.d()) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean u(bzm $$0) {
      return this.G($$0) || super.u($$0);
   }

   private boolean G(@Nullable bzm $$0) {
      if (!($$0 instanceof cut $$1)) {
         return false;
      } else {
         Optional<UUID> $$2 = this.eh().c(cjo.aN);
         return $$2.isPresent() && $$1.cK().equals($$2.get());
      }
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, eeb $$2, jb $$3) {
   }

   @Override
   protected ayy p() {
      return this.d(bzw.a) ? ayz.a : ayz.b;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.d;
   }

   @Override
   protected ayy f_() {
      return ayz.c;
   }

   @Override
   protected float fk() {
      return 0.4F;
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("allayBrain");
      this.eh().a($$0, this);
      $$1.c();
      $$1.a("allayActivityUpdate");
      cnp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void e_() {
      super.e_();
      if (!this.ai().C && this.bO() && this.as % 10 == 0) {
         this.d(1.0F);
      }

      if (this.t() && this.gL() && this.as % 20 == 0) {
         this.x(false);
         this.cx = null;
      }

      this.gM();
   }

   @Override
   public void g() {
      super.g();
      if (this.ai().C) {
         this.cA = this.cz;
         if (this.m()) {
            this.cz = bcb.a(this.cz + 1.0F, 0.0F, 5.0F);
         } else {
            this.cz = bcb.a(this.cz - 1.0F, 0.0F, 5.0F);
         }

         if (this.t()) {
            this.cB++;
            this.cD = this.cC;
            if (this.gH()) {
               this.cC++;
            } else {
               this.cC--;
            }

            this.cC = bcb.a(this.cC, 0.0F, 15.0F);
         } else {
            this.cB = 0.0F;
            this.cC = 0.0F;
            this.cD = 0.0F;
         }
      } else {
         ejk.c.a(this.ai(), this.ct, this.cu);
         if (this.gE()) {
            this.x(false);
         }
      }
   }

   @Override
   public boolean fU() {
      return !this.gK() && this.m();
   }

   public boolean m() {
      return !this.b(bxi.a).f();
   }

   @Override
   protected boolean f(bzw $$0) {
      return false;
   }

   private boolean gK() {
      return this.eh().a(cjo.aQ, cjp.a);
   }

   @Override
   protected bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      dcv $$3 = this.b(bxi.a);
      if (this.t() && $$2.a(azx.ap) && this.gP()) {
         this.gN();
         this.ai().a(this, (byte)18);
         this.ai().a($$0, this, ayz.E, aza.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return bxj.a;
      } else if ($$3.f() && !$$2.f()) {
         dcv $$4 = $$2.c(1);
         this.a(bxi.a, $$4);
         this.a($$0, $$2);
         this.ai().a($$0, this, ayz.e, aza.g, 2.0F, 1.0F);
         this.eh().a(cjo.aN, $$0.cK());
         return bxj.a;
      } else if (!$$3.f() && $$1 == bxi.a && $$2.f()) {
         this.a(bzw.a, dcv.l);
         this.ai().a($$0, this, ayz.f, aza.g, 2.0F, 1.0F);
         this.a(bxi.a);

         for (dcv $$5 : this.n().f()) {
            ccf.a(this, $$5, this.dv());
         }

         this.eh().b(cjo.aN);
         $$0.h($$3);
         return bxj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(jb $$0, boolean $$1) {
      if ($$1) {
         if (!this.t()) {
            this.cx = $$0;
            this.x(true);
         }
      } else if ($$0.equals(this.cx) || this.cx == null) {
         this.cx = null;
         this.x(false);
      }
   }

   @Override
   public bxr n() {
      return this.cw;
   }

   @Override
   protected kg ac() {
      return e;
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      dcv $$2 = this.b(bxi.a);
      return !$$2.f() && $$0.P().c(dmq.d) && this.cw.c($$1) && this.c($$2, $$1);
   }

   private boolean c(dcv $$0, dcv $$1) {
      return dcv.b($$0, $$1) && !this.d($$0, $$1);
   }

   private boolean d(dcv $$0, dcv $$1) {
      der $$2 = $$0.a(kq.R);
      der $$3 = $$1.a(kq.R);
      return !Objects.equals($$2, $$3);
   }

   @Override
   protected void a(aub $$0, cqz $$1) {
      cud.a($$0, this, this, $$1);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   @Override
   public boolean bd() {
      return !this.aK();
   }

   @Override
   public void a(BiConsumer<eiy<?>, aub> $$0) {
      if (this.ai() instanceof aub $$1) {
         $$0.accept(this.cs, $$1);
         $$0.accept(this.cv, $$1);
      }
   }

   public boolean t() {
      return this.ay.a(cq);
   }

   public void x(boolean $$0) {
      if (!this.ai().C && this.dl() && (!$$0 || !this.gE())) {
         this.ay.a(cq, $$0);
      }
   }

   private boolean gL() {
      return this.cx == null || !this.cx.a(this.dv(), ejb.E.a().a()) || !this.ai().a_(this.cx).a(dqb.ek);
   }

   public float J(float $$0) {
      return bcb.h($$0, this.cA, this.cz) / 5.0F;
   }

   public boolean gH() {
      float $$0 = this.cB % 55.0F;
      return $$0 < 15.0F;
   }

   public float K(float $$0) {
      return bcb.h($$0, this.cD, this.cC) / 15.0F;
   }

   @Override
   public boolean a(dcv $$0, dcv $$1) {
      return !this.c($$0, $$1);
   }

   @Override
   protected void f(aub $$0) {
      super.f($$0);
      this.cw.f().forEach($$1x -> this.a($$0, $$1x));
      dcv $$1 = this.a(bzw.a);
      if (!$$1.f() && !djk.a($$1, djj.D)) {
         this.a($$0, $$1);
         this.a(bzw.a, dcv.l);
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.b_($$0);
      $$0.a("listener", ejk.a.a, this.ct);
      $$0.a("DuplicationCooldown", this.cy);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a_($$0);
      this.ct = $$0.<ejk.a>a("listener", ejk.a.a).orElseGet(ejk.a::new);
      this.a($$0.a("DuplicationCooldown", 0));
   }

   @Override
   protected boolean gF() {
      return false;
   }

   private void gM() {
      if (!this.ai().B_() && this.cy > 0L) {
         this.a(this.cy - 1L);
      }
   }

   private void a(long $$0) {
      this.cy = $$0;
      this.ay.a(cr, $$0 == 0L);
   }

   private void gN() {
      cno $$0 = bzv.d.a(this.ai(), bzu.e);
      if ($$0 != null) {
         $$0.f(this.dv());
         $$0.gp();
         $$0.gO();
         this.gO();
         this.ai().b($$0);
      }
   }

   private void gO() {
      this.a(6000L);
   }

   private boolean gP() {
      return this.ay.a(cr);
   }

   private void a(cut $$0, dcv $$1) {
      $$1.a(1, $$0);
   }

   @Override
   public fis F() {
      return new fis(0.0, this.cW() * 0.6, this.ds() * 0.1);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 3; $$1++) {
            this.gQ();
         }
      } else {
         super.b($$0);
      }
   }

   private void gQ() {
      double $$0 = this.ar.k() * 0.02;
      double $$1 = this.ar.k() * 0.02;
      double $$2 = this.ar.k() * 0.02;
      this.ai().a(me.S, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   @Override
   public ejk.a gI() {
      return this.ct;
   }

   @Override
   public ejk.d gJ() {
      return this.cu;
   }

   class a implements ejd {
      private final ejf b;
      private final int c;

      public a(final ejf $$0, final int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public ejf a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(aub $$0, jl<ejb> $$1, ejb.a $$2, fis $$3) {
         if ($$1.a(ejb.E)) {
            cno.this.b(jb.a((jv)$$3), true);
            return true;
         } else if ($$1.a(ejb.F)) {
            cno.this.b(jb.a((jv)$$3), false);
            return true;
         } else {
            return false;
         }
      }
   }

   class b implements ejk.d {
      private static final int b = 16;
      private final ejf c = new eiz(cno.this, cno.this.cW());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ejf b() {
         return this.c;
      }

      @Override
      public boolean a(aub $$0, jb $$1, jl<ejb> $$2, ejb.a $$3) {
         if (cno.this.gw()) {
            return false;
         } else {
            Optional<jk> $$4 = cno.this.eh().c(cjo.aO);
            if ($$4.isEmpty()) {
               return true;
            } else {
               jk $$5 = $$4.get();
               return $$5.a($$0.aj(), cno.this.dx(), 1024) && $$5.b().equals($$1);
            }
         }
      }

      @Override
      public void a(aub $$0, jb $$1, jl<ejb> $$2, @Nullable bzm $$3, @Nullable bzm $$4, float $$5) {
         if ($$2.a(ejb.H)) {
            cnp.a(cno.this, new jb($$1));
         }
      }

      @Override
      public bae<ejb> c() {
         return azv.e;
      }
   }
}
