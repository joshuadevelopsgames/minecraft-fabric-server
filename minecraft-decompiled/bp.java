import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bp extends dl<bp.a> {
   @Override
   public Codec<bp.a> a() {
      return bp.a.a;
   }

   public void a(auc $$0, jb $$1) {
      aub $$2 = $$0.y();
      eeb $$3 = $$2.a_($$1);
      fdm $$4 = new fdm.a($$2).a(fgd.f, $$1.b()).a(fgd.a, $$0).a(fgd.g, $$3).a(fgc.p);
      fdj $$5 = new fdj.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public record a(Optional<bj> b, Optional<bj> c) implements dl.a {
      public static final Codec<bp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bz.b.optionalFieldOf("player").forGetter(bp.a::a), bj.a.optionalFieldOf("location").forGetter(bp.a::b)).apply($$0, bp.a::new)
      );

      public boolean a(fdj $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, fgc.p, "location"));
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bj> b() {
         return this.c;
      }
   }
}
