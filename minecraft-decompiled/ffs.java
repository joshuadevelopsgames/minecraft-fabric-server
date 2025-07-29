import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffs extends few {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ffs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and(
            $$0.group(
               xq.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
               fdj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
               ffs.a.c.optionalFieldOf("target", ffs.a.a).forGetter($$0x -> $$0x.e)
            )
         )
         .apply($$0, ffs::new)
   );
   private final Optional<xo> c;
   private final Optional<fdj.b> d;
   private final ffs.a e;

   private ffs(List<fgs> $$0, Optional<xo> $$1, Optional<fdj.b> $$2, ffs.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fey<ffs> b() {
      return fez.p;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.d.<Set<bdn<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xo> a(fdj $$0, @Nullable fdj.b $$1) {
      if ($$1 != null) {
         bzm $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ek $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xr.a($$3, $$2x, $$2, 0);
               } catch (CommandSyntaxException var4) {
                  b.warn("Failed to resolve text component", var4);
                  return $$2x;
               }
            };
         }
      }

      return $$0x -> $$0x;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static few.a<?> a(xo $$0, ffs.a $$1) {
      return a($$2 -> new ffs($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static few.a<?> a(xo $$0, ffs.a $$1, fdj.b $$2) {
      return a($$3 -> new ffs($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bda {
      a("custom_name"),
      b("item_name");

      public static final Codec<ffs.a> c = bda.a(ffs.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kp<xo> a() {
         return switch (this) {
            case a -> kq.g;
            case b -> kq.h;
         };
      }
   }
}
