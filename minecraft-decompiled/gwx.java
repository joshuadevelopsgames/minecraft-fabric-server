import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class gwx {
   private static final Object2ObjectMap<ame, gwx> a = ag.a(new Object2ObjectArrayMap(), $$0 -> {
      gwx.c $$1 = new gwx.c();
      $$0.defaultReturnValue($$1);
      $$0.put(ehw.e, $$1);
      $$0.put(ehw.f, new gwx.b());
      $$0.put(ehw.g, new gwx.a());
   });
   private final gwx.d b;
   private final boolean c;
   private final boolean d;

   public gwx(gwx.d $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public static gwx a(ehy $$0) {
      return (gwx)a.get($$0.r());
   }

   public boolean a(float $$0) {
      return false;
   }

   public int b(float $$0) {
      return 0;
   }

   public abstract fis a(fis var1, float var2);

   public abstract boolean a(int var1, int var2);

   public gwx.d a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }

   public boolean c() {
      return this.d;
   }

   public static class a extends gwx {
      public a() {
         super(gwx.d.c, true, false);
      }

      @Override
      public fis a(fis $$0, float $$1) {
         return $$0.c(0.15F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static class b extends gwx {
      public b() {
         super(gwx.d.a, false, true);
      }

      @Override
      public fis a(fis $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends gwx {
      private static final float a = 0.4F;

      public c() {
         super(gwx.d.b, false, false);
      }

      @Override
      public boolean a(float $$0) {
         float $$1 = bcb.b($$0 * (float) (Math.PI * 2));
         return $$1 >= -0.4F && $$1 <= 0.4F;
      }

      @Override
      public int b(float $$0) {
         float $$1 = bcb.b($$0 * (float) (Math.PI * 2));
         float $$2 = $$1 / 0.4F * 0.5F + 0.5F;
         float $$3 = bcb.l(1.0F - (1.0F - bcb.a($$2 * (float) Math.PI)) * 0.99F);
         return baj.a($$3, $$2 * 0.3F + 0.7F, $$2 * $$2 * 0.7F + 0.2F, 0.2F);
      }

      @Override
      public fis a(fis $$0, float $$1) {
         return $$0.d($$1 * 0.94F + 0.06F, $$1 * 0.94F + 0.06F, $$1 * 0.91F + 0.09F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static enum d {
      a,
      b,
      c;
   }
}
