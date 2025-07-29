import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class cpg extends cmd {
   private static final int cq = 1700;
   private static final int cr = 6000;
   private static final int cs = 30;
   private static final int ct = 120;
   private static final int cu = 48000;
   private static final float cv = 0.4F;
   private static final bzp cw = bzp.b(bzv.bl.l(), bzv.bl.m() - 0.4F).b(0.81F);
   private static final alh<cpg.a> cx = all.a(cpg.class, alj.G);
   private static final alh<Integer> cy = all.a(cpg.class, alj.b);
   public final bzd ck = new bzd();
   public final bzd cl = new bzd();
   public final bzd cm = new bzd();
   public final bzd co = new bzd();
   public final bzd cp = new bzd();

   public static cbr.a m() {
      return cmd.gM().a(cbs.w, 0.1F).a(cbs.t, 14.0);
   }

   public cpg(bzv<? extends cmd> $$0, dmu $$1) {
      super($$0, $$1);
      this.S().a(true);
      this.a(fbc.j, -1.0F);
      this.a(fbc.g, -1.0F);
      this.a(fbc.y, -1.0F);
   }

   @Override
   protected void a(all.a $$0) {
      super.a($$0);
      $$0.a(cx, cpg.a.a);
      $$0.a(cy, 0);
   }

   @Override
   public void L() {
      super.L();
      if (this.cb() || this.bm()) {
         this.a(fbc.j, 0.0F);
      }
   }

   @Override
   public void N() {
      this.a(fbc.j, -1.0F);
   }

   @Override
   public bzp e(cay $$0) {
      return this.gU() == cpg.a.f ? cw.a(this.ep()) : super.e($$0);
   }

   public boolean n() {
      return this.gU() == cpg.a.e;
   }

   public boolean t() {
      return this.bO.c(cjo.S).orElse(false);
   }

   public boolean gH() {
      return !this.t() && !this.gE() && !this.bm() && !this.gR() && this.aK() && !this.cc() && !this.R_();
   }

   public boolean gI() {
      return this.gU() == cpg.a.f || this.gU() == cpg.a.e;
   }

   private jb gL() {
      fis $$0 = this.gT();
      return jb.a($$0.a(), this.dE() + 0.2F, $$0.c());
   }

   private fis gT() {
      return this.dv().e(this.bY().c(2.25));
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   public fis[] E() {
      return cak.a(this, -0.01, 0.63, 0.38, 1.15);
   }

   private cpg.a gU() {
      return this.ay.a(cx);
   }

   private cpg b(cpg.a $$0) {
      this.ay.a(cx, $$0);
      return this;
   }

   @Override
   public void a(alh<?> $$0) {
      if (cx.equals($$0)) {
         cpg.a $$1 = this.gU();
         this.gV();
         switch ($$1) {
            case b:
               this.ck.b(this.as);
               break;
            case c:
               this.cl.b(this.as);
               break;
            case d:
               this.cm.b(this.as);
            case e:
            default:
               break;
            case f:
               this.co.b(this.as);
               break;
            case g:
               this.cp.b(this.as);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gV() {
      this.co.a();
      this.cm.a();
      this.cp.a();
      this.ck.a();
      this.cl.a();
   }

   public cpg a(cpg.a $$0) {
      switch ($$0) {
         case a:
            this.b(cpg.a.a);
            break;
         case b:
            this.a(ayz.zZ, 1.0F, 1.0F);
            this.b(cpg.a.b);
            break;
         case c:
            this.b(cpg.a.c).gW();
            break;
         case d:
            this.a(ayz.zV, 1.0F, 1.0F);
            this.b(cpg.a.d);
            break;
         case e:
            this.b(cpg.a.e);
            break;
         case f:
            this.b(cpg.a.f).gX();
            break;
         case g:
            this.a(ayz.zY, 1.0F, 1.0F);
            this.b(cpg.a.g);
      }

      return this;
   }

   private cpg gW() {
      this.a(ayz.zU, 1.0F, this.g_() ? 1.3F : 1.0F);
      return this;
   }

   private cpg gX() {
      this.ay.a(cy, this.as + 120);
      this.ai().a(this, (byte)63);
      return this;
   }

   public cpg x(boolean $$0) {
      if ($$0) {
         this.i(this.aU());
      }

      return this;
   }

   Optional<jb> gJ() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> clj.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(jb::a)
         .filter($$0 -> this.ai().F_().a($$0))
         .map(jb::e)
         .filter(this::h)
         .findFirst();
   }

   boolean gK() {
      return !this.gE() && !this.t() && !this.g_() && !this.bm() && this.aK() && !this.cc() && this.h(this.gL().e());
   }

   private boolean h(jb $$0) {
      return this.ai().a_($$0).a(azo.cz)
         && this.gZ().noneMatch($$1 -> jk.a(this.ai().aj(), $$0).equals($$1))
         && Optional.ofNullable(this.S().a($$0, 1)).map(faz::j).orElse(false);
   }

   private void gY() {
      if (this.ai() instanceof aub $$0 && this.ay.a(cy) == this.as) {
         jb $$2 = this.gL();
         this.a($$0, fdf.aG, ($$1x, $$2x) -> {
            cqz $$3 = new cqz(this.ai(), $$2.u(), $$2.v(), $$2.w(), $$2x);
            $$3.i();
            $$1x.b($$3);
         });
         this.a(ayz.zT, 1.0F, 1.0F);
      }
   }

   private cpg a(bzd $$0) {
      boolean $$1 = $$0.a((float)this.as) > 1700L && $$0.a((float)this.as) < 6000L;
      if ($$1) {
         jb $$2 = this.gL();
         eeb $$3 = this.ai().a_($$2.e());
         if ($$3.o() != dwn.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               fis $$5 = fis.b($$2).b(0.0, -0.65F, 0.0);
               this.ai().a(new lw(me.b, $$3), $$5.d, $$5.e, $$5.f, 0.0, 0.0, 0.0);
            }

            if (this.as % 10 == 0) {
               this.ai().a(this.dC(), this.dE(), this.dI(), $$3.A().f(), this.do(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.as % 10 == 0) {
         this.ai().a(ejb.u, this.gL(), ejb.a.a(this));
      }

      return this;
   }

   private cpg i(jb $$0) {
      List<jk> $$1 = this.gZ().limit(20L).collect(Collectors.toList());
      $$1.add(0, jk.a(this.ai().aj(), $$0));
      this.eh().a(cjo.aR, $$1);
      return this;
   }

   private Stream<jk> gZ() {
      return this.eh().c(cjo.aR).stream().flatMap(Collection::stream);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.ce.c();
      if ($$0 > 0.0) {
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fis(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(aub $$0, cmd $$1) {
      dcv $$2 = new dcv(dcz.kU);
      cqz $$3 = new cqz($$0, this.dv().a(), this.dv().b(), this.dv().c(), $$2);
      $$3.i();
      this.a($$0, $$1, null);
      this.a(ayz.Aa, 1.0F, (this.ar.i() - this.ar.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(byb $$0) {
      this.a(cpg.a.a);
      super.a($$0);
   }

   @Override
   public void g() {
      switch (this.gU()) {
         case e:
            this.ha();
            break;
         case f:
            this.a(this.co).gY();
      }

      super.g();
   }

   @Override
   public bxj b(cut $$0, bxi $$1) {
      dcv $$2 = $$0.b($$1);
      boolean $$3 = this.i($$2);
      bxj $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.gN();
      }

      return $$4;
   }

   @Override
   protected void gN() {
      this.ai().a(null, this, ayz.zP, aza.g, 1.0F, bcb.b(this.ai().A, 0.8F, 1.2F));
   }

   private void ha() {
      if (this.ai().B_() && this.as % 20 == 0) {
         this.ai().a(this.dC(), this.dE(), this.dI(), ayz.zW, this.do(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(jb $$0, eeb $$1) {
      this.a(ayz.zO, 0.15F, 1.0F);
   }

   @Override
   protected ayy p() {
      return Set.of(cpg.a.f, cpg.a.e).contains(this.gU()) ? null : ayz.zQ;
   }

   @Override
   protected ayy e(byb $$0) {
      return ayz.zR;
   }

   @Override
   protected ayy f_() {
      return ayz.zS;
   }

   @Override
   public int gh() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bzc a(aub $$0, bzc $$1) {
      return bzv.bl.a($$0, bzu.e);
   }

   @Override
   public boolean a(cmd $$0) {
      if (!($$0 instanceof cpg $$1)) {
         return false;
      } else {
         Set<cpg.a> $$2 = Set.of(cpg.a.a, cpg.a.c, cpg.a.b);
         return $$2.contains(this.gU()) && $$2.contains($$1.gU()) && super.a($$0);
      }
   }

   @Override
   public boolean i(dcv $$0) {
      return $$0.a(azx.at);
   }

   @Override
   protected cbm<?> a(Dynamic<?> $$0) {
      return cph.a(this.ei().a($$0));
   }

   @Override
   public cbm<cpg> eh() {
      return (cbm<cpg>)super.eh();
   }

   @Override
   protected cbm.b<cpg> ei() {
      return cbm.a(cph.b, cph.a);
   }

   @Override
   protected void a(aub $$0) {
      btt $$1 = bts.a();
      $$1.a("snifferBrain");
      this.eh().a($$0, this);
      $$1.b("snifferActivityUpdate");
      cph.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void ah() {
      super.ah();
      ahj.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cpg.a> h = baq.a(cpg.a::a, values(), baq.a.a);
      public static final zm<ByteBuf, cpg.a> i = zk.a(h, cpg.a::a);
      private final int j;

      private a(final int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
