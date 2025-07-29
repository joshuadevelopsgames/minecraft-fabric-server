import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public abstract class fds extends fdz {
   public static final bci.g e = new bci.g() {
      @Override
      public String a() {
         return "Empty children list";
      }
   };
   protected final List<fdz> f;
   private final fdr a;

   protected fds(List<fdz> $$0, List<fgs> $$1) {
      super($$1);
      this.f = $$0;
      this.a = this.a($$0);
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);
      if (this.f.isEmpty()) {
         $$0.a(e);
      }

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         this.f.get($$1).a($$0.a(new bci.d("children", $$1)));
      }
   }

   protected abstract fdr a(List<? extends fdr> var1);

   @Override
   public final boolean expand(fdj $$0, Consumer<fdy> $$1) {
      return !this.a($$0) ? false : this.a.expand($$0, $$1);
   }

   public static <T extends fds> MapCodec<T> a(fds.a<T> $$0) {
      return RecordCodecBuilder.mapCodec(
         $$1 -> $$1.group(fdx.a.listOf().optionalFieldOf("children", List.of()).forGetter($$0xx -> $$0xx.f)).and(a($$1).t1()).apply($$1, $$0::create)
      );
   }

   @FunctionalInterface
   public interface a<T extends fds> {
      T create(List<fdz> var1, List<fgs> var2);
   }
}
