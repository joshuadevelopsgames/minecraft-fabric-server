import java.util.List;

public record dej(bae<dpz> g, int h, float i, float j, int k, bae<dcr> l) {
   public static final dej a = new dej(azo.bS, 59, 2.0F, 0.0F, 15, azx.bi);
   public static final dej b = new dej(azo.bQ, 131, 4.0F, 1.0F, 5, azx.bj);
   public static final dej c = new dej(azo.bP, 250, 6.0F, 2.0F, 14, azx.bk);
   public static final dej d = new dej(azo.bO, 1561, 8.0F, 3.0F, 10, azx.bm);
   public static final dej e = new dej(azo.bR, 32, 12.0F, 0.0F, 22, azx.bl);
   public static final dej f = new dej(azo.bN, 2031, 9.0F, 4.0F, 15, azx.bn);

   private dcr.a a(dcr.a $$0) {
      return $$0.b(this.h).a(this.l).c(this.k);
   }

   public dcr.a a(dcr.a $$0, bae<dpz> $$1, float $$2, float $$3, float $$4) {
      jm<dpz> $$5 = mm.a(mm.e);
      return this.a($$0)
         .a(kq.A, new dfy(List.of(dfy.a.a($$5.b(this.g)), dfy.a.a($$5.b($$1), this.i)), 1.0F, 1, true))
         .a(this.a($$2, $$3))
         .a(kq.B, new dgd(2, $$4));
   }

   private dfm a(float $$0, float $$1) {
      return dfm.a().a(cbs.c, new cbq(dcr.h, $$0 + this.j, cbq.a.a), bzx.b).a(cbs.e, new cbq(dcr.i, $$1, cbq.a.a), bzx.b).a();
   }

   public dcr.a a(dcr.a $$0, float $$1, float $$2) {
      jm<dpz> $$3 = mm.a(mm.e);
      return this.a($$0)
         .a(kq.A, new dfy(List.of(dfy.a.a(jp.a(dqb.bz.p()), 15.0F), dfy.a.b($$3.b(azo.bJ), Float.MAX_VALUE), dfy.a.b($$3.b(azo.bI), 1.5F)), 1.0F, 2, false))
         .a(this.b($$1, $$2))
         .a(kq.B, new dgd(1));
   }

   private dfm b(float $$0, float $$1) {
      return dfm.a().a(cbs.c, new cbq(dcr.h, $$0 + this.j, cbq.a.a), bzx.b).a(cbs.e, new cbq(dcr.i, $$1, cbq.a.a), bzx.b).a();
   }

   public bae<dpz> a() {
      return this.g;
   }

   public int b() {
      return this.h;
   }

   public float c() {
      return this.i;
   }

   public float d() {
      return this.j;
   }

   public int e() {
      return this.k;
   }

   public bae<dcr> f() {
      return this.l;
   }
}
