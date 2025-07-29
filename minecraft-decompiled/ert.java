import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class ert extends ern {
   public static final MapCodec<ert> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ern.a.fieldOf("source").forGetter($$0x -> $$0x.c),
            Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
            bwo.c.fieldOf("values").forGetter($$0x -> $$0x.f)
         )
         .apply($$0, ert::new)
   );
   private final ern c;
   private final String d;
   @Nullable
   private efb e;
   private final bwo f;

   public ert(ern $$0, efb $$1, bwo $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for (int $$4 = $$2.a(); $$4 <= $$2.b(); $$4++) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }
   }

   public ert(ern $$0, String $$1, bwo $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected ero<?> a() {
      return ero.g;
   }

   @Override
   public eeb a(bck $$0, jb $$1) {
      eeb $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         efb $$3 = a($$2, this.d);
         if ($$3 == null) {
            return $$2;
         }

         this.e = $$3;
      }

      return $$2.b(this.e, this.f.a($$0));
   }

   @Nullable
   private static efb a(eeb $$0, String $$1) {
      Collection<efe<?>> $$2 = $$0.F();
      Optional<efb> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof efb).map($$0x -> (efb)$$0x).findAny();
      return $$3.orElse(null);
   }
}
