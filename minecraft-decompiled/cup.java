import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cup {
   private static final boolean f = false;
   private static final boolean g = false;
   private static final boolean h = false;
   private static final boolean i = false;
   private static final boolean j = true;
   private static final float k = 0.05F;
   private static final float l = 0.1F;
   public boolean a;
   public boolean b;
   public boolean c;
   public boolean d;
   public boolean e = true;
   private float m = 0.05F;
   private float n = 0.1F;

   public float a() {
      return this.m;
   }

   public void a(float $$0) {
      this.m = $$0;
   }

   public float b() {
      return this.n;
   }

   public void b(float $$0) {
      this.n = $$0;
   }

   public cup.a c() {
      return new cup.a(this.a, this.b, this.c, this.d, this.e, this.m, this.n);
   }

   public void a(cup.a $$0) {
      this.a = $$0.b;
      this.b = $$0.c;
      this.c = $$0.d;
      this.d = $$0.e;
      this.e = $$0.f;
      this.m = $$0.g;
      this.n = $$0.h;
   }

   public record a(boolean b, boolean c, boolean d, boolean e, boolean f, float g, float h) {
      public static final Codec<cup.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.BOOL.fieldOf("invulnerable").orElse(false).forGetter(cup.a::a),
               Codec.BOOL.fieldOf("flying").orElse(false).forGetter(cup.a::b),
               Codec.BOOL.fieldOf("mayfly").orElse(false).forGetter(cup.a::c),
               Codec.BOOL.fieldOf("instabuild").orElse(false).forGetter(cup.a::d),
               Codec.BOOL.fieldOf("mayBuild").orElse(true).forGetter(cup.a::e),
               Codec.FLOAT.fieldOf("flySpeed").orElse(0.05F).forGetter(cup.a::f),
               Codec.FLOAT.fieldOf("walkSpeed").orElse(0.1F).forGetter(cup.a::g)
            )
            .apply($$0, cup.a::new)
      );

      public boolean a() {
         return this.b;
      }

      public boolean b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public float f() {
         return this.g;
      }

      public float g() {
         return this.h;
      }
   }
}
