import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public record yp(String d, @Nullable gm e) implements yq {
   public static final MapCodec<yp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("block").forGetter(yp::b)).apply($$0, yp::new));
   public static final yq.a<yp> b = new yq.a<>(a, "block");

   public yp(String $$0) {
      this($$0, a($$0));
   }

   @Nullable
   private static gm a(String $$0) {
      try {
         return gk.a().a(new StringReader($$0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   @Override
   public Stream<ui> a(ek $$0) {
      if (this.e != null) {
         aub $$1 = $$0.e();
         jb $$2 = this.e.c($$0);
         if ($$1.p($$2)) {
            eaz $$3 = $$1.c_($$2);
            if ($$3 != null) {
               return Stream.of($$3.b($$0.u()));
            }
         }
      }

      return Stream.empty();
   }

   @Override
   public yq.a<?> a() {
      return b;
   }

   @Override
   public String toString() {
      return "block=" + this.d;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof yp $$1 && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      return this.d.hashCode();
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public gm c() {
      return this.e;
   }
}
