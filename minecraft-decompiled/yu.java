import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class yu implements xp {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<yu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            Codec.STRING.fieldOf("nbt").forGetter(yu::b),
            Codec.BOOL.lenientOptionalFieldOf("interpret", false).forGetter(yu::c),
            xq.a.lenientOptionalFieldOf("separator").forGetter(yu::d),
            yq.c.forGetter(yu::e)
         )
         .apply($$0, yu::new)
   );
   public static final xp.a<yu> b = new xp.a<>(a, "nbt");
   private final boolean e;
   private final Optional<xo> f;
   private final String g;
   private final yq h;
   @Nullable
   protected final fe.g c;

   public yu(String $$0, boolean $$1, Optional<xo> $$2, yq $$3) {
      this($$0, a($$0), $$1, $$2, $$3);
   }

   private yu(String $$0, @Nullable fe.g $$1, boolean $$2, Optional<xo> $$3, yq $$4) {
      this.g = $$0;
      this.c = $$1;
      this.e = $$2;
      this.f = $$3;
      this.h = $$4;
   }

   @Nullable
   private static fe.g a(String $$0) {
      try {
         return new fe().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String b() {
      return this.g;
   }

   public boolean c() {
      return this.e;
   }

   public Optional<xo> d() {
      return this.f;
   }

   public yq e() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof yu $$1 && this.h.equals($$1.h) && this.f.equals($$1.f) && this.e == $$1.e && this.g.equals($$1.g);
   }

   @Override
   public int hashCode() {
      int $$0 = this.e ? 1 : 0;
      $$0 = 31 * $$0 + this.f.hashCode();
      $$0 = 31 * $$0 + this.g.hashCode();
      return 31 * $$0 + this.h.hashCode();
   }

   @Override
   public String toString() {
      return "nbt{" + this.h + ", interpreting=" + this.e + ", separator=" + this.f + "}";
   }

   @Override
   public yc a(@Nullable ek $$0, @Nullable bzm $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.c != null) {
         Stream<vi> $$3 = this.h.a($$0).flatMap($$0x -> {
            try {
               return this.c.a($$0x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         });
         if (this.e) {
            amc<vi> $$4 = $$0.u().a(uw.a);
            xo $$5 = (xo)DataFixUtils.orElse(xr.a($$0, this.f, $$1, $$2), xr.c);
            return $$3.flatMap($$4x -> {
               try {
                  xo $$5x = (xo)xq.a.parse($$4, $$4x).getOrThrow();
                  return Stream.of(xr.a($$0, $$5x, $$1, $$2));
               } catch (Exception var6x) {
                  d.warn("Failed to parse component: {}", $$4x, var6x);
                  return Stream.of();
               }
            }).reduce(($$1x, $$2x) -> $$1x.b($$5).b($$2x)).orElseGet(xo::i);
         } else {
            Stream<String> $$6 = $$3.map(yu::a);
            return xr.a($$0, this.f, $$1, $$2)
               .map($$1x -> $$6.map(xo::b).reduce(($$1xx, $$2x) -> $$1xx.b($$1x).b($$2x)).orElseGet(xo::i))
               .orElseGet(() -> xo.b($$6.collect(Collectors.joining(", "))));
         }
      } else {
         return xo.i();
      }
   }

   private static String a(vi $$0) {
      if ($$0 instanceof vg var1) {
         vg var10000 = var1;

         try {
            var5 = var10000.k();
         } catch (Throwable var4) {
            throw new MatchException(var4.toString(), var4);
         }

         return var5;
      } else {
         return $$0.toString();
      }
   }

   @Override
   public xp.a<?> a() {
      return b;
   }
}
