import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record un(int b) implements uy {
   private static final int c = 12;
   public static final vk<un> a = new vk.a<un>() {
      public un a(DataInput $$0, ur $$1) throws IOException {
         return un.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(12L);
         return $$0.readInt();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "INT";
      }

      @Override
      public String b() {
         return "TAG_Int";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public un(int b) {
      this.b = b;
   }

   public static un a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? un.a.a[$$0 - -128] : new un($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.b);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 3;
   }

   @Override
   public vk<un> c() {
      return a;
   }

   public un e() {
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
      return this.b;
   }

   @Override
   public short i() {
      return (short)(this.b & 65535);
   }

   @Override
   public byte j() {
      return (byte)(this.b & 0xFF);
   }

   @Override
   public double k() {
      return this.b;
   }

   @Override
   public float l() {
      return this.b;
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

   public int n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final un[] a = new un[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new un(-128 + $$0);
         }
      }
   }
}
