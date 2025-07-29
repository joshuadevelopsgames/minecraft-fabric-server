import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record euc(jl<ems<?, ?>> e, List<euf> f) {
   public static final Codec<euc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ems.b.fieldOf("feature").forGetter($$0x -> $$0x.e), euf.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, euc::new)
   );
   public static final Codec<jl<euc>> b = ama.a(mn.bg, a);
   public static final Codec<jp<euc>> c = ka.a(mn.bg, a);
   public static final Codec<List<jp<euc>>> d = ka.a(mn.bg, a, true).listOf();

   public boolean a(dnt $$0, efz $$1, bck $$2, jb $$3) {
      return this.a(new eud($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dnt $$0, efz $$1, bck $$2, jb $$3) {
      return this.a(new eud($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(eud $$0, bck $$1, jb $$2) {
      Stream<jb> $$3 = Stream.of($$2);

      for (euf $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      ems<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<ems<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public jl<ems<?, ?>> b() {
      return this.e;
   }

   public List<euf> c() {
      return this.f;
   }
}
