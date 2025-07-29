import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;

public abstract class els implements elh {
   protected final kg f;

   protected static <P extends els> P1<Mu<P>, kg> a(Instance<P> $$0) {
      return $$0.group(kg.v(16).optionalFieldOf("offset", kg.i).forGetter($$0x -> $$0x.f));
   }

   protected els(kg $$0) {
      this.f = $$0;
   }

   public final boolean a(dnt $$0, jb $$1) {
      return this.a($$0.a_($$1.a(this.f)));
   }

   protected abstract boolean a(eeb var1);
}
