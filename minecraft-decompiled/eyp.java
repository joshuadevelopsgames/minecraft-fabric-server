import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eyp {
   public static final ezh a = ezh.a;
   public static final Codec<eyp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            eyu.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
            eyu.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
            eyn.c.lenientOptionalFieldOf("position_predicate", eym.b).forGetter($$0x -> $$0x.e),
            eeb.a.fieldOf("output_state").forGetter($$0x -> $$0x.f),
            ezi.c.lenientOptionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
         )
         .apply($$0, eyp::new)
   );
   private final eyu c;
   private final eyu d;
   private final eyn e;
   private final eeb f;
   private final ezi g;

   public eyp(eyu $$0, eyu $$1, eeb $$2) {
      this($$0, $$1, eym.b, $$2);
   }

   public eyp(eyu $$0, eyu $$1, eyn $$2, eeb $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public eyp(eyu $$0, eyu $$1, eyn $$2, eeb $$3, ezi $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(eeb $$0, eeb $$1, jb $$2, jb $$3, jb $$4, bck $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public eeb a() {
      return this.f;
   }

   @Nullable
   public ui a(bck $$0, @Nullable ui $$1) {
      return this.g.a($$0, $$1);
   }
}
