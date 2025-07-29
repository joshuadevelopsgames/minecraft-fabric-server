import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ast(int c, List<ast.a> d, xo e, boolean f) implements asq {
   public static final MapCodec<ast> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
               art.b.optionalFieldOf("width", 200).forGetter(ast::c),
               bbi.b(ast.a.b.listOf()).fieldOf("options").forGetter(ast::d),
               xq.a.fieldOf("label").forGetter(ast::e),
               Codec.BOOL.optionalFieldOf("label_visible", true).forGetter(ast::f)
            )
            .apply($$0, ast::new)
      )
      .validate($$0 -> {
         long $$1 = $$0.d.stream().filter(ast.a::d).count();
         return $$1 > 1L ? DataResult.error(() -> "Multiple initial values") : DataResult.success($$0);
      });

   @Override
   public MapCodec<ast> a() {
      return a;
   }

   public Optional<ast.a> b() {
      return this.d.stream().filter(ast.a::d).findFirst();
   }

   public record a(String c, Optional<xo> d, boolean e) {
      public static final Codec<ast.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               Codec.STRING.fieldOf("id").forGetter(ast.a::b),
               xq.a.optionalFieldOf("display").forGetter(ast.a::c),
               Codec.BOOL.optionalFieldOf("initial", false).forGetter(ast.a::d)
            )
            .apply($$0, ast.a::new)
      );
      public static final Codec<ast.a> b = Codec.withAlternative(a, Codec.STRING, $$0 -> new ast.a($$0, Optional.empty(), false));

      public xo a() {
         return this.d.orElseGet(() -> xo.b(this.c));
      }

      public String b() {
         return this.c;
      }

      public Optional<xo> c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }
}
