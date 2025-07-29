import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class fjs extends fjz {
   private static final int a = 0;
   private static final int b = 1;
   private final fjx c;
   private final String d;
   private final Set<String> e = Sets.newHashSet();
   private xo f;
   private xo g = xn.a;
   private xo h = xn.a;
   private boolean i = true;
   private boolean j = true;
   private fjz.b k = fjz.b.a;
   private fjz.b l = fjz.b.a;
   private o m = o.v;
   private fjz.a n = fjz.a.a;
   private final yl o;

   public fjs(fjx $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
      this.f = xo.b($$1);
      this.o = yl.a.a($$1).a(new xu.e(xo.b($$1)));
   }

   public fjs.a a() {
      return new fjs.a(
         this.d,
         Optional.of(this.f),
         this.m != o.v ? Optional.of(this.m) : Optional.empty(),
         this.i,
         this.j,
         this.g,
         this.h,
         this.k,
         this.l,
         this.n,
         List.copyOf(this.e)
      );
   }

   public fjx b() {
      return this.c;
   }

   @Override
   public String c() {
      return this.d;
   }

   public xo d() {
      return this.f;
   }

   public yc e() {
      yc $$0 = xr.a((xo)this.f.f().c(this.o));
      o $$1 = this.o();
      if ($$1 != o.v) {
         $$0.a($$1);
      }

      return $$0;
   }

   public void a(xo $$0) {
      if ($$0 == null) {
         throw new IllegalArgumentException("Name cannot be null");
      } else {
         this.f = $$0;
         this.c.b(this);
      }
   }

   public void b(@Nullable xo $$0) {
      this.g = $$0 == null ? xn.a : $$0;
      this.c.b(this);
   }

   public xo f() {
      return this.g;
   }

   public void c(@Nullable xo $$0) {
      this.h = $$0 == null ? xn.a : $$0;
      this.c.b(this);
   }

   public xo g() {
      return this.h;
   }

   @Override
   public Collection<String> h() {
      return this.e;
   }

   @Override
   public yc d(xo $$0) {
      yc $$1 = xo.i().b(this.g).b($$0).b(this.h);
      o $$2 = this.o();
      if ($$2 != o.v) {
         $$1.a($$2);
      }

      return $$1;
   }

   public static yc a(@Nullable fjz $$0, xo $$1) {
      return $$0 == null ? $$1.f() : $$0.d($$1);
   }

   @Override
   public boolean i() {
      return this.i;
   }

   public void a(boolean $$0) {
      this.i = $$0;
      this.c.b(this);
   }

   @Override
   public boolean j() {
      return this.j;
   }

   public void b(boolean $$0) {
      this.j = $$0;
      this.c.b(this);
   }

   @Override
   public fjz.b k() {
      return this.k;
   }

   @Override
   public fjz.b l() {
      return this.l;
   }

   public void a(fjz.b $$0) {
      this.k = $$0;
      this.c.b(this);
   }

   public void b(fjz.b $$0) {
      this.l = $$0;
      this.c.b(this);
   }

   @Override
   public fjz.a m() {
      return this.n;
   }

   public void a(fjz.a $$0) {
      this.n = $$0;
      this.c.b(this);
   }

   public int n() {
      int $$0 = 0;
      if (this.i()) {
         $$0 |= 1;
      }

      if (this.j()) {
         $$0 |= 2;
      }

      return $$0;
   }

   public void a(int $$0) {
      this.a(($$0 & 1) > 0);
      this.b(($$0 & 2) > 0);
   }

   public void a(o $$0) {
      this.m = $$0;
      this.c.b(this);
   }

   @Override
   public o o() {
      return this.m;
   }

   public record a(String b, Optional<xo> c, Optional<o> d, boolean e, boolean f, xo g, xo h, fjz.b i, fjz.b j, fjz.a k, List<String> l) {
      public static final Codec<fjs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.STRING.fieldOf("Name").forGetter(fjs.a::a),
               xq.a.optionalFieldOf("DisplayName").forGetter(fjs.a::b),
               o.x.optionalFieldOf("TeamColor").forGetter(fjs.a::c),
               Codec.BOOL.optionalFieldOf("AllowFriendlyFire", true).forGetter(fjs.a::d),
               Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", true).forGetter(fjs.a::e),
               xq.a.optionalFieldOf("MemberNamePrefix", xn.a).forGetter(fjs.a::f),
               xq.a.optionalFieldOf("MemberNameSuffix", xn.a).forGetter(fjs.a::g),
               fjz.b.e.optionalFieldOf("NameTagVisibility", fjz.b.a).forGetter(fjs.a::h),
               fjz.b.e.optionalFieldOf("DeathMessageVisibility", fjz.b.a).forGetter(fjs.a::i),
               fjz.a.e.optionalFieldOf("CollisionRule", fjz.a.a).forGetter(fjs.a::j),
               Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(fjs.a::k)
            )
            .apply($$0, fjs.a::new)
      );

      public String a() {
         return this.b;
      }

      public Optional<xo> b() {
         return this.c;
      }

      public Optional<o> c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public xo f() {
         return this.g;
      }

      public xo g() {
         return this.h;
      }

      public fjz.b h() {
         return this.i;
      }

      public fjz.b i() {
         return this.j;
      }

      public fjz.a j() {
         return this.k;
      }

      public List<String> k() {
         return this.l;
      }
   }
}
