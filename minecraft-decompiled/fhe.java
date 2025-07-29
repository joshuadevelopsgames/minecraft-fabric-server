import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public class fhe implements fhg {
   private static final String d = "block_entity";
   private static final fhe.a e = new fhe.a() {
      @Override
      public vi a(fdj $$0) {
         eaz $$1 = $$0.c(fgd.h);
         return $$1 != null ? $$1.b($$1.i().K_()) : null;
      }

      @Override
      public String a() {
         return "block_entity";
      }

      @Override
      public Set<bdn<?>> b() {
         return Set.of(fgd.h);
      }
   };
   public static final fhe a = new fhe(e);
   private static final Codec<fhe.a> f = Codec.STRING.xmap($$0 -> {
      if ($$0.equals("block_entity")) {
         return e;
      } else {
         fdj.b $$1 = fdj.b.a($$0);
         return b($$1);
      }
   }, fhe.a::a);
   public static final MapCodec<fhe> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("target").forGetter($$0x -> $$0x.g)).apply($$0, fhe::new));
   public static final Codec<fhe> c = f.xmap(fhe::new, $$0 -> $$0.g);
   private final fhe.a g;

   private static fhe.a b(final fdj.b $$0) {
      return new fhe.a() {
         @Nullable
         @Override
         public vi a(fdj $$0x) {
            bzm $$1 = $$0.c($$0.a());
            return $$1 != null ? da.b($$1) : null;
         }

         @Override
         public String a() {
            return $$0.name();
         }

         @Override
         public Set<bdn<?>> b() {
            return Set.of($$0.a());
         }
      };
   }

   private fhe(fhe.a $$0) {
      this.g = $$0;
   }

   @Override
   public fhf a() {
      return fhh.c;
   }

   @Nullable
   @Override
   public vi a(fdj $$0) {
      return this.g.a($$0);
   }

   @Override
   public Set<bdn<?>> b() {
      return this.g.b();
   }

   public static fhg a(fdj.b $$0) {
      return new fhe(b($$0));
   }

   interface a {
      @Nullable
      vi a(fdj var1);

      String a();

      Set<bdn<?>> b();
   }
}
