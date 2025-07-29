import java.util.UUID;
import javax.annotation.Nullable;

public class csq extends cso implements car {
   private static final bzp f = bzv.bT.n().a(0.5F).b(0.97F);
   private static final ame ck = ame.b("attacking");
   private static final cbq cl = new cbq(ck, 0.05, cbq.a.a);
   private static final bwu cm = bdg.a(0, 1);
   private int cn;
   private static final bwu co = bdg.a(20, 39);
   private int cp;
   @Nullable
   private UUID cq;
   private static final int cr = 10;
   private static final bwu cs = bdg.a(4, 6);
   private int ct;

   public csq(bzv<? extends csq> $$0, dmu $$1) {
      super($$0, $$1);
      this.a(fbc.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cq = $$0;
   }

   @Override
   protected void m() {
      this.ch.a(2, new cix(this, 1.0, false));
      this.ch.a(7, new civ(this, 1.0));
      this.ci.a(1, new cja(this).a());
      this.ci.a(2, new cjb<>(this, cut.class, 10, true, false, this::a));
      this.ci.a(3, new cjh<>(this, true));
   }

   public static cbr.a gQ() {
      return cso.gK().a(cbs.B, 0.0).a(cbs.w, 0.23F).a(cbs.c, 5.0);
   }

   @Override
   public bzp e(cay $$0) {
      return this.g_() ? f : super.e($$0);
   }

   @Override
   protected boolean gI() {
      return false;
   }

   @Override
   protected void a(aub $$0) {
      cbo $$1 = this.h(cbs.w);
      if (this.ad_()) {
         if (!this.g_() && !$$1.b(ck)) {
            $$1.b(cl);
         }

         this.gR();
      } else if ($$1.b(ck)) {
         $$1.c(ck);
      }

      this.a($$0, true);
      if (this.e() != null) {
         this.gS();
      }

      super.a($$0);
   }

   private void gR() {
      if (this.cn > 0) {
         this.cn--;
         if (this.cn == 0) {
            this.gU();
         }
      }
   }

   private void gS() {
      if (this.ct > 0) {
         this.ct--;
      } else {
         if (this.T().a(this.e())) {
            this.gT();
         }

         this.ct = cs.a(this.ar);
      }
   }

   private void gT() {
      double $$0 = this.i(cbs.n);
      fin $$1 = fin.a(this.dv()).c($$0, 10.0, $$0);
      this.ai()
         .a(csq.class, $$1, bzt.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.e() == null)
         .filter($$0x -> !$$0x.t(this.e()))
         .forEach($$0x -> $$0x.g(this.e()));
   }

   private void gU() {
      this.a(ayz.Fd, this.fk() * 2.0F, this.fl() * 1.8F);
   }

   @Override
   public void g(@Nullable cam $$0) {
      if (this.e() == null && $$0 != null) {
         this.cn = cm.a(this.ar);
         this.ct = cs.a(this.ar);
      }

      super.g($$0);
   }

   @Override
   public void c() {
      this.a(co.a(this.ar));
   }

   public static boolean b(bzv<csq> $$0, dmv $$1, bzu $$2, jb $$3, bck $$4) {
      return $$1.an() != bxg.a && !$$1.a_($$3.e()).a(dqb.lq);
   }

   @Override
   public boolean a(dmx $$0) {
      return $$0.f(this) && !$$0.d(this.cV());
   }

   @Override
   protected void a(fdc $$0) {
      super.a($$0);
      this.a_($$0);
   }

   @Override
   protected void a(fda $$0) {
      super.a($$0);
      this.a(this.ai(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cp = $$0;
   }

   @Override
   public int a() {
      return this.cp;
   }

   @Override
   protected ayy p() {
      return this.ad_() ? ayz.Fd : ayz.Fc;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.Ff;
   }

   @Override
   protected ayy f_() {
      return ayz.Fe;
   }

   @Override
   protected void a(bck $$0, bxh $$1) {
      this.a(bzw.a, new dcv(dcz.qb));
   }

   @Override
   protected dcv gH() {
      return dcv.l;
   }

   @Override
   protected void gP() {
      this.h(cbs.B).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cq;
   }

   @Override
   public boolean a(aub $$0, cut $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(aub $$0, dcv $$1) {
      return this.g($$1);
   }
}
