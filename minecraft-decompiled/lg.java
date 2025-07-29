import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record lg(Optional<jp<dli>> e, Optional<jp<dlk>> f) implements dm<dlg> {
   public static final Codec<lg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ka.a(mn.bp).optionalFieldOf("material").forGetter(lg::b), ka.a(mn.bq).optionalFieldOf("pattern").forGetter(lg::c)).apply($$0, lg::new)
   );

   @Override
   public kp<dlg> a() {
      return kq.W;
   }

   public boolean a(dlg $$0) {
      return this.e.isPresent() && !this.e.get().a($$0.a()) ? false : !this.f.isPresent() || this.f.get().a($$0.b());
   }

   public Optional<jp<dli>> b() {
      return this.e;
   }

   public Optional<jp<dlk>> c() {
      return this.f;
   }
}
