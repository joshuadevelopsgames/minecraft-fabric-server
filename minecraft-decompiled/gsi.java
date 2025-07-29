import com.mojang.authlib.GameProfile;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface gsi extends gsh {
   static gsi.a a(GameProfile $$0, ye $$1, gsg $$2) {
      return new gsi.a($$0, $$1, $$2);
   }

   static gsi.b a(xo $$0, Instant $$1) {
      return new gsi.b($$0, $$1);
   }

   xo b();

   default xo c() {
      return this.b();
   }

   boolean a(UUID var1);

   public record a(GameProfile c, ye d, gsg e) implements gsi {
      public static final MapCodec<gsi.a> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               bbi.C.fieldOf("profile").forGetter(gsi.a::f), ye.a.forGetter(gsi.a::g), gsg.d.optionalFieldOf("trust_level", gsg.a).forGetter(gsi.a::h)
            )
            .apply($$0, gsi.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public xo b() {
         if (!this.d.o().a()) {
            xo $$0 = this.d.o().b(this.d.c());
            return (xo)($$0 != null ? $$0 : xo.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public xo c() {
         xo $$0 = this.b();
         xo $$1 = this.i();
         return xo.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public xo d() {
         xo $$0 = this.i();
         return xo.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private xo i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return xo.b($$0.format(f)).a(o.u, o.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public gsh.a a() {
         return gsh.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public ye g() {
         return this.d;
      }

      public gsg h() {
         return this.e;
      }
   }

   public record b(xo c, Instant d) implements gsi {
      public static final MapCodec<gsi.b> b = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(xq.a.fieldOf("message").forGetter(gsi.b::d), bbi.t.fieldOf("time_stamp").forGetter(gsi.b::e)).apply($$0, gsi.b::new)
      );

      @Override
      public xo b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public gsh.a a() {
         return gsh.a.b;
      }

      public xo d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
