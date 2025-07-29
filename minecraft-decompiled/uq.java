import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record uq(long b) implements uy {
   private static final int c = 16;
   public static final vk<uq> a = new vk.a<uq>() {
      public uq a(DataInput $$0, ur $$1) throws IOException {
         return uq.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(16L);
         return $$0.readLong();
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "LONG";
      }

      @Override
      public String b() {
         return "TAG_Long";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public uq(long b) {
      this.b = b;
   }

   public static uq a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? uq.a.a[(int)$$0 - -128] : new uq($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeLong(this.b);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 4;
   }

   @Override
   public vk<uq> c() {
      return a;
   }

   public uq e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return this.b;
   }

   @Override
   public int h() {
      return (int)(this.b & -1L);
   }

   @Override
   public short i() {
      return (short)(this.b & 65535L);
   }

   @Override
   public byte j() {
      return (byte)(this.b & 255L);
   }

   @Override
   public double k() {
      return this.b;
   }

   @Override
   public float l() {
      return (float)this.b;
   }

   @Override
   public Number m() {
      return this.b;
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a(this.b);
   }

   @Override
   public String toString() {
      vh $$0 = new vh();
      $$0.a(this);
      return $$0.a();
   }

   public long n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uq[] a = new uq[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uq(-128 + $$0);
         }
      }
   }
}
