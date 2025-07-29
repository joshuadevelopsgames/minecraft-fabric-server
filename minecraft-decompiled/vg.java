import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public record vg(String b) implements uz {
   private static final int c = 36;
   public static final vk<vg> a = new vk.b<vg>() {
      public vg a(DataInput $$0, ur $$1) throws IOException {
         return vg.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, ur $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static String d(DataInput $$0, ur $$1) throws IOException {
         $$1.b(36L);
         String $$2 = $$0.readUTF();
         $$1.a(2L, $$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, ur $$1) throws IOException {
         vg.a($$0);
      }

      @Override
      public String a() {
         return "STRING";
      }

      @Override
      public String b() {
         return "TAG_String";
      }
   };
   private static final vg v = new vg("");
   private static final char w = '"';
   private static final char x = '\'';
   private static final char y = '\\';
   private static final char z = '\u0000';

   @Deprecated(
      forRemoval = true
   )
   public vg(String b) {
      this.b = b;
   }

   public static void a(DataInput $$0) throws IOException {
      $$0.skipBytes($$0.readUnsignedShort());
   }

   public static vg a(String $$0) {
      return $$0.isEmpty() ? v : new vg($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeUTF(this.b);
   }

   @Override
   public int a() {
      return 36 + 2 * this.b.length();
   }

   @Override
   public byte b() {
      return 8;
   }

   @Override
   public vk<vg> c() {
      return a;
   }

   @Override
   public String toString() {
      vh $$0 = new vh();
      $$0.a(this);
      return $$0.a();
   }

   public vg e() {
      return this;
   }

   @Override
   public Optional<String> p_() {
      return Optional.of(this.b);
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   public static String b(String $$0) {
      StringBuilder $$1 = new StringBuilder();
      a($$0, $$1);
      return $$1.toString();
   }

   public static void a(String $$0, StringBuilder $$1) {
      int $$2 = $$1.length();
      $$1.append(' ');
      char $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.length(); $$4++) {
         char $$5 = $$0.charAt($$4);
         if ($$5 == '\\') {
            $$1.append("\\\\");
         } else if ($$5 != '"' && $$5 != '\'') {
            String $$6 = vc.a($$5);
            if ($$6 != null) {
               $$1.append('\\');
               $$1.append($$6);
            } else {
               $$1.append($$5);
            }
         } else {
            if ($$3 == 0) {
               $$3 = (char)($$5 == '"' ? 39 : 34);
            }

            if ($$3 == $$5) {
               $$1.append('\\');
            }

            $$1.append($$5);
         }
      }

      if ($$3 == 0) {
         $$3 = '"';
      }

      $$1.setCharAt($$2, $$3);
      $$1.append($$3);
   }

   public static String c(String $$0) {
      StringBuilder $$1 = new StringBuilder();
      b($$0, $$1);
      return $$1.toString();
   }

   public static void b(String $$0, StringBuilder $$1) {
      for (int $$2 = 0; $$2 < $$0.length(); $$2++) {
         char $$3 = $$0.charAt($$2);
         switch ($$3) {
            case '"':
            case '\'':
            case '\\':
               $$1.append('\\');
               $$1.append($$3);
               break;
            default:
               String $$4 = vc.a($$3);
               if ($$4 != null) {
                  $$1.append('\\');
                  $$1.append($$4);
               } else {
                  $$1.append($$3);
               }
         }
      }
   }

   @Override
   public vf.b a(vf $$0) {
      return $$0.a(this.b);
   }

   public String k() {
      return this.b;
   }
}
