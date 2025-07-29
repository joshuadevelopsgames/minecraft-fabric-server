import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class fen extends few {
   public static final MapCodec<fen> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(fhp.a.fieldOf("levels").forGetter($$0x -> $$0x.b), ka.a(mn.aW).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
         .apply($$0, fen::new)
   );
   private final fho b;
   private final Optional<jp<dji>> c;

   fen(List<fgs> $$0, fho $$1, Optional<jp<dji>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fey<fen> b() {
      return fez.g;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      bck $$2 = $$1.b();
      jz $$3 = $$1.d().K_();
      return djk.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static fen.a a(jn.a $$0, fho $$1) {
      return new fen.a($$1).a($$0.e(mn.aW).b(azr.n));
   }

   public static class a extends few.a<fen.a> {
      private final fho a;
      private Optional<jp<dji>> b = Optional.empty();

      public a(fho $$0) {
         this.a = $$0;
      }

      protected fen.a a() {
         return this;
      }

      public fen.a a(jp<dji> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public fex b() {
         return new fen(this.g(), this.a, this.b);
      }
   }
}
