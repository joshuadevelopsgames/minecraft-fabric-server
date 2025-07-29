import javax.annotation.Nullable;

public abstract class huy implements hvr {
   @Nullable
   protected hvo a;
   protected final aza b;
   protected final ame c;
   protected float d = 1.0F;
   protected float e = 1.0F;
   protected double f;
   protected double g;
   protected double h;
   protected boolean i;
   protected int j;
   protected hvr.a k = hvr.a.b;
   protected boolean l;
   protected bck m;

   protected huy(ayy $$0, aza $$1, bck $$2) {
      this($$0.a(), $$1, $$2);
   }

   protected huy(ame $$0, aza $$1, bck $$2) {
      this.c = $$0;
      this.b = $$1;
      this.m = $$2;
   }

   @Override
   public ame a() {
      return this.c;
   }

   @Nullable
   @Override
   public hwy a(hwx $$0) {
      if (this.c.equals(hwx.c)) {
         this.a = hwx.e;
         return hwx.d;
      } else {
         hwy $$1 = $$0.a(this.c);
         if ($$1 == null) {
            this.a = hwx.b;
         } else {
            this.a = $$1.a(this.m);
         }

         return $$1;
      }
   }

   @Nullable
   @Override
   public hvo b() {
      return this.a;
   }

   @Override
   public aza c() {
      return this.b;
   }

   @Override
   public boolean d() {
      return this.i;
   }

   @Override
   public int e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.d * this.a.c().a(this.m);
   }

   @Override
   public float g() {
      return this.e * this.a.d().a(this.m);
   }

   @Override
   public double h() {
      return this.f;
   }

   @Override
   public double i() {
      return this.g;
   }

   @Override
   public double j() {
      return this.h;
   }

   @Override
   public hvr.a k() {
      return this.k;
   }

   @Override
   public boolean l() {
      return this.l;
   }

   @Override
   public String toString() {
      return "SoundInstance[" + this.c + "]";
   }
}
