import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dge(List<aut<String>> g) implements dex<String, dge> {
   public static final dge a = new dge(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<aut<String>> h = aut.a(Codec.string(0, 1024));
   public static final Codec<List<aut<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dge> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dge::a)).apply($$0, dge::new));
   public static final zm<ByteBuf, dge> f = aut.a(zk.b(1024)).a(zk.c(100)).a(dge::new, dge::a);

   public dge(List<aut<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dge b(List<aut<String>> $$0) {
      return new dge($$0);
   }

   @Override
   public List<aut<String>> a() {
      return this.g;
   }
}
