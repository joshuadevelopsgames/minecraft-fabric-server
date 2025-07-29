import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public interface htl {
   Codec<htl> a = htl.d.d.dispatch(htl::a, htl.d::a);
   htl b = new htl.b();

   htl.d a();

   public record a(int d, int e, htl.a.a f, boolean g) implements htl {
      public static final MapCodec<htl.a> c = RecordCodecBuilder.mapCodec(
            $$0 -> $$0.group(
                  bbi.p.fieldOf("width").forGetter(htl.a::b),
                  bbi.p.fieldOf("height").forGetter(htl.a::c),
                  htl.a.a.g.fieldOf("border").forGetter(htl.a::d),
                  Codec.BOOL.optionalFieldOf("stretch_inner", false).forGetter(htl.a::e)
               )
               .apply($$0, htl.a::new)
         )
         .validate(htl.a::a);

      private static DataResult<htl.a> a(htl.a $$0) {
         htl.a.a $$1 = $$0.d();
         if ($$1.a() + $$1.c() >= $$0.b()) {
            return DataResult.error(() -> "Nine-sliced texture has no horizontal center slice: " + $$1.a() + " + " + $$1.c() + " >= " + $$0.b());
         } else {
            return $$1.b() + $$1.d() >= $$0.c()
               ? DataResult.error(() -> "Nine-sliced texture has no vertical center slice: " + $$1.b() + " + " + $$1.d() + " >= " + $$0.c())
               : DataResult.success($$0);
         }
      }

      @Override
      public htl.d a() {
         return htl.d.c;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }

      public htl.a.a d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public record a(int a, int b, int c, int d) {
         private static final Codec<htl.a.a> e = bbi.p.flatComapMap($$0 -> new htl.a.a($$0, $$0, $$0, $$0), $$0 -> {
            OptionalInt $$1 = $$0.e();
            return $$1.isPresent() ? DataResult.success($$1.getAsInt()) : DataResult.error(() -> "Border has different side sizes");
         });
         private static final Codec<htl.a.a> f = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                  bbi.o.fieldOf("left").forGetter(htl.a.a::a),
                  bbi.o.fieldOf("top").forGetter(htl.a.a::b),
                  bbi.o.fieldOf("right").forGetter(htl.a.a::c),
                  bbi.o.fieldOf("bottom").forGetter(htl.a.a::d)
               )
               .apply($$0, htl.a.a::new)
         );
         static final Codec<htl.a.a> g = Codec.either(e, f).xmap(Either::unwrap, $$0 -> $$0.e().isPresent() ? Either.left($$0) : Either.right($$0));

         private OptionalInt e() {
            return this.a() == this.b() && this.b() == this.c() && this.c() == this.d() ? OptionalInt.of(this.a()) : OptionalInt.empty();
         }
      }
   }

   public record b() implements htl {
      public static final MapCodec<htl.b> c = MapCodec.unit(htl.b::new);

      @Override
      public htl.d a() {
         return htl.d.a;
      }
   }

   public record c(int d, int e) implements htl {
      public static final MapCodec<htl.c> c = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(bbi.p.fieldOf("width").forGetter(htl.c::b), bbi.p.fieldOf("height").forGetter(htl.c::c)).apply($$0, htl.c::new)
      );

      @Override
      public htl.d a() {
         return htl.d.b;
      }

      public int b() {
         return this.d;
      }

      public int c() {
         return this.e;
      }
   }

   public static enum d implements bda {
      a("stretch", htl.b.c),
      b("tile", htl.c.c),
      c("nine_slice", htl.a.c);

      public static final Codec<htl.d> d = bda.a(htl.d::values);
      private final String e;
      private final MapCodec<? extends htl> f;

      private d(final String $$0, final MapCodec<? extends htl> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      @Override
      public String c() {
         return this.e;
      }

      public MapCodec<? extends htl> a() {
         return this.f;
      }
   }
}
