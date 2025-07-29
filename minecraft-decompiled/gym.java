import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3i;
import org.joml.Vector4f;

public interface gym {
   Codec<gym> a = gym.e.h.dispatch(gym::a, $$0 -> $$0.j);

   void a(Std140Builder var1);

   void a(Std140SizeCalculator var1);

   gym.e a();

   public record a(float c) implements gym {
      public static final Codec<gym.a> b = Codec.FLOAT.xmap(gym.a::new, gym.a::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putFloat(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putFloat();
      }

      @Override
      public gym.e a() {
         return gym.e.c;
      }

      public float b() {
         return this.c;
      }
   }

   public record b(Vector3i c) implements gym {
      public static final Codec<gym.b> b = bbi.f.xmap(gym.b::new, gym.b::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putIVec3(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putIVec3();
      }

      @Override
      public gym.e a() {
         return gym.e.b;
      }

      public Vector3i b() {
         return this.c;
      }
   }

   public record c(int c) implements gym {
      public static final Codec<gym.c> b = Codec.INT.xmap(gym.c::new, gym.c::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putInt(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putInt();
      }

      @Override
      public gym.e a() {
         return gym.e.a;
      }

      public int b() {
         return this.c;
      }
   }

   public record d(Matrix4fc c) implements gym {
      public static final Codec<gym.d> b = bbi.k.xmap(gym.d::new, gym.d::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putMat4f(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putMat4f();
      }

      @Override
      public gym.e a() {
         return gym.e.g;
      }

      public Matrix4fc b() {
         return this.c;
      }
   }

   public static enum e implements bda {
      a("int", gym.c.b),
      b("ivec3", gym.b.b),
      c("float", gym.a.b),
      d("vec2", gym.f.b),
      e("vec3", gym.g.b),
      f("vec4", gym.h.b),
      g("matrix4x4", gym.d.b);

      public static final bda.a<gym.e> h = bda.a(gym.e::values);
      private final String i;
      final MapCodec<? extends gym> j;

      private e(final String $$0, final Codec<? extends gym> $$1) {
         this.i = $$0;
         this.j = $$1.fieldOf("value");
      }

      @Override
      public String c() {
         return this.i;
      }
   }

   public record f(Vector2f c) implements gym {
      public static final Codec<gym.f> b = bbi.d.xmap(gym.f::new, gym.f::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putVec2(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putVec2();
      }

      @Override
      public gym.e a() {
         return gym.e.d;
      }

      public Vector2f b() {
         return this.c;
      }
   }

   public record g(Vector3f c) implements gym {
      public static final Codec<gym.g> b = bbi.e.xmap(gym.g::new, gym.g::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putVec3(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putVec3();
      }

      @Override
      public gym.e a() {
         return gym.e.e;
      }

      public Vector3f b() {
         return this.c;
      }
   }

   public record h(Vector4f c) implements gym {
      public static final Codec<gym.h> b = bbi.g.xmap(gym.h::new, gym.h::b);

      @Override
      public void a(Std140Builder $$0) {
         $$0.putVec4(this.c);
      }

      @Override
      public void a(Std140SizeCalculator $$0) {
         $$0.putVec4();
      }

      @Override
      public gym.e a() {
         return gym.e.f;
      }

      public Vector4f b() {
         return this.c;
      }
   }
}
