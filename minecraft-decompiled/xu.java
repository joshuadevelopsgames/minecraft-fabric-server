import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public interface xu {
   Codec<xu> a = xu.a.e.dispatch("action", xu::a, $$0 -> $$0.h);

   xu.a a();

   public static enum a implements bda {
      a("show_text", true, xu.e.b),
      b("show_item", true, xu.d.b),
      c("show_entity", true, xu.c.b);

      public static final Codec<xu.a> d = bda.b(xu.a::values);
      public static final Codec<xu.a> e = d.validate(xu.a::a);
      private final String f;
      private final boolean g;
      final MapCodec<? extends xu> h;

      private a(final String $$0, final boolean $$1, final MapCodec<? extends xu> $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      public boolean a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Override
      public String toString() {
         return "<action " + this.f + ">";
      }

      private static DataResult<xu.a> a(xu.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }

   public static class b {
      public static final MapCodec<xu.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               mm.f.q().fieldOf("id").forGetter($$0x -> $$0x.b),
               kf.f.fieldOf("uuid").forGetter($$0x -> $$0x.c),
               xq.a.optionalFieldOf("name").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, xu.b::new)
      );
      public final bzv<?> b;
      public final UUID c;
      public final Optional<xo> d;
      @Nullable
      private List<xo> e;

      public b(bzv<?> $$0, UUID $$1, @Nullable xo $$2) {
         this($$0, $$1, Optional.ofNullable($$2));
      }

      public b(bzv<?> $$0, UUID $$1, Optional<xo> $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      public List<xo> a() {
         if (this.e == null) {
            this.e = new ArrayList<>();
            this.d.ifPresent(this.e::add);
            this.e.add(xo.a("gui.entity_tooltip.type", this.b.h()));
            this.e.add(xo.b(this.c.toString()));
         }

         return this.e;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            xu.b $$1 = (xu.b)$$0;
            return this.b.equals($$1.b) && this.c.equals($$1.c) && this.d.equals($$1.d);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.b.hashCode();
         $$0 = 31 * $$0 + this.c.hashCode();
         return 31 * $$0 + this.d.hashCode();
      }
   }

   public record c(xu.b c) implements xu {
      public static final MapCodec<xu.c> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xu.b.a.forGetter(xu.c::b)).apply($$0, xu.c::new));

      @Override
      public xu.a a() {
         return xu.a.c;
      }

      public xu.b b() {
         return this.c;
      }
   }

   public record d(dcv c) implements xu {
      public static final MapCodec<xu.d> b = dcv.a.xmap(xu.d::new, xu.d::b);

      public d(dcv c) {
         c = c.v();
         this.c = c;
      }

      @Override
      public xu.a a() {
         return xu.a.b;
      }

      @Override
      public boolean equals(Object $$0) {
         return $$0 instanceof xu.d $$1 && dcv.a(this.c, $$1.c);
      }

      @Override
      public int hashCode() {
         return dcv.b(this.c);
      }

      public dcv b() {
         return this.c;
      }
   }

   public record e(xo c) implements xu {
      public static final MapCodec<xu.e> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(xq.a.fieldOf("value").forGetter(xu.e::b)).apply($$0, xu.e::new));

      @Override
      public xu.a a() {
         return xu.a.a;
      }

      public xo b() {
         return this.c;
      }
   }
}
