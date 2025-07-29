import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public final class uk implements vi {
   private static final int c = 8;
   public static final vk<uk> a = new vk<uk>() {
      public uk a(DataInput $$0, ur $$1) {
         $$1.b(8L);
         return uk.b;
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, ur $$2) {
      }

      @Override
      public void b(DataInput $$0, ur $$1) {
      }

      @Override
      public String a() {
         return "END";
      }

      @Override
      public String b() {
         return "TAG_End";
      }
   };
   public static final uk b = new uk();

   private uk() {
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
   }

   @Override
   public int a() {
      return 8;
   }

   @Override
   public byte b() {
      return 0;
   }

   @Override
   public vk<uk> c() {
      return a;
   }

   @Override
   public String toString() {
      vh $$0 = new vh();
      $$0.a(this);
      return $$0.a();
   }

   public uk e() {
      return this;
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a();
   }
}
