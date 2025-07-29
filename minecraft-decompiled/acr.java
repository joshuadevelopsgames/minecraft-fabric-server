import java.util.UUID;

public class acr implements zw<acq> {
   public static final zm<wx, acr> a = zw.a(acr::a, acr::new);
   private static final double b = 8000.0;
   private static final double c = 3.9;
   private final int d;
   private final UUID e;
   private final bzv<?> f;
   private final double g;
   private final double h;
   private final double i;
   private final int j;
   private final int k;
   private final int l;
   private final byte m;
   private final byte n;
   private final byte o;
   private final int p;

   public acr(bzm $$0, atz $$1) {
      this($$0, $$1, 0);
   }

   public acr(bzm $$0, atz $$1, int $$2) {
      this($$0.ar(), $$0.cK(), $$1.b().a(), $$1.b().b(), $$1.b().c(), $$1.d(), $$1.e(), $$0.ap(), $$2, $$1.c(), $$1.f());
   }

   public acr(bzm $$0, int $$1, jb $$2) {
      this($$0.ar(), $$0.cK(), $$2.u(), $$2.v(), $$2.w(), $$0.dR(), $$0.dP(), $$0.ap(), $$1, $$0.dA(), $$0.cE());
   }

   public acr(int $$0, UUID $$1, double $$2, double $$3, double $$4, float $$5, float $$6, bzv<?> $$7, int $$8, fis $$9, double $$10) {
      this.d = $$0;
      this.e = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.m = bcb.g($$5);
      this.n = bcb.g($$6);
      this.o = bcb.g((float)$$10);
      this.f = $$7;
      this.p = $$8;
      this.j = (int)(bcb.a($$9.d, -3.9, 3.9) * 8000.0);
      this.k = (int)(bcb.a($$9.e, -3.9, 3.9) * 8000.0);
      this.l = (int)(bcb.a($$9.f, -3.9, 3.9) * 8000.0);
   }

   private acr(wx $$0) {
      this.d = $$0.l();
      this.e = $$0.n();
      this.f = zk.a(mn.D).decode($$0);
      this.g = $$0.readDouble();
      this.h = $$0.readDouble();
      this.i = $$0.readDouble();
      this.m = $$0.readByte();
      this.n = $$0.readByte();
      this.o = $$0.readByte();
      this.p = $$0.l();
      this.j = $$0.readShort();
      this.k = $$0.readShort();
      this.l = $$0.readShort();
   }

   private void a(wx $$0) {
      $$0.c(this.d);
      $$0.a(this.e);
      zk.a(mn.D).encode($$0, this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.l(this.m);
      $$0.l(this.n);
      $$0.l(this.o);
      $$0.c(this.p);
      $$0.m(this.j);
      $$0.m(this.k);
      $$0.m(this.l);
   }

   @Override
   public zy<acr> a() {
      return ahk.c;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public UUID e() {
      return this.e;
   }

   public bzv<?> f() {
      return this.f;
   }

   public double g() {
      return this.g;
   }

   public double h() {
      return this.h;
   }

   public double i() {
      return this.i;
   }

   public double j() {
      return this.j / 8000.0;
   }

   public double k() {
      return this.k / 8000.0;
   }

   public double l() {
      return this.l / 8000.0;
   }

   public float m() {
      return bcb.a(this.m);
   }

   public float n() {
      return bcb.a(this.n);
   }

   public float o() {
      return bcb.a(this.o);
   }

   public int p() {
      return this.p;
   }
}
