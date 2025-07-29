import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record vb(short b) implements uy {
   private static final int c = 10;
   public static final vk<vb> a = new vk.a<vb>() {
      public vb a(DataInput $$0, ur $$1) throws IOException {
         return vb.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static short d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(10L);
         return $$0.readShort();
      }

      @Override
      public int c() {
         return 2;
      }

      @Override
      public String a() {
         return "SHORT";
      }

      @Override
      public String b() {
         return "TAG_Short";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public vb(short b) {
      this.b = b;
   }

   public static vb a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? vb.a.a[$$0 - -128] : new vb($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.b);
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public byte b() {
      return 2;
   }

   @Override
   public vk<vb> c() {
      return a;
   }

   public vb e() {
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
      return this.b;
   }

   @Override
   public byte j() {
      return (byte)(this.b & 255);
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

   public short n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final vb[] a = new vb[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new vb((short)(-128 + $$0));
         }
      }
   }
}
