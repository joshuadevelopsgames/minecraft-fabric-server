import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record lh(Optional<bg<aut<String>, lh.a>> e) implements dm<dge> {
   public static final Codec<lh> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(lh.a.a).optionalFieldOf("pages").forGetter(lh::b)).apply($$0, lh::new));

   @Override
   public kp<dge> a() {
      return kq.U;
   }

   public boolean a(dge $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.a());
   }

   public Optional<bg<aut<String>, lh.a>> b() {
      return this.e;
   }

   public record a(String b) implements Predicate<aut<String>> {
      public static final Codec<lh.a> a = Codec.STRING.xmap(lh.a::new, lh.a::a);

      public boolean a(aut<String> $$0) {
         return $$0.a().equals(this.b);
      }

      public String a() {
         return this.b;
      }
   }
}
