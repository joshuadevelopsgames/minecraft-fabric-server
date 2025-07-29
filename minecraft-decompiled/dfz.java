import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ReferenceLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceSortedSets;
import java.util.List;
import java.util.SequencedSet;

public record dfz(boolean d, SequencedSet<kp<?>> e) {
   private static final Codec<SequencedSet<kp<?>>> f = kp.a.listOf().xmap(ReferenceLinkedOpenHashSet::new, List::copyOf);
   public static final Codec<dfz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.BOOL.optionalFieldOf("hide_tooltip", false).forGetter(dfz::a),
            f.optionalFieldOf("hidden_components", ReferenceSortedSets.emptySet()).forGetter(dfz::b)
         )
         .apply($$0, dfz::new)
   );
   public static final zm<wx, dfz> b = zm.a(zk.b, dfz::a, kp.b.a(zk.a(ReferenceLinkedOpenHashSet::new)), dfz::b, dfz::new);
   public static final dfz c = new dfz(false, ReferenceSortedSets.emptySet());

   public dfz a(kp<?> $$0, boolean $$1) {
      if (this.e.contains($$0) == $$1) {
         return this;
      } else {
         SequencedSet<kp<?>> $$2 = new ReferenceLinkedOpenHashSet(this.e);
         if ($$1) {
            $$2.add($$0);
         } else {
            $$2.remove($$0);
         }

         return new dfz(this.d, $$2);
      }
   }

   public boolean a(kp<?> $$0) {
      return !this.d && !this.e.contains($$0);
   }

   public boolean a() {
      return this.d;
   }

   public SequencedSet<kp<?>> b() {
      return this.e;
   }
}
