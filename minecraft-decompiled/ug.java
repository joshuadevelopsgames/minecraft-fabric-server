import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ug(byte v) implements uy {
   private static final int w = 9;
   public static final vk<ug> a = new vk.a<ug>() {
      public ug a(DataInput $$0, ur $$1) throws IOException {
         return ug.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(9L);
         return $$0.readByte();
      }

      @Override
      public int c() {
         return 1;
      }

      @Override
      public String a() {
         return "BYTE";
      }

      @Override
      public String b() {
         return "TAG_Byte";
      }
   };
   public static final ug b = a((byte)0);
   public static final ug c = a((byte)1);

   @Deprecated(
      forRemoval = true
   )
   public ug(byte v) {
      this.v = v;
   }

   public static ug a(byte $$0) {
      return ug.a.a[128 + $$0];
   }

   public static ug a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.v);
   }

   @Override
   public int a() {
      return 9;
   }

   @Override
   public byte b() {
      return 1;
   }

   @Override
   public vk<ug> c() {
      return a;
   }

   public ug e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return this.v;
   }

   @Override
   public int h() {
      return this.v;
   }

   @Override
   public short i() {
      return this.v;
   }

   @Override
   public byte j() {
      return this.v;
   }

   @Override
   public double k() {
      return this.v;
   }

   @Override
   public float l() {
      return this.v;
   }

   @Override
   public Number m() {
      return this.v;
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a(this.v);
   }

   @Override
   public String toString() {
      vh $$0 = new vh();
      $$0.a(this);
      return $$0.a();
   }

   public byte n() {
      return this.v;
   }

   static class a {
      static final ug[] a = new ug[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ug((byte)($$0 - 128));
         }
      }
   }
}
