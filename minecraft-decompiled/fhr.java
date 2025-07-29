import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record fhr(ame b, fe.g c) implements fho {
   public static final MapCodec<fhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ame.a.fieldOf("storage").forGetter(fhr::c), fe.g.a.fieldOf("path").forGetter(fhr::d)).apply($$0, fhr::new)
   );

   @Override
   public fhn b() {
      return fhp.f;
   }

   private Number a(fdj $$0, Number $$1) {
      ui $$2 = $$0.d().q().aK().a(this.b);

      try {
         List<vi> $$3 = this.c.a($$2);
         if ($$3.size() == 1 && $$3.getFirst() instanceof uy $$4) {
            return $$4.m();
         }
      } catch (CommandSyntaxException var7) {
      }

      return $$1;
   }

   @Override
   public float b(fdj $$0) {
      return this.a($$0, 0.0F).floatValue();
   }

   @Override
   public int a(fdj $$0) {
      return this.a($$0, 0).intValue();
   }

   public ame c() {
      return this.b;
   }

   public fe.g d() {
      return this.c;
   }
}
