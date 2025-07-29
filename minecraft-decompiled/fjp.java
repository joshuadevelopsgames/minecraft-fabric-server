import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class fjp {
   private final fjx a;
   private final String b;
   private final fka c;
   private xo d;
   private xo e;
   private fka.a f;
   private boolean g;
   @Nullable
   private ze h;

   public fjp(fjx $$0, String $$1, fka $$2, xo $$3, fka.a $$4, boolean $$5, @Nullable ze $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.j();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fjp.a a() {
      return new fjp.a(this.b, this.c, this.d, this.f, this.g, Optional.ofNullable(this.h));
   }

   public fjx b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }

   public fka d() {
      return this.c;
   }

   public xo e() {
      return this.d;
   }

   public boolean f() {
      return this.g;
   }

   @Nullable
   public ze g() {
      return this.h;
   }

   public ze a(ze $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private xo j() {
      return xr.a((xo)this.d.f().a($$0 -> $$0.a(new xu.e(xo.b(this.b)))));
   }

   public xo h() {
      return this.e;
   }

   public void a(xo $$0) {
      this.d = $$0;
      this.e = this.j();
      this.a.b(this);
   }

   public fka.a i() {
      return this.f;
   }

   public void a(fka.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ze $$0) {
      this.h = $$0;
      this.a.b(this);
   }

   public record a(String b, fka c, xo d, fka.a e, boolean f, Optional<ze> g) {
      public static final Codec<fjp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.STRING.fieldOf("Name").forGetter(fjp.a::a),
               fka.b.optionalFieldOf("CriteriaName", fka.c).forGetter(fjp.a::b),
               xq.a.fieldOf("DisplayName").forGetter(fjp.a::c),
               fka.a.c.optionalFieldOf("RenderType", fka.a.a).forGetter(fjp.a::d),
               Codec.BOOL.optionalFieldOf("display_auto_update", false).forGetter(fjp.a::e),
               zg.b.optionalFieldOf("format").forGetter(fjp.a::f)
            )
            .apply($$0, fjp.a::new)
      );

      public String a() {
         return this.b;
      }

      public fka b() {
         return this.c;
      }

      public xo c() {
         return this.d;
      }

      public fka.a d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<ze> f() {
         return this.g;
      }
   }
}
