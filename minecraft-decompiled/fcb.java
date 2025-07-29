import com.mojang.serialization.Codec;

public record fcb(ame d, boolean e, int f, boolean g, boolean h) {
   public static final int a = -1;
   public static final Codec<jl<fcb>> b = mm.ap.r();
   public static final zm<wx, jl<fcb>> c = zk.b(mn.U);

   public boolean a() {
      return this.f != -1;
   }

   public ame b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }
}
