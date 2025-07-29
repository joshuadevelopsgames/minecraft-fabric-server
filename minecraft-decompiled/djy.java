import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djy(ame b, jl<cbn> d, djp e, cbq.a f) implements dka {
   public static final MapCodec<djy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
            ame.a.fieldOf("id").forGetter(djy::b),
            cbn.a.fieldOf("attribute").forGetter(djy::c),
            djp.b.fieldOf("amount").forGetter(djy::d),
            cbq.a.f.fieldOf("operation").forGetter(djy::e)
         )
         .apply($$0, djy::new)
   );

   private ame a(bda $$0) {
      return this.b.g("/" + $$0.c());
   }

   public cbq a(int $$0, bda $$1) {
      return new cbq(this.a($$1), this.d().a($$0), this.e());
   }

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4, boolean $$5) {
      if ($$5 && $$3 instanceof cam $$6) {
         $$6.fg().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(djh $$0, bzm $$1, fis $$2, int $$3) {
      if ($$1 instanceof cam $$4) {
         $$4.fg().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jl<cbn>, cbq> a(int $$0, bzw $$1) {
      HashMultimap<jl<cbn>, cbq> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (bda)$$1));
      return $$2;
   }

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   public jl<cbn> c() {
      return this.d;
   }

   public djp d() {
      return this.e;
   }

   public cbq.a e() {
      return this.f;
   }
}
