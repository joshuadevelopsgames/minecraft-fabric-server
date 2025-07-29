import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ewe extends ewg {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ewg.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), f()).apply($$0, ewe::new)
   );
   private final List<ewg> b;

   public ewe(List<ewg> $$0, ewi.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kg a(ezb $$0, dwu $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ewg $$5 : this.b) {
         kg $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kg($$2, $$3, $$4);
   }

   @Override
   public List<eza.a> a(ezb $$0, jb $$1, dwu $$2, bck $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public euq a(ezb $$0, jb $$1, dwu $$2) {
      Stream<euq> $$3 = this.b.stream().filter($$0x -> $$0x != evz.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return euq.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ezb $$0, dnt $$1, dnq $$2, efz $$3, jb $$4, jb $$5, dwu $$6, euq $$7, bck $$8, eyk $$9, boolean $$10) {
      for (ewg $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ewh<?> a() {
      return ewh.b;
   }

   @Override
   public ewg a(ewi.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ewi.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }

   @VisibleForTesting
   public List<ewg> b() {
      return this.b;
   }
}
