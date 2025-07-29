import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record bap(int d, int e) {
   public static final Codec<Integer> a = bbi.a(0, 15);
   public static final Codec<bap> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(a.fieldOf("block").forGetter(bap::b), a.fieldOf("sky").forGetter(bap::c)).apply($$0, bap::new)
   );
   public static final bap c = new bap(15, 15);

   public static int a(int $$0, int $$1) {
      return $$0 << 4 | $$1 << 20;
   }

   public int a() {
      return a(this.d, this.e);
   }

   public static int a(int $$0) {
      return $$0 >> 4 & 65535;
   }

   public static int b(int $$0) {
      return $$0 >> 20 & 65535;
   }

   public static bap c(int $$0) {
      return new bap(a($$0), b($$0));
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
