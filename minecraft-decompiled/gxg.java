import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class gxg {
   private final fue a;
   private final dmu b;
   private final gxh c;
   private final Map<jb, hvr> d = new HashMap<>();

   public gxg(fue $$0, dmu $$1, gxh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(int $$0, jb $$1, int $$2) {
      switch ($$0) {
         case 1023:
         case 1028:
         case 1038:
            ftm $$3 = this.a.j.l();
            if ($$3.j()) {
               fis $$4 = fis.b($$1).d($$3.d()).d();
               fis $$5 = $$3.d().e($$4.c(2.0));
               if ($$0 == 1023) {
                  this.b.a($$5.d, $$5.e, $$5.f, ayz.Ek, aza.f, 1.0F, 1.0F, false);
               } else if ($$0 == 1038) {
                  this.b.a($$5.d, $$5.e, $$5.f, ayz.jd, aza.f, 1.0F, 1.0F, false);
               } else {
                  this.b.a($$5.d, $$5.e, $$5.f, ayz.iI, aza.f, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void b(int $$0, jb $$1, int $$2) {
      bck $$3 = this.b.A;
      switch ($$0) {
         case 1000:
            this.b.a($$1, ayz.hq, aza.e, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.b.a($$1, ayz.hr, aza.e, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.b.a($$1, ayz.hs, aza.e, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.b.a($$1, ayz.jD, aza.g, 1.0F, 1.2F, false);
            break;
         case 1009:
            if ($$2 == 0) {
               this.b.a($$1, ayz.jH, aza.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);
            } else if ($$2 == 1) {
               this.b.a($$1, ayz.kS, aza.e, 0.7F, 1.6F + ($$3.i() - $$3.i()) * 0.4F, false);
            }
            break;
         case 1010:
            this.b.K_().f(mn.ba).c($$2).ifPresent($$1x -> this.a($$1x, $$1));
            break;
         case 1011:
            this.b($$1);
            break;
         case 1015:
            this.b.a($$1, ayz.lc, aza.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.b.a($$1, ayz.lb, aza.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.b.a($$1, ayz.iN, aza.f, 10.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.b.a($$1, ayz.ck, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.b.a($$1, ayz.ER, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.b.a($$1, ayz.ES, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.b.a($$1, ayz.ET, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.b.a($$1, ayz.Ec, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.b.a($$1, ayz.Ef, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.b.a($$1, ayz.bJ, aza.g, 0.05F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.b.a($$1, ayz.Fb, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.b.a($$1, ayz.Fi, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.b.a($$1, ayz.V, aza.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.b.a($$1, ayz.ab, aza.e, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.b.a($$1, ayz.Y, aza.e, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.a.al().a(hvm.b(ayz.vW, $$3.i() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.b.a($$1, ayz.fk, aza.e, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.b.a($$1, ayz.fj, aza.e, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.b.a($$1, ayz.cR, aza.e, 1.0F, 1.0F, false);
            break;
         case 1039:
            this.b.a($$1, ayz.uJ, aza.f, 0.3F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.b.a($$1, ayz.EU, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.b.a($$1, ayz.nY, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.b.a($$1, ayz.md, aza.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.b.a($$1, ayz.cy, aza.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.b.a($$1, ayz.zM, aza.e, 1.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1045:
            this.b.a($$1, ayz.id, aza.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1046:
            this.b.a($$1, ayz.ig, aza.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1047:
            this.b.a($$1, ayz.ih, aza.e, 2.0F, this.b.A.i() * 0.1F + 0.9F, false);
            break;
         case 1048:
            this.b.a($$1, ayz.yr, aza.f, 2.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, false);
            break;
         case 1049:
            this.b.a($$1, ayz.gk, aza.e, 1.0F, 1.0F, false);
            break;
         case 1050:
            this.b.a($$1, ayz.gl, aza.e, 1.0F, 1.0F, false);
            break;
         case 1051:
            this.b.a($$1, ayz.DU, aza.e, 0.5F, 0.4F / (this.b.H_().i() * 0.4F + 0.8F), false);
            break;
         case 1500:
            drl.a(this.b, $$1, $$2 > 0);
            break;
         case 1501:
            this.b.a($$1, ayz.oT, aza.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$60 = 0; $$60 < 8; $$60++) {
               this.b.a(me.aa, $$1.u() + $$3.j(), $$1.v() + 1.2, $$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 1502:
            this.b.a($$1, ayz.wI, aza.e, 0.5F, 2.6F + ($$3.i() - $$3.i()) * 0.8F, false);

            for (int $$61 = 0; $$61 < 5; $$61++) {
               double $$62 = $$1.u() + $$3.j() * 0.6 + 0.2;
               double $$63 = $$1.v() + $$3.j() * 0.6 + 0.2;
               double $$64 = $$1.w() + $$3.j() * 0.6 + 0.2;
               this.b.a(me.ah, $$62, $$63, $$64, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.b.a($$1, ayz.jc, aza.e, 1.0F, 1.0F, false);

            for (int $$65 = 0; $$65 < 16; $$65++) {
               double $$66 = $$1.u() + (5.0 + $$3.j() * 6.0) / 16.0;
               double $$67 = $$1.v() + 0.8125;
               double $$68 = $$1.w() + (5.0 + $$3.j() * 6.0) / 16.0;
               this.b.a(me.ah, $$66, $$67, $$68, 0.0, 0.0, 0.0);
            }
            break;
         case 1504:
            dvy.a(this.b, $$1, this.b.a_($$1));
            break;
         case 1505:
            dbf.a(this.b, $$1, $$2);
            this.b.a($$1, ayz.cx, aza.e, 1.0F, 1.0F, false);
            break;
         case 2000:
            this.a($$2, $$1, $$3, me.ah);
            break;
         case 2001:
            eeb $$23 = dpz.a($$2);
            if (!$$23.l()) {
               dxx $$24 = $$23.A();
               this.b.a($$1, $$24.c(), aza.e, ($$24.a() + 1.0F) / 2.0F, $$24.b() * 0.8F, false);
            }

            this.b.b($$1, $$23);
            break;
         case 2002:
         case 2007:
            fis $$9 = fis.c($$1);

            for (int $$10 = 0; $$10 < 8; $$10++) {
               this.c.a(new ma(me.U, new dcv(dcz.wR)), $$9.d, $$9.e, $$9.f, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            float $$11 = ($$2 >> 16 & 0xFF) / 255.0F;
            float $$12 = ($$2 >> 8 & 0xFF) / 255.0F;
            float $$13 = ($$2 >> 0 & 0xFF) / 255.0F;
            mc $$14 = $$0 == 2007 ? me.T : me.p;

            for (int $$15 = 0; $$15 < 100; $$15++) {
               double $$16 = $$3.j() * 4.0;
               double $$17 = $$3.j() * Math.PI * 2.0;
               double $$18 = Math.cos($$17) * $$16;
               double $$19 = 0.01 + $$3.j() * 0.5;
               double $$20 = Math.sin($$17) * $$16;
               gut $$21 = this.c.b($$14, $$14.a().b(), $$9.d + $$18 * 0.1, $$9.e + 0.3, $$9.f + $$20 * 0.1, $$18, $$19, $$20);
               if ($$21 != null) {
                  float $$22 = 0.75F + $$3.i() * 0.25F;
                  $$21.a($$11 * $$22, $$12 * $$22, $$13 * $$22);
                  $$21.c((float)$$16);
               }
            }

            this.b.a($$1, ayz.As, aza.g, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double $$4 = $$1.u() + 0.5;
            double $$5 = $$1.v();
            double $$6 = $$1.w() + 0.5;

            for (int $$7 = 0; $$7 < 8; $$7++) {
               this.c.a(new ma(me.U, new dcv(dcz.tR)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
            }

            for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += Math.PI / 20) {
               this.c.a(me.af, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
               this.c.a(me.af, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
            }
            break;
         case 2004:
            for (int $$27 = 0; $$27 < 20; $$27++) {
               double $$28 = $$1.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$29 = $$1.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
               double $$30 = $$1.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
               this.b.a(me.ah, $$28, $$29, $$30, 0.0, 0.0, 0.0);
               this.b.a(me.F, $$28, $$29, $$30, 0.0, 0.0, 0.0);
            }
            break;
         case 2006:
            for (int $$69 = 0; $$69 < 200; $$69++) {
               float $$70 = $$3.i() * 4.0F;
               float $$71 = $$3.i() * (float) (Math.PI * 2);
               double $$72 = bcb.b($$71) * $$70;
               double $$73 = 0.01 + $$3.j() * 0.5;
               double $$74 = bcb.a($$71) * $$70;
               gut $$75 = this.c.b(me.h, false, $$1.u() + $$72 * 0.1, $$1.v() + 0.3, $$1.w() + $$74 * 0.1, $$72, $$73, $$74);
               if ($$75 != null) {
                  $$75.c($$70);
               }
            }

            if ($$2 == 1) {
               this.b.a($$1, ayz.iJ, aza.f, 1.0F, $$3.i() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.b.a(me.w, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, 0.0, 0.0, 0.0);
            break;
         case 2009:
            for (int $$76 = 0; $$76 < 8; $$76++) {
               this.b.a(me.e, $$1.u() + $$3.j(), $$1.v() + 1.2, $$1.w() + $$3.j(), 0.0, 0.0, 0.0);
            }
            break;
         case 2010:
            this.a($$2, $$1, $$3, me.ai);
            break;
         case 2011:
            bcf.a(this.b, $$1, $$2, me.Q);
            break;
         case 2012:
            bcf.a(this.b, $$1, $$2, me.Q);
            break;
         case 2013:
            bcf.a(this.b, $$1, $$2);
            break;
         case 3000:
            this.b.a(me.v, true, true, $$1.u() + 0.5, $$1.v() + 0.5, $$1.w() + 0.5, 0.0, 0.0, 0.0);
            this.b.a($$1, ayz.jb, aza.e, 10.0F, (1.0F + (this.b.A.i() - this.b.A.i()) * 0.2F) * 0.7F, false);
            break;
         case 3001:
            this.b.a($$1, ayz.iL, aza.f, 64.0F, 0.8F + this.b.A.i() * 0.3F, false);
            break;
         case 3002:
            if ($$2 >= 0 && $$2 < jh.a.d.length) {
               bcf.a(jh.a.d[$$2], this.b, $$1, 0.125, me.aW, bwu.a(10, 19));
            } else {
               bcf.a(this.b, $$1, me.aW, bwu.a(3, 5));
            }
            break;
         case 3003:
            bcf.a(this.b, $$1, me.aU, bwu.a(3, 5));
            this.b.a($$1, ayz.nz, aza.e, 1.0F, 1.0F, false);
            break;
         case 3004:
            bcf.a(this.b, $$1, me.aV, bwu.a(3, 5));
            break;
         case 3005:
            bcf.a(this.b, $$1, me.aX, bwu.a(3, 5));
            break;
         case 3006:
            int $$36 = $$2 >> 6;
            if ($$36 > 0) {
               if ($$3.i() < 0.3F + $$36 * 0.1F) {
                  float $$37 = 0.15F + 0.02F * $$36 * $$36 * $$3.i();
                  float $$38 = 0.4F + 0.3F * $$36 * $$3.i();
                  this.b.a($$1, ayz.xi, aza.e, $$37, $$38, false);
               }

               byte $$39 = (byte)($$2 & 63);
               bwo $$40 = bwu.a(0, $$36);
               float $$41 = 0.005F;
               Supplier<fis> $$42 = () -> new fis(bcb.a($$3, -0.005F, 0.005F), bcb.a($$3, -0.005F, 0.005F), bcb.a($$3, -0.005F, 0.005F));
               if ($$39 == 0) {
                  for (jh $$43 : jh.values()) {
                     float $$44 = $$43 == jh.a ? (float) Math.PI : 0.0F;
                     double $$45 = $$43.o() == jh.a.b ? 0.65 : 0.57;
                     bcf.a(this.b, $$1, new mg($$44), $$40, $$43, $$42, $$45);
                  }
               } else {
                  for (jh $$46 : dvg.a($$39)) {
                     float $$47 = $$46 == jh.b ? (float) Math.PI : 0.0F;
                     double $$48 = 0.35;
                     bcf.a(this.b, $$1, new mg($$47), $$40, $$46, $$42, 0.35);
                  }
               }
            } else {
               this.b.a($$1, ayz.xi, aza.e, 1.0F, 1.0F, false);
               boolean $$49 = this.b.a_($$1).m(this.b, $$1);
               int $$50 = $$49 ? 40 : 20;
               float $$51 = $$49 ? 0.45F : 0.25F;
               float $$52 = 0.07F;

               for (int $$53 = 0; $$53 < $$50; $$53++) {
                  float $$54 = 2.0F * $$3.i() - 1.0F;
                  float $$55 = 2.0F * $$3.i() - 1.0F;
                  float $$56 = 2.0F * $$3.i() - 1.0F;
                  this.b
                     .a(me.M, $$1.u() + 0.5 + $$54 * $$51, $$1.v() + 0.5 + $$55 * $$51, $$1.w() + 0.5 + $$56 * $$51, $$54 * 0.07F, $$55 * 0.07F, $$56 * 0.07F);
               }
            }
            break;
         case 3007:
            for (int $$57 = 0; $$57 < 10; $$57++) {
               this.b.a(new mh($$57 * 5), $$1.u() + 0.5, $$1.v() + dxc.e, $$1.w() + 0.5, 0.0, 0.0, 0.0);
            }

            eeb $$58 = this.b.a_($$1);
            boolean $$59 = $$58.b(eer.I) && $$58.c(eer.I);
            if (!$$59) {
               this.b.a($$1.u() + 0.5, $$1.v() + dxc.e, $$1.w() + 0.5, ayz.xF, aza.e, 2.0F, 0.6F + this.b.A.i() * 0.4F, false);
            }
            break;
         case 3008:
            eeb $$25 = dpz.a($$2);
            if ($$25.b() instanceof dqf $$26) {
               this.b.a($$1, $$26.d(), aza.h, 1.0F, 1.0F, false);
            }

            this.b.b($$1, $$25);
            break;
         case 3009:
            bcf.a(this.b, $$1, me.aZ, bwu.a(3, 6));
            break;
         case 3011:
            edc.a(this.b, $$1, $$3, edc.a.a($$2).c);
            break;
         case 3012:
            this.b.a($$1, ayz.mV, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.a(this.b, $$1, $$3, edc.a.a($$2).c);
            break;
         case 3013:
            this.b.a($$1, ayz.mZ, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.a(this.b, $$1, $$3, $$2, me.bb);
            break;
         case 3014:
            this.b.a($$1, ayz.nf, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.b(this.b, $$1, $$3);
            break;
         case 3015:
            if (this.b.c_($$1) instanceof edi $$31) {
               edi.a.a(this.b, $$31.aA_(), $$31.m(), $$31.c(), $$2 == 0 ? me.aM : me.N);
               this.b.a($$1, ayz.Cd, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            }
            break;
         case 3016:
            edi.a.a(this.b, $$1, $$2 == 0 ? me.aM : me.N);
            this.b.a($$1, ayz.Ch, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3017:
            edc.b(this.b, $$1, $$3);
            break;
         case 3018:
            for (int $$32 = 0; $$32 < 10; $$32++) {
               double $$33 = $$3.k() * 0.02;
               double $$34 = $$3.k() * 0.02;
               double $$35 = $$3.k() * 0.02;
               this.b.a(me.ae, $$1.u() + $$3.j(), $$1.v() + $$3.j(), $$1.w() + $$3.j(), $$33, $$34, $$35);
            }

            this.b.a($$1, ayz.fo, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            break;
         case 3019:
            this.b.a($$1, ayz.mZ, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.a(this.b, $$1, $$3, $$2, me.bc);
            break;
         case 3020:
            this.b.a($$1, ayz.na, aza.e, $$2 == 0 ? 0.3F : 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.a(this.b, $$1, $$3, 0, me.bc);
            edc.a(this.b, $$1, $$3);
            break;
         case 3021:
            this.b.a($$1, ayz.mX, aza.e, 1.0F, ($$3.i() - $$3.i()) * 0.2F + 1.0F, true);
            edc.a(this.b, $$1, $$3, edc.a.a($$2).c);
      }
   }

   private void a(int $$0, jb $$1, bck $$2, mi $$3) {
      jh $$4 = jh.a($$0);
      int $$5 = $$4.j();
      int $$6 = $$4.k();
      int $$7 = $$4.l();

      for (int $$8 = 0; $$8 < 10; $$8++) {
         double $$9 = $$2.j() * 0.2 + 0.01;
         double $$10 = $$1.u() + $$5 * 0.6 + 0.5 + $$5 * 0.01 + ($$2.j() - 0.5) * $$7 * 0.5;
         double $$11 = $$1.v() + $$6 * 0.6 + 0.5 + $$6 * 0.01 + ($$2.j() - 0.5) * $$6 * 0.5;
         double $$12 = $$1.w() + $$7 * 0.6 + 0.5 + $$7 * 0.01 + ($$2.j() - 0.5) * $$5 * 0.5;
         double $$13 = $$5 * $$9 + $$2.k() * 0.01;
         double $$14 = $$6 * $$9 + $$2.k() * 0.01;
         double $$15 = $$7 * $$9 + $$2.k() * 0.01;
         this.c.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
      }
   }

   private void a(jl<ddb> $$0, jb $$1) {
      this.a($$1);
      ddb $$2 = $$0.a();
      ayy $$3 = $$2.b().a();
      hvr $$4 = hvm.a($$3, fis.b($$1));
      this.d.put($$1, $$4);
      this.a.al().a($$4);
      this.a.m.a($$2.c());
      this.a(this.b, $$1, true);
   }

   private void a(jb $$0) {
      hvr $$1 = this.d.remove($$0);
      if ($$1 != null) {
         this.a.al().b($$1);
      }
   }

   private void b(jb $$0) {
      this.a($$0);
      this.a(this.b, $$0, false);
   }

   private void a(dmu $$0, jb $$1, boolean $$2) {
      for (cam $$4 : $$0.a(cam.class, new fin($$1).g(3.0))) {
         $$4.a($$1, $$2);
      }
   }
}
