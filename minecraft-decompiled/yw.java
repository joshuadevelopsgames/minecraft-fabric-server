import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public record yw(Either<hf, String> d, String e) implements xp {
   public static final MapCodec<yw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.either(hf.a, Codec.STRING).fieldOf("name").forGetter(yw::b), Codec.STRING.fieldOf("objective").forGetter(yw::c))
         .apply($$0, yw::new)
   );
   public static final MapCodec<yw> b = a.fieldOf("score");
   public static final xp.a<yw> c = new xp.a<>(b, "score");

   @Override
   public xp.a<?> a() {
      return c;
   }

   private fjw a(ek $$0) throws CommandSyntaxException {
      Optional<hf> $$1 = this.d.left();
      if ($$1.isPresent()) {
         List<? extends bzm> $$2 = $$1.get().b().b($$0);
         if (!$$2.isEmpty()) {
            if ($$2.size() != 1) {
               throw ey.a.create();
            } else {
               return $$2.getFirst();
            }
         } else {
            return fjw.c($$1.get().a());
         }
      } else {
         return fjw.c((String)this.d.right().orElseThrow());
      }
   }

   private yc a(fjw $$0, ek $$1) {
      MinecraftServer $$2 = $$1.l();
      if ($$2 != null) {
         fjx $$3 = $$2.aJ();
         fjp $$4 = $$3.a(this.e);
         if ($$4 != null) {
            fjt $$5 = $$3.d($$0, $$4);
            if ($$5 != null) {
               return $$5.a($$4.a(zh.b));
            }
         }
      }

      return xo.i();
   }

   @Override
   public yc a(@Nullable ek $$0, @Nullable bzm $$1, int $$2) throws CommandSyntaxException {
      if ($$0 == null) {
         return xo.i();
      } else {
         fjw $$3 = this.a($$0);
         fjw $$4 = (fjw)($$1 != null && $$3.equals(fjw.cL) ? $$1 : $$3);
         return this.a($$4, $$0);
      }
   }

   @Override
   public String toString() {
      return "score{name='" + this.d + "', objective='" + this.e + "'}";
   }

   public Either<hf, String> b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }
}
