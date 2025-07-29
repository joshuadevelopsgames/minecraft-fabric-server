import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yr(String d, @Nullable hd e) implements yq {
   public static final MapCodec<yr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("entity").forGetter(yr::b)).apply($$0, yr::new));
   public static final yq.a<yr> b = new yq.a<>(a, "entity");

   public yr(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static hd a(String $$0) {
      try {
         he $$1 = new he(new StringReader($$0), true);
         return $$1.t();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ui> a(ek $$0) throws CommandSyntaxException {
      if (this.e != null) {
         List<? extends bzm> $$1 = this.e.b($$0);
         return $$1.stream().map(da::b);
      } else {
         return Stream.empty();
      }
   }

   @Override
   public yq.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "entity=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof yr $$1 && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public hd c() {
      return this.e;
   }
}
