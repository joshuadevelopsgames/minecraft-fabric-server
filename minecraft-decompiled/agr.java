public class agr implements zw<acq> {
   public static final zm<wx, agr> a = zw.a(agr::a, agr::new);
   public static final float b = 8.0F;
   private final jl<ayy> c;
   private final aza d;
   private final int e;
   private final int f;
   private final int g;
   private final float h;
   private final float i;
   private final long j;

   public agr(jl<ayy> $$0, aza $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.c = $$0;
      this.d = $$1;
      this.e = (int)($$2 * 8.0);
      this.f = (int)($$3 * 8.0);
      this.g = (int)($$4 * 8.0);
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   private agr(wx $$0) {
      this.c = ayy.d.decode($$0);
      this.d = $$0.b(aza.class);
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readInt();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.j = $$0.readLong();
   }

   private void a(wx $$0) {
      ayy.d.encode($$0, this.c);
      $$0.a(this.d);
      $$0.q(this.e);
      $$0.q(this.f);
      $$0.q(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.b(this.j);
   }

   @Override
   public zy<agr> a() {
      return ahk.aW;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public jl<ayy> b() {
      return this.c;
   }

   public aza e() {
      return this.d;
   }

   public double f() {
      return this.e / 8.0F;
   }

   public double g() {
      return this.f / 8.0F;
   }

   public double h() {
      return this.g / 8.0F;
   }

   public float i() {
      return this.h;
   }

   public float j() {
      return this.i;
   }

   public long k() {
      return this.j;
   }
}
