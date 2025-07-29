import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.regex.Pattern;

public record avz(List<avz.a> b) {
   private static final Pattern c = Pattern.compile("[-_a-zA-Z0-9.]+");
   private static final Codec<avz> d = RecordCodecBuilder.create($$0 -> $$0.group(avz.a.c.listOf().fieldOf("entries").forGetter(avz::a)).apply($$0, avz::new));
   public static final awo<avz> a = new awo<>("overlays", d);

   private static DataResult<String> a(String $$0) {
      return !c.matcher($$0).matches() ? DataResult.error(() -> $$0 + " is not accepted directory name") : DataResult.success($$0);
   }

   public List<String> a(int $$0) {
      return this.b.stream().filter($$1 -> $$1.a($$0)).map(avz.a::b).toList();
   }

   public List<avz.a> a() {
      return this.b;
   }

   public record a(bbt<Integer> a, String b) {
      static final Codec<avz.a> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(bbt.a(Codec.INT).fieldOf("formats").forGetter(avz.a::a), Codec.STRING.validate(avz::a).fieldOf("directory").forGetter(avz.a::b))
            .apply($$0, avz.a::new)
      );

      public boolean a(int $$0) {
         return this.a.a($$0);
      }
   }
}
