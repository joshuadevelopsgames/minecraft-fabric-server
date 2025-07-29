import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record uj(double c) implements uy {
   private static final int v = 16;
   public static final uj a = new uj(0.0);
   public static final vk<uj> b = new vk.a<uj>() {
      public uj a(DataInput $$0, ur $$1) throws IOException {
         return uj.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(16L);
         return $$0.readDouble();
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "DOUBLE";
      }

      @Override
      public String b() {
         return "TAG_Double";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public uj(double c) {
      this.c = c;
   }

   public static uj a(double $$0) {
      return $$0 == 0.0 ? a : new uj($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeDouble(this.c);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 6;
   }

   @Override
   public vk<uj> c() {
      return b;
   }

   public uj e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)Math.floor(this.c);
   }

   @Override
   public int h() {
      return bcb.a(this.c);
   }

   @Override
   public short i() {
      return (short)(bcb.a(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(bcb.a(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return this.c;
   }

   @Override
   public float l() {
      return (float)this.c;
   }

   @Override
   public Number m() {
      return this.c;
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a(this.c);
   }

   @Override
   public String toString() {
      vh $$0 = new vh();
      $$0.a(this);
      return $$0.a();
   }

   public double n() {
      return this.c;
   }
}
