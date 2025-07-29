import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eiz implements ejf {
   public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a.fieldOf("source_entity").forGetter(eiz::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.f))
         .apply($$0, ($$0x, $$1) -> new eiz(Either.right(Either.left($$0x)), $$1))
   );
   public static final zm<ByteBuf, eiz> b = zm.a(zk.h, eiz::c, zk.l, $$0 -> $$0.f, ($$0, $$1) -> new eiz(Either.right(Either.right($$0)), $$1));
   private Either<bzm, Either<UUID, Integer>> e;
   private final float f;

   public eiz(bzm $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   private eiz(Either<bzm, Either<UUID, Integer>> $$0, float $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public Optional<fis> a(dmu $$0) {
      if (this.e.left().isEmpty()) {
         this.b($$0);
      }

      return this.e.left().map($$0x -> $$0x.dv().b(0.0, this.f, 0.0));
   }

   private void b(dmu $$0) {
      ((Optional)this.e.map(Optional::of, $$1 -> Optional.ofNullable((bzm)$$1.map($$1x -> $$0 instanceof aub $$2 ? $$2.b($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.e = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.e.map(bzm::cK, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
         throw new RuntimeException("Unable to get entityId from uuid");
      }));
   }

   private int c() {
      return (Integer)this.e.map(bzm::ar, $$0 -> (Integer)$$0.map($$0x -> {
         throw new IllegalStateException("Unable to get entityId from uuid");
      }, Function.identity()));
   }

   @Override
   public ejg<eiz> a() {
      return ejg.b;
   }

   public static class a implements ejg<eiz> {
      @Override
      public MapCodec<eiz> a() {
         return eiz.a;
      }

      @Override
      public zm<ByteBuf, eiz> b() {
         return eiz.b;
      }
   }
}
