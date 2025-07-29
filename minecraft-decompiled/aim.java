public abstract class aim implements zw<ahm> {
   private static final int j = 1;
   private static final int k = 2;
   protected final double a;
   protected final double b;
   protected final double c;
   protected final float d;
   protected final float e;
   protected final boolean f;
   protected final boolean g;
   protected final boolean h;
   protected final boolean i;

   static int a(boolean $$0, boolean $$1) {
      int $$2 = 0;
      if ($$0) {
         $$2 |= 1;
      }

      if ($$1) {
         $$2 |= 2;
      }

      return $$2;
   }

   static boolean a(int $$0) {
      return ($$0 & 1) != 0;
   }

   static boolean b(int $$0) {
      return ($$0 & 2) != 0;
   }

   protected aim(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6, boolean $$7, boolean $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   @Override
   public abstract zy<? extends aim> a();

   public void a(ahm $$0) {
      $$0.a(this);
   }

   public double a(double $$0) {
      return this.h ? this.a : $$0;
   }

   public double b(double $$0) {
      return this.h ? this.b : $$0;
   }

   public double c(double $$0) {
      return this.h ? this.c : $$0;
   }

   public float a(float $$0) {
      return this.i ? this.d : $$0;
   }

   public float b(float $$0) {
      return this.i ? this.e : $$0;
   }

   public boolean b() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public static class a extends aim {
      public static final zm<wg, aim.a> j = zw.a(aim.a::b, aim.a::a);

      public a(fis $$0, boolean $$1, boolean $$2) {
         super($$0.d, $$0.e, $$0.f, 0.0F, 0.0F, $$1, $$2, true, false);
      }

      public a(double $$0, double $$1, double $$2, boolean $$3, boolean $$4) {
         super($$0, $$1, $$2, 0.0F, 0.0F, $$3, $$4, true, false);
      }

      private static aim.a a(wg $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         short $$4 = $$0.readUnsignedByte();
         boolean $$5 = aim.a((int)$$4);
         boolean $$6 = aim.b((int)$$4);
         return new aim.a($$1, $$2, $$3, $$5, $$6);
      }

      private void b(wg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.l(aim.a(this.f, this.g));
      }

      @Override
      public zy<aim.a> a() {
         return ahk.bK;
      }
   }

   public static class b extends aim {
      public static final zm<wg, aim.b> j = zw.a(aim.b::b, aim.b::a);

      public b(fis $$0, float $$1, float $$2, boolean $$3, boolean $$4) {
         super($$0.d, $$0.e, $$0.f, $$1, $$2, $$3, $$4, true, true);
      }

      public b(double $$0, double $$1, double $$2, float $$3, float $$4, boolean $$5, boolean $$6) {
         super($$0, $$1, $$2, $$3, $$4, $$5, $$6, true, true);
      }

      private static aim.b a(wg $$0) {
         double $$1 = $$0.readDouble();
         double $$2 = $$0.readDouble();
         double $$3 = $$0.readDouble();
         float $$4 = $$0.readFloat();
         float $$5 = $$0.readFloat();
         short $$6 = $$0.readUnsignedByte();
         boolean $$7 = aim.a((int)$$6);
         boolean $$8 = aim.b((int)$$6);
         return new aim.b($$1, $$2, $$3, $$4, $$5, $$7, $$8);
      }

      private void b(wg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(aim.a(this.f, this.g));
      }

      @Override
      public zy<aim.b> a() {
         return ahk.bL;
      }
   }

   public static class c extends aim {
      public static final zm<wg, aim.c> j = zw.a(aim.c::b, aim.c::a);

      public c(float $$0, float $$1, boolean $$2, boolean $$3) {
         super(0.0, 0.0, 0.0, $$0, $$1, $$2, $$3, false, true);
      }

      private static aim.c a(wg $$0) {
         float $$1 = $$0.readFloat();
         float $$2 = $$0.readFloat();
         short $$3 = $$0.readUnsignedByte();
         boolean $$4 = aim.a((int)$$3);
         boolean $$5 = aim.b((int)$$3);
         return new aim.c($$1, $$2, $$4, $$5);
      }

      private void b(wg $$0) {
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.l(aim.a(this.f, this.g));
      }

      @Override
      public zy<aim.c> a() {
         return ahk.bM;
      }
   }

   public static class d extends aim {
      public static final zm<wg, aim.d> j = zw.a(aim.d::b, aim.d::a);

      public d(boolean $$0, boolean $$1) {
         super(0.0, 0.0, 0.0, 0.0F, 0.0F, $$0, $$1, false, false);
      }

      private static aim.d a(wg $$0) {
         short $$1 = $$0.readUnsignedByte();
         boolean $$2 = aim.a((int)$$1);
         boolean $$3 = aim.b((int)$$1);
         return new aim.d($$2, $$3);
      }

      private void b(wg $$0) {
         $$0.l(aim.a(this.f, this.g));
      }

      @Override
      public zy<aim.d> a() {
         return ahk.bN;
      }
   }
}
