public class agq implements zw<acq> {
   public static final zm<wx, agq> a = zw.a(agq::a, agq::new);
   private final jl<ayy> b;
   private final aza c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public agq(jl<ayy> $$0, aza $$1, bzm $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private agq(wx $$0) {
      this.b = ayy.d.decode($$0);
      this.c = $$0.b(aza.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wx $$0) {
      ayy.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zy<agq> a() {
      return ahk.aV;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public jl<ayy> b() {
      return this.b;
   }

   public aza e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public long i() {
      return this.g;
   }
}
