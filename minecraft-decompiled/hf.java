import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public record hf(String b, hd c) {
   public static final Codec<hf> a = Codec.STRING.comapFlatMap(hf::a, hf::a);

   public static DataResult<hf> a(String $$0) {
      try {
         he $$1 = new he(new StringReader($$0), true);
         return DataResult.success(new hf($$0, $$1.t()));
      } catch (CommandSyntaxException var2) {
         return DataResult.error(() -> "Invalid selector component: " + $$0 + ": " + var2.getMessage());
      }
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 instanceof hf $$1 && this.b.equals($$1.b);
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   @Override
   public String toString() {
      return this.b;
   }

   public String a() {
      return this.b;
   }

   public hd b() {
      return this.c;
   }
}
