import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ul(float c) implements uy {
   private static final int v = 12;
   public static final ul a = new ul(0.0F);
   public static final vk<ul> b = new vk.a<ul>() {
      public ul a(DataInput $$0, ur $$1) throws IOException {
         return ul.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(12L);
         return $$0.readFloat();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public ul(float c) {
      this.c = c;
   }

   public static ul a(float $$0) {
      return $$0 == 0.0F ? a : new ul($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.c);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 5;
   }

   @Override
   public vk<ul> c() {
      return b;
   }

   public ul e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.c;
   }

   @Override
   public int h() {
      return bcb.d(this.c);
   }

   @Override
   public short i() {
      return (short)(bcb.d(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(bcb.d(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return this.c;
   }

   @Override
   public float l() {
      return this.c;
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

   public float n() {
      return this.c;
   }
}
