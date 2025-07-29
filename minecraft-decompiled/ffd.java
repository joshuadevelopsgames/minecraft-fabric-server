import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffd extends few {
   public static final MapCodec<ffd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(eap.b.fieldOf("patterns").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.c)))
         .apply($$0, ffd::new)
   );
   private final eap b;
   private final boolean c;

   ffd(List<fgs> $$0, eap $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      if (this.c) {
         $$0.a(kq.am, eap.a, this.b, ($$0x, $$1x) -> new eap.a().a($$0x).a($$1x).a());
      } else {
         $$0.b(kq.am, this.b);
      }

      return $$0;
   }

   @Override
   public fey<ffd> b() {
      return fez.E;
   }

   public static ffd.a a(boolean $$0) {
      return new ffd.a($$0);
   }

   public static class a extends few.a<ffd.a> {
      private final eap.a a = new eap.a();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected ffd.a a() {
         return this;
      }

      @Override
      public fex b() {
         return new ffd(this.g(), this.a.a(), this.b);
      }

      public ffd.a a(jl<eao> $$0, dbt $$1) {
         this.a.a($$0, $$1);
         return this;
      }
   }
}
