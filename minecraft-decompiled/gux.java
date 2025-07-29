import javax.annotation.Nullable;

public record gux(String f, @Nullable gxz g) {
   public static final gux a = new gux("TERRAIN_SHEET", gxz.B(hrr.c));
   public static final gux b = new gux("PARTICLE_SHEET_OPAQUE", gxz.A(hrr.d));
   public static final gux c = new gux("PARTICLE_SHEET_TRANSLUCENT", gxz.B(hrr.d));
   public static final gux d = new gux("CUSTOM", null);
   public static final gux e = new gux("NO_RENDER", null);

   public String a() {
      return this.f;
   }

   @Nullable
   public gxz b() {
      return this.g;
   }
}
