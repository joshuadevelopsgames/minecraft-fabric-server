import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record alb(xo b, Optional<alb.b> c, Optional<alb.c> d, Optional<alb.a> e, boolean f) {
   public static final Codec<alb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            xq.a.lenientOptionalFieldOf("description", xn.a).forGetter(alb::a),
            alb.b.a.lenientOptionalFieldOf("players").forGetter(alb::b),
            alb.c.a.lenientOptionalFieldOf("version").forGetter(alb::c),
            alb.a.a.lenientOptionalFieldOf("favicon").forGetter(alb::d),
            Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(alb::e)
         )
         .apply($$0, alb::new)
   );

   public xo a() {
      return this.b;
   }

   public Optional<alb.b> b() {
      return this.c;
   }

   public Optional<alb.c> c() {
      return this.d;
   }

   public Optional<alb.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<alb.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new alb.a($$2));
            } catch (IllegalArgumentException var3) {
               return DataResult.error(() -> "Malformed base64 server icon");
            }
         }
      }, $$0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

      public byte[] a() {
         return this.b;
      }
   }

   public record b(int b, int c, List<GameProfile> d) {
      private static final Codec<GameProfile> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(kf.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
            .apply($$0, GameProfile::new)
      );
      public static final Codec<alb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.INT.fieldOf("max").forGetter(alb.b::a),
               Codec.INT.fieldOf("online").forGetter(alb.b::b),
               e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(alb.b::c)
            )
            .apply($$0, alb.b::new)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public List<GameProfile> c() {
         return this.d;
      }
   }

   public record c(String b, int c) {
      public static final Codec<alb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(alb.c::b), Codec.INT.fieldOf("protocol").forGetter(alb.c::c)).apply($$0, alb.c::new)
      );

      public static alb.c a() {
         ah $$0 = ac.b();
         return new alb.c($$0.c(), $$0.d());
      }
   }
}
