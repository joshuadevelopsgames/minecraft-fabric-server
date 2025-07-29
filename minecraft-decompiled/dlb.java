import com.mojang.serialization.Codec;

public enum dlb implements bda {
   a(bzw.f, 11, "helmet"),
   b(bzw.e, 16, "chestplate"),
   c(bzw.d, 15, "leggings"),
   d(bzw.c, 13, "boots"),
   e(bzw.g, 16, "body");

   public static final Codec<dlb> f = bda.b(dlb::values);
   private final bzw g;
   private final String h;
   private final int i;

   private dlb(final bzw $$0, final int $$1, final String $$2) {
      this.g = $$0;
      this.h = $$2;
      this.i = $$1;
   }

   public int a(int $$0) {
      return this.i * $$0;
   }

   public bzw a() {
      return this.g;
   }

   public String b() {
      return this.h;
   }

   @Override
   public String c() {
      return this.h;
   }
}
