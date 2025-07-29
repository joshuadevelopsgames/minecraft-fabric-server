import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record xv(List<ya> d) {
   public static final Codec<xv> a = ya.a.listOf().xmap(xv::new, xv::b);
   public static xv b = new xv(List.of());
   public static final int c = 20;

   public void a(bcp.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (ya $$1 : this.d) {
         $$0.update($$1.c());
      }
   }

   public xv.a a(yb $$0) {
      return new xv.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public byte a() {
      int $$0 = 1;

      for (ya $$1 : this.d) {
         $$0 = 31 * $$0 + $$1.b();
      }

      byte $$2 = (byte)$$0;
      return $$2 == 0 ? 1 : $$2;
   }

   public List<ya> b() {
      return this.d;
   }

   public record a(List<ya.a> b) {
      public static final xv.a a = new xv.a(List.of());

      public a(wg $$0) {
         this($$0.a(wg.a(ArrayList::new, 20), ya.a::a));
      }

      public void a(wg $$0) {
         $$0.a(this.b, ya.a::a);
      }

      public Optional<xv> a(yb $$0) {
         List<ya> $$1 = new ArrayList<>(this.b.size());

         for (ya.a $$2 : this.b) {
            Optional<ya> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new xv($$1));
      }

      public List<ya.a> a() {
         return this.b;
      }
   }

   public record b(int b, BitSet c, byte d) {
      public static final byte a = 0;

      public b(wg $$0) {
         this($$0.l(), $$0.e(20), $$0.readByte());
      }

      public void a(wg $$0) {
         $$0.c(this.b);
         $$0.a(this.c, 20);
         $$0.l(this.d);
      }

      public boolean a(xv $$0) {
         return this.d == 0 || this.d == $$0.a();
      }

      public int a() {
         return this.b;
      }

      public BitSet b() {
         return this.c;
      }

      public byte c() {
         return this.d;
      }
   }
}
