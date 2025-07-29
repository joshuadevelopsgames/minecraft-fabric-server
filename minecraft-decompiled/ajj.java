public class ajj implements zw<ahm> {
   public static final zm<wg, ajj> a = zw.a(ajj::a, ajj::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final jb f;
   private final ecs.a g;
   private final efl h;
   private final String i;
   private final jb j;
   private final kg k;
   private final dvd l;
   private final dwu m;
   private final String n;
   private final boolean o;
   private final boolean p;
   private final boolean q;
   private final boolean r;
   private final float s;
   private final long t;

   public ajj(
      jb $$0,
      ecs.a $$1,
      efl $$2,
      String $$3,
      jb $$4,
      kg $$5,
      dvd $$6,
      dwu $$7,
      String $$8,
      boolean $$9,
      boolean $$10,
      boolean $$11,
      boolean $$12,
      float $$13,
      long $$14
   ) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.m = $$7;
      this.n = $$8;
      this.o = $$9;
      this.p = $$10;
      this.q = $$11;
      this.r = $$12;
      this.s = $$13;
      this.t = $$14;
   }

   private ajj(wg $$0) {
      this.f = $$0.e();
      this.g = $$0.b(ecs.a.class);
      this.h = $$0.b(efl.class);
      this.i = $$0.p();
      int $$1 = 48;
      this.j = new jb(bcb.a($$0.readByte(), -48, 48), bcb.a($$0.readByte(), -48, 48), bcb.a($$0.readByte(), -48, 48));
      int $$2 = 48;
      this.k = new kg(bcb.a($$0.readByte(), 0, 48), bcb.a($$0.readByte(), 0, 48), bcb.a($$0.readByte(), 0, 48));
      this.l = $$0.b(dvd.class);
      this.m = $$0.b(dwu.class);
      this.n = $$0.d(128);
      this.s = bcb.a($$0.readFloat(), 0.0F, 1.0F);
      this.t = $$0.m();
      int $$3 = $$0.readByte();
      this.o = ($$3 & 1) != 0;
      this.p = ($$3 & 8) != 0;
      this.q = ($$3 & 2) != 0;
      this.r = ($$3 & 4) != 0;
   }

   private void a(wg $$0) {
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.l(this.j.u());
      $$0.l(this.j.v());
      $$0.l(this.j.w());
      $$0.l(this.k.u());
      $$0.l(this.k.v());
      $$0.l(this.k.w());
      $$0.a(this.l);
      $$0.a(this.m);
      $$0.a(this.n);
      $$0.a(this.s);
      $$0.a(this.t);
      int $$1 = 0;
      if (this.o) {
         $$1 |= 1;
      }

      if (this.q) {
         $$1 |= 2;
      }

      if (this.r) {
         $$1 |= 4;
      }

      if (this.p) {
         $$1 |= 8;
      }

      $$0.l($$1);
   }

   @Override
   public zy<ajj> a() {
      return ahk.cj;
   }

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public jb b() {
      return this.f;
   }

   public ecs.a e() {
      return this.g;
   }

   public efl f() {
      return this.h;
   }

   public String g() {
      return this.i;
   }

   public jb h() {
      return this.j;
   }

   public kg i() {
      return this.k;
   }

   public dvd j() {
      return this.l;
   }

   public dwu k() {
      return this.m;
   }

   public String l() {
      return this.n;
   }

   public boolean m() {
      return this.o;
   }

   public boolean n() {
      return this.p;
   }

   public boolean o() {
      return this.q;
   }

   public boolean p() {
      return this.r;
   }

   public float q() {
      return this.s;
   }

   public long r() {
      return this.t;
   }
}
